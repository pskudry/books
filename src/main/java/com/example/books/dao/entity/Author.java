package com.example.books.dao.entity;
import lombok.Data;
import lombok.EqualsAndHashCode;


import javax.persistence.*;
import java.io.Serializable;

@Data
@EqualsAndHashCode
@Entity
public class Author implements Serializable {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "authors", nullable = false)
    private String books;
}
