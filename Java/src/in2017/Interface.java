package in2017;

interface MobilePhone {
    void sendCall();

    boolean receiveCall();

    boolean sendSMS();

    boolean receiveSMS();
}

interface MP3 {
    void play();

    void stop();
}

class PDA {
    int calculate(int x, int y) {
        return x + y;
    }
}

public class Interface extends PDA implements MobilePhone, MP3 {
    @Override
    public void sendCall() {
        System.out.println("전화 걸기");
    }

    @Override
    public boolean receiveCall() {
        System.out.println("전화 받기");
        return true;
    }

    @Override
    public boolean sendSMS() {
        System.out.println("문자 보내기");
        return true;
    }

    @Override
    public boolean receiveSMS() {
        System.out.println("문자 받기");
        return true;
    }

    @Override
    public void play() {
        System.out.println("음악 재생");
    }

    @Override
    public void stop() {
        System.out.println("재생 중지");
    }

    private void scheduler() {
        System.out.println("일정 관리");
    }

    private void applicationManager() {
        System.out.println("프로그램 설치/삭제");
    }

    public static void main(String[] args) {
        Interface smartPhone = new Interface();

        smartPhone.sendCall();
        smartPhone.play();
        System.out.println(smartPhone.calculate(1, 3));
        System.out.println(smartPhone.calculate(1, 2));
        smartPhone.scheduler();
        smartPhone.applicationManager();
    }
}
