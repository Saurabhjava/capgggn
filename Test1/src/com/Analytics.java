package com;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

class Analytics implements IAnalytics {
	private IAnalyticsStore analyticsStore;
	private int K;
	private Queue<ActionEnum> actionQueue = new LinkedList<>();
	int totalLoggedActions = 0;

	public Analytics(IAnalyticsStore analyticsStore, int K) {
		this.analyticsStore = analyticsStore;
		this.K = K;
	}

	@Override
	public void registerAction(ActionEnum action) {
		actionQueue.offer(action);
		if (actionQueue.size() == K) {
			analyticsStore.storeActions(actionQueue);
			actionQueue.clear();
		}
	}

	@Override
	public int getNumberOfActionRegisteredButNotSentToAnalyticsStore() {
		return actionQueue.size();
	}

	@Override
	public int getTotalNumberOfLoggedActions() {
		return analyticsStore.getAllStoredActions().size() + actionQueue.size();
	}

	@Override
	public List<ActionEnum> getMostFrequentlyUsedActions() {
		List<ActionEnum> actions = new LinkedList<>(actionQueue);
		actions.addAll(analyticsStore.getAllStoredActions());
		List<Entry<ActionEnum, Long>> li = actions.stream()
				.collect(Collectors.groupingBy(a -> a, Collectors.counting())).entrySet().stream()
				.sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue())).toList();
		Set<Long> s = new HashSet<>();
		if (li.size() > 0) {
			System.out.print(li.get(0).getKey());
			for (Entry<ActionEnum, Long> e : li) {
				if(s.contains(e.getValue())) {
					System.out.print(" "+e.getKey());
					break;
				}
				s.add(e.getValue());
			}
		}
		System.out.println();
		return new LinkedList<>(analyticsStore.getAllStoredActions());

	}
}
