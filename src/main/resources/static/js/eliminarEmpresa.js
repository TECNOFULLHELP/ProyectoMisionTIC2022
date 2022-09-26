function eliminarEmpresa(id) {
	console.log(id);
	swal({
		  title: "Esta seguro de Eliminar?",
		  text: "Una vez eliminado no se podra restablecer el registro!",
		  icon: "warning",
		  buttons: true,
		  dangerMode: true,
		})
		.then((OK) => {
		  if (OK) {
			  $.ajax({
				 url:"empresa/borrar/"+id,
				 success: function(res) {
					console.log(res);
				},
			  });
		    swal("Poof! Registro eliminado!", {
		      icon: "success",
		    }).then((ok)=>{
		    	if(ok){
		    		location.href="/empresas";
		    	}
		    });
		  }
		});
}