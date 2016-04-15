package rmutr.boonsathain.wanwisa.ncs1;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.Spinner;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class AddBoat extends AppCompatActivity {

    //Expltcit
    private EditText data2EditText, data3EditText, data4EditText,
            data5EditText, data6EditText, data7EditText, data8EditText,
            data9EditText, data10EditText, data11EditText, data12EditText,
            data13EditText, data14EditText, data15EditText;

    private String data2String, data3String, data4String,
            data5String, data6String, data7String, data8String,
            data9String, data10String, data11String, data12String,
            data13String, data14String, data15String, data16String;

    private Spinner spinner;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_boat);

        //Bind Widget
        bindWidget();

        //Create Spinner
        createSpinner();


        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }   //main

    private void createSpinner() {



    }   //createspinner

    private void bindWidget() {

        data2EditText = (EditText) findViewById(R.id.editText3);
        data3EditText = (EditText) findViewById(R.id.editText4);
        data4EditText = (EditText) findViewById(R.id.editText5);
        data5EditText = (EditText) findViewById(R.id.editText6);
        data6EditText = (EditText) findViewById(R.id.editText7);
        data7EditText = (EditText) findViewById(R.id.editText8);
        data8EditText = (EditText) findViewById(R.id.editText9);
        data9EditText = (EditText) findViewById(R.id.editText10);
        data10EditText = (EditText) findViewById(R.id.editText11);
        data11EditText = (EditText) findViewById(R.id.editText12);
        data12EditText = (EditText) findViewById(R.id.editText13);
        data13EditText = (EditText) findViewById(R.id.editText14);
        data14EditText = (EditText) findViewById(R.id.editText15);
        data15EditText = (EditText) findViewById(R.id.editText16);
        spinner = (Spinner) findViewById(R.id.spinner);

    }   //bindWidget

    public void clickSaveAddboat(View view) {

        data2String = data2EditText.getText().toString().trim();
        data3String = data3EditText.getText().toString().trim();
        data4String = data4EditText.getText().toString().trim();
        data5String = data5EditText.getText().toString().trim();
        data6String = data6EditText.getText().toString().trim();
        data7String = data7EditText.getText().toString().trim();
        data8String = data8EditText.getText().toString().trim();
        data9String = data9EditText.getText().toString().trim();
        data10String = data10EditText.getText().toString().trim();
        data11String = data11EditText.getText().toString().trim();
        data12String = data12EditText.getText().toString().trim();
        data13String = data13EditText.getText().toString().trim();
        data14String = data14EditText.getText().toString().trim();
        data15String = data15EditText.getText().toString().trim();

        //  Chack space
        if (checkSpace()) {
            //Have Space
            MyAlert myAlert = new MyAlert();
            myAlert.myDialog(this, "ข้อความมีช่องว่าง","กรุณากรอกให้ครบ ทุกช่อง");
        } else {
            //No space
        }


    }   //clickSave

    private boolean checkSpace() {

        boolean bolStatus = true;

        bolStatus = data2String.equals("") ||
                data3String.equals("") ||
                data4String.equals("") ||
                data5String.equals("") ||
                data6String.equals("") ||
                data7String.equals("") ||
                data8String.equals("") ||
                data9String.equals("") ||
                data10String.equals("") ||
                data11String.equals("") ||
                data12String.equals("") ||
                data13String.equals("") ||
                data14String.equals("") ||
                data15String.equals("") ;

        return bolStatus;

    }

    public void clickEditAddboat(View view) {

    }

    public void clickDeleteAddboat(View view) {

    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "AddBoat Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://rmutr.boonsathain.wanwisa.ncs1/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "AddBoat Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://rmutr.boonsathain.wanwisa.ncs1/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}   //main class
