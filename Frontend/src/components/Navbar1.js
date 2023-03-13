import React from 'react'
import Container from 'react-bootstrap/Container';
import Nav from 'react-bootstrap/Nav';
import Navbar from 'react-bootstrap/Navbar';
import NavDropdown from 'react-bootstrap/NavDropdown';
import { NavLink } from 'react-router-dom';


function Navbar1(){
  return (
           
        <Navbar collapseOnSelect expand="lg" bg="dark" variant="dark">
        <Container>
        
        <Navbar.Brand href="#home">Study Point</Navbar.Brand>
        <Navbar.Toggle aria-controls="responsive-navbar-nav" />
        <Navbar.Collapse id="responsive-navbar-nav">
          
          
          <Nav className="me-auto">
            
            <Nav.Link href='/' style={{textDecoration:"none", color:"white", fontSize:"18px"}}>Home</Nav.Link>
            <Nav.Link href='/about' style={{textDecoration:"none", color:"white", fontSize:"18px"}}>About</Nav.Link>
            <Nav.Link href='/libraries' style={{textDecoration:"none", color:"white", fontSize:"18px"}}>Libraries</Nav.Link>
            <Nav.Link href='/contact' style={{textDecoration:"none", color:"white", fontSize:"18px"}}>Contact Us</Nav.Link>
            <NavDropdown title="Services" id="collasible-nav-dropdown">
              <NavDropdown.Item href="#action/3.1">Resources</NavDropdown.Item>
              <NavDropdown.Item href="#action/3.2">
              Facilities
              </NavDropdown.Item>
              <NavDropdown.Item href="#action/3.3">Mess</NavDropdown.Item>
              <NavDropdown.Divider />
              <NavDropdown.Item href="#action/3.4">
              Back
              </NavDropdown.Item>
            </NavDropdown>
          </Nav>
          <Nav>
            <Nav.Link href="/logout">Log out</Nav.Link>
            
              <Nav.Link eventKey={2} href="#memes">
            
            </Nav.Link>
          </Nav>
        </Navbar.Collapse>
      </Container>
    </Navbar>
    
  )
}

export default Navbar1
