package com.myspace.advanced_dallas.mock_wih;

import java.util.Map;
import java.util.HashMap;

import org.kie.api.runtime.process.WorkItem;
import org.kie.api.runtime.process.WorkItemHandler;
import org.kie.api.runtime.process.WorkItemManager;

public class HotelPreBookingWih implements WorkItemHandler {

	public void executeWorkItem(WorkItem workItem, WorkItemManager manager) {
		Map<String, Object> results = new HashMap<String, Object>();
		results.put("vacancy", true);
		manager.completeWorkItem(workItem.getId(), results);
	}

	public void abortWorkItem(WorkItem workItem, WorkItemManager manager) {
		// TODO Auto-generated method stub

	}

}
