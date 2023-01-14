import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import Navbar from './components/Navbar/Navbar';
import Home from './components/Home/Home';

import './App.css';
import Airports from './components/Airports/AirportsList';
import Flights from './components/Flights/FlightsList';
import { GlobalProvider } from './Context/GlobalState';
import AddAirport from './components/Airports/AddAirport';
import Login from './components/Login/Login';
import SearchFlights from './components/Flights/SearchFlights';
import SearchFlightsList from './components/Flights/SearchFlightsList';
import Logout from './components/Login/Logout';
import Signup from './components/Login/Signup';

function App() {
  return (
    <GlobalProvider>
      <Router>
        <Navbar />
        <div className='App'>
          <Routes>
            <Route path="/" element={<Home />} />
            <Route path="/airports" element={<Airports />} />
            <Route path="/flights" element={<Flights />} />
            <Route path="/addAirport" element={<AddAirport />} />
            <Route path="/login" element={<Login />} />
            <Route path="/signup" element={<Signup />} />
            <Route path="/search" element={<SearchFlights />}></Route>
            <Route path="/searchFlights" element={< SearchFlightsList />} />
            <Route path="/logout" element={<Logout />} />
          </Routes>
        </div>
      </Router>
    </GlobalProvider> 
  );
}

export default App;
