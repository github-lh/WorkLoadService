/*
 * This file is generated by jOOQ.
 */
package com.pandalu.workloadservice.db.tables.records;


import com.pandalu.workloadservice.db.tables.Vmimages;
import com.pandalu.workloadservice.db.tables.interfaces.IVmimages;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
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
public class VmimagesRecord extends UpdatableRecordImpl<VmimagesRecord> implements Record8<String, Double, String, String, String, String, String, Long>, IVmimages {

    private static final long serialVersionUID = 1113066909;

    /**
     * Setter for <code>comp_net_fusion.vmimages.vmImageID</code>. 虚拟机镜像编号
     */
    @Override
    public void setVmimageid(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>comp_net_fusion.vmimages.vmImageID</code>. 虚拟机镜像编号
     */
    @Override
    public String getVmimageid() {
        return (String) get(0);
    }

    /**
     * Setter for <code>comp_net_fusion.vmimages.imgSize</code>. 虚拟机镜像文件大小
     */
    @Override
    public void setImgsize(Double value) {
        set(1, value);
    }

    /**
     * Getter for <code>comp_net_fusion.vmimages.imgSize</code>. 虚拟机镜像文件大小
     */
    @Override
    public Double getImgsize() {
        return (Double) get(1);
    }

    /**
     * Setter for <code>comp_net_fusion.vmimages.imgCPU</code>. 镜像CPU信息
     */
    @Override
    public void setImgcpu(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>comp_net_fusion.vmimages.imgCPU</code>. 镜像CPU信息
     */
    @Override
    public String getImgcpu() {
        return (String) get(2);
    }

    /**
     * Setter for <code>comp_net_fusion.vmimages.imgMem</code>. 镜像内存信息
     */
    @Override
    public void setImgmem(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>comp_net_fusion.vmimages.imgMem</code>. 镜像内存信息
     */
    @Override
    public String getImgmem() {
        return (String) get(3);
    }

    /**
     * Setter for <code>comp_net_fusion.vmimages.imgDisk</code>. 镜像存储信息
     */
    @Override
    public void setImgdisk(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>comp_net_fusion.vmimages.imgDisk</code>. 镜像存储信息
     */
    @Override
    public String getImgdisk() {
        return (String) get(4);
    }

    /**
     * Setter for <code>comp_net_fusion.vmimages.imgOS</code>. 镜像操作系统
     */
    @Override
    public void setImgos(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>comp_net_fusion.vmimages.imgOS</code>. 镜像操作系统
     */
    @Override
    public String getImgos() {
        return (String) get(5);
    }

    /**
     * Setter for <code>comp_net_fusion.vmimages.NetworkAdapter</code>. 联网方式
     */
    @Override
    public void setNetworkadapter(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>comp_net_fusion.vmimages.NetworkAdapter</code>. 联网方式
     */
    @Override
    public String getNetworkadapter() {
        return (String) get(6);
    }

    /**
     * Setter for <code>comp_net_fusion.vmimages.timeStamp</code>. 时间戳
     */
    @Override
    public void setTimestamp(Long value) {
        set(7, value);
    }

    /**
     * Getter for <code>comp_net_fusion.vmimages.timeStamp</code>. 时间戳
     */
    @Override
    public Long getTimestamp() {
        return (Long) get(7);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row8<String, Double, String, String, String, String, String, Long> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    @Override
    public Row8<String, Double, String, String, String, String, String, Long> valuesRow() {
        return (Row8) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return Vmimages.VMIMAGES.VMIMAGEID;
    }

    @Override
    public Field<Double> field2() {
        return Vmimages.VMIMAGES.IMGSIZE;
    }

    @Override
    public Field<String> field3() {
        return Vmimages.VMIMAGES.IMGCPU;
    }

    @Override
    public Field<String> field4() {
        return Vmimages.VMIMAGES.IMGMEM;
    }

    @Override
    public Field<String> field5() {
        return Vmimages.VMIMAGES.IMGDISK;
    }

    @Override
    public Field<String> field6() {
        return Vmimages.VMIMAGES.IMGOS;
    }

    @Override
    public Field<String> field7() {
        return Vmimages.VMIMAGES.NETWORKADAPTER;
    }

    @Override
    public Field<Long> field8() {
        return Vmimages.VMIMAGES.TIMESTAMP;
    }

    @Override
    public String component1() {
        return getVmimageid();
    }

    @Override
    public Double component2() {
        return getImgsize();
    }

    @Override
    public String component3() {
        return getImgcpu();
    }

    @Override
    public String component4() {
        return getImgmem();
    }

    @Override
    public String component5() {
        return getImgdisk();
    }

    @Override
    public String component6() {
        return getImgos();
    }

    @Override
    public String component7() {
        return getNetworkadapter();
    }

    @Override
    public Long component8() {
        return getTimestamp();
    }

    @Override
    public String value1() {
        return getVmimageid();
    }

    @Override
    public Double value2() {
        return getImgsize();
    }

    @Override
    public String value3() {
        return getImgcpu();
    }

    @Override
    public String value4() {
        return getImgmem();
    }

    @Override
    public String value5() {
        return getImgdisk();
    }

    @Override
    public String value6() {
        return getImgos();
    }

    @Override
    public String value7() {
        return getNetworkadapter();
    }

    @Override
    public Long value8() {
        return getTimestamp();
    }

    @Override
    public VmimagesRecord value1(String value) {
        setVmimageid(value);
        return this;
    }

    @Override
    public VmimagesRecord value2(Double value) {
        setImgsize(value);
        return this;
    }

    @Override
    public VmimagesRecord value3(String value) {
        setImgcpu(value);
        return this;
    }

    @Override
    public VmimagesRecord value4(String value) {
        setImgmem(value);
        return this;
    }

    @Override
    public VmimagesRecord value5(String value) {
        setImgdisk(value);
        return this;
    }

    @Override
    public VmimagesRecord value6(String value) {
        setImgos(value);
        return this;
    }

    @Override
    public VmimagesRecord value7(String value) {
        setNetworkadapter(value);
        return this;
    }

    @Override
    public VmimagesRecord value8(Long value) {
        setTimestamp(value);
        return this;
    }

    @Override
    public VmimagesRecord values(String value1, Double value2, String value3, String value4, String value5, String value6, String value7, Long value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IVmimages from) {
        setVmimageid(from.getVmimageid());
        setImgsize(from.getImgsize());
        setImgcpu(from.getImgcpu());
        setImgmem(from.getImgmem());
        setImgdisk(from.getImgdisk());
        setImgos(from.getImgos());
        setNetworkadapter(from.getNetworkadapter());
        setTimestamp(from.getTimestamp());
    }

    @Override
    public <E extends IVmimages> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached VmimagesRecord
     */
    public VmimagesRecord() {
        super(Vmimages.VMIMAGES);
    }

    /**
     * Create a detached, initialised VmimagesRecord
     */
    public VmimagesRecord(String vmimageid, Double imgsize, String imgcpu, String imgmem, String imgdisk, String imgos, String networkadapter, Long timestamp) {
        super(Vmimages.VMIMAGES);

        set(0, vmimageid);
        set(1, imgsize);
        set(2, imgcpu);
        set(3, imgmem);
        set(4, imgdisk);
        set(5, imgos);
        set(6, networkadapter);
        set(7, timestamp);
    }
}
