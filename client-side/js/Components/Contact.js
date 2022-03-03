import BgPic from "../../assets/Serv-pg-bg.png";
import callPic from "../../assets/contact-img.png";

export default function Services() {
  return `
	<div class="add-rsrc-cont">
		<div class="card">
		<br>
		<br>
			<div class="card-image">	
				<h2 class="card-heading">
				<p>CONTACT US</p>
				<p><span class="glyphicon glyphicon-phone"></span> <a href="tel:4197071234" style="color: #818181">(419) 707-1234</a></p>
				<p><span class="glyphicon glyphicon-envelope"></span> <a href="mailto:contact@ohioancares.org" style="color: #818181">contact@ohioancares.org</a></p><br>
						
				We'd love to hear from you! Do you have any suggestions?
				<br>
						
				<a href="#" class="btn btn-danger" role="button">SUGGEST A RESOURCE</a>
				</h2>
			</div>
			<form class="card-form">
				<div class="input add-rsrc">
					<input class="form-control" id="name" name="name" placeholder="Name" type="text" required>
				</div>
				<div class="input add-rsrc">
					<input class="form-control" id="email" name="email" placeholder="Email" type="email" required>
				</div>
				<div class="input add-rsrc">
					<textarea class="form-control" id="comments" name="comments" placeholder="Comment" rows="5"></textarea><br>
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
