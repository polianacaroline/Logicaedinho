function carregarDados(){

let lstpedidos = document.getElementById("lstPedidos");
let dados = "";
fetch("http://127.0.0.1:5000/api/v1/pedido/listar")
.then((Response) => Response.json())
.then((rs)=>{
    console.log(rs);
    rs.map((itens, ix)=>{
        dados += `<ul id="itempedido";>
                    <li>${itens.idpedido}</li>
                    <li>${itens.loja}</li>
                    <li>${itens.unidadeloja}</li>
                    <li>${itens.numeroprotocolo}</li>
                    <li>${itens.valortotalpedido}</li>
        
                    </ul> `; 
                    lstpedidos.innerHTML += dados;
    })

}).catch((err)=>console.error(err)); 



} 