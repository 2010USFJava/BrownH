function vroom(event){
    element = event.currentTarget;
    element.style.body="Red";
    alert(element.id);
    }
   
    //anonymous function
    window.onlaod= function() {
        //useCapture/Event Propagatoin- false (booleans are defaulted to false)- Bubbling, target to Root
        //                              true -capturing, root to target
    
     this.document.getElementById("R").addEventListener("click",vroom, true);
     this.document.getElementById("A").addEventListener("click",vroom, false);
     this.document.getElementById("C").addEventListener("click",vroom, false);
     this.document.getElementById("E").addEventListener("click",vroom, false);
     this.document.getElementById("C").addEventListener("click",vroom, false);
     this.document.getElementById("A").addEventListener("click",vroom, false);
    this.document.getElementById("R").addEventListener("click",vroom, false);
    }