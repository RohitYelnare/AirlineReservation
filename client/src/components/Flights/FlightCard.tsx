import { useContext } from "react";
import { Link } from "react-router-dom";
import { GlobalContext } from "../../Context/GlobalState";


const FlightCard = (props: {flight: any}) => {

    const{bookTicket, user_id} = useContext(GlobalContext);

    const onClick = (e: any) => {
        e.preventDefault();

        bookTicket(props.flight.flight_id, user_id);
    }

    return(
        <span>
            {props.flight.dept_code}, {props.flight.arr_code}, {props.flight.dept_date}, {props.flight.dept_time} to {props.flight.arr_time}
            {/* {props.flight.join(", ")} */}
            <button onClick={onClick}><Link to="/">BOOK</Link></button>
        </span>
    );
}

export default FlightCard;