package com.fpt.project.cms.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "user")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User extends BaseEntity {

    @JsonProperty
    @Column(name = "username")
    private String username;

    @JsonProperty
    @Column(name = "password")
    private String password;

    @JsonProperty
    @Column(name = "firstname")
    private String firstname;

    @JsonProperty
    @Column(name = "lastname")
    private String lastname;

    @JsonProperty
    @Column(name = "email")
    private String email;

    @JsonProperty
    @Column(name = "phone")
    private String phone;

    @JsonProperty
    @Column(name = "address")
    private String address;

    @JsonProperty
    @Column(name = "imageUrl")
    private String imageUrl;

    @JsonProperty
    @Column(name = "birthOfdate")
    private Date birthOfdate;

    // Role
    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role roles;

    @JsonProperty
    @Column(name = "isActive", columnDefinition = "boolean default false")
    private boolean isActive;

}
