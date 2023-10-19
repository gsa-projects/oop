package final_exam.java1016;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutEx extends JFrame {
    public FlowLayoutEx() {
        setTitle("FlowLayout Sample");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();

        // note: FlowLayout(align, hgap, vgap)
        //  - align: 정렬 방법
        //  - hgap: 좌우 컴포넌트 간의 수평 간격 -> horizontal
        //  - vgap: 상하 컴포넌트 간의 수평 간격 -> vertical
        c.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));
        c.add(new JButton("add"));
        c.add(new JButton("sub"));
        c.add(new JButton("mul"));
        c.add(new JButton("div"));
        c.add(new JButton("cal"));

        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        FlowLayoutEx flow = new FlowLayoutEx();
    }
}
