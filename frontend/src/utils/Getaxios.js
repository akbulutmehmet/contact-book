import axios from "axios";
function Getaxios (url) {
    return new Promise((resolve,reject) => {
        axios.get(url).then((response) => resolve(response)).catch((error) => reject(error));
    });
}
export default Getaxios;