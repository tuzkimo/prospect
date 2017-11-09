package me.prospect.data.mapper;

import me.prospect.data.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
  @Select("SELECT * FROM Users")
  List<User> getAll();

  @Select("SELECT * FROM Users WHERE id = #{id}")
  User getOne(String id);

  @Insert("INSERT INTO Users(username, password) VALUES(#{username}, #{password})")
  Integer add(User user);
}
