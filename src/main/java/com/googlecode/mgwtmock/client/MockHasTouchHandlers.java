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
import com.googlecode.mgwt.dom.client.event.mouse.HandlerRegistrationCollection;
import com.googlecode.mgwt.dom.client.event.touch.*;

/**
 * @author ckue
 *
 */
public class MockHasTouchHandlers extends MockHasHandlers implements HasTouchHandlers {


	/* (non-Javadoc)
	 * @see com.googlecode.mgwt.dom.client.event.touch.HasTouchHandlers#addTouchStartHandler(com.googlecode.mgwt.dom.client.event.touch.TouchStartHandler)
	 */
	@Override
	public HandlerRegistration addTouchStartHandler(TouchStartHandler handler) {
		return eventBus.addHandler(TouchStartEvent.getType(), handler);
	}

	/* (non-Javadoc)
	 * @see com.googlecode.mgwt.dom.client.event.touch.HasTouchHandlers#addTouchMoveHandler(com.googlecode.mgwt.dom.client.event.touch.TouchMoveHandler)
	 */
	@Override
	public HandlerRegistration addTouchMoveHandler(TouchMoveHandler handler) {
		return eventBus.addHandler(TouchMoveEvent.getType(), handler);
	}

	/* (non-Javadoc)
	 * @see com.googlecode.mgwt.dom.client.event.touch.HasTouchHandlers#addTouchCancelHandler(com.googlecode.mgwt.dom.client.event.touch.TouchCancelHandler)
	 */
	@Override
	public HandlerRegistration addTouchCancelHandler(TouchCancelHandler handler) {
		return eventBus.addHandler(TouchCancelEvent.getType(), handler);
	}

	/* (non-Javadoc)
	 * @see com.googlecode.mgwt.dom.client.event.touch.HasTouchHandlers#addTouchEndHandler(com.googlecode.mgwt.dom.client.event.touch.TouchEndHandler)
	 */
	@Override
	public HandlerRegistration addTouchEndHandler(TouchEndHandler handler) {
		return eventBus.addHandler(TouchEndEvent.getType(), handler);
	}

	/* (non-Javadoc)
	 * @see com.googlecode.mgwt.dom.client.event.touch.HasTouchHandlers#addTouchHandler(com.googlecode.mgwt.dom.client.event.touch.TouchHandler)
	 */
	@Override
	public HandlerRegistration addTouchHandler(TouchHandler handler) {
		HandlerRegistrationCollection handlerRegistrationCollection = new HandlerRegistrationCollection();

		handlerRegistrationCollection.addHandlerRegistration(addTouchCancelHandler(handler));
		handlerRegistrationCollection.addHandlerRegistration(addTouchStartHandler(handler));
		handlerRegistrationCollection.addHandlerRegistration(addTouchEndHandler(handler));
		handlerRegistrationCollection.addHandlerRegistration(addTouchMoveHandler(handler));

		return handlerRegistrationCollection;
	}

}
