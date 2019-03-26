package in.blogspot.techdroidsz.i_aid;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

import com.google.android.gms.nearby.Nearby;
import com.google.android.gms.nearby.messages.Message;
import com.google.android.gms.nearby.messages.MessageListener;

public class NearbyBackgroundService extends IntentService
{
    public NearbyBackgroundService(String name)
    {
        super(name);
    }
    @Override
    protected void onHandleIntent(Intent intent)
    {
        if (intent != null)
        {
            Nearby.Messages.handleIntent(intent, new   MessageListener()
            {
                @Override public void onFound(Message message)
                {

                }
                @Override public void onLost(Message message)
                {

                }
            });
        }
    }
}