
package com.googlecode.mgwtmock.client;

import com.google.gwt.event.shared.HandlerRegistration;
import com.googlecode.gwtmock.client.MockHasHandlers;
import com.googlecode.mgwt.ui.client.widget.celllist.*;

/**
 * @author ckuetbach@googlemail.com
 * 
 */
public class MockHasCellSelectedHandler extends MockHasHandlers implements HasCellSelectedHandler {

	/* (non-Javadoc)
	 * @see com.googlecode.mgwt.ui.client.widget.celllist.HasCellSelectedHandler#addCellSelectedHandler(com.googlecode.mgwt.ui.client.widget.celllist.CellSelectedHandler)
	 */
	@Override
	public HandlerRegistration addCellSelectedHandler(CellSelectedHandler cellSelectedHandler) {
		return eventBus.addHandler(CellSelectedEvent.getType(), cellSelectedHandler);
	}

}
