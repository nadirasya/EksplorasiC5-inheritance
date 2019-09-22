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


public final class Executive extends Manager {
    public Executive(String name, double salary, int year, int month, int day){
        super(name, salary, year, month, day);
    }
    
//    @Override
//    public String getName(){
//        return "Executive Name : " + super.super.getName();
//    }
    /** Eksperimen No. 7 Zaki
     * Topik : Bisakah suatu subclass memanggil superclass dari superclassnya menggunakan syntax super.super?
     * Potongan Kode:
     * public String getName(){
     *      return "Executive Name : " + super.super.getName();
     * }
     * 
     * Output:
     * error: <identifier> expected
     * 
     * Catatan:
     * Tidak bisa memanggil method superclass dari superclass menggunakan super.super.getName(). 
     * 
     * Potongan kode ini berada dalam class Executive yang berupa subclass dari Manager yang merupakan subclass dari Employee
     * 
     * Lalu bagaimana cara memanggil method superclass dari superclass subclass? #Penasaran
     * 
     */
    
    public void printHireDay(){
        System.out.println(getHireDay());
    }
}

/*class CEO extends Executive{

}*/

/**
 * Eksperimen No. 1 Zaki
 * Topik : Final class
 * Catatan : 
 * jika suatu class memiliki modifier final, maka class tersebut 
 * tidak bisa dijadikan superclass dari suatu subclass / tidak bisa di extend lagi 
 * 
 * Perhatikan kode di atas, saya mendeklarasikan class Executive dengan modifier final
 * kemudian mencoba untuk membuat class baru CEO yang merupakan subclass dari Executive.
 * Namun keluar pesan error karena Executive tidak bisa di extend lagi
 */