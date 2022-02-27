package org.ohioanscare.serverside.Repositories;

import org.ohioanscare.serverside.Models.Address;
import org.ohioanscare.serverside.Models.County;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface AddressRepository extends CrudRepository<Address, Long> {
    Address findByCityContains(String city);
    Collection<Address> findByCountyContains(County county);
    Collection<Address> findByCounty_CountyContainsIgnoreCase(String county);
}
