import java.io.Serializable;
import java.util.Objects;
import java.util.Scanner;

public class Cat extends Animal implements Comparable {


    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public Cat() {
    }

    public Cat(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age &&
                Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    @Deprecated
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Object o) {
        if (!(o instanceof Cat)) {
            return 0;
        }

        Cat cat = (Cat) o;
        if (cat.getAge() > this.age) {
            return -1;
        }
        ;
        if (cat.getAge() < this.age) {
            return 1;
        }

        return 0;
    }

    @Override
    public String toString() {
        return "Cat{ age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    class InnerStaticClassExample {

        public void useOuterClassAttributes() {
            System.out.println("" + name);
        }


    }

}
