function loadPokemon(pokemon) {
document.getElementById("name").innerHTML=pokemon.name;
//document.getElementById("name").innerHTML=pokemon.abilities[0].ability.name;

}

function getPokemon(){
    console.log("in get pokemon");
    let pokemonID= document.getElementById("pkID").value;

    //step 1 
    var xhr= new XMLHttpRequest();
    //step 2 on ready state change
    xhr.onreadystatechange=function () {
        console.log("in orsc");
        if(xhr.readyState==4&&xhr.status==200){
            console.log(xhr.responseText);
            var pokemon = JSON.parse(xhr.responseText); //taking json text ans turning into js object to pass into function to take out name and print it in h3 tag

            loadPokemon(pokemon);

        }
    }
    //step 3 open request (method, url, synchronis) 
    xhr.open("GET","https://pokeapi.co/api/v2/pokemon/"+pokemonID,true);

    //step 4 send request
    xhr.send();

}
window.onload= function() {
    console.log("in on load");
    document.getElementById("pokesubmit").addEventListener("click",getPokemon, false);
}