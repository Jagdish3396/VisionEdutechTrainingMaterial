package com.vision.strictfpDemo1;
//fp-floating point
//strictfp access modifier used for floating point calculation
//if we mentioned access modifier as strictfp floating point calculation 
//will be done based on standard:IEEE754
//because of that if we peroform same calcultion on any platform 
//it will not change
strictfp class A {
	public static void main(String[] args) {
		System.out.println(12222222202.321321/2323.09988);
	}

}
