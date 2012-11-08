package com.googlecode.mgwtmock.client;

import com.google.gwt.user.client.ui.Widget;
import com.googlecode.mgwt.ui.client.widget.base.PullArrowWidget;

public class MockPullArrowWidget implements PullArrowWidget{

	private String html;

	@Override
	public void onScroll(int positionY) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getStateSwitchPosition() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setHTML(String html) {
		this.html = html;
		
	}
	
	public String getHtml() {
		return html;
	}
	
	@Override
	public Widget asWidget() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void showArrow() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showLoadingIndicator() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showError() {
		// TODO Auto-generated method stub
		
	}

}
