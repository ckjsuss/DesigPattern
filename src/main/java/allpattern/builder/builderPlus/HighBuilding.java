package allpattern.builder.builderPlus;

/**
 * 高楼产品建造者
 * @author Liu
 */
public class HighBuilding extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("HighBuilding buildBasic ");
    }

    @Override
    public void buildWall() {
        System.out.println("HighBuilding buildWall");
    }

    @Override
    public void buildEnd() {
        System.out.println("HighBuilding buildEnd");
    }
}
