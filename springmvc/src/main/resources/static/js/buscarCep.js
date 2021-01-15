function buscar() {
	if($("#cep").val() != "") {
		$.ajax({
			url: "http://viacep.com.br/ws/" + $("#cep").val() + "/json/"
		}).done(function(e) {
			$("#rua").val(e.logradouro);
			$("#bairro").val(e.bairro);
			$("#cidade").val(e.localidade);
			
		}).fail(function(){
			alert("CEP não encontrado!");
		});
	}
}