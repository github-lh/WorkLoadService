package com.pandalu.workloadservice.controller;

import com.pandalu.workloadservice.db.tables.pojos.K8sNodeInfo;
import com.pandalu.workloadservice.service.NodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/node")
public class NodeController {
    @Autowired
    NodeService service;

    @GetMapping("")
    public List<K8sNodeInfo> getAll(){
        return service.getNodeInfoList();
    }

    @GetMapping("/{id}")
    public K8sNodeInfo Get(@PathVariable String id){
        return service.getNodeInfo(id);
    }

    @PostMapping("")
    public String Insert(@RequestBody K8sNodeInfo node){
        if(service.postNodeInfo(node)){
            return "insert success";
        }
        return "insert failed";
    }

    @PutMapping("/{name}")
    public String Update(@PathVariable String name, @RequestBody K8sNodeInfo node){
        if(service.putNodeInfo(name, node)){
            return "update success";
        }
        return "update failed";
    }

    @DeleteMapping("/{name}")
    public String Delete(@PathVariable String name){
        if(service.deleteNodeInfo(name)){
            return "delete success";
        }
        return "delete failed";
    }
}
