package FloorComponent;

import javax.swing.*;
import ComponentCommand.ComponentMover;
import java.awt.*;

public class SimpleDinningChairComponentFacingUp extends FloorComponent{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	final private String componentType = "DINNINGCHAIRFU";
	
	private Dimension size = new Dimension(110, 110);
	private Dimension gridSize = new Dimension(40, 34);
	
	private boolean inMenu;
	private ComponentMover compMove = new ComponentMover();
	
	public SimpleDinningChairComponentFacingUp(boolean m){
		this.inMenu = m;
        addMouseListener(compMove);
        addMouseMotionListener(compMove);
		createComponent();
		setVisible(true);
	}
	
	@Override
	public void createComponent(){
		
		if(inMenu){
			ImageIcon image = new ImageIcon("images/simpleChairFacingUp.png");
			setIcon(image);
			setMaximumSize(size);
			setMinimumSize(size);
	        setPreferredSize(size);
		}
		
		if(!inMenu){
			ImageIcon image = new ImageIcon("images/resizedSimpleChairFacingUp.png");
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
	
	public Dimension getGridImageSize(){
		return gridSize;
	}

}