import { Container,Row,Col } from "react-bootstrap";
import ContactList from "./components/ContactList";
import CreateContact from "./components/CreateContact";
function App() {
  return (
    
    <>
      <Container>
        <Row>
          
          <Col>
          <ContactList />
          <CreateContact />
          </Col>
        </Row>
      </Container>
    </>
  );
}

export default App;
