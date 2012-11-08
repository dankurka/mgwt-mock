/*
 * Copyright 2012 Daniel Kurka
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

import com.googlecode.mgwt.collection.shared.LightArray;
import com.googlecode.mgwt.collection.shared.java.JavaLightArray;
import com.googlecode.mgwt.dom.client.event.touch.*;

public class MockTouchMoveEvent extends TouchMoveEvent {

	private final int x;
	private final int y;
	private final int id;

	public MockTouchMoveEvent(int id, int x, int y) {
		this.id = id;
		this.x = x;
		this.y = y;

	}

	@Override
	public LightArray<Touch> getTouches() {
		JavaLightArray<Touch> array = new JavaLightArray<Touch>();

		array.push(new MockTouch(id, x, y));

		return array;
	}

	/* (non-Javadoc)
	 * @see com.google.gwt.event.dom.client.DomEvent#stopPropagation()
	 */
	@Override
	public void stopPropagation() {
		//Todo: should we know, if this method was called?
	}

	/* (non-Javadoc)
	 * @see com.google.gwt.event.dom.client.DomEvent#preventDefault()
	 */
	@Override
	public void preventDefault() {
		//Todo: should we know, if this method was called?
	}
}
