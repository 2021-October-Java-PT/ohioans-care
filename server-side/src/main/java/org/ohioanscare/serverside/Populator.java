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
        Region northwest = new Region("Northwest");
        Region northeast = new Region("Northeast");
        Region central = new Region("Central");
        Region southwest = new Region("Southwest");
        Region southeast = new Region("Southeast");
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
        ZipCode z44720 = new ZipCode("44720", "");
        ZipCode z43212 = new ZipCode("43212", " ");
        ZipCode z43952 = new ZipCode("43952", "");
        ZipCode z43953 = new ZipCode("43953", "");
        zipCodeRepo.save(z43953);
        zipCodeRepo.save(z43952);
        zipCodeRepo.save(z44720);
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
        Address fccStarkAddress = new Address("Market Avenue", " ", "Canton", stark, " Ohio", z44720, northeast);
        addressRepo.save(fccStarkAddress);
        OhioResource fccStark = new OhioResource("Common Goods - Food Assistance", "First Christian Church - Canton", "Food panty", "Anyone In Need", "CLOSED", "CLOSED", "CLOSED", "CLOSED", "CLOSED", "12:00 PM -  2:00PM", "CLOSED", "https://www.firstchristian.com/assistance", "(330)495-5075", "English", fccStarkAddress, food);
        ohioResourceRepo.save(fccStark);


        Address heartToHeartFoodPantryFranklinAddress = new Address("1320 Cambridge Boulevard ", " ", "Columbus", franklin, " Ohio", z43212, central);
        addressRepo.save(heartToHeartFoodPantryFranklinAddress);
        OhioResource heartToHeartFoodPantryFranklin = new OhioResource("Heart to Heart Food Pantry", "First Community Church", "Heart to Heart Food Pantry provides food assistance to those in need. Due to COVID-19 Heart to Heart will move from its current shopping model to pre-packaged boxes until further notice.", "Anyone In Need, All Ages, COVID19", "CLOSED", "CLOSED", "9:00 AM - 12:00 PM", "5:00P M - 7:00 PM", "9:00 AM - 12:00 PM", "CLOSED", "CLOSED", "https://h2h.fcchurch.com/", "614-488-0681 ext. 203 ", "English", heartToHeartFoodPantryFranklinAddress, food);
        ohioResourceRepo.save(heartToHeartFoodPantryFranklin);


        Address aliveJeffersonAddress = new Address("P.O. Box 866", "", "Steubenville", jefferson, "Ohio", z43952, southeast);
        addressRepo.save(aliveJeffersonAddress);
        OhioResource aliveJefferson = new OhioResource("Alive Inc", "Alive Inc", "Provides alternate living for violent environments.", "", "", "", "", "", "", "", "", "https://www.aliveshelter.org/", "(740) 283-3444", "", aliveJeffersonAddress, care);
        ohioResourceRepo.save(aliveJefferson);

        Address goodwillIJeffersonAddress = new Address("103 Main St, Wintersville", "", "Wintersville", jefferson, "Ohio", z43953, southeast);
        addressRepo.save(goodwillIJeffersonAddress);
        OhioResource goodwillIJefferson = new OhioResource("Goodwill Industries of Greater Cleveland & East Central Ohio", "Goodwill Industries of Greater Cleveland & East Central Ohio", "Goodwill is a nonprofit, social service agency dedicated to improving the lives of all people by providing skill-building programs and services needed to help remove common barriers to good jobs and independence.", "", " ", " ", " ", " ", " ", " ", " ", "https://www.goodwillgoodskills.org/", "(740) 264-6000", "", goodwillIJeffersonAddress, goods);
        ohioResourceRepo.save(goodwillIJefferson);

        Address jccacJeffersonAddress = new Address("114 North Fourth Street", "", "Steubenville", jefferson, "Ohio", z43952, southeast);
        addressRepo.save(jccacJeffersonAddress);
        OhioResource jccacJefferson = new OhioResource("Jefferson County Community Action Council", "Jefferson Country Community Action Council", "The CAC is Continuing A Commitment to restore and revitalize the quality of life in Jefferson County, and move the residents towards self-sufficiency. We achieve this goal by adapting and providing programs that are accessible, affordable, and culturally-sensitive to meet the needs of the community.", "", "", "", "", "", "", "", "", "", "(740) 282-0971", "", jccacJeffersonAddress, housing);
        ohioResourceRepo.save(jccacJefferson);

        Address healthDepartmentJeffersonAddress = new Address("", "", "Steubenville", jefferson, "Ohio", z43952, southeast);
        addressRepo.save(healthDepartmentJeffersonAddress);
        OhioResource healthDepartmentJefferson = new OhioResource("Jefferson County Health Department", "Jefferson County Health Department", "", "", " ", " ", " ", " ", " ", " ", " ", "https://jchealth.com/", "(740) 283-8530", "", healthDepartmentJeffersonAddress, health);
        ohioResourceRepo.save(healthDepartmentJefferson);

        Address jobFamilyJeffersonAddress = new Address("125 S 5th St", "", "Steubenville", jefferson, "Ohio", z43952, southeast);
        addressRepo.save(jobFamilyJeffersonAddress);
        OhioResource jobFamilyJefferson = new OhioResource("Jefferson County Job & Family", "", "Jefferson County Job & Family", "Our mission is to enhance the quality of life for the residents of Jefferson County, by supporting the delivery of health and human services.", "", "", "", "", "", "", "", "http://www.jcdjfs.com/", "(740) 282-0961", "", jobFamilyJeffersonAddress, work);
        ohioResourceRepo.save(jobFamilyJefferson);

        Address metroHousingAuthorityJeffersonAddress = new Address("815 North Sixth Avenue", "", "Steubenville", jefferson, "Ohio", z43952, southeast);
        addressRepo.save(metroHousingAuthorityJeffersonAddress);
        OhioResource metroHousingAuthorityJefferson = new OhioResource("Jefferson Metro Housing Authority", "Jefferson Metro Housing Authority", "JMHA is committed to promote adequate and affordable housing, economic opportunity, and a suitable living environment free from discrimination.", "", " ", " ", " ", " ", " ", " ", " ", "http://www.jeffersonmha.org/", "(740) 282-0994", "", metroHousingAuthorityJeffersonAddress, housing);
        ohioResourceRepo.save(metroHousingAuthorityJefferson);

        Address ohioMeansJobsJeffersonAddress = new Address("114 N 4th St, Steubenville", "", "Steubenville", jefferson, "Ohio", z43952, southeast);
        addressRepo.save(ohioMeansJobsJeffersonAddress);
        OhioResource ohioMeansJobsJefferson = new OhioResource("Ohio Means Jobs Jefferson County", "Ohio Means Jobs Jefferson County", "Operating under the guidelines of the Workforce Innovation & Opportunity Act, OhioMeansJobs was created for Jefferson and Harrison County businesses and citizens in order to provide a single system that offers an array of employment, education and training programs and partners' services. ", "", "", "", "", "", "", "", "", "https://ohiomeansjobsjeffersoncounty.com/", "(740) 282-0971", "", ohioMeansJobsJeffersonAddress, work);
        ohioResourceRepo.save(ohioMeansJobsJefferson);

        Address ohioValleyHealthCenterJeffersonAddress = new Address("", "", "Steubenville", jefferson, "Ohio", z43952, southeast);
        addressRepo.save(ohioValleyHealthCenterJeffersonAddress);
        OhioResource ohioValleyHealthCenterJefferson = new OhioResource("Ohio Valley Health Center", "Ohio Valley Health Center", "", "", " ", " ", " ", " ", " ", " ", " ", "https://www.ovhealthcenter.org/about-us.html", "(740) 283-2856", "", ohioValleyHealthCenterJeffersonAddress, health);
        ohioResourceRepo.save(ohioValleyHealthCenterJefferson);

        Address freeCollegeBenefitJeffersonAddress = new Address("110 John Scott Hwy", "", "Steubenville", jefferson, "Ohio", z43952, southeast);
        addressRepo.save(freeCollegeBenefitJeffersonAddress);
        OhioResource freeCollegeBenefitJefferson = new OhioResource("PEF MBP Free College Benefit", "PEF MBP Free College Benefit", "It’s PEF MBP’s mission to give you every advantage to get ahead. That’s why we’ve partnered with Eastern Gateway Community College. Through the PEF MBP Free College benefit, you and your family members can now earn an associate degree completely online—for FREE.", "", "", "", "", "", "", "", "", "https://freecollege.pefmbp.org/contact-us/", "(888) 590-9009", "", freeCollegeBenefitJeffersonAddress, education);
        ohioResourceRepo.save(freeCollegeBenefitJefferson);

        Address primeTimeCenterJeffersonAddress = new Address("300 Lovers Lane", "", "Steubenville", jefferson, "Ohio", z43953, southeast);
        addressRepo.save(primeTimeCenterJeffersonAddress);
        OhioResource primeTimeCenterJefferson = new OhioResource("Prime Time Center", "Prime Time Center", "Our mission is to help the aging population become Healthy, Independent, and Productive (H.I.P.).", "", " ", " ", " ", " ", " ", " ", " ", "https://www.primetimejeffersoncounty.com/", "(740) 314-5197", "", primeTimeCenterJeffersonAddress, transit);
        ohioResourceRepo.save(primeTimeCenterJefferson);

        Address schoolBrightPromiseJeffersonAddress = new Address("256 John Scott Hwy", "", "Steubenville", jefferson, "Ohio", z43952, southeast);
        addressRepo.save(schoolBrightPromiseJeffersonAddress);
        OhioResource schoolBrightPromiseJefferson = new OhioResource("School of Bright Promise", "School of Bright Promise", "We offer a unique environment that provides the flexibility needed to educate students with special needs.", "", "", "", "", "", "", "", "", "https://www.jcbdd.com/programs/school-of-bright-promise/", "(740) 264-7176", "", schoolBrightPromiseJeffersonAddress, education);
        ohioResourceRepo.save(schoolBrightPromiseJefferson);

        Address seOhioLegalServicesJeffersonAddress = new Address("100 N 3rd St, Steubenville", "", "Steubenville", jefferson, "Ohio", z43952, southeast);
        addressRepo.save(seOhioLegalServicesJeffersonAddress);
        OhioResource seOhioLegalServicesJefferson = new OhioResource("Southeastern Ohio Legal Services", "Southeastern Ohio Legal Services", "Southeastern Ohio Legal Services® (SEOLS) gives legal help without attorney fees to people with low income and limited savings and assets. We can also serve organizations of low-income people.", "", "", "", "", "", "", "", "", "https://www.seols.org/", "(740) 283-4781", "", seOhioLegalServicesJeffersonAddress, legal);
        ohioResourceRepo.save(seOhioLegalServicesJefferson);

        Address theSalvationArmyFranklinAddress = new Address("332 North Fourth Street", "P.O. Box 1226", "Steubenville", jefferson, "Ohio", z43952, southeast);
        addressRepo.save(theSalvationArmyFranklinAddress);
        OhioResource theSalvationArmyFranklin = new OhioResource("The Salvation Army", "The Salvation Army", "The Salvation Army in Steubenville dedicated to serving the men, women, and children who are at-risk and in need of financial, social service, and spiritual support. We work everyday to elevate individuals up from despair to provide hope and assistance. In teaching life skills, we provide individuals with an opportunity to maximize their physical, emotional, and spiritual being to affect life change.", "", " ", " ", " ", " ", " ", " ", " ", "https://neo.salvationarmy.org/northeastohio/steubenville", "(740) 282-5121", "", theSalvationArmyFranklinAddress, food, goods);
        ohioResourceRepo.save(theSalvationArmyFranklin);

        Address urbanMissionFoodWarehouseFranklinAddress = new Address("332 N 4th St", "", "Steubenville", jefferson, "Ohio", z43952, southeast);
        addressRepo.save(urbanMissionFoodWarehouseFranklinAddress);
        OhioResource urbanMissionFoodWarehouseFranklin = new OhioResource("Urban Mission Food Warehouse", "Urban Mission Food Warehouse", "We're updating our website, but still want to connect with you. Please contact us", "", " ", " ", " ", " ", " ", " ", " ", "https://www.urbanmission.org/contact-us/", "(740) 282-2911", "English", urbanMissionFoodWarehouseFranklinAddress, food);
        ohioResourceRepo.save(urbanMissionFoodWarehouseFranklin);
    }
}
