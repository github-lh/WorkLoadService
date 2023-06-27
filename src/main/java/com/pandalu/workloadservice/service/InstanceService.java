package com.pandalu.workloadservice.service;

import com.pandalu.workloadservice.db.tables.pojos.InstanceInfo;

import java.util.List;

public interface InstanceService {
    public List<InstanceInfo> getInstanceInfoList();
    public InstanceInfo getInstanceInfo(String id);

    public Boolean postInstanceInfo(InstanceInfo instance);

    public Boolean putInstanceInfo(String id, InstanceInfo instance);

    public Boolean deleteInstanceInfo(String id);
}
