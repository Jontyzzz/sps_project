import React from "react"
import { Routes, Route } from "react-router-dom"
//import logo from './logo.svg';
//import './App.css';
import loginp from "./images/loginp.png"
import userid from "./images/userid.jpg"
import passw from "./images/passw.png"
import Container from "reactstrap"
import SignUpPage from './components/SignUpPage';
import LogInPage from './components/LogInPage';
import Card1 from './components/Card1';
import Card3 from './components/Card3';
import '../node_modules/bootstrap/dist/css/bootstrap.min.css'
import Navbar1 from "./components/Navbar1"
import { About } from "./components/About"
import Carousel1 from './components/Home'
import NavBar2 from "./components/NavBar2"
import Login from "./components/LogIn"
import Signup from './components/Signup'
import ContactUs from "./components/ContactUs"


const App = () => {
  return (
    <>
      
      <Routes>

      <Route path='/' element={<Carousel1 />} />
      <Route path='/about' element={<About />} />
      <Route path='/libraries' Component={Login} />
      <Route path='/login' element={<Login />} />
      <Route path='/signup' element={<Signup />} />
      <Route path='/contact' element={<ContactUs />} />
      <Route path='/logout' element={<Carousel1 />} />



        

      </Routes>
     
    </>
    
  );
}

export default App;
