
package exerciciofixacao2secao14;

import entities.TaxPayer;
import entities.Company;
import entities.Individual;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Program {


    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        List<TaxPayer> list = new ArrayList<>();
        
        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();
        
        for(int i = 1;i <= n; i++){
            System.out.print("Tax payer #" + n + "data");
            System.out.print("Individual or company (i/c)");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.next();
            System.out.print("Anual income: ");
            double income = sc.nextDouble();
        if(ch == 'i'){
            System.out.print("Health expenditures: ");
            double healthExpenditures = sc.nextDouble();
            list.add(new Individual(name, income, healthExpenditures));
        }
        else{
            System.out.println("Number of employees: ");
            int numberOfEmployees = sc.nextInt();
            list.add(new Company(numberOfEmployees, name, income));
        }
        
        }
        double sum = 0.0;
        System.out.println("");
        System.out.println("TAXES PAID: ");
        for (TaxPayer tp:list){
            double tax = tp.tax();
            System.out.println(tp.getName() + ": $ " + String.format("%.2f", tax));
            sum +=tax;
        }
        System.out.println();
        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));
        
        
    }
    
}
