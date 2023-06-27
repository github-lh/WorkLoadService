package com.pandalu.workloadservice.service;
import com.pandalu.workloadservice.db.tables.pojos.K8sContainerInfo;
import java.util.List;

public interface ContainerService {
    public List<K8sContainerInfo> getK8sContainerInfoList();
    public K8sContainerInfo getK8sContainerInfo(String name);

    public Boolean postK8sContainerInfo(K8sContainerInfo container);

    public Boolean putK8sContainerInfo(String name, K8sContainerInfo container);

    public Boolean deleteK8sContainerInfo(String name);
}
