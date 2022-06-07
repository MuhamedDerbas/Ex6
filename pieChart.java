import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class pieChart extends JPanel {

        public void paintComponent(Graphics g){
                super.paintComponent(g);
                int width = getWidth();
                int height = getHeight();

                Random random = new Random();
                ArrayList<Double> data = new ArrayList<Double>();
                ArrayList<String> label = new ArrayList<String>();



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

                double sumData = 0;
                for (Double e: data)
                        sumData += e;

                int endWidth = getWidth()/data.size();
                int endHeight = getHeight()-50;

                g.fillRect(endWidth,endHeight,10,10);
                int startAngle = 0;
                for (int i = 0; i < data.size(); i ++) {
                        float firstColor = random.nextFloat();
                        float secondColor = random.nextFloat();
                        float thirdColor = random.nextFloat();
                        Color newColor = new Color(firstColor, secondColor, thirdColor);

                        int endAngle = (int) ((data.get(i)/sumData)*360);
                        g.setColor(newColor);
                        g.fillArc(120, 100, width/2, height/2, startAngle, endAngle);
                        startAngle += endAngle;

                        endWidth = getWidth()/data.size()+ (i*60);

                        g.fillRect(endWidth,endHeight,10,10);
                        g.setColor(Color.BLACK);
                        g.drawString(label.get(i), endWidth+15 , endHeight+10);



                        if (i == data.size()-1){
                                g.setColor(newColor);
                                g.fillArc(120, 100, width/2, height/2, startAngle, 360-startAngle);
                        }


                }

        }


}