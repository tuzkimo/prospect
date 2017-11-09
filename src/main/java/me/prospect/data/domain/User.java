package me.prospect.data.domain;

import java.util.Date;

public class User {
  private String id;
  private String username;
  private String password;
  private Date createDate;
  private Boolean isBlocked;

  public User() {
  }

  public User(String username, String password) {
    this.username = username;
    this.password = password;
  }

  public User(String id, String username, String password, Date createDate, Boolean isBlocked) {
    this.id = id;
    this.username = username;
    this.password = password;
    this.createDate = createDate;
    this.isBlocked = isBlocked;
  }

  public String getId() {
    return id;
  }

  public String getUsername() {
    return username;
  }

  public String getPassword() {
    return password;
  }

  public Date getCreateDate() {
    return createDate;
  }

  public Boolean getBlocked() {
    return isBlocked;
  }

  @Override
  public String toString() {
    return "User{" +
        "id='" + id + '\'' +
        ", username='" + username + '\'' +
        ", password='" + password + '\'' +
        ", createDate=" + createDate +
        ", isBlocked=" + isBlocked +
        '}';
  }
}
