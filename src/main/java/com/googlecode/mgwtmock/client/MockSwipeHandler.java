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
import com.googlecode.gwtmock.client.MockHasHandlers;
import com.googlecode.mgwt.dom.client.recognizer.swipe.*;

/**
 * @author ckuetbach@googlemail.com
 * 
 */
public class MockSwipeHandler extends MockHasHandlers implements HasSwipeHandlers {

	/* (non-Javadoc)
	 * @see com.googlecode.mgwt.dom.client.recognizer.swipe.HasSwipeHandlers#addSwipeStartHandler(com.googlecode.mgwt.dom.client.recognizer.swipe.SwipeStartHandler)
	 */
	@Override
	public HandlerRegistration addSwipeStartHandler(SwipeStartHandler handler) {
		return eventBus.addHandler(SwipeStartEvent.getType(), handler);
	}

	/* (non-Javadoc)
	 * @see com.googlecode.mgwt.dom.client.recognizer.swipe.HasSwipeHandlers#addSwipeMoveHandler(com.googlecode.mgwt.dom.client.recognizer.swipe.SwipeMoveHandler)
	 */
	@Override
	public HandlerRegistration addSwipeMoveHandler(SwipeMoveHandler handler) {
		return eventBus.addHandler(SwipeMoveEvent.getType(), handler);
	}

	/* (non-Javadoc)
	 * @see com.googlecode.mgwt.dom.client.recognizer.swipe.HasSwipeHandlers#addSwipeEndHandler(com.googlecode.mgwt.dom.client.recognizer.swipe.SwipeEndHandler)
	 */
	@Override
	public HandlerRegistration addSwipeEndHandler(SwipeEndHandler handler) {
		return eventBus.addHandler(SwipeEndEvent.getType(), handler);
	}



}
