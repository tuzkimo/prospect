package me.prospect.data.repository;

import java.util.List;

public interface UserRepository {
  public List<me.prospect.data.entity.UserEntity> getAll();

  public me.prospect.data.entity.UserEntity getOne(String id);

  public List<me.prospect.data.entity.UserEntity> add(me.prospect.data.entity.UserEntity user);
}
