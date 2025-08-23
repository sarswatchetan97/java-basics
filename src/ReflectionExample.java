import java.lang.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Company {
    private String name;

    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private void displayName() {
        System.out.println("Private Method Invoked to display Company Name: " + name);
    }
}

public class ReflectionExample {
    public static void main(String[] args) throws Exception {
        Company company = new Company("Insta");
        System.out.println(company.getName());

        Field nameField = Company.class.getDeclaredField("name");
        nameField.setAccessible(true);
        nameField.set(company,"Instagram");
        System.out.println(company.getName());

        Method method = Company.class.getDeclaredMethod("displayName");
        method.setAccessible(true);
        method.invoke(company);
    }
}
