/*
 * This file is generated by jOOQ.
 */
package com.pandalu.workloadservice.db.tables.interfaces;


import java.io.Serializable;

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
public interface IK8sNodeInfo extends Serializable {

    /**
     * Setter for <code>comp_net_fusion.k8s_node_info.uid</code>. 唯一标识符
     */
    public void setUid(String value);

    /**
     * Getter for <code>comp_net_fusion.k8s_node_info.uid</code>. 唯一标识符
     */
    public String getUid();

    /**
     * Setter for <code>comp_net_fusion.k8s_node_info.name</code>. node名称
     */
    public void setName(String value);

    /**
     * Getter for <code>comp_net_fusion.k8s_node_info.name</code>. node名称
     */
    public String getName();

    /**
     * Setter for <code>comp_net_fusion.k8s_node_info.city</code>. node所在城市城市代码
     */
    public void setCity(Integer value);

    /**
     * Getter for <code>comp_net_fusion.k8s_node_info.city</code>. node所在城市城市代码
     */
    public Integer getCity();

    /**
     * Setter for <code>comp_net_fusion.k8s_node_info.ip</code>. node ip
     */
    public void setIp(String value);

    /**
     * Getter for <code>comp_net_fusion.k8s_node_info.ip</code>. node ip
     */
    public String getIp();

    /**
     * Setter for <code>comp_net_fusion.k8s_node_info.maxPods</code>. 最大pods容量
     */
    public void setMaxpods(Integer value);

    /**
     * Getter for <code>comp_net_fusion.k8s_node_info.maxPods</code>. 最大pods容量
     */
    public Integer getMaxpods();

    /**
     * Setter for <code>comp_net_fusion.k8s_node_info.usedPods</code>. 已挂载pod数量
     */
    public void setUsedpods(Integer value);

    /**
     * Getter for <code>comp_net_fusion.k8s_node_info.usedPods</code>. 已挂载pod数量
     */
    public Integer getUsedpods();

    /**
     * Setter for <code>comp_net_fusion.k8s_node_info.maxCpu</code>. 最大cpu需求量
     */
    public void setMaxcpu(String value);

    /**
     * Getter for <code>comp_net_fusion.k8s_node_info.maxCpu</code>. 最大cpu需求量
     */
    public String getMaxcpu();

    /**
     * Setter for <code>comp_net_fusion.k8s_node_info.maxMemory</code>. 最大内存需求量
     */
    public void setMaxmemory(String value);

    /**
     * Getter for <code>comp_net_fusion.k8s_node_info.maxMemory</code>. 最大内存需求量
     */
    public String getMaxmemory();

    /**
     * Setter for <code>comp_net_fusion.k8s_node_info.usedCpu</code>. 已使用cpu
     */
    public void setUsedcpu(String value);

    /**
     * Getter for <code>comp_net_fusion.k8s_node_info.usedCpu</code>. 已使用cpu
     */
    public String getUsedcpu();

    /**
     * Setter for <code>comp_net_fusion.k8s_node_info.usedMemory</code>. 已使用内存
     */
    public void setUsedmemory(String value);

    /**
     * Getter for <code>comp_net_fusion.k8s_node_info.usedMemory</code>. 已使用内存
     */
    public String getUsedmemory();

    /**
     * Setter for <code>comp_net_fusion.k8s_node_info.timestamp</code>. 时间戳
     */
    public void setTimestamp(ULong value);

    /**
     * Getter for <code>comp_net_fusion.k8s_node_info.timestamp</code>. 时间戳
     */
    public ULong getTimestamp();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface IK8sNodeInfo
     */
    public void from(com.pandalu.workloadservice.db.tables.interfaces.IK8sNodeInfo from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface IK8sNodeInfo
     */
    public <E extends com.pandalu.workloadservice.db.tables.interfaces.IK8sNodeInfo> E into(E into);
}
