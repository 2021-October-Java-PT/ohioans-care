import Food from "./Components/Food.js";
import Home from "./components/Home.js";
import apiHelpers from "./api-helpers/apiHelpers.js";

const app = document.querySelector("#app");


buildPage();

function buildPage() {
    navHome();
    renderHome();
    renderFood();
}

function renderHome() {
    app.innerHTML = Home();
}

function navHome() {
    const homeBtn = document.querySelector("#homeBtn");
    homeBtn.addEventListener("click", () => {
        app.innerHTML = Home();
    });
}

function renderFood() {
    app.addEventListener("click", (event) => {
        if (event.target.classList.contains("food-resources")) {
            apiHelpers.getRequest("http://localhost:8080/resources", (foodResource) => {
                app.innerHTML = Food(foodResource);
            });
        }
    });
}