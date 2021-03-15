import React from 'react';
import {  BrowserRouter as Router,
       Switch,  Route,  Link} from "react-router-dom";

class NameEmp extends React.Component {
        constructor(props) {
          super(props);
          
          this.state = {
            employees: []
          };
        }
        componentDidMount() {
          fetch("http://localhost:8080/emp/getall")
          .then(res => res.json())
          .then(
            (result) => {
              this.setState({
                employees: result
              });
            }
          );
        }
    render() {
              return (
                <div>
                  <h2>Employees Data...</h2>
                  <table>
                    <thead>
                      <tr>
                        <th>ID</th>
                        <th>Name</th>
                         <th>Action</th>
                      </tr>
                    </thead>
                    <tbody> 
                    {this.state.employees.map(emp => (
                 <tr key={emp.id}>
                 <td>{emp.id}</td>
                <td>{emp.ename}</td>
        <td>  <Link to="/Detail" >Detail</Link>
      <Link to="/Edit">Edit</Link>
       <Link to="/Delete">Delete</Link>
</td>
                </tr>
                          ))}  
                    </tbody>
                  </table>
                </div>
                );
              }
          }
          
          export default NameEmp;            