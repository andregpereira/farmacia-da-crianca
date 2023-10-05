import React from 'react';
import { NavLink, useNavigate } from "react-router-dom";


import * as S from "./header.js"

const Header = () => {
    return (
        <S.Header>
            
            <S.Logo>
            <NavLink  to="/"
             className={({ isActive }) => `nav_link${isActive ? " active" : ""}`}>Passos Mágicos</NavLink>
              </S.Logo>
              <S.Principal>
            <NavLink to="/produto"
             className={({ isActive }) => `nav_link${isActive ? " active" : ""}`}>CATÁLOGO</NavLink>
            <NavLink to="/criancas"
             className={({ isActive }) => `nav_link${isActive ? " active" : ""}`}>HISTÓRIA</NavLink>
            </S.Principal>
            
            <S.iconsHeader>
            <NavLink to="/login"
            className={({ isActive }) => `nav_link${isActive ? " active" : ""}`}>  <img src="/assets/icons/pessoa.png" alt=""/></NavLink>
            <NavLink to="/pagamento"
             className={({ isActive }) => `nav_link${isActive ? " active" : ""}`}><img src="/assets/icons/shopping-cart_icon-icons.com_72552.svg"/>
             </NavLink>
            </S.iconsHeader>

        </S.Header>
    );
};

export default Header;