function StepsHeader() {
    return (
        <header className="orders-steps-container">
            <div className="orders-steps-content">
                <h1 className="steps-title">
                    Vamos lá ?
                </h1>
                <ul className="steps-items">
                    <li>
                        <span className="steps-number">1</span>
                        Selecione os produtos.
                    </li>
                    <li>
                        <span className="steps-number">2</span>
                            Depois click em <strong>Fazer Pedido! e Seja Feliz.</strong>
                    </li>
                </ul>
            </div>
        </header>
    )
}

export default StepsHeader;