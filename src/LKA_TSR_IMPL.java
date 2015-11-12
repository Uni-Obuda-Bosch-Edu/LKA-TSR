
public class LKA_TSR_IMPL {
	public int getMaximumSpeed(WorldObjectTypes.Sign sign){
		switch(sign){
			case Speed_10:return 10;
			case Speed_20: return 20;
			case Speed_40: return 40;
			case Speed_50: return 50;
			case Speed_70: return 70;
			case Speed_90: return 90;
			case Speed_100: return 100;
		}
		return 0; // egyebkent nem megyunk sehova (pl.:stop tabla )
	}
	private int limit = 15; // ha 15 foknal tobbet allitodik a kerek szoge, akkor
							// megszakitjuk a beavatkozast
	private int resolution = 5;
	
	//azt tisztazni kell hogy a kerek elfordulas 
	//iranyat hogy implementaltak
	
	private int wheelPosition = (int)dummyWheel.getDriveWheelStateZeroBasedDegree();
	private int newWheelPosition;
	
	private void setWheelLeftOrRight(int TargetAngle){// -1 -> left, 1-> right
		wheelPosition = (int)dummyWheel.getDriveWheelStateZeroBasedDegree();
		int tmp = Math.abs(wheelPosition- TargetAngle)/resolution;
		for(int i = 0; i < tmp ; i++){// kormany 5 fokonkent allitasa
			 newWheelPosition = (int)dummyWheel.getDriveWheelStateZeroBasedDegree();
			if((int)Math.abs(newWheelPosition) - Math.abs(wheelPosition) > limit){
				return;
			}
			wheelPosition = newWheelPosition;
			if(TargetAngle < wheelPosition){// ha kissebb a target szog, akkor a jelenlegit csokkentjuk
				dummyWheel.setDriveWheelStateZeroBasedDegree((double)  (wheelPosition - (resolution)));
			}
			else{ // amugy noveljuk
				dummyWheel.setDriveWheelStateZeroBasedDegree((double) (wheelPosition + (resolution)));
			}
		}
	}
	
	public void setWheelAngle(WorldObjectTypes.Lane lane){
		
		switch(lane){
			case Simple_45Left:{
				setWheelLeftOrRight(-45);
				break;
			}
			case  Simple_45Right:{
				setWheelLeftOrRight(45);
				break;
			}
			case  Simple_65Left:{
				setWheelLeftOrRight(-65);
				break;
			}
			case  Simple_65Right:{
				setWheelLeftOrRight(65);
				break;
			}
			case Simple_90Left:{
				setWheelLeftOrRight(-90);
				break;
			}
			case Simple_90Right:{
				setWheelLeftOrRight(90);
				break;
			}
			case Simple_Straight:{
				setWheelLeftOrRight(0);
				break;
			}
			
		}
	}
}
