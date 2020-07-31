package allpattern.builder.builderPlus;

/**
 * 普通房子建造者
 * @author Liu
 */
public class CommonBuilding extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("CommonBuilding buildBasic");
    }

    @Override
    public void buildWall() {
        System.out.println("CommonBuilding buildWall");
    }

    @Override
    public void buildEnd() {
        System.out.println("CommonBuilding buildEnd");
    }
}
