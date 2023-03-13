import axios from "axios";
import React, { useEffect, useState } from "react";
import { Card, Button, Row, Col } from "react-bootstrap";
import Card3 from "./Card3";
import NavBar1 from "./Navbar1";
//import NavBar2 from "./NavBar2";


function Card1() {


  const[LibraryData,setLibraryData]=useState([])
  useEffect(()=>{
    axios.get("http://localhost:9090/libraries/getall").then(res=>{
      console.log("Getting from Localhost : ",res.data)
      setLibraryData(res.data)
    }).catch(err=>console.log(err))
  },[]);
  

  const cardData = [
    {
      title: "Card 1",
      description: "This is the first card.",
      buttonText: "Go to page 1",
      buttonLink: "#"
    },
    {
      title: "Card 2",
      description: "This is the second card.",
      buttonText: "Go to page 2",
      buttonLink: "#"
    },
    {
      title: "Card 3",
      description: "This is the third card.",
      buttonText: "Go to page 3",
      buttonLink: "#"
    },
    {
      title: "Card 4",
      description: "This is the third card.",
      buttonText: "Go to page 3",
      buttonLink: "#"
    },
    {
      title: "Card 5",
      description: "This is the third card.",
      buttonText: "Go to page 3",
      buttonLink: "#"
    },
    {
      title: "Card 6",
      description: "This is the third card.",
      buttonText: "Go to page 3",
      buttonLink: "#"
    },
    {
      title: "Card 7",
      description: "This is the third card.",
      buttonText: "Go to page 3",
      buttonLink: "#"
    },
    {
      title: "Card 8",
      description: "This is the third card.",
      buttonText: "Go to page 3",
      buttonLink: "#"
    }
  ];


  return (

    <div style={{backgroundColor:"whitesmoke"}}>
      <NavBar1 />
      <h1 className="text-center mt-0" style={{backgroundColor:"cyan"}}>All Libraries</h1>
      
      <section className="py-4 container">
        <div className="row justify-content-center">

          {LibraryData.map((library,index)=>
            {
              return(
                <Card3 libraryData={library}/>
              )
            }
          
          )}

        </div>

      </section>

      {/* {
        cardData.length > 0 ? cardData.map((item) =>
          <div className="container">
            <div className="row">
              <div className="col-md-3">
              <div class="card">
                <img class="card-img-top" src="images/tempstudypointimg.jpg" alt=""/>
                <div class="card-body">
                  <h5 class="card-title">Title</h5>
                  <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                  <a href="#" class="btn btn-primary">Read more</a>
                </div>
              </div>
            </div>
            </div>
          </div>
        ) : "No Libraries"
      } */}


    </div>
  );




  //   return (


  //   <Card style={{ width: "18rem",textAlign:"center"}}>
  //     <Card.Body>
  //       <Card.Title>{title}</Card.Title>
  //       <Card.Text>{description}</Card.Text>
  //       <Button href={buttonLink} variant="primary">{buttonText}</Button>
  //     </Card.Body>
  //   </Card>
  // )

};

export default Card1;
