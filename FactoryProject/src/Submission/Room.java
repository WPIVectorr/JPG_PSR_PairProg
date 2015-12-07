package Submission;

import DontChange.DeskType;
import DontChange.IRoom;

public class Room implements IRoom {
	
	private int size;
	private int roomNum;
	private DeskType deskType;
	
	
	public Room() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param size
	 * @param roomNum
	 * @param deskType
	 */
	public Room(int size, int roomNum, DeskType deskType) {
		
		this.size = size;
		this.roomNum = roomNum;
		this.deskType = deskType;
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
		return false;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Room";
	}

	@Override
	public int getRoomNumber() {
		// TODO Auto-generated method stub
		return roomNum;
	}

}
