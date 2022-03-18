import 'youtube-video-js';

const servImg = "/assets/Serv-pg-bg.png";

export default function Services() {
  return `
      <div class="serv-main-cont" style="background-image: url(${servImg});">
        <div id="services" class="container-fluid services-pg text-center">
          <div class="serv-oh-vid">
            <youtube-video width="640" height="360" src="https://youtu.be/ahg_ogEkyhU" autoplay controls />
          </div>
          <h2>SERVICES</h2>
          <h4>What We Can Do For You</h4>
          <div class="row slideanim">
            <div class="col-sm-4">
              <span class="glyphicon glyphicon-bullhorn logo-small"></span>
              <h4><a href="https://community.ohioanscare.org/public/">LOCAL COMMUNITY UPDATES</a></h4>
              <p>Get in touch with your local community.</p>
            </div>
            <div class="col-sm-4">
              <span class="glyphicon glyphicon-heart logo-small"></span>
              <h4><a href="https://community.ohioanscare.org/public/t/neighbor-volunteering">NEIGHBORHOOD CARE WATCH</a></h4>
              <p>Volunteer to help or receive help from locals in your area.</p>
            </div>
            <div class="col-sm-4">
              <span class="glyphicon glyphicon-book logo-small"></span>
              <h4><a href="http://localhost:1234/">SOCIAL SERVICES DIRECTORY</a></h4>
              <p>Explore our directory of social services across Ohio.</p>
            </div>
          </div>
        </div>
      </div>
  `;
}