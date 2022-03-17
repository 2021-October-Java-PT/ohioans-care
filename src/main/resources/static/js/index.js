import About from "./Components/About.js";
import AddResource from "./Components/AddResource.js";
import Contact from "./Components/Contact.js";
import FiltersApp from "./Components/FiltersApp.js";
import Home from "./Components/Home.js";
import OhioResources from "./Components/OhioResources.js";
import PrivacyPolicy from "./Components/PrivacyPolicy.js";
import Services from "./Components/Services.js";
import UserProfile from "./Components/Profile.js";
import apiHelpers from "./api-helpers/apiHelpers.js";

const app = document.querySelector("#app");
let isLoggedIn = false;
let activeUserProfile = {
  firstName: "",
  zipCode: "",
  resources: [],
};

buildPage();

function buildPage() {
  navHome();

  navAbout();
  navServices();
  navContact();
  navPrivacyPolicy();

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

  navProfileLoginMenu();
  !isLoggedIn && userLogin();
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
  });
}

function navServices() {
  const servicesHeaderElem = document.querySelector(".nav-services");
  const servicesFooterElem = document.querySelector(".services-footer-link")

  servicesHeaderElem.addEventListener("click", () => {
    app.innerHTML = Services();
  });

  servicesFooterElem.addEventListener("click", () => {
    app.innerHTML = Services();
  });
}

function navAbout() {
  const aboutHeaderElem = document.querySelector(".nav-about");
  const aboutFooterElem = document.querySelector(".about-footer-link")

  aboutHeaderElem.addEventListener("click", () => {
    app.innerHTML = About();
  });

  aboutFooterElem.addEventListener("click", () => {
    app.innerHTML = About();
  });
}

function navPrivacyPolicy() {
  const aboutElem = document.querySelector(".privacy-policy-footer-link");

  aboutElem.addEventListener("click", () => {
    app.innerHTML = PrivacyPolicy();
  });
}

function navContact() {
  const contactHeaderElem = document.querySelector(".nav-contact");
  const contactFooterElem = document.querySelector(".contact-footer-elem");

  contactHeaderElem.addEventListener("click", () => {
    app.innerHTML = Contact();
    navResourceForm();
  });

  contactFooterElem.addEventListener("click", () => {
    app.innerHTML = Contact();
    navResourceForm();
  });
}

function navResourceForm() {
  const resourceBtn = document.querySelector(".btn-danger");

  resourceBtn.addEventListener("click", () => {
    app.innerHTML = AddResource();
  });
}

function navProfileLoginMenu() {
  const profileBtn = document.querySelector("#profileBtn");

  profileBtn.addEventListener("click", () => {
    if (isLoggedIn) {
      app.innerHTML = UserProfile(activeUserProfile);
    } else {
      document.getElementById("userId01").style.display = "block";
    }
  });
}

function userLogin() {
  const userName = document.querySelector("#userName");
  const userLoginBtn = document.querySelector("#loginBtn");

  userLoginBtn.addEventListener("click", () => {
    const userNameValue = userName.value;
    apiHelpers.getRequest(`http://ohioanscare-demo.herokuapp.com/api/users/${userNameValue}`, (userProfile) => {
      checkIfUserLoggedIn(userProfile)
    });
  });
}

function checkIfUserLoggedIn(userProfile) {
  isLoggedIn = true;
  activeUserProfile = userProfile;
  var modal = document.getElementById("userId01");

  modal.style.display = "none";
  app.innerHTML = UserProfile(userProfile);
}

function Search() {
  const app = document.querySelector("#app");
  const searchBar = document.getElementById("search-bar");
  const searchSubmitBtn = document.getElementById("search-submit-btn");

  searchSubmitBtn.addEventListener("click", () => {
    const searchString = searchBar.value;
    console.log(searchString);
    apiHelpers.getRequest(`http://ohioanscare-demo.herokuapp.com/resources/resource-by-location/${searchString}`, (resources) => {
      console.log(resources);
      app.innerHTML = FiltersApp();
      const resourcesContainer = document.getElementById("resource-container");
      resourcesContainer.innerHTML = OhioResources(resources);
      filterResourcesByService(resources, resourcesContainer);
      FilterSearch();
    });
  });

  window.addEventListener(
    "keydown",
    function (event) {
      if (event.defaultPrevented) {
        return;
      }

      switch (event.key) {
        case "Enter":
          const searchString = searchBar.value;
          console.log(searchString);
          apiHelpers.getRequest(`http://ohioanscare-demo.herokuapp.com/resources/resource-by-location/${searchString}`, (resources) => {
            console.log(resources);
            app.innerHTML = FiltersApp();
            const resourcesContainer = document.getElementById("resource-container");
            resourcesContainer.innerHTML = OhioResources(resources);
            filterResourcesByService(resources, resourcesContainer);
            FilterSearch();
          });
          break;

        default:
          return;
      }

      event.preventDefault();
    },
    true
  );
}

function FilterSearch() {
  const searchBar = document.getElementById("search-bar");
  const searchSubmitBtn = document.getElementById("search-submit-btn");

  searchSubmitBtn.addEventListener("click", () => {
    const searchString = searchBar.value;
    console.log(searchString);
    apiHelpers.getRequest(`http://ohioanscare-demo.herokuapp.com/resources/resource-by-location/${searchString}`, (resources) => {
      console.log(resources);
      const resourcesContainer = document.getElementById("resource-container");
      resourcesContainer.innerHTML = OhioResources(resources);
      filterResourcesByService(resources, resourcesContainer);
    });
  });

  window.addEventListener(
    "keydown",
    function (event) {
      if (event.defaultPrevented) {
        return;
      }

      switch (event.key) {
        case "Enter":
          const searchString = searchBar.value;
          console.log(searchString);
          apiHelpers.getRequest(`http://ohioanscare-demo.herokuapp.com/resources/resource-by-location/${searchString}`, (resources) => {
            console.log(resources);
            const resourcesContainer = document.getElementById("resource-container");
            resourcesContainer.innerHTML = OhioResources(resources);
            filterResourcesByService(resources, resourcesContainer);
          });
          break;

        default:
          return;
      }

      event.preventDefault();
    },
    true
  );
}

function renderNorthwest() {
  app.addEventListener("click", (event) => {
    if (event.target.classList.contains("region-nw")) {
      apiHelpers.getRequest("http://ohioanscare-demo.herokuapp.com/resources/regions/northwest", (resources) => {
        app.innerHTML = FiltersApp();
        const resourcesContainer = document.getElementById("resource-container");
        resourcesContainer.innerHTML = OhioResources(resources);
        filterResourcesByService(resources, resourcesContainer);
        FilterSearch();
      });
    }
  });
}

function renderNortheast() {
  app.addEventListener("click", (event) => {
    if (event.target.classList.contains("region-ne")) {
      apiHelpers.getRequest("http://ohioanscare-demo.herokuapp.com/resources/regions/northeast", (resources) => {
        app.innerHTML = FiltersApp();
        const resourcesContainer = document.getElementById("resource-container");
        resourcesContainer.innerHTML = OhioResources(resources);
        filterResourcesByService(resources, resourcesContainer);
        FilterSearch();
      });
    }
  });
}

function renderCentral() {
  app.addEventListener("click", (event) => {
    if (event.target.classList.contains("region-c")) {
      apiHelpers.getRequest("http://ohioanscare-demo.herokuapp.com/resources/regions/central", (resources) => {
        app.innerHTML = FiltersApp();
        const resourcesContainer = document.getElementById("resource-container");
        resourcesContainer.innerHTML = OhioResources(resources);
        filterResourcesByService(resources, resourcesContainer);
        FilterSearch();
      });
    }
  });
}

function renderSouthwest() {
  app.addEventListener("click", (event) => {
    if (event.target.classList.contains("region-sw")) {
      apiHelpers.getRequest("http://ohioanscare-demo.herokuapp.com/resources/regions/southwest", (resources) => {
        app.innerHTML = FiltersApp();
        const resourcesContainer = document.getElementById("resource-container");
        resourcesContainer.innerHTML = OhioResources(resources);
        filterResourcesByService(resources, resourcesContainer);
        FilterSearch();
      });
    }
  });
}

function renderSoutheast() {
  app.addEventListener("click", (event) => {
    if (event.target.classList.contains("region-se")) {
      apiHelpers.getRequest("http://ohioanscare-demo.herokuapp.com/resources/regions/southeast", (resources) => {
        app.innerHTML = FiltersApp();
        const resourcesContainer = document.getElementById("resource-container");
        resourcesContainer.innerHTML = OhioResources(resources);
        filterResourcesByService(resources, resourcesContainer);
        FilterSearch();
      });
    }
  });
}

function renderFood() {
  app.addEventListener("click", (event) => {
    if (event.target.classList.contains("food-resources")) {
      apiHelpers.getRequest("https://ohioanscare-demo.herokuapp.com/services/food", (resources) => {
        app.innerHTML = FiltersApp();
        const resourcesContainer = document.getElementById("resource-container");
        resourcesContainer.innerHTML = OhioResources(resources);
        filterResourcesByService(resources, resourcesContainer);
        FilterSearch();
      });
    }
  });
}

function renderHousing() {
  app.addEventListener("click", (event) => {
    if (event.target.classList.contains("housing-resources")) {
      apiHelpers.getRequest("https://ohioanscare-demo.herokuapp.com/resources/services/housing", (resources) => {
        app.innerHTML = FiltersApp();
        const resourcesContainer = document.getElementById("resource-container");
        resourcesContainer.innerHTML = OhioResources(resources);
        filterResourcesByService(resources, resourcesContainer);
        FilterSearch();
      });
    }
  });
}

function renderGoods() {
  app.addEventListener("click", (event) => {
    if (event.target.classList.contains("goods-resources")) {
      apiHelpers.getRequest("https://ohioanscare-demo.herokuapp.com/services/goods", (resources) => {
        app.innerHTML = FiltersApp();
        const resourcesContainer = document.getElementById("resource-container");
        resourcesContainer.innerHTML = OhioResources(resources);
        filterResourcesByService(resources, resourcesContainer);
        FilterSearch();
      });
    }
  });
}

function renderTransit() {
  app.addEventListener("click", (event) => {
    if (event.target.classList.contains("transit-resources")) {
      apiHelpers.getRequest("https://ohioanscare-demo.herokuapp.com/services/transit", (resources) => {
        app.innerHTML = FiltersApp();
        const resourcesContainer = document.getElementById("resource-container");
        resourcesContainer.innerHTML = OhioResources(resources);
        filterResourcesByService(resources, resourcesContainer);
        FilterSearch();
      });
    }
  });
}

function renderHealth() {
  app.addEventListener("click", (event) => {
    if (event.target.classList.contains("health-resources")) {
      apiHelpers.getRequest("https://ohioanscare-demo.herokuapp.com/services/health", (resources) => {
        app.innerHTML = FiltersApp();
        const resourcesContainer = document.getElementById("resource-container");
        resourcesContainer.innerHTML = OhioResources(resources);
        filterResourcesByService(resources, resourcesContainer);
        FilterSearch();
      });
    }
  });
}

function renderMoney() {
  app.addEventListener("click", (event) => {
    if (event.target.classList.contains("money-resources")) {
      apiHelpers.getRequest("https://ohioanscare-demo.herokuapp.com/services/money", (resources) => {
        app.innerHTML = FiltersApp();
        const resourcesContainer = document.getElementById("resource-container");
        resourcesContainer.innerHTML = OhioResources(resources);
        filterResourcesByService(resources, resourcesContainer);
        FilterSearch();
      });
    }
  });
}

function renderCare() {
  app.addEventListener("click", (event) => {
    if (event.target.classList.contains("care-resources")) {
      apiHelpers.getRequest("https://ohioanscare-demo.herokuapp.com/services/care", (resources) => {
        app.innerHTML = FiltersApp();
        const resourcesContainer = document.getElementById("resource-container");
        resourcesContainer.innerHTML = OhioResources(resources);
        filterResourcesByService(resources, resourcesContainer);
        FilterSearch();
      });
    }
  });
}

function renderEducation() {
  app.addEventListener("click", (event) => {
    if (event.target.classList.contains("education-resources")) {
      apiHelpers.getRequest("https://ohioanscare-demo.herokuapp.com/services/education", (resources) => {
        app.innerHTML = FiltersApp();
        const resourcesContainer = document.getElementById("resource-container");
        resourcesContainer.innerHTML = OhioResources(resources);
        filterResourcesByService(resources, resourcesContainer);
        FilterSearch();
      });
    }
  });
}

function renderWork() {
  app.addEventListener("click", (event) => {
    if (event.target.classList.contains("work-resources")) {
      apiHelpers.getRequest("https://ohioanscare-demo.herokuapp.com/services/work", (resources) => {
        app.innerHTML = FiltersApp();
        const resourcesContainer = document.getElementById("resource-container");
        resourcesContainer.innerHTML = OhioResources(resources);
        filterResourcesByService(resources, resourcesContainer);
        FilterSearch();
      });
    }
  });
}

function renderLegal() {
  app.addEventListener("click", (event) => {
    if (event.target.classList.contains("legal-resources")) {
      apiHelpers.getRequest("https://ohioanscare-demo.herokuapp.com/services/legal", (resources) => {
        app.innerHTML = FiltersApp();
        const resourcesContainer = document.getElementById("resource-container");
        resourcesContainer.innerHTML = OhioResources(resources);
        filterResourcesByService(resources, resourcesContainer);
        FilterSearch();
      });
    }
  });
}

function filterResourcesByService(resources, resourcesContainer) {
  let filteredResources = [];
  const filterBtn = document.querySelector("#filter-btn");
  const careCheckBox = document.querySelector("#filter-care-resources");
  const educationCheckBox = document.querySelector(
    "#filter-education-resources"
  );
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
    resources.map((resource) => {
      resource.services.map((service) => {
        if (
          service.service.toLocaleLowerCase() === care ||
          service.service.toLocaleLowerCase() === education ||
          service.service.toLocaleLowerCase() === food ||
          service.service.toLocaleLowerCase() === goods ||
          service.service.toLocaleLowerCase() === health ||
          service.service.toLocaleLowerCase() === housing ||
          service.service.toLocaleLowerCase() === legal ||
          service.service.toLocaleLowerCase() === money ||
          service.service.toLocaleLowerCase() === transit ||
          service.service.toLocaleLowerCase() === work
        ) {
          filteredResources.push(resource);
        }
      });
    });
    console.log(filteredResources);
    resourcesContainer.innerHTML = OhioResources(
      filteredResources.length ? filteredResources : resources
    );
    filteredResources = [];
  });
}