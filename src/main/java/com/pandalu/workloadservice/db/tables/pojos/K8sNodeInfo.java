/*
 * This file is generated by jOOQ.
 */
package com.pandalu.workloadservice.db.tables.pojos;


import com.pandalu.workloadservice.db.tables.interfaces.IK8sNodeInfo;

import javax.annotation.Generated;

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
public class K8sNodeInfo implements IK8sNodeInfo {

    private static final long serialVersionUID = 340955204;

    private String  uid;
    private String  name;
    private Integer city;
    private String  ip;
    private Integer maxpods;
    private Integer usedpods;
    private String  maxcpu;
    private String  maxmemory;
    private String  usedcpu;
    private String  usedmemory;
    private ULong   timestamp;

    public K8sNodeInfo() {}

    public K8sNodeInfo(IK8sNodeInfo value) {
        this.uid = value.getUid();
        this.name = value.getName();
        this.city = value.getCity();
        this.ip = value.getIp();
        this.maxpods = value.getMaxpods();
        this.usedpods = value.getUsedpods();
        this.maxcpu = value.getMaxcpu();
        this.maxmemory = value.getMaxmemory();
        this.usedcpu = value.getUsedcpu();
        this.usedmemory = value.getUsedmemory();
        this.timestamp = value.getTimestamp();
    }

    public K8sNodeInfo(
        String  uid,
        String  name,
        Integer city,
        String  ip,
        Integer maxpods,
        Integer usedpods,
        String  maxcpu,
        String  maxmemory,
        String  usedcpu,
        String  usedmemory,
        ULong   timestamp
    ) {
        this.uid = uid;
        this.name = name;
        this.city = city;
        this.ip = ip;
        this.maxpods = maxpods;
        this.usedpods = usedpods;
        this.maxcpu = maxcpu;
        this.maxmemory = maxmemory;
        this.usedcpu = usedcpu;
        this.usedmemory = usedmemory;
        this.timestamp = timestamp;
    }

    @Override
    public String getUid() {
        return this.uid;
    }

    @Override
    public void setUid(String uid) {
        this.uid = uid;
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
    public Integer getCity() {
        return this.city;
    }

    @Override
    public void setCity(Integer city) {
        this.city = city;
    }

    @Override
    public String getIp() {
        return this.ip;
    }

    @Override
    public void setIp(String ip) {
        this.ip = ip;
    }

    @Override
    public Integer getMaxpods() {
        return this.maxpods;
    }

    @Override
    public void setMaxpods(Integer maxpods) {
        this.maxpods = maxpods;
    }

    @Override
    public Integer getUsedpods() {
        return this.usedpods;
    }

    @Override
    public void setUsedpods(Integer usedpods) {
        this.usedpods = usedpods;
    }

    @Override
    public String getMaxcpu() {
        return this.maxcpu;
    }

    @Override
    public void setMaxcpu(String maxcpu) {
        this.maxcpu = maxcpu;
    }

    @Override
    public String getMaxmemory() {
        return this.maxmemory;
    }

    @Override
    public void setMaxmemory(String maxmemory) {
        this.maxmemory = maxmemory;
    }

    @Override
    public String getUsedcpu() {
        return this.usedcpu;
    }

    @Override
    public void setUsedcpu(String usedcpu) {
        this.usedcpu = usedcpu;
    }

    @Override
    public String getUsedmemory() {
        return this.usedmemory;
    }

    @Override
    public void setUsedmemory(String usedmemory) {
        this.usedmemory = usedmemory;
    }

    @Override
    public ULong getTimestamp() {
        return this.timestamp;
    }

    @Override
    public void setTimestamp(ULong timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("K8sNodeInfo (");

        sb.append(uid);
        sb.append(", ").append(name);
        sb.append(", ").append(city);
        sb.append(", ").append(ip);
        sb.append(", ").append(maxpods);
        sb.append(", ").append(usedpods);
        sb.append(", ").append(maxcpu);
        sb.append(", ").append(maxmemory);
        sb.append(", ").append(usedcpu);
        sb.append(", ").append(usedmemory);
        sb.append(", ").append(timestamp);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IK8sNodeInfo from) {
        setUid(from.getUid());
        setName(from.getName());
        setCity(from.getCity());
        setIp(from.getIp());
        setMaxpods(from.getMaxpods());
        setUsedpods(from.getUsedpods());
        setMaxcpu(from.getMaxcpu());
        setMaxmemory(from.getMaxmemory());
        setUsedcpu(from.getUsedcpu());
        setUsedmemory(from.getUsedmemory());
        setTimestamp(from.getTimestamp());
    }

    @Override
    public <E extends IK8sNodeInfo> E into(E into) {
        into.from(this);
        return into;
    }
}