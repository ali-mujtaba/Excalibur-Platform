import java.io.*;
import java.util.*;
import java.text.*;
public class main1
{
    public static void main(String args[])throws Exception
    {
        welcome();
        unlock();
    }
        
    static void welcome()throws Exception
    { 
        System.out.print('\f');
        System.out.println("||=====   * *     * *     * ====     # # #     | |          ######   &&#####    | |     | |   | |^^^^^^^^"+((char)153));
        System.out.println("||         * *   * *     *          #     #    | |            ##     &&     #   | |     | |   | |     ^ ^");
        System.out.println("||          * * * *      *         $ $   $ $   | |            ##     &&     #   | |     | |   | |     ^ ^");
        System.out.println("||====       * ** *      *         $ $   $ $   | |            ##     &&#####    | |     | |   | |^^^^^ ^");
        System.out.println("||          * *  * *     *         $ $===$ $   | |            ##     &&     #   | |     | |   | |   ^ ^");
        System.out.println("||         * *    * *    *         $ $   $ $   | |     ##     ##     &&     #   ####   ####   | |    ^ ^");
        System.out.println("||=====   * *      * *    * ====   $ $   $ $   | |===== #   ######   &&#####       #####      | |     ^ ^");
        System.out.println();
        System.out.println("Excalibur Platform...");
        Thread.sleep(3000);
        System.out.println("Opening...");
        Thread.sleep(3000);
        System.out.println("WELCOME!");
        Thread.sleep(3000);
}
   static void unlock()throws Exception
     {
       System.out.print('\f');
         security_lock obj = new security_lock();
         FileReader obj1 = new FileReader("confirm.txt");
         Scanner ck = new Scanner(obj1);
         String c = ck.next();
         boolean check;
         if(c.equals("on"))
         {
             check = obj.unlock();
             while(check==false)
             {
                 System.out.println("Invalid code! Please try again. ");
                 check = obj.unlock();
            }
            homescreen();
        }
            else
            {
              homescreen();
         
        }
    }
    static void homescreen()throws Exception
    {
        
        
        System.out.print('\f');
        Date dNow=new Date();
        SimpleDateFormat ft=new SimpleDateFormat("\t hh:mm a");
        System.out.println(ft.format(dNow));
        SimpleDateFormat ft1=new SimpleDateFormat("\t E dd.MMM.yyyy");
        System.out.println(ft1.format(dNow));
        System.out.println();
        System.out.println();
        Scanner ck = new Scanner(System.in);
        System.out.print("1 : menu\t");
        System.out.print("2 : contacts \t ");
        System.out.print("   3 : call \t  ");
        System.out.println("4 : Power off. ");
        System.out.println();
        
        int opt = ck.nextInt();
        while(opt>4 || opt<1)
        {
            System.out.println("Invalid option. Please re-enter. ");
            opt = ck.nextInt();
        }
        if(opt == 1)
        menu();
        else if(opt == 2)
        {
            contacts obj = new contacts();
            obj.main();
        }
        else if(opt == 3)
        {
        call obj = new call();
        obj.main();
        System.out.println();
                        System.out.println("Press 'H' to go to homeScreen or 'M' to go to main menu");
                        String o = ck.next();
                        while(o.length()!=1)
                        {
                            System.out.println("Invalid option! Please try again");
                            o = ck.next();
                        }
                        if(o.equalsIgnoreCase("m"))
                         {
                         System.out.print('\f');
                         main1 ol = new main1();
                         ol.menu();
                        }
                        else
                        {
                            System.out.print('\f');
                            main1 obj5 = new main1();
                            obj5.homescreen();
                    }
        
        
    } 
    else
    System.exit(0);
    

}
    
    static void menu()throws Exception
    {
        int opt =0;
        Scanner ck = new Scanner(System.in);
        try
        {
        
        System.out.println("1 : Message");
        System.out.println("2 : Contacts");
        System.out.println("3 : Utility Apps");
        System.out.println("4 : Call logs");
        System.out.println("5 : Settings");
        System.out.println("6 : Homescreen");
        
        
        opt = ck.nextInt();
        while(opt<1 || opt>6)
        {
            System.out.println("Invalid option. Please see the option and re-enter. ");
            opt = ck.nextInt(); 
        }
    }catch(Exception ex1)
    {
        System.out.print('\f');
        System.out.println("Oops ! Something went wrong. Please try again.");
        menu();
    }
        switch(opt)
        {
             case 1 :
             text ob=new text();
             ob.main();
             
             break;
             case 2 :
             contacts obj = new contacts();
             obj.main();
             break;
             case 3 :
             utility obj1 = new utility();
             obj1.main();
             break;
             case 4:
             call obj2 = new call();
             obj2.call_log();
             System.out.println();
                        System.out.println("Press 'H' to go to homeScreen or 'M' to go to main menu");
                        String o = ck.next();
                        while(o.length()!=1)
                        {
                            System.out.println("Invalid option! Please try again");
                            o = ck.next();
                        }
                        if(o.equalsIgnoreCase("m"))
                         {
                         System.out.print('\f');
                         main1 ol = new main1();
                         ol.menu();
                        }
                        else
                        {
                            System.out.print('\f');
                            main1 obj5 = new main1();
                            obj5.homescreen();
                    }
             break;
             case 5:
             settings obj3 = new settings();
             obj3.main();
             break;
             case 6 :
             homescreen();
             break;
            }
        }
    }    
       
    
