package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.With;


/**
 * CREATE TABLE IF NOT EXISTS user (
 *     ID                     BIGINT              AUTO_INCREMENT NOT NULL,
 *     FIRST_NAME                  VARCHAR(50)         DEFAULT NULL,
 *     LAST_NAME                   VARCHAR(50)         DEFAULT NULL,
 *     EMAIL_ADDRESS               VARCHAR(100)        DEFAULT NULL,
 *     PRIMARY KEY(id)
 * );
 */
@Entity
@Getter
@Setter
@With
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "USER")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "EMAIL_ADDRESS")
    private String emailAddress;

}
