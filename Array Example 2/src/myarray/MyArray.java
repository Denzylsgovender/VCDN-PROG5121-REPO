package myarray;
import java.util.Scanner;
public class MyArray {

public static void main(String[] args) 
{
Scanner scanner = new Scanner(System.in);
int[] array = new int[5];
System.out.println("Enter 5 values:");

for (int i = 0; i < array.length; i++) 
{
array[i] = scanner.nextInt();
}

System.out.println();

System.out.println("Values stored in the array:");
for (int i = 0; i < array.length; i++) {
System.out.println("Index " + i + ": " + array[i]);
}


}
    
}


// alternative way
//System.out.println();
// System.out.println("Values stored in the array:");
//        for (int value : array) {
//            System.out.println(value);
//        }