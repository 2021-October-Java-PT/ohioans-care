package org.ohioanscare.serverside.Repositories;

import org.ohioanscare.serverside.Models.City;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends CrudRepository<City,Long> {
    City findByCityContainsIgnoreCase(String city);
}
