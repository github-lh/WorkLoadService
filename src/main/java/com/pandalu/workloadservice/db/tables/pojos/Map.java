/*
 * This file is generated by jOOQ.
 */
package com.pandalu.workloadservice.db.tables.pojos;


import com.pandalu.workloadservice.db.tables.interfaces.IMap;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Map implements IMap {

    private static final long serialVersionUID = -1281120207;

    private Integer id;
    private String  name;

    public Map() {}

    public Map(IMap value) {
        this.id = value.getId();
        this.name = value.getName();
    }

    public Map(
        Integer id,
        String  name
    ) {
        this.id = id;
        this.name = name;
    }

    @Override
    public Integer getId() {
        return this.id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Map (");

        sb.append(id);
        sb.append(", ").append(name);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IMap from) {
        setId(from.getId());
        setName(from.getName());
    }

    @Override
    public <E extends IMap> E into(E into) {
        into.from(this);
        return into;
    }
}