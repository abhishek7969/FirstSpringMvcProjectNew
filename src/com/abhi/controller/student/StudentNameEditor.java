package com.abhi.controller.student;

import java.beans.PropertyEditorSupport;

public class StudentNameEditor extends PropertyEditorSupport {
	
	@Override
	public void setAsText(String studentName) throws IllegalArgumentException{
		if(studentName.contains("Mr.") || studentName.contains("Ms.")){
			setValue(studentName);
		}
		else{
			setValue("Mr."+studentName);
		}
		
	}

}
