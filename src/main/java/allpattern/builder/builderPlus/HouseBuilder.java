package allpattern.builder.builderPlus;

/**
 * 抽象建造者
 * @author Liu
 */
public abstract class HouseBuilder {
    House house = new House();
    public abstract void buildBasic();
    public abstract void buildWall();
    public abstract void buildEnd();
    public House buildHouse(){
        return house;
    }
}
