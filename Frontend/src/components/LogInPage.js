import React, { useState } from "react";
import { Container, Table, Form, Button } from "react-bootstrap";
import axios from "axios";


function LogInPage() {
  const [formData, setFormData] = useState({
    userId: "",
    password: "",
  });

  const [formErrors, setFormErrors] = useState({
    userId: "",
    password: "",
  });
  const [Data, setFormDatas] = useState({
    userId: "",
    password: "",
  });

  const validateForm = () => {
    let errors = {};
    let isValid = true;

    if (!formData.userId.trim()) {
      errors.userId = "User ID is required";
      isValid = false;
    }

    if (!formData.password.trim()) {
      errors.password = "Password is required";
      isValid = false;
     } // else if (formData.password !== formData.confirmPassword) {
    //   errors.confirmPassword = "Passwords do not match";
    //   isValid = false;
    // }

    setFormErrors(errors);


    return isValid;
  };

  const handleChange = (e) => {
    setFormData({ ...formData, [e.target.name]: e.target.value });
  };

  const handleSubmit = (e) => {
    e.preventDefault();

    if (validateForm()) {
      Data.userId = formData.userId;
      Data.password = formData.password;

      axios
      .post("http://localhost:9090/users/login", Data)
      .then((response) => {
        console.log("Response:", response);
        
      })
      .catch((error) => {
        console.error("Error:", error);
        // Add code to handle error here
      });

    }
  };

  return (
    <Container>
      <Table striped bordered hover>
        <thead>
          <tr>
            <th colSpan="2">Log In</th>
          </tr>
        </thead>
        <tbody>
          
          <tr>
            <td>User ID:</td>
            <td>
              <Form.Control
                type="text"
                name="userId"
                value={formData.userId}
                onChange={handleChange}
                isInvalid={!!formErrors.userId}
              />
              <Form.Control.Feedback type="invalid">
                {formErrors.userId}
              </Form.Control.Feedback>
            </td>
          </tr>
          <tr>
            <td>Password:</td>
            <td>
              <Form.Control
                type="password"
                name="password"
                value={formData.password}
                onChange={handleChange}
                isInvalid={!!formErrors.password}
              />
              <Form.Control.Feedback type="invalid">
                {formErrors.password}
              </Form.Control.Feedback>
            </td>
          </tr>
         
        </tbody>
      </Table>
      <Button variant="primary" onClick={handleSubmit}>
       Log In
      </Button>
    </Container>
  );
}

export default LogInPage;