import static org.junit.Assert.*;

import org.junit.Test;

public class LKA_TSR_TEST {
	private LKA_TSR_IMPL object = new LKA_TSR_IMPL();
	
	@Test
	public void dummyTest() {
		assertEquals(0, 0);
	}
	
	@Test
	public void getMaxSpeedTest10() {
		assertEquals(10, object.getMaximumSpeed(WorldObjectTypes.Sign.Speed_10));
	}
	@Test
	public void getMaxSpeedTest20() {
		assertEquals(20, object.getMaximumSpeed(WorldObjectTypes.Sign.Speed_20));
	}
	@Test
	public void getMaxSpeedTest40() {
		assertEquals(40, object.getMaximumSpeed(WorldObjectTypes.Sign.Speed_40));
	}
	@Test
	public void getMaxSpeedTest50() {
		assertEquals(50, object.getMaximumSpeed(WorldObjectTypes.Sign.Speed_50));
	}
	@Test
	public void getMaxSpeedTest90() {
		assertEquals(90, object.getMaximumSpeed(WorldObjectTypes.Sign.Speed_90));
	}
	@Test
	public void getMaxSpeedTest100() {
		assertEquals(100, object.getMaximumSpeed(WorldObjectTypes.Sign.Speed_100));
	}
	@Test
	public void getMaxSpeedTestStop() {
		assertEquals(0, object.getMaximumSpeed(WorldObjectTypes.Sign.Priority_Stop));
	}
	@Test
	public void setWheelAngle0() {
		dummyWheel.setDriveWheelStateZeroBasedDegree(30);
		object.setWheelAngle(WorldObjectTypes.Lane.Simple_Straight);
		assertEquals(0 ,  (int)dummyWheel.getDriveWheelStateZeroBasedDegree());
	}
	@Test
	public void setWheelAngleSimple_45Left() {
		dummyWheel.setDriveWheelStateZeroBasedDegree(30);
		object.setWheelAngle(WorldObjectTypes.Lane.Simple_45Left);
		assertEquals(-45 ,  (int)dummyWheel.getDriveWheelStateZeroBasedDegree());
	}
	@Test
	public void setWheelAngleSimple_45Right() {
		dummyWheel.setDriveWheelStateZeroBasedDegree(60);
		object.setWheelAngle(WorldObjectTypes.Lane.Simple_45Right);
		assertEquals(45 ,  (int)dummyWheel.getDriveWheelStateZeroBasedDegree());
	}
	@Test
	public void setWheelAngleSimple_65Left() {
		dummyWheel.setDriveWheelStateZeroBasedDegree(60);
		object.setWheelAngle(WorldObjectTypes.Lane.Simple_65Left);
		assertEquals(-65 ,  (int)dummyWheel.getDriveWheelStateZeroBasedDegree());
	}
	@Test
	public void setWheelAngleSimple_65Right() {
		dummyWheel.setDriveWheelStateZeroBasedDegree(60);
		object.setWheelAngle(WorldObjectTypes.Lane.Simple_65Right);
		assertEquals(65 ,  (int)dummyWheel.getDriveWheelStateZeroBasedDegree());
	}
	@Test
	public void setWheelAngleSimple_90Right() {
		dummyWheel.setDriveWheelStateZeroBasedDegree(-60);
		object.setWheelAngle(WorldObjectTypes.Lane.Simple_90Right);
		assertEquals(90 ,  (int)dummyWheel.getDriveWheelStateZeroBasedDegree());
	}
	@Test
	public void setWheelAngleSimple_90Left() {
		dummyWheel.setDriveWheelStateZeroBasedDegree(-60);
		object.setWheelAngle(WorldObjectTypes.Lane.Simple_90Left);
		assertEquals(-90 ,  (int)dummyWheel.getDriveWheelStateZeroBasedDegree());
	}
	
}
