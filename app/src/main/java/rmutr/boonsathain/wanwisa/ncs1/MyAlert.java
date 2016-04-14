package rmutr.boonsathain.wanwisa.ncs1;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/**
 * Created by wanwisa on 4/14/16 AD.
 */
public class MyAlert {

    public void myDialog(Context context,
                         String strTitle,
                         String StrMessage) {

        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setCancelable(false);
        builder.setIcon(R.drawable.icon_question);
        builder.setTitle(strTitle);
        builder.setMessage(StrMessage);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int which) {
                dialogInterface.dismiss();
            }   // onClick
        });
        builder.show();

    }   //myDialog

}   //Main Class
