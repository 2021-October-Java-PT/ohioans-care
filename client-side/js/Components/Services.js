import 'youtube-video-js';

import servImg from "../../assets/Serv-pg-bg.png";

export default function Services() {
  return `
  <div class="serv-main-cont" style="background-image: url(${servImg});">
  <div id="services" class="container-fluid services-pg text-center">
  <div class="serv-oh-vid">
  <youtube-video
    width="640"
    height="360"
    src="https://youtu.be/ahg_ogEkyhU"
    autoplay
    controls
/>
</div>
<h2>SERVICES</h2>
<h4>What We Can Do For You</h4>
<div class="serv-cont">
<p class="serv-cont-par">
"Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, 
totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo.
 Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui 
 ratione voluptatem sequi nesciunt. Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit,
  sed quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat voluptatem. Ut enim ad minima veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, 
  nisi ut aliquid ex ea commodi consequatur? Quis autem vel eum iure reprehenderit qui in ea voluptate velit esse quam nihil molestiae consequatur, 
  vel illum qui dolorem eum fugiat quo voluptas nulla pariatur?"
  "Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, 
totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo.
 Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui 
 ratione voluptatem sequi nesciunt. Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit,
  sed quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat voluptatem. Ut enim ad minima veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, 
  nisi ut aliquid ex ea commodi consequatur? Quis autem vel eum iure reprehenderit qui in ea voluptate velit esse quam nihil molestiae consequatur, 
  vel illum qui dolorem eum fugiat quo voluptas nulla pariatur?"
</p>
</div>
<br>
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
</div>
  `;
}