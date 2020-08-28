package allpattern.action.template;

/**
 * @author Liu
 */
public class Benz extends CarModel {
    /**
     * 判断标记
     */
    private boolean alarmFlag = false;

    @Override
    public void start() {
        System.out.println("Benz发动……");
    }

    @Override
    public void stop() {
        System.out.println("Benz停止……");
    }

    @Override
    public void alarm() {
        System.out.println("Benz鸣笛……");
    }


    @Override
    protected boolean isAlarm() {
        return this.alarmFlag;
    }

    public void setAlarm(boolean isAlarm) {
        this.alarmFlag = isAlarm;
    }

}
