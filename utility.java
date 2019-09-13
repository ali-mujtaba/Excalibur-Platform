import java.util.*;

public class utility
{
   void main()throws Exception
   {
       try
       {
       Scanner ck = new Scanner(System.in);
       System.out.println("1 : Calendar");
       System.out.println("2 : Notes");
       System.out.println("3 : Calculator");
       System.out.println("4 : Convertor");
       int opt = ck.nextInt();
       while(opt<1 || opt>4)
       {
           System.out.println("Invalid option! Please try again!");
           opt = ck.nextInt();
        }
       switch(opt)
       {
            case 1 :
            calendar obj = new calendar();
            obj.main();
            break;
            case 2 :
            notes obj1 = new notes();
            obj1.main();
            
            break;
            case 3 :
            calculator obj2 = new calculator();
            obj2.main();
            break;
            case 4 :
            convertor obj3 = new convertor();
            obj3.main();
            break;
        }
       
    }catch(Exception ex0)
    {
        System.out.println("Oops ! Something went wrong. Please begin again. ");
        main();
    }
    }
}
            