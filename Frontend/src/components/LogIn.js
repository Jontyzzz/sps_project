import React, { useState } from 'react'
import Form from 'react-bootstrap/Form'
import Button from 'react-bootstrap/Button'
import SIgn_img from './SIgn_img'
import { Link, useNavigate } from 'react-router-dom'
import { ToastContainer, toast } from 'react-toastify';
import 'react-toastify/dist/ReactToastify.css';
import NavBar2 from './NavBar2'
import Navbar1 from './Navbar1'
import axios from 'axios'
import Card1 from './Card1'
import { Nav } from 'react-bootstrap'


const Login = () => {

    const navigate = useNavigate();

    const [showOtherComponent, setShowOtherComponent] = useState(false);
    const [inpval, setInpval] = useState({
        userId: "",
        password: ""
    })

    const [data, setData] = useState([]);
    console.log(inpval);

    const [Datas, setFormDatas] = useState({
    
        userId: "",
        password: "",
      });

        
      
      
    const getdata = (e) => {
        console.log(e.target.value);


        const { value, name } = e.target;
        console.log(value,name);



        setInpval(() => {
            return {
                ...inpval,
                [name]: value
            }
        })

    }

    const addData = (e) => {
        e.preventDefault();
      
      console.log(Datas)
      axios
      .post("http://localhost:9090/users/login", inpval)
      .then((response) => {
        console.log("Response:", response);
        <h1>Hello</h1>
        if(response.data.userId!=null && response.data.password!=null){
            setShowOtherComponent(true); 
            //<Link to='/libraries'/>
           // <Button onClick={() => navigate(Navbar1)}>Submit</Button>
           //<Link to='/libraries' >LogIn</Link>
        }
      })
      .catch((error) => {
        console.error("Error:", error);
        // Add code to handle error here
      });



        // const getuserArr = localStorage.getItem("user");
        // console.log(getuserArr);

        // const { email, password } = inpval;
        // if (email === "") {
        //     toast.error('email field is required', {
        //         position: "top-center",
        //     });
        // } else if (!email.includes("@")) {
        //     toast.error('plz enter valid email address!!', {
        //         position: "top-center",
        //     });
        // } else if (password === "") {
        //     toast.error('password field is required', {
        //         position: "top-center",
        //     });
        // } else if (password.length < 5) {
        //     toast.error('password length greater than five', {
        //         position: "top-center",
        //     });
        // } else {

        //     if (getuserArr && getuserArr.length) {
        //         const userdata = JSON.parse(getuserArr);
        //         const userlogin = userdata.filter((el, k) => {
        //             return el.email === email && el.password === password
        //         });

        //         if (userlogin.length === 0) {
        //             alert("invalid details")
        //         } else {
        //             console.log("user login successfully!!");

        //             localStorage.setItem("user_login", JSON.stringify(userlogin))

        //             history("/details")
        //         }
        //     }
        // }

    }

    return (
        <>
            <div className="container mt-3">
                <NavBar2/>
                <section className='d-flex justify-content-between'>
                    <div className="left_data mt-3 p-3" style={{ width: "100%" }}>
                        <b><h3 className='text-center col-lg-6'>Sign In</h3></b>
                        <Form >
                                
                            <Form.Group className="mb-3 col-lg-6" controlId="formBasicEmail">

                                <Form.Control type="text" name='userId' onChange={getdata} placeholder="Enter User ID" />
                            </Form.Group>

                            <Form.Group className="mb-3 col-lg-6" controlId="formBasicPassword">

                                <Form.Control type="password" name='password' onChange={getdata} placeholder="Password" />
                            </Form.Group>
                            <Button variant="primary" className='col-lg-6' onClick={addData} style={{ background: "rgb(67, 185, 127)" }} type="submit">
                                Submit
                            </Button>
                            {showOtherComponent && <Card1 />}              
                        </Form>
                        <div className='mt-2' style={{paddingLeft: '9%', fontSize:'18px'}}> New User? <a href='/signup'>Sign Up</a></div>
                    </div>
                    <div style={{padding:'2%'}}>

                    <SIgn_img />

                    </div>
                </section>
                <ToastContainer />
            </div>
        </>
    )
}

export default Login
