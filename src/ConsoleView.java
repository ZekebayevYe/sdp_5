import java.util.Scanner;

public class ConsoleView {
    private Scanner scanner = new Scanner(System.in);

    public void msg(String m) {
        System.out.println(m);
    }

    public String in() {
        return scanner.nextLine();
    }

    public String getDataInput(String prompt) {
        msg(prompt);
        return in();
    }
}

//i made a method to show a message and another one to get user input