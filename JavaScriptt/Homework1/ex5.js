        var a = 5;
        var b = 20;
        var c = 15;
        
        if(a>b &&a>c && b>c){
			console.log("a: "+a+" b: "+b+" c: "+c);
		}
		if(b>a &&b>c && a>c){
			console.log("b: "+b+" a: "+a +" c: "+c);
			
		}
		if(c>a &&c>b && a>b){
			console.log("c: "+c+" a: "+a +" b: "+b);
		}
		if(a>b &&a>c && b<c){
			console.log("a: "+a+" c: "+c+" b: "+b);
		}
		if(b>a &&b>c && a<c){
			console.log("b: "+b+" c: "+c +" a: "+a);
			
		}
		if(c>a &&c>b && a<b){
			console.log("c: "+c+" b: "+b +" a: "+a);
		}