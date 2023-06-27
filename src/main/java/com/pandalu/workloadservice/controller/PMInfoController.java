package com.pandalu.workloadservice.controller;

import com.pandalu.workloadservice.db.tables.pojos.PmInfo;
import com.pandalu.workloadservice.service.PMInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pm")
public class PMInfoController {
    @Autowired
    PMInfoService service;

    @GetMapping("")
    public List<PmInfo> getAll(){
        return service.getPMInfoList();
    }

    @GetMapping("/{id}")
    public PmInfo Get(@PathVariable String id){
        return service.getPMInfo(id);
    }

    @PostMapping("")
    public String Insert(@RequestBody PmInfo pm){
        if(service.postPMInfo(pm)){
            return "insert success";
        }
        return "insert failed";
    }

    @PutMapping("/{id}")
    public String Update(@PathVariable String id, @RequestBody PmInfo pm){
        if(service.putPMInfo(id, pm)){
            return "update success";
        }
        return "update failed";
    }

    @DeleteMapping("/{id}")
    public String Delete(@PathVariable String id){
        if(service.deletePMInfo(id)){
            return "delete success";
        }
        return "delete failed";
    }
}
