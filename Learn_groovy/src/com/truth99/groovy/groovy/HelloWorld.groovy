def var="hello "+
       "world"+
       ",groovy!"
       def repeat(val){
            for(i in 1..5){
				def val1 = "This is ${i}:${val}";
				println val1.class;
				println val1;
            }
       }
       repeat(var)
