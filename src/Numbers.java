//Napisz program, który wyświetla wszystkie liczby parzyste od 0 do 100 w konsoli,
//        a na końcu wyświetla dodatkowo ich sumę.

public class Numbers {
    public static void main(String[] args) {
        int i =0;

        while (i <= 100) {
            System.out.println(i);
            i=i+2;
        }

        while (i <=100) {
            int sum = i+i+2;
            System.out.println(sum);
        }
    }
}
