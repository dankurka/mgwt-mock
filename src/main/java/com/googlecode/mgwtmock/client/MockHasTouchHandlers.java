/*
 * Copyright (c) by d.velop AG. All Rights Reserved.
 * 
 * Diese Datei ist eine vertrauliche und geschützte Information der d.velop AG.
 * Das Veröffentlichen und Nutzen dieser Informationen darf nur in Übereinstimmung
 * mit den Lizenzbestimmungen der d.velop AG geschehen.
 * 
 * This file is confidential and protected information of the d.velop AG. 
 * Publishing and use of this information may happen only according to the 
 * licence regulations of the d.velop AG.
 *
 * @(#)date of creation: 25.10.2012
 * @(#)time of creation: 09:51:16
 * @(#)user of creation: ckue
 * 
 * @(#)Subversion Infos
 *
 * $Id$
 * $HeadURL$
 * $LastChangedBy$
 * $LastChangedRevision$
 * $LastChangedDate$
 * $Author$
 *
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
