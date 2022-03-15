export default function AddResource() {
  return `
	<div class="add-rsrc-cont">
		<div class="card">
			<br>
			<br>
			<div class="card-image">
				<h2 class="card-heading">
					We welcome your suggestions
					<br>
					<small>Suggest a Resource</small>
				</h2>
			</div>
			<form class="card-form">
				<div class="input add-rsrc">
					<input type="text" class="input-field" id="orgName" required />
					<label class="input-label">Organization name</label>
				</div>
				<div class="input add-rsrc">
					<input type="text" class="input-field" id="description" required />
					<label class="input-label">Description</label>
				</div>
				<div class="input add-rsrc">
					<input type="text" class="input-field" id="service" required />
					<label class="input-label">Service</label>
				</div>
				<div class="input add-rsrc">
					<input type="text" class="input-field" id="serving" required />
					<label class="input-label">Serving</label>
				</div>
				<div class="input add-rsrc">
					<input type="text" class="input-field" id="hours" required />
					<label class="input-label">Hours</label>
				</div>
				<div class="input add-rsrc">
					<input type="text" class="input-field" id="url" required />
					<label class="input-label">Link to website</label>
				</div>
				<div class="input add-rsrc">
					<input type="text" class="input-field" id="phoneNumber" required />
					<label class="input-label">Phone Number</label>
				</div>
				<div class="input add-rsrc">
					<input type="text" class="input-field" id="languages" required />
					<label class="input-label">Languages</label>
				</div>
				<div class="input add-rsrc">
					<input type="text" class="input-field" id="zipCode" required />
					<label class="input-label">Zip Code</label>
				</div>
				<div class="input add-rsrc">
					<input type="text" class="input-field" id="address" required />
					<label class="input-label">Address</label>
				</div>
				<div class="action">
					<button class="action-button">SUBMIT</button>
				</div>
			</form>
			<div class="card-info">
				<p>By submitting you are agreeing to our <a href="#">Terms and Conditions</a></p>
			</div>
		</div>
	</div>
`;
}
