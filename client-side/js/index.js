import About from "./Components/About.js";
import FiltersApp from "./Components/FiltersApp.js";
import Home from "./Components/Home.js";
import OhioResources from "./Components/OhioResources.js"
import Resources from "./Components/Resources.js";
import Search from "./functions/Search.js"
import Services from "./Components/Services.js";
import apiHelpers from "./api-helpers/apiHelpers.js";
;

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
            apiHelpers.getRequest("http://localhost:8080/resources/regions/northwest", (resources) => {
                app.innerHTML = FiltersApp();
                const resourcesContainer = document.getElementById("resource-container");
                resourcesContainer.innerHTML = OhioResources(resources);
                const location = "northwest";
                filterByLocationAndService(location);
            });
        }
    });
}

function renderNortheast() {
    app.addEventListener("click", (event) => {
        if (event.target.classList.contains("region-ne")) {
            apiHelpers.getRequest("http://localhost:8080/resources/regions/northeast", (resources) => {
                app.innerHTML = FiltersApp();
                const resourcesContainer = document.getElementById("resource-container");
                resourcesContainer.innerHTML = OhioResources(resources);
                const location = "northeast";
                filterByLocationAndService(location);
            });
        }
    });
}

function renderCentral() {
    app.addEventListener("click", (event) => {
        if (event.target.classList.contains("region-c")) {
            apiHelpers.getRequest("http://localhost:8080/resources/regions/central", (resources) => {
                app.innerHTML = FiltersApp();
                const resourcesContainer = document.getElementById("resource-container");
                resourcesContainer.innerHTML = OhioResources(resources);
                const location = "central";
                filterByLocationAndService(location);
            });
        }
    });
}

function renderSouthwest() {
    app.addEventListener("click", (event) => {
        if (event.target.classList.contains("region-sw")) {
            apiHelpers.getRequest("http://localhost:8080/resources/regions/southwest", (resources) => {
                app.innerHTML = FiltersApp();
                const resourcesContainer = document.getElementById("resource-container");
                resourcesContainer.innerHTML = OhioResources(resources);
                const location = "southwest";
                filterByLocationAndService(location);
            });
        }
    });
}

function renderSoutheast() {
    app.addEventListener("click", (event) => {
        if (event.target.classList.contains("region-se")) {
            apiHelpers.getRequest("http://localhost:8080/resources/regions/southeast", (resources) => {
                app.innerHTML = FiltersApp();
                const resourcesContainer = document.getElementById("resource-container");
                resourcesContainer.innerHTML = OhioResources(resources);
                const location = "southeast";
                // filterByLocationAndService(location);
                filterResourcesByService(resources, resourcesContainer);
            });
        }
    });
}

function filterResourcesByService(resources, resourcesContainer) {
    let filteredResources = []
    const filterBtn = document.querySelector("#filter-btn");
    const careCheckBox = document.querySelector("#filter-care-resources");
    const educationCheckBox = document.querySelector("#filter-education-resources");
    const foodCheckBox = document.querySelector("#filter-food-resources");
    const goodsCheckBox = document.querySelector("#filter-goods-resources");
    const healthCheckBox = document.querySelector("#filter-health-resources");
    const housingCheckBox = document.querySelector("#filter-housing-resources");
    const legalCheckBox = document.querySelector("#filter-legal-resources");
    const moneyCheckBox = document.querySelector("#filter-money-resources");
    const transitCheckBox = document.querySelector("#filter-transit-resources");
    const workCheckBox = document.querySelector("#filter-work-resources");
    let care = "";
    let food = "";
    let education = "";
    let goods = "";
    let health = "";
    let housing = "";
    let legal = "";
    let money = "";
    let transit = "";
    let work = "";

    filterBtn.addEventListener("click", (event) => {
        if (careCheckBox.checked) {
            care = "care";
        } else {
            care = "";
        }
        if (educationCheckBox.checked) {
            education = "education";
        } else {
            education = "";
        }
        if (foodCheckBox.checked) {
            food = "food";
        } else {
            food = "";
        }
        if (goodsCheckBox.checked) {
            goods = "goods";
        } else {
            goods = "";
        }
        if (healthCheckBox.checked) {
            health = "health";
        } else {
            health = "";
        }
        if (housingCheckBox.checked) {
            housing = "housing";
        } else {
            housing = "";
        }
        if (legalCheckBox.checked) {
            legal = "legal";
        } else {
            legal = "";
        }
        if (moneyCheckBox.checked) {
            money = "money";
        } else {
            money = "";
        }
        if (transitCheckBox.checked) {
            transit = "transit";
        } else {
            transit = "";
        }
        if (workCheckBox.checked) {
            work = "work";
        } else {
            work = "";
        }
        resources.map(resource => {
            resource.services.map(service => {
                if (service.service.toLocaleLowerCase() === care ||
                    service.service.toLocaleLowerCase() === education ||
                    service.service.toLocaleLowerCase() === food ||
                    service.service.toLocaleLowerCase() === goods ||
                    service.service.toLocaleLowerCase() === health ||
                    service.service.toLocaleLowerCase() === housing ||
                    service.service.toLocaleLowerCase() === legal ||
                    service.service.toLocaleLowerCase() === money ||
                    service.service.toLocaleLowerCase() === transit ||
                    service.service.toLocaleLowerCase() === work) {
                    filteredResources.push(resource);
                }
            })
        })
        console.log(filteredResources);
        resourcesContainer.innerHTML = OhioResources(filteredResources.length ? filteredResources : resources);
        filteredResources = [];
    })
}

function renderFood() {
    app.addEventListener("click", (event) => {
        if (event.target.classList.contains("food-resources")) {
            apiHelpers.getRequest("http://localhost:8080/resources/services/food", (resources) => {
                app.innerHTML = FiltersApp();
                const resourcesContainer = document.getElementById("resource-container");
                resourcesContainer.innerHTML = OhioResources(resources);
                filterResourcesByService(resources, resourcesContainer);
            });
        }
    });
}

function renderHousing() {
    app.addEventListener("click", (event) => {
        if (event.target.classList.contains("housing-resources")) {
            apiHelpers.getRequest("http://localhost:8080/resources/services/housing", (resources) => {
                app.innerHTML = FiltersApp();
                const resourcesContainer = document.getElementById("resource-container");
                resourcesContainer.innerHTML = OhioResources(resources);
                filterResourcesByService(resources, resourcesContainer);
            });
        }
    });
}

function renderGoods() {
    app.addEventListener("click", (event) => {
        if (event.target.classList.contains("goods-resources")) {
            apiHelpers.getRequest("http://localhost:8080/resources/services/goods", (resources) => {
                app.innerHTML = FiltersApp();
                const resourcesContainer = document.getElementById("resource-container");
                resourcesContainer.innerHTML = OhioResources(resources);
                filterResourcesByService(resources, resourcesContainer);
                filterFood();
            });
        }
    });
}

function renderTransit() {
    app.addEventListener("click", (event) => {
        if (event.target.classList.contains("transit-resources")) {
            apiHelpers.getRequest("http://localhost:8080/resources/services/transit", (resources) => {
                app.innerHTML = FiltersApp();
                const resourcesContainer = document.getElementById("resource-container");
                resourcesContainer.innerHTML = OhioResources(resources);
                filterResourcesByService(resources, resourcesContainer);
            });
        }
    });
}

function renderHealth() {
    app.addEventListener("click", (event) => {
        if (event.target.classList.contains("health-resources")) {
            apiHelpers.getRequest("http://localhost:8080/resources/services/health", (resources) => {
                app.innerHTML = FiltersApp();
                const resourcesContainer = document.getElementById("resource-container");
                resourcesContainer.innerHTML = OhioResources(resources);
                filterResourcesByService(resources, resourcesContainer);
            });
        }
    });
}

function renderMoney() {
    app.addEventListener("click", (event) => {
        if (event.target.classList.contains("money-resources")) {
            apiHelpers.getRequest("http://localhost:8080/resources/services/money", (resources) => {
                app.innerHTML = FiltersApp();
                const resourcesContainer = document.getElementById("resource-container");
                resourcesContainer.innerHTML = OhioResources(resources);
                filterResourcesByService(resources, resourcesContainer);
            });
        }
    });
}

function renderCare() {
    app.addEventListener("click", (event) => {
        if (event.target.classList.contains("care-resources")) {
            apiHelpers.getRequest("http://localhost:8080/resources/services/care", (resources) => {
                app.innerHTML = FiltersApp();
                const resourcesContainer = document.getElementById("resource-container");
                resourcesContainer.innerHTML = OhioResources(resources);
                filterResourcesByService(resources, resourcesContainer);
            });
        }
    });
}

function renderEducation() {
    app.addEventListener("click", (event) => {
        if (event.target.classList.contains("education-resources")) {
            apiHelpers.getRequest("http://localhost:8080/resources/services/education", (resources) => {
                app.innerHTML = FiltersApp();
                const resourcesContainer = document.getElementById("resource-container");
                resourcesContainer.innerHTML = OhioResources(resources);
                filterResourcesByService(resources, resourcesContainer);
            });
        }
    });
}

function renderWork() {
    app.addEventListener("click", (event) => {
        if (event.target.classList.contains("work-resources")) {
            apiHelpers.getRequest("http://localhost:8080/resources/services/work", (resources) => {
                app.innerHTML = FiltersApp();
                const resourcesContainer = document.getElementById("resource-container");
                resourcesContainer.innerHTML = OhioResources(resources);
                filterResourcesByService(resources, resourcesContainer);
            });
        }
    });
}

function renderLegal() {
    app.addEventListener("click", (event) => {
        if (event.target.classList.contains("legal-resources")) {
            apiHelpers.getRequest("http://localhost:8080/resources/services/legal", (resources) => {
                app.innerHTML = FiltersApp();
                const resourcesContainer = document.getElementById("resource-container");
                resourcesContainer.innerHTML = OhioResources(resources);
                filterResourcesByService(resources, resourcesContainer);
            });
        }
    });
}

// function filterByLocationAndService(location) {
//     filterLocationByFood(location);
//     filterLocationByGoods(location);
//     filterLocationByHousing(location);
//     filterLocationByTransit(location);
//     filterLocationByCare(location);
//     filterLocationByMoney(location);
//     filterLocationByHealth(location);
//     filterLocationByEducation(location);
//     filterLocationByLegal(location);
//     filterLocationByWork(location);
// }



// function filterLocationByFood(location) {
//     const foodBtn = document.querySelector("input[name=filter-food-resources]");
//     foodBtn.addEventListener("change", (event) => {

//         if (event.target.classList.contains("filter-food-resources")) {
//             apiHelpers.getRequest(`http://localhost:8080/resources/regions/${location}/services/food`, (resources) => {
//                 const resourcesContainer = document.getElementById("resource-container");
//                 resourcesContainer.innerHTML = OhioResources(resources);
//                 filterByLocationAndService(location);
//             });
//         }
//     })
// }

// function filterLocationByGoods(location) {
//     const foodBtn = document.querySelector("input[name=filter-goods-resources]");
//     foodBtn.addEventListener("change", (event) => {

//         if (event.target.classList.contains("filter-goods-resources")) {
//             apiHelpers.getRequest(`http://localhost:8080/resources/regions/${location}/services/goods`, (resources) => {
//                 const resourcesContainer = document.getElementById("resource-container");
//                 resourcesContainer.innerHTML = OhioResources(resources);
//                 filterByLocationAndService(location);
//             });
//         }
//     })
// }

// function filterLocationByHousing(location) {
//     const foodBtn = document.querySelector("input[name=filter-housing-resources]");
//     foodBtn.addEventListener("change", (event) => {

//         if (event.target.classList.contains("filter-housing-resources")) {
//             apiHelpers.getRequest(`http://localhost:8080/resources/regions/${location}/services/housing`, (resources) => {
//                 const resourcesContainer = document.getElementById("resource-container");
//                 resourcesContainer.innerHTML = OhioResources(resources);
//                 filterByLocationAndService(location);
//             });
//         }
//     })
// }

// function filterLocationByTransit(location) {
//     const foodBtn = document.querySelector("input[name=filter-transit-resources]");
//     foodBtn.addEventListener("change", (event) => {

//         if (event.target.classList.contains("filter-transit-resources")) {
//             apiHelpers.getRequest(`http://localhost:8080/resources/regions/${location}/services/transit`, (resources) => {
//                 const resourcesContainer = document.getElementById("resource-container");
//                 resourcesContainer.innerHTML = OhioResources(resources);
//                 filterByLocationAndService(location);
//             });
//         }
//     })
// }

// function filterLocationByCare(location) {
//     const foodBtn = document.querySelector("input[name=filter-care-resources]");
//     foodBtn.addEventListener("change", (event) => {

//         if (event.target.classList.contains("filter-care-resources")) {
//             apiHelpers.getRequest(`http://localhost:8080/resources/regions/${location}/services/care`, (resources) => {
//                 const resourcesContainer = document.getElementById("resource-container");
//                 resourcesContainer.innerHTML = OhioResources(resources);
//                 filterByLocationAndService(location);
//             });
//         }
//     })
// }

// function filterLocationByMoney(location) {
//     const foodBtn = document.querySelector("input[name=filter-money-resources]");
//     foodBtn.addEventListener("change", (event) => {

//         if (event.target.classList.contains("filter-money-resources")) {
//             apiHelpers.getRequest(`http://localhost:8080/resources/regions/${location}/services/money`, (resources) => {
//                 const resourcesContainer = document.getElementById("resource-container");
//                 resourcesContainer.innerHTML = OhioResources(resources);
//                 filterByLocationAndService(location);
//             });
//         }
//     })
// }

// function filterLocationByHealth(location) {
//     const foodBtn = document.querySelector("input[name=filter-health-resources]");
//     foodBtn.addEventListener("change", (event) => {

//         if (event.target.classList.contains("filter-health-resources")) {
//             apiHelpers.getRequest(`http://localhost:8080/resources/regions/${location}/services/health`, (resources) => {
//                 const resourcesContainer = document.getElementById("resource-container");
//                 resourcesContainer.innerHTML = OhioResources(resources);
//                 filterByLocationAndService(location);
//             });
//         }
//     })
// }

// function filterLocationByEducation(location) {
//     const foodBtn = document.querySelector("input[name=filter-education-resources]");
//     foodBtn.addEventListener("change", (event) => {


//         if (event.target.classList.contains("filter-education-resources")) {
//             apiHelpers.getRequest(`http://localhost:8080/resources/regions/${location}/services/education`, (resources) => {
//                 const resourcesContainer = document.getElementById("resource-container");
//                 resourcesContainer.innerHTML = OhioResources(resources);
//                 filterByLocationAndService(location);
//             });
//         }
//     })
// }

// function filterLocationByLegal(location) {
//     const foodBtn = document.querySelector("input[name=filter-legal-resources]");
//     foodBtn.addEventListener("change", (event) => {

//         if (event.target.classList.contains("filter-legal-resources")) {
//             apiHelpers.getRequest(`http://localhost:8080/resources/regions/${location}/services/legal`, (resources) => {
//                 const resourcesContainer = document.getElementById("resource-container");
//                 resourcesContainer.innerHTML = OhioResources(resources);
//                 filterByLocationAndService(location);
//             });
//         }
//     })
// }


// function filterLocationByWork(location) {
//     const foodBtn = document.querySelector("input[name=filter-work-resources]");
//     foodBtn.addEventListener("change", (event) => {

//         if (event.target.classList.contains("filter-work-resources")) {
//             apiHelpers.getRequest(`http://localhost:8080/resources/regions/${location}/services/work`, (resources) => {
//                 const resourcesContainer = document.getElementById("resource-container");
//                 resourcesContainer.innerHTML = OhioResources(resources);
//                 filterByLocationAndService(location);
//             });
//         }
//     })
// }