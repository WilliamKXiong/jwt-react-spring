import './Register.css'
import { Component } from 'react';
import { Form, Row, Col, Container, Button } from 'react-bootstrap';
import 'bootstrap/dist/css/bootstrap.min.css'

class Register extends Component {
    render() {
        return (
            <Container>
                <Row>
                    <Col></Col>
                    <Col className="col-form">
                        <Form>
                            <Form.Group>
                                <span className="header-form">Register</span>
                            </Form.Group>
                            <Form.Group controlId="formBasicEmail">
                                <Form.Label>Email address</Form.Label>
                                <Form.Control type="email" placeholder="example@email.com" />
                            </Form.Group>

                            <Form.Group controlId="formBasicPassword" className="password-form">
                                <Form.Label>Password</Form.Label>
                                <Form.Control type="password" placeholder="Password" />
                            </Form.Group>
                            <Form.Group>
                                <Form.Label><a href="/register">Sign Up</a></Form.Label>
                            </Form.Group>
                            <Form.Group>
                                <Button variant="dark" type="submit">
                                    Submit
                                </Button>
                            </Form.Group>
                        </Form>
                    </Col>
                    <Col></Col>
                </Row>
            </Container>

        );
    }
}

export default Register;