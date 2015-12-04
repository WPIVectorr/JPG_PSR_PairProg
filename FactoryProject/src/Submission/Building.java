package Submission;

import java.util.ArrayList;
import java.util.Collection;

import DontChange.IBuilding;
import DontChange.IClassroom;
import DontChange.IComputerLab;
import DontChange.ILectureHall;
import DontChange.IRoom;

public class Building implements IBuilding{
	
	Collection<IRoom> rooms = new ArrayList<IRoom>();
	
	public Building(){
		
	}

	@Override
	public Collection<IRoom> getRooms() {
		// TODO Auto-generated method stub
		return rooms;
	}

	@Override
	public void addRoom(IRoom newRoom) {
		// TODO Auto-generated method stub
		rooms.add(newRoom);
	}

	@Override
	public Collection<IClassroom> getClassrooms() {
		// TODO Auto-generated method stub
		Collection<IClassroom> classrooms = new ArrayList<IClassroom>();
		for(IRoom room : rooms){
			if(room.isClassroom()){
				classrooms.add((IClassroom)room);
			}
		}
		return classrooms;
	}

	@Override
	public Collection<ILectureHall> getLectureHalls() {
		// TODO Auto-generated method stub
		Collection<ILectureHall> lectureHall = new ArrayList<ILectureHall>();
		for(IRoom room : rooms){
			if(room.isClassroom()){
				lectureHall.add((ILectureHall)room);
			}
		}
		return lectureHall;
	}

	@Override
	public Collection<IComputerLab> getComputerLabs() {
		// TODO Auto-generated method stub
		Collection<IComputerLab> compLabs = new ArrayList<IComputerLab>();
		for(IRoom room : rooms){
			if(room.isClassroom()){
				compLabs.add((IComputerLab)room);
			}
		}
		return compLabs;
	}

}
