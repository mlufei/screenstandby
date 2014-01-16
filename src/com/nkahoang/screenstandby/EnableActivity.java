/*******************************************************************************
 * Copyright (c) 2014 Hoang Nguyen.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/old-licenses/gpl-2.0.html
 * 
 * Contributors:
 *     Hoang Nguyen - initial API and implementation
 ******************************************************************************/
package com.nkahoang.screenstandby;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;

public class EnableActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Intent serviceIntent = new Intent();
		serviceIntent.setAction(StandbyService.ENABLE_INTENT);
        sendBroadcast(serviceIntent);
        finish();
	}

}
