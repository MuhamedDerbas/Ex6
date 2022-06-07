import javax.swing.*;

public class Tester {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Tester");
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        pieChart p = new pieChart();
        frame.add(p);
        frame.setVisible(true);
    }

}