import { BrowserRouter, Routes as Switch, Route } from "react-router-dom";
import { GlobalStyle } from "../Style/GlobalStyle";
import Header from "../Components/Header/Header.jsx";

import Home from "../Pages/Home/Home.jsx";
import Catalog from "../Pages/Catalog/Catalog.jsx";
const Routes = () => {
 //   const [login, setLogin] = useState(false);
  
    return (
      <BrowserRouter>
        <GlobalStyle />
        <Header /* login={login} setLogin={setLogin} *//>
        <Switch>

          <Route path="/produto" element={<Catalog/>} />
          <Route path="/criancas" element={<Home/>} />

          
        </Switch>
      </BrowserRouter>
    );
  };

  export default Routes