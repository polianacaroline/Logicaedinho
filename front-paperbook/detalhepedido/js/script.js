function carregarDados(){

    let lstdetalhepedido = document.getElementById("lstDetalhePedido");
    let dados = "";
    fetch("http://127.0.0.1:5000/api/v1/detalhepedido/listar")
    .then((Response) => Response.json())
    .then((rs)=>{
        console.log(rs);
        rs.map((itens, ix)=>{
            dados += `<ul id="itemdetalhepedido";>
                        <li>${itens.iddetalhepedido}</li>
                        <li>${itens.quantidade}</li>
                        <li>${itens.precounitario}</li>
                        <li>${itens.valortotal}</li>
            
                        </ul> `; 
                        lstdetalhepedido.innerHTML += dados;
        })
    
    }).catch((err)=>console.error(err)); 
    
}    