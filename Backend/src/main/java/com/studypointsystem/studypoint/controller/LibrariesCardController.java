package com.studypointsystem.studypoint.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.studypointsystem.studypoint.entity.LibrariesCard;
import com.studypointsystem.studypoint.entity.Library;
import com.studypointsystem.studypoint.service.LibraryService;

@CrossOrigin(origins = {"http://localhost:3000"})
@RestController
public class LibrariesCardController {

	@Autowired
	public LibraryService libraryService;
	
	@GetMapping("/libraries/getall")
	@ResponseBody
	public List<LibrariesCard> getAllLibrary(){
		List<Library> tempList = this.libraryService.getAllLibrary();
		//LibrariesCard tempLibrariesCard = new LibrariesCard();
		List<LibrariesCard> librariesCards = new ArrayList<>();
		for (Library library : tempList) {
			LibrariesCard tempLibrariesCard = new LibrariesCard();
			tempLibrariesCard.setLibraryName(library.getLibraryName());
			tempLibrariesCard.setLibraryLocation(library.getLibraryLocation());
			tempLibrariesCard.setLibraryImgUrl(library.getLibraryImgUrl());
			tempLibrariesCard.setLabAdminMobileNo(library.getLabAdmin().getLabAdminMobileNo());
			librariesCards.add(tempLibrariesCard);
		}
		return librariesCards;
	}
	
	
	
}
