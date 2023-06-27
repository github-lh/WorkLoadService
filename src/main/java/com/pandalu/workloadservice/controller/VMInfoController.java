package com.pandalu.workloadservice.controller;

import com.pandalu.workloadservice.db.tables.pojos.VmInfo;
import com.pandalu.workloadservice.service.VMInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vm")
public class VMInfoController {
    @Autowired
    VMInfoService service;

    @GetMapping("")
    public List<VmInfo> getAll(){
        return service.getVMInfoList();
    }

    @GetMapping("/{id}")
    public VmInfo Get(@PathVariable String id){
        return service.getVMInfo(id);
    }

    @PostMapping("")
    public String Insert(@RequestBody VmInfo vm){
        if(service.postVMInfo(vm)){
            return "insert success";
        }
        return "insert failed";
    }

    @PutMapping("/{id}")
    public String Update(@PathVariable String id, @RequestBody VmInfo vm){
        if(service.putVMInfo(id, vm)){
            return "update success";
        }
        return "update failed";
    }

    @DeleteMapping("/{id}")
    public String Delete(@PathVariable String id){
        if(service.deleteVMInfo(id)){
            return "delete success";
        }
        return "delete failed";
    }
}
