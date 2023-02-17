import axios from "axios";
function Deleteaxios (url) {
    return new Promise((resolve,reject) => {
        axios.delete(url).then((response) => resolve(response)).catch((error) => reject(error));
    });
}
export default Deleteaxios;