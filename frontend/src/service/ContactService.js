import Getaxios from "../utils/Getaxios";
import Postaxios from "../utils/Postaxios";
import Deleteaxios from "../utils/Deleteaxios";
class ContactService {
    getAll = function (url,callback) {
        Getaxios(url).then((response) => {
            if(callback) {
                callback(response);
            }
        })
    }; 
    createContact = function (url,data,callback) {
        Postaxios(url,data).then((response) => {
            if(callback) {
                callback(response);
            }
        });
    };
    deleteContact = function (url,contactId,callback) {
        Deleteaxios(url + contactId).then((response) => {
            if(callback) {
                callback(response);
            }
        });
    };
}
const contactService = new ContactService();
export default contactService;