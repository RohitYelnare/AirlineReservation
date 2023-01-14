import { Fragment, useContext, useEffect } from "react";
import { Link } from "react-router-dom";
import { GlobalContext } from "../../Context/GlobalState";
import Flight from './Flight';


const Flights = () => {
    const {allFlights, getAllFlights} = useContext(GlobalContext);

    useEffect(()=> {
        getAllFlights();
    }, []);


    return(
        <Fragment>
            <h1>Flights</h1>
            
            <button><Link to='/search'>Search Flights</Link></button>

            {/* All Flights */}
            <ul>
                {allFlights.map((flight: any) => (
                   <Flight id={flight.flight_id} route_id={flight.route_id} fare={flight.fare} seats_left={flight.seats_left} dept_code={flight.dept_code} arr_code={flight.arr_code} dept_date={flight.dept_date} dept_time={flight.dept_time} arr_time={flight.arr_time} /> 
                ))}
            </ul>

        </Fragment>
    );
};

export default Flights;