package in.blogspot.techdroidsz.i_aid;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.nearby.Nearby;
import com.google.android.gms.nearby.messages.Message;
import com.google.android.gms.nearby.messages.MessageListener;
import com.google.android.gms.nearby.messages.MessagesOptions;
import com.google.android.gms.nearby.messages.NearbyPermissions;

public class ReportActivity extends AppCompatActivity {
    MessageListener mMessageListener;
    Message mMessage;
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    @Override
    public void onStart() {
        super.onStart();
        Nearby.getMessagesClient(ReportActivity.this).publish(mMessage);
        Nearby.getMessagesClient(this).subscribe(mMessageListener);
    }

    @Override
    public void onStop() {
        Nearby.getMessagesClient(this).unpublish(mMessage);
        Nearby.getMessagesClient(this).unsubscribe(mMessageListener);
        super.onStop();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);
        b1=(Button) findViewById(R.id.b1);
        b2=(Button) findViewById(R.id.b2);
        b3=(Button) findViewById(R.id.b3);
        b4=(Button) findViewById(R.id.b4);

        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // your handler code here
                mMessage = new Message("EMERGENCY!!!".getBytes());
                mMessageListener = new MessageListener() {
                    @Override
                    public void onFound(Message message) {
                        Toast.makeText(ReportActivity.this, new String(message.getContent()), Toast.LENGTH_SHORT).show();
                        new AlertDialog.Builder(ReportActivity.this)
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
        });
        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // your handler code here
                mMessage = new Message("EMERGENCY!!!".getBytes());
                mMessageListener = new MessageListener() {
                    @Override
                    public void onFound(Message message) {
                        Toast.makeText(ReportActivity.this, new String(message.getContent()), Toast.LENGTH_SHORT).show();
                        new AlertDialog.Builder(ReportActivity.this)
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
        });
        b3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // your handler code here
                mMessage = new Message("EMERGENCY!!!".getBytes());
                mMessageListener = new MessageListener() {
                    @Override
                    public void onFound(Message message) {
                        Toast.makeText(ReportActivity.this, new String(message.getContent()), Toast.LENGTH_SHORT).show();
                        new AlertDialog.Builder(ReportActivity.this)
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
        });
        b4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // your handler code here
                mMessage = new Message("EMERGENCY!!!".getBytes());
                mMessageListener = new MessageListener() {
                    @Override
                    public void onFound(Message message) {
                        Toast.makeText(ReportActivity.this, new String(message.getContent()), Toast.LENGTH_SHORT).show();
                        new AlertDialog.Builder(ReportActivity.this)
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
        });
        /* mMessageListener = new MessageListener() {
            @Override
            public void onFound(Message message) {
                Toast.makeText(ReportActivity.this, new String(message.getContent()), Toast.LENGTH_SHORT).show();
                new AlertDialog.Builder(ReportActivity.this)
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
        */
    }
}
