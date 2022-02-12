export default function Resources(resource) {  
  console.log(resource);
  return `
  <div class="row pg-cont" style="background-color: #d0cfce;">
  <div class="col-sm-2 pg-wrap">
    <div class="container">
        <h2>Filter Results By:</h2>
        <p>LOCATION:</p>
        <form>
          <label class="checkbox-inline">
            <input type="checkbox" value="">Miles
          </label>
          <label class="checkbox-inline">
            <input type="checkbox" value="">City
          </label>
          <label class="checkbox-inline">
            <input type="checkbox" value="">Zip Code
          </label>
        </form><br>
        <p>RESOURCE:</p>
        <form>
          <label class="checkbox-inline">
            <input type="checkbox" value="">Food
          </label>
          <label class="checkbox-inline">
            <input type="checkbox" value="">Care
          </label>
          <label class="checkbox-inline">
            <input type="checkbox" value="">Education
          </label><br>
          <label class="checkbox-inline">
            <input type="checkbox" value="">Goods
          </label>
          <label class="checkbox-inline">
            <input type="checkbox" value="">Health
          </label>
          <label class="checkbox-inline">
            <input type="checkbox" value="">Housing
          </label><br>
          <label class="checkbox-inline">
            <input type="checkbox" value="">Legal
          </label>
          <label class="checkbox-inline">
            <input type="checkbox" value="">Money
          </label>
          <label class="checkbox-inline">
            <input type="checkbox" value="">Transit
          </label><br>
          
        </form>
      </div>

</div>
  <div class="col-sm-10" style="background-color:#f7f8f8;">
    ${resource.map(resource => {    
        return `
        <div class="resource-container">
          <div class="resource-wrapper">
            <div class="resource-box">
              <div class="resource-header">
                <span id="program-name-header">${resource.entityName}
                  <input type="hidden" id="programmingLanguageId" value="${resource.id}">
                </span><br>
                <span id="org-name-header">Provided By: ${resource.organizationName}</span>
              </div>
              <div class="resource-grid">
              <div class="resource-summary">
                <ul>
                  <li>${resource.description}</li><br><br>
                  <li>Serving: ${resource.serving}</li>
                  <li>Services: 
                  ${resource.services.map(services => {    
                    return `
                    ${services.service}
                  `;
                }).join("")}
                  </li>
                </ul>
              </div>
              <div class="resource-hours-website">
                <ul>
                  <li>Sunday: ${resource.sunHours}</li>
                  <li>Monday: ${resource.monHours}</li>
                  <li>Tuesday: ${resource.tuesHours}</li>
                  <li>Wednesday: ${resource.wedHours}</li>
                  <li>Thursday: ${resource.thursHours}</li>
                  <li>Friday: ${resource.friHours}</li>
                  <li>Saturday: ${resource.satHours}</li><br>
                  <li>Website: <a href="${resource.websiteUrl}" target="_blank">${resource.websiteUrl}</a></li>
                  <li>Language(s): ${resource.languages}</li>
                </ul>
              </div>
              <div class="resource-address">
                <ul>
                  <li>${resource.address.addressLine1} ${resource.address.addressLine2}</li>
                  <li>${resource.address.city.city}, ${resource.address.county.county}, ${resource.address.state} ${resource.address.zipCode.zipCode}</li>
                  <li>${resource.address.region.region} Ohio</li>
                </ul>
              </div>
            </div>
          </div>
        </div>
        `;
      }).join("")}
</div>
</div>
  `;
}