import 'youtube-video-js';

import servImg from "../../assets/Serv-pg-bg.png";

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
              <h4>LOCAL COMMUNITY UPDATES</h4>
              <p>Lorem ipsum dolor sit amet..</p>
            </div>
            <div class="col-sm-4">
              <span class="glyphicon glyphicon-heart logo-small"></span>
              <h4>NEIGHBORHOOD CARE WATCH</h4>
              <p>Lorem ipsum dolor sit amet..</p>
            </div>
            <div class="col-sm-4">
              <span class="glyphicon glyphicon-book logo-small"></span>
              <h4>SOCIAL SERVICES DIRECTORY</h4>
              <p>Lorem ipsum dolor sit amet..</p>
            </div>
          </div>
        </div>
      </div>
  `;
}