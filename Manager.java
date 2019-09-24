/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author asus
 */
public class Manager extends Employee {
    private double bonus;
    
    /**
     * @param name the employee's name
     * @param salary the salaty
     * @param year the hire year
     * @param month the hire month
     * @param day the hire day
     */
    
    public Manager(String name, double salary, int year, int month, int day){
        super(name, salary, year, month, day);
        /**
        * Nama: Nadira A
        * Menggunakan keyword super agar dapat merepresentasikan referensi yang digunakan oleh Superclass 
        * yang terdiri atas name, salary, year, month, day
        * 
        */
        bonus = 0;
    }
    /**
    * Nama: Nadira A
    * Managerterdiri atas name untuk menampung nama bertipe data String, salary untuk menampung gaji
    * bertipe data double, hireday yang terdiri atas year, month, day yang bertipe data integer dan 
    * menggunakan localDate dari package java.time untuk menampung tanggal saat pertama kerja
    */
    
    @Override
    public double getSalary(){         
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }
    /**
    * Nama: Nadira A
    * Get diatas digunakan untuk mengambil nilai dari Salary. Dengan menggunakan Super untuk menunjuk referensi 
    * dari superclass. Jumlah yang di return adalah jumlah dari baseSalary dengan bonus
    */
    
    public void setBonus(double b){
        bonus = b;
    }
    /**
    * Nama: Nadira A
    * Set digunakan untuk mendapatkan nilai bonus yang didapat dari nilai b. Menngunakan set agar proses
    * tidak langsung terekspos ke object lain.
    */
}
