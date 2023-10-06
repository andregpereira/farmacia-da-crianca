import { useState } from "react";
import * as S from "./medicine.js";

const Medicine = () => {

    const [medicine, setMedicine] = useState({
        name: '',
        price: '',
        imageUrl: ''
    });

    const handleChange = (e) => {
        setMedicine(...medicine, medicine);
    }

    const handleSubmit = (e) => {
        alert('A form was submitted with medicine: ' + medicine);
        e.preventDefault();
    }

    return (
        <>
            <S.Container>
                <S.Caixa>
                    <h1 className=".titulo">Gerenciamento de Produtos</h1>
                    <S.Formulario>
                        <form onSubmit={handleSubmit}>
                            <S.DivFormTop>
                                <S.DivInput>
                                    <label>Nome do produto: *</label>
                                    <S.Input type="text" value={medicine.name} onChange={handleChange} />
                                </S.DivInput>
                                <S.DivInputValor>
                                    <label>Valor unitário: *</label>
                                    <S.Input type="number" value={medicine.price} onChange={handleChange} />
                                </S.DivInputValor>
                            </S.DivFormTop>
                            <S.DivInput>
                                <label>Imagem do produto: *</label>
                                <S.Input type="text" value={medicine.imageUrl} onChange={handleChange} />
                            </S.DivInput>
                            <S.DivFormBottom>
                                <S.Botao type="submit" value="Enviar" />
                            </S.DivFormBottom>
                        </form>
                    </S.Formulario>
                </S.Caixa>
            </S.Container>
        </>
    );
};

export default Medicine;