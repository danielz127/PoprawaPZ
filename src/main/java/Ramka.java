import javax.swing.*;

public class Ramka {
    public Ramka(){
        JFrame frame =new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Add contents to the window.
        frame.add(new Okno());

        //Display the window.
        frame.pack();
        frame.setVisible(true);

    }
}
