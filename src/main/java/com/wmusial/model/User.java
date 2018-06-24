package com.wmusial.model;

import javax.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="first_name")
    private String firstName;
    @Column(name="last_name")
    private String lastName;
    @Column(name="avatar_url")
    private String avatarUrl;


    private String email;

    public User() {
    }
    public User(Long id, String firstName, String lastName, String email, String avatarUrl) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.avatarUrl=avatarUrl;

    }
    public User(String firstName, String lastName, String email, String avatarUrl) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.avatarUrl=avatarUrl;
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }
}
