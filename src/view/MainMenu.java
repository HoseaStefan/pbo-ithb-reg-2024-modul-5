package view;

import javax.swing.*;
import java.awt.*;

public class MainMenu {
    
    private JFrame frame;

    public MainMenu() {

        showMainMenu();

    }

    public void showMainMenu() {

        Toolkit toolkit = Toolkit.getDefaultToolkit(); // INIT TOOLKIT
        Dimension screenSize = toolkit.getScreenSize(); // GET MY SCREEN SIZE

        int screenWidth = screenSize.width; // GET PIXELS FOR WIDTH
        int screenHeight = screenSize.height; // GET PIXELS FOR HEIGHT

        final int FRAME_WIDTH = 1000; // SET WIDTH
        final int FRAME_HEIGHT = 400; // SET WEIGHT

        int start_x = screenWidth / 2 - (FRAME_WIDTH / 2); // SET START LOCATION FOR X
        int start_y = screenHeight / 2 - (FRAME_HEIGHT / 2); // SET START LOCATION FOR Y
        
        frame = new JFrame("Main Menu");
        frame.setBounds(start_x, start_y, FRAME_WIDTH, FRAME_HEIGHT); // SET FRAME BOUND
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0, 0, FRAME_WIDTH, FRAME_HEIGHT);

        JLabel title = new JLabel("PEREKAMAN DATA E-KTP");
        title.setBounds(350, 10, 500, 50);
        title.setFont(new Font("SansSerif", Font.BOLD, 24));
        panel.add(title);

        JButton perekamanBtn = new JButton("PEREKAMAN");
        perekamanBtn.setBounds(380, 100, 260, 50);
        panel.add(perekamanBtn);

        perekamanBtn.addActionListener(e -> {
            frame.dispose();
            new FormInputData(1, null);
        });

        JButton pencarianBtn = new JButton("PENCARIAN");
        pencarianBtn.setBounds(380, 170, 260, 50);
        panel.add(pencarianBtn);

        pencarianBtn.addActionListener(e -> {
            frame.dispose();
            new FormPencarianData();
        });

        JButton exitBtn = new JButton("EXIT");
        exitBtn.setBounds(380, 240, 260, 50);
        panel.add(exitBtn);

        exitBtn.addActionListener(e -> {
            frame.dispose();
        });

        frame.add(panel);
        frame.setVisible(true);

    }

}