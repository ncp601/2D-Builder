package FloorComponent;

import javax.swing.*;
import ComponentCommand.ComponentMover;
import java.awt.*;

public class StoveComponentFacingUp extends FloorComponent{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	final private String componentType = "STOVEFU";

	private Dimension size = new Dimension(110, 110);
	private Dimension gridSize = new Dimension(66, 66);
	
	private boolean inMenu;
	private ComponentMover compMove = new ComponentMover();
	
	public StoveComponentFacingUp(boolean m){
		this.inMenu = m;
        addMouseListener(compMove);
        addMouseMotionListener(compMove);
		createComponent();
		setVisible(true);
	}
	
	@Override
	public void createComponent(){

		if(inMenu){
			ImageIcon image = new ImageIcon("images/stoveFacingUp.png");
			setIcon(image);
			setMaximumSize(size);
			setMinimumSize(size);
	        setPreferredSize(size);
		}
		
		if(!inMenu){
			ImageIcon image = new ImageIcon("images/resizedStoveFacingUp.png");
			setIcon(image);
			setMaximumSize(gridSize);
			setMinimumSize(gridSize);
	        setPreferredSize(gridSize);
		}
	}
	
	@Override
	public String getComponentType(){
		return componentType;
	}
	
	@Override
	public Dimension getImageSize(){
		return size;
	}
	
	@Override
	public Dimension getGridImageSize(){
		return gridSize;
	}

}

