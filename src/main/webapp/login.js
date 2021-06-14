var name=document.getElementById('#name');
var textError=document.getElementsByClassName('.text-error');
name.addEventListener('input',function(){
    var nameRegex=RegExp('^[A-Z][a-z]{2,}$');
    if(nameRegex.test(name)){
        textError.textContent="";
        return;
    }
    else textError.textContent='Name is Invalid!';
});