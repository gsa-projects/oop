package final_exam.java1102;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class RadioButtonItemEventEx extends JFrame {
    private JRadioButton[] radio = new JRadioButton[3];
    private String[] text = {"사과", "배", "체리"};
    private ImageIcon[] images = {
        new ImageIcon("images/apple.jpg"),
        new ImageIcon("images/pear.jpg"),
        new ImageIcon("images/cherry.jpg"),
    };
    private JLabel imgLabel = new JLabel();

    public RadioButtonItemEventEx() {
        setTitle("라디오 버튼과 ItemEvent 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new BorderLayout());

        JPanel radioPanel = new JPanel();
        radioPanel.setBackground(Color.GRAY);

        ButtonGroup g = new ButtonGroup();
        MyItemListener listener = new MyItemListener();
        for (int i = 0; i < radio.length; i++) {
            radio[i] = new JRadioButton(text[i]);
            g.add(radio[i]);
            radioPanel.add(radio[i]);
            radio[i].addItemListener(new MyItemListener());
        }
        radio[2].setSelected(true);

        c.add(radioPanel, BorderLayout.NORTH);
        c.add(imgLabel, BorderLayout.CENTER);
        imgLabel.setHorizontalAlignment(SwingConstants.CENTER);

        setSize(250, 200);
        setVisible(true);
    }

    class MyItemListener implements ItemListener {
        @Override
        public void itemStateChanged(ItemEvent e) {
            if (e.getStateChange() == ItemEvent.DESELECTED) {
                return;
            }

            if (radio[0].isSelected()) {
                imgLabel.setIcon(images[0]);
            } else if (radio[1].isSelected()) {
                imgLabel.setIcon(images[1]);
            } else {
                imgLabel.setIcon(images[2]);
            }
        }
    }

    public static void main(String[] args) {
        new RadioButtonItemEventEx();
    }
}
