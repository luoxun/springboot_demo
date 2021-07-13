package com.example.mybatis.mapper;

import com.example.models.Users;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UsersMapper {

    @Select("SELECT * FROM wxusers limit 10")
    @Results({
            @Result(id = true, column = "id", property = "id"),
            @Result(column = "nickName", property = "nickName"),
            // map-underscore-to-camel-case = true 可以实现一样的效果
            // @Result(column = "update_time", property = "updateTime"),
    })
        //List<Users> getAll();
    List <Users> getAll();

    @Select("SELECT * FROM wxusers order by id")
    List<Users> findAllWithParam(@Param("pageNum") int pageNum,
                                 @Param("pageSize") int pageSize);
}
