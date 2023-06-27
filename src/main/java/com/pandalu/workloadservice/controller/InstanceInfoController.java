package com.pandalu.workloadservice.controller;

import com.pandalu.workloadservice.db.tables.pojos.InstanceInfo;
import com.pandalu.workloadservice.service.InstanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/instance")
public class InstanceInfoController {
    @Autowired
    InstanceService service;

    @GetMapping("")
    public List<InstanceInfo> getAll(){
        return service.getInstanceInfoList();
    }

    @GetMapping("/{id}")
    public InstanceInfo Get(@PathVariable String id){
        return service.getInstanceInfo(id);
    }

    @PostMapping("")
    public String Insert(@RequestBody InstanceInfo instance){
        if(service.postInstanceInfo(instance)){
            return "insert success";
        }
        return "insert failed";
    }

    @PutMapping("/{id}")
    public String Update(@PathVariable String id, @RequestBody InstanceInfo instance){
        if(service.putInstanceInfo(id, instance)){
            return "update success";
        }
        return "update failed";
    }

    @DeleteMapping("/{id}")
    public String Delete(@PathVariable String id){
        if(service.deleteInstanceInfo(id)){
            return "delete success";
        }
        return "delete failed";
    }
}
