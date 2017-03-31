package Factories;

import FloorComponent.*;

public class BathroomComponentFactory extends AbstractFloorComponentFactory{
	
	@Override
	public FloorComponent getComponent(String componentType){
		if(componentType == null){
			return null;
		}
		
		else if(componentType.equals("TOILETFD")){
			return new ToiletComponentFacingDown(true);
		}
		
		else if(componentType.equals("TOILETFU")){
			return new ToiletComponentFacingUp(true);
		}
		
		else if(componentType.equals("TOILETFR")){
			return new ToiletComponentFacingRight(true);
		}
		
		else if(componentType.equals("TOILETFL")){
			return new ToiletComponentFacingLeft(true);
		}
		
		else if(componentType.equals("SINKFD")){
			return new BathroomSinkComponentFacingDown(true);
		}
		
		else if(componentType.equals("SINKFU")){
			return new BathroomSinkComponentFacingUp(true);
		}
		
		else if(componentType.equals("SINKFR")){
			return new BathroomSinkComponentFacingRight(true);
		}
		
		else if(componentType.equals("SINKFL")){
			return new BathroomSinkComponentFacingLeft(true);
		}
		
		else if(componentType.equals("BATHTUBH")){
			return new BathtubComponentHorizontal(true);
		}
		
		else if(componentType.equals("BATHTUBV")){
			return new BathtubComponentVertical(true);
		}
		
		else
			return null;
	}

	@Override
	public FloorComponent getGridComponent(String componentType) {
		if(componentType == null){
			return null;
		}
		
		else if(componentType.equals("TOILETFD")){
			return new ToiletComponentFacingDown(false);
		}
		
		else if(componentType.equals("TOILETFU")){
			return new ToiletComponentFacingUp(false);
		}
		
		else if(componentType.equals("TOILETFR")){
			return new ToiletComponentFacingRight(false);
		}
		
		else if(componentType.equals("TOILETFL")){
			return new ToiletComponentFacingLeft(false);
		}
		
		else if(componentType.equals("SINKFD")){
			return new BathroomSinkComponentFacingDown(false);
		}
		
		else if(componentType.equals("SINKFU")){
			return new BathroomSinkComponentFacingUp(false);
		}
		
		else if(componentType.equals("SINKFR")){
			return new BathroomSinkComponentFacingRight(false);
		}
		
		else if(componentType.equals("SINKFL")){
			return new BathroomSinkComponentFacingLeft(false);
		}
		
		else if(componentType.equals("BATHTUBH")){
			return new BathtubComponentHorizontal(false);
		}
		
		else if(componentType.equals("BATHTUBV")){
			return new BathtubComponentVertical(false);
		}
		
		else
			return null;
	}
	
}