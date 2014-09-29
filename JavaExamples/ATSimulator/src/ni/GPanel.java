package ni;

import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;


public class GPanel extends JPanel {
    
	private static final long serialVersionUID = 1L;
    
    private static final int HORIZONTAL_ORIGIN = 75;
    private static final int VERTICAL_ORIGIN = 520;
    
    private int padding = 30;
    private int labelPadding = 25;
    
    private Color gridColor = new Color(200, 200, 200, 200);
    private int pointWidth = 4;
    private int numberYDivisions = 10;
    private List<Double> scores;

    
    public boolean simulate = false;
    
    public int p1[] = null;
    public int p2[] = null;
    

    public GPanel() {
    	
    	List<Double> scores = new ArrayList<>();

        int maxDataPoints = 40;
        int maxScore = 100;
        
        for (int i = 0; i < maxDataPoints; i++) {
            scores.add((double) i*maxScore);
        }
        
        this.scores = scores;
        
    }
    

    @Override
    protected void paintComponent(Graphics g) {

        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        
        // draw white background
        g2.setColor(Color.WHITE);
        g2.fillRect(padding + labelPadding, padding, getWidth() - (2 * padding) - labelPadding, getHeight() - 2 * padding - labelPadding);
        g2.setColor(Color.BLACK);

        // create hatch marks and grid lines for y axis.
        for (int i = 0; i < numberYDivisions + 1; i++) {
        	
            int x0 = padding + labelPadding;
            int x1 = pointWidth + padding + labelPadding;
            int y0 = getHeight() - ((i * (getHeight() - padding * 2 - labelPadding)) / numberYDivisions + padding + labelPadding);
            int y1 = y0;

            g2.setColor(gridColor);
            g2.drawLine(padding + labelPadding + 1 + pointWidth, y0, getWidth() - padding, y1);
            g2.setColor(Color.BLACK);
            
            String yLabel = (i==0) ? 0+"" : ( 100 * i ) + "M";
            
            FontMetrics metrics = g2.getFontMetrics();
            int labelWidth = metrics.stringWidth(yLabel);
            g2.drawString(yLabel, x0 - labelWidth - 5, y0 + (metrics.getHeight() / 2) - 3);

            g2.drawLine(x0, y0, x1, y1);
            
        }

        // and for x axis
        for (int i = 0; i < scores.size(); i++) {
            if (scores.size() > 1) {
                int x0 = i * (getWidth() - padding * 2 - labelPadding) / (scores.size() - 1) + padding + labelPadding;
                int x1 = x0;
                int y0 = getHeight() - padding - labelPadding;
                int y1 = y0 - pointWidth;
                if ((i % ((int) ((scores.size() / 20.0)) + 1)) == 0) {
                    g2.setColor(gridColor);
                    g2.drawLine(x0, getHeight() - padding - labelPadding - 1 - pointWidth, x1, padding);
                    g2.setColor(Color.BLACK);
                    
                }
                g2.drawLine(x0, y0, x1, y1);
            }

        }
        

        // create x and y axes 
        g2.drawLine(padding + labelPadding, getHeight() - padding - labelPadding, padding + labelPadding, padding);
        g2.drawLine(padding + labelPadding, getHeight() - padding - labelPadding, getWidth() - padding, getHeight() - padding - labelPadding);
        
        //shift cooridinates
        g2.translate(HORIZONTAL_ORIGIN, VERTICAL_ORIGIN);
        
        g2.drawString("Position", 300, 40);
        
        plotPosition(g2);
        
    }
    
    public boolean checkSafeAltitude() {
    	
    	int altDiff = (p1[1] > p2[1]) ? p1[1] - p2[1] : p2[1] - p1[1];
    	return (altDiff >= 300) ? true : false;
    	
    }
    
    public void plotPosition(Graphics2D g) {
    	
    	if (!simulate) return;
		
    	int xFix=3, yBase=15;
    	
    	g.setPaint(Color.blue);
    	
    	double y1 = (-0.5*p1[1]) + 10;

    	g.fill(new Ellipse2D.Double(p1[0], (int)y1 , 6, 6));
        g.drawLine(xFix+p1[0], (int)y1, xFix+p1[0], yBase);
        g.drawString("$GPGGA1", xFix+p1[0], -5+(int)y1);
        
        
        g.setPaint(Color.red);
        
        double y2 = (-0.5*p2[1]) + 10;
        g.fill( new Ellipse2D.Double(p2[0], (int)y2, 6, 6) );
        g.drawLine(xFix+p2[0], (int)y2, xFix+p2[0], yBase);
        g.drawString("$GPGGA2", xFix+p2[0], -5+(int)y2);
        
        
    	
    }
    
}