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
	public void multiple(int a int b)
	{
	System.out.println("Multiple of two numbers : " + a*b)
	}
    public static void main( String[] args )
    {
    	App app = new App();

       

        app.multiple(10,20);	

	System.out.println("Multiple of two numbers :"+app.multiple(10,20));
    }
}
