package Submission;

import DontChange.DeskType;
import DontChange.ILectureHall;

public class LectureHall implements ILectureHall {

	private int roomSize;
	private int roomNum;
	private DeskType deskType;

	
	public void LectureHall(int RS, int RN, DeskType DT)
	{
		roomSize = RS;
		roomNum = RN;
		deskType = DT;
	}
	
	@Override
	public int roomSize() {
		// TODO Auto-generated method stub
		return roomSize;
	}

	@Override
	public boolean isClassroom() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isLectureHall() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isComputerLab() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Lecture Hall";
	}

	@Override
	public int getRoomNumber() {
		// TODO Auto-generated method stub
		return roomNumber;
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
