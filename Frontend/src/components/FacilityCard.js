import React from 'react'
import { ListGroup } from 'react-bootstrap'

function FacilityCard ({libraryData}) {
  return (
    <div className="col-4 col-md-3 cool-lg-3 mx-0 mb-4">
            <div class="card p-0 overflow-hidden h-100 shadow" id="index" style={{border:"ridge"}}>
                <img class="card-img-top img-fluid" src={libraryData.libraryImgUrl} alt="" style={{width:"100%",height:"50%",border: "ridge"}}/>
                <div class="card-body text-center">
                <ListGroup className="list-group-flush">
        <ListGroup.Item><h5 class="card-title">{libraryData.libraryName}</h5></ListGroup.Item>
        <ListGroup.Item><h5 class="card-title">{libraryData.libraryLocation}</h5></ListGroup.Item>
        <ListGroup.Item><h5 class="card-text">{libraryData.labAdminMobileNo}</h5></ListGroup.Item>
        <ListGroup.Item><button class="btn btn-success" style={{paddingBottom:"5px",marginTop:"5px",width:"90%",height:"40px"}}>View Details</button></ListGroup.Item>
      </ListGroup>
        </div>
        </div>
        </div>
      
    
  )
}
export default FacilityCard
