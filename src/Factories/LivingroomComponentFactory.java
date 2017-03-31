package Factories;

import FloorComponent.*;

public class LivingroomComponentFactory extends AbstractFloorComponentFactory{
	
	@Override
	public FloorComponent getComponent(String componentType){
		if(componentType == null){
			return null;
		}
		
		else if(componentType.equals("SIMPLECOUCHFD")){
			return new SimpleCouchComponentFacingDown(true);
		}
		
		else if(componentType.equals("ARMCHAIRFD")){
			return new ArmChairFacingDown(true);
		}
		
		else
			return null;
	}

	@Override
	public FloorComponent getGridComponent(String componentType) {
		if(componentType == null){
			return null;
		}
		
		else if(componentType.equals("SIMPLECOUCHFD")){
			return new SimpleCouchComponentFacingDown(false);
		}
		
		else if(componentType.equals("ARMCHAIRFD")){
			return new ArmChairFacingDown(false);
		}
		
		else
			return null;
	}
	
}