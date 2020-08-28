package allpattern.action.template;

/**
 * @author Liu
 */
public abstract class CarModel {
    protected abstract void start(); //发动
    protected abstract void stop();  //停止
    protected abstract void alarm(); //鸣笛

    public final void run() {
        this.start();
        if(this.isAlarm()) {
            this.alarm();
        }
        this.stop();
    }
    /**
     *   鸣笛 的判断方法（钩子方法），默认返回true
     */
     boolean isAlarm() {
        return true;
    }
}

