import com.packagefile.employee.domain.ExpenseClaim;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ExpenseClaim expenseClaim=new ExpenseClaim(1,2,"1-01-2000",24.99);
        System.out.println(expenseClaim.getId());

    }

}