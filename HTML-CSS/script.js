
document.querySelector('.s2').style.display = 'none';
document.querySelector('.hamburg').addEventListener("click", () => {
    document.querySelector('.sidebar').classList.toggle('sidebargo');
    if (document.querySelector('.sidebar').classList.contains('sidebargo')) { 
        document.querySelector('.s1').style.display = "inline";
        document.querySelector('.s2').style.display = 'none';
    } else {
        document.querySelector('.s1').style.display = 'none';
        setTimeout(()=>{
            document.querySelector('.s2').style.display = 'inline';

        },300);
    }
});
