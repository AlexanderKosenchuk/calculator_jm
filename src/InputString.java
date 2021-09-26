import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputString {

    public static String getInput() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));   // создаем объект для работы с консолью

        String input;
        return input = reader.readLine();

    }
}
