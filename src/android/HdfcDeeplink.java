package com.hdfcdeeplink;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * This class echoes a string called from JavaScript.
 */
public class HdfcDeeplink extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("coolMethod")) {
            String message = args.getString(0);
            this.coolMethod(message, callbackContext);
            return true;
        }
        return false;
    }

    /* private void coolMethod(String message, CallbackContext callbackContext) {
        if (message != null && message.length() > 0) {
            callbackContext.success(message);
        } else {
            callbackContext.error("Expected one non-empty string argument.");
        }
    } */

    private void coolMethod(String message, CallbackContext callbackContext) {
          System.out.println("Utility.getDeeplink(cordova.getContext()) "+Utility.getDeeplink(cordova.getContext()));
            if (Utility.getDeeplink(cordova.getContext())) {
              JSONObject jsonObject=new JSONObject();
              try {
                jsonObject.put("lead_no", Utility.getLead_no(cordova.getContext()));
                jsonObject.put("agency", Utility.getAgency(cordova.getContext()));
                jsonObject.put("emp_no", Utility.getEmp_no(cordova.getContext()));
              }catch (Exception e)
              {

              }
              Utility.setDeeplink(cordova.getContext(),false);
                callbackContext.success(jsonObject.toString());
            } else {
                callbackContext.error("Expected one non-empty string argument.");
            }
        }
}
