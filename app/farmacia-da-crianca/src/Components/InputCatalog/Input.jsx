import React from "react";
import * as S from "./input.js";

function Input(props) {
  return (
    <S.Pesquisa>
      <input
        onChange={props.onChange}
        type="text"
        placeholder="Procure o Medicamento"
      />
      <S.BTNPesquisa>
        <img src="/assets/icons/lupa.png" alt="" />
      </S.BTNPesquisa>
    </S.Pesquisa>
  );
}

export default Input;
