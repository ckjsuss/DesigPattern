package single;

/**
 *交通工具类
 * @author Liu
 */
public class Vehicle {
    public void run (String vehicle){
        System.out.println(vehicle+" 在公路上跑...  ");
    }
}

class Test{
    public static void main(String[] args){
        Vehicle vehicle = new Vehicle();
        vehicle.run("摩托车");
        vehicle.run("飞机");
        vehicle.run("轮船");
    }
}
