import java.util.Optional;

public class OptionalExample {

    public Optional<String> findUserNameById(int userId) {
        if (userId == 0) {
            return Optional.empty();
        } else {
            return Optional.ofNullable("Chetan");
        }
    }

    public static void main(String[] args) {
        OptionalExample userDatabase = new OptionalExample();

//        String userNameWithoutOptional = userDatabase.findUserNameById(0);
//        System.out.println("Without Optional: " + userNameWithoutOptional);

        // With Optional
        Optional<String> userName = userDatabase.findUserNameById(0);
        userName.ifPresentOrElse(
                uname -> System.out.println(uname),
                () -> System.out.println("UserName not found")
        );

        userName.map(u -> u.toUpperCase()).ifPresent(System.out::println);
    }
}
