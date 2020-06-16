package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Math operations " );

        Operations operations = new Operations();
        System.out.println("The sum of operation is : " +operations.operation(15,29));


        System.out.println("The product of the operation is : " +operations.multipliedOperation(10,20));

        System.out.println("The substraction of the operation is : " +operations.minusOperation(100,27));

        System.out.println("The dividing result of the operation is : " +operations.divideOperations(120,12));


    }
}
