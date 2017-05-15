package com.cnetsample.base;

import com.cuckoo95.cnetlib.def.http.resp.IRespBase;
import com.google.gson.annotations.SerializedName;

public class BaseResponse<T> implements IRespBase<T> {
	/*
	 * 1：成功
	 * 0：失败
	 */
	@SerializedName("status")
	private int status = -1;
	
	/*
	 * 消息
	 */
	@SerializedName("message")
	private String msg = null ;

	private transient String json;
	private transient Object tag;
	private transient int resultStatus ;

	@SerializedName("data")
	private T respObj ;

	@Override
	public boolean isSuccess(){
		return status == 1;
	}

	@Override
	public String getMessage() {
		return msg;
	}

	@Override
	public void setMessage(String message) {
		this.msg = message;
	}

	@Override
	public T getRespData() {
		return respObj;
	}

	@Override
	public String getJson() {
		return json;
	}

	@Override
	public Object getTag() {
		return tag;
	}

	public void setTag(Object tag) {
		this.tag = tag;
	}

	public void setJson(String json) {
		this.json = json;
	}

	@Override
	public int getResultStatus() {
		return resultStatus;
	}

	public void setResultStatus(int resultStatus) {
		this.resultStatus = resultStatus;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public void setRespObj(T respObj) {
		this.respObj = respObj;
	}
}
