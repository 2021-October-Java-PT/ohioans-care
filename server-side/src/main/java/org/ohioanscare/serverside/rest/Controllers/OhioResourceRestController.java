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
    private AddressRepository addressRepo;

    @Resource
    private ZipCodeRepository zipCodeRepo;


    @GetMapping("/resources")
    public Collection<OhioResource> getAllResource() {
        return (Collection<OhioResource>) ohioResourceRepo.findAll();
    }

    @GetMapping("/resources/{id}")
    public Optional<OhioResource> getResourceById(@PathVariable Long id) {
        return ohioResourceRepo.findById(id);
    }

    @GetMapping("/resources/{serviceType}")
    public Collection<OhioResource> getAllResourcesByService(@PathVariable(value = "serviceType") String serviceType) {
        Service service = serviceRepo.findByServiceIgnoreCase(serviceType);
        return ohioResourceRepo.findByServicesContains(Optional.ofNullable(service));
    }

    @GetMapping("/{regionName}/resources")
    public Collection<OhioResource> getAllResourcesInARegion(@PathVariable(value = "regionName") String regionName) {
        Region region = regionRepo.findByRegionIgnoreCase(regionName);
        return ohioResourceRepo.findByAddress_Region(region);
    }

    @GetMapping("/zip-codes/{zipCodeNum}/resources")
    public Collection<OhioResource> getAllResourcesByZipCode(@PathVariable(value = "zipCodeNum") String zipCodeNum) {
        ZipCode zipCode = zipCodeRepo.findByZipCodeContains(zipCodeNum);
        return ohioResourceRepo.findByAddress_ZipCode(zipCode);
    }

    @GetMapping("/zip-codes/{zipCodeNum}/resources/{serviceType}")
    public Collection<OhioResource> getAllResourcesByZipCodeAndService(@PathVariable(value = "zipCodeNum") String zipCodeNum, @PathVariable (value = "serviceType") String serviceType) {
        ZipCode zipCode = zipCodeRepo.findByZipCodeContains(zipCodeNum);
        Service service = serviceRepo.findByServiceIgnoreCase(serviceType);
        return ohioResourceRepo.findByAddress_ZipCodeAndServicesContains(zipCode, service);
    }

    @GetMapping("/{regionName}/resources/{serviceType}")
    public Collection<OhioResource> getAllResourcesByRegionAndService(@PathVariable(value = "regionName") String regionName, @PathVariable (value = "serviceType") String serviceType) {
        Region region = regionRepo.findByRegionIgnoreCase(regionName);
        Service service = serviceRepo.findByServiceIgnoreCase(serviceType);
        return ohioResourceRepo.findByAddress_RegionAndServicesContains(region, service);
    }
}
