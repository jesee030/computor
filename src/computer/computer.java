package computer; /**
 * @author JS
 * @creat 2021-04-07-下午 10:25
 */

import javax.swing.*;
import java.awt.*;

/**
 *类功能描述
 *@Authorkeyter
 *@Date 2021/4/7 下午 10:25
 */
public class computer extends JFrame {

    static JTextField num1Text;
    static JTextField num2Text;
    static JTextField ansText;
    //存放操作数
    static double opNum1=0;
    static double opNum2=0;
    static double ans =0;

    public static void main(String[] args) {
        new EasyFrame();//create an easy calculate frame

    }
}
