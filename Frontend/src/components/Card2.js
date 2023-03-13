import React from 'react'
import { Button, Card, Container } from 'react-bootstrap'
import { CardBody, CardSubtitle, CardText, CardTitle } from 'reactstrap'

function Card2({library2}) {
 console.log(library2.title);
  return (
    
    <Card style={{ width:"18rem"}}>
      <Card.Img variant="top" src="images/tempstudypointimg" />
      <Card.Body>
        <Card.Title>{library2.title}</Card.Title>
        <Card.Text>
          {library2.description}
        </Card.Text>
        <Button variant="primary">{library2.buttonText}</Button>
      </Card.Body>
    </Card>
  )
}

export default Card2
