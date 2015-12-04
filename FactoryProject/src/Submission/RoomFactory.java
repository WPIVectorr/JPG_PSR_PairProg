package Submission;

import DontChange.ComputerType;
import DontChange.DeskType;
import DontChange.IRoom;

public class RoomFactory {

	public RoomFactory() {
		// TODO Auto-generated constructor stub
		
	}
	//creates rooms without computers
	public IRoom createRoom(int RS, int RN, DeskType DT)
	{
		
			try {
				if(RS<61)
					return new Classroom(RN,RS,DT);
				else
					return new LectureHall(RN,RS,DT);
			} catch (RoomSizeOutOfBoundsException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
				return null;
			}		
		
	}
	
	//creates rooms with computers
	//Roomnum, RoomSize, comptype
	public IRoom createRoom(int RN, int RS, ComputerType CT)
	{
		
		try {
			return new ComputerLab(RN, RS, CT);
		} catch (RoomSizeOutOfBoundsException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			return null;
		}
				
		
	}
}
