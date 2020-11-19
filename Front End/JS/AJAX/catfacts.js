function loadFact(cat) {
    //document.getElementById("factID").innerHTML=cat.factID;
    document.getElementById("fact").innerHTML=cat.text;

    }
    function loadDog(dog) {
        //document.getElementById("factID").innerHTML=cat.factID;
       // document.getElementById("dog").innerHTML=dog.message;
    document.getElementById("image").setAttribute("src",dog.message);
        }
    
    function getFact(){
        console.log("in get fact");
        //let factID= document.getElementById("factID").value;
    
        //step 1 
        var xhr= new XMLHttpRequest();
        //step 2 on ready state change
        xhr.onreadystatechange=function () {
            console.log("in orsc");
            if(xhr.readyState==4&&xhr.status==200){
                console.log(xhr.responseText);
                var cat = JSON.parse(xhr.responseText); //taking json text ans turning into js object to pass into function to take out name and print it in h3 tag
    
                loadFact(cat);
    
            }
        }
        //step 3 open request (method, url, synchronis) 
        xhr.open("GET","https://cat-fact.herokuapp.com/facts/random",true);
    
        //step 4 send request
        xhr.send();
    
    }
    function getDog(){
        console.log("in get fact");
        //let factID= document.getElementById("factID").value;
    
        //step 1 
        var xhr= new XMLHttpRequest();
        //step 2 on ready state change
        xhr.onreadystatechange=function () {
            console.log("in orsc");
            if(xhr.readyState==4&&xhr.status==200){
                console.log(xhr.responseText);
                var dog = JSON.parse(xhr.responseText); //taking json text ans turning into js object to pass into function to take out name and print it in h3 tag
    
                loadDog(dog);
    
            }
        }
        //step 3 open request (method, url, synchronis) 
        xhr.open("GET","https://dog.ceo/api/breeds/image/random",true);
    
        //step 4 send request
        xhr.send();
    
    }
    window.onload= function() {
        console.log("in on load");
        document.getElementById("imgID").addEventListener("click",getFact, false);
        document.getElementById("dog").addEventListener("click",getDog, false);
    }