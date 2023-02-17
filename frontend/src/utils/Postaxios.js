import axios from "axios";
function Postaxios (url,data) {
    return new Promise((resolve,reject) => {
        axios.post(url,data).then((response) => resolve(response)).catch((error) => reject(error));
    });
}
export default Postaxios;