package org.ohioanscare.serverside.rest.Controllers;

import org.ohioanscare.serverside.Models.County;
import org.ohioanscare.serverside.Repositories.CountyRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Collection;

@RestController
@CrossOrigin
public class CountyRestController {

    @Resource
    private CountyRepository countyRepo;

    @GetMapping("/counties")
    public Collection<County> getAllCounties() {
        return (Collection<County>) countyRepo.findAll();
    }

    @GetMapping("counties/{countyName}")
    public County getCountyByName(@PathVariable String countyName) {
        return countyRepo.findByCountyContainsIgnoreCase(countyName);
    }



}
