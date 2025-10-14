package com.blackhub.bronline.launcher.network;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import androidx.browser.trusted.NotificationApiHelperForO$$ExternalSyntheticApiModelOutline4;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import androidx.core.internal.view.SupportMenu;
import androidx.media3.common.util.NotificationUtil$$ExternalSyntheticApiModelOutline1;
import com.blackhub.bronline.launcher.LauncherConstants;
import com.blackhub.bronline.launcher.activities.MainActivity;
import com.bless.client.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: MyFirebaseMessagingService.kt */
@StabilityInferred(parameters = 1)
/* loaded from: classes6.dex */
public final class MyFirebaseMessagingService extends FirebaseMessagingService {
    public static final int $stable = 0;

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(@NotNull String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        super.onNewToken(token);
        Log.d("FirebaseMessaging", token);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(@NotNull RemoteMessage remoteMessage) {
        Intrinsics.checkNotNullParameter(remoteMessage, "remoteMessage");
        super.onMessageReceived(remoteMessage);
        Log.d("FirebaseMessaging", "onMessageReceived");
        Intrinsics.checkNotNullExpressionValue(remoteMessage.getData(), "getData(...)");
        if (!r0.isEmpty()) {
            Log.d("FirebaseMessaging", "Message Notification Body: " + remoteMessage.getData());
            sendNotification(remoteMessage);
        }
    }

    public final void sendNotification(RemoteMessage remoteMessage) {
        Map<String, String> data = remoteMessage.getData();
        Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
        Intent intent = new Intent(this, (Class<?>) MainActivity.class);
        intent.addFlags(67108864);
        if (data.containsKey("id")) {
            intent.putExtra("id", data.get("id"));
            FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(getApplicationContext());
            Intrinsics.checkNotNullExpressionValue(firebaseAnalytics, "getInstance(...)");
            Bundle bundle = new Bundle();
            bundle.putString("get", data.get("id"));
            firebaseAnalytics.logEvent(LauncherConstants.PUSH, bundle);
        }
        PendingIntent activity = PendingIntent.getActivity(this, 0, intent, 1073741824);
        String string = getString(R.string.default_notification_channel_id);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        NotificationCompat.Builder autoCancel = new NotificationCompat.Builder(this, string).setSmallIcon(R.drawable.img_logo_br_small).setContentTitle(data.get("title")).setContentText(data.get("text")).setAutoCancel(true);
        Uri uri = Settings.System.DEFAULT_NOTIFICATION_URI;
        NotificationCompat.Builder contentIntent = autoCancel.setSound(uri).setContentIntent(activity);
        Intrinsics.checkNotNullExpressionValue(contentIntent, "setContentIntent(...)");
        if (data.containsKey("id")) {
            Context applicationContext = getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            contentIntent.setDeleteIntent(createOnDismissedIntent(applicationContext, data.get("id")));
        }
        String str = data.get("image");
        if (str == null || str.length() == 0) {
            contentIntent.setLargeIcon(BitmapFactory.decodeResource(getResources(), R.drawable.img_logo_br_big));
        } else {
            contentIntent.setLargeIcon(getBitmapFromURL(str));
        }
        Object systemService = getSystemService("notification");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationUtil$$ExternalSyntheticApiModelOutline1.m646m();
            NotificationChannel notificationChannelM28m = NotificationApiHelperForO$$ExternalSyntheticApiModelOutline4.m28m(string, string, 4);
            AudioAttributes audioAttributesBuild = new AudioAttributes.Builder().setUsage(5).setContentType(1).build();
            notificationChannelM28m.setDescription("Новое сообщение");
            notificationChannelM28m.enableLights(true);
            notificationChannelM28m.setLightColor(SupportMenu.CATEGORY_MASK);
            notificationChannelM28m.enableVibration(true);
            notificationChannelM28m.setSound(uri, audioAttributesBuild);
            notificationManager.createNotificationChannel(notificationChannelM28m);
        }
        notificationManager.notify(0, contentIntent.build());
    }

    public final Bitmap getBitmapFromURL(String src) throws IOException {
        try {
            URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(src).openConnection());
            Intrinsics.checkNotNull(uRLConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
            httpURLConnection.setDoInput(true);
            httpURLConnection.connect();
            return BitmapFactory.decodeStream(httpURLConnection.getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
            FirebaseCrashlytics.getInstance().log(e.toString());
            return null;
        }
    }

    public final PendingIntent createOnDismissedIntent(Context context, String id) {
        Intent intent = new Intent(context, (Class<?>) NotificationDismissedReceiver.class);
        intent.putExtra("id", id);
        return PendingIntent.getBroadcast(context.getApplicationContext(), 0, intent, 0);
    }
}

