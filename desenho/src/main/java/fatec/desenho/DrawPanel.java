/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package fatec.desenho;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author jpfalcuci
 */

// Utilizando DrawLine para conectar os cantos de um painel

public class DrawPanel extends JPanel {

    @Override
    public void paintComponent(Graphics g){

        super.paintComponent(g);

        int width = getWidth();     // largura total
        int height = getHeight();   // altura total

        
//        //desenha uma linha a partir do canto superior esquerdo até o inferior direito
//        g.drawLine(0, 0, width, height);

//        //desenha uma linha a partir do canto inferior esquerdo até o superior direito
//        g.drawLine(0, height, width, 0);
        
//        // desenha uma linha a partir do meio superior até o meio inferior
//        g.drawLine(width/2, 0, width/2, height);
        
//        // desenha uma linha a partir do meio esquerdo até o meio direito
//        g.drawLine(0, height/2, width, height/2);

//        // desenha linhas do canto superior esquerdo até o meio da sua extremidade
//        for(int i = 0; i <= width; i+=20) {
//            g.drawLine(0, 0, i, height/2);
//        }

//        for (int i = 0; i < 14; i++) {
//            int x = width / 14 * i;
//            int y = height /2;
//            g.drawLine(0, 0, x, y);
//        }

//        // desenha 14 linhas do canto superior esquerdo até a diagonal inferior
//        for (int i = 0; i < 14; i++) {
//            int x1 = 0;                     // posição x inicial da linha
//            int y1 = (height / 14) * i;     // posição y inicial da linha
//            int x2 = (width / 14) * i + 1;  // posição x final da linha
//            int y2 = height;
//            g.drawLine(x1, y1, x2, y2);
//        }

        // desenha estrela com 10 linhas
        int middlex = width / 2;                    // coordenada X do meio do painel
        int middley = height / 2;                   // coordenada Y do meio do painel
        int radius = Math.min(width, height / 3);   // raio da circunferência que circunscreve a estrela em 1/3

        // define a coordenada dos vértices internos e externos
        int[] xPoints = new int[11];
        int[] yPoints = new int[11];

        for (int i = 0; i < 11; i++) {
            double angle = i * Math.PI / 5; // ângulo da linha
            int x = (int) (middlex + Math.cos(angle) * radius);
            int y = (int) (middley + Math.sin(angle) * radius);

            if (i % 2 == 0) { // vértice externo
                xPoints[i] = x;
                yPoints[i] = y;
            } else { // vértice interno
                xPoints[i] = (int) (middlex + Math.cos(angle) * radius / 2);
                yPoints[i] = (int) (middley + Math.sin(angle) * radius / 2);
            }
        }

        g.drawPolyline(xPoints, yPoints, 11);
    }
}
