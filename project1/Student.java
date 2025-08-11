package project1;
public class Student {

    //All required fields

    private int id;
    private float score;
    private int age;
    private String name;

    //Getter Setter

    public int getId()
    {
        return id;

    }

    public void setId(int id)
    {
        this.id=id;
    }




    public String getName()
    {
        return name;

    }

    public void setName(String name)
    {
        this.name=name;
    }
    

    public float getScore()
    {
        return score;

    }

    public void setScore(float score)
    {
        this.score=score;
    }
    

    public int getAge()
    {
        return age;

    }

    public void setAge(int age)
    {
        this.age=age;
    }



    //constructor

    public Student(int id,String name,float score,int age)
    {
        this.id=id;
        this.name=name;
        this.score=score;
        this.age=age;

    }


    @Override
    public String toString()
    {
        return "ID: " + id + ", Name: " + name + ", Age: " + age + ", Score: " + score;
    }
    
    
}
