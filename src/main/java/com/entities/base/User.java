package com.entities.base;

import lombok.Data;

import javax.persistence.*;

@Table(name = "users")
@Entity
@Data
public class User extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String userName;

    @Column
    private String fullName;

    @Column
    private Integer age;

    public static void main(String[] args) {
        User u;
    }
}
