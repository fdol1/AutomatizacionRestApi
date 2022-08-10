package com.lfpu.auto.database;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="Example")
@Data
public class Example implements Serializable {

    private static final long serialVrsionUID = 34343;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "id", unique = true)
    private int id;

    @Column (name = "name")
    private String name;
}
