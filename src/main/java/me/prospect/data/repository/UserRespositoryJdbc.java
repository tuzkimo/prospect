package me.prospect.data.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRespositoryJdbc implements UserRepository {
  private final JdbcTemplate jdbcTemplate;

  private static final String SELECT_COLUMNS = "id, userName, password, createDate, isBlocked";
  private static final String SELECT_USERS = "SELECT " + SELECT_COLUMNS + " FROM Users";
  private static final String SELECT_USER_BY_ID = "SELECT " + SELECT_COLUMNS + " FROM Users WHERE id = ?";
  private static final String INSERT_USER = "INSERT INTO Users(userName, password) VALUES(?, ?)";

  @Autowired
  public UserRespositoryJdbc(JdbcTemplate jdbcTemplate) {
    this.jdbcTemplate = jdbcTemplate;
  }

  private RowMapper<me.prospect.data.entity.UserEntity> mapUser = (resultSet, index) -> new me.prospect.data.entity.UserEntity(
      resultSet.getString("id"),
      resultSet.getString("userName"),
      resultSet.getString("password"),
      resultSet.getDate("createDate"),
      resultSet.getBoolean("isBlocked")
  );

  @Override
  public List<me.prospect.data.entity.UserEntity> getAll() {
    return jdbcTemplate.query(SELECT_USERS, mapUser);
  }

  @Override
  public me.prospect.data.entity.UserEntity getOne(String id) {
    return jdbcTemplate.queryForObject(SELECT_USER_BY_ID, mapUser, id);
  }

  @Override
  public List<me.prospect.data.entity.UserEntity> add(me.prospect.data.entity.UserEntity user) {
    jdbcTemplate.update(INSERT_USER, user.getUsername(), user.getPassword());
    return getAll();
  }
}
