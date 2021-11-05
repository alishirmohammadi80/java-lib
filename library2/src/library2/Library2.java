
package library2;

import java.util.Scanner;
public class Library2 {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    
        System.out.println("Welcome to the Library Management Program");
        System.out.println("****************************************");
        boolean runmenuu=true;
        do { 
        Run_the_menu();
        int slect=input.nextInt();
        switch(slect){
        case 1:
        enroll myobject=new enroll();
        enroll.main(args);
        case 2:
        books myObject=new books();
        books.main(args);
        
        }
        } while (runmenuu);
       
    }
 private static void Run_the_menu(){
     System.out.println("1)Member Management"); 
     System.out.println("2)Book management");
     System.out.print("Please select an option :"); 
    
 }  
    
        
    }
    

