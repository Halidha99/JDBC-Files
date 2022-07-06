import javax.swing.JOptionPane;

public class SimpleCalV8 {

    public static void main(String[] args) {

        while (true) {

            String opcode = JOptionPane.showInputDialog(null,
                    "Select Your Options\n1 for Addition(+)\n"
                            + "2 for Subtraction(-)\n"
                            + "3 for Multiplication\n"
                            + "4 for Divition\n"
                            + "5 for Reminder"
                            );
            int op = Integer.parseInt(opcode);

            String num1 = JOptionPane.showInputDialog(null, "Enter Number 1");
            String num2 = JOptionPane.showInputDialog(null, "Enter Number 2");
            
            

            CalFunction function = new CalFunction();

            if (op == 1)
            function.getSum(num1, num2);
            if (op == 2)
            function.getSub(num1, num2);
            if (op == 3)
           function.getMul(num1, num2);
            if (op == 4)
             function.getDiv(num1, num2);
            if (op == 5)
            function.getReminder(num1, num2);

         

        }

    }

}