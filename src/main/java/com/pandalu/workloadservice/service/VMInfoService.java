package com.pandalu.workloadservice.service;
import com.pandalu.workloadservice.db.tables.pojos.VmInfo;

import java.util.List;

public interface VMInfoService {
    public List<VmInfo> getVMInfoList();
    public VmInfo getVMInfo(String id);

    public Boolean postVMInfo(VmInfo vmInfo);

    public Boolean putVMInfo(String id, VmInfo vmInfo);

    public Boolean deleteVMInfo(String id);
}
