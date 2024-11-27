package com;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//PrintWriter out = new PrintWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String inp[];
		inp = br.readLine().split(" ");

		int totalNumberOfRequests = Integer.parseInt(inp[0]), K = Integer.parseInt(inp[1]);

		IAnalyticsStore analyticsStore = new AnalyticsStore();
		IAnalytics analytics = new Analytics(analyticsStore, K);

		for (int queryNumber = 1; queryNumber <= totalNumberOfRequests; queryNumber++) {
			inp = br.readLine().split(" ");
			switch (inp[0]) {
			case "registerAction":
				ActionEnum actionEnum = ActionEnum.valueOf(inp[1]);
				analytics.registerAction(actionEnum);
				break;
			case "getTotalNumberOfLoggedActions":
				int totalNumberOfLoggedEvents = analytics.getTotalNumberOfLoggedActions();
				System.out.println(totalNumberOfLoggedEvents);
				break;
			case "getNumberOfActionRegisteredButNotSentToAnalyticsStore":
				int x = analytics.getNumberOfActionRegisteredButNotSentToAnalyticsStore();
				System.out.println(x);
				break;
			case "getMostFrequentlyUsedActions":
				List<ActionEnum> li = analytics.getMostFrequentlyUsedActions();
				for (ActionEnum a : li) {
					System.out.print(a + " ");
				}
				System.out.print("\n");
				break;
			}
		}
	}
}