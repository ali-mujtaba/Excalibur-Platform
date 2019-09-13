import java.io.*;
import java.util.*;
public class calculator
{
    
   void main()
   {
       try
       {
           System.out.println("Information: Operator as well as operands should be entered in separate lines. Type 'Exit' if you want to close the calculator and 'Clear' to clear the result. . ");
           System.out.println("* Proceed with your calculations below. ");
           calculator obj=new calculator();
           obj.simple();
        }
        catch(Exception ex4)
    {
        System.out.println("Oops ! An error occured. ");
    }
    }

    void simple()throws Exception
   {
       double i=2,result=0.0,op1=0.0;
       long open=0;
       char op=' ';
       boolean re;
       String ope="",res="",op12="";
       String st="";
       System.out.println();
       Scanner in=new Scanner(System.in);
       try
       {
       res=in.next();
       if(res.equalsIgnoreCase("exit"))
       {
                main1 po=new main1();
                po.menu();
            }
       else if(res.equalsIgnoreCase("clear"))
        {
           System.out.print('\f');
           calculator ob=new calculator();
           ob.simple();
        }
        else
       result=Double.parseDouble(res);
       try
       {
       while(st.equalsIgnoreCase("exit")==false)
       {
            
           if(i%2==0)
           {
              
               ope=in.next();
               if(ope.equalsIgnoreCase("exit"))
                break;
               if(ope.equalsIgnoreCase("clear"))
                {
                   calculator ob=new calculator();
                   ob.simple();
                }
                try
                {
                    open=Long.valueOf(ope);
                    re= true;
                }catch(NumberFormatException ex10){
                    re= false ;
                }
                if(re==false)
                {
               while(ope.length()!=1)
            {
               System.out.println("Invalid input. Please re-enter. ");
               ope=in.next();
                if(ope.equalsIgnoreCase("exit"))
                 break;
                if(ope.equalsIgnoreCase("clear"))
                {
                    calculator ob=new calculator();
                    ob.simple(); 
                }
                
            }
            op=ope.charAt(0);
               i++;
            }else
            {result=open;
            continue;
        }
            }
        
            else
            {
               
                op12=in.next();
                if(op12.equalsIgnoreCase("exit"))
                break;
                if(op12.equalsIgnoreCase("clear"))
                {
                    calculator ob=new calculator();
                    ob.simple();
                }
                op1=Double.parseDouble(op12);
                System.out.println();
                try
                {
                switch(op)
                {
                    
                    case '+' : result=result+op1;
                    System.out.println("= "+result);
                    i++;
                    break;
                    case '-' : result=result-op1;
                    System.out.println("= "+result);
                    i++;
                    break;
                    case '*' : result=result*op1;
                    System.out.println("= "+result);
                    i++;
                    break;
                    case '/' : result=result/op1;
                    System.out.println("= "+result);
                    i++;
                    break;
                    default : System.out.println("Invalid operator. ");
                    ope=in.next();
                    while(ope.length()!=1)
                    {
                        System.out.println("Invalid operator. ");
                        ope=in.next();
               
                    }
                    op=ope.charAt(0);
                    break;
                }
            }   catch(InputMismatchException ex1)
                {
                    System.out.println("Invalid input. Re-enter the correct operator. ");
                    result=in.nextDouble();
                    break;
                    
        
                }
            }  
        }
    }       catch(NumberFormatException ex2)
            {
                System.out.println("Invalid number. Re-enter the number. ");
                op12=in.next();
                if(op12.equalsIgnoreCase("exit"))
                {
                main1 po=new main1();
                po.menu();
            }
                if(res.equalsIgnoreCase("clear"))
                {
                    calculator ob=new calculator();
                    ob.simple();
                }
                op1=Double.parseDouble(op12);
            }
}catch(NumberFormatException ex3)
{
    System.out.println("Invalid number. Re-enter the number. ");
    res=in.next();
       if(res.equalsIgnoreCase("exit"))
{
                main1 po=new main1();
                po.menu();
            }
       if(res.equalsIgnoreCase("clear"))
        {
           calculator ob=new calculator();
           ob.simple();
        }
       
        result=Double.parseDouble(res);
    }
    main1 oc=new main1();
       oc.menu();
}
}
