import { Fragment, useContext, useEffect } from "react";
import { GlobalContext } from "../../Context/GlobalState";
import BookingList from "./BookingList";


const Home = () => {
    const { user_id, name, userBookings, getUserBookings } = useContext(GlobalContext);

    useEffect(() => {
        getUserBookings(user_id)
    }, user_id);

    if (user_id === null) {
        return (
            <h1>Login to see your bookings!</h1>
        );
    }
    return (
        <Fragment>
            <h1>Home</h1>
            <h2>Welcome {name}!</h2>
            <ul>
                {userBookings.map((booking: any) => {
                    if (booking === null || booking === undefined) booking = [];
                    return <BookingList booking={booking} flight_id={booking.flight_id} seat_no={booking.seat_no} dept_code={booking.dept_code} arr_code={booking.arr_code} dept_date={booking.dept_date} dept_time={booking.dept_time} />
                })}
            </ul>

        </Fragment>
    );
}

export default Home;