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
 * @creat 2021-04-11-上午 9:24
 */

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
 @Description calculate
 @webadress https://github.com/jesee030
 *@Date 2021/4/11 上午 9:24
 */
public class calculate {
    public void calop1(double n){
        //handle the operands of binocular and monocular operations
        String str = "";
        if (Calculator.opChar.equals("+")){
            Calculator.opNum += n;
        }else if (Calculator.opChar.equals("-")){
            Calculator.opNum -= n;
        }else if (Calculator.opChar.equals("*")){
            Calculator.opNum *= n;
        }else if (Calculator.opChar.equals("/")){
            if (n==0){
                str = "divisor is zero!";
            }else{

            Calculator.opNum /= n;
            }
        }else if (Calculator.opChar.equals("^") ||  (Calculator.opChar.equals("x^y"))) {
            Calculator.opNum = Math.pow(Calculator.opNum, n);
        }else if (Calculator.opChar.equals("x√")){
            Calculator.opNum = Math.pow(n,1 / Calculator.opNum);

        }else if (Calculator.opChar.equals("Mod")){
            Calculator.opNum = Math.abs(Math.IEEEremainder(Calculator.opNum,n));
        }else if (Calculator.opChar.equals("=")){
            Calculator.opNum = n;
        }
        Calculator.show.setText(str + Calculator.opNum);

    }

    public void calopr2(int n, String opChar){
        //handle unary operation
        if (opChar.equals("!") || opChar.equals("n!")){
            Calculator.show.setText(new Factorial().factorial((int)Calculator.opNum).toString());

        }else if (opChar.equals("√")){
            Calculator.show.setText("" + Math.sqrt(n));

        }else if (opChar.equals("1/x")){
            Calculator.show.setText(""+ (1.0 / n));
        }else if (opChar.equals("x^2")){
            Calculator.show.setText(""+ Math.pow(n,2));
        }else  if (opChar.equals("ln")){
            Calculator.show.setText("" + Math.log(n));
        }else if (opChar.equals("log")){
            Calculator.show.setText("" + Math.log10(n));
        }else if (opChar.equals("sin")){
            Calculator.show.setText("" + Math.sin(Math.toRadians(n)));
        }else if (opChar.equals("cos")){
            Calculator.show.setText("" + Math.cos(Math.toRadians(n)));
        }else if (opChar.equals("tan")){
            Calculator.show.setText("" + Math.tan(Math.toRadians(n)));
        }else if (opChar.equals("Exp")){
            Calculator.show.setText("" + Math.exp(n));;
        }
    }
}
