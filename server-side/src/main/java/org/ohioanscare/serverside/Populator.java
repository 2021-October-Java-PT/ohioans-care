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
    public ServiceRepository serviceRepo;

    @Resource
    public AddressRepository addressRepo;

    @Resource
    public OhioResourceRepository ohioResourceRepo;


    @Override
    public void run(String... args) throws Exception {

        //REGIONS
        Region northwest = new Region("Northwast");
        Region northeast = new Region("Northeast");
        Region central = new Region("Central");
        Region southwest = new Region("Southwest");
        Region southeast = new Region("southeast");
        regionRepo.save(northwest);
        regionRepo.save(northeast);
        regionRepo.save(central);
        regionRepo.save(southwest);
        regionRepo.save(southeast);

        //COUNTIES
        County stark = new County("Stark");
        County franklin = new County("Franklin");
        County jefferson = new County("Jefferson");
        countyRepo.save(stark);
        countyRepo.save(franklin);
        countyRepo.save(jefferson);

        //ZIP CODES
        ZipCode zc44721 = new ZipCode("44721", "");
        ZipCode z43212 = new ZipCode("43212", " ");
        zipCodeRepo.save(zc44721);
        zipCodeRepo.save(z43212);

        //SERVICES
        Service food = new Service("Food");
        Service housing = new Service("Housing");
        Service goods = new Service("Goods");
        Service transit = new Service("Transit");
        Service health = new Service("Health");
        Service money = new Service("Money");
        Service care = new Service("Care");
        Service education = new Service("Education");
        Service work = new Service("Work");
        Service legal = new Service("Legal");
        serviceRepo.save(food);
        serviceRepo.save(housing);
        serviceRepo.save(goods);
        serviceRepo.save(transit);
        serviceRepo.save(health);
        serviceRepo.save(money);
        serviceRepo.save(care);
        serviceRepo.save(education);
        serviceRepo.save(work);
        serviceRepo.save(legal);

        //ADDRESSES && OHIO RESOURCES
        Address fccAddress = new Address("6900 Market Avenue North", "", "North Canton", stark, "Ohio", zc44721, northeast);
        addressRepo.save(fccAddress);
        OhioResource firstChristan = new OhioResource("Food Assistance - Common Goods", "First Christian Church", "Common Goods is a ministry of First Christian Church that meets tangible needs of food in Stark County.", "Anyone in Need, All ages, National Guard, Veterans", "Closed", "Closed", "Closed", "Closed", "Closed", "9:00 AM - 11:00 AM", "Closed", "https://www.firstchristian.com/assistance", "XXX-XXX-XXXX", "English", fccAddress, food);
        ohioResourceRepo.save(firstChristan);


        Address heartToHeartFoodPantryFranklinAddress = new Address("1320 Cambridge Boulevard ", " ", "Columbus", franklin, " Ohio", z43212, central);
        addressRepo.save(heartToHeartFoodPantryFranklinAddress);
        OhioResource heartToHeartFoodPantryFranklin = new OhioResource("Heart to Heart Food Pantry", "First Community Church", "Heart to Heart Food Pantry provides food assistance to those in need. Due to COVID-19 Heart to Heart will move from its current shopping model to pre-packaged boxes until further notice.", "Anyone In Need, All Ages, COVID19", "CLOSED", "CLOSED", "9:00 AM - 12:00 PM", "5:00P M - 7:00 PM", "9:00 AM - 12:00 PM", "CLOSED", "CLOSED", "https://h2h.fcchurch.com/", "614-488-0681 ext. 203 ", "English", heartToHeartFoodPantryFranklinAddress, food);
        ohioResourceRepo.save(heartToHeartFoodPantryFranklin);
    }
}
