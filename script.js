function up(){
    let value=document.getElementById('value');

    value=Number(value.innerText);
    value++;
    document.getElementById('value').innerText=value;
}

function down(){
    let value=document.getElementById('value');

    value=Number(value.innerText);
    if(value>0)
        value--;
    document.getElementById('value').innerText=value;
}