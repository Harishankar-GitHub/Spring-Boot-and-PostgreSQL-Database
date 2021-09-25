package com.springbootandpostgresql.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "student")
@NamedQuery(name = "find_all_students", query = "select p from Stud p")

@NoArgsConstructor @AllArgsConstructor
@Getter @Setter @ToString
public class Stud {
    @Id
    private int id;
    private String name;
    private int age;
    private String city;
}
