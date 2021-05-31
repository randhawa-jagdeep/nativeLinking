package org.apache.cordova.nativeLinking;

import android.content.Context;
import android.content.Intent;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import io.oracle.delivery.LoggerActivity;

/**
 * This class echoes a string called from JavaScript.
 */
public class NativeLinking extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
         Context context = cordova.getActivity().getApplicationContext();
        if(action.equals("new_activity")) {
            this.openNewActivity(context);
            return true;
        }
      
        return false;
    }

     private void openNewActivity(Context context) {
      
    }
}
