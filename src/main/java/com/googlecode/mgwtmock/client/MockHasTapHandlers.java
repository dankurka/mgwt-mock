
package com.googlecode.mgwtmock.client;

import com.google.gwt.event.shared.HandlerRegistration;
import com.googlecode.gwtmock.client.MockHasHandlers;
import com.googlecode.mgwt.dom.client.event.tap.HasTapHandlers;
import com.googlecode.mgwt.dom.client.event.tap.TapEvent;
import com.googlecode.mgwt.dom.client.event.tap.TapHandler;

/**
 * @author ckuetbach@googlemail.com
 * 
 */
public class MockHasTapHandlers extends MockHasHandlers implements HasTapHandlers {

	/* (non-Javadoc)
	 * @see com.googlecode.mgwt.dom.client.event.tap.HasTapHandlers#addTapHandler(com.googlecode.mgwt.dom.client.event.tap.TapHandler)
	 */
	@Override
	public HandlerRegistration addTapHandler(TapHandler handler) {
		return eventBus.addHandler(TapEvent.getType(), handler);
	}

}
