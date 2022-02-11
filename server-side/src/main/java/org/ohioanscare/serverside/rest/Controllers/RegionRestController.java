package org.ohioanscare.serverside.rest.Controllers;

import org.ohioanscare.serverside.Models.Region;
import org.ohioanscare.serverside.Repositories.RegionRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Collection;

@RestController
@CrossOrigin
public class RegionRestController {

    @Resource
    private RegionRepository regionRepo;

    @GetMapping("/regions")
    public Collection<Region> getAllRegions() {
        return (Collection<Region>) regionRepo.findAll();
    }

    @GetMapping("/regions/{region}")
    public Region getRegionByRegion(@PathVariable String region) {
        return regionRepo.findByRegionIgnoreCase(region);
    }

}
