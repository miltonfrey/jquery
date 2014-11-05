




$(document).ready(function(){
  $("p").click(function(){
    $(this).hide();
  });
  
  $("#f1\\:b1").click(function(){ // form y button aunque haya un datagrid en medio
      alerta();
  });
  
  
  
});


function alerta(){                                                //Estas son dos formas válidas. con jquery(arriba) no se pone onclick en el <h:commandbutton>,
                                                                  // simplemente se hace click,
                                                                  // usando la segunda funcion hay que ponerlo explicitamente en el onclick=alerta() del commandbutton
    if(confirm("¿seguro que quieres salir?")===true){
        return true;
    }else{
        return false;
    }
}


function numero(){
    
    return 3;
    
    
}


function intFromServer(variable){
    
    //alert(variable);
    
    
}


