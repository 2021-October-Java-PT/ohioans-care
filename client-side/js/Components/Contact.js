import BgPic from "../../assets/Serv-pg-bg.png";
import agentPic from "../../assets/call-agent-pic.png";

export default function Services() {
  return `
  <!-- Container (Contact Section) -->
<div class="container-fluid bg-grey" style="background-image: url(${BgPic});">
  <h2 class="text-center">We'd Like To Hear From You</h2>
  <div class="row">
    <div class="col-sm-5">
      <img src="${agentPic}" width="200"><br>
      <p>Contact us and we'll get back to you within 24 hours.</p>
      <p><span class="glyphicon glyphicon-phone"></span> <a href="tel:4197071234" style="color: #818181">(419) 707-1234</a></p>
      <p><span class="glyphicon glyphicon-envelope"></span> <a href="mailto:contact@ohioancares.org" style="color: #818181">contact@ohioancares.org</a></p><br>
      <p>HAVE SUGGESTIONS?</p>
      <a href="#" class="btn btn-danger" role="button">SUGGEST A RESOURCE</a>
    </div>
    <div class="col-sm-7">
      <div class="row">
        <div class="col-sm-6 form-group">
          <input class="form-control" id="name" name="name" placeholder="Name" type="text" required>
        </div>
        <div class="col-sm-6 form-group">
          <input class="form-control" id="email" name="email" placeholder="Email" type="email" required>
        </div>
      </div>
      <textarea class="form-control" id="comments" name="comments" placeholder="Comment" rows="5"></textarea><br>
      <div class="row">
        <div class="col-sm-12 form-group">
          <button class="btn btn-default pull-right" type="submit">Send</button>
        </div>
      </div>
    </div>
  </div>
</div>
    `;
}
