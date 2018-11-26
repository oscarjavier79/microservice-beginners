package com.microservicios.microservicebeginners.Repository;

import com.microservicios.microservicebeginners.model.Organization;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganizationRepository extends CrudRepository<Organization, Long> {


}
