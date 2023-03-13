package com.studypointsystem.studypoint.entity;

public class LibrariesCard {

	private String libraryName;
	private String libraryLocation;
	private String labAdminMobileNo;
	private String libraryImgUrl;
	
	public LibrariesCard() {
		super();
	}

	public LibrariesCard(String libraryName, String libraryLocation, String labAdminMobileNo, String libraryImgUrl) {
		super();
		this.libraryName = libraryName;
		this.libraryLocation = libraryLocation;
		this.labAdminMobileNo = labAdminMobileNo;
		this.libraryImgUrl = libraryImgUrl;
	}

	public String getLibraryName() {
		return libraryName;
	}

	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}

	public String getLibraryLocation() {
		return libraryLocation;
	}

	public void setLibraryLocation(String libraryLocation) {
		this.libraryLocation = libraryLocation;
	}

	public String getLabAdminMobileNo() {
		return labAdminMobileNo;
	}

	public void setLabAdminMobileNo(String labAdminMobileNo) {
		this.labAdminMobileNo = labAdminMobileNo;
	}

	public String getLibraryImgUrl() {
		return libraryImgUrl;
	}

	public void setLibraryImgUrl(String libraryImgUrl) {
		this.libraryImgUrl = libraryImgUrl;
	}

	@Override
	public String toString() {
		return "LibrariesCard [libraryName=" + libraryName + ", libraryLocation=" + libraryLocation
				+ ", labAdminMobileNo=" + labAdminMobileNo + ", libraryImgUrl=" + libraryImgUrl + "]";
	}
}
