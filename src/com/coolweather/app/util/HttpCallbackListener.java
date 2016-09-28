package com.coolweather.app.util;

public interface HttpCallbackListener {
	//回调服务返回的结果。
	void onFinish(String response);
	void onError(Exception e);
}
