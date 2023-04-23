/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/*
Thandanani Morekhure 

St10344391 

Ice task 1

*/

package sum;
import java.util.Scanner;



public class Sum { 
    
public static void main(String[] args) {

    TotalSum();
    Substract();
    multiply();

}

 public static void TotalSum() 
{
        int value1;
        int value2;
        Scanner inputDevice = new Scanner(System.in);
        
        System.out.println("enter a value:  ");
        value1 = inputDevice.nextInt();
        System.out.println("enter a another value:   ");
        value2 = inputDevice.nextInt();
        
        System.out.println(value1 + value2 );
        
        
}
/* this method works on substract values */
public static void Substract()
{
        int num1;
        int num2;
        Scanner inputDevice = new Scanner(System.in);
        
        System.out.println("enter a value:  ");
        num1 = inputDevice.nextInt();
        System.out.println("enter a another value:   ");
        num2 = inputDevice.nextInt();
        
        System.out.println(num1 - num2);
        
}
public static void multiply(){
    
    int valueOne;
    int valueTwo; 
    
      Scanner inputDevice = new Scanner(System.in);
        
        System.out.println("enter a value:  ");
        valueOne = inputDevice.nextInt();
        System.out.println("enter a another value:   ");
        valueTwo = inputDevice.nextInt();
        
        System.out.println(valueOne * valueTwo );

}

}
 /* Referencing/ Bibilography 
     Code: 
     Joyce,F.2016.Java programming. 8th edition.Boston:Cengage learning.
*/
