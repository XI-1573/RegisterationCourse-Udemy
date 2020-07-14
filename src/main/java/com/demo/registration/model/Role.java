package com.demo.registration.model;

import javax.persistence.*;

@Entity
@Table(name = "role_udemy")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    private String name;

    public Role() {
    }
    /*    @ManyToMany(fetch = FetchType.EAGER,mappedBy = "roles")
    private Collection<User> users;*/

    public Role(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
