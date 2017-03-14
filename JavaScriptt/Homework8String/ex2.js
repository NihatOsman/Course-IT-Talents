var str = "uchilishe";
var str2 = "uchenik";
var str3 ="";
if(str2.length>str.length){
    str3 = str.slice(0, 5) + str2.slice(5) ;
    console.log(str2.length + " " + str3);
}
else{
    str3 = str2.slice(0, 5) + str.slice(5);
    console.log(str.length + " " + str3);
}