package DataTypes;
import java.util.Scanner;
public class Data{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the DataType: ");
        String a=sc.nextLine();
        if(a.equalsIgnoreCase("integer")){
            System.out.println("Size: 4bytes");
            int n=31;
            algorithm(n);
        }
        if(a.equalsIgnoreCase("byte")){
            System.out.println("Size: 1byte");
            int n=7;
            algorithm(n);
        }
        if(a.equalsIgnoreCase("long")){
            System.out.println("Size: 8byte");
            int n=63;
            algorithm(n);
        }
        if(a.equalsIgnoreCase("double")){
            System.out.println("Size: 8byte");
            int n=63;
            algorithm(n);
        }
        if(a.equalsIgnoreCase("float")){
            System.out.println("Size: 4byte");
            int n=31;
            algorithm(n);
        }
        if(a.equalsIgnoreCase("Character")){
            System.out.println("Size: 4byte");
            System.out.println("Minimum and Maximum value doesn't exist");
        }
        if(a.equalsIgnoreCase("boolean")){
            System.out.println("Size: 0byte");
            System.out.println("Minimum and Maximum value doesn't exist");
        }
        if(a.equalsIgnoreCase("String")){

            System.out.println("Size, Minimum and Maximum value doesn't exist");
        }

    }
    public static void algorithm(int n){
        double x =Math.pow(-2,n);
        double y =Math.pow(2,n)-1;
        long Min_Value=(long) x;
        long Max_Value=(long) y;
        System.out.println("Minimum Value: "+Min_Value);
        System.out.println("Maximum Value: "+Max_Value);
    }
}