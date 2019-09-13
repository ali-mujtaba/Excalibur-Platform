 import java.util.*;
 public class calendar
 {
     
     int dd;
      int mm;
      int yy;
      int space;
     calendar()
     {
         dd = 0;
         mm = 0;
         yy = 0;
         space =0;
        }
     void display()
     {
         
         System.out.print("SUN" +'\t');
         System.out.print("MON" +'\t');
         System.out.print("TUE" +'\t');
         System.out.print("WED" +'\t');
         System.out.print("THU" +'\t');
         System.out.print("FRI" +'\t');
         System.out.print("SAT" +'\t');
         /*calendar obj = new calendar();
         int m = obj.space_finder();*/
         
         System.out.println();
         int ns = space;
         int nm = 0;
         while(ns>=7)
         ns = ns-7;
         int count = ns;
         for(int j=0;j<ns;j++)
         System.out.print("   "+ '\t');
         switch(mm)
         {
              case 1: nm=31;break;
              case 2: nm =28;break;
              case 3: nm=31;break;
              case 4: nm =30;break;
              case 5: nm= 31;break;
              case 6: nm=30;break;
              case 7: nm=31;break;
              case 8: nm=31;break;
              case 9: nm=30;break;
              case 10: nm =31;break;
              case 11: nm=30;break;
              case 12: nm=31;break;
              default: System.out.print("not a month");break;
            }
            for(int i=1; i<=nm; i++)
            {
                 System.out.print(i +"   " + '\t');
                 count = count +1;;
                 if(count%7==0)
                 System.out.println();
                }
            
    }
             void enter()
            {
             try
             {
                 
                Scanner ck = new Scanner(System.in);
                System.out.println("Enter date in dd/mm/yyyy in separate line.");
                System.out.println("Enter day");
                dd = ck.nextInt();
                while(dd>31)
                {
                    System.out.println("Invalid date! Enter again!");
                    dd = ck.nextInt();
                }
                System.out.println("Enter month");
                mm = ck.nextInt();
                while(mm>12)
                {
                System.out.println("not a month Please enter again");
                mm = ck.nextInt();
            }
            while(mm == 2 && dd >29)
            {
                System.out.print('\f');
                System.out.println("Invalid date! Please enter again!");
                enter();
            }
                System.out.println("Enter year");
                yy = ck.nextInt();
                while(yy<1905)
                {
                System.out.println("DATA UNAVAILABLE! Please input enter");
                yy = ck.nextInt();
            }
            
    }
    catch(Exception ex)
    {
         System.out.print('\f');
         System.out.println("Invalid date! Please try again!");
         enter();
        }
}
             int check(int a, int b)
            {
                 
                int c =0;
                 int ctr =0;
                 if(a%100==0||b%100==0)
                 ctr++;
                 switch(ctr)
                 {
                     case 0:
                     if(a%4==0)
                     c = c+1;
                     else if(b%4==0)
                     c = c+2;
                     else
                     c=c+0;
                     
                     case 1:
                     if(a%400==0&&a%4==0)
                     c+=1;
                     else if(b%400==0&&b%4==0)
                     c+=2;
                     else
                     c+=0;
                     break;
                 
                }
                
                //System.out.println(c);//
                return c;
            }
                 
             void space_finder()
             {
                 int py;
                 int cy =0;
                 int ny;
                 ny = yy-1905;
                 py = 1905;
                 int c = 0;
                 calendar obj = new calendar();
                 for(int i =0;i <ny; i++)
                 {
                     cy = py+1;
                      c = obj.check(py, cy);
                     switch(c)
                     {
                          case 0:
                          space+=1;break;
                          case 1:
                          space+=2;
                          break;
                          case 2:
                          space+=1;
                          break;
                        }
                        py = cy;
                    }
             
                    int nm = mm-1;
                    int cm = 1;
                    for(int i = 1;i<=nm; i++)
                    {
                        cm =i;
                        switch(cm)
                        {
                            case 1:
                            space+=3;
                            break;
                            case 2:
                            if(cy%100==0)
                            {
                                if(cy%400==0)
                                space+=1;
                                else
                                space+=0;
                            }
                                else
                                {
                                    if(cy%4==0)
                                    space+=1;
                                    else
                                    space+=0;
                                }
                                break;
                                case 3:
                                space+=3;
                                break;
                                case 4:
                                space+=2;
                                break;
                                case 5:
                                space+=3;
                                break;
                                case 6:
                                space+=2;
                                break;
                                case 7:
                                space+=3;
                                break;
                                case 8:
                                space+=3;
                                break;
                                case 9:
                                space+=2;
                                break;
                                case 10:
                                space+=3;
                                break;
                                case 11:
                                space+=2;
                                break;
                                case 12:
                                space+=3;
                                break;
                            }
                        }
                        //System.out.println(space);

                    }
                    void main()throws Exception
                    {
                        Scanner ck = new Scanner(System.in);
                        calendar obj = new calendar();
                        System.out.println("[from 1905 onwards]");
                        obj.enter();
                        obj.space_finder();
                        obj.display();
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
                } 
                }
                     
                     
        
    