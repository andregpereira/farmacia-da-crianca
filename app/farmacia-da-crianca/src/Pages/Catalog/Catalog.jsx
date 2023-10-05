import React, { useEffect, useState } from "react";
import Input from "../../Components/InputCatalog/Input.jsx";
import ViewProduct from "../../Components/ViewProduct/ViewProduct.jsx";

import * as S from "./catalog.js";
import { Link } from "react-router-dom";
import { api } from "../../Server/api.js";



const Catalog = () => {
    const [produtos, setProdutos] = useState([]);
  //  const [input, setInput] = useState("");
    useEffect(() => {
      api.get("/produtos").then((response) => {
        setProdutos(response.data);
        console.log(produtos);
      });
    }, []);
  
    return (
      <>
        <S.Container>
          <S.Caixa>
            <Input
              onChange={(e) => {
             //   setInput(e.target.value);
              }}
            />
            <S.Grid>
            {produtos.map((item) => {
                  return (
                    <Link
                      key={item.id}
                      to={`/produtos/${item.id}`}
                      className="link"
                    >
                      <ViewProduct
                        imagem={item.imagem}
                        preco={item.preco}
                        nome={item.nome}

                      />
                    </Link>
                  );
                })}
            </S.Grid>
          </S.Caixa>
        </S.Container>
       
      </>
    );
};

export default Catalog;