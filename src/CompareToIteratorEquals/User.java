package CompareToIteratorEquals;

/**
 * Created by Sermilion on 14/10/2016.
 */
public class User implements Comparable<User> {

    private String name;
    private int age;


    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public User() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        User user = (User) obj;
        if (this.getAge() == user.getAge()
                && this.getName().equals(user.getName())) {
            return true;
        }
        return false;
    }

    @Override
    public int compareTo(User o) {
        if (this.getAge() > o.getAge()) {
            return 1;
        } else if (this.getAge() == o.getAge()) {
            return 0;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return ("Age: " + age) + "\n" +
                "Name: " + name;

    }
}
