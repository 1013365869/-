package music.zkrt.com.planapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        yu();
        huo();
        fei();
    }

    /**
     * &
     */
    private void yu(){
        System.out.println("yu 0 & 0 = " + (0 & 0));
        System.out.println("yu 0 & 1 = " + (0 & 1));
        System.out.println("yu 1 & 0 = " + (1 & 0));
        System.out.println("yu 1 & 1 = " + (1 & 1));
    }

    /**
     * |
     */
    private void huo(){
        System.out.println("0 | 0 = " + (0 | 0));
        System.out.println("0 | 1 = " + (0 | 1));
        System.out.println("1 | 0 = " + (1 | 0));
        System.out.println("1 | 1 = " + (1 | 1));
    }

    /**
     * ~
     *
     这个问题涉及到计算机内部的编码。
     对于整数，计算机内部用最高位表示符号位，0表示为正，1表示为负。
     对于负数，为了便于计算，计算机用补码来表示其值。
     已经一个数的补码，要知道其值分两种情况：
     1：符号位是0，正数，所以后面的二进制位则表示大小，即正数的原码=其补码。如1表示出来则为00000001(我这里用八位来表示，也可以用16位或32位)
     2：符号位是1，负数，这时候需要把后面的数取反再加一(要问为什么？查一下资料吧，可以根据补码的特性推出来)，所以11111110表示的数是1111110取反为0000001，再加一，则为0000002。算上符号位，就是-2。

     再让我们回到楼主的问题。
     1的二进制表示为：00000001，则~1为11111110，根据补码的转换方法，我们就可以算出11111110表示的数是-2.
     同理：~0 = -1
     */
    private void fei(){
        System.out.println("～1 = " + ~(1));
        System.out.println("～0 = " + ~(0));
    }
}
