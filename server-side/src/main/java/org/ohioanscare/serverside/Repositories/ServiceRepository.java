package org.ohioanscare.serverside.Repositories;

import org.ohioanscare.serverside.Models.Service;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceRepository extends CrudRepository<Service, Long> {
}
