/*
 * This file is generated by jOOQ.
 */
package com.pandalu.workloadservice.db.tables.records;


import com.pandalu.workloadservice.db.tables.Map;
import com.pandalu.workloadservice.db.tables.interfaces.IMap;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


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
public class MapRecord extends UpdatableRecordImpl<MapRecord> implements Record2<Integer, String>, IMap {

    private static final long serialVersionUID = -371194158;

    /**
     * Setter for <code>comp_net_fusion.map.ID</code>. 物理机所在城市城市代码
     */
    @Override
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>comp_net_fusion.map.ID</code>. 物理机所在城市城市代码
     */
    @Override
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>comp_net_fusion.map.name</code>. 物理机所在城市名
     */
    @Override
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>comp_net_fusion.map.name</code>. 物理机所在城市名
     */
    @Override
    public String getName() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<Integer, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<Integer, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Map.MAP.ID;
    }

    @Override
    public Field<String> field2() {
        return Map.MAP.NAME;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public MapRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public MapRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public MapRecord values(Integer value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
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

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MapRecord
     */
    public MapRecord() {
        super(Map.MAP);
    }

    /**
     * Create a detached, initialised MapRecord
     */
    public MapRecord(Integer id, String name) {
        super(Map.MAP);

        set(0, id);
        set(1, name);
    }
}
