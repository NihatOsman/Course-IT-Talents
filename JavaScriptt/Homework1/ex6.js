var a = 5;
var b = 20;
var c = 15;

a=b+a;  
b=a-b;
a=a-b;
c=b+c;
b=c-b;
c=c-b;

console.log("a:"+a+" b:"+b+" c:"+c)