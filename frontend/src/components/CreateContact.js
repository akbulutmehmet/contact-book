import {  useState } from "react";
import { Row,Col, Button } from "react-bootstrap";
import contactService from "../service/ContactService";
function CreateContact () {
    const [name,setName] = useState('');
    const [surName,setSurName] = useState('');
    const [phoneNumber,setPhoneNumber] = useState('');
    const handleOnClick = ()  => {
        
        const data = {
            'name': name,
            'surName':surName,
            'phoneNumber':phoneNumber
        };
        contactService.createContact('http://localhost:8080/api/v1/contact/create',data,(response) => {
            window.location.href = '';
        });
    };
    
    return (
        <>
            <Row>
            
            <Col >
                    <div className="form-group">
    <label htmlFor="name">Name</label>
    <input required type="text" className="form-control" id="name" aria-describedby="emailHelp" placeholder="Name"
    onChange={(e) => {
       setName(e.target.value);
    }}
    />
            </div>
                    </Col>
                    <Col >
                    <div className="form-group">
    <label htmlFor="surname">SurName</label>
    <input required type="text" className="form-control" id="surname" aria-describedby="emailHelp" placeholder="SurName" 
    onChange={(e) => {
        setSurName(e.target.value);
    }}
    />
            </div>
                    </Col>
                    <Col >
                    <div className="form-group">
    <label htmlFor="phone">Phone</label>
    <input required type="number" className="form-control" id="phone" aria-describedby="emailHelp" placeholder="Phone" 
    onChange={(e) => {
        setPhoneNumber(e.target.value);
    }}
    />
            </div>
                    </Col>
                    <Col >
                    <Button  variant="success" onClick={handleOnClick}>ADD</Button>
                    </Col>
            
            </Row>
            
        </>
    );
}
export default CreateContact;