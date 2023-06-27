package com.pandalu.workloadservice.service;

import com.pandalu.workloadservice.db.tables.pojos.PmInfo;

import java.util.List;
public interface PMInfoService {
    public List<PmInfo> getPMInfoList();
    public PmInfo getPMInfo(String id);

    public Boolean postPMInfo(PmInfo pmInfo);

    public Boolean putPMInfo(String id, PmInfo pmInfo);

    public Boolean deletePMInfo(String id);
}
