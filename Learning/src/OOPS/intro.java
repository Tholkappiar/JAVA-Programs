package OOPS;

public class intro {
    public static void main(String[] args) {
        Integer num = 100;
        thols t = new thols();
        System.out.println(t.hashCode());
        thols h;
        
        int x=10,y=20;
//        t.swap(a,b);
        swapNumbers(x,y);
        System.out.println(x+" "+y);
    }
    public static void swapNumbers(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
    }
}
class thols{
    void swap(int a ,int b){
        int temp = a;
        a = b;
        b = temp;
    }
}

