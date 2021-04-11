/**
 * █████▒█    ██  ▄████▄   ██ ▄█▀       ██████╗ ██╗   ██╗ ██████╗
 * ▓██   ▒ ██  ▓██▒▒██▀ ▀█   ██▄█▒        ██╔══██╗██║   ██║██╔════╝
 * ▒████ ░▓██  ▒██░▒▓█    ▄ ▓███▄░        ██████╔╝██║   ██║██║  ███╗
 * ░▓█▒  ░▓▓█  ░██░▒▓▓▄ ▄██▒▓██ █▄        ██╔══██╗██║   ██║██║   ██║
 * ░▒█░   ▒▒█████▓ ▒ ▓███▀ ░▒██▒ █▄       ██████╔╝╚██████╔╝╚██████╔╝
 * ▒ ░   ░▒▓▒ ▒ ▒ ░ ░▒ ▒  ░▒ ▒▒ ▓▒       ╚═════╝  ╚═════╝  ╚═════╝
 * ░     ░░▒░ ░ ░   ░  ▒   ░ ░▒ ▒░
 * ░ ░    ░░░ ░ ░ ░        ░ ░░ ░
 * ░     ░ ░      ░  ░
 *
 * @author JESEE030
 * @webadress https://github.com/jesee030
 * @Version 1.0
 * @creat 2021-04-11-上午 9:14
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *类功能描述
 *
 *   █████▒█    ██  ▄████▄   ██ ▄█▀       ██████╗ ██╗   ██╗ ██████╗
 * ▓██   ▒ ██  ▓██▒▒██▀ ▀█   ██▄█▒        ██╔══██╗██║   ██║██╔════╝
 * ▒████ ░▓██  ▒██░▒▓█    ▄ ▓███▄░        ██████╔╝██║   ██║██║  ███╗
 * ░▓█▒  ░▓▓█  ░██░▒▓▓▄ ▄██▒▓██ █▄        ██╔══██╗██║   ██║██║   ██║
 * ░▒█░   ▒▒█████▓ ▒ ▓███▀ ░▒██▒ █▄       ██████╔╝╚██████╔╝╚██████╔╝
 *  ▒ ░   ░▒▓▒ ▒ ▒ ░ ░▒ ▒  ░▒ ▒▒ ▓▒       ╚═════╝  ╚═════╝  ╚═════╝
 *  ░     ░░▒░ ░ ░   ░  ▒   ░ ░▒ ▒░
 *  ░ ░    ░░░ ░ ░ ░        ░ ░░ ░
 *           ░     ░ ░      ░  ░
 @author JESEE030
 @ClassName IntelliJ IDEA.java
 @Description respond button click even
 @webadress https://github.com/jesee030
 *@Date 2021/4/11 上午 9:14
 */
public class buttonListener implements ActionListener {
    public void actionPerformed(ActionEvent e){
        String s = e.getActionCommand();
        //legal operator
        if ('0' <= s.charAt(0) && s.charAt(0) <= '9' || s.equals(".")){
            //first input,like"1"in"123"
            if (Calculator.flag){

                Calculator.show.setText(s);
            }else {//"2" or "3" in "123"
                Calculator.show.setText(Calculator.show.getText() + s);
            }
            Calculator.flag = false;
        }else {
            //negtive opetator or operator
            if(Calculator.flag){
                if (s.equals("-")){
                    //negtive num
                    Calculator.show.setText(s);
                    Calculator.flag = false;

                }else {
                    //continue operator
                    Calculator.opChar = s;
                }
            }else {
                //is operator
                //create calculate instance
                calculate cal = new calculate();
                //get oeprands
                double x = Double.parseDouble(Calculator.show.getText());
                //双目运算及处理单目运算的操作数
                cal.calop1(x);
                //store oeretor
                Calculator.opChar = s;
                if (Calculator.opChar.equals("!") || Calculator.opChar.equals("√")
                        || Calculator.opChar.equals("n!")){
                    //unary operation
                    if (Calculator.opNum < 0){
                        Calculator.show.setText("不能执行此操作！！");
                    }else {
                        //unary operation
                        cal.calopr2((int)Calculator.opNum,Calculator.opChar);
                    }
                        Calculator.opChar = "=";

                }else if (Calculator.opChar.equals("1/x")
                    || Calculator.opChar.equals("x^2")
                    ||  Calculator.opChar.equals("ln")
                    ||Calculator.opChar.equals("log")
                    ||Calculator.opChar.equals("sin")
                        ||Calculator.opChar.equals("cos")
                        ||Calculator.opChar.equals("tan")
                        ||Calculator.opChar.equals("Exp")){
                    cal.calopr2((int)Calculator.opNum,Calculator.opChar);
                    Calculator.opChar = "=";
                }
                Calculator.flag = true;
            }
        }
    }
}
