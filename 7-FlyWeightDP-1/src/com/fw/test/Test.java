package com.fw.test;

import com.fw.app.PaintApp;

public class Test {

	public static void main(String[] args) {
		
		PaintApp pa =  new PaintApp();
		pa.render(100);
		
	}
}

/*
=> Flyweight DP :-
	It is a Structural Design Pattern.
In Flyweight design pattern instread of creating large number of similar objects, we should reuse those objects to save/optimize the memory.
This pattrn is epecially useful when memory is a key concern.

Here in this program we are creating the same circle object and rectangle objects so many times. but I want to reuse the object and object should be created
one for one type i.e. only one object for for circle type and one object for rectangle type.

but how do we achieve this?

so if we observe, in all circle and rectangle objects are having few attribues/state; and for all circle object few attribues value is same/coommon.
for example in all circle object "label" attribue is having same value i.e. "circle".
the same this is there for rectangle object also.

the attribues/states whose value is same accross all the object of the class are called as "Intrinsic state"
the attribues/states whose value is different or changing across all the object of the class is called as "Extrinsic state".


so, Flyweight pattern encourges developers to identify intrinsic and extrinsic state in an object and recomends passing these extrinsic state as dynamic values while calling the method as parameter rather storing it as state. 
these makes object as reusable.

*/