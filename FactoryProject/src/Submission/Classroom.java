package Submission;

import DontChange.DeskType;
import DontChange.IClassroom;

public class Classroom implements IClassroom {

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
		return 0;
	}

	@Override
	public DeskType getDeskType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setDeskType(DeskType t) {
		// TODO Auto-generated method stub

	}

}
