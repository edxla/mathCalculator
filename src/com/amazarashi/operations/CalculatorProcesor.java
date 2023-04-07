package com.amazarashi.operations;


//Detalles de Implementacion
public class CalculatorProcesor {
	//var args
	public int sum(int ...x) 
	{
		int sum=0;
		for (int i : x) {
			sum+=i;
			
		}
		return sum;
	}

}
