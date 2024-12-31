public record EmployeeRecord(String name, int age, int salary) {

    public EmployeeRecord {

        if(age<20){
            throw new IllegalArgumentException("Age cannot be less than 20");
        }

    }

}
