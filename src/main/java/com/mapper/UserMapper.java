package com.mapper;

import com.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
   @Select("select * from user where id = #{id}")

   @Results({
           @Result(property = "name",column = "name"),
           @Result(property = "age",column = "age"),
           @Result(property = "password",column = "password"),
           @Result(property = "gender",column = "gender"),
           @Result(property = "uid",column = "id")
   })
   User getUserById(Integer id);
   @Select("select * from user")
   @Results({
           @Result(property = "name",column = "name"),
           @Result(property = "age",column = "age"),
           @Result(property = "password",column = "password"),
           @Result(property = "gender",column = "gender"),
           @Result(property = "uid",column = "id")
   })
   List<User> findAllUsers();
}
