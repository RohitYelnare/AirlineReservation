import { useContext, useState } from "react";
import { GlobalContext } from "../../Context/GlobalState";


const Flight = (props: {id: any, route_id: Number, fare: Number, seats_left: Number, dept_code: String, arr_code: String, dept_date: any, dept_time: any, arr_time: any}) => {
    const [seats, setSeats] = useState([]);
    const {flightSeats, getFlightSeats} = useContext(GlobalContext);

    const findSeats = (e:any) => {
        e.preventDefault();

        getFlightSeats(props.id);

        setSeats(flightSeats);
    }

    return (
        <li>
            <div>{props.route_id}    {props.fare}    {props.seats_left}    {props.dept_code}    {props.arr_code}    {props.dept_date}    {props.dept_time}    {props.arr_time}    
            <button onClick={findSeats}>Seats Available</button>
            <div>{seats.length} seats available: {seats.join(", ")}</div>
            </div>
        </li>
    );
}

export default Flight;