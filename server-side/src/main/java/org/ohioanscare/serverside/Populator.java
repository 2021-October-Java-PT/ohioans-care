package org.ohioanscare.serverside;

import org.ohioanscare.serverside.Models.*;
import org.ohioanscare.serverside.Repositories.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class Populator implements CommandLineRunner {

    @Resource
    public RegionRepository regionRepo;

    @Resource
    public CountyRepository countyRepo;

    @Resource
    public ZipCodeRepository zipCodeRepo;

    @Resource
    public AddressRepository addressRepo;

    @Resource
    public OhioResourceRepository ohioResourceRepo;


    @Override
    public void run(String... args) throws Exception {

        Region northeast = new Region("Northeast");
        regionRepo.save(northeast);

        County stark = new County("Stark");
        countyRepo.save(stark);

        ZipCode zc44721 = new ZipCode("44721", "");
        zipCodeRepo.save(zc44721);

        Address fccAddress = new Address("6900 Market Avenue North", "", "North Canton", "Ohio", zc44721, "", stark, northeast);
        addressRepo.save(fccAddress);

        OhioResource firstChristan = new OhioResource("Food AssistanceCommon Goods", "First Christian Church", "Common Goods is a ministry of First Christian Church that meets tangible needs of food in Stark County.", "Food Pantry", "Anyone in Need, All ages, National Guard, Veterans", "Friday: 9:00 AM - 11:00 AM", "https://www.firstchristian.com/assistance", "English", fccAddress);
        ohioResourceRepo.save(firstChristan);

    }
}
