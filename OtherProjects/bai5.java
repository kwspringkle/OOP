import javax.swing.JOptionPane;
import java.lang.Math;
//2.2.5
public class bai5{
    public static void main(String[] args){
        String num1, num2;
        String strNotification_sum = "Results:  ";

        num1 = JOptionPane.showInputDialog(null,
        "Please input the first number: ", "Input: ", JOptionPane.INFORMATION_MESSAGE);

        num2 = JOptionPane.showInputDialog(null, 
        "Please input the second number: ", "Input: ", JOptionPane.INFORMATION_MESSAGE);

        double dnum1, dnum2; 
        dnum1 = Double.parseDouble(num1);
        dnum2 = Double.parseDouble(num2);

        String sum_result = String.format("%.2f", dnum1 + dnum2);
        String diff_result = String.format("%.2f", Math.abs(dnum1 - dnum2));
        String product_result = String.format("%.2f", dnum1 * dnum2);
        String quot_result = String.format("%.2f", dnum1 / dnum2);
        strNotification_sum += "Sum: " + sum_result + "\n" + "Difference: " + diff_result + "\n" + "Product: " + product_result + "\n" + "Quotient: " + quot_result + "\n";



        JOptionPane.showMessageDialog(null, strNotification_sum,
        "Result", JOptionPane.INFORMATION_MESSAGE);
    }
}