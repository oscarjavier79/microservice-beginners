package com.microservicios.microservicebeginners.Service;

import com.microservicios.microservicebeginners.model.Organization;

public interface OrganizationService {

    public Organization getOrganizationById(Long idOrganization);

    public void save(String name);
}
