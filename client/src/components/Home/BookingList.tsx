


const BookingList = (props: {booking: any, flight_id: any, seat_no: Number, dept_code: String, arr_code: String, dept_date: any, dept_time: any}) => {
    if(props.booking === null || props.booking === undefined) {
        return (<li><span></span></li>);
    }
    return (
        <li>
            <span>{props.flight_id}, {props.seat_no}, {props.dept_code}, {props.arr_code}, {props.dept_date}, {props.dept_time}</span>
        </li>
    );
}

export default BookingList;