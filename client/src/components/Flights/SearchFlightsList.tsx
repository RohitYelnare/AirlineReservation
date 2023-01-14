import { useContext } from "react";
import { GlobalContext } from "../../Context/GlobalState";
import FlightCard from "./FlightCard";



const SearchFlightsList = () => {
    const { searchFlights } = useContext(GlobalContext);

    return (
        <>
            <h1>Flight Results</h1>
            <ul>
                {searchFlights.map((flight: any) => (
                    <FlightCard flight={flight}/>
                ))}
            </ul>
        </>
    );
}

export default SearchFlightsList;