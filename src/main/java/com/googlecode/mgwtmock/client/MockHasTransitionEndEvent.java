
package com.googlecode.mgwtmock.client;

import com.google.gwt.event.shared.HandlerRegistration;
import com.googlecode.gwtmock.client.MockHasHandlers;
import com.googlecode.mgwt.dom.client.event.animation.*;

/**
 * @author ckuetbach@googlemail.com
 * 
 */
public class MockHasTransitionEndEvent extends MockHasHandlers implements HasTransitionEndEvent {

	/* (non-Javadoc)
	 * @see com.googlecode.mgwt.dom.client.event.animation.HasAnimationEndEvent#addAnimationEndHandler(com.googlecode.mgwt.dom.client.event.animation.AnimationEndHandler)
	 */
	@Override
	public HandlerRegistration addTransitionEndHandler(TransitionEndHandler handler) {
		return eventBus.addHandler(MockTransitionEndEvent.getType(), handler);
	}

}
