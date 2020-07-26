package com.spring.controller;

import java.beans.PropertyEditorSupport;

public class NameEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String studentName) throws IllegalArgumentException {
		
		if(studentName.contains("Mr.")|| studentName.contains("Ms.")){
			setValue(studentName);
		}
		else{
			studentName="Ms."+studentName;
			setValue(studentName);
		}
	}

}
