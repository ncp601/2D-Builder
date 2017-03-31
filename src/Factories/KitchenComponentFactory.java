package Factories;

import FloorComponent.*;

public class KitchenComponentFactory extends AbstractFloorComponentFactory{
	
	@Override
	public FloorComponent getComponent(String componentType){
		if(componentType == null){
			return null;
		}
		
		else if(componentType.equals("STOVEFD")){
			return new StoveComponentFacingDown(true);
		}
		
		else if(componentType.equals("STOVEFU")){
			return new StoveComponentFacingUp(true);
		}
		
		else if(componentType.equals("STOVEFR")){
			return new StoveComponentFacingRight(true);
		}
		
		else if(componentType.equals("STOVEFL")){
			return new StoveComponentFacingLeft(true);
		}
		
		else if(componentType.equals("KITCHENCOUNTER1B")){
			return new KitchenCounterComponentOneBlock(true);
		}

		else if(componentType.equals("KITCHENCOUNTER2H")){
			return new KitchenCounterComponentTwoBlockHorizontal(true);
		}
		
		else if(componentType.equals("KITCHENCOUNTER2V")){
			return new KitchenCounterComponentTwoBlockVertical(true);
		}
		
		else
			return null;
	}

	@Override
	public FloorComponent getGridComponent(String componentType) {
		if(componentType == null){
			return null;
		}
		
		else if(componentType.equals("STOVEFD")){
			return new StoveComponentFacingDown(false);
		}
		
		else if(componentType.equals("STOVEFU")){
			return new StoveComponentFacingUp(false);
		}
		
		else if(componentType.equals("STOVEFR")){
			return new StoveComponentFacingRight(false);
		}
		
		else if(componentType.equals("STOVEFL")){
			return new StoveComponentFacingLeft(false);
		}
		
		else if(componentType.equals("KITCHENCOUNTER1B")){
			return new KitchenCounterComponentOneBlock(false);
		}
		
		else if(componentType.equals("KITCHENCOUNTER2H")){
			return new KitchenCounterComponentTwoBlockHorizontal(false);
		}
		
		else if(componentType.equals("KITCHENCOUNTER2V")){
			return new KitchenCounterComponentTwoBlockVertical(false);
		}
		
		else
			return null;
	}
	
}