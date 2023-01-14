import { Fragment, useContext } from "react";
import { Link } from "react-router-dom";
import { GlobalContext } from "../../Context/GlobalState";


const Navbar = () => {
    const {user_id} = useContext(GlobalContext);
    if(user_id===null) {
        return(
            <Fragment>
            <nav>
                <ul>
                    <li><Link to="/airports">Airports</Link></li>
                    <li><Link to="/flights">Flights</Link></li>
                    <li><Link to="/login">Login</Link></li>
                    <li><Link to="/signup">Sign Up</Link></li>
                </ul>
            </nav>
        </Fragment>
        );
    }
    return(
        <>
            <nav>
                <ul>
                    <li><Link to="/airports">Airports</Link></li>
                    <li><Link to="/flights">Flights</Link></li>
                    <li><Link to='/logout'>Logout</Link></li>
                </ul>
            </nav>
        </>
    );
}

export default Navbar;