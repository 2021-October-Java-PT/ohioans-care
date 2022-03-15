package org.ohioanscare.serverside.Repositories;

import org.ohioanscare.serverside.Models.Region;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegionRepository extends CrudRepository<Region, Long> {
    Region findByRegionIgnoreCase(String region);
}
