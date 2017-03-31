package Factories;

import FloorComponent.*;

public class DinningRoomComponentFactory extends AbstractFloorComponentFactory{
	
	@Override
	public FloorComponent getComponent(String componentType){
		if(componentType == null){
			return null;
		}
		
		else if(componentType.equals("DINNINGTABLEH")){
			return new SimpleDinningTableComponentHorizontal(true);
		}
		
		else if(componentType.equals("DINNINGTABLEV")){
			return new SimpleDinningTableComponentVertical(true);
		}
		
		else if(componentType.equals("DINNINGCHAIRFD")){
			return new SimpleDinningChairComponentFacingDown(true);
		}
		
		else if(componentType.equals("DINNINGCHAIRFU")){
			return new SimpleDinningChairComponentFacingUp(true);
		}
		
		else if(componentType.equals("DINNINGCHAIRFR")){
			return new SimpleDinningChairComponentFacingRight(true);
		}
		
		else if(componentType.equals("DINNINGCHAIRFL")){
			return new SimpleDinningChairComponentFacingLeft(true);
		}
		
		else
			return null;
	}

	@Override
	public FloorComponent getGridComponent(String componentType) {
		if(componentType == null){
			return null;
		}
		
		else if(componentType.equals("DINNINGTABLEH")){
			return new SimpleDinningTableComponentHorizontal(false);
		}
		
		else if(componentType.equals("DINNINGTABLEV")){
			return new SimpleDinningTableComponentVertical(false);
		}
		
		else if(componentType.equals("DINNINGCHAIRFD")){
			return new SimpleDinningChairComponentFacingDown(false);
		}
		
		else if(componentType.equals("DINNINGCHAIRFU")){
			return new SimpleDinningChairComponentFacingUp(false);
		}
		
		else if(componentType.equals("DINNINGCHAIRFR")){
			return new SimpleDinningChairComponentFacingRight(false);
		}
		
		else if(componentType.equals("DINNINGCHAIRFL")){
			return new SimpleDinningChairComponentFacingLeft(false);
		}
		
		else
			return null;
	}
	
}