package com.pandalu.workloadservice.service;

import com.pandalu.workloadservice.db.tables.pojos.Vmimages;

import java.util.List;

public interface VMImageService {
    public List<Vmimages> getVMImageList();
    public Vmimages getVMImage(String id);

    public Boolean postVMImage(Vmimages vmImage);

    public Boolean putVMImage(String id, Vmimages vmImage);

    public Boolean deleteVMImage(String id);
}
