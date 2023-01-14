import { useContext } from "react";
import { Link } from "react-router-dom";
import { GlobalContext } from "../../Context/GlobalState";



const Logout = () => {

    const { logoutUser } = useContext(GlobalContext);

    const logout = (e:any) => {
        e.preventDefault();

        logoutUser();
    }
    return(
        <>
            <h1>Logout</h1>
            <hr/>
            <button onClick={logout}><Link to="/">confirm</Link></button>
        </>
    );
}

export default Logout;