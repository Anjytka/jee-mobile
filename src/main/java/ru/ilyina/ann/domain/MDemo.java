package ru.ilyina.ann.domain;

import javax.persistence.*;

/**
 * Created by anjytka on 27.02.17.
 */
@Entity
@NamedQuery(name = MDemo.Query.SELECT_ALL, query = "SELECT d from MDemo d")
@Table(name = "demo")
public class MDemo {

    public class Query {
        public static final String SELECT_ALL = "SELECTALL";
    }

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
