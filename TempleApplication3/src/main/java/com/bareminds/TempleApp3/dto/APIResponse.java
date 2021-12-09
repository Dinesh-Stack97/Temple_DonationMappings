package com.bareminds.TempleApp3.dto;

public class APIResponse<T> {
	
	int recordCount;
	
	T response;

	public APIResponse() {
		
		// TODO Auto-generated constructor stub
	}

	public APIResponse(int recordCount, T response) {
		super();
		this.recordCount = recordCount;
		this.response = response;
	}

	public int getRecordCount() {
		return recordCount;
	}

	public void setRecordCount(int recordCount) {
		this.recordCount = recordCount;
	}

	public T getResponse() {
		return response;
	}

	public void setResponse(T response) {
		this.response = response;
	}
	
	

}
