import FilteredResource from "../Components/FilteredResource.js";
import apiHelpers from "../api-helpers/apiHelpers.js";

export default function Search() {
    const app = document.querySelector("#app");
    const searchBar = document.getElementById("search-bar");
    const searchSubmitBtn = document.getElementById("search-submit-btn");

    searchSubmitBtn.addEventListener("click", () => {
        const searchString = searchBar.value;
        console.log(searchString);
        apiHelpers.getRequest(`http://localhost:8080/resources/resource-by-location/${searchString}`, (resources) => {
            console.log(resources)
            app.innerHTML = FilteredResource(resources);
        });
    });
}