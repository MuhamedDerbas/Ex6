import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class pie extends Chart{


    public pie(ArrayList<Double> data, ArrayList<String> labels) {
        super(data, labels);
    }

    @Override
    public void draw(Graphics g, int x, int y, int width, int height) {

            Random random = new Random();
            double sumData = 0;
            for (Double e: data)
                sumData += e;

            int endWidth = width/data.size();
            int endHeight = height-50;

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

                endWidth = width/data.size()+ (i*60);

                g.fillRect(endWidth,endHeight,10,10);
                g.setColor(Color.BLACK);
                g.drawString(labels.get(i), endWidth+15 , endHeight+10);



                if (i == data.size()-1){
                    g.setColor(newColor);
                    g.fillArc(120, 100, width/2, height/2, startAngle, 360-startAngle);
                }


            }

        }
    }
