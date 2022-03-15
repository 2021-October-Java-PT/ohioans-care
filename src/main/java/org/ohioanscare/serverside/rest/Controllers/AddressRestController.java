package org.ohioanscare.serverside.rest.Controllers;

import org.ohioanscare.serverside.Models.Address;
import org.ohioanscare.serverside.Models.County;
import org.ohioanscare.serverside.Repositories.AddressRepository;
import org.ohioanscare.serverside.Repositories.CountyRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Collection;

@RestController
@CrossOrigin
public class AddressRestController {

    @Resource
    private AddressRepository addressRepo;

    @Resource
    private CountyRepository countyRepo;

    @GetMapping("/addresses")
    public Collection<Address> getAllAddresses() {
        return (Collection<Address>) addressRepo.findAll();
    }

    @GetMapping("/addresses/county/{countyName}")
    public Collection<Address> getAddressByCounty(@PathVariable(value = "countyName") String countyName) {
        return addressRepo.findByCounty_CountyContainsIgnoreCase(countyName);
    }

}
