/* eslint-disable import/no-anonymous-default-export */

export default (state: any, action: { type: any; payload: any; }) => {
    switch (action.type) {

        case 'GET_AIRPORTS':
            return {
                ...state,
                airports: action.payload   
            }

        case 'ALL_FLIGHTS':
            return {
                ...state,
                allFlights: action.payload
            }

        case 'ADD_AIRPORT':
            return {
                ...state,
                airports: [...state.airports, action.payload]
            }


        case 'TRANSACTION_ERROR':
            return {
                ...state,
                error: action.payload
            }

        case 'LOGIN_USER':
            return {
                ...state,
                name: action.payload.name,
                user_id: action.payload.user_id,
                email: action.payload.email,
                password: action.payload.password,
                mobile: action.payload.mobile,
                admin: action.payload.admin
            }

        case 'LOGOUT_USER':
            return {
                ...state,
                name: null,
                user_id: null,
                email: null,
                password: null,
                mobile: null,
                admin: false
            }

        case 'GET_FLIGHT_SEATS':
            return {
                ...state,
                flightSeats: action.payload
            }

        case 'SEARCH_FLIGHTS':
            return {
                ...state,
                searchFlights: action.payload
            }

        case 'USER_BOOKINGS':
            return {
                ...state,
                userBookings: action.payload
            }

        case 'BOOK':
            return {
                ...state,
                userBookings: [...state.userBookings, action.payload]
            }

        default:
            return state;
    }
}