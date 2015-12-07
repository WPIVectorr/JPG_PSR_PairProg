package Submission;

import DontChange.ComputerType;
import DontChange.DeskType;
import DontChange.IRoom;

public class RoomFactory {

	public RoomFactory() {
		// TODO Auto-generated constructor stub
		
	}
	//creates rooms without computers
	public IRoom createRoom(int RN, int RS, DeskType DT)
	{
		
			try {
				if(RS<61 && DT == DeskType.SWINGOUT)
					return new Classroom(RN,RS,DT);
				else if(RS>60 && DT == DeskType.LONGTABLES)
					return new LectureHall(RN,RS,DT);
				else 
					return new Room(RN,RS,DT);
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
