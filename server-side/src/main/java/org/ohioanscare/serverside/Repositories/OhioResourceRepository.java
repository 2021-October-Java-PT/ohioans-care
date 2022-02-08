package org.ohioanscare.serverside.Repositories;

import org.ohioanscare.serverside.Models.OhioResource;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OhioResourceRepository extends CrudRepository <OhioResource, Long> {
    OhioResource findOhioResourceByEntityName(String entityName);
}
