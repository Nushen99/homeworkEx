
public class Main {
	
	public static int fact(int num){
        if(num == 1){
            return 1;
        } else {
        return num * fact(num - 1);
        }
	}
	
	public static void main(String []args){
        Country country = new Country("Armenia", 11.54, "Yerevan");
        System.out.println(country.getCapital());
        
        Student student = new Student("Alex", 3.5, 3.9);
        System.out.println(student.cumulative());
        
        Vehicle vehicle = new Vehicle(34.5, 32.2, 41.2);
        System.out.println(vehicle.getWeight());
       
        System.out.println(fact(5));
    }

}
