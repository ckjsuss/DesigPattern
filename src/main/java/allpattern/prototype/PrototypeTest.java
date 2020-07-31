package allpattern.prototype;

/**
 * 浅拷贝
 * @author Liu
 */
public class PrototypeTest {
    public static void main(String[] args){
        Sheep sheep = new Sheep("多利1号","Black");
        sheep.friend = new Sheep("多利2号","White");
        try {
            // 浅拷贝
            Sheep clone01 = (Sheep)sheep.clone();
            Sheep clone02 = (Sheep)sheep.clone();
            System.out.println(clone01.hashCode());
            System.out.println(clone02.hashCode());
            System.out.println(clone01.friend.hashCode());
            System.out.println(clone02.friend.hashCode());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


    }
}
