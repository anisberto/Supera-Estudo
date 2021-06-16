import "./style.css";
import Footer from "../Footer";
import { Link } from "react-router-dom";

function Home() {
  return (
    <>
      <div className="home-container">
        <div className="home-content">
          <div className="home-actions">
            <h1 className="home-title">Seja Bem vindo!!</h1>
            <h3 className="home-subtitle">
              Escolha o seus Produtos em poucos minutos.
            </h3>
            <Link to="/orders" className="home-btn-order">
              Acessar Produtos
            </Link>
          </div>
        </div>
      </div>
      <Footer />
    </>
  );
}

export default Home;
