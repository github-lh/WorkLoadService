package com.pandalu.workloadservice.controller;

import com.pandalu.workloadservice.db.tables.pojos.Vmimages;
import com.pandalu.workloadservice.service.VMImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vmimage")
public class VMImageController {
    @Autowired
    VMImageService service;

    @GetMapping("")
    public List<Vmimages> getAll(){
        return service.getVMImageList();
    }

    @GetMapping("/{id}")
    public Vmimages Get(@PathVariable String id){
        return service.getVMImage(id);
    }

    @PostMapping("")
    public String Insert(@RequestBody Vmimages vmImage){
        if(service.postVMImage(vmImage)){
            return "insert success";
        }
        return "insert failed";
    }

    @PutMapping("/{id}")
    public String Update(@PathVariable String id, @RequestBody Vmimages vmImage){
        if(service.putVMImage(id, vmImage)){
            return "update success";
        }
        return "update failed";
    }

    @DeleteMapping("/{id}")
    public String Delete(@PathVariable String id){
        if(service.deleteVMImage(id)){
            return "delete success";
        }
        return "delete failed";
    }
}
