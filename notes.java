import java.io.*;
import java.util.*;
public class notes
{
   static void new_note()throws Exception
   {
      
       try
        {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         System.out.println("Save note as..");
         String name = br.readLine();
         PrintWriter obj = new PrintWriter(new BufferedWriter(new FileWriter(name +".txt", true)));
         System.out.println("*enter exit in a new line when finished*");
         String enter = "";
         while(enter.equalsIgnoreCase("exit")==false)
         {
             enter = br.readLine();
             if(enter.equalsIgnoreCase("exit")==false)
             {
             obj.println(enter);
            }
             
        }
        obj.close();
    }catch(Exception ex1)
    {
        System.out.println("An error has occured. Please begin again. ");
        new_note();
}
}
     static void edit()throws Exception
    {
       try
       {
        notes obj = new notes();
       Scanner ck = new Scanner(System.in);
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       System.out.println("[enter save after all editing is done]");
       System.out.println("Name the note to be edited.");
       String name = ck.nextLine();  
       
              boolean check1 = true; 
              if(check1!=true)
        {
           File obj1 = new File(name+".txt");

           System.out.println("File doesn't exists! Enter a valid name.");
            check1 = obj1.exists();

           edit();
        }
       System.out.println("Opening note in edit mode..");
       String check = obj.edit1(name);
       while(check.equalsIgnoreCase("save")==false)
       check = obj.edit1(name);
    }catch(Exception ex2)
    {
        System.out.println("An error has occured. Please begin again. ");
        edit();
    }
}
      static String edit1(String name)throws Exception
       {
           String ret="";
           int i;
      
           Scanner ck = new Scanner(System.in);
           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
           Scanner ck1 = new Scanner(new FileReader(name+".txt"));
       for(i =1;ck1.hasNextLine();i++)
       {
            System.out.print(i+": ");
            System.out.println(ck1.nextLine());
        }
        ck1.close();
        System.out.println("Enter line to be edited or type add to add to the note");
        String line = ck.next();
        
        if(line.equalsIgnoreCase("add"))
        {
            notes obj = new notes();
            obj.add(name);
        }
        else
        {
        int l_no = Integer.valueOf(line);
        while(l_no>i-1)
        {
            System.out.println("No such line present! Please enter again!");
            line = ck.next();
            l_no=Integer.valueOf(line);
        }
        Scanner ck2 = new Scanner(new FileReader(name+".txt"));
       
        
        String spare = "";
        String new_text = "";
        String new_line = "";
        System.out.println("Enter new line");
        new_line = br.readLine();
        
        
        for(int j=1; ck2.hasNextLine();j++)
        {
            if(j!=l_no)
            {
             new_text = new_text + ck2.nextLine();
             new_text = (new_text + '\n');
             //obj.println(ck2.nextLine())
        }
            else
            {
                 spare = ck2.nextLine();
                new_text = new_text + new_line;
                new_text = (new_text + '\n');
                //obj.println(new_line);
                
        }
    }
    ck2.close();
    String nt = new_text.trim();
    PrintWriter obj1 = new PrintWriter(new BufferedWriter(new FileWriter(name+".txt")));
    obj1.println(nt); 
    obj1.close();
    
   }
   System.out.println("Enter save to save the note, else press 1");
   ret = br.readLine();
    
  /*catch(Exception ex3)
  {
      System.out.println("An error has occured. Please begin again. ");
      edit1(name);
    }*/
    return ret;
}

   static void display()throws Exception
   {
      try
      {
       Scanner ck = new Scanner(System.in);
           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
           System.out.println("Enter note to be displayed");
           String name = ck.nextLine();
           
       
       boolean check=true;
       if(check!=true)
       {
           File obj = new File(name+".txt");
           System.out.println("File doesn't exists! Enter a valid name.");
           check = obj.exists();
           display();
        }
           Scanner ck1 = new Scanner(new FileReader(name+".txt"));
           System.out.println("Content:");
           for(int i =1;ck1.hasNextLine();i++)
        {
          System.out.println(ck1.nextLine());
        }
        ck1.close();
    }catch(Exception ex4)
    {
        System.out.println("An error has occured. Please begin again. ");
        display();
    }
 
}
 static void add(String a)throws Exception 
  {
      try
      {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(a+".txt.", true)));
        System.out.println("Enter new line.");
        String line = br.readLine();
        pw.println(line);
        pw.close();
}catch(Exception ex5)
{
    System.out.println("An error has occured. Please begin again. ");
    add(a);
}
}
  void main()throws Exception
  {
      notes ob=new notes();
      try
      {
      Scanner ck = new Scanner(System.in);
      System.out.println("1 : Make New note");
      System.out.println("2 : View notes");
      System.out.println("3 : Edit notes");
      System.out.println("4 : Delete notes");
      int opt = ck.nextInt();
      if(opt<1 || opt >4)
      {
          System.out.println("Retry!!");
          opt = ck.nextInt();
        }
      switch(opt)
      {
          case 1 :
          new_note();
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
                    }break;
          case 2 : display(); 
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
          case 3 : edit(); 
          System.out.println();
                        System.out.println("Press 'Y' to continue else press 'N'");
                        String o2 = ck.next();
                        while(o2.length()!=1)
                        {
                            System.out.println("Invalid option! Please try again");
                            o2= ck.next();
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
          case 4 :
          delete();
          System.out.println();
                        System.out.println("Press 'Y' to continue else press 'N'");
                        String o5 = ck.next();
                        while(o5.length()!=1)
                        {
                            System.out.println("Invalid option! Please try again");
                            o5 = ck.next();
                        }
                        if(o5.equalsIgnoreCase("n"))
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
    }catch(Exception ex6)
    {
        System.out.println("An error has occured. Please begin again. ");
        ob.main();
}
 }         
  static void delete()throws IOException
 {
     try
     {
     BufferedReader ck = new BufferedReader(new InputStreamReader(System.in)); 
      System.out.println("Enter file to be deleted");
       String name = ck.readLine();
       File obj = new File(name+".txt");
       boolean check;
       check = obj.exists();
       if(check!=true)
       {
           
           
           System.out.println("File doesn't exists! Enter a valid name.");
           
           obj.delete();
           delete();
        }
        
        else
        {
        obj.delete();
       
       System.out.println("File successfully deleted");
       
} 
}
catch(Exception ew)
{
System.out.println("Oops! An error occured. Please try again.");
delete();
}
}
}


         