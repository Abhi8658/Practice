package com.agiledev.venkat.java8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Sample {

	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		/*//external iterator 
		for(int i=0;i<numbers.size();i++) {
			System.out.print(numbers.get(i));
		}*/
		
		/*//external iterator 
		for(int e:numbers) {
			System.out.print(e);
		}*/
		
		/*//internal iterator 
		numbers.forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer i) {
				System.out.print(i);
			}
			
		});*/
		
		/*here what we are doing is we are just getting one value and 
		 * passing to the print(), so we are doing more rather let give
		 * a chance to jvm because jvm can understand this code even if 
		 * we not pass the value*/
		
		/*//internal iterator 
		numbers.forEach(i->
			System.out.print(i));*/
		
		/*see this here we are just calling forEach() using list object 
		 * and calling again print method on System.out object*/
		
		//internal iterator more precisely
		numbers.forEach(System.out::print);
	}
}
