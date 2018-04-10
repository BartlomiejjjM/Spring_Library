package com.BartlomiejjjM.Spring_Library.library.application.user;

import com.BartlomiejjjM.Spring_Library.library.application.hire.HireEntity;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
@Table(name = "users", catalog = "postgresql")
public class UserEntity  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long user_id;

    @NotBlank
    private String name;
    @NotBlank
    @Email
    private String email;
    @NotBlank
    private String password;
    @NotBlank
    private String role;
    @Column(name = "enabled")
    private boolean enabled;
    @OneToMany
    private List<HireEntity> hires;

    protected UserEntity(){

    }

    public UserEntity(@NotBlank @Email String email, @NotBlank String password, @NotBlank String role) {
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public UserEntity(@NotBlank String name, @NotBlank @Email String email, @NotBlank String password, @NotBlank String role) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
        this.enabled=false;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public List<HireEntity> getHires() {
        return hires;
    }

    public void setHires(List<HireEntity> hires) {
        this.hires = hires;
    }
}
