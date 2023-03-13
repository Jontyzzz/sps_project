package com.studypointsystem.studypoint.service;

import java.util.List;
import com.studypointsystem.studypoint.entity.Library;

public interface LibraryService {
	
   public List<Library> getAllLibrary();
	
	public Library getLibrary(int libraryId);

	public Library addLibrary(Library library);
	
	public Library updateLibrary(Library library);
	
	public void deleteLibrary(int libraryId);

}


