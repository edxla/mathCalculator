package com.amazarashi.calculation;

import com.amazarashi.operations.CalculatorProcesor;
//Exponer Funcionalidades
public class Calculator {
	private CalculatorProcesor calculatorProcesor = new CalculatorProcesor();
	
	public int sum(int x, int y) 
	{
		System.out.printf("Sumando %d + %d \n",x,y);
		return calculatorProcesor.sum(x, y);
	}
	

}
