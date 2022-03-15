export default function UserProfile(userProfile) {
  return `
    <div class="container-fluid bg-grey">
      <div class="row">
        <div class="col-sm-4">
          <span class="glyphicon glyphicon-user logo slideanim"></span>
        </div>
        <div class="col-sm-8">
          <h2>Welcome ${userProfile.firstName} ${userProfile.lastName}</h2>
          <p>Your ZipCode: ${userProfile.zipCode.zipCode}</p><br>
          <h2>Your Saved Resources:</h2>
        </div>
        <div class="col-sm-8">
          ${userProfile.resources.map((resource) => {
          return `
          <section>
            <h3>${resource.organizationName}</h3>
            <p>
              ${resource.address.addressLine1}<br>
              ${resource.address.city.city}, ${resource.address.county.county}, ${resource.address.state} ${resource.address.zipCode.zipCode}<br>
              ${resource.address.region.region} Ohio<br>
            </p>
            <a href="tel:${resource.phone}">${resource.phone}</a><br>
            <a href=${resource.websiteUrl}>${resource.websiteUrl}</a>
          </section>
          `;
          }).join("")}
        </div>
      </div>
    </div>
  `;
}
