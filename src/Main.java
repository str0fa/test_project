// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        for(int i = 0; i <= 200; i++){
            System.out.printf("the number is: %d\n", i);
            for(int j = 0; j <= 200; j++){
                System.out.println(i*j);
            }
        }
    }
}