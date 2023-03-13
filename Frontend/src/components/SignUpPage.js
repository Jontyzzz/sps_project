import React, { useState } from "react";
import { Container, Table, Form, Button } from "react-bootstrap";
import axios from "axios";


function SignUpPage() {
  const [formData, setFormData] = useState({
    firstName: "",
    lastName: "",
    userId: "",
    password: "",
    confirmPassword:"",
  });

  const [formErrors, setFormErrors] = useState({
    firstName: "",
    lastName: "",
    userId: "",
    password: "",
    confirmPassword: "",
  });
  const [Data, setFormDatas] = useState({
    firstName: "",
    lastName: "",
    userId: "",
    password: "",
  });

  const validateForm = () => {
    let errors = {};
    let isValid = true;

    if (!formData.firstName.trim()) {
      errors.firstName = "First name is required";
      isValid = false;
    }

    if (!formData.lastName.trim()) {
      errors.lastName = "Last name is required";
      isValid = false;
    }

    if (!formData.userId.trim()) {
      errors.userId = "User ID is required";
      isValid = false;
    }

    if (!formData.password.trim()) {
      errors.password = "Password is required";
      isValid = false;
    } else if (formData.password !== formData.confirmPassword) {
      errors.confirmPassword = "Passwords do not match";
      isValid = false;
    }

    setFormErrors(errors);


    return isValid;
  };

  const handleChange = (e) => {
    setFormData({ ...formData, [e.target.name]: e.target.value });
  };

  const handleSubmit = (e) => {
    e.preventDefault();

    if (validateForm()) {
      Data.firstName = formData.firstName;
      Data.lastName = formData.lastName;
      Data.userId = formData.userId;
      Data.password = formData.password;

      axios
      .put("http://localhost:9090/user", Data)
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
            <th colSpan="2">Sign Up</th>
          </tr>
        </thead>
        <tbody>
          <tr>
            <td>First Name:</td>
            <td>
              <Form.Control
                type="text"
                name="firstName"
                value={formData.firstName}
                onChange={handleChange}
                isInvalid={!!formErrors.firstName}
              />
              <Form.Control.Feedback type="invalid">
                {formErrors.firstName}
              </Form.Control.Feedback>
            </td>
          </tr>
          <tr>
            <td>Last Name:</td>
            <td>
              <Form.Control
                type="text"
                name="lastName"
                value={formData.lastName}
                onChange={handleChange}
                isInvalid={!!formErrors.lastName}
              />
              <Form.Control.Feedback type="invalid">
                {formErrors.lastName}
              </Form.Control.Feedback>
            </td>
          </tr>
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
          <tr>
            <td>Confirm Password:</td>
            <td>
              <Form.Control
                type="password"
                name="confirmPassword"
                value={formData.confirmPassword}
                onChange={handleChange}
                isInvalid={!!formErrors.confirmPassword}
              />
              <Form.Control.Feedback type="invalid">
                {formErrors.confirmPassword}
              </Form.Control.Feedback>
            </td>
          </tr>
        </tbody>
      </Table>
      <Button variant="primary" onClick={handleSubmit}>
        Sign Up
      </Button>
    </Container>
  );
}

export default SignUpPage;