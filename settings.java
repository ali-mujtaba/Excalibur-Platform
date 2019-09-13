import java.util.*;
public class settings
{
    void main()throws Exception
    {
        settings ob=new settings();
        
        try
         {
          Scanner ck = new Scanner(System.in);
          System.out.println("1 : Profiles");
          System.out.println("2 : Security Lock Settings");
          int opt = ck.nextInt();
          while(opt<1 || opt>2)
          {
               System.out.println("Invalid option. Please Retry!");
               opt = ck.nextInt();
            }
            switch(opt)
            {
                 case 1 :
                 profile();
                 System.out.println();
                        System.out.println("Press 'Y' to continue else press 'N'");
                        String o = ck.next();
                        while(o.length()!=1)
                        {
                            System.out.println("Invalid option! Please try again");
                            o = ck.next();
                        }
                        if(o.equalsIgnoreCase("n"))
                         {
                         System.out.print('\f');
                         main1 ol = new main1();
                         ol.menu();
                        }
                        else
                        {
                            System.out.print('\f');
                        main();
                    }
                 break;
                 case 2 :
                 security_lock obj = new security_lock();
                 obj.main();
                 System.out.println();
                        System.out.println("Press 'Y' to continue else press 'N'");
                        String o1 = ck.next();
                        while(o1.length()!=1)
                        {
                            System.out.println("Invalid option! Please try again");
                            o1= ck.next();
                        }
                        if(o1.equalsIgnoreCase("n"))
                         {
                         System.out.print('\f');
                         main1 ol = new main1();
                         ol.menu();
                        }
                        else
                        {
                            System.out.print('\f');
                        main();
                    }
                 break;
                }
            }catch(Exception ex)
            {
                System.out.print('\f');
                System.out.println("An error occurred. Try again. ");
                ob.main();
        }
    }
            static void profile()
            {
                try
                {
                 Scanner ck = new Scanner(System.in);
                 System.out.println("1 : General");
                 System.out.println("2 : Silent");
                 System.out.println("3 : Driving");
                 System.out.println("4 : Outdoor");
                 System.out.println("5 : Meeting");
                 int opt = ck.nextInt();
                 while(opt<1 || opt>5)
                 {
                     System.out.println("Invalid option! Please try again!");
                     opt = ck.nextInt();
                    }
                    switch(opt)
                    {
                        case 1 :
                        System.out.println("Profile changed to General");
                        break;
                        case 2 :
                        System.out.println("Profile changed to Silent");
                        break;
                        case 3:
                        System.out.println("Profile changed to Driving");
                        break;
                        case 4:
                        System.out.println("Profile changed to Outdoor");
                        break;
                        case 5:
                        System.out.println("Profile changed to Meeting");
                        break;
                    }
                }catch(Exception ex1)
                {
                    System.out.print('\f');
                    System.out.println("An error has occurred. Try again. ");
                    profile();
            }
            }
        }