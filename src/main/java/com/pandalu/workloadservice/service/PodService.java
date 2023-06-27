package com.pandalu.workloadservice.service;
import com.pandalu.workloadservice.db.tables.pojos.K8sPodInfo;

import java.util.List;
public interface PodService {
    public List<K8sPodInfo> getK8sPodInfoList();
    public K8sPodInfo getK8sPodInfo(String name);

    public Boolean postK8sPodInfo(K8sPodInfo pod);

    public Boolean putK8sPodInfo(String name, K8sPodInfo pod);

    public Boolean deleteK8sPodInfo(String name);
}
