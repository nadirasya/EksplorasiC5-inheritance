package inheritance;

/**
 *
 * @author zaki
 */
public class ManagerTest {

    public static void main(String[] args) {
        //Construct a Manager object
        Manager boss = new Manager("Carl Cracker", 80000, 1987, 12, 15);
        boss.setBonus(5000);
        
        Employee[] staff = new Employee[3];
        
        //fill the staff array with Manager and Employee objects
        
        staff[0] = boss;
        /** Eksperimen No.4 Zaki
         * Topik : Bisakah elemen array yang bertipe superclass diassign object yang bertipe subclass dari superclass?
         * Catatan:
         * pada potongan kode diatas, dapat dilihat bahwa staff yang berupa array of Employee dapat diassign
         * dengan object boss yang bertipe Manager(subclass dari Employee)
         * 
         */
        
//        staff[0].setBonus(2300);
        /** Eksperimen No.5 Zaki
         * Topik : Bisakah method dari subclass dipanggil melalui elemen array bertipe superclass yang diisi dengan object bertipe subclass?
         * Potongan kode:
         * staff[0].setBonus(2300);
         * 
         * Output:
         * error: cannot find symbol
         * staff[0].setBonus(2300);
         * symbol:   method setBonus(int)
         * location: class Employee
         * 
         * Catatan:
         * Pada potongan kode diatas, dapat dilihat bahwa method dari object subclass(Manager) yang dimasukkan
         * ke dalam array bertipe superclasss(Employee) tidak dapat dipanggil lagi.Dapat disimpulkan bahwa
         * ketika dilakukan assignment pada array bertipe Employee, object boss di cast menjadi Employee terlebih dahulu, sehingga
         * method dari class Manager tidak bisa diakses melalui elemen array tersebut.
         * 
         */
        
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tommy Tester", 40000, 1990, 3, 15);
        
        
//        Manager[] managerArray = new Manager[5];
//        managerArray[0] = new Employee("Zaki Programmer", 100000, 2019, 9, 22);
        /** Eksperimen No. 6 Zaki
         * Topik : Apakah elemen array yang bertipe subclass di assign object yang bertipe superclass?
         * Potongan kode:
         * Manager[] managerArray = new Manager[5];
         * managerArray[0] = new Employee("Zaki Programmer", 100000, 2019, 9, 22);
         * 
         * Output:
         * error: incompatible types: Employee cannot be converted to Manager
         * 
         * Catatan:
         * Ternyata array bertipe subclass tidak bisa diassign dengan object yang berupa 
         * superclassnya. Disimpulkan bahwa konversi class dari object yang diassign ke dalam array 
         * hanya bisa dilakukan dari subclass ke superclass(arahnya ke atas hierarchy)
         */
        
        //print out information about all Employee objects
        for (Employee e : staff){
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary());
        }
        
        Executive executive = new Executive("Goyol Executive", 150000, 1990, 2, 2);
        executive.printHireDay();
    }
    
}
