public class OperatorSwitch {
   public static void main(String[] args) {
      char operator;
      Double my_input_1, my_input_2, my_result;
      my_input_1 = 40.0;
      my_input_2 = 12.0;
      operator = '%';
      System.out.println("The two numbers are defined as " +my_input_1 +" and " +my_input_2);
      System.out.println("The operator is defined as " +operator);
      switch (operator) {
         case '+':
            my_result = my_input_1 + my_input_2;
            System.out.println(my_input_1 + " + " + my_input_2 + " = " + my_result);
            break;
         case '-':
            my_result = my_input_1 - my_input_2;
            System.out.println(my_input_1 + " - " + my_input_2 + " = " + my_result);
            break;
         case '*':
            my_result = my_input_1 * my_input_2;
            System.out.println(my_input_1 + " * " + my_input_2 + " = " + my_result);
            break;
         case '/':
            my_result = my_input_1 / my_input_2;
            System.out.println(my_input_1 + " / " + my_input_2 + " = " + my_result);
            break;
         case '%':
            my_result = my_input_1 % my_input_2;
            System.out.println(my_input_1 + " % " + my_input_2 + " = " + my_result);
            break;
         default:
            System.out.println("The operator you have selected is invalid");
            break;
      }
   }
}