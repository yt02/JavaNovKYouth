public class Encapsulation{
    private String name;
    private int age;

    public String getName(){
        return name;
    }

    public int getAge()
    {
        return age;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }
    public static void main(String[] args) {
        Encapsulation person = new Encapsulation();
        person.setName("yeethong");
        person.setAge(22);

        System.out.println("The name of the person is : " + person.getName() +"\nThe person age is: " + person.getAge());
    }
}