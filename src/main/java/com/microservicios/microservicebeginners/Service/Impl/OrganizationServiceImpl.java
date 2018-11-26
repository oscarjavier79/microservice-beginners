package com.microservicios.microservicebeginners.Service.Impl;

import com.microservicios.microservicebeginners.Repository.OrganizationRepository;
import com.microservicios.microservicebeginners.Service.OrganizationService;
import com.microservicios.microservicebeginners.model.Organization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrganizationServiceImpl implements OrganizationService {

    @Autowired
    private OrganizationRepository organizationRepository;

    @Override
    public Organization getOrganizationById(Long idOrganization) {
        Organization organization= organizationRepository.findById(idOrganization).orElse(new Organization());;
        return organization;
    }

    @Override
    public void save(String name) {
        Organization organization = new Organization();
        organization.setName(name);
        organizationRepository.save(organization);
    }
}
