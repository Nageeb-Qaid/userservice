package com.example.usersservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.*;

import jakarta.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity
@Table(name = "users")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @Column
  private String email;

  @Column
  private String title;

  @Column
  private String firstname;

  @Column
  private String lastname;

  @Column
  private String password;

  @Column
  private String phone;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public UserResource toUserResource() {
    return UserResource
      .builder()
      .id(this.id)
      .email(this.email)
      .title(this.title)
      .firstname(this.firstname)
      .lastname(this.lastname)
      .phone(this.phone)
      .build();
  }
}
