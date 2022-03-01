export default function UserProfile(userProfile) {
  return `
  <div class="container-fluid bg-grey">
    <div class="row">
      <div class="col-sm-4">
        <span class="glyphicon glyphicon-user logo slideanim"></span>
      </div>
      <div class="col-sm-8">
        <h3>Welcome ${userProfile.firstName}</h3>
    <p>These are your saved Resources for zipcode ${
      userProfile.zipCode.zipCode
    }</p>
      </div>
      <div class="col-sm-8">
        ${userProfile.resources
            .map((resource) => {
              return `
              <section>
                  <h3>${resource.organizationName}</h3>
                  <p>Address: ${resource.address}</p>
                  <p>Phone: ${resource.phone}</p>
                  <a href=${resource.websiteUrl}>Their Website</a>
              </section>
              `;
            })
            .join("")}
      </div>
    </div>
  </div>
  `;
}
