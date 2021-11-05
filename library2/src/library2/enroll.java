 


package library2;

import java.util.Scanner;



public class enroll {
    
    public static void main(String[] args) {
        
    
   
       try   (Scanner input=new Scanner(System.in)){
           System.out.println("****************************************");
        System.out.print("Enter number of Enroll :");
      
        int enrollnum=input.nextInt();
         String[]name=new String[enrollnum];
        String[]lastname=new String[enrollnum];
        String[]nationalcod=new String[enrollnum];
        String[]dateofbirth=new String[enrollnum];
        int cod=0;
        boolean []admember=new boolean[enrollnum];
        boolean run_menu=true;
        do {            
      show();
      int select=input.nextInt();
       switch(select){
       case 1:
            for (int i =0; i < enrollnum; i++) {
            cod=cod+1;
                System.out.println("****************************************");
            System.out.print("Enter Member Name :");
            name[i]=input.next();
            System.out.print("Enter Member Lastname :");
            lastname[i]=input.next();
                System.out.print("Enter Member Nationalcod :");
                nationalcod[i]=input.next();
                System.out.print("Enter Member date of birth :");
                dateofbirth[i]=input.next();
                
                  admember[i]=true;
            System.out.println( " Membership code is : " +cod);
                System.out.println("****************************************");
       
        }
     break;
      case 2:
                System.out.println("****************************************");   
            System.out.print(" Please enter  Membership code  : ");
            int enrollcod=input.nextInt();
            System.out.println("Name :"+name[enrollcod-1]);
            System.out.println("Lastname :"+lastname[enrollcod-1]);
            System.out.println( "National Code :"+nationalcod[enrollcod-1]);
            System.out.println( "Date of birth :"+dateofbirth[enrollcod-1]);
                System.out.println("****************************************");
      break;
      
      case 3:
                System.out.println("****************************************");
          System.out.print("Please enter  Membership code : ");   
          int cood=input.nextInt();
          System.out.print("Enter new name :");
          String newname=input.next();
          System.out.print("Enter new last name :");
          String newlastname=input.next();
          System.out.print("Enter new ntionalcod :");
          String newnationalcod=input.next();
          System.out.print("Enter new date of birth :");
          String newdateofbirth=input.next();
                System.out.println("****************************************");
          dateofbirth[cood-1]=newdateofbirth;
          nationalcod[cood-1]=newnationalcod;
          name[cood-1]=newname;
          lastname[cood-1]=newlastname;
          break;
      case 4:
                System.out.println("****************************************");
           System.out.print("Please enter  Membership code : ");
          int coood=input.nextInt();
          for (int i = 0; i <cod; i++) {
              if (coood==cod) {
              admember[coood-1]=false;
                  System.out.println("Member deleted");
                  
            break;
              }
          }
                System.out.println("****************************************");
              break;
          
      case 5:
     Library2 MyObject=new Library2();
     Library2.main(args);
//      run_menu=false;
          
      break;
           
       }   
        } while (run_menu);
       }
} public static void show(){
 
  System.out.println("1)Ad_Member"); 
     System.out.println("2)Show_Member");  
       System.out.println("3)Edit_Member");
         System.out.println("4)Dlit_Member");
           System.out.println("5)Exit");
             System.out.print("Please select an option :");   
       
}

}