package com.jindo.core.user;

import lombok.Data;
import javax.persistence.*;

/**
 * @author ManhKM on 5/4/2022
 * @project spring-security-2-jpa-hibernate
 */
@Entity
@Table(name = "user")
@Data
public class User {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;
    private String password;
}
