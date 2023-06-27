package com.pandalu.workloadservice.controller;

import com.pandalu.workloadservice.db.tables.pojos.K8sPodInfo;
import com.pandalu.workloadservice.service.PodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pod")
public class PodController {
    @Autowired
    PodService service;

    @GetMapping("")
    public List<K8sPodInfo> getAll(){
        return service.getK8sPodInfoList();
    }

    @GetMapping("/{name}")
    public K8sPodInfo Get(@PathVariable String name){
        return service.getK8sPodInfo(name);
    }

    @PostMapping("")
    public String Insert(@RequestBody K8sPodInfo pod){
        if(service.postK8sPodInfo(pod)){
            return "insert success";
        }
        return "insert failed";
    }

    @PutMapping("/{name}")
    public String Update(@PathVariable String name, @RequestBody K8sPodInfo pod){
        if(service.putK8sPodInfo(name, pod)){
            return "update success";
        }
        return "update failed";
    }

    @DeleteMapping("/{name}")
    public String Delete(@PathVariable String name){
        if(service.deleteK8sPodInfo(name)){
            return "delete success";
        }
        return "delete failed";
    }
}
