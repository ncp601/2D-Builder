package Factories;

import FloorComponent.*;

public class BedroomComponentFactory extends AbstractFloorComponentFactory{
	
	@Override
	public FloorComponent getComponent(String componentType){
		if(componentType == null){
			return null;
		}
		
		else if(componentType.equals("DOUBLEBEDFD")){
			return new DoubleBedComponentFacingDown(true);
		}
		
		else if(componentType.equals("DOUBLEBEDFU")){
			return new DoubleBedComponentFacingUp(true);
		}
		
		else if(componentType.equals("DOUBLEBEDFR")){
			return new DoubleBedComponentFacingRight(true);
		}
		
		else if(componentType.equals("DOUBLEBEDFL")){
			return new DoubleBedComponentFacingLeft(true);
		}
		
		else if(componentType.equals("SINGLEBEDFD")){
			return new SingleBedComponentFacingDown(false);
		}
		
		else if(componentType.equals("SINGLEBEDFU")){
			return new SingleBedComponentFacingUp(false);
		}
		
		else if(componentType.equals("SINGLEBEDFR")){
			return new SingleBedComponentFacingRight(false);
		}
		
		else if(componentType.equals("SINGLEBEDFL")){
			return new SingleBedComponentFacingLeft(false);
		}
		
		else if(componentType.equals("BEDTABLE1")){
			return new BedTableComponent(true);
		}
		
		else
			return null;
	}

	@Override
	public FloorComponent getGridComponent(String componentType) {
		if(componentType == null){
			return null;
		}
		
		else if(componentType.equals("DOUBLEBEDFD")){
			return new DoubleBedComponentFacingDown(false);
		}
		
		else if(componentType.equals("DOUBLEBEDFU")){
			return new DoubleBedComponentFacingUp(false);
		}
		
		else if(componentType.equals("DOUBLEBEDFR")){
			return new DoubleBedComponentFacingRight(false);
		}
		
		else if(componentType.equals("DOUBLEBEDFL")){
			return new DoubleBedComponentFacingLeft(false);
		}
		
		else if(componentType.equals("SINGLEBEDFD")){
			return new SingleBedComponentFacingDown(false);
		}
		
		else if(componentType.equals("SINGLEBEDFU")){
			return new SingleBedComponentFacingUp(false);
		}
		
		else if(componentType.equals("SINGLEBEDFR")){
			return new SingleBedComponentFacingRight(false);
		}
		
		else if(componentType.equals("SINGLEBEDFL")){
			return new SingleBedComponentFacingLeft(false);
		}
		
		else if(componentType.equals("BEDTABLE1")){
			return new BedTableComponent(false);
		}
		
		else
			return null;
	}
	
}