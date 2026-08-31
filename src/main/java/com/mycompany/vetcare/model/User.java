
package com.mycompany.vetcare.model;

public class User {
    private Integer id;
    private String username;
    private String password;
    private UserRole role;
    private Boolean status;

    public User() {
    }

    public User(String username, String password, UserRole role, Boolean status) {
        this.username = username;
        this.password = password;
        this.role = role;
        this.status = status;
    }

    public User(Integer id, String username, String password, UserRole role, Boolean status) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.role = role;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public UserRole getRole() {
        return role;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "User{" + "username=" + username + ", password=" + password + ", role=" + role + ", status=" + status + '}';
    }
    
}
