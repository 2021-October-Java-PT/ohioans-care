import Food from "./Components/Food.js";
import Home from "./components/Home.js";
import apiHelpers from "./api-helpers/apiHelpers.js";

const app = document.querySelector("#app");


buildPage();

function buildPage() {
    app.innerHTML = "HELLO WORLD";
    renderHome();
    renderFood();
}

function renderHome() {
    app.innerHTML = Home();
}

function renderFood() {
    app.addEventListener("click", (event) => {
        if (event.target.classList.contains("food-resources")) {
            console.log("BUTTON IS WORKING");
            app.innerText = "MADISON IS GREAT";
            apiHelpers.getRequest("http://localhost:8080/resources", (food) => {
            });
        }
    });
}