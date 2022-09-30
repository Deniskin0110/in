package String;

public class Split {

    public static String split (String input) {
        String operand1;
        String operand2;
        String operator;

        int n;
        String[] strArr;
        String[] numArr;
        strArr = input.split("\"");
        numArr = input.split("\\s");
        operand1 = strArr[1];
        operator = numArr[1].replaceAll("\\s", "");
        operand2 = input.split("\\s")[2];
        System.out.println(operator);

        if (operator.equals("*")) {
            int a = Integer.parseInt(numArr[2]);
            System.out.println(Multiplication.multiplication(operand1, a));
        } else {

            switch (operator) {
                case "+":
                    operand2 = strArr[3];
                    System.out.println(operand2);
                    System.out.println(Plus.plus(operand1, operand2));
                    break;
                case "-":
                    operand1 = strArr[1].replaceAll("\"", "");
                    operand2 = strArr[3].replaceAll("\"", "");
                    System.out.println(operand1);
                    System.out.println(operand2);
                    System.out.println(Minus.minus(operand1, operand2));
                    break;
                case "/":
                      System.out.println(Delenie.delenie(operand1, operand2));
                    break;
                default:
                    throw new IllegalArgumentException("неизвестный оператор: " + operator);
            }
        }



    return null;
    }
}
