export default function Food(foodResource) {
  console.log(foodResource);
  return `
        <ul>
            ${foodResource.map(foodResource => {
            return `
                <li>${foodResource.entityName}
                    <input type="hidden" id="programmingLanguageId" value="${foodResource.id}">
                </li>
                <li>${foodResource.organizationName}</li>
                <li>${foodResource.description}</li>
                <li>${foodResource.mainServices}</li>
                <li>${foodResource.serving}</li>
                <li>${foodResource.hours}</li>
                <li><a href="${foodResource.websiteUrl}">${foodResource.websiteUrl}</a></li>
                <li>${foodResource.languages}</li>
                <li>${foodResource.address.addressLine1}</li>
                <li>${foodResource.address.city}</li>
                <li>${foodResource.address.county.county}</li>
                <li>${foodResource.address.state}</li>
                <li>${foodResource.address.zipCode.zipCode}</li>
                `;
              }).join("")}
              </ul>
        `;
}