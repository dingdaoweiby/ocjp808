//QB42
//Ans: A. Compilation failed at both line n1 and n2
//n1: no default constructor, thus no calling of this(), have to add it as public Person(){}
//n2: this is actully create new object, needs to be as new Person(name). still use constructor.
/*public class Person {
    String name;
    int age = 25;

    public Person(String name) {
        this();
        setName(name);
    }

    public Person(String name, int age) {
        Person(name);
        setAge(age);
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

    public String show() {
        return name + " " + age;
    }

    public static void main(String[] args) {
        Person p1 = new Person("Jess");
        Person p2 = new Person("Walter", 51);
        p1.show();
        p2.show();
    }
}*/
