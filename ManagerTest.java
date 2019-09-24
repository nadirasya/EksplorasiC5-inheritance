package inheritance;

/**
 *
 * @author zaki
 */
public class ManagerTest {

    public static void main(String[] args) {
        //Construct a Manager object
        Manager boss = new Manager("Carl Cracker", 80000, 1987, 12, 15);
        /**
        * Nama: Nadira A
        * Membuat object manager bernama boss yang diisi dengan nama(name) Carl Cracker,
        * gaji(salary) 80000, hireDay yang terdiri atas tahun masuk (year) 1987, bulan masuk
        * (month) 12, dan tanggal masuk 15
        */
        boss.setBonus(5000);
        
        Employee[] staff = new Employee[3];
         /**
        * Nama: Nadira A
        * Membentuk array bernama stafff yang terdiri atas name, salary, hireDay(yaar,month,date)
        */
        //fill the staff array with Manager and Employee objects
        
        staff[0] = boss;
         /**
        * Nama: Nadira A
        * Mengisi array ke 0 dengan object yang telah di construct sebelumnnnya bernama boss
        */
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tommy Tester", 40000, 1990, 3, 15);
        /**
        * Nama: Nadira A
        * Mengisi array ke 1 dan 2 dari staff dengan object yang baru di construct
        */
        //print out information about all Employee objects
        for (Employee e : staff){
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary());
        }
        /**
        * Nama: Nadira A
        * Print semua informasi dari objects employee menggunakan "for each" loop
        */
    }
    
}
