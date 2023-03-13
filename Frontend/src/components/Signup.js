import React, { useState } from 'react'
import Form from 'react-bootstrap/Form'
import Button from 'react-bootstrap/Button'
import SIgn_img from './SIgn_img'
import { NavLink } from 'react-router-dom'
import { useNavigate } from 'react-router-dom'
import { ToastContainer, toast } from 'react-toastify';
import 'react-toastify/dist/ReactToastify.css';
import axios from 'axios'
import NavBar2 from './NavBar2'


const Home = () => {

    const history = useNavigate();

    const [inpval, setInpval] = useState({
        firstName: "",
        lastName: "",
        userId: "",
        password: "",
        cpassword:""
        // cpassword:""
        
    })

    const [datas, setDatas] = useState({
        firstName: "",
        lastName: "",
        userId: "",
        password: ""
        // cpassword:""
    })
   

    const [data,setData] = useState([]);
    console.log(inpval);

    const getdata = (e) => {
        // console.log(e.target.value);


        const { value, name } = e.target;
        // console.log(value,name);


        setInpval(() => {
            return {
                ...inpval,
                [name]: value
            }
        })

    }

    const addData = (e) => {
        e.preventDefault();

        const { firstName, lastName, userId , password,cpassword } = inpval;

        if (firstName === "") {
            toast.error(' First Name field is reqiured!!',{
                position: "top-center",
            });
        } else if (lastName === "") {
             toast.error('last Name field is required!!',{
                position: "top-center",
            });
        } else if (!userId.includes("@")) {
             toast.error('please enter valid UserID address!!',{
                position: "top-center",
            });
        // } else if (date === "") {
        //      toast.error('date field is requred',{
        //         position: "top-center",
        //     });
        } else if (password === "") {
             toast.error('password field is required!!',{
                position: "top-center",
            });
        } else if (password.length < 5) {
             toast.error('password length greater than five',{
                position: "top-center",
            });
          }  else if (cpassword === "") {
                toast.error('password field is required!!',{
                   position: "top-center",
               });
           } else if (cpassword.length < 5) {
                toast.error('password length greater than five',{
                   position: "top-center",
               });
        }else if(password===cpassword) {

            datas.firstName=inpval.firstName;
            datas.lastName = inpval.lastName;
            datas.userId = inpval.userId;
            datas.password = inpval.password;
            
            
            axios
            .post("http://localhost:9090/user", datas)
            .then((response) => {
            console.log("Response:", response);
        
            })
            .catch((error) => {
            console.error("Error:", error);
            // Add code to handle error here
            });

            console.log("Data added succesfully");
            history("/login")
            localStorage.setItem("user",JSON.stringify([...data,inpval]));
        }else{
            toast.error('password and Confirm password not Matched',{
                position: "top-center",
            });
        }

        }

    
    return (
        <>
            <div className="container mt-3">
            <NavBar2/>
                <section className='d-flex justify-content-between'>
                    <div className="left_data mt-3 p-3" style={{ width: "100%" }}>
                        <h3 className='text-center col-lg-6'>Sign Up</h3>
                        <Form >
                            <Form.Group className="mb-3 col-lg-7" controlId="formBasicEmail">

                                <Form.Control type="text" name='firstName' onChange={getdata} placeholder="Enter First Name" />
                            </Form.Group>
                            <Form.Group className="mb-3 col-lg-7" controlId="formBasicEmail">

                            <Form.Control type="text" name='lastName' onChange={getdata} placeholder="Enter Last Name" />
                            </Form.Group>
                            <Form.Group className="mb-3 col-lg-7" controlId="formBasicEmail">

                                <Form.Control type="text" name='userId' onChange={getdata} placeholder="Enter User ID" />
                            </Form.Group>

                            <Form.Group className="mb-3 col-lg-7" controlId="formBasicEmail">

                            <Form.Control type="password" name='password' onChange={getdata} placeholder="Password" />
                            </Form.Group>

                            <Form.Group className="mb-3 col-lg-7" controlId="formBasicEmail">


                            <Form.Control type="password" name='cpassword' onChange={getdata} placeholder="Confirm Password" />
                            </Form.Group>
                            <Button variant="secondary" onClick={addData} className='col-lg-7' style={{ background: "rgb(67, 185, 127)" }} type="submit">
                                Submit
                            </Button>
                        </Form>
                          
                          <div className='mt-2' style={{paddingLeft: '5%', fontSize:'18px'}}>

                        Already Have an Account? <a href="/login">Sign In</a>

                          </div>
                    </div>
                    <SIgn_img />
                </section>
                <ToastContainer />
            </div>
        </>
    )
}

export default Home
