import { Component } from "react";

export default class AddEmp extends Component{
    constructor(props) {
              super(props);
              
              this.state = {
                Message: ''
              };
            }
        
 onCreateEmployee=()=>{      let Empdemo={
                		 "id":this.refs.id.value,
               		  "ename":this.refs.ename.value,
               		  "gender":this.refs.gender.value,
          			    "annualSalary":this.refs.annualSalary.value,
         		               "dateOfBirth":this.refs.dateOfBirth.value
};
  let demo= JSON.stringify(Empdemo);
          console.log(JSON.parse(demo));
          fetch("http://localhost:8080/emp/add",{
        method: 'POST',
        headers:{'Content-type':'application/json'},
          body: demo
      }).then(r=>{r.json()}).then(res=>{
    if(res){ this.setState({message:'New Employee is Created Successfully'});
        }
      });
      }
    
 render(){
          return(   
         <div>  <h2>Please Enter Employee Details...</h2>
     <p><label>Employee ID : <input type="text"  ref="id"></input></label> </p>
     <p><label>Employee Name : <input type="text" ref="ename"></input></label>        </p>
     <p><label>Employee gender : <input type="text" ref="gender"></input></label>          </p>
    <p><label>Employee annualSalary : <input type="text" ref="annualSalary"></input></label>     </p>
    <p><label>Employee DOB: <input type="text" ref="dateOfBirth"></input></label> </p>               
    <button onClick={this.onCreateEmployee}>Create</button>    </div>     
    )  
 }
}
   
    
    