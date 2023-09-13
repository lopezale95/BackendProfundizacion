$(document).ready(function (){
   $("tr #btnDelete").click(function (){
       var idp=$(this).parent().find("#idp").val();
       eliminar(idp);    
   });
    function eliminar(idp){
        var url="Controlador?accion=Delete";
        $.ajax({
            type: 'POST',
            url: url,
            data:"idp="+idp,
            success: function (data, textStatus, jqXHR) {
                location.href="Controlador?accion=Carrito";    
            }
        });
    }
    
    $("tr #Cantidad").click(function (){
       var idp=$(this).parent().find("#idpro").val();
       var cantidad=$(this).parent().find("#Cantidad").val();
       var url="Controlador?accion=ActualizarCantidad";
       $.ajax({
            type: 'POST',
            url: url,
            data:"idp="+idp+"&Cantidad="+cantidad,
            success: function (data, textStatus, jqXHR) {
                location.href="Controlador?accion=Carrito";   
            }
       });
    });
    
});