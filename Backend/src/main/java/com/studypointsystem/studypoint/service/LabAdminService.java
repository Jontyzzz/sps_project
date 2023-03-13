package com.studypointsystem.studypoint.service;

import java.util.ArrayList;
import java.util.List;
import com.studypointsystem.studypoint.entity.LabAdmin;

public interface LabAdminService {
	
    public List<LabAdmin> getAllLabAdmin();
	
	public LabAdmin getLabAdmin(int labAdminId);

	public LabAdmin addLabAdmin(LabAdmin labAdmin);
	
	public LabAdmin updateLabAdmin(LabAdmin labAdmin);
	
	public void deleteLabAdmin(int labAdminId);

}
