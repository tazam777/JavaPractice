package project1;
import java.util.*;


public class StudentManager {

    private ArrayList<Student> studentList;


    public StudentManager()
    {

    studentList=new ArrayList<>();

    }


    public void addStudent(int id,int age,String name,float score)
    {
        Student s =new Student(id, name, score, age);
        studentList.add(s);
        System.out.println("Added Student succesfully");
    }

    public void viewAllStudent()
    {
        for(int i=0;i<studentList.size();i++)
        {
            Student s=studentList.get(i);
            System.out.println(s);

            if (studentList.isEmpty()) {
                System.out.println("No students found.");
                return;
            }

        }
    }

        public void searchStudent(int searchID)
        {

            
            
            boolean flag=false;


            for(int i=0;i<studentList.size();i++)
            {
                Student s=studentList.get(i);
                if(s.getId()==searchID)
                {
                    System.out.println("Student found the record is " + s);
                    flag=true;
                    break;

                }
            }

                if(flag==false){
                    System.out.println("Student not found");
                }
            

        }




        public void deleteStudent(int searchID)
        {

        
            boolean flag=false;


            for(int i=0;i<studentList.size();i++)
            {
                Student s=studentList.get(i);
                if(s.getId()==searchID)
                {
                    System.out.println("Student found the record is " + s);
                    System.out.println("Deleting record ");
                    studentList.remove(i);
                    System.out.println("Record deleted ");

                    flag=true;
                    break;

                }
            }

                if(flag==false){
                    System.out.println("Student not found");
                }
            

        }







        public void updateStudent(int searchID, Scanner sc)
        {

            
            
            boolean flag=false;


            for(int i=0;i<studentList.size();i++)
            {
                Student s=studentList.get(i);
                if(s.getId()==searchID)
                {
                    System.out.println("Student found the record is " + s);
                    flag=true;
                    System.out.println("Enter 1 to update name \nEnter 2 to update score \nEnter 3 to update age");
            int choice = sc.nextInt();
            sc.nextLine(); // consume leftover newline

                    switch (choice) {
                        case 1:
                            System.out.print("Enter new name");
                            String n1=sc.nextLine();
                            s.setName(n1);
                            System.out.println("Updated record is " + s);
                            break;
                    
                            case 2:
                            System.out.print("Enter new score: ");
                            float newScore = sc.nextFloat();
                            s.setScore(newScore);
                            break;
        
                        case 3:
                            System.out.print("Enter new age: ");
                            int newAge = sc.nextInt();
                            s.setAge(newAge);
                            break;
        
                        default:
                            System.out.println("Invalid choice");
                    }

                    System.out.println("Updated record: " + s);

                    break;

                }
            }

                if(flag==false){
                    System.out.println("Student not found");
                }
            

        }



        public void highScore()
        {


            if(studentList.isEmpty())
            {
                System.out.println("No Student found");
                return;

            }
            Student stop=studentList.get(0);

           
            for(int i=1;i<studentList.size();i++)
            {

                

                // top score temp variable

                
                Student s=studentList.get(i);

               

                if(stop.getScore()<s.getScore())
                {
                    stop=s;


                
                }
            



                System.out.println("Highest Score is " + stop.getScore());

            }
        }


    
    
}
