/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fatec.desenho;

import javax.swing.JFrame;

/**
 *
 * @author jpfalcuci
 */
public class DrawPanelTest {
    
    public static void main(String[] args) {
        DrawPanel panel = new DrawPanel();
        
        JFrame application = new JFrame();
        
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        application.add(panel);
        application.setSize(500, 500);
        application.setVisible(true);
    }
}
