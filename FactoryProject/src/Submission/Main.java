package Submission;

import DontChange.IBuilding;
import DontChange.*;
public class Main {
	private static RoomFactory RF = new RoomFactory();
	public static IBuilding createHiggins(){
		// Fill in driver code here
		Building Higgins = new Building();
		Higgins.addRoom(RF.createRoom( 114,35, DeskType.SWINGOUT));
		Higgins.addRoom(RF.createRoom( 116,90, DeskType.LONGTABLES));
		Higgins.addRoom(RF.createRoom( 202,35, DeskType.LONGTABLES));
		Higgins.addRoom(RF.createRoom( 218,90, DeskType.LONGTABLES));
		Higgins.addRoom(RF.createRoom( 230,40, ComputerType.WINDOWS));
		return Higgins;
	}
	
	public static IBuilding createFuller(){
		// Fill in driver code here
		Building Fuller = new Building();
		Fuller.addRoom(RF.createRoom( 021,25, ComputerType.WINDOWS));
		Fuller.addRoom(RF.createRoom( 100,102, DeskType.SWINGOUT));
		Fuller.addRoom(RF.createRoom( 200,196, DeskType.SWINGOUT));
		Fuller.addRoom(RF.createRoom(222, 27, ComputerType.LINUX));
		Fuller.addRoom(RF.createRoom(211, 38, DeskType.LONGTABLES));
		Fuller.addRoom(RF.createRoom(320, 65, DeskType.SWINGOUT));
		return Fuller;
	}
	public static void main(String args[])
	{
		IBuilding Fuller = createFuller();

		for(IRoom room : Fuller.getRooms()){
			System.out.println("Fuller, Roomnum: "+room.getRoomNumber()+" Type: "+room.getType());
		}
		
		IBuilding Higgins = createHiggins();
		for(IRoom room : Higgins.getRooms()){
			System.out.println("Higgins, Roomnum: "+room.getRoomNumber()+" Type: "+room.getType());
		}
		
	}
}
