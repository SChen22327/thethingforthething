public class Person {
    private int age;
    private String name;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setAge(int newAge) {
        age = newAge;
    }
    public void setName(String newName) {
        name = newName;
    }
    public String getName(){
        return name;
    }

    public void printName(){
        System.out.println("Hello " + getName());
    }
}
