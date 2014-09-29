package ni;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;


public class ATSimulate extends JFrame {

	private static final long serialVersionUID = 1L;
	private static final int FRAME_WIDTH = 800;
    private static final int FRAME_HEIGHT = 580;
    
    private GPanel gPanel;
    private JPanel toolPanel;
    private JTextField gga1, gga2;
    private JButton btn;
    private JLabel errorMessage;
    
    
    public ATSimulate() {
    	
    	gPanel = new GPanel();
    	toolPanel = new JPanel();
    	toolPanel.setPreferredSize(new Dimension(600, 140));
    	
    	Border innerBorder = BorderFactory.createTitledBorder("Simulate Data");
        Border outerBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
        
        toolPanel.setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));
        
        toolPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        
        JLabel ggaLabel1 = new JLabel("$GPGGA1");
        ggaLabel1.setForeground(Color.blue);
        toolPanel.add(ggaLabel1);
        gga1 = new JTextField(65);
        toolPanel.add(gga1);
        
        
        JLabel ggaLabel2 = new JLabel("$GPGGA2");
        ggaLabel2.setForeground(Color.red);
        toolPanel.add(ggaLabel2);
        gga2 = new JTextField(65);
        toolPanel.add(gga2);
        
        toolPanel.add( new JLabel("<html><br /><br /></html>") );
        btn = new JButton("Simulate Result");
        toolPanel.add(btn);
        
        
        errorMessage = new JLabel();
        errorMessage.setForeground(Color.red);
        toolPanel.add(errorMessage);
        
    }
    
    
    private boolean validateData(String data, int p) {
    	
    	double dpx;
    	
    	String[] gpsField = data.split(",");
    	
    	if ( !gpsField[0].equals("$GPGGA") && gpsField.length != 16 )
    		return false;
    	
    	int latitude, longitude, altitude;
    	
    	latitude = (int) Double.parseDouble( gpsField[2] );
    	longitude = (int) Double.parseDouble( gpsField[4] );
    	altitude = (int) Double.parseDouble( gpsField[9] );
    	
    	
    	if (longitude-latitude > 0) {
    		
    		if (p==1) {
    			
    			gPanel.p1 = new int[2];
    			
    			dpx = (longitude-latitude)/100;
    			gPanel.p1[0] = (int) dpx;
    			gPanel.p1[1] = altitude;
    			
    		}
    		else {
    			
    			gPanel.p2 = new int[2];
    			
    			dpx = (longitude-latitude)/100;
    			gPanel.p2[0] = (int) dpx;
    			gPanel.p2[1] = altitude;
    			
    		}
    		
    		return true;
    	}
    	
    	
    	return false;
    	
    }
    
    
	public void createAndShowGui() {
        
		setLayout(new BorderLayout());
        
		gPanel.setPreferredSize(new Dimension(FRAME_WIDTH, FRAME_HEIGHT));
        
        setTitle("ATS Project by - Ripunjay Sarma & Samiran Hazarika");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
        btn.addActionListener(
        		
	        new ActionListener() {
	
	            public void actionPerformed(ActionEvent e) {
	            	
	                String s1 = gga1.getText();
	                String s2 = gga2.getText();
	                
	            	if ( s1.isEmpty() || s2.isEmpty() ) {
            			errorMessage.setText("Please enter GGA data for both field");
	            	}
	            	else {
	            		
	            		//parse validate gps data
	            		if ( !validateData(s1, 1) ) {
	            			errorMessage.setText("Invalid GGA1 data");
	            			return;
	            		}
	            		
	            		if ( !validateData(s2, 2) ) {
	            			errorMessage.setText("Invalid GGA2 data");
	            			return;
	            		}
	            		
	            		errorMessage.setText(null);
	            		gPanel.simulate = true;

	            		
	            		if ( !gPanel.checkSafeAltitude() ) {
	            			errorMessage.setText("Warning: Flight altitudes are not safe!");
	            		}
	            		else {
	            			errorMessage.setText(null);
	            		}
	            		
	            		revalidate();
	            		repaint();
	            		
	            	}
	                
	            }
	            
        });
        
        add(gPanel, BorderLayout.CENTER);
        add(toolPanel, BorderLayout.SOUTH);
        
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        
    }

}
