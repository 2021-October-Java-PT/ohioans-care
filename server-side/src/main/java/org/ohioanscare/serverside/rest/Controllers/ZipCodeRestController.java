package org.ohioanscare.serverside.rest.Controllers;

import org.ohioanscare.serverside.Models.ZipCode;
import org.ohioanscare.serverside.Repositories.ZipCodeRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Collection;

@RestController
@CrossOrigin
public class ZipCodeRestController {

    @Resource
    private ZipCodeRepository zipCodeRepo;

    @GetMapping("/zip-codes")
    public Collection<ZipCode> getAllZipCodes() {
        return (Collection<ZipCode>) zipCodeRepo.findAll();
    }

    @GetMapping("zip-codes/{zipCodeNum}")
    public ZipCode getZipCodeByNum(@PathVariable String zipCodeNum) {
        return zipCodeRepo.findByZipCodeContains(zipCodeNum);
    }

}
