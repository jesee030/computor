package computer;/**
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
 * @creat 2021-04-11-下午 3:54
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
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
 @ClassName computor.java
 @Description TODE
 @webadress https://github.com/jesee030
 *@Date 2021/4/11 下午 3:54
 */
public class buttonListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();//获取命令


        if (isLegal()) {
            computer.opNum1 = Double.parseDouble(computer.num1Text.getText());
            computer.opNum2 = Double.parseDouble(computer.num2Text.getText());
            if (s.equals("相加")) {

                computer.ans = computer.opNum1 + computer.opNum2;
                computer.ansText.setText("" + computer.ans);
            } else if (s.equals("相减")) {

                computer.ans = computer.opNum1 - computer.opNum2;
                computer.ansText.setText("" + computer.ans);
            }

        }else {
            computer.ansText.setText("错误输入" );
        }
        if (s.equals("全部清零")) {
            computer.num1Text.setText("0");
            computer.ansText.setText("0");
            computer.num2Text.setText("0");
        }
    }
    boolean isLegal(){
        if (computer.num1Text.getText().equals("")||computer.num2Text.getText().equals("")//1 个 或 2 个运算数均未输入
        ||!(isNum(computer.num1Text.getText())&&isNum(computer.num2Text.getText()))){
            return false;
        }

        return true;
    }
    boolean isNum(String str){
        char[] strArr = str.toCharArray();

        int count = 0;
        int dotCount = 0;
        if (str.startsWith(".")||str.endsWith(".")){
            //小数点的位置在数据的开头或结 尾处
            return false;
        }
        for(int i = 0; i < strArr.length; i++) {
            //char is not num or '.'
            if(!Character.isDigit(strArr[i])  && !('.'==(strArr[i]) )){
                count++;
            }
            if (strArr[i]=='.'){
                dotCount++;
            }

            if(count > 0||dotCount>1) {//小数点的个数超过 1 个,输入的数据串中含有除小数点和数字之外的非法字符
            return false;
            }
        }

       return true;
    }
}
