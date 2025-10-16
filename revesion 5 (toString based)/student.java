public class student{
    String name;
    int rollnumber;
    String section;
    int age;

    student(String name, int rollnumber,String section, int age){
        this.name = name;
        this.rollnumber = rollnumber;
        this.section = section;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Student details : [ name: "+name+" rollnumber:"+rollnumber+" section:"+section+"  age:"+age+"]";
    }
    public static void main(String[] args) {
        student stu = new student("Satya ", 115, " A ", 19);
        System.out.println(stu);
    }
}