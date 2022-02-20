package org.ohioanscare.serverside.rest.Controllers;

import org.ohioanscare.serverside.Models.OhioResource;
import org.ohioanscare.serverside.Models.User;
import org.ohioanscare.serverside.Repositories.OhioResourceRepository;
import org.ohioanscare.serverside.Repositories.UserRepository;
import org.ohioanscare.serverside.Repositories.ZipCodeRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.Optional;

@RestController
@CrossOrigin
public class UserController {

    @Resource
    private UserRepository userRepo;
    @Resource
    private OhioResourceRepository resourceRepo;
    @Resource
    private ZipCodeRepository zipCodeRepo;


    @GetMapping("/api/users/{userName}")
    public Optional<User> getUser(@PathVariable String userName){
        return userRepo.findByUserName(userName);
    }

    @GetMapping("/api/users/{userName}/saved-resources")
    public Collection<OhioResource> getSavedResources(@PathVariable String userName) {
        Optional<User> user = userRepo.findByUserName(userName);
        return user.get().getResources();
    }

}
