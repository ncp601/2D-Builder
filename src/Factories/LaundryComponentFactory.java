package Factories;

import FloorComponent.*;

public class LaundryComponentFactory extends AbstractFloorComponentFactory{
	
	@Override
	public FloorComponent getComponent(String componentType){
		if(componentType == null){
			return null;
		}
		
		else if(componentType.equals("WASHERFD")){
			return new WasherComponentFacingDown(true);
		}
		
		else if(componentType.equals("WASHERFU")){
			return new WasherComponentFacingUp(true);
		}
		
		else if(componentType.equals("WASHERFR")){
			return new WasherComponentFacingRight(true);
		}
		
		else if(componentType.equals("WASHERFL")){
			return new WasherComponentFacingLeft(true);
		}
		
		else if(componentType.equals("DRYERFD")){
			return new DryerComponentFacingDown(true);
		}
		
		else if(componentType.equals("DRYERFU")){
			return new DryerComponentFacingUp(true);
		}
		
		else if(componentType.equals("DRYERFR")){
			return new DryerComponentFacingRight(true);
		}
		
		else if(componentType.equals("DRYERFL")){
			return new DryerComponentFacingLeft(true);
		}
		
		else
			return null;
	}

	@Override
	public FloorComponent getGridComponent(String componentType) {
		if(componentType == null){
			return null;
		}
		
		else if(componentType.equals("WASHERFD")){
			return new WasherComponentFacingDown(false);
		}
		
		else if(componentType.equals("WASHERFU")){
			return new WasherComponentFacingUp(false);
		}
		
		else if(componentType.equals("WASHERFR")){
			return new WasherComponentFacingRight(false);
		}
		
		else if(componentType.equals("WASHERFL")){
			return new WasherComponentFacingLeft(false);
		}
		
		else if(componentType.equals("DRYERFD")){
			return new DryerComponentFacingDown(false);
		}
		
		else if(componentType.equals("DRYERFU")){
			return new DryerComponentFacingUp(false);
		}
		
		else if(componentType.equals("DRYERFR")){
			return new DryerComponentFacingRight(false);
		}
		
		else if(componentType.equals("DRYERFL")){
			return new DryerComponentFacingLeft(false);
		}
		
		else
			return null;
	}
	
}