package findarea;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Input input = new Input(new Calc(new Print()));
        input.inputString();
    }
}