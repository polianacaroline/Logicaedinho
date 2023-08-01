// referenciar os controles: input nome, descricao, departamento e btncadastrar
let idcat ="";
let categoria = document.getElementById("categoria")
let descricao = document.getElementById("descricaocategoria")
let departa = document.getElementById("departamento")
let btncadastrar = document.getElementById("btncadastrar")

// realizar o cadastro quando o botao for clicado
btncadastrar.onclick = ()=>{

  if(btncadastrar.value=="Atualizar"){
    
    fetch("http://10.26.44.18:5000/api/v1/categoria/atualizar/"+idcat, {
    method:"PUT",
    headers:{ 
        "accept":"application/json" ,
        "content-type":"application/json"
    },
    body:JSON.stringify({ 
      categoria:categoria.value,
      descricaocategoria:descricao.value,
      departamento:departa.value,                                    
})
  })

.then((response)=>response.json())
.then((dados)=>alert("Atualizado"))
.catch((error)=>console.error(error))
}
else {



  
  fetch("http://10.26.44.18:5000/api/v1/categoria/cadastrar" , {
    method:"POST",
    headers:{ 
        "accept":"application/json" ,
        "content-type":"application/json"
    },
    body:JSON.stringify({ 
      categoria:categoria.value,
      descricaocategoria:descricao.value,
      departamento:departa.value,                                    
})
  })


.then((response)=>response.json())
.then((dados)=>alert(dados))
.catch((error)=>console.error(error))
}

window.location.reload();//atualizar a tela

}
// exibir as catgorias cadastradas 
function exibirCategorias(){ 
  let saida= "";
  fetch("http://10.26.44.18:5000/api/v1/categoria/listar")
  .then((response)=>response.json())
  .then((dados)=>{ 
    dados.map((itens,ix)=>{
      saida+=`<tr><td>${itens.idcategoria}</td>
      <td>${itens.categoria}</td>
      <td>${itens.departamento}</td>
      <td>${itens.descricaocategoria}</td>
      <td><a href=# onclick="atualizar('${itens.idcategoria}','${itens.categoria}','${itens.descricaocategoria}','${itens.departamento}')">
      Atualizar
      </a>
      <td><a href=# onclick=Apagar('${itens.idcategoria}')>
      Apagar
      </a>
      </tr>`;      

    })
document.getElementsByTagName("tbody")[0].innerHTML=saida;


    }).catch((error)=>console.error("Erro na api"+error))

}
function atualizar(id, cat, descr, depart){
idcat = id;
 categoria.value = cat;


 console.log(`${id} ${cat} ${descr} ${depart}`)

 document.getElementById("btncadastrar").value="Atualizar";


 


}
function Apagar(id){
  let saida= "";
  fetch("http://10.26.44.18:5000/api/v1/categoria/apagar/"+id,{method:"DELETE"})
  .then((response)=>response.json())
  .then((dados)=>{ 
    
  }
  ).catch((error)=>console.error("Erro da aplicacao"+error))
  alert("A categoria foi apagada. Atualize a página")
  window.location.reload()
}



