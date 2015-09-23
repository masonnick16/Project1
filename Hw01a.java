/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
/**
 *
 * @author Nick
 */
public class Hw01a {
    public static void main(String[] args) throws FileNotFoundException{
        System.out.println("Enter '1' to get price by Stock ticker");
        System.out.println("Enter '2' to get stocks greater than or equal to specified price");
        System.out.println("Enter '3' to quit");
        System.out.print("Your choice: ");
        Scanner inFile= new Scanner(new FileReader("stocks.txt"));
        Scanner num= new Scanner(System.in);
        int i= num.nextInt();
        
        switch(i){
            case 1: System.out.print("Enter a stock ticker: ");
                    Scanner name= new Scanner(System.in);
                    String comp= name.next();
                    double price=0;
                    if(comp.equalsIgnoreCase(inFile.next())){
                        price=inFile.nextDouble();
                    }
                    else{
                        double nope=inFile.nextDouble();
                        String nah=inFile.next();
                        price=inFile.nextDouble();
                    }
                    System.out.println(comp.toUpperCase()+ " current price is "+ price);
                break;
            case 2: System.out.print("Enter a price: ");
                    Scanner inPrice= new Scanner(System.in);
                    double compPrice=inPrice.nextDouble();
                    String name1=inFile.next();
                    double price1=inFile.nextDouble();
                    String name2=inFile.next();
                    double price2=inFile.nextDouble();
                    if(compPrice<price1){
                        System.out.println(name1+" is more than "+price1);
                    }
                    
                    if(compPrice<price2){
                        System.out.println(name2+" is more than "+price2);
                    }
                break;  
            case 3: System.out.println("Goodbye");
                break;
            
        }
    }
}
