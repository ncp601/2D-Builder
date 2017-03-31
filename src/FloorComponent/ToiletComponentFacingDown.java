package FloorComponent;

import javax.swing.*;
import ComponentCommand.ComponentMover;
import java.awt.*;

public class ToiletComponentFacingDown extends FloorComponent{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	final private String componentType = "TOILETFD";
	
	private Dimension size = new Dimension(110, 110);
	private Dimension gridSize = new Dimension(34, 38);
	
	private boolean inMenu;
	private ComponentMover compMove = new ComponentMover();
	
	public ToiletComponentFacingDown(boolean m){
		this.inMenu = m;
        addMouseListener(compMove);
        addMouseMotionListener(compMove);
		createComponent();
		setVisible(true);
	}
	
	@Override
	public void createComponent(){
		
		if(inMenu){
			ImageIcon image = new ImageIcon("images/toiletFacingDown.png");
			setIcon(image);
			setMaximumSize(size);
			setMinimumSize(size);
	        setPreferredSize(size);
		}
		
		if(!inMenu){
			ImageIcon image = new ImageIcon("images/resizedToiletFacingDown.png");
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
