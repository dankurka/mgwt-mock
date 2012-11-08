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

import com.googlecode.mgwt.dom.client.event.touch.Touch;

public class MockTouch implements Touch {

	private final int y;
	private final int x;

	private final int id;

	public MockTouch(int id, int x, int y) {
		this.id = id;
		this.x = x;
		this.y = y;

	}

	@Override
	public int getPageX() {
		return x;
	}

	@Override
	public int getPageY() {
		return y;
	}

	@Override
	public int getIdentifier() {
		return id;
	}

}
