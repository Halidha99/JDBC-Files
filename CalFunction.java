import javax.swing.JOptionPane;
public class CalFunction{
    public static void getSum(String value1, String value2) {
        Double a = Double.parseDouble(value1);
        Double b = Double.parseDouble(value2);
        Double ans = a+b;
        JOptionPane.showMessageDialog(null, "Answer is :" + ans);
        
        
    }

    public static void getSub(String value1, String value2) {
        Double a = Double.parseDouble(value1);
        Double b = Double.parseDouble(value2);
        Double ans = a-b;
        JOptionPane.showMessageDialog(null, "Answer is :" + ans);
        
    }

    public static void getMul(String value1, String value2) {
        Double a = Double.parseDouble(value1);
        Double b = Double.parseDouble(value2);
        Double ans = a*b;
        JOptionPane.showMessageDialog(null, "Answer is :" + ans);
        
    }

    public static void getDiv(String value1, String value2) {
        Double a = Double.parseDouble(value1);
        Double b = Double.parseDouble(value2);
        Double ans = a/b;
        JOptionPane.showMessageDialog(null, "Answer is :" + ans);
        
    }
    public static void getReminder(String value1,String value2){

        double n1 = Double.parseDouble(value1);
        double n2 = Double.parseDouble(value2);
        double ans = Math.round( n1%n2);
        JOptionPane.showMessageDialog(null, "Answer is :" + ans);
    }
}