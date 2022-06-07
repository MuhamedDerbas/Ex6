import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class NatalityPanel extends JPanel {

    static JPanel buttons = new JPanel();
    static JPanel charts = new JPanel();
    static JPanel BtnClear = new JPanel();

    static JButton clear = new JButton("Clear");
    static JButton showData = new JButton("show data");

    static String [] selectChart = {"pie","column"};
    static JComboBox showChart = new JComboBox(selectChart);

    static String [] selectData = {"Gender", "Birthday"};
    static JComboBox cb = new JComboBox(selectData);

    static ArrayList<Double> data = new ArrayList<Double>();
    static ArrayList<String> label = new ArrayList<String>();

    static pie pie = new pie(data,label);

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        pie.draw(g,120, 100, 500, 500);

    }

//    clear.addActionListener(new  ActionListener() {
//
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            clear.setText("");
//        }
//
//    });


    public static void main(String[] args) {

        JFrame f = new JFrame("Button Example");
        f.setSize(500,500);

        data.add(3.5);
        data.add(5.0);
        data.add(4.3);
        data.add(5.2);
        data.add(2.0);
        data.add(4.7);

        label.add("ABC");
        label.add("DEF");
        label.add("JKH");
        label.add("MNO");
        label.add("PQR");
        label.add("XYZ");


        buttons.setBounds(0,1, f.getWidth(), 40);
        buttons.setVisible(true);
        buttons.setBackground(Color.LIGHT_GRAY);

//        showData.setBounds(50,100,80,30);
//        showChart.setBounds(50,1,100,30);
//        cb.setBounds(50,50,100,30);
        buttons.add(showChart);
        buttons.add(cb);
        buttons.add(showData);


        charts.setBounds(0,40,f.getWidth(),380);
        charts.setVisible(true);
        charts.setBackground(Color.GRAY);

        BtnClear.setBounds(0,420, f.getWidth(), 41);
        BtnClear.setVisible(true);
        BtnClear.setBackground(Color.BLACK);
        BtnClear.add(clear);

        NatalityPanel N = new NatalityPanel();


        f.add(buttons);
        f.add(charts);
        f.add(BtnClear);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

}