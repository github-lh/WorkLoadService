/*
 * This file is generated by jOOQ.
 */
package com.pandalu.workloadservice.db.tables;


import com.pandalu.workloadservice.db.CompNetFusion;
import com.pandalu.workloadservice.db.Indexes;
import com.pandalu.workloadservice.db.Keys;
import com.pandalu.workloadservice.db.tables.records.VmimagesRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row8;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class Vmimages extends TableImpl<VmimagesRecord> {

    private static final long serialVersionUID = 549825690;

    /**
     * The reference instance of <code>comp_net_fusion.vmimages</code>
     */
    public static final Vmimages VMIMAGES = new Vmimages();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<VmimagesRecord> getRecordType() {
        return VmimagesRecord.class;
    }

    /**
     * The column <code>comp_net_fusion.vmimages.vmImageID</code>. 虚拟机镜像编号
     */
    public final TableField<VmimagesRecord, String> VMIMAGEID = createField(DSL.name("vmImageID"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "虚拟机镜像编号");

    /**
     * The column <code>comp_net_fusion.vmimages.imgSize</code>. 虚拟机镜像文件大小
     */
    public final TableField<VmimagesRecord, Double> IMGSIZE = createField(DSL.name("imgSize"), org.jooq.impl.SQLDataType.DOUBLE, this, "虚拟机镜像文件大小");

    /**
     * The column <code>comp_net_fusion.vmimages.imgCPU</code>. 镜像CPU信息
     */
    public final TableField<VmimagesRecord, String> IMGCPU = createField(DSL.name("imgCPU"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "镜像CPU信息");

    /**
     * The column <code>comp_net_fusion.vmimages.imgMem</code>. 镜像内存信息
     */
    public final TableField<VmimagesRecord, String> IMGMEM = createField(DSL.name("imgMem"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "镜像内存信息");

    /**
     * The column <code>comp_net_fusion.vmimages.imgDisk</code>. 镜像存储信息
     */
    public final TableField<VmimagesRecord, String> IMGDISK = createField(DSL.name("imgDisk"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "镜像存储信息");

    /**
     * The column <code>comp_net_fusion.vmimages.imgOS</code>. 镜像操作系统
     */
    public final TableField<VmimagesRecord, String> IMGOS = createField(DSL.name("imgOS"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "镜像操作系统");

    /**
     * The column <code>comp_net_fusion.vmimages.NetworkAdapter</code>. 联网方式
     */
    public final TableField<VmimagesRecord, String> NETWORKADAPTER = createField(DSL.name("NetworkAdapter"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "联网方式");

    /**
     * The column <code>comp_net_fusion.vmimages.timeStamp</code>. 时间戳
     */
    public final TableField<VmimagesRecord, Long> TIMESTAMP = createField(DSL.name("timeStamp"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "时间戳");

    /**
     * Create a <code>comp_net_fusion.vmimages</code> table reference
     */
    public Vmimages() {
        this(DSL.name("vmimages"), null);
    }

    /**
     * Create an aliased <code>comp_net_fusion.vmimages</code> table reference
     */
    public Vmimages(String alias) {
        this(DSL.name(alias), VMIMAGES);
    }

    /**
     * Create an aliased <code>comp_net_fusion.vmimages</code> table reference
     */
    public Vmimages(Name alias) {
        this(alias, VMIMAGES);
    }

    private Vmimages(Name alias, Table<VmimagesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Vmimages(Name alias, Table<VmimagesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Vmimages(Table<O> child, ForeignKey<O, VmimagesRecord> key) {
        super(child, key, VMIMAGES);
    }

    @Override
    public Schema getSchema() {
        return CompNetFusion.COMP_NET_FUSION;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.VMIMAGES_PRIMARY);
    }

    @Override
    public UniqueKey<VmimagesRecord> getPrimaryKey() {
        return Keys.KEY_VMIMAGES_PRIMARY;
    }

    @Override
    public List<UniqueKey<VmimagesRecord>> getKeys() {
        return Arrays.<UniqueKey<VmimagesRecord>>asList(Keys.KEY_VMIMAGES_PRIMARY);
    }

    @Override
    public Vmimages as(String alias) {
        return new Vmimages(DSL.name(alias), this);
    }

    @Override
    public Vmimages as(Name alias) {
        return new Vmimages(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Vmimages rename(String name) {
        return new Vmimages(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Vmimages rename(Name name) {
        return new Vmimages(name, null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<String, Double, String, String, String, String, String, Long> fieldsRow() {
        return (Row8) super.fieldsRow();
    }
}
