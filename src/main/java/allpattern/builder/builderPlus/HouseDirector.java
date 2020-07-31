package allpattern.builder.builderPlus;

import allpattern.builder.CommonHouse;

/**
 * 指挥者
 * @author Liu
 */
public class HouseDirector {
    HouseBuilder houseBuilder = null;
    public HouseDirector(HouseBuilder houseBuilder){
        this.houseBuilder = houseBuilder;
    }

    public HouseDirector(CommonHouse commonHouse) {
    }

    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House constructHouse(){
        houseBuilder.buildBasic();
        houseBuilder.buildWall();
        houseBuilder.buildEnd();
        return houseBuilder.buildHouse();
    }
}
