/*
 * This file is generated by jOOQ.
 */
package com.pandalu.workloadservice.db.tables.pojos;


import com.pandalu.workloadservice.db.tables.interfaces.IVmimages;

import javax.annotation.Generated;


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
public class Vmimages implements IVmimages {

    private static final long serialVersionUID = 1441170257;

    private String vmimageid;
    private Double imgsize;
    private String imgcpu;
    private String imgmem;
    private String imgdisk;
    private String imgos;
    private String networkadapter;
    private Long   timestamp;

    public Vmimages() {}

    public Vmimages(IVmimages value) {
        this.vmimageid = value.getVmimageid();
        this.imgsize = value.getImgsize();
        this.imgcpu = value.getImgcpu();
        this.imgmem = value.getImgmem();
        this.imgdisk = value.getImgdisk();
        this.imgos = value.getImgos();
        this.networkadapter = value.getNetworkadapter();
        this.timestamp = value.getTimestamp();
    }

    public Vmimages(
        String vmimageid,
        Double imgsize,
        String imgcpu,
        String imgmem,
        String imgdisk,
        String imgos,
        String networkadapter,
        Long   timestamp
    ) {
        this.vmimageid = vmimageid;
        this.imgsize = imgsize;
        this.imgcpu = imgcpu;
        this.imgmem = imgmem;
        this.imgdisk = imgdisk;
        this.imgos = imgos;
        this.networkadapter = networkadapter;
        this.timestamp = timestamp;
    }

    @Override
    public String getVmimageid() {
        return this.vmimageid;
    }

    @Override
    public void setVmimageid(String vmimageid) {
        this.vmimageid = vmimageid;
    }

    @Override
    public Double getImgsize() {
        return this.imgsize;
    }

    @Override
    public void setImgsize(Double imgsize) {
        this.imgsize = imgsize;
    }

    @Override
    public String getImgcpu() {
        return this.imgcpu;
    }

    @Override
    public void setImgcpu(String imgcpu) {
        this.imgcpu = imgcpu;
    }

    @Override
    public String getImgmem() {
        return this.imgmem;
    }

    @Override
    public void setImgmem(String imgmem) {
        this.imgmem = imgmem;
    }

    @Override
    public String getImgdisk() {
        return this.imgdisk;
    }

    @Override
    public void setImgdisk(String imgdisk) {
        this.imgdisk = imgdisk;
    }

    @Override
    public String getImgos() {
        return this.imgos;
    }

    @Override
    public void setImgos(String imgos) {
        this.imgos = imgos;
    }

    @Override
    public String getNetworkadapter() {
        return this.networkadapter;
    }

    @Override
    public void setNetworkadapter(String networkadapter) {
        this.networkadapter = networkadapter;
    }

    @Override
    public Long getTimestamp() {
        return this.timestamp;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Vmimages (");

        sb.append(vmimageid);
        sb.append(", ").append(imgsize);
        sb.append(", ").append(imgcpu);
        sb.append(", ").append(imgmem);
        sb.append(", ").append(imgdisk);
        sb.append(", ").append(imgos);
        sb.append(", ").append(networkadapter);
        sb.append(", ").append(timestamp);

        sb.append(")");
        return sb.toString();
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
}