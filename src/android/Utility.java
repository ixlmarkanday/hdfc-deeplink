package app.hdfcquicklogin;

import android.content.Context;
import android.content.SharedPreferences;



public class Utility {

    private static final String name = "HDFC_QuickLogin";

    public static void setLead_no(Context context, String lead_no) {
        SharedPreferences pref;
        SharedPreferences.Editor lock_editor;
        pref = context.getSharedPreferences(name, Context.MODE_PRIVATE);
        lock_editor = pref.edit();
        lock_editor.putString("lead_no", lead_no);

        lock_editor.commit();
    }

    public static String getLead_no(Context context) {
        SharedPreferences pref = null;
        pref = context.getSharedPreferences(name, context.MODE_PRIVATE);
        return pref.getString("lead_no", "");
    }

    public static void setAgency(Context context, String agency) {
        SharedPreferences pref;
        SharedPreferences.Editor lock_editor;
        pref = context.getSharedPreferences(name, Context.MODE_PRIVATE);
        lock_editor = pref.edit();
        lock_editor.putString("agency", agency);
        lock_editor.commit();
    }

    public static String getAgency(Context context) {
        SharedPreferences pref = null;
        pref = context.getSharedPreferences(name, context.MODE_PRIVATE);
        return pref.getString("agency", "");

    }

    public static void setEmp_no(Context context, String emp_no) {
        SharedPreferences pref;
        SharedPreferences.Editor lock_editor;
        pref = context.getSharedPreferences(name, Context.MODE_PRIVATE);
        lock_editor = pref.edit();
        lock_editor.putString("emp_no", emp_no);
        lock_editor.commit();
    }

    public static String getEmp_no(Context context) {
        SharedPreferences pref = null;
        pref = context.getSharedPreferences(name, context.MODE_PRIVATE);
        return pref.getString("emp_no", "");

    }

    public static void setDeeplink(Context context, boolean status) {
        SharedPreferences pref;
        SharedPreferences.Editor lock_editor;
        pref = context.getSharedPreferences(name, Context.MODE_PRIVATE);
        lock_editor = pref.edit();
        lock_editor.putBoolean("Deeplink", status);
        lock_editor.commit();
    }

    public static boolean getDeeplink(Context context) {
        SharedPreferences pref = null;
        pref = context.getSharedPreferences(name, context.MODE_PRIVATE);
        return pref.getBoolean("Deeplink", false);

    }
}
