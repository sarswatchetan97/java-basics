import java.util.*;

public record ImmutableClassDemo(String name, int age, Date birthDate) {
    public ImmutableClassDemo(String name, int age, Date birthDate) {
        this.name = name;
        this.age = age;
        this.birthDate = new Date(birthDate.getTime());
    }

    @Override
    public Date birthDate() {
        return new Date(birthDate.getTime());
    }
}
