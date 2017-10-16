import java.util.Scanner;

public class CarDealerArrayTest 
{
    public static void main(String[] args) 
    {
        Scanner scr = new Scanner(System.in);
        
        System.out.print("Enter number of Car to register: ");
        int count = scr.nextInt();
        System.out.println();
        //return String after number
        scr.nextLine();
        
        //create an object to call the class 
        CarDealer[] cardealers = new CarDealer[count];
        
        //create variable to use it as an argument
        String make;
        String model;
        String regNumber;
        int year;
        double miles;
        double price;
        int count2012 = 0;             
        int count2013 = 0;             
        int count2014 = 0;             
        int count2015 = 0;              
        int count2016 = 0;
        int count2017 = 0;
        
        //loop to get all the informations
        for (int lcv = 0; lcv < cardealers.length; lcv++)
        {
            System.out.print("Enter Make: ");
            make = scr.nextLine();
            System.out.print("Enter Model: ");
            model = scr.nextLine();
            System.out.print("Enter Registration Number: ");
            regNumber = scr.nextLine();
            System.out.print("Enter Year of the car must be between 2012 to 2017: ");
            year = scr.nextInt();
            if (year < 2012 || year > 2017)
            {
                System.out.println("Please enter a valid number");
                System.out.print("Enter Year of the car must be between 2012 to 2017: ");
                year = scr.nextInt();
            }
            System.out.print("Enter the miles: ");
            miles = scr.nextDouble();
            System.out.print("Enter the car's Value: ");
            price = scr.nextDouble();
            System.out.println();
            
            //return String after number
            scr.nextLine();
            
            //cal the object
            cardealers[lcv] = new CarDealer(make, model, regNumber, year, miles, price);
            
            switch (cardealers[lcv].getYear())
            {
                case 2012:
                    count2012++;
                    break;
                case 2013:
                    count2013++;
                    break;
                case 2014:
                    count2014++;
                    break;    
                case 2015:
                    count2015++;
                    break;    
                case 2016:
                    count2016++;
                    break;  
                case 2017:
                    count2017++;
                    break;
                    
            }//end switch
        
        }//end for
        
        double totalStock = 0.0;
        
        for(int lcv = 0; lcv < cardealers.length; lcv++)
        {
            System.out.println(cardealers[lcv]);//print individual cars calling the toString method
            totalStock += cardealers[lcv].getPrice();//calling the getPrice for each car
          
        }//end for
        
        System.out.println("Sales Report Version 1: ");
        System.out.printf("\nTotal of car for sales is €%,.2f\n", totalStock);
        System.out.printf("Average Stock: €%,.2f\n", totalStock/cardealers.length);
        
        System.out.printf("\n2012: %d\n2013: %d\n2014: %d\n2015: %d\n2016: %d\n2017: %d\n",
                count2012, count2013, count2014, count2015, count2016, count2017);
        
        System.out.println();
        
        totalStock = 0.0;
        //create array for count years, declared only 6 years for while
        int[] carsYear = new int[6];
        for(int lcv = 0; lcv < cardealers.length; lcv++)
        {
            System.out.println(cardealers[lcv]);//print individual cars calling the toString method
            totalStock += cardealers[lcv].getPrice();//calling the getPrice for each car
            
            //++ is for increase by 1, -2012 is to make index 0 again
            //the index number is 0 to 5 so we need to make the index 0 again
            ++carsYear[cardealers[lcv].getYear()-2012];
          
        }//end for
        
        System.out.println("Sales Report Version 2: ");
        System.out.printf("\nTotal of car for sales is €%,.2f\n", totalStock);
        System.out.printf("Average Stock: €%,.2f\n", totalStock/cardealers.length);
        
         for(int lcv = 0; lcv < carsYear.length; lcv++)
         {
             if (carsYear[lcv] > 0)
             System.out.printf("\n%d %d\n", lcv + 2012, carsYear[lcv]);
         
         }//end for
        
    }//end method main
 }//end class CarDealerArrayTest
