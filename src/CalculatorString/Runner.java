package CalculatorString;

public class Runner {

     /*

    Калькулятор точек!


    Вам нужно написать калькулятор, который получает на вход строки.
    Точки будут представлять число в уравнении. С одной стороны будут точки, оператор и снова точки после оператора.
    Точки и оператор будут разделены одним пробелом.

    Вот следующие допустимые операторы:

    + Добавление
    - вычитание
    * Умножение
    // Целочисленное деление
    Ваша работа (задача)
    Вам нужно будет вернуть строку, содержащую точки, столько же возвращает уравнение.
    Если результат равен 0, вернуть пустую строку. Когда дело доходит до вычитания,
    первое число всегда будет больше или равно второму числу.

        Примеры (ввод => вывод)

        * "..... + ..............." => "...................."
        * "..... - ..."             => ".."
        * "..... - ."               => "...."
        * "..... * ..."             => "..............."
        * "..... * .."              => ".........."
        * "..... // .."             => ".."
        * "..... // ."              => "....."
        * ". // .."                 => ""
        * ".. - .."                 => ""

     Алгоритм решения задачи!

     1. Разбить строку на две части
     2. Получить оператор
     3.

     */

    public static void main(String[] args) {
//        String test = ".... //  ..";
//        String res = calc(test);
//        System.out.println(res);

        System.out.println("------------------------");

        String name = "Ruslan ".repeat(5);
        System.out.println(name);




    }
    public static String calc(String txt){
        StringBuilder stringBuilder = new StringBuilder("");
        String [] numbers = txt.split(" ");

        int numberOne = numbers[0].length();
        int numberTwo = numbers[2].length();
        int total = 0;

        if (txt.contains("+")){
            total += numberOne + numberTwo;
        }
        if (txt.contains("-")){
            total += numberOne - numberTwo;
        }
        if (txt.contains("*")){
            total += numberOne * numberTwo;
        }
        if (txt.contains("//")){
            total += Math.floor(numberOne / numberTwo);
        }


        while (total > 0){
            stringBuilder.append(".");
            total --;
        }
        return stringBuilder.toString();


    }

    // The best practices!
    public static String calc2(String text){
        String [] arr = text.split(" ");
        int a = arr[0].length();
        int b = arr[2].length();

        switch (arr[1]){
            case "+":
                return ".".repeat(a + b );
            case "-":
                return "-".repeat(a - b);
            case "*":
                return ".".repeat(a * b);
            default:
                return ".".repeat(a / b);
        }

    }
    public static String generateResult(int countString){
        char ch = '.';
        StringBuilder stringBuilder = new StringBuilder();

        if (countString < 0){
            return stringBuilder.append("").toString();
        } else {
            for (int i = 0; i < countString; i++){
                stringBuilder.append(ch);
            }
        }
        return stringBuilder.toString();

    }




}
