package dangminhphuc.dev.demo.javabased;

public class User {
    private final String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" + "name='" + name + '\'' +
                '}';
    }
}
