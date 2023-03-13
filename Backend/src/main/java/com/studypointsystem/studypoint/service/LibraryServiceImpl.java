package com.studypointsystem.studypoint.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studypointsystem.studypoint.entity.Library;
import com.studypointsystem.studypoint.repository.LibraryRepository;

@Service
public class LibraryServiceImpl implements LibraryService{
	
	@Autowired
	private LibraryRepository libraryRepository;

	@Override
	public List<Library> getAllLibrary() {
		
		return this.libraryRepository.findAll();
	}

	@Override
	public Library addLibrary(Library library) {
		
		libraryRepository.save(library);
		return library;
	}

	@Override
	public Library updateLibrary(Library library) {
		
		libraryRepository.save(library);
		return library;
	}

	@Override
	public void deleteLibrary(int libraryId) {
		
		Optional<Library> entity = libraryRepository.findById(libraryId);
		Library foundLibrary=entity.get();
		libraryRepository.delete(foundLibrary);
		
	}
	
	@Override
	public Library getLibrary(int libraryId) {
		
		Optional<Library> entity = libraryRepository.findById(libraryId);
		Library foundLibrary=entity.get();
		return foundLibrary;
	}
}
