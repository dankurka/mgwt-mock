/*
 * Copyright 2012 Christian Kuetbach ckuetbach@gmail.com
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.googlecode.mgwtmock.client;

import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.ui.Widget;
import com.googlecode.mgwt.dom.client.event.tap.*;
import com.googlecode.mgwt.dom.client.recognizer.longtap.*;
import com.googlecode.mgwt.dom.client.recognizer.pinch.*;
import com.googlecode.mgwt.dom.client.recognizer.swipe.*;
import com.googlecode.mgwt.ui.client.widget.touch.TouchDelegate;

/**
 * @author ckue
 *
 */
public class MockTouchDelegate extends TouchDelegate implements HasTapHandlers, HasSwipeHandlers, HasPinchHandlers, HasLongTapHandlers {


	/**
	 * @param w
	 */
	public MockTouchDelegate(Widget w) {
		super(w);
	}

	MockHasTapHandlers tap = new MockHasTapHandlers();
	MockLongTapHandler longTap = new MockLongTapHandler();
	MockPinchHandler pinchHandler = new MockPinchHandler();
	MockSwipeHandler swipe = new MockSwipeHandler();
	/* (non-Javadoc)
	 * @see com.googlecode.mgwt.dom.client.recognizer.longtap.HasLongTapHandlers#addLongTapHandler(com.googlecode.mgwt.dom.client.recognizer.longtap.LongTapHandler)
	 */
	@Override
	public HandlerRegistration addLongTapHandler(LongTapHandler handler) {
		return longTap.addLongTapHandler(handler);
	}

	/* (non-Javadoc)
	 * @see com.googlecode.mgwt.dom.client.recognizer.pinch.HasPinchHandlers#addPinchHandler(com.googlecode.mgwt.dom.client.recognizer.pinch.PinchHandler)
	 */
	@Override
	public HandlerRegistration addPinchHandler(PinchHandler handler) {
		return pinchHandler.addPinchHandler(handler);
	}

	/* (non-Javadoc)
	 * @see com.googlecode.mgwt.dom.client.recognizer.swipe.HasSwipeHandlers#addSwipeStartHandler(com.googlecode.mgwt.dom.client.recognizer.swipe.SwipeStartHandler)
	 */
	@Override
	public HandlerRegistration addSwipeStartHandler(SwipeStartHandler handler) {
		return swipe.addSwipeStartHandler(handler);
	}

	/* (non-Javadoc)
	 * @see com.googlecode.mgwt.dom.client.recognizer.swipe.HasSwipeHandlers#addSwipeMoveHandler(com.googlecode.mgwt.dom.client.recognizer.swipe.SwipeMoveHandler)
	 */
	@Override
	public HandlerRegistration addSwipeMoveHandler(SwipeMoveHandler handler) {
		return swipe.addSwipeMoveHandler(handler);
	}

	/* (non-Javadoc)
	 * @see com.googlecode.mgwt.dom.client.recognizer.swipe.HasSwipeHandlers#addSwipeEndHandler(com.googlecode.mgwt.dom.client.recognizer.swipe.SwipeEndHandler)
	 */
	@Override
	public HandlerRegistration addSwipeEndHandler(SwipeEndHandler handler) {
		return swipe.addSwipeEndHandler(handler);
	}

	/* (non-Javadoc)
	 * @see com.googlecode.mgwt.dom.client.event.tap.HasTapHandlers#addTapHandler(com.googlecode.mgwt.dom.client.event.tap.TapHandler)
	 */
	@Override
	public HandlerRegistration addTapHandler(TapHandler handler) {
		return tap.addTapHandler(handler);
	}

}
