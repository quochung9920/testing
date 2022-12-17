import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {
        // Ghi đọc file sử dụng ObjectInputStream và ObjectOutputStream
        // Ghi file
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data.txt"));
            oos.writeObject(new Student("Nguyen Van A", 20));
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Đọc file
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data.txt"));
            Student student = (Student) ois.readObject();
            System.out.println(student.getName());
            System.out.println(student.getAge());
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}