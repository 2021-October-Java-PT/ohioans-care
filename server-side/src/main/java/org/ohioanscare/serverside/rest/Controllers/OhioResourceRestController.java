package org.ohioanscare.serverside.rest.Controllers;

import org.ohioanscare.serverside.Models.OhioResource;
import org.ohioanscare.serverside.Repositories.OhioResourceRepository;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.Optional;

@RestController
@CrossOrigin
public class OhioResourceRestController {

    @Resource
    private OhioResourceRepository ohioResourceRepo;

    @RequestMapping("/resources")
    public Collection<OhioResource> getResource() {
        return (Collection<OhioResource>) ohioResourceRepo.findAll();
    }

    @GetMapping("/resources/{id}")
    public Optional<OhioResource> getResource(@PathVariable Long id) {
        return Optional.ofNullable(ohioResourceRepo.findOhioResourceById(id));
    }

}
