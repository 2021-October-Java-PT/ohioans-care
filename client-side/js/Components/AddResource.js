export default function AddResource(newResource) {
  return `


<div>
<h2>
    Add a new resource
</h2>
<div id="formInputs">
<input type="text" placeholder="Organization Name"id="orgName">
<input type="text" placeholder="Description"id="description">
<input type="text" placeholder="Service"id="service">
<input type="text" placeholder="Serving"id="serving">
<input type="text" placeholder="Hours"id="hours">
<input type="text" placeholder="Link to Website"id="url">
<input type="text" placeholder="Phone Number"id="phoneNumber">
<input type="text" placeholder="Languages"id="languages">
<input type="text" placeholder="Zip Code"id="zipCode">
<input type="text" placeholder="Address"id="address">
<button id="formSubmitBtn">
    Submit
</button>
</div>
</div>
`;
}
