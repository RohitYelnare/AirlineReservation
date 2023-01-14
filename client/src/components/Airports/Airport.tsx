


const Airport = (props: {city: String, country: String, code_id: String}) => {
    return (
        <li>
            <span>{props.country}    {props.city}    {props.code_id}</span>
        </li>
    );
}

export default Airport;