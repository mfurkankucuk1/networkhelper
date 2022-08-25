package com.example.internetconnectionhelper;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by M.Furkan KÜÇÜK on 25.08.2022
 **/
public class ToastMessage {
    public static void s(Context c, String message){

        Toast.makeText(c,message, Toast.LENGTH_SHORT).show();

    }
}
