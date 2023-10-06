import styled from "styled-components";
import { colors } from "../../Style/GlobalStyle.js";

export const Container = styled.main`
  width: 100%;
  height: auto;
  min-height: 180vh;
`;

export const Caixa = styled.div`
  width: 90%;
  height: 90%;
  margin: 3%;
  border-radius: 10px;
  .titulo {
    font-family: ${colors.titles};
  }
`;

export const Formulario = styled.div`
  display: flex;
  flex-direction: row;
  justify-content: center;
  margin-top: 50px;
`;

export const Input = styled.input`
    padding: 10px;
    margin-top: 5px;
    margin-bottom: 10px;
    border: 1px solid #ccc;
    border-radius: 5px;
    outline: none;
`

export const Botao = styled.input`
    width: 40%;
    padding: 12px;
    margin-top: 30px;
    border: 0px;
    border-radius: 5px;
    outline: none;
    background-color: #B7D6FF;
    justify-self: end;
    box-shadow: 0px 0px 30px -5px rgba(176,176,176,1);
`

export const DivInput = styled.div`
    display: flex;
    flex-direction: column
`

export const DivInputValor = styled.div`
    display: flex;
    flex-direction: column;
    margin-left: 20px
`

export const DivFormTop = styled.div`
    display: flex;
    flex-direction: row;
`

export const DivFormBottom = styled.div`
    display: flex;
    justify-self: end;
`