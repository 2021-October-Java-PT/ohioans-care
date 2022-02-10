package org.ohioanscare.serverside.Repositories;

import org.ohioanscare.serverside.Models.OhioResource;
import org.ohioanscare.serverside.Models.Service;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Optional;

@Repository
public interface OhioResourceRepository extends CrudRepository <OhioResource, Long> {
    OhioResource findOhioResourceByEntityName(String entityName);
    Collection<OhioResource> findByServicesContains(Optional<Service> service);
}
