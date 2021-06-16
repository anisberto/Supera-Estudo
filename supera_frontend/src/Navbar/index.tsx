import './style.css';
import { Link } from 'react-router-dom';

function NavBar() {
    return (
        <nav className="main-navbar">
            <Link to="/" className="logo-text">Supera</Link>
        </nav>
    )
}

export default NavBar;