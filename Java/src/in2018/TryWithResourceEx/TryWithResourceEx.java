package in2018.TryWithResourceEx;

class FileInputStream implements AutoCloseable {
    private String file;

    FileInputStream(String file) {
        this.file = file;
    }

    void read() {
        System.out.println(file + "을 읽습니다.");
    }

    @Override
    public void close() {
        System.out.println(file + "을 닫습니다.");
    }
}

public class TryWithResourceEx {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("File.txt")) {
            fis.read();
            throw new Exception();
        } catch (Exception e) {
            System.out.println("예외처리 코드 실행");
        }
    }
}

class HelloException extends Exception {
}