package org.ohioanscare.serverside.rest.Controllers;

import org.ohioanscare.serverside.Models.*;
import org.ohioanscare.serverside.Repositories.*;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.Optional;

@RestController
@CrossOrigin
public class OhioResourceRestController {

    @Resource
    private OhioResourceRepository ohioResourceRepo;

    @Resource
    private ServiceRepository serviceRepo;

    @Resource
    private RegionRepository regionRepo;

    @Resource
    private CountyRepository countyRepo;

    @Resource
    private CityRepository cityRepo;

    @Resource
    private ZipCodeRepository zipCodeRepo;


    @GetMapping("/resources")
    public Collection<OhioResource> getAllResources() {
        return (Collection<OhioResource>) ohioResourceRepo.findAll();
    }

    @GetMapping("/resources/resource-by-location/{countyNameOrCityNameOrZipCodeNum}")
    public Collection<OhioResource> getAllResourcesByCountyCityOrZipCode(@PathVariable(value = "countyNameOrCityNameOrZipCodeNum") String countyName, @PathVariable(value = "countyNameOrCityNameOrZipCodeNum") String cityName, @PathVariable(value = "countyNameOrCityNameOrZipCodeNum") String zipCodeNum) {
        return ohioResourceRepo.findByAddress_County_CountyIgnoreCaseOrAddress_City_CityIgnoreCaseOrAddress_ZipCode_ZipCode(countyName, cityName, zipCodeNum);
    }

    @GetMapping("/resources/{id}")
    public Optional<OhioResource> getResourceById(@PathVariable Long id) {
        return ohioResourceRepo.findById(id);
    }

    //ALL RESOURCES BY SERVICE TYPE
    @GetMapping("/resources/services/{serviceType}")
    public Collection<OhioResource> getAllResourcesByService(@PathVariable(value = "serviceType") String serviceType) {
        Service service = serviceRepo.findByServiceIgnoreCase(serviceType);
        return ohioResourceRepo.findByServicesContains(Optional.ofNullable(service));
    }

    //ALL RESOURCES IN A SPECIFIC REGION
    @GetMapping("/resources/regions/{regionName}")
    public Collection<OhioResource> getAllResourcesInARegion(@PathVariable(value = "regionName") String regionName) {
        Region region = regionRepo.findByRegionIgnoreCase(regionName);
        return ohioResourceRepo.findByAddress_Region(region);
    }

    //ALL RESOURCES IN A SPECIFIC COUNTY
    @GetMapping("/resources/counties/{countyName}")
    public Collection<OhioResource> getAllResourcesInACounty(@PathVariable(value = "countyName") String countyName) {
        County county = countyRepo.findByCountyContainsIgnoreCase(countyName);
        return ohioResourceRepo.findByAddress_County(county);
    }

    //ALL RESOURCES IN A SPECIFIC CITY
    @GetMapping("/resources/cities/{cityName}")
    public Collection<OhioResource> getAllResourcesInACity(@PathVariable(value = "cityName") String cityName) {
        City city = cityRepo.findByCityContainsIgnoreCase(cityName);
        return ohioResourceRepo.findByAddress_City(city);
    }

    //ALL RESOURCES IN A SPECIFIC ZIP CODE
    @GetMapping("/resources/zip-codes/{zipCodeNum}")
    public Collection<OhioResource> getAllResourcesByZipCode(@PathVariable(value = "zipCodeNum") String zipCodeNum) {
        ZipCode zipCode = zipCodeRepo.findByZipCodeContains(zipCodeNum);
        return ohioResourceRepo.findByAddress_ZipCode(zipCode);
    }

    //ALL RESOURCES IN A SPECIFIC REGION OF A SPECIFIC SERVICE TYPE
    @GetMapping("/resources/regions/{regionName}/services/{serviceType}")
    public Collection<OhioResource> getAllResourcesByRegionAndService(@PathVariable(value = "regionName") String regionName, @PathVariable (value = "serviceType") String serviceType) {
        Region region = regionRepo.findByRegionIgnoreCase(regionName);
        Service service = serviceRepo.findByServiceIgnoreCase(serviceType);
        return ohioResourceRepo.findByAddress_RegionAndServicesContains(region, service);
    }

    //ALL RESOURCES IN A SPECIFIC COUNTY OF A SPECIFIC SERVICE TYPE
    @GetMapping("/resources/counties/{countyName}/services/{serviceType}")
    public Collection<OhioResource> getAllResourcesByCountyAndService(@PathVariable(value = "countyName") String countyName, @PathVariable (value = "serviceType") String serviceType) {
        County county = countyRepo.findByCountyContainsIgnoreCase(countyName);
        Service service = serviceRepo.findByServiceIgnoreCase(serviceType);
        return ohioResourceRepo.findByAddress_CountyAndServicesContains(county, service);
    }

    //ALL RESOURCES IN A SPECIFIC CITY OF A SPECIFIC SERVICE TYPE
    @GetMapping("/resources/cities/{cityName}/services/{serviceType}")
    public Collection<OhioResource> getAllResourcesByCityAndService(@PathVariable(value = "cityName") String cityName, @PathVariable (value = "serviceType") String serviceType) {
        City city = cityRepo.findByCityContainsIgnoreCase(cityName);
        Service service = serviceRepo.findByServiceIgnoreCase(serviceType);
        return ohioResourceRepo.findByAddress_CityAndServicesContains(city, service);
    }

    //ALL RESOURCES IN A SPECIFIC ZIP CODE OF A SPECIFIC SERVICE TYPE
    @GetMapping("/resources/zip-codes/{zipCodeNum}/services/{serviceType}")
    public Collection<OhioResource> getAllResourcesByZipCodeAndService(@PathVariable(value = "zipCodeNum") String zipCodeNum, @PathVariable (value = "serviceType") String serviceType) {
        ZipCode zipCode = zipCodeRepo.findByZipCodeContains(zipCodeNum);
        Service service = serviceRepo.findByServiceIgnoreCase(serviceType);
        return ohioResourceRepo.findByAddress_ZipCodeAndServicesContains(zipCode, service);
    }
}
