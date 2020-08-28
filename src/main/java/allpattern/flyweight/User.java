package allpattern.flyweight;

/**
 * 使用者
 * @author Liu
 */
public class User {
    private String Name;

    public User(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
