import java.awt.*;
import java.awt.event.MouseEvent;

public class Main {
    // ��4399С��Ϸ��Ȱ׿� �ѽ�������������� ��ִ�г��� Ȼ�����Ϸ���� ����
    public static void main(String[] args) throws AWTException {
        Robot robot=new Robot();
        Color black=new Color(2,2,2);
        int readyTime=3000;
        robot.delay(readyTime);
         while (true){
               if (robot.getPixelColor(400,590).equals(black)){
                   robot.mouseMove(400,590); // ��һ��
               }else if (robot.getPixelColor(500,590).equals(black)){
                   robot.mouseMove(500,590); // �ڶ���
               }else if (robot.getPixelColor(600,590).equals(black)){
                   robot.mouseMove(600,590);
               }else if (robot.getPixelColor(750,590).equals(black)){
                   robot.mouseMove(750,590);
               }else {
                   break;
               }
               robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
               robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
               robot.delay(350);
         }

    }
}
