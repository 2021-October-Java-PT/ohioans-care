package org.ohioanscare.serverside.rest.Controllers;

import org.ohioanscare.serverside.Models.OhioResource;
import org.ohioanscare.serverside.Models.Service;
import org.ohioanscare.serverside.Repositories.OhioResourceRepository;
import org.ohioanscare.serverside.Repositories.ServiceRepository;
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



    @GetMapping("/resources")
    public Collection<OhioResource> getAllResource() {
        return (Collection<OhioResource>) ohioResourceRepo.findAll();
    }

    @GetMapping("/resources/{id}")
    public Optional<OhioResource> getResourceById(@PathVariable Long id) {
        return ohioResourceRepo.findById(id);
    }

    @RequestMapping("/resources/services/{serviceName}")
    public Collection<OhioResource> getAllResourcesByService(@PathVariable(value = "serviceName") String serviceName) {
        Service service = serviceRepo.findByServiceIgnoreCase(serviceName);
        return ohioResourceRepo.findByServicesContains(Optional.ofNullable(service));
    }
}
