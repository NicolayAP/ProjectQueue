package view;
import java.util.Scanner;

public class View {
    private Scanner scanner;
    public View() {
        scanner = new Scanner(System.in);
    }
    public void showMessage(String message) {
        System.out.println(message);
    }
    public int enterInt(String message) {
        showMessage(message);
        return scanner.nextInt();
    }

    public String enterString(String message) {
        showMessage(message);
        return scanner.next().toLowerCase();
    }
}
