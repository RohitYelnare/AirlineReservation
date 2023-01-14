import { useContext, useState } from "react";
import { Link } from "react-router-dom";
import { GlobalContext } from "../../Context/GlobalState";


const Signup = () => {
    const [name, setName] = useState('');
    const [mobile, setMobile] =useState('');
    const [mail, setMail] = useState('');
    const [pwd, setPwd] = useState('');

    const {signupUser} = useContext(GlobalContext);

    const onSubmit = (e: any) => {
        e.preventDefault();

        const user = {
            name: name,
            email: mail,
            password: pwd,
            mobile: mobile,
            admin: false
        }

        signupUser(user);
    }
    
    return (
        <>
            <h1>Sign Up</h1>
            <hr />
            <form onSubmit={onSubmit}>
                <div>
                    <label htmlFor="name">Name</label>
                    <input type="name" value={name} onChange={(e) => setName(e.target.value)} placeholder="Enter Name" />
                </div>
                <div>
                    <label htmlFor="mobile">Mobile</label>
                    <input type="mobile" value={mobile} onChange={(e) => setMobile(e.target.value)} placeholder="Enter Mobile" />
                </div>
                <div>
                    <label htmlFor="Mail">Email</label>
                    <input type="email" value={mail} onChange={(e) => setMail(e.target.value)} placeholder="Enter Email" />
                </div>
                <div>
                    <label htmlFor="Password">Password</label>
                    <input type="password" value={pwd} onChange={(e) => setPwd(e.target.value)} placeholder="Enter Password" />
                </div>

                <button><Link to="/" >Signup</Link></button>
            </form>
        </>
    );
}

export default Signup;