import About from "./components/About.js";
import FiltersApp from "./components/FiltersApp.js";
import Home from "./components/Home.js";
import OhioResources from "./components/OhioResources.js"
import Services from "./components/Services.js";
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

function Search() {
  const app = document.querySelector("#app");
  const searchBar = document.getElementById("search-bar");
  const searchSubmitBtn = document.getElementById("search-submit-btn");

  searchSubmitBtn.addEventListener("click", () => {
    const searchString = searchBar.value;
    console.log(searchString);
    apiHelpers.getRequest(`http://localhost:8080/resources/resource-by-location/${searchString}`, (resources) => {
      console.log(resources)
      app.innerHTML = FiltersApp();
      const resourcesContainer = document.getElementById("resource-container");
      resourcesContainer.innerHTML = OhioResources(resources);
      filterResourcesByService(resources, resourcesContainer);
    });
  });

  window.addEventListener("keydown", function (event) {
    if (event.defaultPrevented) {
      return;
    }

    switch (event.key) {
      case "Enter":
        const searchString = searchBar.value;
        console.log(searchString);
        apiHelpers.getRequest(`http://localhost:8080/resources/resource-by-location/${searchString}`, (resources) => {
          console.log(resources)
          app.innerHTML = FiltersApp();
          const resourcesContainer = document.getElementById("resource-container");
          resourcesContainer.innerHTML = OhioResources(resources);
          filterResourcesByService(resources, resourcesContainer);
        });
        break;

      default:
        return;
    }

    event.preventDefault();
  }, true);
}

function renderNorthwest() {
  app.addEventListener("click", (event) => {
    if (event.target.classList.contains("region-nw")) {
      apiHelpers.getRequest("http://localhost:8080/resources/regions/northwest", (resources) => {
        app.innerHTML = FiltersApp();
        const resourcesContainer = document.getElementById("resource-container");
        resourcesContainer.innerHTML = OhioResources(resources);
        filterResourcesByService(resources, resourcesContainer);
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
        filterResourcesByService(resources, resourcesContainer);
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
        filterResourcesByService(resources, resourcesContainer);
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
        filterResourcesByService(resources, resourcesContainer);
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
        filterResourcesByService(resources, resourcesContainer);
      });
    }
  });
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