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

import com.googlecode.mgwt.ui.client.OsDetection;

/**
 * @author ckue
 *
 */
public class MockOsDetection {
	
	public static final OsDetection ANDROID_TABLET = new VirtualDevice(false, true, false, true, false);
	public static final OsDetection ANDROID = new VirtualDevice(false, true, false, false, false);
	public static final OsDetection IPAD = new VirtualDevice(true, false, false, true, false);
	public static final OsDetection IPAD_RETINA = new VirtualDevice(true, false, false, true, true);
	public static final OsDetection IPHONE = new VirtualDevice(true, false, false, false, false);
	public static final OsDetection IPHONE_RETINA = new VirtualDevice(true, false, false, false, true);
	
	private static class VirtualDevice implements OsDetection {

		private boolean android;
		private boolean tablet;
		private boolean ios;
		private boolean retina;
		private boolean blackberry;

		private VirtualDevice(boolean ios, boolean android, boolean blackberry, boolean tablet, boolean retina) {
			super();
			this.ios = ios;
			this.android = android;
			this.blackberry = blackberry;
			this.tablet = tablet;
			this.retina = retina;
		}

		/* (non-Javadoc)
		 * @see com.googlecode.mgwt.ui.client.OsDetection#isAndroid()
		 */
		@Override
		public boolean isAndroid() {
			return android;
		}

		/* (non-Javadoc)
		 * @see com.googlecode.mgwt.ui.client.OsDetection#isIPhone()
		 */
		@Override
		public boolean isIPhone() {
			return !tablet;
		}

		/* (non-Javadoc)
		 * @see com.googlecode.mgwt.ui.client.OsDetection#isIPad()
		 */
		@Override
		public boolean isIPad() {
			return ios && tablet;
		}

		/* (non-Javadoc)
		 * @see com.googlecode.mgwt.ui.client.OsDetection#isIOs()
		 */
		@Override
		public boolean isIOs() {

			return ios;
		}

		/* (non-Javadoc)
		 * @see com.googlecode.mgwt.ui.client.OsDetection#isRetina()
		 */
		@Override
		public boolean isRetina() {
			return retina;
		}

		/* (non-Javadoc)
		 * @see com.googlecode.mgwt.ui.client.OsDetection#isIPadRetina()
		 */
		@Override
		public boolean isIPadRetina() {

			return isIPad() && isRetina();
		}

		/* (non-Javadoc)
		 * @see com.googlecode.mgwt.ui.client.OsDetection#isDesktop()
		 */
		@Override
		public boolean isDesktop() {
			return !(isAndroid() || isIOs() || isBlackBerry());
		}

		/* (non-Javadoc)
		 * @see com.googlecode.mgwt.ui.client.OsDetection#isTablet()
		 */
		@Override
		public boolean isTablet() {
			return tablet;
		}

		/* (non-Javadoc)
		 * @see com.googlecode.mgwt.ui.client.OsDetection#isAndroidTablet()
		 */
		@Override
		public boolean isAndroidTablet() {
			return android && isTablet();
		}

		/* (non-Javadoc)
		 * @see com.googlecode.mgwt.ui.client.OsDetection#isAndroidPhone()
		 */
		@Override
		public boolean isAndroidPhone() {
			return android && isPhone();
		}

		/* (non-Javadoc)
		 * @see com.googlecode.mgwt.ui.client.OsDetection#isPhone()
		 */
		@Override
		public boolean isPhone() {
			return !isTablet();
		}

		/* (non-Javadoc)
		 * @see com.googlecode.mgwt.ui.client.OsDetection#isBlackBerry()
		 */
		@Override
		public boolean isBlackBerry() {
			return blackberry;
		}

	}


	
}
