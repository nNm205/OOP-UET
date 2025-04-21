import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Week8Task2 {
    /**
     * nullPointerEx():
     * void.
     */

    public void nullPointerEx() throws NullPointerException {
        String s = null;
        System.out.println(s);
        System.out.println(s.length());
    }

    /**
     * nullPointerExTest():
     * return.
     */

    public String nullPointerExTest() {
        try {
            nullPointerEx();
            return "Không có lỗi";
        } catch (NullPointerException e) {
            return "Lỗi Null Pointer";
        }
    }

    /**
     * arrayIndexOutOfBoundsEx():
     * void.
     */

    public void arrayIndexOutOfBoundsEx() throws ArrayIndexOutOfBoundsException {
        int[] a = new int[10];
        a[11] = 5;
        System.out.println(a[11]);
    }

    /**
     * arrayIndexOutOfBoundsExTest():
     * return.
     */

    public String arrayIndexOutOfBoundsExTest() {
        try {
            arrayIndexOutOfBoundsEx();
            return "Không có lỗi";
        } catch (ArrayIndexOutOfBoundsException e) {
            return "Lỗi Array Index Out of Bounds";
        }
    }

    /**
     * arithmeticEx():
     * void.
     */

    public void arithmeticEx() throws ArithmeticException {
        int result = 10 / 0;
        System.out.println(result);
    }

    /**
     * arithmeticExTest():
     * return.
     */

    public String arithmeticExTest() {
        try {
            arithmeticEx();
            return "Không có lỗi";
        } catch (ArithmeticException e) {
            return "Lỗi Arithmetic";
        }
    }

    /**
     * fileNotFoundEx():
     * void.
     */

    public void fileNotFoundEx() throws FileNotFoundException {
        File file = new File("ttt.txt");
        Scanner scanner = new Scanner(file);
    }

    /**
     * fileNotFoundExTest():
     * return.
     */

    public String fileNotFoundExTest() {
        try {
            fileNotFoundEx();
            return "Không có lỗi";
        } catch (FileNotFoundException e) {
            return "Lỗi File Not Found";
        }
    }

    /**
     * ioEx():
     * void.
     */

    public void ioEx() throws IOException {
        File file = new File("xxx.txt");
        Scanner scanner = new Scanner(file);
    }

    /**
     * ioExTest():
     * return.
     */

    public String ioExTest() {
        try {
            ioEx();
            return "Không có lỗi";
        } catch (IOException e) {
            return "Lỗi IO";
        }
    }
}
