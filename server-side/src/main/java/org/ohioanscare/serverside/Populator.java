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
        Region central = new Region("Central");
        regionRepo.save(northeast);
        regionRepo.save(central);

        County stark = new County("Stark");
        County jefferson = new County("Jefferson");
        countyRepo.save(stark);
        countyRepo.save(jefferson);

        ZipCode zc44721 = new ZipCode("44721", "");
        zipCodeRepo.save(zc44721);

        Address fccAddress = new Address("6900 Market Avenue North", "", "North Canton", stark, "Ohio", zc44721, northeast);
        addressRepo.save(fccAddress);

        OhioResource firstChristan = new OhioResource("Food Assistance - Common Goods", "First Christian Church", "Common Goods is a ministry of First Christian Church that meets tangible needs of food in Stark County.", "Food Pantry", "Anyone in Need, All ages, National Guard, Veterans", "Friday: 9:00 AM - 11:00 AM", "https://www.firstchristian.com/assistance", "XXX-XXX-XXXX", "English", fccAddress);
        ohioResourceRepo.save(firstChristan);

        ZipCode z43952 = new ZipCode("43952", "1234");
        zipCodeRepo.save(z43952);
        Address urbanMissionFoodWarehouseAddress = new Address("332 N 4th St", "", "Steubenville", jefferson, "Ohio", z43952, central);
        addressRepo.save(urbanMissionFoodWarehouseAddress);
        OhioResource urbanMissionFoodWarehouse = new OhioResource("Urban Mission Food Warehouse", "Urban Mission Food Warehouse", "Urban Mission Food Warehouse", "food", "", "", "https://www.urbanmission.org/contact-us/", "XXX-XXX-XXXX", "English", urbanMissionFoodWarehouseAddress);
        ohioResourceRepo.save(urbanMissionFoodWarehouse);
    }
}
