package com.booking;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TicketBookingActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book);
    }

    public void bookTickets(View view) {
        Intent paymentIntent = new Intent(this, PaymentActivity.class);
        startActivity(paymentIntent);
    }
}
