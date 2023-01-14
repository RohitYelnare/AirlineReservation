import { useContext, useState } from "react";
import { Link } from "react-router-dom";
import { GlobalContext } from "../../Context/GlobalState";



const SearchFlights = () => {

    const [dept, setDept] = useState('');
    const [arr, setArr] = useState('');
    const [date, setDate] = useState('');

    const { flightSearch } = useContext(GlobalContext);

    const onSubmit = (e: any) => {
        e.preventDefault();

        let myDate = new Date(date);

        flightSearch(dept, arr, myDate);
    }


    return (
        <>
            <h1>Search Flights</h1>
            <form onSubmit={onSubmit}>
                <div>
                    <label htmlFor="dept">Departure</label>
                    <input type="text" value={dept} onChange={(e) => setDept(e.target.value)} placeholder="Enter Departure City" />
                </div>
                <div>
                    <label htmlFor="arr">Country</label>
                    <input type="text" value={arr} onChange={(e) => setArr(e.target.value)} placeholder="Enter Arrival Country" />
                </div>
                <div>
                    <label htmlFor="date">Code</label>
                    <input type="date" value={date} onChange={(e) => setDate(e.target.value)} placeholder="Enter date" />
                </div>

                <button><Link to='/searchFlights'>Search</Link></button>
            </form>
        </>
    );
}

export default SearchFlights;