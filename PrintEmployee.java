public class PrintEmployee {

    public static void main(String[] args) {

        EmployeeRecord r = new EmployeeRecord("Abhi",28,50000);

        System.out.println(r);
        System.out.println(r.name()+" "+r.age()+" "+r.salary());


    }

}
