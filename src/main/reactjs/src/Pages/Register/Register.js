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
                        </Form>
                    </Col>
                    <Col></Col>
                </Row>
            </Container>

        );
    }
}

export default Register;