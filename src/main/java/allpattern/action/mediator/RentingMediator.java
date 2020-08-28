package allpattern.action.mediator;

/**
 * @author Liu
 */

import java.util.List;

/**
 * 租房中介
 */
class RentingMediator extends Mediator {

    private XiaoQuFangLandlord xiaoQuFangLandlord;
    private NongMinFangLandlord nongMinFangLandlord;

    public RentingMediator() {
        xiaoQuFangLandlord = new XiaoQuFangLandlord();
        nongMinFangLandlord = new NongMinFangLandlord();
    }

    @Override
    public void supplyHouse(List<String> types) {
        System.out.println("经纪人提供了如下房源");
        if (types.contains("XiaoQuFang")) {
            xiaoQuFangLandlord.supply();
        }
        if (types.contains("NongMinFang")) {
            nongMinFangLandlord.supply();
        }
    }
}
