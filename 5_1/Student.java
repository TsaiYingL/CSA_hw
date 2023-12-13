public class Student
{
    private String name;
    private int osis;
    private int attendance;

    public Student(String name, int osis)
    {
        this.name = name;
        this.osis = osis;
    }

    public void studentName(String name)
    {
        this.name = name;
    }

    public void osisNum(int osis)
    {
        this.osis = osis;
    }

    public String getStudent()
    {
        return name;
    }

    public int getOsis()
    {
        return osis;
    }

    public int getAttendance()
    {
        return attendance;
    }

    public void present()
    {
        System.out.println(name + " is in class.");
        attendance = attendance();
    }

    private int attendance()
    {
        return attendance+1;
    }
}