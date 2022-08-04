import React,{useState,useEffect} from 'react'
import axios from 'axios';

export const AddDonar = () => {
const [donar,setDonar] = useState({})

const handleSubmit=(event)=>{
event.preventDefault();
console.log(donar);
axios.post("http://localhost:6068/api/v1/donors",donar).
then(response =>console.log(response.status))

}
const handleChange =(event) =>{
let name=event.target.name;
let value = event.target.value;
setDonar(obj => ({...obj,[name]: value}))
}
return (
<div>
<form onSubmit={handleSubmit}>
<div className='form-group'>
<label htmlFor="">Donar Name</label>
<input type="text" name='donarName' onChange={handleChange}
className='form-control'/>
</div>

<div className='form-group'>
<label htmlFor="">mobileNumber</label>
<input type="text" name='mobileNumber'onChange={handleChange}
className='form-control' />
</div>

<div className='form-group'><label htmlFor="">Blood Group</label>
<input type="text" name='bloodGroup' onChange={handleChange}
className='form-control'/>
</div>



<div className='form-group'><label htmlFor="">Location</label>
<input type="text" name='location' onChange={handleChange}
className='form-control'/>
</div>

<div className='form-group'><label htmlFor="">Date Of Birth</label>
<input type="date" name='dateOfBirth' onChange={handleChange}
className='form-control'/>
</div>

<div className='form-group'><label htmlFor="">email Id</label>
<input type="text" name='emailId' onChange={handleChange}
className='form-control'/>
</div>

<input type='submit' value="Add" className='btn btn-info'></input>
</form>
</div>
)
}
