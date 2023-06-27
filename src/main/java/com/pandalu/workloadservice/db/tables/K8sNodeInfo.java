/*
 * This file is generated by jOOQ.
 */
package com.pandalu.workloadservice.db.tables;


import com.pandalu.workloadservice.db.CompNetFusion;
import com.pandalu.workloadservice.db.Indexes;
import com.pandalu.workloadservice.db.Keys;
import com.pandalu.workloadservice.db.tables.records.K8sNodeInfoRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row11;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.jooq.types.ULong;


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
public class K8sNodeInfo extends TableImpl<K8sNodeInfoRecord> {

    private static final long serialVersionUID = 2050173604;

    /**
     * The reference instance of <code>comp_net_fusion.k8s_node_info</code>
     */
    public static final K8sNodeInfo K8S_NODE_INFO = new K8sNodeInfo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<K8sNodeInfoRecord> getRecordType() {
        return K8sNodeInfoRecord.class;
    }

    /**
     * The column <code>comp_net_fusion.k8s_node_info.uid</code>. 唯一标识符
     */
    public final TableField<K8sNodeInfoRecord, String> UID = createField(DSL.name("uid"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "唯一标识符");

    /**
     * The column <code>comp_net_fusion.k8s_node_info.name</code>. node名称
     */
    public final TableField<K8sNodeInfoRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "node名称");

    /**
     * The column <code>comp_net_fusion.k8s_node_info.city</code>. node所在城市城市代码
     */
    public final TableField<K8sNodeInfoRecord, Integer> CITY = createField(DSL.name("city"), org.jooq.impl.SQLDataType.INTEGER, this, "node所在城市城市代码");

    /**
     * The column <code>comp_net_fusion.k8s_node_info.ip</code>. node ip
     */
    public final TableField<K8sNodeInfoRecord, String> IP = createField(DSL.name("ip"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "node ip");

    /**
     * The column <code>comp_net_fusion.k8s_node_info.maxPods</code>. 最大pods容量
     */
    public final TableField<K8sNodeInfoRecord, Integer> MAXPODS = createField(DSL.name("maxPods"), org.jooq.impl.SQLDataType.INTEGER, this, "最大pods容量");

    /**
     * The column <code>comp_net_fusion.k8s_node_info.usedPods</code>. 已挂载pod数量
     */
    public final TableField<K8sNodeInfoRecord, Integer> USEDPODS = createField(DSL.name("usedPods"), org.jooq.impl.SQLDataType.INTEGER, this, "已挂载pod数量");

    /**
     * The column <code>comp_net_fusion.k8s_node_info.maxCpu</code>. 最大cpu需求量
     */
    public final TableField<K8sNodeInfoRecord, String> MAXCPU = createField(DSL.name("maxCpu"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "最大cpu需求量");

    /**
     * The column <code>comp_net_fusion.k8s_node_info.maxMemory</code>. 最大内存需求量
     */
    public final TableField<K8sNodeInfoRecord, String> MAXMEMORY = createField(DSL.name("maxMemory"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "最大内存需求量");

    /**
     * The column <code>comp_net_fusion.k8s_node_info.usedCpu</code>. 已使用cpu
     */
    public final TableField<K8sNodeInfoRecord, String> USEDCPU = createField(DSL.name("usedCpu"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "已使用cpu");

    /**
     * The column <code>comp_net_fusion.k8s_node_info.usedMemory</code>. 已使用内存
     */
    public final TableField<K8sNodeInfoRecord, String> USEDMEMORY = createField(DSL.name("usedMemory"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "已使用内存");

    /**
     * The column <code>comp_net_fusion.k8s_node_info.timestamp</code>. 时间戳
     */
    public final TableField<K8sNodeInfoRecord, ULong> TIMESTAMP = createField(DSL.name("timestamp"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "时间戳");

    /**
     * Create a <code>comp_net_fusion.k8s_node_info</code> table reference
     */
    public K8sNodeInfo() {
        this(DSL.name("k8s_node_info"), null);
    }

    /**
     * Create an aliased <code>comp_net_fusion.k8s_node_info</code> table reference
     */
    public K8sNodeInfo(String alias) {
        this(DSL.name(alias), K8S_NODE_INFO);
    }

    /**
     * Create an aliased <code>comp_net_fusion.k8s_node_info</code> table reference
     */
    public K8sNodeInfo(Name alias) {
        this(alias, K8S_NODE_INFO);
    }

    private K8sNodeInfo(Name alias, Table<K8sNodeInfoRecord> aliased) {
        this(alias, aliased, null);
    }

    private K8sNodeInfo(Name alias, Table<K8sNodeInfoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> K8sNodeInfo(Table<O> child, ForeignKey<O, K8sNodeInfoRecord> key) {
        super(child, key, K8S_NODE_INFO);
    }

    @Override
    public Schema getSchema() {
        return CompNetFusion.COMP_NET_FUSION;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.K8S_NODE_INFO_K8S_N_CITY, Indexes.K8S_NODE_INFO_NAME, Indexes.K8S_NODE_INFO_PRIMARY);
    }

    @Override
    public UniqueKey<K8sNodeInfoRecord> getPrimaryKey() {
        return Keys.KEY_K8S_NODE_INFO_PRIMARY;
    }

    @Override
    public List<UniqueKey<K8sNodeInfoRecord>> getKeys() {
        return Arrays.<UniqueKey<K8sNodeInfoRecord>>asList(Keys.KEY_K8S_NODE_INFO_PRIMARY);
    }

    @Override
    public List<ForeignKey<K8sNodeInfoRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<K8sNodeInfoRecord, ?>>asList(Keys.K8S_N_CITY);
    }

    public Map map() {
        return new Map(this, Keys.K8S_N_CITY);
    }

    @Override
    public K8sNodeInfo as(String alias) {
        return new K8sNodeInfo(DSL.name(alias), this);
    }

    @Override
    public K8sNodeInfo as(Name alias) {
        return new K8sNodeInfo(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public K8sNodeInfo rename(String name) {
        return new K8sNodeInfo(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public K8sNodeInfo rename(Name name) {
        return new K8sNodeInfo(name, null);
    }

    // -------------------------------------------------------------------------
    // Row11 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row11<String, String, Integer, String, Integer, Integer, String, String, String, String, ULong> fieldsRow() {
        return (Row11) super.fieldsRow();
    }
}
