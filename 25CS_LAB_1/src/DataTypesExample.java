import javax.naming.Name;

class DataTypesExample {
    public static void main(String[] args) {

     int initial_salary = 50000;
        System.out.println("initial_salary = " + initial_salary);

        for  (int year = 1; year <=5 ; year++) {
            initial_salary = initial_salary + 2000;

            System.out.println( "incremented_salary after year " + year + " = " + initial_salary);

        }

    }

}
