package in.paxtechnology.paxapp;

import android.content.Context;
import android.content.SharedPreferences;

import in.paxtechnology.paxapp.R;

public class PrefrenceManager {
    private Context context;
    private SharedPreferences sharedPreferences;
    public static final String my_prefrence = "MyPrefs" ;
    public static final String my_prefrence_key = "MyPrefskey" ;
    public PrefrenceManager(Context context){
        this.context = context;
        getSharedPrefrence();
    }

    private void getSharedPrefrence()
    {
        sharedPreferences = context.getSharedPreferences(my_prefrence,Context.MODE_PRIVATE);
    }

    public  void writePrefrence(){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(context.getString(R.string.my_prefrence_key),"INIT_OK");
        editor.commit();
    }

    public boolean checkPrefrence(){
        boolean status = false;
        if (sharedPreferences.getString(context.getString(R.string.my_prefrence_key),"null").equals("null")){
            status = false;
        }else {
            status = true;
        }
        return status;
    }

    public void clearPrefrence(){
        sharedPreferences.edit().clear().commit();
    }
}
