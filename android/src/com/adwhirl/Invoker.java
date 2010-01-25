/*
 Copyright 2009 AdMob, Inc.
 
    Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at
 
  http://www.apache.org/licenses/LICENSE-2.0
 
 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
*/

package com.adwhirl;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class Invoker extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.main);
        LinearLayout layout = (LinearLayout)findViewById(R.id.layout_main);
        
        if(layout == null) {
        	Log.e("AdWhirl", "Layout is null!");
        	return;
        }
        
        AdWhirlLayout adWhirlLayout = new AdWhirlLayout(this, "123456789abcdefAdWhirlSDKKeyHere");
        RelativeLayout.LayoutParams adWhirlLayoutParams = new RelativeLayout.LayoutParams(320, 52);
        layout.addView(adWhirlLayout, adWhirlLayoutParams);
        layout.invalidate();
    }
}