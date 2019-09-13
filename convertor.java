import java.util.*;
public class convertor
{
   /*void currency()
   {
       Scanner ck = new Scanner(System.in);
       System.out.println("INR" + '\t' + "1");
       System.out.println("USD" + '\t' + "2");
       System.out.println("GBP" + '\t' + "3");
       System.out.println("EUR" + '\t' + "4");
       System.out.println("JPY" + '\t' + "5");
       System.out.println("Enter currency(number) to be converted");
       int cr = ck.nextInt();
       System.out.println("enter value");
       double val = ck.nextInt();
       convertor obj = new convertor();
       obj.convert(cr);
       
    }
       void convert(int a, double b)
       {
           if(a==2)
           b = b/50;
           else if(a==3)
           b = b/0.012;
           else if(a==4)
           b = b/0.0171;
           else if(a==5)
           b = b/2.3447;
           else
           b = b*1;
           
           System.out.println("In INR: " (b *50));
           System.out.println("In USD: " (b*0.012)
           
        }*/
        void length()
       {
           convertor obj1=new convertor();
           try
           {
           double val=0.0;
           //String va="";
           Scanner ck = new Scanner(System.in);
           System.out.println("Enter unit to be converted");
           System.out.println("m" + '\t' + "1");
           System.out.println("mm" + '\t' + "2");
           System.out.println("cm" + '\t' + "3");
           System.out.println("km" + '\t' + "4");
           System.out.println("inches" + '\t' + "5");
           System.out.println("miles" + '\t' + "6");
           System.out.println("yards" + '\t' + "7");
           int unit = ck.nextInt();
           System.out.println("Enter value to be converted");
           val = ck.nextDouble();
         
            convertor obj = new convertor();
           obj.convert1(unit, val);
        }catch(Exception ex1)
        {
            System.out.println("An error occured ! Please be careful with input. ");
            obj1.length();
        }
    }
           void convert1(int a, double b)
           {
              convertor obj2=new convertor();
              try
              {
                  int val1 = 0;
               if(a==2)
               b = b/1000;
               else if(a==3)
               b = b/100;
               else if(a==4)
               b = b*1000;
               else if(a==5)
               b = b/39.3707;
               else if(a==6)
               b = b/0.00062;
               else if(a==7)
               b = b/1.094;
               else
               b = b*1;
               
               System.out.println("In m : " + b);
               System.out.println("In mm : " +(b*1000));
               System.out.println("In cm : " + (b*100));
               System.out.println("In  km : " + (b/1000));
               System.out.println("In Inches : " +(b*39.3707));
               System.out.println("In Miles : " + (b*0.00062));
               System.out.println("In Yards : " +(b*1.094));
            }catch(Exception ex2)
            {
                System.out.println("An error occured ! Please be careful with input. ");
                obj2.length();
        }
    }
                
            void temperature()
            {
                convertor obj3=new convertor();
                try
                {
                Scanner ck = new Scanner(System.in);
                System.out.println("Enter unit to be converted");
                System.out.println("`C" + '\t' + "1");
                System.out.println("`F" + '\t' + "2");
                int unit = ck.nextInt();
                System.out.println("Enter value to be converted");
                double val = ck.nextDouble();
                double val1 = 0.0;
                if(unit == 1)
                {
                 val1 = (((val*9)/5) + 32);
                 System.out.println("In `C : " + val);
                 System.out.println("In `F : " + val1);
                }
                else
                {
                val1 = (((val-32)*5)/9);
                System.out.println("In `C : " + val1);
                System.out.println("In `F : " + val);
        }
    }catch(Exception ex3)
    {
        System.out.println("An error occured ! Please be careful with input. ");
            obj3.temperature();
        }
    }
             void weight()
             {
                 convertor obj4=new convertor();
                 try
                 {
                 Scanner ck = new Scanner(System.in);
                 System.out.println("Enter unit to be converted");
                 System.out.println("kg : " +"  "+ '\t' + "1");
                 System.out.println("mg : " +"  "+ '\t' + "2");
                 System.out.println("g :  " +"  "+ '\t' + "3");
                 System.out.println("Tonne : " + '\t' + "4");
                 System.out.println("Pounds : " + '\t' + "5");
                 System.out.println("Ounces : " + '\t' + "6");
                 int unit = ck.nextInt();
                 System.out.println("Enter value to be converted");
                 double val = ck.nextDouble();
                 convertor obj = new convertor();
                 obj.convert2(unit, val);
                }catch(Exception ex4)
                {
                    System.out.println("An error occured ! Please be careful with input. ");
            obj4.weight();
        }
    }
                
                void convert2(int a, double b)
                {
                    convertor obj5=new convertor();
                    try
                    {
                    if(a==2)
                     b = b/1000000;
                     else if(a==3)
                     b= b/1000;
                     else if(a==4)
                     b= b*1000;
                     else if(a==5)
                     b= b/2.204;
                     else if(a==6)
                     b= b/35.2739;
                     else
                     b= b*1;
                     
                     System.out.println("In kg : " +b);
                     System.out.println("In mg : " +(b*1000000));
                     System.out.println("In g : " +(b*1000));
                     System.out.println("In Tonne : " +(b*0.001));
                     System.out.println("In Pounds : " +(b*2.204));
                     System.out.println("In Ounces : " +(b*35.2739));
                    }catch(Exception ex5)
                    {
                        System.out.println("An error occured ! Please be careful with input. ");
                        obj5.weight();
                    }
                }
                    void volume()
                    {
                        convertor obj6=new convertor();
                        try
                        {
                          Scanner ck = new Scanner(System.in);
                          System.out.println("Enter unit to be converted");
                          System.out.println("In cubic meter" + '\t' + "1");
                          System.out.println("In cubic centimeter" + '\t' + "2");
                          System.out.println("In Gallons" + '\t' + "3");
                          System.out.println("In liters" + '\t' + "4");
                          int unit = ck.nextInt();
                          System.out.println("Enter value to be converted");
                          double val = ck.nextDouble();
                          convertor obj = new convertor();
                          obj.convert3(unit, val);
                        }catch(Exception ex6)
                        {
                            System.out.println("An error occured ! Please be careful with input. ");
                            obj6.volume();
                        }
                }
                   void convert3(int a, double b)
                   {
                       convertor obj7=new convertor();
                       try
                       {
                       if(a==2)
                       b = b/1000000;
                       else if(a==3)
                       b= b/220;
                       else if(a==4)
                       b = b/1000;
                       else
                       b= b*1;
                       
                       System.out.println("In cubic metre :" +b);
                       System.out.println("In cubibic centemetre :" + (b*1000000));
                       System.out.println("In Gallons :" + (b*220));
                       System.out.println("In litres :" + (b*1000));
                    }catch(Exception ex7)
                    {
                        System.out.println("An error occured ! Please be careful with input. ");
                        obj7.volume();
                }
            }
                    void areas()
                    {
                        convertor obj8=new convertor();
                        try
                        {
                        Scanner ck = new Scanner(System.in);
                        System.out.println("Enter unit to be converted");
                        System.out.println("In square metre" + '\t' + "1");
                        System.out.println("In square centimetre" + '\t' +"2");
                        System.out.println("In Acres" + '\t' +"3");
                        System.out.println("In Hectares" + '\t' +"4");
                        int unit = ck.nextInt();
                        System.out.println("Enter value to be converted");
                        double val = ck.nextDouble();
                        convertor obj = new convertor();
                        obj.convert4(unit, val);
                    }catch(Exception ex8)
                    {
                        System.out.println("An error occured ! Please be careful with input. ");
                        obj8.areas();
                    }
                }
                         void convert4(int a, double b)
                        {
                            convertor obj9=new convertor();
                            try
                            {
                            if(a==2)
                            b= b/10000;
                            else if(a==3)
                            b= b/0.00024711;
                            else if(a==4)
                            b=b*10000;
                            
                            System.out.println("In metre square :" + b);
                            System.out.println("In centimetre square :" +(b*10000));
                            System.out.println("In Acres :" + (b*0.00024711));
                            System.out.println("In Hectares :" + (b/10000));
                        }catch(Exception ex9)
                        {
                            System.out.println("An error occured ! Please be careful with input. ");
            obj9.areas();
                    }
                }
                        void main()
                        {
                            convertor obj10=new convertor();
                            try
                            {
                                
                             Scanner ck = new Scanner(System.in);
                             System.out.println("Select convertor");
                             System.out.println("length : 1");
                             System.out.println("Weight : 2");
                             System.out.println("Temperature : 3");
                             System.out.println("Volume : 4");
                             System.out.println("Area: 5");
                             int c= ck.nextInt();
                             convertor call = new convertor();
                             switch(c)
                             {
                                 case 1 : call.length();
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
                                 case 2 : call.weight();
                                 System.out.println();
                        System.out.println("Press 'Y' to continue else press 'N'");
                        String o1 = ck.next();
                        while(o1.length()!=1)
                        {
                            System.out.println("Invalid option! Please try again");
                            o1 = ck.next();
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
                                 case 3 : call.temperature();
                                 System.out.println();
                        System.out.println("Press 'Y' to continue else press 'N'");
                        String o2 = ck.next();
                        while(o2.length()!=1)
                        {
                            System.out.println("Invalid option! Please try again");
                            o2 = ck.next();
                        }
                        if(o2.equalsIgnoreCase("n"))
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
                                 case 4 : call.volume();
                                 System.out.println();
                        System.out.println("Press 'Y' to continue else press 'N'");
                        String o3 = ck.next();
                        while(o3.length()!=1)
                        {
                            System.out.println("Invalid option! Please try again");
                            o3 = ck.next();
                        }
                        if(o3.equalsIgnoreCase("n"))
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
                                 case 5 : call.areas();
                                 System.out.println();
                        System.out.println("Press 'Y' to continue else press 'N'");
                        String o4 = ck.next();
                        while(o4.length()!=1)
                        {
                            System.out.println("Invalid option! Please try again");
                            o4 = ck.next();
                        }
                        if(o4.equalsIgnoreCase("n"))
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
                                 default : System.out.println("WRONG CHOICE");
                                }
                            }catch(Exception ex10)
                            {
                                System.out.println("An error occured ! Please be careful with input. ");
                                obj10.main();
                        }
                    }
                }
       