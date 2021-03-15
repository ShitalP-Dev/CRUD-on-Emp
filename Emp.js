import React from 'react';

class Emp extends React.Component {
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
                        <th>Gender</th>
                        <th>annualSalary</th>
                        <th>dateOfBirth</th>
                      </tr>
                    </thead>
                    <tbody> 
                    {this.state.employees.map(emp => (
                 <tr key={emp.id}>
                 <td>{emp.id}</td>
                <td>{emp.ename}</td>
                <td>{emp.gender}</td>
                <td>{emp.annualSalary}</td>
                <td>{emp.dateOfBirth}</td>
                </tr>
                          ))}  
                    </tbody>
                  </table>
                </div>
                );
              }
          }
          
          export default Emp;            