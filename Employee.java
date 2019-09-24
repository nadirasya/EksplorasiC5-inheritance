/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;
import java.time.*;
/**
 * Nama: Nadira A
 * java.time mr\erupakan package agar kita dapat menggunakan API date dan time.
 * package ini memiliki banyak class dari date and time seperti LocalDate, LocalTime, dsb.
 */
/**
 *
 * @author asus
 */
public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;
 /**
 * Nama: Nadira A
 * LocalDate merupakan class yang terdapat dalam package java.time yang merepresentasikan 
 * tanggal
 */
    
    public Employee(String name, double salary, int year, int month, int day){
        this.name = name;
        this.salary = salary;
        hireDay = LocalDate.of(year, month, day);
    }
 /**
 * Nama: Nadira A
 * Employee terdiri atas name untuk menampung nama bertipe data String, salary untuk menampung gaji
 * bertipe data double, hireday yang terdiri atas year, month, day yang bertipe data integer dan 
 * menggunakan localDate dari package java.time untuk menampung tanggal saat pertama kerja
 */
    
    public String getName(){
        return name;
    }
     /**
    * Nama: Nadira A
    * Get diatas digunakan untuk mengambil nilai dari name
    */
    
    public double getSalary(){
        return salary;
    }
    /**
    * Nama: Nadira A
    * Get diatas digunakan untuk mengambil nilai dari salary
    */
    public LocalDate getHireDay(){
        return hireDay;
    }
    /**
    * Nama: Nadira A
    * Get diatas digunakan untuk mengambil nilai dari hireDay
    */
    
    public void raiseSalary(double byPercent){
        double raise = salary * byPercent/100;
        salary += raise;
    }
    /**
    * Nama: Nadira A
    * raiseSalary digunakan untuk menaikkan gaji dari employee dengan cara  mendapatkan jumlah
    * kenaikkan (dalam program ini bernama raise dan bertipe data double) yang didapat dengan mengkalikan
    * gaji (dalam program ini bernama salary) dengan persentase yang diinginkan (dalam program ini variabelnya
    * bernama byPercent) kemudian dibagi 100
    * Gaji (salary) kemudian ditambah dengan jumlah kenaikkan (raise) menghasilkan gaji baru yang
    * telah ditambah
    * 
    */
}
