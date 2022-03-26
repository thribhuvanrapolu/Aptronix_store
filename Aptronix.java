import java.util.*;
class Aptronix 
{
    double totalprice=0.0,dis=0.0,totalp=0.0;
    boolean flag1=false;int count=0;
    String []w=new String [100]; //storage
    String []u=new String [100]; //processor
    String []x=new String [100]; //nameofproduct
    String []y=new String [100]; //colour
    double []t=new double[100]; //price
    Scanner obj=new Scanner(System.in);
    public void menu()
    {
       String ans="";
        Aptronix ob=new Aptronix(); 
        do
        {
            System.out.println("\f");
            System.out.println("*********************************** WELCOME TO APTRONIX (AUTHORISED STORE OF APPLE)***********************************");
            System.out.println("THESE ARE TODAYS OFFERS");
            System.out.println("GET 30% OFFER BY PAYING WITH AMAZON PAY \nBUY  iPHONE 7,iPHONE 7PLUS,iPHONE 8,iPHONE 8PLUS,iPHONE X,iPHONE XS,iPHONE XS MAX,iPHONE XR AND GET WIRELESS HEADPHONES FREE \nGET APPLE PENCIL FREE BY BUYING ANY iPAD \nBUY iPHONE OR iPAD OR MAC AND GET FREE WARRANTY FOR 3 YEARS\nGET 10% ADDITIONAL CASHBACK BUY PAYING WITH AXIS BANK OR STATE BANK OF INDIA OR ANDHRA BANK \nBUY iPHONE OR iPAD AND GET 1 YEAR SCREEN REPLACEMENT");

            System.out.println("SELECT YOUR CHOICE");
            System.out.println("1-MOBILEPHONES");
            System.out.println("2-ACCESSORIES");
            System.out.println("3-TABLETS");
            System.out.println("4-MAC");
            System.out.println("5-BILL");
            System.out.println("6-EXIT");
            int ch=obj.nextInt();
            switch (ch)
            {
                case 1:iPHONE();break;
                case 2:accessories();break;
                case 3:iPAD();break;
                case 4:mac();break;
                case 5:bill();break;
                case 6:exit();break;
                default:{System.out.println("PLEASE ENTER THE CORRECT CHOICE");ob.menu();}
            }
            System.out.println("ANY MORE TRANSACTIONS (YES/NO)");
            ans=obj.next();
        }
        while(ans.equalsIgnoreCase("yes"));
        if(flag1==false)
        {
            System.out.println("YOU HAVE TO PAY THE BILL");
            bill();
        }
    }
    private void iPHONE()
    {
        Aptronix ob=new Aptronix(); 
        double price=0.0;
        boolean flag=false;
        String []nameofmobile={"iPHONE SE ","iPHONE 6","iPHONE 6S","iPHONE 6S PLUS","iPHONE 7","iPHONE 7PLUS","iPHONE 8","iPHONE 8PLUS","iPHONE X","iPHONE XS","iPHONE XS MAX","iPHONE XR"};
        double []startingprice={15000.00,20000.00,25000.00,30000.00,34000.00,40000.00,50000.00,60000.00,72000.00,91000.00,100000.00,76000.00};
        String []rarecamera={"12","8","12","12","12","12","12","12","12+12(2 cameras)","12+12(2 cameras)","12+12(2 cameras)","12"};
        String []frontcamera={"1.2","1.2","5","5","7","7","7","7","7","7","7","7"};
        String []batterycapacity={"1624","1810","1715","1715","1960","2900","1821","2691","2716","2658 ","3174","2942"};    
        for (int i=0;i<nameofmobile.length;i++)
        {
            System.out.println((i+1)+")"+nameofmobile[i]+"\nStarting price: Rupees"+startingprice[i]+"\nRare camera: "+rarecamera[i]+" megapixel \nFront camera:"+frontcamera[i]+" megapixel \nBatterycapacity:"+batterycapacity[i]+" mAh");
        }
        System.out.println("ENTER THE CHOICE OF PHONE THAT YOU WANT TO BUY");
        int a=obj.nextInt();
        if (a==0||a>12)
        {   System.out.println("WRONG CHOICE");ob.menu();
        }
        System.out.println("ENTER THE CHOICE OF STORAGE THAT YOU WANT (PRICE MAY VARY) \n1-16GB(NOT AVAILABLE FOR iPHONE 7,iPHONE 7PLUS,iPHONE 8,iPHONE 8PLUS,iPHONE X,iPHONE XS,iPHONE XS MAX,iPHONE XR) \n2-32GB(NOT AVAILABLE FOR iPHONE 7,iPHONE 7PLUS,iPHONE 8,iPHONE 8PLUS,iPHONE X,iPHONE XS,iPHONE XS MAX,iPHONE XR)\n3-64GB\n4-128GB\n5-256GB");
        int b=obj.nextInt();
        if (b==0||b>5)
        {   System.out.println("WRONG CHOICE");ob.menu();
        }
        System.out.println("SELECT COLOUR \n1-SPACEGREY \n2-SILVER\n3-ROSEGOLD\n4-BLACK");
        String []colour={"SPACEGREY","SILVER","ROSEGOLD","BLACK"};
        int c=obj.nextInt();
        if (c==0||c>4)
        {   System.out.println("WRONG CHOICE");ob.menu();
        }
        String []storage={"16","32","64","128","256"};
        if(a<=12)
            {
                if(b==1)
                 price=startingprice[a-1]+5000.00;
                if(b==2)
                 price=startingprice[a-1]+10000.00;
                if(b==3)
                 price=startingprice[a-1]+15000.00;
                if(b==4)
                 price=startingprice[a-1]+20000.00;
                if(b==5)
                 price=startingprice[a-1]+25000.00;
                flag=true;
                t[count]=price;
                x[count]=nameofmobile[a-1];
                w[count]=storage[b-1];
                y[count]=colour[c-1];
                count++;
                
            }
        
        if (a==12||a==11||a==10)
        {
            System.out.println("YOU NEED TO SELECT THE SIM SERVICE SINCE THE PHONE HAS EMBEDDED SIM \nSELECT THE SIM SERVICE \n1-JIO \n2-AIRTEL \nSELECT YOUR CHOICE");
            int sim=obj.nextInt();
            price+=60;
        }totalp=totalp+price;
        if (flag==true)
        System.out.println("BILL:"+price);
        else
        System.out.println("INVALID CHOICE");
    }
    private void accessories()
    {
        Aptronix ob=new Aptronix(); 
        boolean flag=false;
        String []option={"APPLE WATCH(Series 1)","APPLE WATCH(Sport)","APPLE WATCH(Series 3)","APPLE WATCH(Series 4)","APPLE PENCIL","MOBILE CHARGER(type C)","HEADPHONES(WIRED)","HEADPHONES(WIRELESS)"};
        double []cost={18944.00,22900.00,31900.00,40900.00,7600.00,500.00,1000.00,10000.00};
        for(int i=0;i<option.length;i++)
        System.out.println((i+1)+")"+option[i]+"  PRICE:RUPEES "+cost[i]);
        System.out.println("SELECT YOUR CHOICE"); 
        int ab=obj.nextInt();
        if (ab==0||ab>8)
        {   System.out.println("WRONG CHOICE");ob.menu();
        }
          if(ab<=8)
            {
                t[count]=cost[ab-1];
                x[count]=option[ab-1];
                w[count]="-";
                y[count]="white";
                count++;totalp=totalp+cost[ab-1];
                flag=true;
            }
        if (flag==true)
        System.out.println("BILL:"+cost[ab-1]);
        else
        System.out.println("INVALID CHOICE");
    }
    
    private void iPAD()
    {
        Aptronix ob=new Aptronix(); 
        double price=0;boolean flag=false;
        String []tab={"Apple iPad(6th Gen)","Apple iPAD pro"};
        double []startingprice={20000.00,60000.00};
        for(int i=0;i<tab.length;i++)
        System.out.println((i+1)+")"+tab[i]+"  Starting Price:Rupees "+startingprice[i]);
        System.out.println("ENTER YOUR CHOICE");
        int abc=obj.nextInt();
        if (abc==0||abc>2)
        {   System.out.println("WRONG CHOICE");ob.menu();
        }
        String []colour={"SPACEGREY","SILVER","ROSEGOLD","BLACK"};
        for(int i=0;i<colour.length;i++)
        System.out.println((i+1)+")"+colour[i]  );
        System.out.println("ENTER YOUR CHOICE");
        int c=obj.nextInt();
        if (c==0||c>4)
        {   System.out.println("WRONG CHOICE");ob.menu();
        }
        String []storage={"32","64","128","256"};
        for(int i=0;i<storage.length;i++)
        System.out.println((i+1)+")"+storage[i]  );
        System.out.println("ENTER YOUR CHOICE");
        int b=obj.nextInt();
        if (b==0||c>4)
        {   System.out.println("WRONG CHOICE");ob.menu();
        }
        if(abc==1||abc==2)
         {
                if(b==1)
                 price=startingprice[abc-1]+10000.00;
                if(b==2)
                 price=startingprice[abc-1]+15000.00;
                if(b==3)
                 price=startingprice[abc-1]+20000.00;
                if(b==4)
                 price=startingprice[abc-1]+25000.00;
                t[count]=price;
                flag=true;
                x[count]=tab[abc-1];
                w[count]=storage[b-1];
                y[count]=colour[c-1];
                count++;
                totalp=totalp+price;
            }
        if (flag==true)
        System.out.println("BILL:"+price);
        else
        System.out.println("INVALID CHOICE");
    }    
    private void mac()
    {
        Aptronix ob=new Aptronix(); 
        double price=0.0;boolean flag=false;
        String []mac={"Apple mac book pro","Apple mac book air"};
        int []startingprice={70000,60000};
        for(int i=0;i<mac.length;i++)
        System.out.println((i+1)+")"+mac[i]+"  Starting Price:Rupees "+startingprice[i]);
        System.out.println("ENTER YOUR CHOICE");
        int abcd=obj.nextInt();
        if (abcd==0||abcd>2)
        {   System.out.println("WRONG CHOICE");ob.menu();
        }
        String []pro={"i3","i5","i7"};
        for(int i=0;i<pro.length;i++)
        System.out.println((i+1)+")"+pro[i]  );
        System.out.println("ENTER YOUR CHOICE");
        int c=obj.nextInt();
        if (c==0||c>3)
        {   System.out.println("WRONG CHOICE");ob.menu();
        }
        String []storage={"128","256"};
        for(int i=0;i<storage.length;i++)
        System.out.println((i+1)+")"+storage[i]  );
        System.out.println("ENTER YOUR CHOICE");
        int b=obj.nextInt();
        if (b==0||b>2)
        {   System.out.println("WRONG CHOICE");ob.menu();
        }
        if(abcd==1||abcd==2)
            {
                if(b==1)
                {
                    if(c==1)
                    price=startingprice[abcd-1]+20000.00;
                    if(c==2)
                    price=startingprice[abcd-1]+30000.00;
                    if(c==3)
                    price=startingprice[abcd-1]+40000.00;
                }
                if(b==2)
                {
                 if(c==1)
                 price=startingprice[abcd-1]+30000.00;
                 if(c==2)
                    price=startingprice[abcd-1]+40000.00;
                 if(c==3)
                 price=startingprice[abcd-1]+50000.00;
                }  
                flag=true;
                t[count]=price;
                x[count]=mac[abcd-1];
                w[count]=storage[b-1];
                u[count]=pro[c-1];
                y[count]="-";
                count=count+1;
                totalp=totalp+price;
            }
        if (flag==true)
        System.out.println("BILL:"+price);
        else
        System.out.println("INVALID CHOICE");
    }         
    private void bill()
    {
        Aptronix ob=new Aptronix();
        System.out.println("SELECT THE MODE OF PAYMENT: \n1-AXIS BANK\n2-STATE BANK OF INDIA\n3-ANDHRA BANK\n4-AMAZON PAY\n5-OR ANY OTHER BANK");
        int ch1=obj.nextInt();
        if(ch1==0||ch1>5)
        {System.out.println("WRONG CHOICE");
        ob.menu();}
        switch(ch1)
        {
            case 1:
            case 2:
            case 3:{
                         dis=totalp*(10.0/100.0);
                         System.out.println("CONGRATS !!! YOU HAVE GOT Rupees"+dis+" CASHBACK");
                         totalprice=totalp-dis;
                   }break;
            case 4:{
                         dis=totalp*(30.0/100.00);       
                         System.out.println("CONGRATS !!! YOU HAVE GOT Rupees"+dis+"DISCOUNT");
                         totalprice=totalp-dis;
                   }break;
            case 5:{totalprice=totalp;
                    System.out.println("SORRY YOU HAVE GOT NO DISCOUNT");}
        }
        System.out.println("PRODUCTS");
        System.out.println("S.NO \t\t\t\tNAME OF THE PRODUCT \t\t\t\t\t\t\tSTORAGE \t\t\t\t\t\tCOLOUR \t\t\t\t\t\t\tPROCESSOR \t\t\t\t\t\t\t\tPRICE");
        for(int i=0;i<count;i++)
        {
            System.out.println((i+1)+") \t\t\t\t "+x[i]+"\t\t\t\t\t\t\t "+w[i]+"\t\t\t\t\t\t\t "+y[i]+"\t\t\t\t\t\t\t "+u[i]+"\t\t\t\t\t\t\t\t "+t[i]);    
        }
        System.out.println("\t\t\t\t \t\t\t\t \t\t\t\t \t\t\t\t TOTAL PRICE IS:"+totalprice+"\nTHANK YOU VISIT AGAIN");
        flag1=true;
    }
    private void exit()
    {
        if(flag1==false)
        {
            System.out.println("YOU HAVE TO PAY THE BILL");
            bill();
        }
    }
}               