public class App {
    public static void main() {
        Car car1= new Car("volvo", "a" , "d" ,2028  );

        car1.faster(50);
        IO.println("speed is: "+ car1.getspeed());

        car1.slower(20);
        IO.println("after a while speed is: " + car1.getspeed());

        IO.println(car1);

        try{
            car1.faster(-10);
        }
        catch(IllegalArgumentException d){
            IO.println("nah: "+d.getMessage());
        }

        // try{
        //     Car car2= new Car("","ye","1010",2020);
        // }
        // catch (IllegalArgumentException a){
        //     IO.prisntln("Fel när bil2 skapades: " + a.getMessage());
        // }
    }
}
