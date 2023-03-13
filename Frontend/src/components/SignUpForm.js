import { useState } from 'react';
import { Form, Button, Table } from 'react-bootstrap';

function SignUpForm() {
  const [firstName, setFirstName] = useState('');
  const [lastName, setLastName] = useState('');
  const [userID, setUserID] = useState('');
  const [password, setPassword] = useState('');
  const [confirmPassword, setConfirmPassword] = useState('');

  const handleSubmit = (event) => {
    event.preventDefault();
    // TODO: handle form submission
  };

  return (
    
    <div>

      
    <Form onSubmit={handleSubmit} style={{textAlign:"center",marginTop:"5%"}}>
      <h1>Sign Up</h1>
      <Form.Group controlId="firstName" style={{padding:"20px"}}>
        <Form.Label>First Name : </Form.Label>
        <Form.Control
          type="text"
          value={firstName}
          onChange={(event) => setFirstName(event.target.value)}
        />
        
      </Form.Group>
        
      <Form.Group controlId="lastName" style={{padding:"20px"}}>
        <Form.Label>Last Name : </Form.Label>
        <Form.Control
          type="text"
          value={lastName}
          onChange={(event) => setLastName(event.target.value)}
        />
      </Form.Group>

      <Form.Group controlId="userID" style={{padding:"20px"}}>
        <Form.Label>User ID : </Form.Label>
        <Form.Control
          type="text"
          value={userID}
          onChange={(event) => setUserID(event.target.value)}
        />
      </Form.Group>

      <Form.Group controlId="password" style={{padding:"20px"}}>
        <Form.Label>Password : </Form.Label>
        <Form.Control
          type="password"
          value={password}
          onChange={(event) => setPassword(event.target.value)}
        />
      </Form.Group>

      <Form.Group controlId="confirmPassword" style={{padding:"20px"}}>
        <Form.Label>Confirm Password : </Form.Label>
        <Form.Control
          type="password"
          value={confirmPassword}
          onChange={(event) => setConfirmPassword(event.target.value)}
        />
      </Form.Group>

      <Form.Group controlId="confirmPassword" style={{padding:"20px"}}>
        <Form.Label>Confirm Password : </Form.Label>
        <Form.Control
          type="password"
          value={confirmPassword}
          onChange={(event) => setConfirmPassword(event.target.value)}
        />
      </Form.Group>

      <Button variant="primary" type="submit">
        Sign Up
      </Button>
    </Form>

    <Form>
      <Form.Group className="mb-3" controlId="formBasicEmail">
        <Form.Label>Email address</Form.Label>
        <Form.Control type="email" placeholder="Enter email" />
        <Form.Text className="text-muted">
          We'll never share your email with anyone else.
        </Form.Text>
      </Form.Group>

      <Form.Group className="mb-3" controlId="formBasicPassword">
        <Form.Label>Password</Form.Label>
        <Form.Control type="password" placeholder="Password" />
      </Form.Group>
      <Form.Group className="mb-3" controlId="formBasicCheckbox">
        <Form.Check type="checkbox" label="Check me out" />
      </Form.Group>
      <Button variant="primary" type="submit">
        Submit
      </Button>
    </Form>

    </div>
  );
}

export default SignUpForm;
