import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        List<String> listSt = new ArrayList<>();
        String regexNumber = "^\\d+$";
        String regexSign = "[\\+-\\/\\*]";
        String regexSpace = "\\s";
        List<Integer> numbers = new ArrayList<>();
        List<String> signs = new ArrayList<>();


        try(FileReader reader = new FileReader("data"))
        {
            int c;

            String temp = "", num = "";
            while((c=reader.read())!=-1){
                if (c == 32) {
                    continue;
                }
                temp = temp + (char)c;
                if (temp.matches(regexNumber) || temp.isEmpty()) {
                    num = temp;
                } else {
                    temp = "";
                    numbers.add(Integer.parseInt(num));
                    signs.add("" + (char)c);
                }

            }
            numbers.add(Integer.parseInt(num));

        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

        int sum = numbers.get(0);
        for (int i = 0; i < signs.size(); i++) {
            if (signs.get(i).equals("/")) {
                numbers.set(i + 1, numbers.get(i) / numbers.get(i + 1));

            } else if (signs.get(i).equals("*")) {
                numbers.set(i + 1, numbers.get(i) * numbers.get(i + 1));
            } else if (signs.get(i).equals("+")) {
                numbers.set(i + 1, numbers.get(i) + numbers.get(i + 1));
            } else if (signs.get(i).equals("-")) {
                numbers.set(i + 1, numbers.get(i) - numbers.get(i + 1));
            }
        }

        System.out.println(numbers.get(numbers.size()-1));

    }
}
