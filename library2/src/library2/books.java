
package library2;

import java.util.Scanner;

/**
 *
 * @author ali
 */
public class books {
    public static void main(String[] args) {
     Scanner input=new Scanner(System.in);
     System.out.println("****************************************");
        System.out.print("Enter number of books :");   
        int booknumber=input.nextInt();
        int[]id=new int[booknumber];
        String[]bookname=new String[booknumber];
        boolean[]getname=new boolean[booknumber];
        int bookcod=0;
        boolean RunMenu=true;
        do {            
          printmenu();
         int select=input.nextInt();
          switch(select){ 
          case 1:
              ad_book(id, bookname, getname, bookcod, input);
              bookcod++;
              break;
          case 2:
              show_book(id, bookname, getname, bookcod, input);
              break;
          case 3:
              edit_book(id, bookname, getname, bookcod, input);
              break;
          case 4:
               System.out.println("****************************************");
               System.out.print("Enter book name :");
               String serchbook=input.next();
          for (String bookname1 : bookname) {
              if (bookname1.equals(serchbook) == true) {
                  System.out.println("The book you searched is available");
              }
          }
  System.out.println("****************************************");       
              break;
              
             case 5:
                   System.out.println("****************************************");
              System.out.print("Enter book code to remove :");
               int dlitcod= input.nextInt();
                   dlitcod=dlitcod-1;
                    bookname[dlitcod]=null;
                      getname[dlitcod]=false;
                        System.out.println("****************************************");
                 break;
              
           case 6:
              Library2 Myobject=new Library2();
              Library2.main(args);
//            RunMenu=false;
            break;
          }   
        } while (RunMenu);
        
    }
       
    public static void printmenu(){
        System.out.println("****************************************");
        System.out.println("1)Ad_book");    
        System.out.println("2)Show_book");
        System.out.println("3)Edit_book");
        System.out.println("4)Search_book");
        System.out.println("5)Delete_book");
        System.out.println("6)Exit");
        System.out.print("Please select an option:");
    }
    private static void ad_book(int[]id,String[]bookname,boolean []getname,int bookcod ,Scanner input){
      System.out.println("****************************************");
        for (int i = 0; i < getname.length; i++) {
            bookcod++;
            System.out.println("Enter book name:");   
            bookname[i]=input.next();
            getname[i]=true;
            id[i]=bookcod;
                        System.out.println("The book code is"+bookcod);
                        System.out.println("****************************************");
//                      break;
                        
        }
    
    }  
    private static void show_book(int[]id,String[]bookname,boolean []getname,int bookcod,Scanner input){
           System.out.println("****************************************");
        System.out.print("Enter book code :");
            int showcod=input.nextInt();
        
			System.out.println("Name:" + bookname[showcod-1]);
		System.out.println("****************************************");
    }
    private static void edit_book(int[]id,String[]bookname,boolean []getname,int bookcod,Scanner input){
       System.out.println("****************************************");
        System.out.print("Enter book code :");  
    int editcod=input.nextInt();
        System.out.print("Enter the new name of the book :");
       String newname=input.next();
       bookname[editcod-1]=newname;
       System.out.println("****************************************");
}

    
}
