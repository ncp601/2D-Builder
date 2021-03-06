package FloorComponent;

import javax.swing.*;
import ComponentCommand.ComponentMover;
import java.awt.*;

public class StairsUFacingLeft extends FloorComponent{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	final private String componentType = "STAIRTSL";

	private Dimension size = new Dimension(110, 110);
	private Dimension gridSize = new Dimension(132, 135);
	
	private boolean inMenu;
	private ComponentMover compMove = new ComponentMover();
	
	public StairsUFacingLeft(boolean m){
		this.inMenu = m;
        addMouseListener(compMove);
        addMouseMotionListener(compMove);
		createComponent();
		setVisible(true);
	}
	
	@Override
	public void createComponent(){

		if(inMenu){
			ImageIcon image = new ImageIcon("images/stairsStraightFacingLeft.png");
			setIcon(image);
			setMaximumSize(size);
			setMinimumSize(size);
	        setPreferredSize(size);
		}
		
		if(!inMenu){
			ImageIcon image = new ImageIcon("images/resizedStairsStraightFacingLeft.png");
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

