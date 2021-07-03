import logo from './logo.svg';
import './App.css';
import { BrowserRouter as Router, Route, Switch } from "react-router-dom";
import Home from './Pages/Home/Home.js'

function App() {
  return (
    <Router>
      <Switch>
        <Route exact path="/"> <Home /> </Route>
      </Switch>
    </Router>
  );
}

export default App;
