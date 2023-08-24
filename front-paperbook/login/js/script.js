function logar (){
    const us = document.getElementById("login");
    const sh = document.getElementById("senha");
    

    fetch("http://127.0.0.1:5000/api/v1/usuario/login",{
        method: "POST",
        headers:{
            accept:"application/json",
            contentType:"application/json",
        },
        body: JSON.stringify({
            login:us.ariaValue,
            senha:sh.ariaValue,
        })


    })
    .then((Response)=>Response.json())
    .then((dt)=>{
        alert(dt);
    })
    .catch((err)=> console.error(err));
    
}




function cadastrar (){
    const na = document.getElementById("Nível");
    const us = document.getElementById("login");
    const sh = document.getElementById("senha");
    const cs = document.getElementById("confirmar");
    
if(sh.value != confirm.value) {
    return alert("As senhas nao sao iguais");
}
else{
    fetch("http://127.0.0.1:5000/api/v1/usuario/login",{
    headers: {
        accept: "application/json"
    },
    body: JSON.stringify({

    })
    })
}
    

    fetch("http://127.0.0.1:5000/api/v1/usuario/login",{
        method: "POST",
        headers:{
            accept:"application/json",
            contentType:"application/json",
        },
        body: JSON.stringify({
            login:us.ariaValue,
            senha:sh.ariaValue,
            nivelacesso:na.ariaValue,
        })
    })
    

.then((Response)=>Response.json())
.then((dt)=>{
    alert(dt);
})
.catch((err)=> console.error(err));

}




