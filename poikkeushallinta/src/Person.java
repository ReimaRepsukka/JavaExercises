import javax.print.attribute.standard.MediaSize.NA;

public class Person {
    private String name;
    private int age;

    public void setAge(int age) throws InvalidAgeException{
        if(age<0){
            throw new InvalidAgeException();
        }
        this.age = age;
    }

    public void setName(String name) throws NameNullpointerException{
        if(name == null){
            throw new NameNullpointerException();
        }
        this.name = name;
    }
}
