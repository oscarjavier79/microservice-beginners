package com.microservicios.microservicebeginners.controllers;

import com.microservicios.microservicebeginners.Service.OrganizationService;
import com.microservicios.microservicebeginners.model.Organization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/organization")
public class OrganizationController  {

    @Autowired
    private OrganizationService organizationService;

    @GetMapping(value = "/get")
    public ResponseEntity<Organization> getOrganization(@RequestParam Long idOrganization){
        return new ResponseEntity<Organization>(organizationService.getOrganizationById(idOrganization),HttpStatus.OK);
    }

    @PostMapping(value = "/save")
    public ResponseEntity<HttpStatus> saveOrganization(@RequestParam String name){

        organizationService.save(name);

        return new ResponseEntity<HttpStatus>(HttpStatus.OK);
    }



}
