package org.ohioanscare.serverside.rest.Controllers;

import org.ohioanscare.serverside.Models.Service;
import org.ohioanscare.serverside.Repositories.ServiceRepository;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.Optional;

@RestController
@CrossOrigin
public class ServiceRestController {

    @Resource
    private ServiceRepository serviceRepo;

    @RequestMapping("/services")
    public Collection<Service> getAllServices() {
        return (Collection<Service>) serviceRepo.findAll();
    }

    @GetMapping("/services/{service}")
    public Optional<Service> getServiceById(@PathVariable String service) {
        return Optional.ofNullable(serviceRepo.findByServiceIgnoreCase(service));
    }

//    @GetMapping("/services/{id}")
//    public Optional<Service> getServiceById(@PathVariable Long id) {
//        return serviceRepo.findById(id);
//    }
}
