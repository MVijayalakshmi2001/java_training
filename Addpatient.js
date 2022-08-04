import React,{useState,useEffect} from 'react'
import axios from 'axios';

export const AddPatient = () => {
const [patient,setPatient] = useState({})


const handleSubmit=(event)=>{
event.preventDefault();
console.log(patient);
axios.post("http://localhost:7074/api/v1/patients",patient).
then(response =>console.log(response.status))

}
const handleChange =(event) =>{
let name=event.target.name;
let value = event.target.value;
setPatient(obj => ({...obj,[name]: value}))
}

return (
<div>
<form onSubmit={handleSubmit}>
<div className='form-group'>
<label htmlFor="">Patient Id</label>
<input type="text" name='patientId' onChange={handleChange}
className='form-control'/>
</div>

<div className='form-group'>
<label htmlFor="">Patient Name</label>
<input type="text" name='patientName' onChange={handleChange}
className='form-control'/>
</div>

<div className='form-group'><label htmlFor="">Blood Group</label>
<input type="text" name='bloodGroup' onChange={handleChange}
className='form-control'/>

</div>

<div className='form-group'><label htmlFor="">Age</label>
<input type="number" name='age' onChange={handleChange}
className='form-control'/>
</div>

<div className='form-group'><label htmlFor="">Location</label>
<input type="text" name='location' onChange={handleChange}
className='form-control'/>
</div>

<div className='form-group'>
<label htmlFor="">mobileNumber</label>
<input type="text" name='mobileNumber'onChange={handleChange}
className='form-control' />
</div>


<input type='submit' value="Add" className='btn btn-info'></input>
</form>
</div>
)
}
