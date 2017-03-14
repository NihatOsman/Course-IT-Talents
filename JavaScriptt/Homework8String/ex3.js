var str = "hipopotam";
var str2 = "hipopotuk";
if(str.length==str2.length){
        console.log("dvata niza sa s ednakva daljina");
        console.log("razlika po pozicii:")
        for(var index=0; index<str.length; index++){
            if(!(str.charAt(index)==str2.charAt(index))){
                console.log(str.charAt(index) +"-" + str2.charAt(index))
            }
        }
}
else{
    console.log("ne sa ednakvi dvata stringa");
}