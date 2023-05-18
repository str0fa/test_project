public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void greeting() {
        System.out.printf("hello, my name is %s, im %d years old", name, age);
    }

    public int birthAge(){
        return 2023 - age;
    }
}
