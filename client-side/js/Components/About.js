import Aaron from "../../assets/Aaron.png";
import BGPic from "../../assets/Serv-pg-bg.png";
import Brady from "../../assets/Brady.png";
import George from "../../assets/George.png";
import Jo from "../../assets/Jo.png";
import Madison from "../../assets/Madison.png";
import TJ from "../../assets/TJ.png";

export default function About() {
  return `
    <div class="serv-main-cont" style="background-image: url(${BGPic});">
        <div id="services" class="container-fluid services-pg text-center">
        <h2>ABOUT OHIOANS CARE</h2>
        <h4>OUR STORY</h4>
            <div class="serv-cont">
            <p class="serv-cont-par">
            Ohioans Care is a central, integrated space where every Ohioan can find and offer support for all aspects of life. 
            Too often, our friends and neighbors struggle through no fault of their own. Navigating the information landscape should be one burden they never have to face.
            The concept was born from the mind of our very own Jo, who as a social service worker, saw too many of her clients miss out on available help due to the disorganization of resources across the state.
            Here, users can search across a variety of services in their zip code and suggest resources that are tucked away or easily overlooked in their area.
            Additionally, users can access the community page to participate in discussions with their neighbors; whether it's to introduce yourself after moving or to coordinate snow removal efforts on your block.
            On Ohioans Care, your heart is always in the right place.
            </p>
        </div>
    </div>
    <div id="rs-team" class="rs-team fullwidth-team pt-100 pb-70">
        <div class="container">
                <h2 class="text-center">OHIOANS CARE TEAM</h2>
                    <div class="row">
                        <div class="col-lg-4 col-md-6">
                            <div class="team-item">
                                <div class="team-img">
                                    <img src="${Madison}" alt="team Image">
                                    <div class="normal-text">
                                        <h4 class="team-name">Madison Mitchell</h4>
                                        <span class="subtitle">Software Developer</span>
                                    </div>
                                </div>
                                <div class="team-content">
                                    <div class="display-table">
                                        <div class="display-table-cell">
                                            <div class="share-icons">
                                                <div class="border"></div>
                                                <ul class="team-social icons-1">
                                                    <li><a href="#" class="social-icon"><i class="fa fa-facebook"></i></a>
                                                    </li>
                                                    <li><a href="#" class="social-icon"><i class="fa fa-twitter"></i></a>
                                                    </li>
                                                </ul>

                                                <ul class="team-social icons-2">
                                                    <li><a href="#" class="social-icon"><i class="fa fa-skype"></i></a>
                                                    </li>
                                                    <li><a href="#" class="social-icon"><i class="fa fa-linkedin"></i></a>
                                                    </li>
                                                </ul>
                                            </div>
                                            <div class="team-details">
                                                <h4 class="team-name">
                                                    <a href="speakers-single.html">Madison Mitchell</a>
                                                </h4>
                                                <span class="postion">Software Developer</span>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-4 col-md-6">
                            <div class="team-item">
                                <div class="team-img">
                                    <img src="${Jo}" alt="team Image">
                                    <div class="normal-text">
                                        <h4 class="team-name">Josephine Wilson</h4>
                                        <span class="subtitle">Software Developer</span>
                                    </div>
                                </div>
                                <div class="team-content">
                                    <div class="display-table">
                                        <div class="display-table-cell">
                                            <div class="share-icons">
                                                <div class="border"></div>
                                                <ul class="team-social icons-1">
                                                    <li><a href="#" class="social-icon"><i class="fa fa-facebook"></i></a>
                                                    </li>
                                                    <li><a href="#" class="social-icon"><i class="fa fa-twitter"></i></a>
                                                    </li>
                                                </ul>

                                                <ul class="team-social icons-2">
                                                    <li><a href="#" class="social-icon"><i class="fa fa-skype"></i></a>
                                                    </li>
                                                    <li><a href="#" class="social-icon"><i class="fa fa-linkedin"></i></a>
                                                    </li>
                                                </ul>
                                            </div>
                                            <div class="team-details">
                                                <h4 class="team-name">
                                                    <a href="speakers-single.html">Josephine Wilson</a>
                                                </h4>
                                                <span class="postion">Software Developer</span>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-4 col-md-6">
                            <div class="team-item">
                                <div class="team-img">
                                    <img src="${TJ}" alt="team Image">
                                    <div class="normal-text">
                                        <h4 class="team-name">TJ</h4>
                                        <span class="subtitle">Software Developer</span>
                                    </div>
                                </div>
                                <div class="team-content">
                                    <div class="display-table">
                                        <div class="display-table-cell">
                                            <div class="share-icons">
                                                <div class="border"></div>
                                                <ul class="team-social icons-1">
                                                    <li><a href="#" class="social-icon"><i class="fa fa-facebook"></i></a>
                                                    </li>
                                                    <li><a href="#" class="social-icon"><i class="fa fa-twitter"></i></a>
                                                    </li>
                                                </ul>

                                                <ul class="team-social icons-2">
                                                    <li><a href="#" class="social-icon"><i class="fa fa-skype"></i></a>
                                                    </li>
                                                    <li><a href="#" class="social-icon"><i class="fa fa-linkedin"></i></a>
                                                    </li>
                                                </ul>
                                            </div>
                                            <div class="team-details">
                                                <h4 class="team-name">
                                                    <a href="speakers-single.html">TJ</a>
                                                </h4>
                                                <span class="postion">Software Developer</span>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-4 col-md-6">
                            <div class="team-item">
                                <div class="team-img">
                                    <img src="${Aaron}" alt="team Image">
                                    <div class="normal-text">
                                        <h4 class="team-name">Aaron Dormer</h4>
                                        <span class="subtitle">Software Developer</span>
                                    </div>
                                </div>
                                <div class="team-content">
                                    <div class="display-table">
                                        <div class="display-table-cell">
                                            <div class="share-icons">
                                                <div class="border"></div>
                                                <ul class="team-social icons-1">
                                                    <li><a href="#" class="social-icon"><i class="fa fa-facebook"></i></a>
                                                    </li>
                                                    <li><a href="#" class="social-icon"><i class="fa fa-twitter"></i></a>
                                                    </li>
                                                </ul>

                                                <ul class="team-social icons-2">
                                                    <li><a href="#" class="social-icon"><i class="fa fa-skype"></i></a>
                                                    </li>
                                                    <li><a href="#" class="social-icon"><i class="fa fa-linkedin"></i></a>
                                                    </li>
                                                </ul>
                                            </div>
                                            <div class="team-details">
                                                <h4 class="team-name">
                                                    <a href="speakers-single.html">Aaron Dormer</a>
                                                </h4>
                                                <span class="postion">Software Developer</span>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-4 col-md-6">
                            <div class="team-item">
                                <div class="team-img">
                                    <img src="${George}" alt="team Image">
                                    <div class="normal-text">
                                        <h4 class="team-name">George Avent</h4>
                                        <span class="subtitle">Software Developer</span>
                                    </div>
                                </div>
                                <div class="team-content">
                                    <div class="display-table">
                                        <div class="display-table-cell">
                                            <div class="share-icons">
                                                <div class="border"></div>
                                                <ul class="team-social icons-1">
                                                    <li><a href="#" class="social-icon"><i class="fa fa-facebook"></i></a>
                                                    </li>
                                                    <li><a href="#" class="social-icon"><i class="fa fa-twitter"></i></a>
                                                    </li>
                                                </ul>

                                                <ul class="team-social icons-2">
                                                    <li><a href="#" class="social-icon"><i class="fa fa-skype"></i></a>
                                                    </li>
                                                    <li><a href="#" class="social-icon"><i class="fa fa-linkedin"></i></a>
                                                    </li>
                                                </ul>
                                            </div>
                                            <div class="team-details">
                                                <h4 class="team-name">
                                                    <a href="speakers-single.html">George Avent</a>
                                                </h4>
                                                <span class="postion">Software Developer</span>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-4 col-md-6">
                            <div class="team-item">
                                <div class="team-img">
                                    <img src="${Brady}" alt="team Image">
                                    <div class="normal-text">
                                        <h4 class="team-name">Brady Gasser</h4>
                                        <span class="subtitle">Software Developer</span>
                                    </div>
                                </div>
                                <div class="team-content">
                                    <div class="display-table">
                                        <div class="display-table-cell">
                                            <div class="share-icons">
                                                <div class="border"></div>
                                                <ul class="team-social icons-1">
                                                    <li><a href="#" class="social-icon"><i class="fa fa-facebook"></i></a>
                                                    </li>
                                                    <li><a href="#" class="social-icon"><i class="fa fa-twitter"></i></a>
                                                    </li>
                                                </ul>

                                                <ul class="team-social icons-2">
                                                    <li><a href="#" class="social-icon"><i class="fa fa-skype"></i></a>
                                                    </li>
                                                    <li><a href="#" class="social-icon"><i class="fa fa-linkedin"></i></a>
                                                    </li>
                                                </ul>
                                            </div>
                                            <div class="team-details">
                                                <h4 class="team-name">
                                                    <a href="speakers-single.html">Brady Gasser</a>
                                                </h4>
                                                <span class="postion">Software Developer</span>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div> 
                    </div>
                </div>
                <!-- .container-fullwidth -->
            </div>
            </div>
  `;
}
