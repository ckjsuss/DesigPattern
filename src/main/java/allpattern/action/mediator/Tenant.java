package allpattern.action.mediator;

/**
 * @author Liu
 */

import java.util.List;
/**
 * 租客
 **/
public class Tenant {
    private String name;
    private List<String> wantTypes;

    private RentingMediator rentingMediator = new RentingMediator();

    public Tenant(String name, List<String> wantTypes) {
        this.name = name;
        this.wantTypes = wantTypes;
    }

    public void lookAtHouse() {
        rentingMediator.supplyHouse(wantTypes);
    }

}
