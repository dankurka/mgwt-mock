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
import com.googlecode.mgwt.dom.client.event.animation.*;

/**
 * @author ckuetbach@googlemail.com
 * 
 */
public class MockHasAnimationEndEvent extends MockHasHandlers implements HasAnimationEndEvent {

	/* (non-Javadoc)
	 * @see com.googlecode.mgwt.dom.client.event.animation.HasAnimationEndEvent#addAnimationEndHandler(com.googlecode.mgwt.dom.client.event.animation.AnimationEndHandler)
	 */
	@Override
	public HandlerRegistration addAnimationEndHandler(AnimationEndHandler handler) {
		return eventBus.addHandler(MockAnimationEndEvent.getType(), handler);
	}

}
