var hour = 5;
var money = 9;
var health = false;

if(health===false){
    console.log("I'm sick and i don't go out");
    if(money>0){
        console.log("I will buy drugs");
    }
    else{
        console.log("I will stay at home and drink a tea");
    }
}

else{
    if(money<10 && money>0){
        console.log("I am healthy and i go to the cafe");
    }
    else{
        console.log("I am healty");
    }
}
