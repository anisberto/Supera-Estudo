import './style.css';
import { ReactComponent as Instagram } from './Instagram.svg';
import { ReactComponent as Linkedin } from './Linkedin.svg';

function Footer() {
    return (
        <footer className="main-footer">
            <h3>Projeto Supera</h3>
            <div className="footer-icons">
                <a href="https://www.linkedin.com/in/anisberto/" target="blanck">
                    <Linkedin />
                </a>
                <a href="https://www.instagram.com/anisberto_reis/" target="blanck">
                    <Instagram />
                </a>
            </div>
        </footer>
    )
}

export default Footer;