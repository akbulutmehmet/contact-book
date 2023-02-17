import  { useEffect, useState } from "react";
import contactService from "../service/ContactService";
import {Table,Button} from "react-bootstrap"
function ContactList () {
    const [contacts,setContacts] = useState([]);
    const [searchValue,setSearchValue] = useState('');
    const [filteredData,setFilteredData] = useState(contacts);
   
    useEffect(() => {
        contactService.getAll('http://localhost:8080/api/v1/contact/getAll',(response) => {
            setContacts(response.data);
            setFilteredData(response.data);
        });
    },[]);
   
    const deleteContactOnClick = (e,id) => {
        contactService.deleteContact('http://localhost:8080/api/v1/contact/delete/',id,(response) => {
          setContacts(contacts);
          setTimeout(() => {
            window.location.href = '';
          },2000)
        });
    };


    const handleOnChange = (search) => {
      setSearchValue(search);
      if(search !== '') {
        let updatedList = [...contacts];
      updatedList = updatedList.filter((item) => {
        return Object.values(item).join('').toLowerCase().includes(searchValue.toLowerCase());
      });
      setFilteredData(updatedList);
      }else {
        setFilteredData(contacts);
      }
      
  
    }
    return (<>
    <h1 className="display-4">Contact Book App</h1>
      <input type='search' className="form-control w-50 mb-1" placeholder="Search"
      onChange={(e) => handleOnChange(e.target.value)}
      />
        <Table striped bordered hover>
      <thead>
        <tr>
          <th>Id</th>
          <th>Name</th>
          <th>SurName</th>
          <th>Phone Number</th>
          <th>Process</th>
        </tr>
      </thead>
      <tbody>
        {filteredData.map((contact,key) => {
            return (<tr key={key}>
                <td>{contact.id}</td>
                <td>{contact.name}</td>
                <td>{contact.surName}</td>
                <td>{contact.phoneNumber}</td>
                <td>
                    <Button variant={"danger"} onClick={(e) => deleteContactOnClick(e,contact.id)} >Delete</Button>
                </td>
              </tr>)
        })}
        
      </tbody>
    </Table>

    </>);
}
export default ContactList;