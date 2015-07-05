package com.booking;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import android.view.View;
import android.widget.Toast;


public class PaymentActivity extends Activity {
    private final static String PAYMENT_ACTION = "com.booking.action.PAY";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.payment);
        LocalBroadcastManager.getInstance(this).registerReceiver(userDefinedBroadcastReceiver, new IntentFilter(PAYMENT_ACTION));
        registerReceiver(userDefinedBroadcastReceiver, new IntentFilter(PAYMENT_ACTION));

    }

    public void makePayment(View view) {
        Intent intent = new Intent();
        intent.setAction(PAYMENT_ACTION);
        LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(this);
        localBroadcastManager.sendBroadcast(intent);
    }

    private BroadcastReceiver userDefinedBroadcastReceiver = new BroadcastReceiver() {

        public void onReceive(Context context, Intent intent) {
            Toast.makeText(context, "You are in the same app...SAFE!!!", Toast.LENGTH_LONG).show();
        }
    };
}