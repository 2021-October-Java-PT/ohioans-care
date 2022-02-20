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
    public CityRepository cityRepo;

    @Resource
    public AddressRepository addressRepo;

    @Resource
    public OhioResourceRepository ohioResourceRepo;


    @Resource
    public ServiceRepository serviceRepo;

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
        County cuyahoga = new County("Cuyahoga");
        County stark = new County("Stark");
        County franklin = new County("Franklin");
        County jefferson = new County("Jefferson");
        County hamilton = new County("Hamilton");
        County summit = new County("Summit");
        County lucas = new County("Lucas");
        countyRepo.save(lucas);
        countyRepo.save(summit);
        countyRepo.save(stark);
        countyRepo.save(franklin);
        countyRepo.save(jefferson);
        countyRepo.save(cuyahoga);
        countyRepo.save(hamilton);

        //ZIP CODES
        ZipCode z44720 = new ZipCode("44720", "");
        ZipCode z43212 = new ZipCode("43212", " ");
        ZipCode z43952 = new ZipCode("43952", "");
        ZipCode z43953 = new ZipCode("43953", "");
        ZipCode z45239 = new ZipCode("45239", " ");
        ZipCode z44114 = new ZipCode("44114", " ");
        ZipCode z45214 = new ZipCode("45214", "");
        ZipCode z45237 = new ZipCode("45237", "");
        ZipCode z45202 = new ZipCode("45202", "");
        ZipCode z45206 = new ZipCode("45206", " ");
        ZipCode z45241 = new ZipCode("45241", "");
        ZipCode z45321 = new ZipCode("45321", " ");
        ZipCode z45231 = new ZipCode("45231", " ");
        ZipCode z45227 = new ZipCode("45227", " ");
        ZipCode z45240 = new ZipCode("45240", " ");
        ZipCode z45219 = new ZipCode("45219", " ");
        ZipCode z45229 = new ZipCode("45229", " ");
        ZipCode z43205 = new ZipCode("43205", " ");
        ZipCode z43215 = new ZipCode("43215", " ");
        ZipCode z43203 = new ZipCode("43203", " ");
        ZipCode z43206 = new ZipCode("43206", " ");
        ZipCode z43211 = new ZipCode("43211", " ");
        ZipCode z43223 = new ZipCode("43223", " ");
        ZipCode z43207 = new ZipCode("43207", " ");
        ZipCode z43201 = new ZipCode("43201", "");
        ZipCode z43219 = new ZipCode("43219", "");
        ZipCode z43065 = new ZipCode("43065", "");
        ZipCode z43229 = new ZipCode("43229", "");
        ZipCode z44110 = new ZipCode("44110", "");
        ZipCode z44134 = new ZipCode("44134", " ");
        ZipCode z44103 = new ZipCode("44103", " ");
        ZipCode z44113 = new ZipCode("44113", " ");
        ZipCode z44116 = new ZipCode("44116", " ");
        ZipCode z44106 = new ZipCode("44106", " ");
        ZipCode z44111 = new ZipCode("44111", " ");
        ZipCode z44104 = new ZipCode("44104", " ");
        ZipCode z44308 = new ZipCode("44308", "");
        ZipCode z44135 = new ZipCode("44135", "");
        ZipCode z44115 = new ZipCode("44115", "");
        ZipCode z43615 = new ZipCode("43615", " ");
        ZipCode z43560 = new ZipCode("43560", " ");
        ZipCode z43537 = new ZipCode("43537", " ");
        ZipCode z43604 = new ZipCode("43604", " ");
        ZipCode z43064 = new ZipCode("43064", " ");
        ZipCode z43606 = new ZipCode("43606", " ");
        ZipCode z43620 = new ZipCode("43620", " ");
        ZipCode z44109 = new ZipCode("44109", " ");
        ZipCode z43623 = new ZipCode("43623", " ");
        zipCodeRepo.save(z44720);
        zipCodeRepo.save(z43212);
        zipCodeRepo.save(z43952);
        zipCodeRepo.save(z43953);
        zipCodeRepo.save(z45239);
        zipCodeRepo.save(z44114);
        zipCodeRepo.save(z45214);
        zipCodeRepo.save(z45237);
        zipCodeRepo.save(z45202);
        zipCodeRepo.save(z45206);
        zipCodeRepo.save(z45241);
        zipCodeRepo.save(z45321);
        zipCodeRepo.save(z45231);
        zipCodeRepo.save(z45227);
        zipCodeRepo.save(z45240);
        zipCodeRepo.save(z45219);
        zipCodeRepo.save(z45229);
        zipCodeRepo.save(z43205);
        zipCodeRepo.save(z43215);
        zipCodeRepo.save(z43203);
        zipCodeRepo.save(z43206);
        zipCodeRepo.save(z43211);
        zipCodeRepo.save(z43223);
        zipCodeRepo.save(z43207);
        zipCodeRepo.save(z43201);
        zipCodeRepo.save(z43219);
        zipCodeRepo.save(z43065);
        zipCodeRepo.save(z43229);
        zipCodeRepo.save(z44110);
        zipCodeRepo.save(z44134);
        zipCodeRepo.save(z44103);
        zipCodeRepo.save(z44113);
        zipCodeRepo.save(z44116);
        zipCodeRepo.save(z44106);
        zipCodeRepo.save(z44111);
        zipCodeRepo.save(z44104);
        zipCodeRepo.save(z44308);
        zipCodeRepo.save(z44135);
        zipCodeRepo.save(z44115);
        zipCodeRepo.save(z43615);
        zipCodeRepo.save(z43560);
        zipCodeRepo.save(z43537);
        zipCodeRepo.save(z43604);
        zipCodeRepo.save(z43064);
        zipCodeRepo.save(z43606);
        zipCodeRepo.save(z43620);
        zipCodeRepo.save(z44109);
        zipCodeRepo.save(z43623);

        //CITIES
        City canton = new City("Canton");
        City cleveland = new City("Cleveland");
        City columbus = new City("Columbus");
        City steubenville = new City("Steubenville");
        City wintersville = new City("Wintersville");
        City cincinnati = new City("Cincinnati");
        City blueAsh = new City("Blue Ash");
        City hilliard = new City("Hilliard");
        City parma = new City("Parma");
        City rockyRiver = new City("Rocky River");
        City akron = new City("Akron");
        City toledo = new City("Toledo");
        City sylvania = new City("Sylvania");
        City maumee = new City("Maumee");
        City holland = new City("Holland");
        cityRepo.save(holland);
        cityRepo.save(maumee);
        cityRepo.save(sylvania);
        cityRepo.save(toledo);
        cityRepo.save(akron);
        cityRepo.save(rockyRiver);
        cityRepo.save(parma);
        cityRepo.save(hilliard);
        cityRepo.save(blueAsh);
        cityRepo.save(cincinnati);
        cityRepo.save(canton);
        cityRepo.save(columbus);
        cityRepo.save(steubenville);
        cityRepo.save(wintersville);
        cityRepo.save(cleveland);

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
        Address fccStarkAddress = new Address("Market Avenue", " ", canton, stark, " Ohio", z44720, northeast);
        addressRepo.save(fccStarkAddress);
        OhioResource fccStark = new OhioResource("Common Goods - Food Assistance", "First Christian Church - Canton", "Food pantry", "Anyone In Need", "CLOSED", "CLOSED", "CLOSED", "CLOSED", "CLOSED", "12:00 PM -  2:00PM", "CLOSED", "https://www.firstchristian.com/assistance", "(330)495-5075", "English", fccStarkAddress, food);
        ohioResourceRepo.save(fccStark);

        Address heartToHeartFoodPantryFranklinAddress = new Address("1320 Cambridge Boulevard ", " ", columbus, franklin, " Ohio", z43212, central);
        addressRepo.save(heartToHeartFoodPantryFranklinAddress);
        OhioResource heartToHeartFoodPantryFranklin = new OhioResource("Heart to Heart Food Pantry", "First Community Church", "Heart to Heart Food Pantry provides food assistance to those in need. Due to COVID-19 Heart to Heart will move from its current shopping model to pre-packaged boxes until further notice.", "Anyone In Need, All Ages, COVID19", "CLOSED", "CLOSED", "9:00 AM - 12:00 PM", "5:00P M - 7:00 PM", "9:00 AM - 12:00 PM", "CLOSED", "CLOSED", "https://h2h.fcchurch.com/", "614-488-0681 ext. 203 ", "English", heartToHeartFoodPantryFranklinAddress, food);
        ohioResourceRepo.save(heartToHeartFoodPantryFranklin);

        Address aliveJeffersonAddress = new Address("P.O. Box 866", "", steubenville, jefferson, "Ohio", z43952, southeast);
        addressRepo.save(aliveJeffersonAddress);
        OhioResource aliveJefferson = new OhioResource("Alive Inc", "Alive Inc", "Provides alternate living for violent environments.", "", "", "", "", "", "", "", "", "https://www.aliveshelter.org/", "(740) 283-3444", "", aliveJeffersonAddress, care);
        ohioResourceRepo.save(aliveJefferson);

        Address goodwillIJeffersonAddress = new Address("103 Main St, Wintersville", "", wintersville, jefferson, "Ohio", z43953, southeast);
        addressRepo.save(goodwillIJeffersonAddress);
        OhioResource goodwillIJefferson = new OhioResource("Goodwill Industries of Greater Cleveland & East Central Ohio", "Goodwill Industries of Greater Cleveland & East Central Ohio", "Goodwill is a nonprofit, social service agency dedicated to improving the lives of all people by providing skill-building programs and services needed to help remove common barriers to good jobs and independence.", "", " ", " ", " ", " ", " ", " ", " ", "https://www.goodwillgoodskills.org/", "(740) 264-6000", "", goodwillIJeffersonAddress, goods);
        ohioResourceRepo.save(goodwillIJefferson);

        Address jccacJeffersonAddress = new Address("114 North Fourth Street", "", steubenville, jefferson, "Ohio", z43952, southeast);
        addressRepo.save(jccacJeffersonAddress);
        OhioResource jccacJefferson = new OhioResource("Jefferson County Community Action Council", "Jefferson Country Community Action Council", "The CAC is Continuing A Commitment to restore and revitalize the quality of life in Jefferson County, and move the residents towards self-sufficiency. We achieve this goal by adapting and providing programs that are accessible, affordable, and culturally-sensitive to meet the needs of the community.", "", "", "", "", "", "", "", "", "", "(740) 282-0971", "", jccacJeffersonAddress, housing);
        ohioResourceRepo.save(jccacJefferson);

        Address healthDepartmentJeffersonAddress = new Address("", "", steubenville, jefferson, "Ohio", z43952, southeast);
        addressRepo.save(healthDepartmentJeffersonAddress);
        OhioResource healthDepartmentJefferson = new OhioResource("Jefferson County Health Department", "Jefferson County Health Department", "", "", " ", " ", " ", " ", " ", " ", " ", "https://jchealth.com/", "(740) 283-8530", "", healthDepartmentJeffersonAddress, health);
        ohioResourceRepo.save(healthDepartmentJefferson);

        Address jobFamilyJeffersonAddress = new Address("125 S 5th St", "", steubenville, jefferson, "Ohio", z43952, southeast);
        addressRepo.save(jobFamilyJeffersonAddress);
        OhioResource jobFamilyJefferson = new OhioResource("Jefferson County Job & Family", "", "Jefferson County Job & Family", "Our mission is to enhance the quality of life for the residents of Jefferson County, by supporting the delivery of health and human services.", "", "", "", "", "", "", "", "http://www.jcdjfs.com/", "(740) 282-0961", "", jobFamilyJeffersonAddress, work);
        ohioResourceRepo.save(jobFamilyJefferson);

        Address metroHousingAuthorityJeffersonAddress = new Address("815 North Sixth Avenue", "", steubenville, jefferson, "Ohio", z43952, southeast);
        addressRepo.save(metroHousingAuthorityJeffersonAddress);
        OhioResource metroHousingAuthorityJefferson = new OhioResource("Jefferson Metro Housing Authority", "Jefferson Metro Housing Authority", "JMHA is committed to promote adequate and affordable housing, economic opportunity, and a suitable living environment free from discrimination.", "", " ", " ", " ", " ", " ", " ", " ", "http://www.jeffersonmha.org/", "(740) 282-0994", "", metroHousingAuthorityJeffersonAddress, housing);
        ohioResourceRepo.save(metroHousingAuthorityJefferson);

        Address ohioMeansJobsJeffersonAddress = new Address("114 N 4th St, Steubenville", "", steubenville, jefferson, "Ohio", z43952, southeast);
        addressRepo.save(ohioMeansJobsJeffersonAddress);
        OhioResource ohioMeansJobsJefferson = new OhioResource("Ohio Means Jobs Jefferson County", "Ohio Means Jobs Jefferson County", "Operating under the guidelines of the Workforce Innovation & Opportunity Act, OhioMeansJobs was created for Jefferson and Harrison County businesses and citizens in order to provide a single system that offers an array of employment, education and training programs and partners' services. ", "", "", "", "", "", "", "", "", "https://ohiomeansjobsjeffersoncounty.com/", "(740) 282-0971", "", ohioMeansJobsJeffersonAddress, work);
        ohioResourceRepo.save(ohioMeansJobsJefferson);

        Address ohioValleyHealthCenterJeffersonAddress = new Address("", "", steubenville, jefferson, "Ohio", z43952, southeast);
        addressRepo.save(ohioValleyHealthCenterJeffersonAddress);
        OhioResource ohioValleyHealthCenterJefferson = new OhioResource("Ohio Valley Health Center", "Ohio Valley Health Center", "", "", " ", " ", " ", " ", " ", " ", " ", "https://www.ovhealthcenter.org/about-us.html", "(740) 283-2856", "", ohioValleyHealthCenterJeffersonAddress, health);
        ohioResourceRepo.save(ohioValleyHealthCenterJefferson);

        Address freeCollegeBenefitJeffersonAddress = new Address("110 John Scott Hwy", "", steubenville, jefferson, "Ohio", z43952, southeast);
        addressRepo.save(freeCollegeBenefitJeffersonAddress);
        OhioResource freeCollegeBenefitJefferson = new OhioResource("PEF MBP Free College Benefit", "PEF MBP Free College Benefit", "It’s PEF MBP’s mission to give you every advantage to get ahead. That’s why we’ve partnered with Eastern Gateway Community College. Through the PEF MBP Free College benefit, you and your family members can now earn an associate degree completely online—for FREE.", "", "", "", "", "", "", "", "", "https://freecollege.pefmbp.org/contact-us/", "(888) 590-9009", "", freeCollegeBenefitJeffersonAddress, education);
        ohioResourceRepo.save(freeCollegeBenefitJefferson);

        Address primeTimeCenterJeffersonAddress = new Address("300 Lovers Lane", "", steubenville, jefferson, "Ohio", z43953, southeast);
        addressRepo.save(primeTimeCenterJeffersonAddress);
        OhioResource primeTimeCenterJefferson = new OhioResource("Prime Time Center", "Prime Time Center", "Our mission is to help the aging population become Healthy, Independent, and Productive (H.I.P.).", "", " ", " ", " ", " ", " ", " ", " ", "https://www.primetimejeffersoncounty.com/", "(740) 314-5197", "", primeTimeCenterJeffersonAddress, transit);
        ohioResourceRepo.save(primeTimeCenterJefferson);

        Address schoolBrightPromiseJeffersonAddress = new Address("256 John Scott Hwy", "", steubenville, jefferson, "Ohio", z43952, southeast);
        addressRepo.save(schoolBrightPromiseJeffersonAddress);
        OhioResource schoolBrightPromiseJefferson = new OhioResource("School of Bright Promise", "School of Bright Promise", "We offer a unique environment that provides the flexibility needed to educate students with special needs.", "", "", "", "", "", "", "", "", "https://www.jcbdd.com/programs/school-of-bright-promise/", "(740) 264-7176", "", schoolBrightPromiseJeffersonAddress, education);
        ohioResourceRepo.save(schoolBrightPromiseJefferson);

        Address seOhioLegalServicesJeffersonAddress = new Address("100 N 3rd St, Steubenville", "", steubenville, jefferson, "Ohio", z43952, southeast);
        addressRepo.save(seOhioLegalServicesJeffersonAddress);
        OhioResource seOhioLegalServicesJefferson = new OhioResource("Southeastern Ohio Legal Services", "Southeastern Ohio Legal Services", "Southeastern Ohio Legal Services® (SEOLS) gives legal help without attorney fees to people with low income and limited savings and assets. We can also serve organizations of low-income people.", "", "", "", "", "", "", "", "", "https://www.seols.org/", "(740) 283-4781", "", seOhioLegalServicesJeffersonAddress, legal);
        ohioResourceRepo.save(seOhioLegalServicesJefferson);

        Address theSalvationArmyFranklinAddress = new Address("332 North Fourth Street", "P.O. Box 1226", steubenville, jefferson, "Ohio", z43952, southeast);
        addressRepo.save(theSalvationArmyFranklinAddress);
        OhioResource theSalvationArmyFranklin = new OhioResource("The Salvation Army", "The Salvation Army", "The Salvation Army in Steubenville dedicated to serving the men, women, and children who are at-risk and in need of financial, social service, and spiritual support. We work everyday to elevate individuals up from despair to provide hope and assistance. In teaching life skills, we provide individuals with an opportunity to maximize their physical, emotional, and spiritual being to affect life change.", "", " ", " ", " ", " ", " ", " ", " ", "https://neo.salvationarmy.org/northeastohio/steubenville", "(740) 282-5121", "", theSalvationArmyFranklinAddress, food, goods);
        ohioResourceRepo.save(theSalvationArmyFranklin);

        Address urbanMissionFoodWarehouseFranklinAddress = new Address("332 N 4th St", "", steubenville, jefferson, "Ohio", z43952, southeast);
        addressRepo.save(urbanMissionFoodWarehouseFranklinAddress);
        OhioResource urbanMissionFoodWarehouseFranklin = new OhioResource("Urban Mission Food Warehouse", "Urban Mission Food Warehouse", "We're updating our website, but still want to connect with you. Please contact us", "", " ", " ", " ", " ", " ", " ", " ", "https://www.urbanmission.org/contact-us/", "(740) 282-2911", "English", urbanMissionFoodWarehouseFranklinAddress, food);
        ohioResourceRepo.save(urbanMissionFoodWarehouseFranklin);

        Address stepForwardAddress = new Address("1801 Superior Ave #400", " ", cleveland, cuyahoga, " Ohio", z44114, northeast);
        addressRepo.save(stepForwardAddress);
        OhioResource stepForward = new OhioResource("Step Forward", "Step Forward", " Our mission is to propel educational attainment and economic self-sufficiency for multiple generations throughout Cuyahoga County.  ", " ", "Closed", "8:00AM-5:00PM", "8:00AM-5:00PM", "8:00AM-5:00PM", "8:00AM-5:00PM", "8:00AM-5:00PM", "Closed", "http://stepforwardtoday.org/", "(216) 696-9077", "English, Spanish", stepForwardAddress, education);
        ohioResourceRepo.save(stepForward);

        Address ohioMeansJobsCincinnatiHamiltonCountyAddress = new Address("1916 Central Pkwy", "", cincinnati, hamilton, " Ohio", z45214, southwest);
        addressRepo.save(ohioMeansJobsCincinnatiHamiltonCountyAddress);
        OhioResource ohioMeansJobsCincinnatiHamiltonCounty = new OhioResource("OhioMeansJobs Cincinnati-Hamilton County", "OhioMeansJobs Cincinnati-Hamilton County", "We offer tools and resources that help job-seekers and employers find a job or employees in Hamilton County.", "Adults", "Closed", "8:00AM–4:30PM", "8:00AM–4:30PM", "8:00AM–4:30PM", "8:00AM–4:30PM", "8:00AM–4:30PM", "Closed", "https://www.omj-cinham.org/", "(513) 946-7200", "English", ohioMeansJobsCincinnatiHamiltonCountyAddress, work);
        ohioResourceRepo.save(ohioMeansJobsCincinnatiHamiltonCounty);

        Address cincinnatiWorksAddress = new Address("708 Walnut St, Cincinnati", "", cincinnati, hamilton, " Ohio", z45202, southwest);
        addressRepo.save(cincinnatiWorksAddress);
        OhioResource cincinnatiWorks = new OhioResource("Cincinnati Works", "Cincinnati Works", "For people struggling financially or who need a second chance, improving their situation all alone can feel insurmountable. But at Cincinnati Works, we believe in the power of a single step, and getting a job can be a powerful first step to getting one’s life back.", "Adults", "Closed", "8:00AM–4:30PM", "8:00AM–4:30PM", "8:00AM–4:30PM", "8:00AM–4:30PM", "Closed", "Closed", "https://cincinnatiworks.org/", "(513) 744-9675", "English", cincinnatiWorksAddress, work);
        ohioResourceRepo.save(cincinnatiWorks);

        Address communityActionAgencyCincinnatiAddress = new Address("1740 Langdon Farm Rd", "", cincinnati, hamilton, "", z45237, southwest);
        addressRepo.save(communityActionAgencyCincinnatiAddress);
        OhioResource communityActionAgencyCincinnati = new OhioResource("Community Action Agency | Cincinnati-Hamilton County", "Community Action Agency | Cincinnati-Hamilton County", "CAA uses a broad range of public and private resources to give low- and moderate-income individuals the opportunity to improve the quality of life for themselves, their families and their communities.", "", "Closed", "8:00AM-5:00PM", "8:00AM-5:00PM", "8:00AM-5:00PM", "8:00AM-5:00PM", "8:00AM-5:00PM", "Closed", "http://www.cincy-caa.org/", "(513) 569-1840", "English", communityActionAgencyCincinnatiAddress, money, food);
        ohioResourceRepo.save(communityActionAgencyCincinnati);

        Address legalAidSocietyOfGreaterCincinnatiAddress = new Address("Donald P. Kiekamp COMMUNITY LAW CENTER BUILDING, 215 E 9th St #200", "", cincinnati, hamilton, " Ohio", z45202, southwest);
        addressRepo.save(legalAidSocietyOfGreaterCincinnatiAddress);
        OhioResource legalAidSocietyOfGreaterCincinnati = new OhioResource("Legal Aid Society of Greater Cincinnati", "Legal Aid Society of Greater Cincinnati", "We resolve serious legal problems for low-income people, promote economic and family stability and reduce poverty through effective legal assistance.", "Adults", "Closed", "8:30AM-5:00PM", "8:30AM-5:00PM", "8:30AM-5:00PM", "8:30AM-5:00PM", "8:30AM-5:00PM", "Closed", "https://www.lascinti.org/", "(513) 241-9400", "English", legalAidSocietyOfGreaterCincinnatiAddress, legal);
        ohioResourceRepo.save(legalAidSocietyOfGreaterCincinnati);

        Address cincinnatiMetropolitanHousingAuthorityAddress = new Address("1627 Western Ave", " ", cincinnati, hamilton, " Ohio", z45214, southwest);
        addressRepo.save(cincinnatiMetropolitanHousingAuthorityAddress);
        OhioResource cincinnatiMetropolitanHousingAuthority = new OhioResource("Cincinnati Metropolitan Housing Authority", "Cincinnati Metropolitan Housing Authority", "For more than 80 years the agency has provided quality, affordable rental housing opportunities for individuals and families throughout the county. ", " ", "Closed", "8:00AM–4:30PM", "8:00AM–4:30PM", "8:00AM–4:30PM", "8:00AM–4:30PM", "8:00AM–4:30PM", "Closed", "https://cintimha.com/", "(513) 721-4580", "English", cincinnatiMetropolitanHousingAuthorityAddress, housing);
        ohioResourceRepo.save(cincinnatiMetropolitanHousingAuthority);

        Address affordableHousingAdvocatesAddress = new Address("117 E 12th St, Cincinnati", "", cincinnati, hamilton, " Ohio", z45202, southwest);
        addressRepo.save(affordableHousingAdvocatesAddress);
        OhioResource affordableHousingAdvocates = new OhioResource("Affordable Housing Advocates", "Affordable Housing Advocates", "Affordable Housing Advocates (AHA)– also known as Cincinnatians for Affordable Housing– is a group of housing providers, advocates and consumers dedicated to the goal of ensuring good, safe, accessible, affordable housing for all people in Southwest Ohio.", "", "", "", "", "", "", "", "", "https://affordablehousingcincinnati.org/", "(513) 421-7803", "English", affordableHousingAdvocatesAddress, housing);
        ohioResourceRepo.save(affordableHousingAdvocates);

        Address NewPathChildAndFamilySolutionsAddress = new Address(" 5400 Edalbert Dr", " ", cincinnati, hamilton, " Ohio", z45239, southwest);
        addressRepo.save(NewPathChildAndFamilySolutionsAddress);
        OhioResource NewPathChildAndFamilySolutions = new OhioResource("NewPath Child & Family Solutions - Hamilton County West", "NewPath Child & Family Solutions - Hamilton County West", "We provide help for individuals facing behavioral and specialty healthcare, educational treatment, and child welfare needs.", "Children, Families", "Closed", "8:00AM-5:00PM", "8:00AM-5:00PM", "8:00AM-5:00PM", "8:00AM-5:00PM", "8:00AM-5:00PM", "Closed", "https://newpath.org/", "(855) 577-7284", "English", NewPathChildAndFamilySolutionsAddress, health, care);
        ohioResourceRepo.save(NewPathChildAndFamilySolutions);

        Address healthCareAccessNowAddress = new Address(" 2602 Victory Pkwy", " ", cincinnati, hamilton, " Ohio", z45206, southwest);
        addressRepo.save(healthCareAccessNowAddress);
        OhioResource healthCareAccessNow = new OhioResource("Health Care Access Now", "Health Care Access Now", "To build a primary care integrated community-centered system for the uninsured and other vulnerable populations in our region.", "Children, Adults", "Closed", "8:30AM–4:00PM", "8:30AM–4:00PM", "8:30AM–4:00PM", "8:30AM–4:00PM", "8:30AM–4:00PM", "Closed", "https://healthcareaccessnow.org/", "(513) 707-5697", "English", healthCareAccessNowAddress, health);
        ohioResourceRepo.save(healthCareAccessNow);

        Address newLifeFurnitureBankAddress = new Address("11335 Reed Hartman Highway #134 Unit 134", "", blueAsh, hamilton, "Ohio", z45241, southwest);
        addressRepo.save(newLifeFurnitureBankAddress);
        OhioResource newLifeFurnitureBank = new OhioResource("New Life Furniture Bank", "New Life Furniture Bank", "New Life Furniture Bank (NLFB) is Southwest Ohio’s only furniture bank collecting gently used furniture and household items to provide to those in need throughout Greater Cincinnati and Northern Kentucky.  ", "Children, Adults", "Closed", "9:00AM-4:00PM", "9:00AM-4:00PM", "9:00AM-4:00PM", "9:00AM-4:00PM", "9:00AM-4:00PM", "Closed", "https://nlfurniture.org/", "(513) 313-0530", "English", newLifeFurnitureBankAddress, goods);
        ohioResourceRepo.save(newLifeFurnitureBank);

        Address hamiltonCountyJobAndFamilyServicesAddress = new Address("222 E Central Pkwy", " ", cincinnati, hamilton, " Ohio", z45202, southwest);
        addressRepo.save(hamiltonCountyJobAndFamilyServicesAddress);
        OhioResource hamiltonCountyJobAndFamilyServices = new OhioResource("Hamilton County Job & Family Services", "Hamilton County Job & Family Services", "Hamilton County Job and Family Services administers state, federal and local programs designed to help those in need and help families work toward self sufficiency.", "Children, Adults", "Closed", "7:30AM-4:30PM", "7:30AM-4:30PM", "7:30AM-4:30PM", "7:30AM-4:30PM", "7:30AM-4:30PM", "Closed", "https://www.hcjfs.org/", "(513) 946-1000", "English", hamiltonCountyJobAndFamilyServicesAddress, food, money, care, health, transit, work);
        ohioResourceRepo.save(hamiltonCountyJobAndFamilyServices);

        Address societyOfStVincentDePaulAddress = new Address("1125 Bank St", " ", cincinnati, hamilton, " Ohio", z45321, southwest);
        addressRepo.save(societyOfStVincentDePaulAddress);
        OhioResource societyOfStVincentDePaul = new OhioResource("Society of St. Vincent de Paul - Cincinnati", "Society of St. Vincent de Paul - Cincinnati", "A network of neighbors, inspired by Gospel values, growing in holiness and building a more just world through personal relationships with and service to people in need.", "Children, Adults", "Closed", "8:00AM-4:00PM", "8:00AM-4:00PM", "8:00AM-4:00PM", "8:00AM-4:00PM", "8:00AM-4:00PM", "8:00AM-4:00PM", "https://www.svdpcincinnati.org/", "(513) 562-8841", "English", societyOfStVincentDePaulAddress, food, goods);
        ohioResourceRepo.save(societyOfStVincentDePaul);

        Address corpusChristiFoodPantryFoodDistributionCenterAddress = new Address(" 2014 Springdale Rd", " ", cincinnati, hamilton, " Ohio", z45231, southwest);
        addressRepo.save(corpusChristiFoodPantryFoodDistributionCenterAddress);
        OhioResource corpusChristiFoodPantryFoodDistributionCenter = new OhioResource("Corpus Christi Food Pantry - Food Distribution Center", "Corpus Christi Food Pantry - Food Distribution Center", "The mission of the Corpus Christi Food Pantry is to serve those who come to our pantry, with compassion and respect and with a Christ-like servant attitude.  We remain open to listening and working diligently to meet the needs of the individuals and families in our community.", "Children, Adults", "Closed", "10AM-11:30AM", "6:00PM-7:30PM", "10:00AM-11:30AM", "Closed", "Closed", "Closed", "https://www.corpuschristicommunity.org/outreach/outreach-1/food-pantry-3/", "(513) 825-0618", "English", corpusChristiFoodPantryFoodDistributionCenterAddress, food);
        ohioResourceRepo.save(corpusChristiFoodPantryFoodDistributionCenter);

        Address madisonvilleEducationAndAssistanceCenterAddress = new Address("4600 Erie Ave, Cincinnati", " ", cincinnati, hamilton, " Ohio", z45227, southwest);
        addressRepo.save(madisonvilleEducationAndAssistanceCenterAddress);
        OhioResource madisonvilleEducationAndAssistanceCenter = new OhioResource("Madisonville Education and Assistance Center (MEAC)", "Madisonville Education and Assistance Center (MEAC)", "Our mission is to offer access to education, services, and engagement that enable all neighbors to thrive, and also reach self-sufficiency and independence.", " ", "Closed", "9:00AM-5:00PM", "9:00AM-5:00PM", "9:00AM-5:00PM", "9:00AM-5:00PM", "Closed", "Closed", "https://meaccincinnati.org/", "(513) 271-5501", "English", madisonvilleEducationAndAssistanceCenterAddress, education, money);
        ohioResourceRepo.save(madisonvilleEducationAndAssistanceCenter);

        Address hamiltonCountyHeadStartProgramAddress = new Address("924 Waycross Rd", " ", cincinnati, hamilton, " Ohio", z45240, southwest);
        addressRepo.save(hamiltonCountyHeadStartProgramAddress);
        OhioResource hamiltonCountyHeadStartProgram = new OhioResource(" Hamilton County Head Start Program", "Hamilton County Head Start Program", "Head Start is a federally-funded program that provides preschool education and ensures that both children and parents are prepared for kindergarten and for a life of learning. Through either direct service or referrals, Head Start children also receive numerous health services ensuring good physical, dental, nutritional, and mental health.", "Children", "Closed", "8:00AM-4:00PM", "8:00AM-4:00PM", "8:00AM-4:00PM", "8:00AM-4:00PM", "8:00AM-4:00PM", "Closed", "https://hcescheadstart.org/", "(513) 674-4299", "English", hamiltonCountyHeadStartProgramAddress, education);
        ohioResourceRepo.save(hamiltonCountyHeadStartProgram);

        Address hamiltonCountyMentalHealthAndRecoveryServicesAddress = new Address(" 2350 Auburn Ave", "", cincinnati, hamilton, " Ohio", z45219, southwest);
        addressRepo.save(hamiltonCountyMentalHealthAndRecoveryServicesAddress);
        OhioResource hamiltonCountyMentalHealthAndRecoveryServices = new OhioResource("Hamilton County Mental Health and Recovery Services", "Hamilton County Mental Health and Recovery Services", "To develop and manage a continuum of mental health, addiction, and prevention services that have a positive impact on the community, are accessible, results oriented, and responsive to individual and family needs.", "Children, Adults", " ", " ", " ", " ", " ", " ", " ", "https://www.hcmhrsb.org/", "(513) 946-8600", "English", hamiltonCountyMentalHealthAndRecoveryServicesAddress, care);
        ohioResourceRepo.save(hamiltonCountyMentalHealthAndRecoveryServices);

        Address mentalHealthAccessPointAddress = new Address("311 Albert Sabin Way", " ", cincinnati, hamilton, " Ohio", z45229, southwest);
        addressRepo.save(mentalHealthAccessPointAddress);
        OhioResource mentalHealthAccessPoint = new OhioResource("Mental Health Access Point", "Mental Health Access Point", "We provide a standardized entry to a managed system of care that ensures appropriate services are available, accessible, and of high quality.", " ", "24 Hours", "24 Hours", "24 Hours", "24 Hours", "24 Hours", "24 Hours", "24 Hours", "http://www.mentalhealthaccesspoint.org/", " (513) 558-8888", "English", mentalHealthAccessPointAddress, care);
        ohioResourceRepo.save(mentalHealthAccessPoint);

        Address greenleafJobTrainingServicesAddress = new Address("510 E N Broadway 2nd Floor", " ", columbus, franklin, " Ohio", z43205, central);
        addressRepo.save(greenleafJobTrainingServicesAddress);
        OhioResource greenleafJobTrainingServices = new OhioResource("Greenleaf Job Training Services", "Greenleaf Job Training Services", "Greenleaf Job Training Services is a social enterprise serving individuals with disabilities and other barriers to employment in the Central Ohio area. Our clients are veterans, individuals with developmental and learning disabilities, those who’ve had traumatic brain injuries, people with physical, visual, and hearing impairments, and others who face significant barriers to employment.", "Disabled, Veterans", "Closed", "8:30AM-5:30PM", "8:30AM-5:30PM", "8:30AM-5:30PM", "8:30AM-5:30PM", "8:30AM-5:30PM", "Closed", "http://www.greenleafjts.com/", "(614) 261-3110", " ", greenleafJobTrainingServicesAddress, work);
        ohioResourceRepo.save(greenleafJobTrainingServices);

        Address franklinTransportationResourcesIncAddress = new Address("2999 E Dublin Granville Rd #215", " ", columbus, franklin, " Ohio", z43205, central);
        addressRepo.save(franklinTransportationResourcesIncAddress);
        OhioResource franklinTransportationResourcesInc = new OhioResource("Franklin Transportation Resources Inc", "Franklin Transportation Resources Inc", "Our primary objective is to assist consumers and their loved ones in going to their medical appointments when personal or specialized vehicles are not available. We provide dependability, ease, and safety that consumers need for keeping their appointments and themselves well and healthy. ", "Seniors, Disabled", " ", " ", " ", " ", " ", " ", " ", "http://ftrohio.com/", "(614) 337-2668", " ", franklinTransportationResourcesIncAddress, transit);
        ohioResourceRepo.save(franklinTransportationResourcesInc);

        Address catholicSocialServicesAddress = new Address("197 E Gay St", " ", columbus, franklin, " Ohio", z43215, central);
        addressRepo.save(catholicSocialServicesAddress);
        OhioResource catholicSocialServices = new OhioResource("Catholic Social Services", "Catholic Social Services", "We are a part of the worldwide Catholic Church responding to the complicated needs of the working poor, underserved, immigrants, and vulnerable populations within central and southern Ohio.", "Seniors, Underserved, Vulneralbe", "Closed", "8:30AM-5:30PM", "8:30AM-5:30PM", "8:30AM-5:30PM", "8:30AM-5:30PM", "8:30AM-5:30PM", "Closed", "https://www.colscss.org/", "(614) 221-5891", " ", catholicSocialServicesAddress, transit, money);
        ohioResourceRepo.save(catholicSocialServices);

        Address franklinCountyDepartmentOfJobAndFamilyServicesAddress = new Address("1721 Northland Park Ave", " ", columbus, franklin, " Ohio", z43229, central);
        addressRepo.save(franklinCountyDepartmentOfJobAndFamilyServicesAddress);
        OhioResource franklinCountyDepartmentOfJobAndFamilyServices = new OhioResource("Franklin County Department of Job and Family Services", "Franklin County Department of Job and Family Services", "Our mission is to enhance the quality of life for the residents of Franklin County, by supporting the delivery of health and human services.", "Serving All", "Closed", "7:30AM-5:00PM", "7:30AM-5:00PM", "7:30AM-5:00PM", "7:30AM-5:00PM", "7:30AM-5:00PM", "Closed", "http://jfs.franklincountyohio.gov/", "(844) 640-6446", " ", franklinCountyDepartmentOfJobAndFamilyServicesAddress, money, food, health);
        ohioResourceRepo.save(franklinCountyDepartmentOfJobAndFamilyServices);

        Address homeEnergyAssistanceProgramAddress = new Address("788 Mt Vernon Ave", " ", columbus, franklin, " Ohio", z43203, central);
        addressRepo.save(homeEnergyAssistanceProgramAddress);
        OhioResource homeEnergyAssistanceProgram = new OhioResource("Home Energy Assistance Program", "Home Energy Assistance Program", "The Home Energy Assistance Program (HEAP) is a federally funded program that provides eligible Ohioans assistance with their home energy bills. This one-time benefit is applied directly to the customer’s utility bill or bulk fuel bill.", "Serving All", "Closed", "8:30AM-5:30PM", "8:30AM-5:30PM", "8:30AM-5:30PM", "8:30AM-5:30PM", "8:30AM-5:30PM", "Closed", "https://development.ohio.gov/wps/portal/gov/development/individual/energy-assistance/1-home-energy-assistance-program", "(800) 282-0880", " ", homeEnergyAssistanceProgramAddress, money);
        ohioResourceRepo.save(homeEnergyAssistanceProgram);

        Address legalAidSocietyOfColumbusAddress = new Address("1108 City Park Ave #100", " ", columbus, franklin, " Ohio", z43206, central);
        addressRepo.save(legalAidSocietyOfColumbusAddress);
        OhioResource legalAidSocietyOfColumbus = new OhioResource("Legal Aid Society of Columbus", "Legal Aid Society of Columbus", "Our attorneys know that without proper representation, justice can be difficult to come by and it is the mission of LASC to improve the lives of low income residents and senior citizens of Columbus and Central Ohio by providing high quality legal representation that meets our clients’ civil legal needs.  Our mission is to provide civil legal aid and advocacy to combat unfairness and injustice and to help people rise out of poverty.", "Serving All", "Closed", "8:30AM-5:30PM", "8:30AM-5:30PM", "8:30AM-5:30PM", "8:30AM-5:30PM", "8:30AM-5:30PM", "Closed", "https://www.columbuslegalaid.org/", "(614) 224-8374", " ", legalAidSocietyOfColumbusAddress, legal);
        ohioResourceRepo.save(legalAidSocietyOfColumbus);

        Address ohioLegalHelpAddress = new Address("88 E Broad St # 720", " ", columbus, franklin, " Ohio", z43215, central);
        addressRepo.save(ohioLegalHelpAddress);
        OhioResource ohioLegalHelp = new OhioResource("Ohio Legal Help", "Ohio Legal Help", "Ohio Legal Help leverages technology and innovation to improve justice and fairness for all Ohioans. Our work removes barriers to the law so that all Ohioans can understand their legal options, make informed decisions and connect to legal and community resources.", "Serving All", " ", " ", " ", " ", " ", " ", " ", "http://ohiolegalhelp.org/", " (614) 285-6710", " ", ohioLegalHelpAddress, legal);
        ohioResourceRepo.save(ohioLegalHelp);

        Address columbusMetropolitanHousingAuthorityAddress = new Address("880 E 11th Ave, Columbus", " ", columbus, franklin, " Ohio", z43211, central);
        addressRepo.save(columbusMetropolitanHousingAuthorityAddress);
        OhioResource columbusMetropolitanHousingAuthority = new OhioResource("Columbus Metropolitan Housing Authority", "Columbus Metropolitan Housing Authority", "CMHA helps people access affordable housing through collaborative partnerships to develop, renovate, and maintain housing; promote neighborhood revitalization; and assist residents in accessing needed social services.", "Serving All", "Closed", "Closed", "8:00AM-4:30PM", "8:00AM-4:30PM", "8:00AM-4:30PM", "8:00AM-4:30PM", "Closed", "http://www.cmhanet.com/", "(614) 421-6000", " ", columbusMetropolitanHousingAuthorityAddress, housing);
        ohioResourceRepo.save(columbusMetropolitanHousingAuthority);

        Address communityHousingNetworkAddress = new Address("1670 Harrisburg Pike", " ", columbus, franklin, " Ohio", z43223, central);
        addressRepo.save(communityHousingNetworkAddress);
        OhioResource communityHousingNetwork = new OhioResource("Community Housing Network", "Community Housing Network", "Developing and managing affordable, permanent housing for people challenged by mental health conditions, substance abuse and chronic homelessness, in various stages of recovery.", "Serving All", " ", " ", " ", " ", " ", " ", " ", "http://www.chninc.org/", "(614) 272-0456", " ", communityHousingNetworkAddress, housing);
        ohioResourceRepo.save(communityHousingNetwork);

        Address vineyardFreeHealthClinicsAddress = new Address("171 E 5th Ave, Columbus", " ", columbus, franklin, " Ohio", z43207, central);
        addressRepo.save(vineyardFreeHealthClinicsAddress);
        OhioResource vineyardFreeHealthClinics = new OhioResource("Vineyard Free Health Clinics", "Vineyard Free Health Clinics", " Vineyard Free Health Clinics serve those ages 18 and up who are uninsured OR have Medicaid or are Medicaid eligible with income at or below 200% of the Federal Poverty Level. ", "Serving All", "", "", "", "", "", "", "", "https://www.vineyardcommunitycenter.org/free-health-legal-clinic", "(614) 259-5428", " ", vineyardFreeHealthClinicsAddress, health);
        ohioResourceRepo.save(vineyardFreeHealthClinics);

        Address columbusFreeClinicAddress = new Address("2231 N High St, Columbus", "", columbus, franklin, " Ohio", z43201, central);
        addressRepo.save(columbusFreeClinicAddress);
        OhioResource columbusFreeClinic = new OhioResource("Columbus Free Clinic", "Columbus Free Clinic", "The Columbus Free Clinic is an interprofessional, student-run free clinic that provides quality medical care and social services to underserved individuals while promoting valuable educational opportunities for volunteers. ", "Serving All", "Closed", "Closed", "Closed", "Closed", "5:30PM-9:30PM", "Closed", "Closed", "http://www.columbusfreeclinic.com/", "(614) 404-8417", "", columbusFreeClinicAddress, health);
        ohioResourceRepo.save(columbusFreeClinic);

        Address freeStoreUnitedMethodistChurchForAllPeopleAddress = new Address("946 Parsons Ave", "", columbus, franklin, " Ohio", z43206, central);
        addressRepo.save(freeStoreUnitedMethodistChurchForAllPeopleAddress);
        OhioResource freeStoreUnitedMethodistChurchForAllPeople = new OhioResource("Free Store - United Methodist Church For All People", "Free Store - United Methodist Church For All People", "The United Methodist Free Store provides gently used clothing and household items to individuals and families in a hospitable atmosphere that affirms the self-worth of each individual. More than 50,000 families have become members of the Free Store since we opened our doors in January 1999.", "Serving All", "Closed", "Closed", "10:00AM-2:00PM", "Closed", "10:00AM-2:00PM", "12:30PM-4:30PM", "10:00AM-2:00PM", "http://www.4allpeople.org/freestore", "(614) 443-1713", "", freeStoreUnitedMethodistChurchForAllPeopleAddress, goods);
        ohioResourceRepo.save(freeStoreUnitedMethodistChurchForAllPeople);

        ZipCode z43204 = new ZipCode("43204", "");
        zipCodeRepo.save(z43204);
        Address westsideFreeStoreMinistriesAddress = new Address("61 S Powell Ave, Columbus", "", columbus, franklin, " Ohio", z43204, central);
        addressRepo.save(westsideFreeStoreMinistriesAddress);
        OhioResource westsideFreeStoreMinistries = new OhioResource("Westside Free Store Ministries", "Westside Free Store Ministries", "The Westside Free Store Ministries is a faith-based, 501(c)(3) charitable organization designed to share resources, build relationships and create community on Columbus’ west side. Through the volunteer effort and generosity of many people, the Westside Free Store serves thousands of people in need each year.", "Serving All", "Closed", "10:00AM-12:00PM", "Closed", "Closed", "3:00PM-5:00PM", "Closed", "11:00AM-1:30PM", "http://www.westsidefreestore.org/", "(614) 351-5480", "", westsideFreeStoreMinistriesAddress, goods);
        ohioResourceRepo.save(westsideFreeStoreMinistries);

        Address hilliardFoodPantryAddress = new Address("4410 Cemetery Rd", "", hilliard, franklin, " Ohio", z43206, central);
        addressRepo.save(hilliardFoodPantryAddress);
        OhioResource hilliardFoodPantry = new OhioResource("Hilliard Food Pantry", "Hilliard Food Pantry", "The mission of the Hilliard Food Pantry is simple - improve the well-being of our community by providing food and support.", "Serving All", "Closed", "Closed", "10:00AM-1:00PM", "2:00PM-4:00PM", "6:00PM-8:00PM", "Closed", "9:00AM-1:00PM", "https://www.hilliardfoodpantry.org/", "(614) 363-4159", "", hilliardFoodPantryAddress, food);
        ohioResourceRepo.save(hilliardFoodPantry);

        Address coalitionForTheHomelessAndHousingInOhioFoodDistributionCenterAddress = new Address("35 E Gay St", "", columbus, franklin, " Ohio", z43215, central);
        addressRepo.save(coalitionForTheHomelessAndHousingInOhioFoodDistributionCenterAddress);
        OhioResource coalitionForTheHomelessAndHousingInOhioFoodDistributionCenter = new OhioResource("Coalition For The Homeless And Housing In Ohio - Food Distribution Center", "Coalition For The Homeless And Housing In Ohio - Food Distribution Center", "COHHIO is a coalition of organizations and individuals committed to ending homelessness and to promoting decent, safe, fair, affordable housing for all, with a focus on assisting low-income and special needs populations.", "Serving All", "", "", "", "", "", "", "", "http://www.cohhio.org/", "(614) 280-1984", "", coalitionForTheHomelessAndHousingInOhioFoodDistributionCenterAddress, food, housing);
        ohioResourceRepo.save(coalitionForTheHomelessAndHousingInOhioFoodDistributionCenter);

        Address hopeFoodPantryAddress = new Address("3360 Patriot Blvd", "", columbus, franklin, " Ohio", z43219, central);
        addressRepo.save(hopeFoodPantryAddress);
        OhioResource hopeFoodPantry = new OhioResource("Hope Food Pantry", "Hope Food Pantry", "Above all else, we will be respectful and responsive to our clients and serve them in a caring and sensitive manner.  We value and protect our clients’ privacy and ensure a safe environment for our clients and staff.  We honor our clients’ dignity by offering usable, nutritious food and distributing it in a convenient and equitable manner.", "Serving All", "Closed", "Closed", "Closed", "Closed", "10:00AM-1:30PM", "Closed", "Closed", "http://www.hopefoodpantry.com/", "(614) 316-7030", "", hopeFoodPantryAddress, food);
        ohioResourceRepo.save(hopeFoodPantry);

        Address educationalServiceCenterOfCentralOhioAddress = new Address("2080 Citygate Dr", "", columbus, franklin, " Ohio", z43219, central);
        addressRepo.save(educationalServiceCenterOfCentralOhioAddress);
        OhioResource educationalServiceCenterOfCentralOhio = new OhioResource("Educational Service Center of Central Ohio", "Educational Service Center of Central Ohio", "We respond to the needs of our partners and provide services to support quality educational opportunities for all students.", "Serving All", "Closed", "8:30AM-4:30PM", "8:30AM-4:30PM", "8:30AM-4:30PM", "8:30AM-4:30PM", "8:30AM-4:30PM", "Closed", "https://www.escco.org/", "(614) 445-3750", "", educationalServiceCenterOfCentralOhioAddress, education);
        ohioResourceRepo.save(educationalServiceCenterOfCentralOhio);

        Address columbusCitySchoolsAdultAndCommunityEducationAddress = new Address("2323 Lexington Ave", "", columbus, franklin, "", z43211, central);
        addressRepo.save(columbusCitySchoolsAdultAndCommunityEducationAddress);
        OhioResource columbusCitySchoolsAdultAndCommunityEducation = new OhioResource("Columbus City Schools Adult & Community Education", "Columbus City Schools Adult & Community Education", "Adult and Community Education improves the lives of adult students through personalized, quality learning. ", "Serving All", "Closed", "8:00AM-4:00PM", "8:00AM-4:00PM", "8:00AM-4:00PM", "8:00AM-4:00PM", "8:00AM-4:00PM", "Closed", "http://www.ccsoh.us/ace", "(614) 365-6000", "", columbusCitySchoolsAdultAndCommunityEducationAddress, education);
        ohioResourceRepo.save(columbusCitySchoolsAdultAndCommunityEducation);

        Address ohioCrimeVictimJusticeCenterAddress = new Address("8430 N Hampton Dr", "", columbus, franklin, " Ohio", z43065, central);
        addressRepo.save(ohioCrimeVictimJusticeCenterAddress);
        OhioResource ohioCrimeVictimJusticeCenter = new OhioResource("Ohio Crime Victim Justice Center", "Ohio Crime Victim Justice Center", "We provide free legal assistance to crime victims to protect and enforce their rights.", "Serving All", "Closed", "8:00AM-4:00PM", "8:00AM-4:00PM", "8:00AM-4:00PM", "8:00AM-4:00PM", "8:00AM-4:00PM", "Closed", "http://www.ocvjc.org/", "(614) 848-8500", "", ohioCrimeVictimJusticeCenterAddress, care, legal);
        ohioResourceRepo.save(ohioCrimeVictimJusticeCenter);

        Address seacrestRecoveryCenterOhioAddress = new Address("6555 Busch Blvd Suite 100", "", columbus, franklin, " Ohio", z43229, central);
        addressRepo.save(seacrestRecoveryCenterOhioAddress);
        OhioResource seacrestRecoveryCenterOhio = new OhioResource("Seacrest Recovery Center Ohio", "Seacrest Recovery Center Ohio", "Treatment for drug and alcohol addiction is available at treatment centers throughout Franklin County and surrounding areas. Individuals of all faiths, income levels, educational backgrounds, and cultures can access treatment for a drug or alcohol addiction. Individuals who have low income or no income may enroll in low-cost or free recovery programs run by state and local government and non-profit organizations. ", "Serving All", "24 Hours", "24 Hours", "24 Hours", "24 Hours", "24 Hours", "24 Hours", "24 Hours", "https://seacrestrecoverycenteroh.com/", "(855) 467-3465", "", seacrestRecoveryCenterOhioAddress, care);
        ohioResourceRepo.save(seacrestRecoveryCenterOhio);

        Address greaterClevelandFoodBankAddress = new Address("15500 S Waterloo Rd", "", cleveland, cuyahoga, "Ohio", z44110, central);
        addressRepo.save(greaterClevelandFoodBankAddress);
        OhioResource greaterClevelandFoodBank = new OhioResource("Greater Cleveland Food Bank", "Greater Cleveland Food Bank", "We work to ensure that everyone in our communities have the nutritious food they need every day.", "Serving All", "Closed", "7:00AM-6:00PM", "7:00AM-6:00PM", "7:00AM-6:00PM", "7:00AM-6:00PM", "7:00AM-6:00PM", "Closed", "https://www.greaterclevelandfoodbank.org/", "(216) 738-2265", "", greaterClevelandFoodBankAddress, food);
        ohioResourceRepo.save(greaterClevelandFoodBank);

        Address allFaithsPantryFoodDistributionCenterAddress = new Address("P.O. Box 34239", " ", parma, cuyahoga, " Ohio", z44134, northeast);
        addressRepo.save(allFaithsPantryFoodDistributionCenterAddress);
        OhioResource allFaithsPantryFoodDistributionCenter = new OhioResource("All Faiths Pantry - Food Distribution Center", "All Faiths Pantry - Food Distribution Center", "All Faiths Pantry is a simple, practical program that delivers nutritious groceries to seniors and people with limited mobility once a month at no cost to the recipients. With our direct deliveries to clients’ homes, we are practicing our vision of a community where diverse individuals and groups unite to feed the underserved. ", "Serving All", " ", " ", " ", " ", " ", " ", " ", "https://allfaithspantry.org/", " (216) 496-4329", "", allFaithsPantryFoodDistributionCenterAddress, food);
        ohioResourceRepo.save(allFaithsPantryFoodDistributionCenter);

        Address startingPointAddress = new Address("4600 Euclid Ave.", " ", cleveland, cuyahoga, " Ohio", z44103, northeast);
        addressRepo.save(startingPointAddress);
        OhioResource startingPoint = new OhioResource("Starting Point", "Starting Point", "Starting Point works to enhance early childhood and out-of-school time (OST) experiences. We’re the go-to organization Northeast Ohio families, youth, professionals and community organizations turn to for the resources they need to give children the quality care, learning and activities that lead to success in school and in life.", "Children, Families", "Closed", " 8:30AM-5:30PM", " 8:30AM-5:30PM", " 8:30AM-5:30PM", " 8:30AM-5:30PM", " 8:30AM-5:30PM", "Closed", "http://www.starting-point.org/aboutus.html", "(216) 575-0061", " ", startingPointAddress, education);
        ohioResourceRepo.save(startingPoint);

        Address cuyahogaWitnessVictimServicesAddress = new Address("75 Erieview Plz", " ", cleveland, cuyahoga, " Ohio", z44114, northeast);
        addressRepo.save(cuyahogaWitnessVictimServicesAddress);
        OhioResource cuyahogaWitnessVictimServices = new OhioResource("Cuyahoga Witness-Victim Services", "Cuyahoga Witness-Victim Services", "Since 1974, the Cuyahoga County Witness Victim Service Center has helped victims of crime receive advocacy, information, and access to community services. Ohio law provides victims with specific rights. ", "Serving All", " ", " ", " ", " ", " ", " ", " ", "https://ja.cuyahogacounty.us/en-us/wvsc-new.aspx", "(216) 443-7345", " ", cuyahogaWitnessVictimServicesAddress, care);
        ohioResourceRepo.save(cuyahogaWitnessVictimServices);

        Address namiGreaterClevelandAddress = new Address(" 2012 W 25th St #705", " ", cleveland, cuyahoga, " Ohio", z44113, northeast);
        addressRepo.save(namiGreaterClevelandAddress);
        OhioResource namiGreaterCleveland = new OhioResource("Nami Greater Cleveland", "Nami Greater Cleveland", "NAMI (National Alliance on Mental Illness) Greater Cleveland is dedicated to empowering those living with mental illness and their family members to achieve a better quality of life by providing education, support, information and referral, and advocacy.", "Serving All", "Closed", "9:00AM-5:00PM", "9:00AM-5:00PM", "9:00AM-5:00PM", "9:00AM-5:00PM", "9:00AM-5:00PM", "Closed", "http://namigreatercleveland.org/", "(216) 875-0266", " ", namiGreaterClevelandAddress, care);
        ohioResourceRepo.save(namiGreaterCleveland);

        Address twiceBlessedFreeStoreAddress = new Address("19414 Detroit Road", " ", rockyRiver, cuyahoga, " Ohio", z44116, northeast);
        addressRepo.save(twiceBlessedFreeStoreAddress);
        OhioResource twiceBlessedFreeStore = new OhioResource("Twice Blessed Free Store", "Twice Blessed Free Store", " Twice Blessed, located at our Cleveland Campus at 9900 Madison Ave, is an outreach ministry of our church that provides clothing, household items, and toiletries free of charge to families in need. ", "Serving All", "Closed", "Closed", "Closed", "Closed", "Closed", "Closed", "9:20AM–12PM", "https://www.rrumc.org/twice-blessed/", "440-331-7676", " ", twiceBlessedFreeStoreAddress, goods);
        ohioResourceRepo.save(twiceBlessedFreeStore);

        Address clevelandRightToLifeAddress = new Address("4427 State Rd", "", cleveland, cuyahoga, " Ohio", z44109, northeast);
        addressRepo.save(clevelandRightToLifeAddress);
        OhioResource clevelandRightToLife = new OhioResource("Cleveland Right To Life", "Cleveland Right To Life", "A nonprofit organization that helps mother's with free baby & children items like clothes and diapers and cribs and car seats with a referral from a social service  organization. And they have a great thrift store with lot's of items to buy at cheap prices ", "Serving All", "Closed", "10:00AM-2:00PM", "10:00AM-2:00PM", "10:00AM-2:00PM", "10:00AM-2:00PM", "10:00AM-2:00PM", "10:00AM-2:00PM", "https://clevelandrighttolife.org/", "(216) 661-3000", "", clevelandRightToLifeAddress, goods);
        ohioResourceRepo.save(clevelandRightToLife);

        Address circleHealthServicesAddress = new Address("12201 Euclid Ave", " ", cleveland, cuyahoga, " Ohio", z44106, northeast);
        addressRepo.save(circleHealthServicesAddress);
        OhioResource circleHealthServices = new OhioResource("Circle Health Services", "Circle Health Services", "The Centers serves everyone who comes to see us—regardless of their ability to pay. We have a flexible sliding fee scale for most offerings, and also accept private insurance.", "Serving All", "Closed", "9:00AM-5:00PM", "9:00AM-5:00PM", "9:00AM-5:00PM", "9:00AM-5:00PM", "9:00AM-5:00PM", "Closed", "https://thecentersohio.org/for/health/", "(216) 721-4010", " ", circleHealthServicesAddress, health);
        ohioResourceRepo.save(circleHealthServices);

        Address neighborhoodFamilyPracticeAddress = new Address("11709 Lorain Ave", " ", cleveland, cuyahoga, " Ohio", z44111, northeast);
        addressRepo.save(neighborhoodFamilyPracticeAddress);
        OhioResource neighborhoodFamilyPractice = new OhioResource("Neighborhood Family Practice", "Neighborhood Family Practice", "Our mission is to partner with the community for everyone’s health by providing health care services regardless of ability to pay; treating patients with compassion, dignity and respect; protecting confidentiality; and offering culturally sensitive services and community outreach.", "Serving All", "Closed", "8:30AM-5:00PM", "8:30AM-5:00PM", "8:30AM-5:00PM", "10:30AM-8:00PM", "8:30AM-5:00PM", "Closed", "http://www.nfpmedcenter.org/", " ", " ", neighborhoodFamilyPracticeAddress, health);
        ohioResourceRepo.save(neighborhoodFamilyPractice);

        Address cuyahogaMetropolitanHousingAuthorityAddress = new Address("8120 Kinsman Rd", " ", cleveland, cuyahoga, " Ohio", z44104, northeast);
        addressRepo.save(cuyahogaMetropolitanHousingAuthorityAddress);
        OhioResource cuyahogaMetropolitanHousingAuthority = new OhioResource("Cuyahoga Metropolitan Housing Authority", "Cuyahoga Metropolitan Housing Authority", "Established in 1933 as the first chartered public housing authority in the country, the Cuyahoga Metropolitan Housing Authority (CMHA) owns and manages property and administers rent subsidy programs to provide eligible low-income individuals and families quality, safe, affordable housing in Cuyahoga County.", "Serving All", "Closed", "8:00AM-5:00PM", "8:00AM-5:00PM", "8:00AM-5:00PM", "8:00AM-5:00PM", "8:00AM-5:00PM", "Closed", "http://www.cmha.net/", " ", " ", cuyahogaMetropolitanHousingAuthorityAddress, housing);
        ohioResourceRepo.save(cuyahogaMetropolitanHousingAuthority);

        Address parmaPublicHousingAgencyAddress = new Address("1440 Rockside Rd # 306", "", parma, cuyahoga, " Ohio", z44134, northeast);
        addressRepo.save(parmaPublicHousingAgencyAddress);
        OhioResource parmaPublicHousingAgency = new OhioResource("Parma Public Housing Agency", "Parma Public Housing Agency", "Our goal is to expand housing opportunities for Section 8 families in then areas that have not traditionally participated in the Housing Choice Voucher program. This goal includes improving rental assistance in other quality, well-maintained residential and multi-unit neighborhoods.", "Serving All", "Closed", "8:30AM-4:30PM", "8:30AM-4:30PM", "8:30AM-4:30PM", "8:30AM-4:30PM", "8:30AM-4:30PM", "Closed", "http://cityofparma-oh.gov/en-US/Public-Housing.aspx", "(216) 661-2015", "", parmaPublicHousingAgencyAddress, housing);
        ohioResourceRepo.save(parmaPublicHousingAgency);

        Address theLegalAidSocietyOfClevelandAddress = new Address("1223 W 6th St", "", cleveland, cuyahoga, "Ohio", z44113, northeast);
        addressRepo.save(theLegalAidSocietyOfClevelandAddress);
        OhioResource theLegalAidSocietyOfCleveland = new OhioResource("The Legal Aid Society Of Cleveland", "The Legal Aid Society Of Cleveland", "Legal Aid secures justice and resolves fundamental problems for those who are low income and vulnerable by providing high quality legal services.Legal Aid is free: we never charge clients for services.", " Serving All ", " ", " ", " ", " ", " ", " ", " ", " https://lasclev.org/", "(888) 817-3777", "", theLegalAidSocietyOfClevelandAddress, legal);
        ohioResourceRepo.save(theLegalAidSocietyOfCleveland);

        Address communityLegalAidServicesIncAddress = new Address(" 50 S Main St # 800", "", akron, summit, " Ohio", z44308, northeast);
        addressRepo.save(communityLegalAidServicesIncAddress);
        OhioResource communityLegalAidServicesInc = new OhioResource("Community Legal Aid Services Inc", "Community Legal Aid Services Inc", "A non-profit law firm serving the legal needs of low-income individuals and families in central northeast Ohio", "Serving All", "Closed", "8:30AM-4:30PM", "8:30AM-4:30PM", "8:30AM-4:30PM", "8:30AM-4:30PM", "8:30AM-4:30PM", "Closed", "https://www.communitylegalaid.org/", "", "", communityLegalAidServicesIncAddress, legal);
        ohioResourceRepo.save(communityLegalAidServicesInc);

        Address cuyahogaJobAndFamilyServicesAddress = new Address("1641 Payne Ave", "", cleveland, cuyahoga, " Ohio", z44114, northeast);
        addressRepo.save(cuyahogaJobAndFamilyServicesAddress);
        OhioResource cuyahogaJobAndFamilyServices = new OhioResource("Cuyahoga Job and Family Services", "Cuyahoga Job and Family Services", "Department of Health and Human Services is made up of eight divisions and offices serving babies, children, teens, adults, seniors, and families across Cuyahoga County. Our mission is transforming lives at every age and stage through collaboration, innovation, and service; connecting people with the opportunity to live their best lives.", "Serving All", "Closed", "9:00AM-4:00PM", "9:00AM-4:00PM", "9:00AM-4:00PM", "9:00AM-4:00PM", "9:00AM-4:00PM", "Closed", "https://hhs.cuyahogacounty.us/divisions/detail/job-and-family-services", "(844) 640-6446", "", cuyahogaJobAndFamilyServicesAddress, money);
        ohioResourceRepo.save(cuyahogaJobAndFamilyServices);

        Address seniorTransportationConnectionAddress = new Address("4735 W 150th St A", "", cleveland, cuyahoga, " Ohio", z44135, northeast);
        addressRepo.save(seniorTransportationConnectionAddress);
        OhioResource seniorTransportationConnection = new OhioResource("Senior Transportation Connection", "Senior Transportation Connection", "Senior Transportation Connection (STC) provides coordinated, efficient and affordable transportation to seniors and adults with disabilities throughout Cuyahoga County.", "Serving All", "Closed", "7AM-5:00PM", "7AM-5:00PM", "7AM-5:00PM", "7AM-5:00PM", "7AM-5:00PM", "Closed", "http://ridestc.org/", "(216) 265-1489", "", seniorTransportationConnectionAddress, transit);
        ohioResourceRepo.save(seniorTransportationConnection);

        Address ohioMeansJobsClevelandCuyahogaCountyAddress = new Address("1910 Carnegie Ave", "", cleveland, cuyahoga, " Ohio", z44115, northeast);
        addressRepo.save(ohioMeansJobsClevelandCuyahogaCountyAddress);
        OhioResource ohioMeansJobsClevelandCuyahogaCounty = new OhioResource("OhioMeansJobs|Cleveland-Cuyahoga County", "OhioMeansJobs|Cleveland-Cuyahoga County", "OhioMeansJobs|Cleveland-Cuyahoga County (OMJ|CC) is a collaborative workforce system of the City of Cleveland and Cuyahoga County that helps local employers meet their human capital needs and assists job seekers to find success.", "Serving All", "Closed", "8:00AM-5:00PM", "8:00AM-5:00PM", "8:00AM-5:00PM", "8:00AM-5:00PM", "8:00AM-5:00PM", "Closed", "http://omjcc.us/", "(216) 777-8200", "", ohioMeansJobsClevelandCuyahogaCountyAddress, work);
        ohioResourceRepo.save(ohioMeansJobsClevelandCuyahogaCounty);

        Address AARPSeniorEmploymentServicesAddress = new Address("4614 Prospect Ave E # 211", "", cleveland, cuyahoga, " Ohio", z44103, northeast);
        addressRepo.save(AARPSeniorEmploymentServicesAddress);
        OhioResource AARPSeniorEmploymentServices = new OhioResource("AARP Senior Employment Services", "AARP Senior Employment Services", "This website provides information about their program, as well as articles, tutorials, demos and other resources to help with the job search and hiring process.", "seniors", "", "", "", "", "", "", "", "https://www.clevelandohio.gov/CityofCleveland/Home/Government/CityAgencies/Aging/SeniorEmployment", "(216) 881-1155", "", AARPSeniorEmploymentServicesAddress, work);
        ohioResourceRepo.save(AARPSeniorEmploymentServices);

        Address compassLucasAddress = new Address("111 South Byrne Road", " ", toledo, lucas, " Ohio", z43615, northwest);
        addressRepo.save(compassLucasAddress);
        OhioResource compassLucas = new OhioResource("COMPASS", "COMPASS", "Faith based outpatient mental health and substance use disorder counseling agency. Fully certified by OMHAS and accredited by CARF.", " ", "Closed", "8 AM - 8:30PM", "8 AM - 8:30PM", "8 AM - 8:30PM", "8 AM - 8:30PM", "8 AM - 4 PM", "Closed", "http://www.newconceptsiop.org/index.html", " (419) 531-5544", "English", compassLucasAddress, care, health);
        ohioResourceRepo.save(compassLucas);

        Address foodPantryLucasAddress = new Address("5440 Marshall Road", "", sylvania, lucas, " Ohio", z43560, northwest);
        addressRepo.save(foodPantryLucasAddress);
        OhioResource foodPantryLucas = new OhioResource("Food Pantry", "Sylvania Area Family Services", "Weekly distribution of pre-packed food boxes and a monthly distribution of personal care items.", " ", "Closed", "Closed", "Closed", "Closed", "10:00 AM - 1:00 PM", "Closed", "Closed", "https://sa-fs.org/?page_id=17#food", "(419) 882-8415", "English", foodPantryLucasAddress, food, goods);
        ohioResourceRepo.save(foodPantryLucas);

        Address pregnancySupportServicesLucasAddress = new Address("4041 West Sylvania Avenue", " ", toledo, lucas, " Ohio", z43623, northwest);
        addressRepo.save(pregnancySupportServicesLucasAddress);
        OhioResource pregnancySupportServicesLucas = new OhioResource("Pregnancy Support Services", "Heartbeat Of Toledo", "Offers a variety of free and confidential pregnancy services including baby supplies.", " ", " Closed", "9:00 AM - 5:00 PM", "9:00 AM - 5:00 PM", "9:00 AM - 5:00 PM", "9:00 AM - 5:00 PM", "9:00 AM - 5:00 PM", "Closed", "https://www.heartbeatoftoledo.org/", "(419) 241-9131", "Englilsh", pregnancySupportServicesLucasAddress, goods, care, health);
        ohioResourceRepo.save(pregnancySupportServicesLucas);

        Address homeRepairsLucasAddress = new Address("1310 Conant Street", " ", maumee, lucas, " Ohio", z43537, northwest);
        addressRepo.save(homeRepairsLucasAddress);
        OhioResource homeRepairsLucas = new OhioResource("Home Repairs", "Maumee Valley Habitat For Humanity", "Works to eliminate substandard housing of low-income homeowners to repair and maintain their homes.", " ", "Closed", "9:00 AM - 5:00 PM", "9:00 AM - 5:00 PM", "9:00 AM - 5:00 PM", "9:00 AM - 5:00 PM", "9:00 AM - 5:00 PM", "Closed", "https://www.mvhabitat.org/repairs/repairs/", "(419) 382-1964", "English", homeRepairsLucasAddress, housing);
        ohioResourceRepo.save(homeRepairsLucas);

        ZipCode z43528 = new ZipCode("43528", " ");
        zipCodeRepo.save(z43528);
        Address transportationProgramLucasAddress = new Address("7710 Hill Avenue", " ", holland, lucas, " Ohio", z43528, northwest);
        addressRepo.save(transportationProgramLucasAddress);
        OhioResource transportationProgramLucas = new OhioResource("Transportation Program", "TLC Transit", "Provides a variety of transportation options to meet the needs of virtually any individual or small group in NW Ohio.", " ", " Closed", "8:00 AM - 5:00 PM", "8:00 AM - 5:00 PM", "8:00 AM - 5:00 PM", "8:00 AM - 5:00 PM", "8:00 AM - 5:00 PM", "Closed", "http://www.tlctransit.com/services/", " (419) 861-4000", "English", transportationProgramLucasAddress, transit);
        ohioResourceRepo.save(transportationProgramLucas);

        Address financialcounselingLucasAddress = new Address("525 Jefferson Avenue", " ", toledo, lucas, " Ohio", z43604, northwest);
        addressRepo.save(financialcounselingLucasAddress);
        OhioResource financialcounselingLucas = new OhioResource("Financial Counseling", "The Northwest Ohio Homeownership Development Agency", "One-on-one financial counseling assists families in developing personalized action plans for improving credit, reducing debt, preparing for homeownership, recovering from financial setbacks, and maintaining homeownership.", " ", "Closed", "8:00 AM - 4:00 PM", " 8:00 AM - 4:00 PM", "8:00 AM - 4:00 PM", "8:00 AM - 4:00 PM", "8:00 AM - 4:00 PM", "Closed", "https://areaofficeonaging.com/provider/3512", " (419) 243-3734", "English", financialcounselingLucasAddress, money, housing);
        ohioResourceRepo.save(financialcounselingLucas);

        Address landlordTenantMediationLucasAddress = new Address(" 432 North Superior Street", " ", toledo, lucas, " Ohio", z43064, northwest);
        addressRepo.save(landlordTenantMediationLucasAddress);
        OhioResource landlordTenantMediationLucas = new OhioResource("Landlord-Tenant Mediation", "Fair Housing Center", "Free mediation to residents of Lucas County.", " ", " Closed", "9:00 AM - 5:00 PM", "9:00 AM - 5:00 PM", "9:00 AM - 5:00 PM", "9:00 AM - 5:00 PM", "9:00 AM - 5:00 PM", "Closed", "https://www.toledofhc.org/landlord-tenant-mediation/", " (419) 243-6163", "English", landlordTenantMediationLucasAddress, legal, housing);
        ohioResourceRepo.save(landlordTenantMediationLucas);

        Address fastTrackEmploymentProgramLucasAddress = new Address("3450 Central Avenue", " ", toledo, lucas, " Ohio", z43606, northwest);
        addressRepo.save(fastTrackEmploymentProgramLucasAddress);
        OhioResource fastTrackEmploymentProgramLucas = new OhioResource("Fast Track Employment Program", "US Together", "Provides alternative approach to state-administered resettlement assistance by offering a range of support services for employment.", " ", " Closed", "8:00 AM - 5:00 PM", "8:00 AM - 5:00 PM", "8:00 AM - 5:00 PM", "8:00 AM - 5:00 PM", "8:00 AM - 5:00 PM", "Closed", "https://www.ustogether.us/economic-integration-programs", " (419) 469-2529", "English", fastTrackEmploymentProgramLucasAddress, work);
        ohioResourceRepo.save(fastTrackEmploymentProgramLucas);

        Address parentMentorsLucasAddress = new Address("2275 Collingwood Boulevard", " ", toledo, lucas, " Ohio", z43620, northwest);
        addressRepo.save(parentMentorsLucasAddress);
        OhioResource parentMentorsLucas = new OhioResource("Parent Mentors", "Educational Service Center Of Lake Erie West", "A Parent Mentor is the parent of a child with a disability who is available to help parents of a child suspected of or diagnosed with a disability.", " ", " Closed", "8:00 AM - 5:00 PM", "8:00 AM - 5:00 PM", "8:00 AM - 5:00 PM", "8:00 AM - 5:00 PM", "8:00 AM - 5:00 PM", "Closed", "https://www.esclakeeriewest.org/ParentMentor1.aspx", " (419) 214-3066", "Englsih", parentMentorsLucasAddress, education, care);
        ohioResourceRepo.save(parentMentorsLucas);

    }
}


