import FilteredResource from "../Components/FilteredResource.js";
import apiHelpers from "../api-helpers/apiHelpers.js";

export default function Search() {
    const app = document.querySelector("#app");
    const searchBar = document.getElementById("search-bar");
    const searchSubmitBtn = document.getElementById("search-submit-btn");

    searchSubmitBtn.addEventListener("click", () => {
        const searchString = searchBar.value;
        apiHelpers.getRequest(`http://localhost:8080/resources/zip-codes/${searchString}`, (resources) => {
            app.innerHTML = Resources(resources);
        });
    });
}


















// const app = document.querySelector("#app");
//     const searchBar = document.getElementById("search-bar");
//     const searchSubmitBtn = document.getElementById("search-submit-btn");

//     app.addEventListener('click', () => {
//         apiHelpers.getRequest('http://localhost:8080/resources', (resources) => {
//             // console.log('Resources: ', resources);

//             searchBar.addEventListener('keyup', (e) => {
//                 const searchString = e.target.value.toLowerCase();
//                 console.log('Search String: ', searchString);

//                 const filteredResources = resources.filter(resource => resource.address( (address) => address.city.includes(searchString)));
//                 console.log('Filtered Resources: ', filteredResources);

//                 searchSubmitBtn.addEventListener("click", () => {
//                     const searchString = searchBar.value;
//                     // apiHelpers.getRequest(`http://localhost:8080/resources/`, (resource) => {
//                     app.innerHTML = FilteredResource(filteredResources);
//                     // });
//                 });
//             });
//         });
//     });
// }