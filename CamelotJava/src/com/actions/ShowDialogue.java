package com.actions;

public class ShowDialogue implements IAction  {
	
	public ShowDialogue() {
	}
	public String getName() {
		return "ShowDialogue";
	}
	
	public boolean getShouldWait() {
		return true;
	}
	
	
}
