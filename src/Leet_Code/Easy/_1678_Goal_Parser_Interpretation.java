package Leet_Code.Easy;

public class _1678_Goal_Parser_Interpretation {
    public String interpret(String command) {
        String op = "";
        for (int i = 0; i < command.length(); i++) {
            if(command.charAt(i) == 'G' || command.charAt(i) == 'a' || command.charAt(i) == 'l')op+=command.charAt(i);
            else if(command.charAt(i) == '(' && command.charAt(i+1) == ')') op+="o";
        }
        return op;
    }
}
