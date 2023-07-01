package Binary;

public class AddBinary {
    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        Binary bin = new Binary();
        System.out.println(bin.addBinary(a, b));
    }
}
class Binary {
    public String addBinary(String a, String b) {
        int num1 = Integer.parseInt(a,2);
        int num2 = Integer.parseInt(b,2);

        int add = num1+num2;
        return Integer.toBinaryString(add);
    }

}
