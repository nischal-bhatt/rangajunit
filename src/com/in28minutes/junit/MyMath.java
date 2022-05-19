package com.in28minutes.junit;

public class MyMath {

	 int sum(int[] numbers)
	 {
		 int sum=0;
		 for (int i: numbers)
		 {
			 sum+=i;
		 }
		 return sum;
	 }
	 // lets say the +78 was accidentally added by another developer
	 // the already written junit test would flag it out
}
