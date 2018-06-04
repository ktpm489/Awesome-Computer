package in2018.AnonymousClass;

class Button {
    OnClickListener listener;

    void setOnClickListener(OnClickListener listener) {
        this.listener = listener;
    }

    void touch() {
        listener.onClick();
    }

    interface OnClickListener {
        void onClick();
    }
}

class Window {
    Button btn1 = new Button();
    Button btn2 = new Button();

    Button.OnClickListener listener = () -> System.out.println("전화를 겁니다");

    Window() {
        btn1.setOnClickListener(() -> System.out.println("메세지를 보냅니다."));
    }
}

public class ButtonEx {
    public static void main(String[] args) {
        Window w = new Window();
        w.btn1.touch();
        w.btn2.touch();
    }
}
