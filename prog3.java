class student{
    String name;
    String usn;
    String sec;

    public void display(){
        System.out.println("student name = "+this.name);
        System.out.println("student usn = "+this.usn);
        System.out.println("student sec = "+this.sec);
    }
}

public class prog3 {
    public static void main(String[] args) {
        
    student s1 = new student();
    s1.name= "thameem"; 
    s1.usn="4pa21cs013";
    s1.sec="A";
    s1.display();

    student s2 = new student();
    s2.name= "mausooq";
    s2.usn="4pa21cs003";
    s2.sec="A";
    s2.display();

}
}
