package com;
import java.util.*;
interface IAnalytics {
	public void registerAction(ActionEnum action);

	public int getNumberOfActionRegisteredButNotSentToAnalyticsStore();

	public int getTotalNumberOfLoggedActions();

	public List<ActionEnum> getMostFrequentlyUsedActions();
}
