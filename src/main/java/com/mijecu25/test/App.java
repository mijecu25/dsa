package com.mijecu25.test;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    
    public static String reverse(String src) {
    	return new StringBuilder(src).reverse().toString();
    }
}
