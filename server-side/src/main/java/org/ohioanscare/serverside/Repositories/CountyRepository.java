package org.ohioanscare.serverside.Repositories;

import org.ohioanscare.serverside.Models.County;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountyRepository extends CrudRepository<County, Long> {
}
