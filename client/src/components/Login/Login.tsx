import { useState, useContext } from "react";
import { Link } from "react-router-dom";
import { GlobalContext } from "../../Context/GlobalState";


const Login = () => {
    const [mail, setMail] = useState('');
    const [pwd, setPwd] = useState('');

    const {user_id, loginUser} = useContext(GlobalContext);

    const onSubmit = (e: any) => {
        e.preventDefault();

        loginUser(mail, pwd);
    }


    return (
        <>
            <h1>Login</h1>
            <hr />
            <form onSubmit={onSubmit}>
                <div>
                    <label htmlFor="Mail">Email</label>
                    <input type="email" value={mail} onChange={(e) => setMail(e.target.value)} placeholder="Enter Email" />
                </div>
                <div>
                    <label htmlFor="Password">Password</label>
                    <input type="password" value={pwd} onChange={(e) => setPwd(e.target.value)} placeholder="Enter Password" />
                </div>

                <button><Link to="/" >Login</Link></button>
            </form>
        </>
    );
}

export default Login;