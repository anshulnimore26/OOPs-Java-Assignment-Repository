class Num {
    int number;
    Num(int number) {
        this.number = number;
    }
    void showNum() {
        System.out.println("Number: " + number);
    }
}
class HexNum extends Num {
    HexNum(int number) {
        super(number);
    }
    void showNum() {
        System.out.println("Hexadecimal: " + Integer.toHexString(number));
        System.out.println("Octal: " + Integer.toOctalString(number));
    }
}
public class Q11_TestHexNum {
    public static void main(String[] args) {
        HexNum hexNum = new HexNum(255);
        hexNum.showNum();
    }
}
