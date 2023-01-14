import { createContext, useReducer } from "react";
import AppReducer from "./AppReducer";
import axios from 'axios';


const initState: any = {
    user_id: null,
    name: null,
    email: null,
    password: null,
    mobile: null,
    admin: false,
    error: null,
    loading: true,
    airports: [],
    allFlights: [],
    flightSeats: [],
    searchFlights: [],
    userBookings: []
};

export const GlobalContext = createContext(initState);

export const GlobalProvider = (props: { children: any }) => {
    const [state, dispatch] = useReducer(AppReducer, initState);

    async function getAllAirports() {
        try {
            const res = await axios.get('http://localhost:8080/v1/api/getAirports');
            // console.log(res.data);
            dispatch({
                type: 'GET_AIRPORTS',
                payload: res.data
            });

        } catch (err: any) {
            dispatch({
                type: 'ERROR',
                payload: err.response.data.error
            });
        }
    }


    // Add Airport service
    async function addAirport(airport: Object) {
        const config = {
            headers: {
                'content-Type': 'application/json'
            }
        }

        try {
            const res = await axios.post('http://localhost:8080/v1/api/add', airport, config);
            dispatch({
                type: 'ADD_AIRPORT',
                payload: res.data
            });
        } catch (err: any) {
            dispatch({
                type: 'ERROR',
                payload: err.response.data.error
            });
        }
    }

    async function getAllFlights() {
        try {
            const res = await axios.get('http://localhost:8080/v1/api/allFlights');
            // console.log(res.data);
            dispatch({
                type: 'ALL_FLIGHTS',
                payload: res.data
            });

        } catch (err: any) {
            dispatch({
                type: 'ERROR',
                payload: err.response.data.error
            });
        }
    }

    async function loginUser(email: String, password: String) {

        try {
            const res = await axios.get('http://localhost:8080/v1/api/loginUser', { params: { email, password } });
            dispatch({
                type: 'LOGIN_USER',
                payload: res.data
            });
        } catch (err: any) {
            dispatch({
                type: 'ERROR',
                payload: err.response.data.error
            });
        }
    }

    async function logoutUser() {
        try {
            dispatch({
                type: 'LOGOUT_USER',
                payload: null
            })
        } catch (err: any) {
            dispatch({
                type: 'ERROR',
                payload: err.response.data.error
            })

        }
    }

    async function signupUser(user: Object) {
        const config = {
            headers: {
                'content-Type': 'application/json'
            }
        }
        try {
            const res = await axios.post('http://localhost:8080/v1/api/signup', user, config);
            dispatch({
                type: 'LOGIN_USER',
                payload: res.data
            })
        } catch (err: any) {
            dispatch({
                type: 'ERROR',
                payload: err.response.data.error
            })
        }
    }

    async function getFlightSeats(id: any) {
        try {
            const res = await axios.get('http://localhost:8080/v1/api/flightSeats', { params: { id } });
            dispatch({
                type: 'GET_FLIGHT_SEATS',
                payload: res.data
            })
        } catch (err: any) {
            dispatch({
                type: 'ERROR',
                payload: err.response.data.error
            })
        }
    }

    async function flightSearch(dept: String, arr: String, date: Date) {

        try {
            const res = await axios.get('http://localhost:8080/v1/api/search', { params: { dept, arr, date } });
            dispatch({
                type: 'SEARCH_FLIGHTS',
                payload: res.data
            })
        } catch (err: any) {
            dispatch({
                type: 'ERROR',
                payload: err.response.data.error
            })
        }
    }

    async function getUserBookings(id: any) {
        if (id === null) return;
        try {
            const res = await axios.get('http://localhost:8080/v1/api/booking', { params: { id } });

            dispatch({
                type: 'USER_BOOKINGS',
                payload: res.data
            })
        } catch (err: any) {
            dispatch({
                type: 'ERROR',
                payload: err.response.data.error
            })
        }
    }

    async function bookTicket(id: any, u_id: any) {
        if(u_id===null) return; 
        try {
            const res = await axios.get('http://localhost:8080/v1/api/book', { params: { id, u_id } });

            dispatch({
                type: 'BOOK',
                payload: res.data
            })
        } catch (err: any) {
            dispatch({
                type: 'ERROR',
                payload: err.response.data.error
            })
        }
    }


    return (
        <GlobalContext.Provider value={{
            user_id: state.user_id,
            name: state.name,
            email: state.email,
            password: state.password,
            mobile: state.mobile,
            admin: state.admin,
            error: state.error,
            loading: state.loading,
            airports: state.airports,
            allFlights: state.allFlights,
            flightSeats: state.flightSeats,
            searchFlights: state.searchFlights,
            userBookings: state.userBookings,
            getAllAirports,
            addAirport,
            getAllFlights,
            loginUser,
            logoutUser,
            signupUser,
            getFlightSeats,
            flightSearch,
            getUserBookings,
            bookTicket
        }}>
            {props.children}
        </GlobalContext.Provider>
    );
}