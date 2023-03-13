import React from 'react'
import Carousel from 'react-bootstrap/Carousel';
import NavBar2 from './NavBar2';

function Carousel1() {
  return (
    <div>
      <NavBar2 />
    <Carousel>
      <Carousel.Item interval={1000}>
        <img
          style={{width:"100%",height:"700px"}}
          className="d-block w-100"
          src="images/studypoint_carousel_8.jpg"

          alt="First slide"
        />
        <Carousel.Caption>
          <h1 style={{fontFamily:"cursive",color:"black"}}>"Organize Your Studies, Empower Your Future"</h1>

        </Carousel.Caption>
      </Carousel.Item>
      <Carousel.Item interval={500}>
        <img
          style={{width:"100%",height:"700px"}}
          className="d-block w-100"
          src="images/studypoint_carousel_7.jpg"
          alt="Second slide"
        />
        <Carousel.Caption>
        <h1 style={{fontFamily:"cursive",color:"black"}}>"A Library for Your Mind, A Key To Success"</h1>
        </Carousel.Caption>
      </Carousel.Item>
      <Carousel.Item>
        <img
          style={{width:"100%",height:"700px"}}
          className="d-block w-100"
          src="images/studypoint_carousel_6.jpg"
          alt="Third slide"
        />
        <Carousel.Caption style={{color:"black"}}>
          <h1>"Managing Your Studies Made Easy"</h1>
  
        </Carousel.Caption>
      </Carousel.Item>
    </Carousel>
    </div>
  )
  
}

export default Carousel1;
