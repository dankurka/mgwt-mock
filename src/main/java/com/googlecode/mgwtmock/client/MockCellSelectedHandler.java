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
 * @(#)date of creation: 22.10.2012
 * @(#)time of creation: 12:10:16
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
import com.googlecode.mgwt.ui.client.widget.celllist.*;

/**
 * @author ckue
 *
 */
public class MockCellSelectedHandler extends MockHasHandlers implements HasCellSelectedHandler {

	/* (non-Javadoc)
	 * @see com.googlecode.mgwt.ui.client.widget.celllist.HasCellSelectedHandler#addCellSelectedHandler(com.googlecode.mgwt.ui.client.widget.celllist.CellSelectedHandler)
	 */
	@Override
	public HandlerRegistration addCellSelectedHandler(CellSelectedHandler cellSelectedHandler) {
		return eventBus.addHandler(CellSelectedEvent.getType(), cellSelectedHandler);
	}

}
