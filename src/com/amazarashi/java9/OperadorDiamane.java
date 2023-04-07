package com.amazarashi.java9;

interface Foo<t>
{
	}
public class OperadorDiamane {
	public static void main(String[] args) {
		//DIamante con clases anonimas
		@SuppressWarnings("unused")
		Foo<Integer> foo=new Foo<>() {
		};
	}
}
