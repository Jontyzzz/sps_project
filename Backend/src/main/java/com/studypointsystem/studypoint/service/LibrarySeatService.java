package com.studypointsystem.studypoint.service;

import java.util.List;

import com.studypointsystem.studypoint.entity.LibrarySeat;

public interface LibrarySeatService {
	
	public List<LibrarySeat> getAllLibrarySeat();

	public LibrarySeat getLibrarySeat(int seatId);

	public LibrarySeat addLibrarySeat(LibrarySeat librarySeat);

	public LibrarySeat updateLibrarySeat(LibrarySeat librarySeat);

	public void deleteLibrarySeat(int seatId);

}
