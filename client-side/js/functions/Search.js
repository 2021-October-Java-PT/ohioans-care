import Resources from "../Components/Resources.js";
import apiHelpers from "../api-helpers/apiHelpers.js";

export default function Search() {
    const app = document.querySelector("#app");
    const searchBar = document.getElementById("search-bar");
    const searchSubmitBtn = document.getElementById("search-submit-btn");

    searchSubmitBtn.addEventListener("click", () => {
        const searchString = searchBar.value;
        apiHelpers.getRequest(`http://localhost:8080/resources/zip-codes/${searchString}`, (resource) => {
            app.innerHTML = Resources(resource);
        });
    });
}