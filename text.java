import java.io.*;
import java.util.*;
public class text
{
    void main()throws Exception
    {
        message();
        Scanner ck=new Scanner(System.in);
        System.out.println();
        System.out.println("Press 'Y' to continue else press 'N' to go back to the menu. ");
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
    }
    
    static void message()throws Exception
    {
        int i=0;
        System.out.print('\f');
        Scanner in=new Scanner(System.in);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       try
       {
        long ch=0;
        System.out.println("To exit at any point of time, type 'exit' in a new line. \nTo send the message, type 'send' in a new line.");
        System.out.println("Type your message below: \n ");
      
        while(in.hasNextLine())
        {
            String line=in.nextLine();
        if(line.equalsIgnoreCase("exit"))
        {
            main1 ol = new main1();
            ol.menu();
            break;
        }
        if(line.equalsIgnoreCase("send"))
        {
            System.out.println("Enter recipient number or press 1 to search from contacts. ");
            ch=in.nextLong();
        
    
            if(ch==1)
            {
                
            contacts obj1 = new contacts();
            System.out.println("Enter contact name. ");
            String a = br.readLine();
            String name = obj1.search(a);
            while(name.equalsIgnoreCase(null))
            {
              System.out.println("Try again !");
              System.out.println("Re-enter name.");
              a = br.readLine();
             name = obj1.search(a);
        }
            
        System.out.print("Sending message");
        Thread.sleep(1000);
        System.out.print(".");
         Thread.sleep(1000);
        System.out.print(".");
         Thread.sleep(1000);
        System.out.println(".");
        System.out.println("Message successfully sent to "+name);
        break;
    }
    else
    {
        System.out.print("Sending message");
        Thread.sleep(1000);
        System.out.print(".");
         Thread.sleep(1000);
        System.out.print(".");
         Thread.sleep(1000);
        System.out.println(".");
        System.out.println("Message successfully sent to "+ch);
        break;
    }
}
}
  }  catch(Exception ex)
    {
        
        System.out.println("Oops! Something went wrong. Please try again. ");
        Thread.sleep(2000);
        message();
    }    
        
    in.close();
        
}
}

        
        