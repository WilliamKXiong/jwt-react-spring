import './Home.css'
import { Component } from 'react';
import logo from '../../logo.svg'

class Home extends Component {
  state = {
    users: []
  };

  async componentDidMount() {
    const response = await fetch('/user/all');
    const body = await response.json();
    this.setState({ users: body });
  }
  render() {
    const { users } = this.state;
    return (
      <div className="App">
        <header className="App-header">
          <img src={logo} className="App-logo" alt="logo" />
          <div className="App-intro">
            <h2>Users</h2>
            {users.map(user =>
              <div key={user.id}>
                [firstName={user.firstName}, lastName={user.lastName}]
              </div>
            )}
          </div>
        </header>
      </div>
    );
  }
}

export default Home;
