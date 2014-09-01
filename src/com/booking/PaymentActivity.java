package com.booking;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PaymentActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.payment);
    }

    public void makePayment(View view) {
        Intent intent = new Intent();
        intent.putExtra("Extra", "use this intent");
        intent.setAction("com.booking.action.PAY");
        sendBroadcast(intent);
    }
}