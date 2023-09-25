package runtimepoly1;

 class Car1 {
	 public void method1(){
		 System.out.println("Car-method1");
		 }
		 }
		 class CAMaruti extends Car1{
		 public void method1(){
		 System.out.println("Maruti-method1");
		 }
		 public void method2(){
		 System.out.println("Maruti-method2");
		 }
		 }

		 class Carruntime{
		 public static void main(String[] args){
		 Car1 c1 = new CAMaruti();
		 c1.method1();
		 
		 }
		 }