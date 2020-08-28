package allpattern.action.state;

/**
 * 状态模式测试类
 * @author Liu
 */
public class StateClient {
    public static void main(String[] args) {
        VoteManager vm = new VoteManager();
        for(int i=0;i<9;i++){
            vm.vote("u1","A");
        }
    }
}
