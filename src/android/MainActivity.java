/*
       Licensed to the Apache Software Foundation (ASF) under one
       or more contributor license agreements.  See the NOTICE file
       distributed with this work for additional information
       regarding copyright ownership.  The ASF licenses this file
       to you under the Apache License, Version 2.0 (the
       "License"); you may not use this file except in compliance
       with the License.  You may obtain a copy of the License at

         http://www.apache.org/licenses/LICENSE-2.0

       Unless required by applicable law or agreed to in writing,
       software distributed under the License is distributed on an
       "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
       KIND, either express or implied.  See the License for the
       specific language governing permissions and limitations
       under the License.
 */

package app.hdfcquicklogin;

import android.content.Intent;
import android.os.Bundle;

import org.apache.cordova.*;

public class MainActivity extends CordovaActivity {
  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    // enable Cordova apps to be started in the background
    Bundle extras = getIntent().getExtras();
    if (extras != null && extras.getBoolean("cdvStartInBackground", false)) {
      moveTaskToBack(true);
    }
    try {
      if (extras != null && extras.getString("lead_no")!=null) {
        Utility.setLead_no(this, extras.getString("lead_no"));
        Utility.setAgency(this, extras.getString("agency"));
        Utility.setEmp_no(this, extras.getString("emp_no"));
        System.out.println("lead_no " + extras.getString("lead_no"));
        System.out.println("agency " + extras.getString("agency"));
        System.out.println("emp_no " + extras.getString("emp_no"));

        Utility.setDeeplink(this, true);
      } else {
        Utility.setDeeplink(this, false);
      }
    } catch (Exception e) {
      Utility.setDeeplink(this, false);

    }
    // Set by <content src="index.html" /> in config.xml
    loadUrl(launchUrl);


  }
}
