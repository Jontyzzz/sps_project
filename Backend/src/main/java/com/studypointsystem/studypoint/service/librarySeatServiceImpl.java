package com.studypointsystem.studypoint.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studypointsystem.studypoint.entity.LibrarySeat;
import com.studypointsystem.studypoint.repository.LibrarySeatRepository;

@Service
public class librarySeatServiceImpl implements LibrarySeatService {
	
	@Autowired
	private LibrarySeatRepository librarySeatRepository;

	@Override
	public List<LibrarySeat> getAllLibrarySeat() {
		 return this.librarySeatRepository.findAll();
	}

	@Override
	public LibrarySeat addLibrarySeat(LibrarySeat librarySeat) {
		
		this.librarySeatRepository.save(librarySeat);
		return librarySeat;
	}

	@Override
	public LibrarySeat updateLibrarySeat(LibrarySeat librarySeat) {
		
		this.librarySeatRepository.save(librarySeat);
		return librarySeat;
	}

	@Override
	public void deleteLibrarySeat(int seatId) {
		
		Optional<LibrarySeat> entity = librarySeatRepository.findById(seatId);
		LibrarySeat foundLibrarySeat = entity.get();
		this.librarySeatRepository.delete(foundLibrarySeat);
	}
	
	@Override
	public LibrarySeat getLibrarySeat(int seatId) {
		Optional<LibrarySeat> entity = librarySeatRepository.findById(seatId);
		LibrarySeat foundLibrarySeat = entity.get();
		return foundLibrarySeat;		
	}

}
