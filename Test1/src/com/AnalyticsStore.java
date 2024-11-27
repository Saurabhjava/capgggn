package com;

import java.util.LinkedList;
import java.util.Queue;

public class AnalyticsStore implements IAnalyticsStore {
	Queue<ActionEnum> storedActions=new LinkedList<>();
	@Override
	public void storeActions(Queue<ActionEnum> q) {
		storedActions.addAll(q);
		
	}

	@Override
	public Queue<ActionEnum> getAllStoredActions() {
		// TODO Auto-generated method stub
		return storedActions;
	}

}
