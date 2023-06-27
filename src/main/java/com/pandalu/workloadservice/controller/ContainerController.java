package com.pandalu.workloadservice.controller;

import com.pandalu.workloadservice.db.tables.pojos.K8sContainerInfo;

import com.pandalu.workloadservice.service.ContainerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/container")
public class ContainerController {
    @Autowired
    ContainerService service;

    @GetMapping("")
    public List<K8sContainerInfo> getAll(){
        return service.getK8sContainerInfoList();
    }

    @GetMapping("/{name}")
    public K8sContainerInfo Get(@PathVariable String name){
        return service.getK8sContainerInfo(name);
    }

    @PostMapping("")
    public String Insert(@RequestBody K8sContainerInfo container){
        if(service.postK8sContainerInfo(container)){
            return "insert success";
        }
        return "insert failed";
    }

    @PutMapping("/{name}")
    public String Update(@PathVariable String name, @RequestBody K8sContainerInfo container){
        if(service.putK8sContainerInfo(name, container)){
            return "update success";
        }
        return "update failed";
    }

    @DeleteMapping("/{name}")
    public String Delete(@PathVariable String name){
        if(service.deleteK8sContainerInfo(name)){
            return "delete success";
        }
        return "delete failed";
    }
}
