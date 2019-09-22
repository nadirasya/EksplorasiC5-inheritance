/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;
import java.time.*;
/**
 *
 * @author asus
 */
public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;
    
    public Employee(String name, double salary, int year, int month, int day){
        this.name = name;
        this.salary = salary;
        hireDay = LocalDate.of(year, month, day);
    }
    
    public String getName(){
        return name;
    }
    
    /**
    * Eksperimen No. 2 Zaki
    * Topik : Final method
    * Potongan Kode:
    *   public class Employee {
            public final String getName(){
                return name;
            }
        }

        public class Manager extends Employee{
            public String getName(){
                return "Name" + super.getName();
            }
        }
    * 
    * Catatan : 
    * jika suatu method memiliki modifier final, maka method tersebut 
    * tidak bisa di override lagi di subclass manapun 
    * 
    * method getName() pada class Employee memiliki modifier final, dicoba untuk di 
    * override di subclass dari Employee, yaitu Manager. Namun hal tersebut tidak 
    * bisa dilakukan karena method final tidak dapat dioverride di subclassnya.
    */
    
    
    /** Eksperimen No.3 Zaki
     * Topik : Bagaimana jika override dilakukan di class yang sama?
     * Potongan Kode:
     * public String getName(){
            return "Employee Name: " + name;
        }
     * Output:
     * error: method getName() is already defined in class Employee
     * 
     * Catatan:
     * method dengan nama yang sama tidak bisa dioverride di class yang sama.
     * 
     */
    public double getSalary(){
        return salary;
    }
    
    public LocalDate getHireDay(){
        return hireDay;
    }
    
    public void raiseSalary(double byPercent){
        double raise = salary * byPercent/100;
        salary += raise;
    }
}
