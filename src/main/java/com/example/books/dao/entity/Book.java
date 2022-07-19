package com.example.books.dao.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;


import javax.persistence.*;
import java.io.Serializable;

@Data
@EqualsAndHashCode
@Entity
public class Book  implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "title", nullable = false)
    private String title;
    @Column(name = "authors", nullable = false)
    private String authors;
}
