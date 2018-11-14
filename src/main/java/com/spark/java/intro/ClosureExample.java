package com.spark.java.intro;

import java.util.function.Function;

public class ClosureExample {
	public static Function<Integer, Integer> closure() {
		 int a=3;
		
		Function<Integer, Integer> function = t->{
			//a++;
			return t*a;
		};
		
		return function;
	}
}
