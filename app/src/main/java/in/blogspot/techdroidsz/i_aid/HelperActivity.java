package in.blogspot.techdroidsz.i_aid;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.nearby.Nearby;
import com.google.android.gms.nearby.messages.Message;
import com.google.android.gms.nearby.messages.MessageListener;

public class HelperActivity extends AppCompatActivity {
    MessageListener mMessageListener;
    private static long back_pressed;

    @Override
    public void onBackPressed()
    {
        if (back_pressed + 2000 > System.currentTimeMillis()) finish();
        else Toast.makeText(getBaseContext(), "Press once again to exit!", Toast.LENGTH_SHORT).show();
        back_pressed = System.currentTimeMillis();
    }

    @Override
    public void onStart() {
        super.onStart();

        Nearby.getMessagesClient(this).subscribe(mMessageListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helper);


        mMessageListener = new MessageListener() {
            @Override
            public void onFound(Message message) {
                Toast.makeText(HelperActivity.this, new String(message.getContent()), Toast.LENGTH_SHORT).show();
                new AlertDialog.Builder(HelperActivity.this)
                        .setTitle(new String(message.getContent()))
                        .setMessage("Someone near you needs help")
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                // Continue with delete operation
                            }
                        })
                        .setNegativeButton(android.R.string.no, null)
                        .setIcon(android.R.drawable.ic_dialog_alert)
                        .show();
            }
            @Override
            public void onLost(Message message) {
            }
        };
    }


}
