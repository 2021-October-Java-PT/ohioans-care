import About from "./components/About.js";
import FilteredResource from "./Components/FilteredResource.js";
import Home from "./components/Home.js";
import Resources from "./Components/Resources.js";
import Search from "./functions/Search.js"
import Services from "./Components/Services.js";
import apiHelpers from "./api-helpers/apiHelpers.js";

const app = document.querySelector("#app");

buildPage();

function buildPage() {
    navHome();

    navAbout();
    navServices();


    renderNorthwest();
    renderNortheast();
    renderCentral();
    renderSouthwest();
    renderSoutheast();

    renderHome();
    renderFood();
    renderHousing();
    renderGoods();
    renderTransit();
    renderHealth();
    renderMoney();
    renderCare();
    renderEducation();
    renderWork();
    renderLegal();
}

function renderHome() {
    app.innerHTML = Home();
    Search();
}

function navHome() {
    const homeBtn = document.querySelector("#homeBtn");
    homeBtn.addEventListener("click", () => {
        app.innerHTML = Home();

        Search();
        navAbout();

    });
}

function navServices() {
    const aboutElem = document.querySelector(".nav-services");
    aboutElem.addEventListener("click", () => {
        app.innerHTML = Services();
    });
}

function navAbout() {
    const aboutElem = document.querySelector(".nav-about");
    aboutElem.addEventListener("click", () => {
        app.innerHTML = About();
    });
}

function renderNorthwest() {
    app.addEventListener("click", (event) => {
        if (event.target.classList.contains("region-nw")) {
            console.log("BUTTON FIRING")
            apiHelpers.getRequest("http://localhost:8080/resources/regions/northwest", (resources) => {
                app.innerHTML = Resources(resources);
                const region = "northwest";
                filterByRegionAndService(region);
            });
        }
    });
}

function renderNortheast() {
    app.addEventListener("click", (event) => {
        if (event.target.classList.contains("region-ne")) {
            apiHelpers.getRequest("http://localhost:8080/resources/regions/northeast", (resources) => {
                app.innerHTML = Resources(resources);
                const region = "northeast";
                filterByRegionAndService(region);
            });
        }
    });
}

function renderCentral() {
    app.addEventListener("click", (event) => {
        if (event.target.classList.contains("region-c")) {
            apiHelpers.getRequest("http://localhost:8080/resources/regions/central", (resources) => {
                app.innerHTML = Resources(resources);
                const region = "central";
                filterByRegionAndService(region);
            });
        }
    });
}

function renderSouthwest() {
    app.addEventListener("click", (event) => {
        if (event.target.classList.contains("region-sw")) {
            apiHelpers.getRequest("http://localhost:8080/resources/regions/southwest", (resources) => {
                app.innerHTML = Resources(resources);
                const region = "southwest";
                filterByRegionAndService(region);
            });
        }
    });
}

function renderSoutheast() {
    app.addEventListener("click", (event) => {
        if (event.target.classList.contains("region-se")) {
            apiHelpers.getRequest("http://localhost:8080/resources/regions/southeast", (resources) => {
                app.innerHTML = Resources(resources);
                const region = "southeast";
                filterByRegionAndService(region);
            });
        }
    });
}


function renderFood() {
    app.addEventListener("click", (event) => {
        if (event.target.classList.contains("food-resources")) {
            apiHelpers.getRequest("http://localhost:8080/resources/services/food", (resources) => {
                app.innerHTML = FilteredResource(resources);
                filterByService();
            });
        }
    });
}

function renderHousing() {
    app.addEventListener("click", (event) => {
        if (event.target.classList.contains("housing-resources")) {
            apiHelpers.getRequest("http://localhost:8080/resources/services/housing", (resources) => {
                app.innerHTML = Resources(resources);
                filterByService();
            });
        }
    });
}

function renderGoods() {
    app.addEventListener("click", (event) => {
        if (event.target.classList.contains("goods-resources")) {
            apiHelpers.getRequest("http://localhost:8080/resources/services/goods", (resources) => {
                app.innerHTML = Resources(resources);
                filterByService();
            });
        }
    });
}

function renderTransit() {
    app.addEventListener("click", (event) => {
        if (event.target.classList.contains("transit-resources")) {
            apiHelpers.getRequest("http://localhost:8080/resources/services/transit", (resources) => {
                app.innerHTML = Resources(resources);
                filterByService();
            });
        }
    });
}

function renderHealth() {
    app.addEventListener("click", (event) => {
        if (event.target.classList.contains("health-resources")) {
            apiHelpers.getRequest("http://localhost:8080/resources/services/health", (resources) => {
                app.innerHTML = Resources(resources);
                filterByService();
            });
        }
    });
}

function renderMoney() {
    app.addEventListener("click", (event) => {
        if (event.target.classList.contains("money-resources")) {
            apiHelpers.getRequest("http://localhost:8080/resources/services/money", (resources) => {
                app.innerHTML = Resources(resources);
                filterByService();
            });
        }
    });
}

function renderCare() {
    app.addEventListener("click", (event) => {
        if (event.target.classList.contains("care-resources")) {
            apiHelpers.getRequest("http://localhost:8080/resources/services/care", (resources) => {
                app.innerHTML = Resources(resources);
                filterByService();
            });
        }
    });
}

function renderEducation() {
    app.addEventListener("click", (event) => {
        if (event.target.classList.contains("education-resources")) {
            apiHelpers.getRequest("http://localhost:8080/resources/services/education", (resources) => {
                app.innerHTML = Resources(resources);
                filterByService();
            });
        }
    });
}

function renderWork() {
    app.addEventListener("click", (event) => {
        if (event.target.classList.contains("work-resources")) {
            apiHelpers.getRequest("http://localhost:8080/resources/services/work", (resources) => {
                app.innerHTML = Resources(resources);
                filterByService();
            });
        }
    });
}

function renderLegal() {
    app.addEventListener("click", (event) => {
        if (event.target.classList.contains("legal-resources")) {
            apiHelpers.getRequest("http://localhost:8080/resources/services/legal", (resources) => {
                app.innerHTML = Resources(resources);
                filterByService();
            });
        }
    });
}

function filterByRegionAndService(region) {
    filterFoodByRegion(region);
    filterRegionByGoods(region);
    filterRegionByHousing(region);
    filterRegionByTransit(region);
    filterRegionByCare(region);
    filterRegionByMoney(region);
    filterRegionByHealth(region);
    filterRegionByEducation(region);
    filterRegionByLegal(region);
    filterRegionByWork(region);
}

function filterFoodByRegion(region) {
    const foodBtn = document.querySelector("input[name=filter-food-resources]");
    foodBtn.addEventListener("change", (event) => {
        
        if (event.target.classList.contains("filter-food-resources")) {
            console.log("BUTTON FIRING");
            apiHelpers.getRequest(`http://localhost:8080/resources/regions/${region}/services/food`, (resources) => {
                app.innerHTML = FilteredResource(resources);
                filterByRegionAndService(region);
            });
        }
    })
}

function filterRegionByGoods(region) {
    const foodBtn = document.querySelector("input[name=filter-goods-resources]");
    foodBtn.addEventListener("change", (event) => {

        if (event.target.classList.contains("filter-goods-resources")) {
            apiHelpers.getRequest(`http://localhost:8080/resources/regions/${region}/services/goods`, (resources) => {
                app.innerHTML = FilteredResource(resources);
                filterByRegionAndService(region);
            });
        }
    })
}

function filterRegionByHousing(region) {
    const foodBtn = document.querySelector("input[name=filter-housing-resources]");
    foodBtn.addEventListener("change", (event) => {

        if (event.target.classList.contains("filter-housing-resources")) {
            apiHelpers.getRequest(`http://localhost:8080/resources/regions/${region}/services/housing`, (resources) => {
                app.innerHTML = FilteredResource(resources);
                filterByRegionAndService(region);
            });
        }
    })
}

function filterRegionByTransit(region) {
    const foodBtn = document.querySelector("input[name=filter-transit-resources]");
    foodBtn.addEventListener("change", (event) => {

        if (event.target.classList.contains("filter-transit-resources")) {
            apiHelpers.getRequest(`http://localhost:8080/resources/regions/${region}/services/transit`, (resources) => {
                app.innerHTML = FilteredResource(resources);
                filterByRegionAndService(region);
            });
        }
    })
}

function filterRegionByCare(region) {
    const foodBtn = document.querySelector("input[name=filter-care-resources]");
    foodBtn.addEventListener("change", (event) => {

        if (event.target.classList.contains("filter-care-resources")) {
            apiHelpers.getRequest(`http://localhost:8080/resources/regions/${region}/services/care`, (resources) => {
                app.innerHTML = FilteredResource(resources);
                filterByRegionAndService(region);
            });
        }
    })
}

function filterRegionByMoney(region) {
    const foodBtn = document.querySelector("input[name=filter-money-resources]");
    foodBtn.addEventListener("change", (event) => {

        if (event.target.classList.contains("filter-money-resources")) {
            apiHelpers.getRequest(`http://localhost:8080/resources/regions/${region}/services/money`, (resources) => {
                app.innerHTML = FilteredResource(resources);
                filterByRegionAndService(region);
            });
        }
    })
}

function filterRegionByHealth(region) {
    const foodBtn = document.querySelector("input[name=filter-health-resources]");
    foodBtn.addEventListener("change", (event) => {

        if (event.target.classList.contains("filter-health-resources")) {
            apiHelpers.getRequest(`http://localhost:8080/resources/regions/${region}/services/health`, (resources) => {
                app.innerHTML = FilteredResource(resources);
                filterByRegionAndService(region);
            });
        }
    })
}

function filterRegionByEducation(region) {
    const foodBtn = document.querySelector("input[name=filter-education-resources]");
    foodBtn.addEventListener("change", (event) => {


        if (event.target.classList.contains("filter-education-resources")) {
            apiHelpers.getRequest(`http://localhost:8080/resources/regions/${region}/services/education`, (resources) => {
                app.innerHTML = FilteredResource(resources);
                filterByRegionAndService(region);
            });
        }
    })
}

function filterRegionByLegal(region) {
    const foodBtn = document.querySelector("input[name=filter-legal-resources]");
    foodBtn.addEventListener("change", (event) => {

        if (event.target.classList.contains("filter-legal-resources")) {
            apiHelpers.getRequest(`http://localhost:8080/resources/regions/${region}/services/legal`, (resources) => {
                app.innerHTML = FilteredResource(resources);
                filterByRegionAndService(region);
            });
        }
    })
}


function filterRegionByWork(region) {
    const foodBtn = document.querySelector("input[name=filter-work-resources]");
    foodBtn.addEventListener("change", (event) => {

        if (event.target.classList.contains("filter-work-resources")) {
            apiHelpers.getRequest(`http://localhost:8080/resources/regions/${region}/services/work`, (resources) => {
                app.innerHTML = FilteredResource(resources);
                filterByRegionAndService(region);
            });
        }
    })
}