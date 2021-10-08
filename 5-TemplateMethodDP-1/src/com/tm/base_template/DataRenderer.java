package com.tm.base_template;

public abstract class DataRenderer {

	//algorithm is fixed
	public final void render() {			//template method. and it should not be overridden by subclasses so declare it with "final" access modifier.
		
		String data = null;
		String pData = null;
		
		data = readData();
		
		pData = processData(data);
		
		System.out.println(pData);
	}

	public abstract String readData() ;
	public abstract String processData(String data) ;

}

/*

=> Template Method Design Pattern :-
	Template method design pattern is a behavioral design pattern of GOF pattern catalog.

In this pattern we have a base template method; It defines an algorithm with some abstract steps.
These steps have to be implemented by subclasses.

Here render() method is an base template method which define an algorithm (i.e. order of execution is very important.)

In this algorithm we need to read the data from some where and process that data then we need to render the processed data.
but as there are multiple sources to read the data and there ware multiple ways to process the data also. that's the reason we have
created these method as abstract method.


note :- render() is a template method and should not be overridden by any sub classes as the algorithm is fixed, and the subclasses
should not change the behavior of it. so we need to declare it as final.
*/