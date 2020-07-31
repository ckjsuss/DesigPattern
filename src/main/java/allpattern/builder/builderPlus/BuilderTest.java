package allpattern.builder.builderPlus;

/**
 * 建造者模式测试
 * @author Liu
 */
public class BuilderTest {
    public static void main(String[] args){
        CommonBuilding commonBuilding = new CommonBuilding();
        HouseDirector houseDirector = new HouseDirector(commonBuilding);
        House house1 = houseDirector.constructHouse();
        System.out.println(house1);

        HighBuilding highBuilding = new HighBuilding();
        houseDirector.setHouseBuilder(highBuilding);
        House house2 = houseDirector.constructHouse();
        System.out.println(house2);

        StringBuilder stringBuilder = new StringBuilder("Hello world");
        System.out.println(stringBuilder);
    }
}
