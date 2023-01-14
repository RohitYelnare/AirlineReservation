import { useContext, useState } from "react"
import { Link } from "react-router-dom";
import { GlobalContext } from "../../Context/GlobalState";


const AddAirport = () => {
    const [city, setCity] = useState('');
    const [country, setCountry] = useState('');
    const [code_id, setCode_id] = useState('');

    const {addAirport} = useContext(GlobalContext);

    const onSubmit = (e: any) => {
        e.preventDefault();

        const newAirport = {
            "city": city,
            "country": country,
            "code_id": code_id
        };

        addAirport(newAirport);
    }

    return (
        <>
            <h4 className='mt-2'>Add Airport</h4>
            <hr />
            <form onSubmit={onSubmit}>
                <div>
                    <label htmlFor="city">City</label>
                    <input type="text" value={city} onChange={(e) => setCity(e.target.value)} placeholder="Enter City" />
                </div>
                <div>
                    <label htmlFor="country">Country</label>
                    <input type="text" value={country} onChange={(e) => setCountry(e.target.value)} placeholder="Enter Country" />
                </div>
                <div>
                    <label htmlFor="code_id">Code</label>
                    <input type="text" value={code_id} onChange={(e) => setCode_id(e.target.value)} placeholder="Enter code" />
                </div>
                
                <button><Link to="/airports">Add Airport</Link></button>
            </form>
        </>
    );
}

export default AddAirport;