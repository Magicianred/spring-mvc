function cadastrar() {
	var usuario = {};
	usuario.nome = $("#nome").val();
	usuario.email = $("#email").val();
	usuario.senha = $("#senha").val();
	
	//endereço
	usuario.endereco = {};
	usuario.endereco.cep = $("#cep").val();
	usuario.endereco.rua = $("#rua").val();
	usuario.endereco.numero = $("#numero").val();
	usuario.endereco.bairro = $("#bairro").val();
	usuario.endereco.cidade = $("#cidade").val();
	
	console.table(usuario);
}