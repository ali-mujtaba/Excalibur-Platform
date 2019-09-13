import java.util.*;
import java.io.*;
public class security_lock
{

    boolean unlock()throws IOException
    {
           //security_lock sl=new security_lock();
        boolean check = false;
        try
        {

        Scanner ck = new Scanner(System.in);
         System.out.println("Enter security code");
         String cd = ck.next();
         FileReader obj = new FileReader("security_code.txt");
         Scanner ck1 = new Scanner(obj);
         check = cd.equals(ck1.next());
         obj.close();
         ck1.close();
         
        }catch(Exception ex1)
        {
            System.out.println("Oops ! Something went wrong. Please try again. ");
            unlock();
        
        }
        return check;
    }
        void change()throws IOException
        {
               
            try
            {
             Scanner ck1 = new Scanner(System.in);
             security_lock obj = new security_lock();
             boolean check = obj.unlock();
             while(check!= true)
             {
                 System.out.println("Invalid code. Please try again");
                 check = obj.unlock();
                }
             System.out.println("Enter new security code");
             PrintWriter obj1 = new PrintWriter(new BufferedWriter(new FileWriter("security_code.txt" )));
             String tmp=ck1.next();
             if(tmp.length()<4)
             {
             System.out.println("Size inadmissible. Try again. ");
             obj.change();
            }
             obj1.println(tmp);
             System.out.println("Your code has been successfully changed");
             obj1.close();
            }catch(Exception ex2)
        {
            System.out.println("Oops ! Something went wrong. Please try again. ");
            change();
        
        }
        }
            
            static void remove()throws IOException
            {
                   
               try
               {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Are you sure you want to remove security locks? Press "+'\''+"Y"+'\''+" to continue");
                char ch = (char)br.read();
                security_lock obj = new security_lock();
                PrintWriter obj1 = new PrintWriter(new BufferedWriter(new FileWriter("confirm.txt")));
                
                if(ch == 'y')
                {
                    
                    boolean c1 = obj.unlock();
                    while(c1!= true)
                    {
                        System.out.println("Invalid code. Please try again.");
                        c1 = obj.unlock();
                    }
                    obj1.println("off");
                    obj1.close();
                }
                else
                {
                    obj1.println("on");
                    obj1.close();
                }
            }catch(Exception ex3)
        {
            System.out.println("Oops ! Something went wrong. Please try again. ");
            remove();
        
        }
            }
            void main()throws Exception
            {
                   security_lock sl2=new security_lock();
                try
                {
                Scanner ck = new Scanner(System.in);
                System.out.println("1 : Change Security code");
                System.out.println("2 : Remove Security code");
                int opt = ck.nextInt();
                while(opt<1 || opt>2)
                {
                    System.out.println("Invalid option! Please Retry!");
                    opt = ck.nextInt();
                }
                switch(opt)
                {
                     case 1 :
                     change();
                     break;
                     case 2 :
                     remove();
                     break;
                    }
                }catch(Exception ex4)
        {
            System.out.println("Oops ! Something went wrong. Please try again. ");
            sl2.main();
        
        }
            }
        }
             
         