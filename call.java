import java.util.*;
import java.io.*;
public class call
{
   void calling()throws Exception
   {
      call oj=new call();
       try
       {
           Scanner ck = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        contacts obj = new contacts();
        
        System.out.println("Enter number or press 1 to search for contacts");
        String num = ck.next();
        int l = 0;
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("Call_logs.txt", true)));
        if(num.equalsIgnoreCase("1"))
        {
            contacts obj1 = new contacts();
            System.out.println("Enter name");
            String a = br.readLine();
            String name = obj1.search(a);
            while(name.equalsIgnoreCase(null))
            {
              System.out.println("Try again !");
              System.out.println("Re-enter name.");
              a = br.readLine();
             name = obj1.search(a);
        }
         //System.out.println(name);
         System.out.println("Press 1 to call");
         int c = ck.nextInt();
         if(c==1)
         {
     
         
            //System.out.println("Invalid option. Enter correct option. ");
            //oj.calling();
        
     
            
            System.out.println("Calling :"+name);
            System.out.print(".");
            Thread.sleep(1000);
            System.out.print(".");
            Thread.sleep(1000);
            System.out.println(".");
            Thread.sleep(2000);
            System.out.println("Connecting..");
            Thread.sleep(2000);
            System.out.println("NETWORK UNAVAILABLE");
            pw.println("outgoing --> :" +name);
            pw.close();
            
        }
        else
        {
            System.out.println("");
        }
        }
        else
        {
            System.out.println("Calling : "+num);
            System.out.print(".");
            Thread.sleep(1000);
            System.out.print(".");
            Thread.sleep(1000);
            System.out.println(".");
            Thread.sleep(2000);
            System.out.println("Connecting..");
            Thread.sleep(2000);
            System.out.println("NETWORK UNAVAILABLE");
            pw.println("outgoing --> :" +num);
            pw.close();
        }
        
    }catch(InputMismatchException ex1)
    {
        System.out.println("Invalid input. Please begin again. ");
        oj.calling();
    }
}
    void call_log()throws Exception
    {
        call oc=new call();
       try
       {
        String s = "";
        Scanner cl = new Scanner(new FileReader("Call_logs.txt"));
        System.out.println("Recent call history:");
        System.out.println();
        while((cl.hasNextLine()))
        System.out.println(cl.next() + "" + cl.nextLine());
        cl.close();
        System.out.println(s);
    }catch(Exception ex2)
    {
        System.out.println("Sorry ! An error occured. \n You'll have to begin again. ");
        oc.main();
        
    }
}
    void main()throws Exception
    {
        Scanner ck = new Scanner(System.in);
        System.out.println("1 : Make call");
        System.out.println("2 : Call history");
        int opt = ck.nextInt();
        while(opt<1 || opt>2)
        {
            System.out.println("No option available. Retry");
            opt = ck.nextInt();
        }
        switch(opt)
        {
            case 1 : 
            
            calling();
            break;
            case 2:
            //call clo = new call();
            call_log();
            break;
        }
    }
}