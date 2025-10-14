package com.blackhub.bronline.game.core;

import android.app.AlertDialog;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.media.MediaPlayer;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.PowerManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.Toast;
import androidx.activity.OnBackPressedCallback;
import androidx.annotation.NonNull;
import androidx.annotation.RawRes;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.app.ActivityCompat;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.blackhub.bronline.common.MarketAnalytic;
import com.blackhub.bronline.game.GUIManager;
import com.blackhub.bronline.game.common.composemanager.ComposableProvider;
import com.blackhub.bronline.game.common.composemanager.ComposeViewManager;
import com.blackhub.bronline.game.core.constants.LinksConstants;
import com.blackhub.bronline.game.core.preferences.Preferences;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel;
import com.blackhub.bronline.game.fingerprint.FingerprintApi;
import com.blackhub.bronline.game.gui.chooseserver.model.YoutuberAcc;
import com.blackhub.bronline.game.gui.menupausesettingandmap.NewMenuConstants;
import com.blackhub.bronline.game.p019ui.widget.utils.StampReleaseKt;
import com.blackhub.bronline.launcher.App;
import com.blackhub.bronline.launcher.network.Server;
import com.blackhub.bronline.launcher.viewmodel.MainViewModelFactory;
import com.bless.client.R;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import javax.inject.Inject;
import kotlin.Pair;
import kotlin.Unit;
import org.apache.ivy.osgi.core.BundleInfo;
import org.json.JSONException;
import org.json.JSONObject;
import ru.rustore.sdk.core.tasks.OnFailureListener;
import ru.rustore.sdk.core.tasks.OnSuccessListener;

/* loaded from: classes7.dex */
public class JNIActivity extends AppCompatActivity {
    public static boolean isCustomTabOpened;
    public static boolean isInited;
    public static JNIActivity mContext;
    public static JNIActivityViewModel mainViewModel;
    public Handler mNetworkHandler;
    public Bundle mainBundle;

    @Inject
    public MainViewModelFactory<JNIActivityViewModel> viewModelFactory;
    public JNIGLSurfaceView mGLSurfaceView = null;
    public FrameLayout mRootView = null;
    public EditText mEditText = null;
    public boolean paused = false;
    public boolean hasFocus = false;
    public FingerprintApi Fapi = null;
    public boolean isSupportFingerPrint = false;
    public MediaPlayer mediaPlayer = null;
    public boolean isFocused = false;

    public static /* synthetic */ void lambda$setObservers$2(Unit unit) {
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    @RequiresApi(api = 23)
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == 1) {
            if (grantResults.length <= 0 || grantResults[0] != 0) {
                if (!shouldShowRequestPermissionRationale("android.permission.WRITE_EXTERNAL_STORAGE")) {
                    alertViewStorage("Без этого разрешения вы не сможете говорить в голосовой чат. Желаете перейти в настройки системы и выдать разрешение?");
                } else {
                    alertViewStorage("Без этого разрешения вы не сможете говорить в голосовой чат. Повторить попытку выдачи разрешения?");
                }
                Toast.makeText(this, "Разрешение на доступ к микрофону отклонено", Toast.LENGTH_SHORT).show();
                return;
            }
            return;
        }
        if (requestCode == 100500 && grantResults.length > 0 && grantResults[0] == 0) {
            isFingerprintSupported();
        }
    }

    @RequiresApi(api = 23)
    public final void alertViewStorage(String message) {
        new AlertDialog.Builder(this, R.style.MyTheme).setTitle("Доступ запрещен").setInverseBackgroundForced(true).setMessage(message).setNegativeButton("Да", new DialogInterface.OnClickListener() { // from class: com.blackhub.bronline.game.core.JNIActivity.2
            public void DialogInterfaceOnClickListenerC35112() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialoginterface, int i) {
                dialoginterface.dismiss();
                if (!JNIActivity.this.shouldShowRequestPermissionRationale("android.permission.WRITE_EXTERNAL_STORAGE")) {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.fromParts(BundleInfo.PACKAGE_TYPE, JNIActivity.this.getPackageName(), null));
                    JNIActivity.this.startActivity(intent);
                    return;
                }
                JNIActivity.this.isRecordAudioPermissionGranted();
            }
        }).setPositiveButton("Нет", new DialogInterface.OnClickListener() { // from class: com.blackhub.bronline.game.core.JNIActivity.1
            public void DialogInterfaceOnClickListenerC35101() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialoginterface, int i) {
                dialoginterface.dismiss();
            }
        }).show();
    }

    /* renamed from: com.blackhub.bronline.game.core.JNIActivity$2 */

    public class DialogInterfaceOnClickListenerC35112 implements DialogInterface.OnClickListener {
        public DialogInterfaceOnClickListenerC35112() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialoginterface, int i) {
            dialoginterface.dismiss();
            if (!JNIActivity.this.shouldShowRequestPermissionRationale("android.permission.WRITE_EXTERNAL_STORAGE")) {
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts(BundleInfo.PACKAGE_TYPE, JNIActivity.this.getPackageName(), null));
                JNIActivity.this.startActivity(intent);
                return;
            }
            JNIActivity.this.isRecordAudioPermissionGranted();
        }
    }

    /* renamed from: com.blackhub.bronline.game.core.JNIActivity$1 */

    public class DialogInterfaceOnClickListenerC35101 implements DialogInterface.OnClickListener {
        public DialogInterfaceOnClickListenerC35101() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialoginterface, int i) {
            dialoginterface.dismiss();
        }
    }

    public boolean isRecordAudioPermissionGranted() {
        if (checkSelfPermission("android.permission.RECORD_AUDIO") == PackageManager.PERMISSION_GRANTED) {
            return true;
        }
        ActivityCompat.requestPermissions(this, new String[]{"android.permission.RECORD_AUDIO"}, 1);
        return false;
    }

    public final boolean isFingerprintSupported() {
        this.isSupportFingerPrint = false;
        return false;
    }

    public Handler getNetworkHandler() {
        return this.mNetworkHandler;
    }

    /* renamed from: com.blackhub.bronline.game.core.JNIActivity$3 */

    public class RunnableC35123 implements Runnable {
        public RunnableC35123() {
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i = 0; i < 3; i++) {
                JNILib.multiTouchEvent(1, i, 0, 0, 0, 0, 0, 0);
            }
        }
    }

    public void cancelAllTouches() {
        this.mGLSurfaceView.queueEvent(new Runnable() { // from class: com.blackhub.bronline.game.core.JNIActivity.3
            public void RunnableC35123() {
            }

            @Override // java.lang.Runnable
            public void run() {
                for (int i = 0; i < 3; i++) {
                    JNILib.multiTouchEvent(1, i, 0, 0, 0, 0, 0, 0);
                }
            }
        });
    }

    public final void hideSystemUI() {
        getWindow().getDecorView().setSystemUiVisibility(7942);
    }

    public void sendGetRequest(String url) {
        UtilsKt.crashlyticsLog("JNIActivity sendGetRequest " + url);
        final String str = "http://" + url + "/";
        getContext().getNetworkHandler().post(new Runnable() { // from class: com.blackhub.bronline.game.core.JNIActivity$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    JNIActivity.lambda$sendGetRequest$0(str);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }

    public static /* synthetic */ void lambda$sendGetRequest$0(String str) throws IOException {
        try {
            UtilsKt.crashlyticsLog("JNIActivity TRY");
            HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection()));
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setConnectTimeout(2000);
            httpURLConnection.connect();
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 404) {
                UtilsKt.crashlyticsLog("JNIActivity sendGetRequest responseCode " + responseCode);
            }
        } catch (Exception e) {
            e.printStackTrace();
            UtilsKt.crashlyticsLog("JNIActivity sendGetRequest Exception " + e);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        mainViewModel.onNewIntent(intent);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle icicle) {
        if (isInited) {
            UtilsKt.crashlyticsLog("Inited = true, exiting...");
            FirebaseCrashlytics.getInstance().recordException(new Throwable());
            finishAffinity();
            System.exit(0);
            return;
        }
        isInited = true;
        UtilsKt.crashlyticsLog("JNIActivity onCreate");
        super.onCreate(null);
        mContext = this;
        this.mainBundle = icicle;
        if (App.getInstance() != null) {
            App.appComponent().inject(this);
        }
        mainViewModel = (JNIActivityViewModel) new ViewModelProvider(this, this.viewModelFactory).get(JNIActivityViewModel.class);
        getWindow().addFlags(128);
        getWindow().addFlags(1024);
        if (Environment.getExternalStorageState().equals("mounted")) {
            AppLocalValues.instance.setAppLocalValue("STORAGE_ROOT", getExternalFilesDir(null).getAbsolutePath() + "/");
        }
        hideSystemUI();
        getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: com.blackhub.bronline.game.core.JNIActivity.4
            public void ViewOnSystemUiVisibilityChangeListenerC35134() {
            }

            @Override // android.view.View.OnSystemUiVisibilityChangeListener
            public void onSystemUiVisibilityChange(int i) {
                if ((i & 4) == 0) {
                    JNIActivity.this.hideSystemUI();
                }
            }
        });
        this.mGLSurfaceView = new JNIGLSurfaceView(this);
        FrameLayout frameLayout = new FrameLayout(this);
        this.mRootView = frameLayout;
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.mRootView.addView(this.mGLSurfaceView);
        FrameLayout frameLayout2 = new FrameLayout(this);
        frameLayout2.setId(R.id.jniactivity_main_root_view);
        frameLayout2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.mRootView.addView(frameLayout2);
        ComposableProvider composableProvider = new ComposableProvider() { // from class: com.blackhub.bronline.game.core.JNIActivity$$ExternalSyntheticLambda1
            @Override // com.blackhub.bronline.game.common.composemanager.ComposableProvider
            public final void ProvideComposableContent(Composer composer, int i) {
                StampReleaseKt.StampRelease(composer, i);
            }
        };
        ComposeView composeView = new ComposeView(this);
        ComposeViewManager.INSTANCE.setComposableContent(composeView, composableProvider);
        composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.mRootView.addView(composeView);
        FrameLayout frameLayout3 = new FrameLayout(this);
        frameLayout3.setId(R.id.jniactivity_notification_container);
        frameLayout3.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.mRootView.addView(frameLayout3);
        setContentView(this.mRootView);
        isFingerprintSupported();
        HandlerThread handlerThread = new HandlerThread("NetworkHandler");
        handlerThread.start();
        this.mNetworkHandler = new Handler(handlerThread.getLooper());
        try {
            ((ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE)).setNetworkPreference(1);
        } catch (Exception unused) {
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("o", 1);
            GUIManager.getInstance().onPacketIncoming(11, jSONObject);
        } catch (Exception unused2) {
        }
        setObservers();
        getOnBackPressedDispatcher().addCallback(this, new OnBackPressedCallback(true) { // from class: com.blackhub.bronline.game.core.JNIActivity.5
            public void C35145(boolean enabled) {
                super(enabled);
            }

            @Override // androidx.activity.OnBackPressedCallback
            public void handleOnBackPressed() {
                JNIActivity.this.customOnBackPressed();
            }
        });
    }

    /* renamed from: com.blackhub.bronline.game.core.JNIActivity$4 */

    public class ViewOnSystemUiVisibilityChangeListenerC35134 implements View.OnSystemUiVisibilityChangeListener {
        public ViewOnSystemUiVisibilityChangeListenerC35134() {
        }

        @Override // android.view.View.OnSystemUiVisibilityChangeListener
        public void onSystemUiVisibilityChange(int i) {
            if ((i & 4) == 0) {
                JNIActivity.this.hideSystemUI();
            }
        }
    }

    /* renamed from: com.blackhub.bronline.game.core.JNIActivity$5 */

    public class C35145 extends OnBackPressedCallback {
        public C35145(boolean enabled) {
            super(enabled);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            JNIActivity.this.customOnBackPressed();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        UtilsKt.crashlyticsLog("JNIActivity onPause");
        super.onPause();
        this.paused = true;
        this.mGLSurfaceView.onPause();
        MarketAnalytic.INSTANCE.getEngine().pauseSession(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        UtilsKt.crashlyticsLog("JNIActivity onStop");
        mainViewModel.onSaveBillingData();
        super.onStop();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        UtilsKt.crashlyticsLog("JNIActivity onResume");
        super.onResume();
        this.paused = false;
        this.mGLSurfaceView.onResume();
        hideSystemUI();
        MarketAnalytic.INSTANCE.getEngine().resumeSession(this);
        if (isCustomTabOpened) {
            isCustomTabOpened = false;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("c", 1);
                GUIManager.getInstance().sendJsonData(51, jSONObject);
            } catch (JSONException unused) {
                UtilsKt.crashlyticsRecordNewException("Error when try to send close key to 51 interface");
            }
        }
        mainViewModel.reconnectPurchases();
    }

    public EditText getInputField() {
        return this.mEditText;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean hasFocus) {
        UtilsKt.crashlyticsLog("JNIActivity onWindowFocusChanged, has focus: " + hasFocus);
        super.onWindowFocusChanged(hasFocus);
        if (GUIManager.getInstance().isShowingScreens()) {
            return;
        }
        this.hasFocus = hasFocus;
        if (!this.paused) {
            UtilsKt.crashlyticsLog("JNIActivity onWindowFocusChanged !paused");
            if (!hasFocus && this.isFocused) {
                UtilsKt.crashlyticsLog("JNIActivity onWindowFocusChanged !paused !hasFocus && isFocused");
                runOnGLThread(new Runnable() { // from class: com.blackhub.bronline.game.core.JNIActivity.6
                    public void RunnableC35156() {
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        JNILib.pauseEvent();
                    }
                });
            } else if (hasFocus && !this.isFocused) {
                UtilsKt.crashlyticsLog("JNIActivity onWindowFocusChanged !paused hasFocus && !isFocused");
                runOnGLThread(new Runnable() { // from class: com.blackhub.bronline.game.core.JNIActivity.7
                    public void RunnableC35167() {
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        JNILib.resumeEvent();
                    }
                });
            }
            this.isFocused = hasFocus;
        }
        if (hasFocus) {
            hideSystemUI();
        }
        resumeIfHasFocus();
    }

    /* renamed from: com.blackhub.bronline.game.core.JNIActivity$6 */

    public class RunnableC35156 implements Runnable {
        public RunnableC35156() {
        }

        @Override // java.lang.Runnable
        public void run() {
            JNILib.pauseEvent();
        }
    }

    /* renamed from: com.blackhub.bronline.game.core.JNIActivity$7 */

    public class RunnableC35167 implements Runnable {
        public RunnableC35167() {
        }

        @Override // java.lang.Runnable
        public void run() {
            JNILib.resumeEvent();
        }
    }

    public static boolean isDeviceLocked() {
        return ((KeyguardManager) getContext().getSystemService(Context.KEYGUARD_SERVICE)).inKeyguardRestrictedInputMode();
    }

    public static boolean isDeviceAsleep() {
        if (((PowerManager) getContext().getSystemService(Context.POWER_SERVICE)) == null) {
            return false;
        }
        return !r0.isInteractive();
    }

    public final void resumeIfHasFocus() {
        boolean z = (isDeviceLocked() || isDeviceAsleep()) ? false : true;
        if (this.hasFocus && z) {
            this.mGLSurfaceView.onResume();
        }
    }

    public void runOnGLThread(final Runnable pRunnable) {
        this.mGLSurfaceView.queueEvent(pRunnable);
    }

    public FrameLayout getParentLayout() {
        return this.mRootView;
    }

    public static JNIActivity getContext() {
        return mContext;
    }

    public String getNick() {
        return Preferences.getString(this, NewMenuConstants.PLAYERS_NICK, "");
    }

    public void onSpawn() {
        GUIManager.getInstance().onSpawn();
    }

    public Bundle getMainBundle() {
        return this.mainBundle;
    }

    public static void openCustomTab(Uri url) {
        if ((Objects.equals(url.getHost(), LinksConstants.T_ME_LINK) || Objects.equals(url.getHost(), LinksConstants.TELEGRAM_ME_LINK)) && !isTelegramInstalled(getContext().getPackageManager())) {
            url = Uri.parse(LinksConstants.TELEGRAM_PLAY_MARKET_LINK);
        }
        isCustomTabOpened = true;
        try {
            new CustomTabsIntent.Builder().build().launchUrl(mContext, url);
        } catch (Exception e) {
            UtilsKt.crashlyticsRecordNewException("openCustomTab " + e.getMessage());
        }
    }

    public static void getRustoreBillingPurchases() {
        mainViewModel.getRustoreBillingPurchases();
    }

    public static boolean isTelegramInstalled(PackageManager packageManager) {
        try {
            return packageManager.getPackageInfo(LinksConstants.TELEGRAM_PACKAGE, 1) != null;
        } catch (PackageManager.NameNotFoundException e) {
            UtilsKt.crashlyticsLog("isTelegramInstalled " + e);
            return false;
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        UtilsKt.crashlyticsLog("JNIActivity onDestroy");
        super.onDestroy();
        isInited = false;
        this.mGLSurfaceView = null;
        this.mRootView = null;
        mContext = null;
        this.Fapi = null;
        this.mNetworkHandler = null;
        GUIManager.setGUIManagerNull();
    }

    /* renamed from: com.blackhub.bronline.game.core.JNIActivity$8 */

    public class C35178 implements Observer<Integer> {
        public C35178() {
        }

        @Override // androidx.lifecycle.Observer
        public void onChanged(Integer integer) throws IllegalStateException {
            if (integer.intValue() == 0) {
                JNIActivity.this.stopAndSetNullableMediaPlayer();
            } else {
                JNIActivity.this.playMediaPlayer(integer.intValue());
            }
        }
    }

    public final void setObservers() {
        UtilsKt.crashlyticsLog("JNIActivity setObservers");
        mainViewModel.getAudioFileId().observe(this, new Observer<Integer>() { // from class: com.blackhub.bronline.game.core.JNIActivity.8
            public C35178() {
            }

            @Override // androidx.lifecycle.Observer
            public void onChanged(Integer integer) throws IllegalStateException {
                if (integer.intValue() == 0) {
                    JNIActivity.this.stopAndSetNullableMediaPlayer();
                } else {
                    JNIActivity.this.playMediaPlayer(integer.intValue());
                }
            }
        });
        mainViewModel.isNeedToShowReview().observe(this, new Observer() { // from class: com.blackhub.bronline.game.core.JNIActivity$$ExternalSyntheticLambda2
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f$0.lambda$setObservers$6((Boolean) obj);
            }
        });
        mainViewModel.getUpdatedServers().observe(this, new Observer() { // from class: com.blackhub.bronline.game.core.JNIActivity$$ExternalSyntheticLambda3
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f$0.lambda$setObservers$8((List) obj);
            }
        });
        mainViewModel.getCombinedServers().observe(this, new Observer() { // from class: com.blackhub.bronline.game.core.JNIActivity$$ExternalSyntheticLambda4
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f$0.lambda$setObservers$9((Pair) obj);
            }
        });
    }

    public final /* synthetic */ void lambda$setObservers$6(Boolean bool) {
        bool.booleanValue();
    }

    public final /* synthetic */ void lambda$setObservers$1(ReviewManager reviewManager, Task task) {
        if (task.isSuccessful()) {
            reviewManager.launchReviewFlow(this, (ReviewInfo) task.getResult());
            return;
        }
        Exception exception = task.getException();
        Objects.requireNonNull(exception);
        UtilsKt.crashlyticsRecordNewException("Review error JNIActivity string " + ((ReviewException) exception).getErrorCode());
    }

    public static /* synthetic */ void lambda$setObservers$4(RuStoreReviewManager ruStoreReviewManager, ru.rustore.sdk.review.model.ReviewInfo reviewInfo) {
        ruStoreReviewManager.launchReviewFlow(reviewInfo).addOnSuccessListener(new OnSuccessListener() { // from class: com.blackhub.bronline.game.core.JNIActivity$$ExternalSyntheticLambda5
            @Override // ru.rustore.sdk.core.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                JNIActivity.lambda$setObservers$2((Unit) obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: com.blackhub.bronline.game.core.JNIActivity$$ExternalSyntheticLambda6
            @Override // ru.rustore.sdk.core.tasks.OnFailureListener
            public final void onFailure(Throwable th) {
                JNIActivity.lambda$setObservers$3(th);
            }
        });
    }

    public static /* synthetic */ void lambda$setObservers$3(Throwable th) {
        UtilsKt.crashlyticsRecordNewException("RuStore launchReviewFlow error JNIActivity " + th);
    }

    public static /* synthetic */ void lambda$setObservers$5(Throwable th) {
        UtilsKt.crashlyticsRecordNewException("RuStore reviewInfo error JNIActivity " + th);
    }

    public final /* synthetic */ void lambda$setObservers$8(List list) {
        int integer = Preferences.getInteger(mContext, Preferences.USER_SERVER, -1);
        if (integer == -1) {
            UtilsKt.crashlyticsLog("JNIActivity addMeToWhiteList currentServer == -1");
            list.forEach(new Consumer() { // from class: com.blackhub.bronline.game.core.JNIActivity$$ExternalSyntheticLambda7
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    this.f$0.lambda$setObservers$7((Server) obj);
                }
            });
            sendGetRequest("80.66.82.19");
        } else if (integer < list.size()) {
            UtilsKt.crashlyticsLog("JNIActivity addMeToWhiteList currentServer < mServers.size() " + integer + " " + list.size());
            sendGetRequest(((Server) list.get(integer)).getUrl());
            sendGetRequest("80.66.82.19");
        }
    }

    public final /* synthetic */ void lambda$setObservers$7(Server server) {
        sendGetRequest(server.getUrl());
    }

    public final /* synthetic */ void lambda$setObservers$9(Pair pair) {
        List list = (List) pair.getFirst();
        List<YoutuberAcc> list2 = (List) pair.getSecond();
        if (list == null || list2 == null) {
            return;
        }
        mainViewModel.setUpdatedServers(addYoutubeServer(list2, new ArrayList(list)));
    }

    public final List<Server> addYoutubeServer(List<YoutuberAcc> listOfYoutubers, List<Server> servers) {
        String nick = getNick();
        Iterator<YoutuberAcc> it = listOfYoutubers.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (it.next().getNickname().equals(nick)) {
                servers.add(new Server("80.66.82.19", "7090", "500", "1000", "FF0000", false, Float.valueOf(72.73f), Float.valueOf(408.9f), "1424", "Test Server Youtube", "Test Server Youtube", "Test Server Youtube", "80.66.82.19", 204));
                break;
            }
        }
        return servers;
    }

    public final void playMediaPlayer(@RawRes int resId) throws IllegalStateException {
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            stopAndSetNullableMediaPlayer();
        }
        MediaPlayer mediaPlayerCreate = MediaPlayer.create(this, resId);
        this.mediaPlayer = mediaPlayerCreate;
        mediaPlayerCreate.start();
        this.mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.blackhub.bronline.game.core.JNIActivity.9
            public C35189() {
            }

            @Override // android.media.MediaPlayer.OnCompletionListener
            public void onCompletion(MediaPlayer mp) {
                JNIActivity.mainViewModel.turnOffTheSound();
            }
        });
    }

    /* renamed from: com.blackhub.bronline.game.core.JNIActivity$9 */

    public class C35189 implements MediaPlayer.OnCompletionListener {
        public C35189() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mp) {
            JNIActivity.mainViewModel.turnOffTheSound();
        }
    }

    public final void stopAndSetNullableMediaPlayer() throws IllegalStateException {
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.mediaPlayer.release();
            this.mediaPlayer = null;
        }
    }

    public final void customOnBackPressed() {
        if (!GUIManager.getInstance().isShowingScreens() || GUIManager.getInstance().getGUIs(39)) {
            return;
        }
        GUIManager.getInstance().getGUIs(65);
    }
}
