package com.concrete;
class Add{
    public void add(int ... args){
        String addContent = "";
    	int sum = 0;
        for (int i = 0; i < args.length; i++) {
        	addContent = addContent.concat(args[i] + "");
			if(i < args.length-1)
				addContent = addContent.concat("+");
			else
				addContent = addContent.concat("=");
			sum += args[i];
		}
        addContent = addContent.concat(sum+"");
        System.out.println(addContent);
    }
    
    
}