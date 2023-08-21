const firstName =document.getElementById("txtFirstName");
const lastName =document.getElementById("txtLastName");
const age =document.getElementById("txtAge");
const phoneNumber =document.getElementById("txtPhoneNumber");
const email =document.getElementById("txtEmail");
const address =document.getElementById("txtAddress");
const institute =document.getElementById('txtInstitute');
const batch =document.getElementById("txtBatch");
const guardian =document.getElementById("txtGuardian");
const btnSubmit=document.getElementById("btnSubmit");

console.log(firstName);

 btnRegister.addEventListener("click",()=>{
    let student = {
        "firstName": firstName.value,
        "lastName" : lastName.value,
        "age" : age.value,
        "phoneNumber" : phoneNumber.value,
        "emailAddress" : email.value,
        "address" : address.value,
        "institute" : institute.value,
        "batch" : batch.value,
        "guardiansName" : guardian.value
    }
    console.log(student);

    fetch('http://localhost:8080/student',{
        method: 'POST',
        headers: {
           'Content-type':'application/json'
       },
        body: JSON.stringify(student)
     })
        .then(response => response.json())
        .then(response => console.log(JSON.stringify(response)))
        alert("Success")
 })

 

 


