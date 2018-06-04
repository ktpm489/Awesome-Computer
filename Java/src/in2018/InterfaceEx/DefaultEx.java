package in2018.InterfaceEx;

interface RemoteControl {
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    void turnOn();
    void turnOff();
    void setVolume(int volume);

    default void setMute(boolean mute) {
        if(mute) {
            System.out.println("무음 처리");
        }
        else
            System.out.println("무음 해제");
    }

    static void changeBattery(RemoteControlImpl remoteControl) {
        System.out.println("건전지 교환");
        remoteControl.setBattery(10);
    }
}

class RemoteControlImpl implements RemoteControl {
    private boolean isOn;
    private int volume;
    private int battery;

    RemoteControlImpl() {
        battery = 100;
    }

    @Override
    public void turnOn() {
        if(battery >= 0) {
            isOn = true;
            battery -= 1;
            System.out.println("Volume - " + volume + " Battery - " + battery);
        }
    }

    @Override
    public void turnOff() {
        if(battery >= 0) {
            isOn = false;
            battery -= 1;
            System.out.println("Battery - " + battery);
        }
    }

    @Override
    public void setVolume(int volume) {
        if(battery >= 0) {
            battery -= 1;
            if (isOn) {
                if (volume > MAX_VOLUME)
                    this.volume = 10;
                else if (volume < MIN_VOLUME)
                    this.volume = 0;
                else
                    this.volume = volume;
            }
        }
    }

    void setBattery(int battery) {
        this.battery = battery;
    }
}

public class DefaultEx {
    public static void main(String[] args) {
        RemoteControlImpl remoteControl = new RemoteControlImpl();

        remoteControl.turnOn();
        remoteControl.setVolume(10);
        remoteControl.setMute(true);
        remoteControl.setMute(false);
        remoteControl.turnOff();

        RemoteControl.changeBattery(remoteControl);
    }
}
