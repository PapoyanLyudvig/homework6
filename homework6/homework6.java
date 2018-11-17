
public class HW6 {
    public static void main(String []args){
        Car car = new Car(5, 2);
        Ship ship = new Ship(20, 10);
        Bus bus = new Bus(12, 4);
        System.out.println(bus.getLenght());
        System.out.println(fact(5));
        System.out.println("Hello");
     }
    static int fact(int num){    
    	if (num == 0){
    		return 1;
        }
    	else{
    		return(num * fact(num-1));    
        }
    } 
}