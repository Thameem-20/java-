public class car{
    String color;
    String model;

    public car(String color, String model){
        this.color = color;
        this.model = model;
    }
    public void displayinfo(){
        System.out.println("color="+color+" model="+model);
    }

    public static void main(String[] args) {
        car Mycar = new car("black", "suzuki");
        Mycar.displayinfo();
    }
}