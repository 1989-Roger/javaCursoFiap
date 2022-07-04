function efetuarLogin() {
    var bodyObj = {
        "email": document.getElementById('txtEmail').value,
        "senha": document.getElementById('txtSenha').value
    }

    var envelope = {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(bodyObj)
    }

    fetch("http://localhost:8080/login", envelope)
        .then(res => res.json())
        .then(res => {
            localStorage.setItem("usuarioLogado", JSON.stringify(res));
            window.location = "principal.html"
        })
        .catch(err => {
            alert("Usuário ou senha inválida");
        });

}

function carregarUsuario() {
    var usuarioLogado = localStorage.getItem("usuarioLogado")
    if (usuarioLogado == null) {
        window.localStorage = "login.html"
    } else {
        //Desserializa e converter em objeto
        var objUsuario = JSON.parse(usuarioLogado);

        //Exibir a foto de perfil
        document.getElementById("divFoto").innerHTML = "<img width='40%' height='100%' alt='Sem foto' src=" + objUsuario.foto + ">"
    }
    // exibir informações
    document.getElementById("divDados").innerHTML = "<h3>Nome: " + objUsuario.nome + "</h3><br/>" +
        "<h3>Email: " + objUsuario.email + "</h3><br/>"
    "<h3>Id" + objUsuario.id + "</h3><br/>"

}

function criarNovoUsuario() {
    var bodyObj = {
        "nome": document.getElementById('txtNome').value,
        "email": document.getElementById('txtEmail').value,
        "senha": document.getElementById('txtSenha').value,
        "foto": document.getElementById('txtFoto').value

    }

    var envelope = {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(bodyObj)
    }

    fetch("http://localhost:8080/novousuario", envelope)
        .then(res => res.json())
        .then(res => {
            alert("Usuario criado. ID criado: " + res.id)
            localStorage.setItem("usuarioLogado", JSON.stringify(res));
            window.location = "principal.html"
        })
        .catch(err => {
            alert("Usuário ou senha inválida");
        });

}

function listarUsuarios() {
     var url = "http://localhost:8080/usuario";
    if(document.getElementById("txtNome").value != ""){
        url = url + "?nome=" + document.getElementById("txtNome").value;
    }
    fetch(url)
    .then(res => res.json())
    .then(res => exibirGrid(res))
    .catch(err => {
        alert("Erro ao listar usuário");
    });
}

function exibirGrid(lista) {
    var grid = "";
    grid = grid + "<table class = 'table table-striped'> "
    grid = grid + "<thead> <tr> ";
    grid = grid + "<th scoped='col'>Id</th>";
    grid = grid + "<th scoped='col'>Nome</th>";
    grid = grid + "<th scoped='col'>Email</th>";
    grid = grid + "<th scoped='col'>Foto</th>";
    grid = grid + "</tr></thead><tbody>";

    for (i = 0; i < lista.length; i++) {

        grid += "<tr>" +
            "<th socped='row'>" + lista[i].id + "</th>" 
            +"<th socped='row'>" + lista[i].nome + "</th>"
            +"<th socped='row'>" + lista[i].email + "</th>"
            +"<th socped='row'>" + lista[i].foto + "</th>"
            +"</tr>";
    }
    grid = grid + "</tbody></table>"
    document.getElementById("divDados").innerHTML = grid;
}


function atualizarDados() {
    recuperarSeries();
    carregaProvedoras();
}



function recuperarSeries(){
     var url = "http://localhost:8080/serie";
    fetch(url)
    .then(res => res.json())
    .then(res => exibirComboBox(res))
    .catch(err => {
        alert("Erro ao listar Séries");
    });
}

function exibirComboBox(lista) {
    var grid = "";
    grid = grid + "<table class = 'table table-striped'> "
    grid = grid + "<thead> <tr> ";
    grid = grid + "<th scoped='col'>Id</th>";
    grid = grid + "<th scoped='col'>Gênero</th>";
    grid = grid + "<th scoped='col'>Lançamento</th>";
    grid = grid + "<th scoped='col'>Sinopse</th>";
    grid = grid + "<th scoped='col'>Titulo</th>";
    grid = grid + "</tr></thead><tbody>";

    for (i = 0; i < lista.length; i++) {

        grid += "<tr>" +
            "<th socped='row'>" + lista[i].id + "</th>" 
            +"<th socped='row'>" + lista[i].genero + "</th>"
            +"<th socped='row'>" + lista[i].lancamento + "</th>"
            +"<th socped='row'>" + lista[i].sinopse + "</th>"
            +"<th socped='row'>" + lista[i].titulo + "</th>"
            +"</tr>";
    }
    grid = grid + "</tbody></table>"
    document.getElementById("series").innerHTML = grid;
}


function carregaProvedoras() {
     var url = "http://localhost:8080/provedora";
    fetch(url)
    .then(res => res.json())
    .then(res => opcaoProvedor(res))
    .catch(err => {
        alert("Erro ao listar Provedores");
    });
}

function opcaoProvedor(lista) {


    var option = "";
    option = " <option>Selecione a Provedora</option>"

    for (i = 0; i < lista.length; i++) {
        option += "<option value="+lista[i].id+">"+lista[i].id +" - " +lista[i].nome+"</option>"       
    }
    document.getElementById("txtProvedora").innerHTML = option;
}

function gravar() {
    var lancamento="true";
    if(document.getElementById("optnao").checked){
        lancamento="false";
    }
    var bodyObj = {
        "titulo": document.getElementById('txtTitulo').value,
        "lancamento": lancamento,
        "sinopse": document.getElementById('txtSinopse').value,
        "genero": document.getElementById('txtGenero').value,
        "provedora":{
            "id":document.getElementById('txtProvedora').value}
    }

    var envelope = {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(bodyObj)
    }

    fetch("http://localhost:8080/serie", envelope)
        .then(res => res.json())
        .then(res => {
            window.alert("Série Cadastrada. ID criado: " + res.id)
            window.location = "series.html"
        })
        .catch(err => {
            window.alert("Não foi possível gravar a série");
        });

}


function filtrar(){
     var url = "http://localhost:8080/provedora/filter";
    fetch(url)
    .then(res => res.json())
    .then(res => exibirProvedoras(res))
    .catch(err => {
        alert("Erro ao listar Provedoras");
    });
}
 var bodyObj = {
        "nome": document.getElementById('txtNome').value,
        "email": document.getElementById('txtEmail').value,
        "senha": document.getElementById('txtSenha').value,
        "foto": document.getElementById('txtFoto').value

    }

    var envelope = {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(bodyObj)
    }

    fetch("http://localhost:8080/provedora/filter", envelope)
        .then(res => res.json())
        .then(res => {
            alert("Usuario criado. ID criado: " + res.id)
            localStorage.setItem("usuarioLogado", JSON.stringify(res));
            window.location = "principal.html"
        })
        .catch(err => {
            alert("Usuário ou senha inválida");
        });

function exibirProvedoras(lista) {
    var grid = "";
    grid = grid + "<table class = 'table table-striped'> "
    grid = grid + "<thead> <tr> ";
    grid = grid + "<th scoped='col'>Provedora</th>";
    grid = grid + "<th scoped='col'>Fundação</th>";
    grid = grid + "<th scoped='col'>Site</th>";

    grid = grid + "</tr></thead><tbody>";

    for (i = 0; i < lista.length; i++) {

        grid += "<tr>" +
            "<th socped='row'>" + lista[i].provedora + "</th>" 
            +"<th socped='row'>" + lista[i].fundacao + "</th>"
            +"<th socped='row'>" + lista[i].site + "</th>"
            +"</tr>";
    }
    grid = grid + "</tbody></table>"
    document.getElementById("series").innerHTML = grid;
}

