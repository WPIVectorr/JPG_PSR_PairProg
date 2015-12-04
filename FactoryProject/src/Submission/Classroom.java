package Submission;

import DontChange.DeskType;
import DontChange.IClassroom;

public class Classroom implements IClassroom  {

	private int size;
	private int roomNum;
	private DeskType deskType;
	
	public void Classroom(int RS, int RN, DeskType DT) throws RoomSizeOutOfBoundsException
	{
		if(RS>200)
			throw new RoomSizeOutOfBoundsException("Room too large");
		else if(RS<61)
			throw new RoomSizeOutOfBoundsException("Room too small");
		
		size = RS;
		roomNum = RN;
		deskType = DT;
	}
	
	@Override
	public int roomSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isClassroom() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isLectureHall() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isComputerLab() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Classroom";
	}

	@Override
	public int getRoomNumber() {
		// TODO Auto-generated method stub
		return roomNum;
	}

	@Override
	public DeskType getDeskType() {
		// TODO Auto-generated method stub
		return deskType;
	}

	@Override
	public void setDeskType(DeskType t) {
		// TODO Auto-generated method stub
		deskType = t;
	}

}
