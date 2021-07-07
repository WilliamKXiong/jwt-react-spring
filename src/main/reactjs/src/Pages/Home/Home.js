import './Home.css'
import { Component } from 'react';
import logo from '../../logo.svg'

class Home extends Component {
  state = { //create user json
    persons: []
  };

  async componentDidMount() {
    const response = await fetch('/person/all');
    const body = await response.json(); //get json from requestmapping from backend
    this.setState({ persons: body }); //set users json
  }
  render() {
    const { persons } = this.state; 
    return (
      <div className="App">
        <header className="App-header">
          <img src={logo} className="App-logo" alt="logo" />
          <div className="App-intro">
            <h2><a href="/login">Persons</a></h2>
            {persons.map(user =>
              <div key={user.id}>
                [firstName={user.firstName}, lastName={user.lastName}, email={user.email}]
              </div>
            )}
          </div>
        </header>
      </div>
    );
  }
}

export default Home;
