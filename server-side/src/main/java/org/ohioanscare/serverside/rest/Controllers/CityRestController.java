package org.ohioanscare.serverside.rest.Controllers;

import org.ohioanscare.serverside.Models.City;
import org.ohioanscare.serverside.Repositories.CityRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Collection;

@RestController
@CrossOrigin
public class CityRestController {

    @Resource
    private CityRepository cityRepo;

    @GetMapping("/cities")
    public Collection<City> getAllCities() {
        return (Collection<City>) cityRepo.findAll();
    }

    @GetMapping("/cities/{cityName}")
    public City getCityByName(@PathVariable String cityName) {
        return cityRepo.findByCityContainsIgnoreCase(cityName);
    }

}
