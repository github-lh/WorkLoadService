package com.pandalu.workloadservice.service;

import com.pandalu.workloadservice.db.tables.pojos.K8sNodeInfo;

import java.util.List;

public interface NodeService {
    public List<K8sNodeInfo> getNodeInfoList();
    public K8sNodeInfo getNodeInfo(String name);

    public Boolean postNodeInfo(K8sNodeInfo node);

    public Boolean putNodeInfo(String name, K8sNodeInfo node);

    public Boolean deleteNodeInfo(String name);
}
