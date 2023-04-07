package com.amazarashi.java9;

interface Bar
{
	//Metodo abstracto
	//Si una clase implemeta esta interfaces debe implemetar el emtod abstracto
	//los metodos Privados no sera hereddos en las subclases por solo viv en esta clas
	public void bar();
	
	
	//MEtodo Publicos
	default void foo() 
	{
		foo();
	}
	//metodos Privadps
	@SuppressWarnings("unused")
	private void foo2()
	{
		System.out.println("Foo 2");
	}
	
	@SuppressWarnings("unused")
	private static void foo3(){
		System.out.println();
	}
}

public class PrivateMethodsInterfaces {
	public static void main(String[] args) {
		
	}

}
