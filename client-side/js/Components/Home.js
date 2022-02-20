import careImg from "../../assets/CARE.png";
import educationImg from "../../assets/EDUCATION.png";
import foodImg from "../../assets/Food.png";
import goodsImg from "../../assets/Goods.png";
import healthImg from "../../assets/HEALTH.png";
import housingImg from "../../assets/HOUSING.png";
import jumbotronImg from "../../assets/Jumbotron-bg.png";
import legalImg from "../../assets/LEGAL.png";
import moneyImg from "../../assets/MONEY.png";
import transitImg from "../../assets/TRANSIT.png";
import workImg from "../../assets/WORK.png";

export default function Home() {
  return `
        <div id="app">
        <div class="jumbotron text-center" style="background-image: url(${jumbotronImg});">
        <div class="jumbotrn-cont">
          <h1>WE ARE HERE TO HELP</h1>
        <div class="search-section">
        <p>OHIO REGIONS</p>
        <h3><a class="region-nw" style="color: white">Northwest</a> | <a class="region-ne" style="color: white">Northeast</a> | <a class="region-c" style="color: white">Central</a> | <a class="region-sw" style="color: white">Southwest</a> | <a class="region-se" style="color: white">Southeast</a></h3>
        <div class="form-cont">
          <form>
            <div class="input-group">
              <input type="search" id="search-bar" class="form-control" size="50" placeholder="Enter Your Zip Code, City, or County" required>
              <div class="input-group-btn">
                <button type="button" class="btn btn-danger" id="search-submit-btn">Submit</button>
              </div>
            </div>
          </form>
        </div>
      </div>
      <div class="row">
        <div class="col-xs-6 col-md-2 col-md-offset-1">
          <img class="img-responsive btn food-resources" src="${foodImg}" id="" />
        </div>
        <div class="col-xs-6 col-md-2">
          <img class="img-responsive btn housing-resources" src="${housingImg}" />
        </div>

        <div class="col-xs-6 col-md-2">
          <img class="img-responsive btn goods-resources" src="${goodsImg}" />
        </div>
        <div class="col-xs-6 col-md-2">
          <img class="img-responsive btn transit-resources" src="${transitImg}" />
        </div>
        <div class="col-xs-6 col-md-2">
          <img class="img-responsive btn health-resources" src="${healthImg}" />
        </div>
      </div>
      <div class="row">
        <div class="col-xs-6 col-md-2 col-md-offset-1">
          <img class="img-responsive btn money-resources" src="${moneyImg}" />
        </div>
        <div class="col-xs-6 col-md-2">
          <img class="img-responsive btn care-resources" src="${careImg}" />
        </div>

        <div class="col-xs-6 col-md-2">
          <img class="img-responsive btn education-resources" src="${educationImg}" />
        </div>
        <div class="col-xs-6 col-md-2">
          <img class="img-responsive btn work-resources" src="${workImg}" />
        </div>
        <div class="col-xs-6 col-md-2">
          <img class="img-responsive btn legal-resources" src="${legalImg}" />
        </div>
      </div>
      <div class="row home-com-btn">
        <div class="col-sm-4">
        <span class="glyphicon glyphicon-bullhorn logo-small"></span>
        <h4><a href="https://community.ohioanscare.org/">LOCAL COMMUNITY UPDATES</a></h4>
        </div>
      <div class="col-sm-4">
         <span class="glyphicon glyphicon-heart logo-small"></span>
         <h4><a href="https://community.ohioanscare.org/">NEIGHBORHOOD CARE WATCH</a></h4>
        </div>
      <div class="col-sm-4">
        <span class="glyphicon glyphicon-comment logo-small"></span>
        <h4><a href="https://community.ohioanscare.org/public/tags">COMMUNITY FORUM</a></h4>
      </div>
      </div>
      </div>
    </div>
    </div>
    `;
}