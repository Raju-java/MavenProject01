package com.nit.service;

/**
 * Hello world!
 *
 */
public class App 
{
	public int sum(int a, int b) {
		return a+b;
	}
    public static void main( String[] args )
    {
    	App app = new App();
        System.out.println( "Sum of two numbers: "+app.sum(10, 20) );
    }
}
