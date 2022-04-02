package appletexample;


import java.applet.*;
import java.awt.Button;
import java.awt.Frame;

public class Welcome
{
	public static void main (String[] args)
	{   
		  
	    // create instance of frame with the label   
	    Frame f = new Frame("Welcome");    
	  
	    // create instance of button with label  
	    Button b = new Button("submit");   
	  
	    // set the position for the button in frame   
	    b.setBounds(50,100,80,30);    
	  
	    // add button to the frame  
	    f.add(b);    
	    // set size, layout and visibility of frame  
	    f.setSize(600,600);    
	    f.setLayout(null);    
	    f.setVisible(true);   
}
}