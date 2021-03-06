export default function Filters() {
    return `
    <div class="row pg-cont" style="background-color: #d0cfce;">
        <div class="col-sm-4 pg-wrap">
            <div class="container-fluid">
                <h2>Filter Results By:</h2>
                <p>LOCATION:</p>
                <div class="map-cont">
                    <iframe src="https://www.google.com/maps/d/embed?mid=1LQJ-CngUrh5CpnqcsXtQep8G_U4EdjWy&ehbc=2E312F" width="100%" height="350"></iframe>
                </div>
                <br>
                
                <form>
                    <div class="input-group">
                        <input type="search" id="search-bar" class="form-control" size="80" placeholder="Enter Your Zip Code, City, or County" required>
                        <div class="input-group-btn">
                            <button type="button" class="btn btn-danger" id="search-submit-btn">Submit</button>
                        </div>
                    </div>
                </form>
                
                <br>
                <p>RESOURCE:</p>
                <form>
                <div class="row2">
                <div class="column2">
                    <label class="checkbox-inline">
                        <input type="checkbox" id="filter-care-resources" class="filter-care-resources" value="care" name="filter-care-resources">Care
                    </label><br>
                    <label class="checkbox-inline">
                        <input type="checkbox" id="filter-education-resources" class="filter-education-resources" value="education" name="filter-education-resources">Education
                    </label><br>
                    <label class="checkbox-inline">
                        <input type="checkbox" id="filter-food-resources" class="filter-food-resources" value="food" name="filter-food-resources">Food
                    </label><br>
                    </div>
                    <div class="column2">
                    <label class="checkbox-inline">
                        <input type="checkbox" id="filter-goods-resources" class="filter-goods-resources" value="goods" name="filter-goods-resources">Goods
                    </label><br>
                    <label class="checkbox-inline">
                        <input type="checkbox" id="filter-health-resources" class="filter-health-resources" value="health" name="filter-health-resources">Health
                    </label><br>
                    <label class="checkbox-inline">
                        <input type="checkbox" id="filter-housing-resources" class="filter-housing-resources" value="housing" name="filter-housing-resources">Housing
                    </label><br>
                    </div>
                    <div class="column2">
                    <label class="checkbox-inline">
                        <input type="checkbox" id="filter-legal-resources" class="filter-legal-resources" value="legal" name="filter-legal-resources">Legal
                    </label><br>
                    <label class="checkbox-inline">
                        <input type="checkbox" id="filter-money-resources" class="filter-money-resources" value="money" name="filter-money-resources">Money
                    </label><br>
                    <label class="checkbox-inline">
                        <input type="checkbox" id="filter-transit-resources" class="filter-transit-resources" value="transit" name="filter-transit-resources">Transit
                    </label><br>
                    </div>
                    <div class="column2">
                    <label class="checkbox-inline">
                        <input type="checkbox" id="filter-work-resources" class="filter-work-resources" value="work" name="filter-work-resources">Work
                    </label><br>
                    </div>
                    </div>
                </form>
                <br>
                <button id="filter-btn" class="btn btn-danger">Filter</button>
            </div>
        </div>
        
        <div class="col-sm-8" style="background-color: white;">
            <div class="resource-container" id="resource-container">
            </div>
        </div>
    </div>
    `;
}