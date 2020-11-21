package com.muratcelik.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "book")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name", length = 50)
    private String name;

    @Column(name = "sub_name", length = 150)
    private String subName;

    @Column(name = "serial_name", length = 50)
    private String serialName;

    @Column(name = "isbn_no", length = 13)
    private String isbnNo;

    @Column(name = "explanation", length = 500)
    private String explanation;

    @ManyToMany
    private List<Author> author;

    @ManyToOne
    private Publisher publisher;
}
