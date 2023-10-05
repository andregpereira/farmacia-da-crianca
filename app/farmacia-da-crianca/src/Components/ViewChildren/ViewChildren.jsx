import React from "react";
import * as S from "./ViewChildren.js";
import { Link } from "react-router-dom";


function ViewChildren(props) {
  return (
    <S.Card>
      <img src={props.imagem} alt="" />
      <p className=".titulo">{props.titulo}</p>
    </S.Card>
  );
}

export default ViewChildren