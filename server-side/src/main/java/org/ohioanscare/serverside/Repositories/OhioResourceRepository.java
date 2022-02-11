package org.ohioanscare.serverside.Repositories;

import org.ohioanscare.serverside.Models.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Optional;

@Repository
public interface OhioResourceRepository extends CrudRepository <OhioResource, Long> {
    Collection<OhioResource> findByServicesContains(Optional<Service> service);
    Collection<OhioResource> findByAddress_Region(Region region);
    Collection<OhioResource> findByAddress_ZipCode(ZipCode zipCode);
    Collection<OhioResource> findByAddress_ZipCodeAndServicesContains(ZipCode address_zipCode, Service service);
    Collection<OhioResource> findByAddress_RegionAndServicesContains(Region address_region, Service service);
//    Collection<OhioResource> findByAddressCityAndServicesContains(String address_city, Service service);
    Collection<OhioResource> findByAddressCityContainsAndServicesContains(String address_city, Service service);
}
