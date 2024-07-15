class pen{
    String color;
    String type;
    public void penfunc(){
        System.out.println("for writing");
    }
    public void penclr(){
        System.out.println(this.color);
    }
    public void pentyp(){
        System.out.println(this.type);
    }
}

public class prog2 {
    public static void main(String[] args) {
        pen pen1 = new pen();
        pen1.color= "blue";
        pen1.type="ballpen";
        pen1.penfunc();
        pen1.penclr();
        pen1.pentyp();

        pen pen2 = new pen();
        pen2.color ="black";
        pen2.type = "gelpen";

        pen2.penfunc();
        pen2.penclr();
        pen2.pentyp();

    }
    
}
