import './App.css';
import { BrowserRouter as Router, Route, Switch } from "react-router-dom";
import Home from './Pages/Home/Home.js'
import Login from './Pages/Login/Login.js'
import Register from './Pages/Register/Register';

function App() {
  return (
    <Router>
      <Switch>
        <Route exact path="/"> <Home /> </Route>
        <Route exact path="/login"> <Login /> </Route>
        <Route exact path="/register"> <Register /> </Route>
      </Switch>
    </Router>
  );
}

export default App;
