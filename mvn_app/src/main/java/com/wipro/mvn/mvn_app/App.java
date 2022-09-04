package com.wipro.mvn.mvn_app;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        AppService obj = new AppService();
        System.out.println("Enter a string:");
        String str = new Scanner(System.in).next();
        System.out.println(str);
        int len = obj.getLengthStr(str);
        System.out.println("Length:"+len);
    }
}
