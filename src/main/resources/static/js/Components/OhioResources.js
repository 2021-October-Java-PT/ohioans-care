export default function OhioResources(resources) {
    console.log(resources);
    return `
    
        ${resources.map(resource => {    
        return `
        <div class=" ${resource.services.map(services => { return `${services.service.toLocaleLowerCase()}-service `;}).join("")} panel panel-default">
            <div class="resource-box panel-heading" id="labels">
                <span id="program-name-header">${resource.entityName}
                    <input type="hidden" id="programmingLanguageId" value="${resource.id}">
                </span><br>
                <span id="org-name-header">Provided By: ${resource.organizationName}</span>
                    <div class="panel-body>    
                        <div class="rsrc">
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
                                            <li>Phone: <a href="tel:${resource.phone}">${resource.phone}</a><li>
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
            </div>
        `;
        }).join("")}
    `;
}