import React from 'react';
import {  BrowserRouter as Router,
   Switch,  Route,  Link} from "react-router-dom";
import Home from './components/Home';
 import Contact from './components/Contact';
 import About from './components/About';
import Nomatch from './components/Nomatch';
import header from './components/HeaderComponent';
import NameEmp from './components/NameEmp';
class App extends React.Component {
   render() {
      return (
  <div>
        <header/>
 <Router>
           <div>
             <nav>
 <Link to="/" >Home</Link>
  <Link to="/About">About</Link>
   <Link to="/Contact">Users</Link>
<Link to="/NameEmp">Employee List</Link>
                </nav>     
             {/* A <Switch> looks through its children <Route>s and renders the first one that matches the current URL. */}
             <Switch>
      <Route path="/About"><About /></Route>
      <Route path="/Contact"> <Contact /> </Route>  
<Route path="/NameEmp"><NameEmp/></Route>
<Route exact path="/">    <Home /></Route>
<Route path="/*"><Nomatch/></Route>

             </Switch>
           </div>
         </Router>
</div>
       );  
    }
}export default App;
