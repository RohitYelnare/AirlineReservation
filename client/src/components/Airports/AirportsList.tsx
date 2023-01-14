import { Fragment, useContext, useEffect } from "react";
import { Link } from "react-router-dom";
import { GlobalContext } from "../../Context/GlobalState";
import Airport from "./Airport";


const Airports = () => {

    const { airports, getAllAirports } = useContext(GlobalContext);

    useEffect(() => {
        getAllAirports();
    }, []);
    
    return (
        <Fragment>
            <h1>Airports</h1>

            <ul>
                {airports.map((airport:any) => (
                    <Airport city={airport.city} country={airport.country} code_id={airport.code_id} /> 
                ))}
            </ul>


            <button><Link to="/addAirport">New Airport</Link></button>
        </Fragment>
    );
};

export default Airports;