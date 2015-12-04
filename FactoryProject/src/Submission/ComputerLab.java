package Submission;

import DontChange.ComputerType;
import DontChange.IComputerLab;

public class ComputerLab implements IComputerLab {

	private int roomNum;
	private int size;
	
	ComputerType compType;
	
	public ComputerLab(int RN, int RS, ComputerType compType)throws RoomSizeOutOfBoundsException
	{
		if(RS>40)
			throw new RoomSizeOutOfBoundsException("Room too large");
		else if(RS<25)
			throw new RoomSizeOutOfBoundsException("Room too small");
		
		this.roomNum = RN;
		this.size = RS;
		this.compType = compType;
	}
	
	@Override
	public int roomSize() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public boolean isClassroom() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isLectureHall() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isComputerLab() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Computer Lab";
	}

	@Override
	public int getRoomNumber() {
		// TODO Auto-generated method stub
		return roomNum;
	}

	@Override
	public ComputerType getComputerType() {
		// TODO Auto-generated method stub
		return compType;
	}

	@Override
	public void setComputerType(ComputerType t) {
		// TODO Auto-generated method stub

	}

}
