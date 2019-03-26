package in.blogspot.techdroidsz.i_aid;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;

/**
 * Created by Abhishek on 27-02-2019.
 */

public class helpWidget extends AppWidgetProvider {
    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        for(int appWidgetId : appWidgetIds){
            Intent intent=new Intent(context,ReportActivity.class);
            PendingIntent pendingIntent= PendingIntent.getActivity(context,0,intent,0);

            RemoteViews views = new RemoteViews(context.getPackageName(),R.layout.help_widget);
            views.setOnClickPendingIntent(R.id.report_btn,pendingIntent);

            appWidgetManager.updateAppWidget(appWidgetId,views);
        }
    }
}
