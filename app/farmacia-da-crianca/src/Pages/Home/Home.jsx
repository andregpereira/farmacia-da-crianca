import React, {useEffect, useState} from "react";
import ViewChildren from "../../Components/ViewChildren/ViewChildren.jsx";

import * as S from "./home.js";
import { Link } from "react-router-dom";
import { api } from "../../Server/api.js";
import Input from "../../Components/InputCatalog/Input.jsx";




const Home = () => {
    const [crianca, setCrianca] = useState([]);
      useEffect(() => {
        api.get("/criancas").then((response) => {
          setCrianca(response.data);
          console.log(crianca);
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
              {crianca.map((item) => {
                    return (
                      <Link
                        key={item.id}
                        to={`/criancas/${item.id}`}
                        className="link"
                      >
                        <ViewChildren
                          titulo={item.titulo}
                          imagem={item.imagem}
                          historia={item.historia}
  
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

export default Home;