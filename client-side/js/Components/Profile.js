export default function UserProfile(userProfile) {
  console.log(userProfile);
  return `
    <div>
    </br>
    </br>
    </br>
    <h3>Welcome ${userProfile.firstName}</h3>
    <p>These are your saved Resources for zipcode ${
      userProfile.zipCode.zipCode
    }</p>
    <div>
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
    `;
}
