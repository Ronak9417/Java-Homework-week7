package homeworkweek7;

import java.util.Scanner;

/**
 * Write a java program input sales id, seller's name, sales amount, and salary basic and
 * then fined this sales
 * Commission
 *  Sales amount >= 50,000 35%
 *  Sales amount >= 30,000 20%
 * >= 20,000 10%
 * >= 10,000 5%
 * < 10,000 2%
 */
public class O7FinedThisSales {

    //Declare main method

    public static void main(String[] args)
    {
        //Declare a scanner
        Scanner scan = new Scanner(System.in);
        //Print statement
        System.out.println("Enter Sales ID : ");
        int salesId = scan.nextInt();
        System.out.println("Enter Seller Name : ");
        String sellerName = scan.next();
        System.out.println("Enter Sales Amount : ");
        float salesAmount = scan.nextFloat();
        System.out.println("Enter Basic Salary : ");
        float basicSalary = scan.nextFloat();
        O7FinedThisSales obj = new O7FinedThisSales();
        obj.commission(salesId,sellerName,salesAmount,basicSalary);//Calling Instance method

        //Close scanner
        scan.close();
    }

    // Declare Instance method
    public void commission(int salesId, String sellerName, float salesAmount, float basicSalary)
    {
        double commission;
        if (salesAmount>=50000)
        {
            commission = (basicSalary*35)/100;
            System.out.println("Commission = " +commission);
        }
        else if (salesAmount>=30000 && salesAmount<50000)
        {
            commission = (basicSalary*20)/100;
            System.out.println("Commission = " +commission);
        }
        else if (salesAmount>=20000 && salesAmount<30000)
        {
            commission = (basicSalary*10)/100;
            System.out.println("Commission = " +commission);
        }
        else if (salesAmount>=10000 && salesAmount<20000)
        {
            commission = (basicSalary*5)/100;
            System.out.println("Commission = " +commission);
        }
        else
        {
            commission = (basicSalary*2)/100;
            System.out.println("Commission = " +commission);
        }
    }



}
