package me.prospect.web.exception;

public class UserNotFoundException extends RuntimeException {
  private String userId;

  public UserNotFoundException(String userId) {
    this.userId = userId;
  }

  public String getUserId() {
    return userId;
  }
}
