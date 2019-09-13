import java.io.*;
import java.util.*;
public class contacts
{
    
    void main()throws IOException
    {
       contacts co=new contacts();
        try
        {
        Scanner ch=new Scanner(System.in);
        System.out.println("Press 1 to add a contact.\nPress 2 to edit a contact.\nPress 3 to delete a contact.\nPress 4 to search a contact.\nPress 5 to display all contacts.");
        int choice=ch.nextInt();
        while(choice<1 || choice>5)
        {
            System.out.println("Invalid choice! Please try again!");
            choice = ch.nextInt();
        }
        System.out.println();
        System.out.println();
        contacts obj=new contacts();
        switch(choice)
        {
            case 1: obj.entry();
                    System.out.println();
                        System.out.println("Press 'Y' to continue else press 'N'");
                        String o = ch.next();
                        while(o.length()!=1)
                        {
                            System.out.println("Invalid option! Please try again");
                            o = ch.next();
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
            case 2: obj.edit_contact();
                    System.out.println();
                        System.out.println("Press 'Y' to continue else press 'N'");
                        String o1 = ch.next();
                        while(o1.length()!=1)
                        {
                            System.out.println("Invalid option! Please try again");
                            o1 = ch.next();
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
            case 3: obj.delete();
                    System.out.println();
                        System.out.println("Press 'Y' to continue else press 'N'");
                        String o2 = ch.next();
                        while(o2.length()!=1)
                        {
                            System.out.println("Invalid option! Please try again");
                            o2 = ch.next();
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
            case 4: System.out.println("Enter contact name to look for. ");
                    String str=ch.next()+""+ch.nextLine();
                    obj.search(str);
                    System.out.println();
                        System.out.println("Press 'Y' to continue else press 'N'");
                        String o3 = ch.next();
                        while(o3.length()!=1)
                        {
                            System.out.println("Invalid option! Please try again");
                            o3 = ch.next();
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
            case 5: obj.read_entry();
                    System.out.println();
                        System.out.println("Press 'Y' to continue else press 'N'");
                        String o4 = ch.next();
                        while(o4.length()!=1)
                        {
                            System.out.println("Invalid option! Please try again");
                            o4 = ch.next();
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
        }
        System.out.println();
    }catch(Exception ex1)
    {
        System.out.println("Oops ! Something went wrong. Please try again. ");
        main();
}
}
    
    void entry()throws IOException
    {
       contacts co1=new contacts();
        try
        {
       PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter("contacts.txt",true)));
       Scanner in=new Scanner(System.in);
       contact_details detail=new contact_details();
       System.out.print("Name : ");
       detail.name=in.nextLine();
       System.out.print("Number : ");
       detail.num=in.nextLine();
       pw.println(detail.name+"!"+detail.num);
       System.out.println("Contact saved. ");
       pw.close();
       in.close();
    }catch(Exception ex2)
    {
         System.out.println("Oops ! Something went wrong. Please begin again. ");
        co1.entry();
    }
}
    
    void read_entry()throws IOException
    {
        
        
        contacts co2=new contacts();
        try
        {
        BufferedReader br=new BufferedReader(new FileReader("contacts.txt"));
        String str;
        while((str=br.readLine())!=null)
        {
            StringTokenizer st=new StringTokenizer(str,"!");
            System.out.println("Name : "+st.nextToken());
            System.out.println("Number : "+st.nextToken());
            System.out.println();
        }
        br.close();
    }catch(Exception ex3)
    {
         System.out.println("Oops ! Something went wrong. Please try again. ");
        co2.read_entry();
    }
}
    
    void edit_contact()throws IOException
    {
        contacts co3=new contacts();
        try
        {
        Scanner am=new Scanner(new FileReader("contacts.txt"));
        Scanner edit=new Scanner(System.in);
        System.out.println("Enter the contact name whose data is to be edited. ");
        String name=edit.nextLine();
        PrintWriter pr=new PrintWriter(new BufferedWriter(new FileWriter("contacts_tmp.txt")));
        String str;
        int c;
        String change;
        
        while(am.hasNextLine())
        {
            str=am.nextLine();
            StringTokenizer st=new StringTokenizer(str,"!");
            String s=st.nextToken();
            String num=st.nextToken();
            if(s.equalsIgnoreCase(name))
            {
                System.out.println("Press 1 to change name.");                
                System.out.println("Press 2 to change number. ");
                c=edit.nextInt();
                
                if(c<1 || c>2)
                {
                    System.out.println("Invalid option. Enter a valid option. ");
                    c=edit.nextInt();
                }
                switch(c)
                {
                    case 1: System.out.println("Enter new name. ");
                            change=edit.next()+""+edit.nextLine();
                            pr.println(change+"!"+num);
                            System.out.println("Name successfully changed. ");
                            break;
                            
                    case 2: System.out.println("Enter new number. ");
                            change=edit.next();
                            pr.println(s+"!"+change);
                            System.out.println("Number successfully changed. ");
                            break;
                }
                
                
            }
            else
             pr.println(s+"!"+num);
               
            }
            pr.close();
            edit.close();
            am.close();
            Scanner br=new Scanner(new FileReader("contacts_tmp.txt"));
            PrintWriter pt=new PrintWriter(new BufferedWriter(new FileWriter("contacts.txt")));
            
            while(br.hasNextLine())
            {
                pt.println(br.nextLine());
            }
            pt.close();
            br.close();
            
        }catch(Exception ex4)
    {
         System.out.println("Oops ! Something went wrong. Please try again. ");
        co3.edit_contact();
    }
    }
        
       String search(String str)throws IOException
        {
            contacts co4=new contacts();
            String ret = "";
            try
            {
            int p=0;
            BufferedReader br1=new BufferedReader(new FileReader("contacts.txt"));
            String st;
            String st1,st2;
            
            while((st=br1.readLine())!=null)
            {
                StringTokenizer stn=new StringTokenizer(st,"!");
                st1=stn.nextToken();
                st2=stn.nextToken();
                if(st1.equalsIgnoreCase(str))
                {
                    System.out.println("Name : "+st1);
                    ret = ret + st1 + '\n';
                    System.out.println("Number : "+st2);
                    ret = ret + st2;
                    p++;
                }
            }
            if(p==0)
            {
            System.out.println("Contact not found. Try again.");
            Scanner inc=new Scanner(System.in);
            System.out.println("Enter name to look for. ");
            String sr=inc.nextLine();
            co4.search(sr);
        }
        }
        catch(Exception ex5)
    {
         System.out.println("Oops ! Something went wrong. Please try again. ");
        Scanner cn=new Scanner(System.in);
         System.out.println("Enter name to look for. ");
         String st=cn.nextLine();
         co4.search(st);
    }
            return ret;
    
}
    
    void delete()throws IOException
    {
        contacts co5=new contacts();
        try{
            
        Scanner am=new Scanner(new FileReader("contacts.txt"));
        Scanner edit=new Scanner(System.in);
        System.out.println("Enter the contact name to be deleted.  ");
        String name=edit.nextLine();
        PrintWriter pr=new PrintWriter(new BufferedWriter(new FileWriter("contacts_tmp.txt")));
        String str;
        while(am.hasNextLine())
        {
            str=am.nextLine();
            StringTokenizer st=new StringTokenizer(str,"!");
            String s=st.nextToken();
            String num=st.nextToken();
            if(s.equalsIgnoreCase(name))
            continue;
            else
            pr.println(s+"!"+num);
        }
        pr.close();
        edit.close();
        am.close();
        Scanner br=new Scanner(new FileReader("contacts_tmp.txt"));
        PrintWriter pt=new PrintWriter(new BufferedWriter(new FileWriter("contacts.txt")));
        
        while(br.hasNextLine())
        {
            pt.println(br.nextLine());
        }
        System.out.println("Contact deleted successfully. ");
        pt.close();
        br.close();
    }catch(Exception ex6)
    {
         System.out.println("Oops ! Something went wrong. Please try again. ");
        co5.delete();
    }
}
}
      
        