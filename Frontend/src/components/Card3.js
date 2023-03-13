import React from "react";
import { Button, ListGroup } from "react-bootstrap";
import Card2 from "./Card2";

const Card3 = ({libraryData}) => {  

    const handleClick =()=>{
        <Card2 library2={libraryData}></Card2>
    }
    return(
        <>
     
        {console.log(libraryData)}
        {console.log(libraryData.libraryImgUrl)}
        <div className="col-4 col-md-3 col-lg-3 mx-0 mb-4">
            <div class="card p-0 overflow-hidden h-100 shadow" id="index" style={{border:"ridge"}}>
                <img class="card-img-top img-fluid" src={libraryData.libraryImgUrl} alt="" style={{width:"100%",height:"50%",border: "ridge"}}/>
                <div class="card-body text-center">
                <ListGroup className="list-group-flush">
        <ListGroup.Item><h5 class="card-title">{libraryData.libraryName}</h5></ListGroup.Item>
        <ListGroup.Item><h5 class="card-title">{libraryData.libraryLocation}</h5></ListGroup.Item>
        <ListGroup.Item><h5 class="card-text">{libraryData.labAdminMobileNo}</h5></ListGroup.Item>
        <ListGroup.Item><button class="btn btn-success mb-2" style={{paddingBottom:"5px",width:"90%",height:"40px"}}>View Details</button></ListGroup.Item>
      </ListGroup>
        </div>
        </div>
        </div>


        {/* <div className="container">
          <div className="row">
            <div className="">
              <div class="card col-3">
                <img class="card-img-top" src="images/tempstudypointimg.jpg" alt="" />
                <div class="card-body">
                  <h5 class="card-title">{library.title}</h5>
                  <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                  <a href="#" class="btn btn-primary">Read more</a>
                </div>
              </div>
            </div> */}
  
            {/* <div className="col-md-3">
              <div class="card">
                <img class="card-img-top" src="https://images.pexels.com/photos/3862632/pexels-photo-3862632.jpeg?auto=compress&cs=tinysrgb&w=600" alt="" />
                <div class="card-body">
                  <h5 class="card-title">Tech 1</h5>
                  <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                  <a href="#" class="btn btn-primary">Read more</a>
                </div>
              </div>
            </div>
            <div className="col-md-3">
              <div class="card">
                <img class="card-img-top" src="https://images.pexels.com/photos/3862632/pexels-photo-3862632.jpeg?auto=compress&cs=tinysrgb&w=600" alt="" />
                <div class="card-body">
                  <h5 class="card-title">Tech 1</h5>
                  <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                  <a href="#" class="btn btn-primary">Read more</a>
                </div>
              </div>
            </div>
            <div className="col-md-3">
              <div class="card">
                <img class="card-img-top" src="https://images.pexels.com/photos/3862632/pexels-photo-3862632.jpeg?auto=compress&cs=tinysrgb&w=600" alt="" />
                <div class="card-body">
                  <h5 class="card-title">Tech 1</h5>
                  <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                  <a href="#" class="btn btn-primary">Read more</a>
                </div>
              </div>
            </div> */}
          {/* </div>
        </div> */}
  
      </>
       

    );

}
export default Card3