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
            "Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, 
            totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo.
            Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui 
            ratione voluptatem sequi nesciunt. Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit,
            sed quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat voluptatem. Ut enim ad minima veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, 
            nisi ut aliquid ex ea commodi consequatur? Quis autem vel eum iure reprehenderit qui in ea voluptate velit esse quam nihil molestiae consequatur, 
            vel illum qui dolorem eum fugiat quo voluptas nulla pariatur?"
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
                                                <li><a href="#" class="social-icon"><i class="fa fa-facebook"></i></a></li>
                                                <li><a href="#" class="social-icon"><i class="fa fa-twitter"></i></a></li>
                                            </ul>
                                            <ul class="team-social icons-2">
                                                <li><a href="#" class="social-icon"><i class="fa fa-skype"></i></a></li>
                                                <li><a href="#" class="social-icon"><i class="fa fa-linkedin"></i></a></li>
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
                                                <li><a href="#" class="social-icon"><i class="fa fa-facebook"></i></a></li>
                                                <li><a href="#" class="social-icon"><i class="fa fa-twitter"></i></a></li>
                                            </ul>
                                            <ul class="team-social icons-2">
                                                <li><a href="#" class="social-icon"><i class="fa fa-skype"></i></a></li>
                                                <li><a href="#" class="social-icon"><i class="fa fa-linkedin"></i></a></li>
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
                                                <li><a href="#" class="social-icon"><i class="fa fa-facebook"></i></a></li>
                                                <li><a href="#" class="social-icon"><i class="fa fa-twitter"></i></a></li>
                                            </ul>
                                            <ul class="team-social icons-2">
                                                <li><a href="#" class="social-icon"><i class="fa fa-skype"></i></a></li>
                                                <li><a href="#" class="social-icon"><i class="fa fa-linkedin"></i></a></li>
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
                                                <li><a href="#" class="social-icon"><i class="fa fa-facebook"></i></a></li>
                                                <li><a href="#" class="social-icon"><i class="fa fa-twitter"></i></a></li>
                                            </ul>
                                            <ul class="team-social icons-2">
                                                <li><a href="#" class="social-icon"><i class="fa fa-skype"></i></a></li>
                                                <li><a href="#" class="social-icon"><i class="fa fa-linkedin"></i></a></li>
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
                                                <li><a href="#" class="social-icon"><i class="fa fa-facebook"></i></a></li>
                                                <li><a href="#" class="social-icon"><i class="fa fa-twitter"></i></a></li>
                                            </ul>
                                            <ul class="team-social icons-2">
                                                <li><a href="#" class="social-icon"><i class="fa fa-skype"></i></a></li>
                                                <li><a href="#" class="social-icon"><i class="fa fa-linkedin"></i></a></li>
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
                                                <li><a href="#" class="social-icon"><i class="fa fa-facebook"></i></a></li>
                                                <li><a href="#" class="social-icon"><i class="fa fa-twitter"></i></a></li>
                                            </ul>
                                            <ul class="team-social icons-2">
                                                <li><a href="#" class="social-icon"><i class="fa fa-skype"></i></a></li>
                                                <li><a href="#" class="social-icon"><i class="fa fa-linkedin"></i></a></li>
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