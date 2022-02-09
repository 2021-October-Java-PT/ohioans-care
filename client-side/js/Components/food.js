export default function Food(foodResource) {
  return `
  ${foodResource.map(foodResource => {
    return `
    <div class="resource-container">
      <div class="resource-wrapper">
        <div class="resource-box">
          <div class="resource-header">
            <span id="program-name-header">Program Name: ${foodResource.entityName}
              <input type="hidden" id="programmingLanguageId" value="${foodResource.id}">
            </span>
            <span id="org-name-header">Provided By: ${foodResource.organizationName}</span>
          </div>
        <div class="resource-grid">
          <div class="resource-summary">
            <ul>
              <li>${foodResource.description}</li><br><br>
              <li>Serving: ${foodResource.serving}</li>
              <li>Services: ${foodResource.services[0].service}</li>
            </ul>
          </div>
          <div class="resource-hours-website">
            <ul>
              <li>Sunday: ${foodResource.sunHours}</li>
              <li>Monday: ${foodResource.monHours}</li>
              <li>Tuesday: ${foodResource.tuesHours}</li>
              <li>Wednesday: ${foodResource.wedHours}</li>
              <li>Thursday: ${foodResource.thursHours}</li>
              <li>Friday: ${foodResource.friHours}</li>
              <li>Saturday: ${foodResource.satHours}</li><br>
              <li>Website: <a href="${foodResource.websiteUrl}" target="_blank">${foodResource.websiteUrl}</a></li>
              <li>Language(s): ${foodResource.languages}</li>
            </ul>
          </div>
          <div class="resource-address">
            <ul>
              <li>${foodResource.address.addressLine1} ${foodResource.address.addressLine2}</li>
              <li>${foodResource.address.city}, ${foodResource.address.county.county}, ${foodResource.address.state} ${foodResource.address.zipCode.zipCode}</li>
              <li>${foodResource.address.region.region} Ohio</li>
            </ul>
          </div>
        </div>
      </div>
    </div>
                `;
              }).join("")}
              `;
}