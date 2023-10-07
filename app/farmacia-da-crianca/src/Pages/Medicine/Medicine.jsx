import { useState } from "react";
import { useParams } from 'react-router-dom'
import * as S from "./medicine.js";

const Medicine = () => {

    let { id } = useParams()

    const [medicine, setMedicine] = useState({
        name: "",
        price: "",
        imageUrl: ""
    });

    const handleChange = e => {
        console.log(e.target.name)
        setMedicine({ ...medicine, [e.target.name]: e.target.value });
    }

    const handleSubmit = (e) => {
        e.preventDefault()
        medicine.price = parseFloat(medicine.price)
        console.log(JSON.stringify(medicine))

        fetch(`http://localhost:8080/medicamentos/${id ? id : ""}`, {
            method: "POST",
            headers: {
                "Content-Type": "application/json"
            },
            body: JSON.stringify(medicine)
        }).then((response) => {
            if (response.ok) {
                alert("Remédio cadastrado")
            } else {
                console.log(response)
                throw new Error(`Erro! Status: ${response.status}`);
            }
        }).then(() => {
            window.location = `/produto`
        })
    }

    return (
        <>
            <S.Container>
                <S.Caixa>
                    <h1 className="titulo">Gerenciamento de Produtos</h1>
                    <S.Formulario>
                        <form onSubmit={handleSubmit}>
                            <S.DivFormTop>
                                <S.DivInput>
                                    <label>Nome do produto: *</label>
                                    <S.Input type="text" value={medicine.name} name="name" required onChange={handleChange} />
                                </S.DivInput>
                                <S.DivInputValor>
                                    <label>Valor unitário: *</label>
                                    <S.Input type="number" value={medicine.price} name="price" required onChange={handleChange} />
                                </S.DivInputValor>
                            </S.DivFormTop>
                            <S.DivInput>
                                <label>Imagem do produto: *</label>
                                <S.Input type="text" value={medicine.imageUrl} placeholder="Insira a URL da imagem" name="imageUrl" required onChange={handleChange} />
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