package com;
import java.util.*;
interface IAnalyticsStore {
	public void storeActions(Queue<ActionEnum> q);

	public Queue<ActionEnum> getAllStoredActions();
}
