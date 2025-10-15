package com.samsung.android.sdk.pass;

import android.app.Activity;
import android.app.Dialog;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import androidx.core.view.ViewCompat;
import com.blackhub.bronline.game.fingerprint.SamsungFingerprintApi;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.samsung.android.fingerprint.FingerprintEvent;
import com.samsung.android.fingerprint.FingerprintIdentifyDialog;
import com.samsung.android.fingerprint.FingerprintManager;
import com.samsung.android.fingerprint.IFingerprintClient;
import com.samsung.android.sdk.pass.support.IFingerprintManagerProxy;
import com.samsung.android.sdk.pass.support.SdkSupporter;
import com.samsung.android.sdk.pass.support.p026v1.FingerprintManagerProxyFactory;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public class SpassFingerprint {
    public static final String ACTION_FINGERPRINT_ADDED = "com.samsung.android.intent.action.FINGERPRINT_ADDED";
    public static final String ACTION_FINGERPRINT_REMOVED = "com.samsung.android.intent.action.FINGERPRINT_REMOVED";
    public static final String ACTION_FINGERPRINT_RESET = "com.samsung.android.intent.action.FINGERPRINT_RESET";
    public static final int STATUS_AUTHENTIFICATION_FAILED = 16;
    public static final int STATUS_AUTHENTIFICATION_PASSWORD_SUCCESS = 100;
    public static final int STATUS_AUTHENTIFICATION_SUCCESS = 0;
    public static final int STATUS_BUTTON_PRESSED = 9;
    public static final int STATUS_OPERATION_DENIED = 51;
    public static final int STATUS_QUALITY_FAILED = 12;
    public static final int STATUS_SENSOR_FAILED = 7;
    public static final int STATUS_TIMEOUT_FAILED = 4;
    public static final int STATUS_USER_CANCELLED = 8;
    public static final int STATUS_USER_CANCELLED_BY_TOUCH_OUTSIDE = 13;
    public static final String TAG = "SpassFingerprintSDK";

    /* renamed from: n */
    public static int f967n;

    /* renamed from: o */
    public static boolean f968o;

    /* renamed from: p */
    public static boolean f969p;

    /* renamed from: q */
    public static boolean f970q;

    /* renamed from: r */
    public static boolean f971r;

    /* renamed from: a */
    public IFingerprintManagerProxy f972a;

    /* renamed from: b */
    public Context f973b;

    /* renamed from: c */
    public int f974c = -1;

    /* renamed from: d */
    public String f975d = null;

    /* renamed from: e */
    public ArrayList f976e = null;

    /* renamed from: f */
    public String f977f = null;

    /* renamed from: g */
    public int f978g = -1;

    /* renamed from: h */
    public String f979h = null;

    /* renamed from: i */
    public int f980i = -1;

    /* renamed from: j */
    public boolean f981j = false;

    /* renamed from: k */
    public String f982k = null;

    /* renamed from: l */
    public String f983l = null;

    /* renamed from: m */
    public boolean f984m = false;

    /* renamed from: s */
    public Dialog f985s = null;

    /* renamed from: t */
    public C8019b f986t = null;

    /* renamed from: u */
    public C8019b f987u = null;

    /* renamed from: v */
    public IBinder f988v = null;

    /* renamed from: w */
    public Handler f989w;

    public interface IdentifyListener {
        void onCompleted();

        void onFinished(int i);

        void onReady();

        void onStarted();
    }

    public interface RegisterListener {
        void onFinished();
    }

    /* renamed from: com.samsung.android.sdk.pass.SpassFingerprint$a */
    public static class C8018a {

        /* renamed from: a */
        public Bundle f990a;

        public C8018a() {
            Bundle bundle = new Bundle();
            this.f990a = bundle;
            bundle.putString("sdk_version", "Pass-v1.2.6");
        }

        /* renamed from: a */
        public final Bundle m1418a() {
            return this.f990a;
        }

        /* renamed from: a */
        public final C8018a m1419a(int[] iArr) {
            if (iArr.length > 0) {
                this.f990a.putIntArray("request_template_index_list", iArr);
            }
            return this;
        }
    }

    /* renamed from: com.samsung.android.sdk.pass.SpassFingerprint$b */
    public class C8019b extends IFingerprintClient.Stub {

        /* renamed from: a */
        public IdentifyListener f991a;

        /* renamed from: b */
        public final int f992b;

        public C8019b(IdentifyListener identifyListener) {
            this.f992b = SpassFingerprint.f968o ? 16 : 13;
            this.f991a = identifyListener;
        }

        public /* synthetic */ C8019b(SpassFingerprint spassFingerprint, IdentifyListener identifyListener, byte b) {
            this(identifyListener);
        }

        /* renamed from: a */
        public final IdentifyListener m1421a() {
            return this.f991a;
        }

        /* renamed from: a */
        public final void m1422a(IdentifyListener identifyListener) {
            this.f991a = identifyListener;
        }

        public final void onFingerprintEvent(FingerprintEvent fingerprintEvent) throws RemoteException {
            String str;
            if (fingerprintEvent == null) {
                str = "onFingerprintEvent: null event will be ignored!";
            } else {
                try {
                    Log.d(SpassFingerprint.TAG, "evt : " + fingerprintEvent.eventId + ", " + fingerprintEvent.eventResult + ", " + fingerprintEvent.eventStatus);
                    IdentifyListener identifyListener = this.f991a;
                    if (fingerprintEvent.eventId == this.f992b) {
                        Log.d(SpassFingerprint.TAG, "onFingerprintEvent : completed = " + this.f992b);
                        SpassFingerprint.this.f986t = null;
                        SpassFingerprint.this.m1417f();
                    }
                    if (identifyListener != null && SpassFingerprint.this.f989w != null) {
                        SpassFingerprint.this.f989w.post(new RunnableC8025e(this, fingerprintEvent, identifyListener));
                        return;
                    }
                    return;
                } catch (Exception e) {
                    str = "onFingerprintEvent: Error : " + e;
                }
            }
            Log.w(SpassFingerprint.TAG, str);
        }
    }

    /* renamed from: com.samsung.android.sdk.pass.SpassFingerprint$c */
    public class C8020c implements FingerprintIdentifyDialog.FingerprintListener {

        /* renamed from: a */
        public IdentifyListener f994a;

        /* renamed from: b */
        public FingerprintEvent f995b;

        public C8020c(IdentifyListener identifyListener) {
            this.f994a = identifyListener;
        }

        public /* synthetic */ C8020c(SpassFingerprint spassFingerprint, IdentifyListener identifyListener, byte b) {
            this(identifyListener);
        }

        /* renamed from: a */
        public final void m1425a() {
            FingerprintEvent fingerprintEvent = this.f995b;
            IdentifyListener identifyListener = this.f994a;
            if (fingerprintEvent == null || identifyListener == null || SpassFingerprint.this.f989w == null) {
                return;
            }
            SpassFingerprint.this.f989w.post(new RunnableC8027g(this, fingerprintEvent, identifyListener));
            this.f994a = null;
            this.f995b = null;
        }

        public final void onEvent(FingerprintEvent fingerprintEvent) {
            try {
                if (fingerprintEvent.eventId == 13 || SpassFingerprint.this.f989w == null) {
                    this.f995b = fingerprintEvent;
                } else {
                    SpassFingerprint.this.f989w.post(new RunnableC8026f(this, fingerprintEvent));
                }
            } catch (Exception e) {
                Log.w(SpassFingerprint.TAG, "onFingerprintEvent: Error : " + e);
            }
        }
    }

    public SpassFingerprint(Context context) throws NoSuchFieldException {
        if (context == null) {
            throw new IllegalArgumentException("context is null.");
        }
        this.f973b = context;
        if (!f969p) {
            f970q = context.getPackageManager().hasSystemFeature("com.sec.feature.fingerprint_manager_service");
            f971r = m1412g();
            f969p = true;
        }
        if (f970q) {
            this.f972a = FingerprintManagerProxyFactory.create(this.f973b);
            this.f989w = new Handler(context.getMainLooper());
            if (this.f972a != null) {
                try {
                    if (this.f972a.getSensorType() == FingerprintManager.class.getField("SENSOR_TYPE_TOUCH").getInt(null)) {
                        f968o = true;
                    }
                } catch (Exception e) {
                    Log.i(TAG, "SpassFingerprint : " + e.toString());
                }
                f967n = this.f972a.getVersion();
            }
        }
        Log.i(TAG, "SpassFingerprint : 1.2.6, " + f967n + ", " + f968o);
    }

    /* renamed from: a */
    public static void m1405a(Context context, String str) {
        if (m1412g()) {
            if (context.checkCallingOrSelfPermission(SamsungFingerprintApi.PERMISSION) != 0) {
                Log.d(TAG, "insertLog :  No permission");
                return;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put(CommonUrlParts.APP_ID, SpassFingerprint.class.getPackage().getName());
            contentValues.put("feature", String.valueOf(context.getPackageName()) + "#12");
            if (str != null) {
                contentValues.put("extra", str);
            }
            Intent intent = new Intent();
            intent.setAction("com.samsung.android.providers.context.log.action.USE_APP_FEATURE_SURVEY");
            intent.putExtra("data", contentValues);
            intent.setPackage("com.samsung.android.providers.context");
            context.sendBroadcast(intent);
            Log.i(TAG, "insertLog : " + contentValues.toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0049 A[PHI: r0
  0x0049: PHI (r0v2 int) = (r0v1 int), (r0v3 int), (r0v4 int) binds: [B:11:0x0024, B:21:0x0036, B:23:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void m1407a(SpassFingerprint spassFingerprint, IdentifyListener identifyListener, FingerprintEvent fingerprintEvent, int i) {
        int i2;
        spassFingerprint.f975d = "";
        int i3 = 0;
        if (fingerprintEvent == null) {
            spassFingerprint.f974c = 0;
        } else {
            spassFingerprint.f974c = fingerprintEvent.getFingerIndex();
            if (fingerprintEvent.eventStatus == 12 || fingerprintEvent.eventStatus == 11) {
                spassFingerprint.f975d = fingerprintEvent.getImageQualityFeedback();
            }
            int i4 = fingerprintEvent.eventStatus;
            if (i4 != 0) {
                i = 4;
                if (i4 != 4) {
                    i = 51;
                    if (i4 != 51) {
                        i = 100;
                        if (i4 != 100) {
                            i = 7;
                            if (i4 != 7) {
                                i3 = 8;
                                if (i4 != 8) {
                                    i3 = 9;
                                    if (i4 != 9) {
                                        switch (i4) {
                                            case 11:
                                                i2 = 16;
                                                i = i2;
                                                break;
                                            case 12:
                                                i = 12;
                                                break;
                                            case 13:
                                                i2 = 13;
                                                i = i2;
                                                break;
                                        }
                                    } else {
                                        i = i3;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        identifyListener.onFinished(i);
        spassFingerprint.f974c = -1;
        spassFingerprint.f975d = null;
        if (spassFingerprint.f984m) {
            return;
        }
        spassFingerprint.f984m = true;
        m1405a(spassFingerprint.f973b, "IdentifyListener.onFinished");
    }

    /* renamed from: a */
    public static boolean m1408a() {
        return f967n >= 16843008;
    }

    /* renamed from: g */
    public static boolean m1412g() throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        boolean zBooleanValue;
        if (f969p) {
            return f971r;
        }
        try {
            Class<?> cls = Class.forName("com.samsung.android.feature.FloatingFeature");
            zBooleanValue = ((Boolean) cls.getMethod("getEnableStatus", String.class).invoke(cls.getMethod("getInstance", null).invoke(null, null), "SEC_FLOATING_FEATURE_CONTEXTSERVICE_ENABLE_SURVEY_MODE")).booleanValue();
        } catch (Exception e) {
            Log.d(TAG, "Survey Mode : " + e.toString());
            try {
                Class<?> cls2 = Class.forName("com.samsung.android.feature.SemFloatingFeature");
                zBooleanValue = ((Boolean) cls2.getMethod("getBoolean", String.class).invoke(cls2.getMethod("getInstance", null).invoke(null, null), "SEC_FLOATING_FEATURE_CONTEXTSERVICE_ENABLE_SURVEY_MODE")).booleanValue();
            } catch (Exception e2) {
                Log.d(TAG, "Survey Mode : " + e2.toString());
                zBooleanValue = false;
            }
        }
        Log.i(TAG, "Survey Mode : " + zBooleanValue);
        return zBooleanValue;
    }

    /* renamed from: a */
    public final boolean m1413a(String str) throws PackageManager.NameNotFoundException {
        String packageName = this.f973b.getPackageName();
        try {
            Resources resourcesForApplication = this.f973b.getPackageManager().getResourcesForApplication(packageName);
            if (resourcesForApplication == null) {
                return false;
            }
            try {
                int identifier = resourcesForApplication.getIdentifier(str, "drawable", packageName);
                if (identifier != 0 && identifier != -1) {
                    return BitmapFactory.decodeResource(resourcesForApplication, identifier) != null;
                }
            } catch (Resources.NotFoundException unused) {
            }
            return false;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: b */
    public final boolean m1414b() throws UnsupportedOperationException, NoSuchMethodException, SecurityException {
        m1416e();
        try {
            Class.forName(SdkSupporter.CLASSNAME_FINGERPRINT_MANAGER).getMethod("isSupportFingerprintIds", null);
            return this.f972a.isSupportFingerprintIds();
        } catch (Exception e) {
            Log.w(TAG, e);
            return m1408a();
        }
    }

    /* renamed from: c */
    public final boolean m1415c() throws UnsupportedOperationException, NoSuchMethodException, SecurityException {
        m1416e();
        try {
            Class.forName(SdkSupporter.CLASSNAME_FINGERPRINT_MANAGER).getMethod("isSupportBackupPassword", null);
            return this.f972a.isSupportBackupPassword();
        } catch (Exception e) {
            Log.w(TAG, e);
            return true;
        }
    }

    public void cancelIdentify() throws UnsupportedOperationException {
        Handler handler;
        m1416e();
        IBinder iBinder = this.f988v;
        if (iBinder == null && this.f986t == null && this.f985s == null) {
            throw new IllegalStateException("No Identify request.");
        }
        if (iBinder == null) {
            if (this.f986t == null && this.f985s == null) {
                return;
            }
            this.f972a.notifyAppActivityState(4, null);
            this.f986t = null;
            this.f985s = null;
            return;
        }
        C8019b c8019b = this.f987u;
        IdentifyListener identifyListenerM1421a = c8019b != null ? c8019b.m1421a() : null;
        m1417f();
        if (identifyListenerM1421a == null || (handler = this.f989w) == null) {
            return;
        }
        handler.postDelayed(new RunnableC8021a(this, identifyListenerM1421a), 100L);
    }

    public void changeStandbyString(String str) throws UnsupportedOperationException {
        m1416e();
        if (m1415c()) {
            throw new IllegalStateException("setStandbyString is not supported.");
        }
        if (str == null) {
            throw new IllegalArgumentException("the standby text passed is null.");
        }
        if (str.length() > 100) {
            throw new IllegalArgumentException("the standby text passed is longer than 100 characters.");
        }
        this.f983l = str;
    }

    /* renamed from: e */
    public final synchronized void m1416e() throws UnsupportedOperationException {
        if (!f970q) {
            throw new UnsupportedOperationException("Fingerprint Service is not supported in the platform.");
        }
        if (this.f972a == null) {
            Log.i(TAG, "ensureServiceSupported : proxy is null, retry to create proxy");
            IFingerprintManagerProxy iFingerprintManagerProxyCreate = FingerprintManagerProxyFactory.create(this.f973b);
            this.f972a = iFingerprintManagerProxyCreate;
            if (iFingerprintManagerProxyCreate == null) {
                throw new UnsupportedOperationException("Fingerprint Service is not running on the device.");
            }
        }
    }

    /* renamed from: f */
    public final void m1417f() {
        this.f972a.unregisterClient(this.f988v);
        this.f988v = null;
        C8019b c8019b = this.f987u;
        if (c8019b != null) {
            c8019b.m1422a((IdentifyListener) null);
        }
    }

    public String getGuideForPoorQuality() throws UnsupportedOperationException {
        m1416e();
        String str = this.f975d;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("FingerprintGuide is Invalid. This API must be called inside IdentifyListener.onFinished() with STATUS_QUALITY_FAILED only.");
    }

    public int getIdentifiedFingerprintIndex() throws UnsupportedOperationException {
        m1416e();
        int i = this.f974c;
        if (i != -1) {
            return i;
        }
        throw new IllegalStateException("FingerprintIndex is Invalid. This API must be called inside IdentifyListener.onFinished() only.");
    }

    public SparseArray getRegisteredFingerprintName() throws UnsupportedOperationException {
        m1416e();
        SparseArray sparseArray = new SparseArray();
        int enrolledFingers = this.f972a.getEnrolledFingers();
        if (enrolledFingers <= 0) {
            return null;
        }
        for (int i = 1; i <= 10; i++) {
            if (((1 << i) & enrolledFingers) != 0) {
                sparseArray.put(i, this.f972a.getIndexName(i));
            }
        }
        return sparseArray;
    }

    public SparseArray getRegisteredFingerprintUniqueID() throws UnsupportedOperationException {
        m1416e();
        if (!m1414b()) {
            throw new IllegalStateException("getRegisteredFingerprintUniqueID is not supported.");
        }
        SparseArray sparseArray = new SparseArray();
        int enrolledFingers = this.f972a.getEnrolledFingers();
        if (enrolledFingers <= 0) {
            return null;
        }
        for (int i = 1; i <= 10; i++) {
            if (((1 << i) & enrolledFingers) != 0) {
                sparseArray.put(i, this.f972a.getFingerprintId(i));
            }
        }
        return sparseArray;
    }

    public boolean hasRegisteredFinger() throws UnsupportedOperationException {
        m1416e();
        return this.f972a.getEnrolledFingers() != 0;
    }

    public void registerFinger(Context context, RegisterListener registerListener) throws UnsupportedOperationException {
        m1416e();
        if (context == null) {
            throw new IllegalArgumentException("activityContext passed is null.");
        }
        if (registerListener == null) {
            throw new IllegalArgumentException("listener passed is null.");
        }
        if (this.f972a.isEnrolling()) {
            this.f972a.notifyEnrollEnd();
        }
        try {
            context.getPackageManager();
            try {
                this.f972a.startEnrollActivity(context, new C8024d(registerListener), toString());
            } catch (UndeclaredThrowableException unused) {
                throw new IllegalArgumentException("activityContext is invalid");
            }
        } catch (NullPointerException unused2) {
            throw new IllegalArgumentException("activityContext is invalid");
        }
    }

    public void setCanceledOnTouchOutside(boolean z) throws UnsupportedOperationException {
        m1416e();
        if (!m1408a()) {
            throw new IllegalStateException("setCanceledOnTouchOutside is not supported.");
        }
        this.f981j = z;
    }

    public void setDialogBgTransparency(int i) throws UnsupportedOperationException {
        m1416e();
        if (!m1408a()) {
            throw new IllegalStateException("setDialogBGTransparency is not supported.");
        }
        if (i < 0 || i > 255) {
            throw new IllegalArgumentException("the transparency passed is not valid.");
        }
        this.f980i = i;
    }

    public void setDialogButton(String str) throws UnsupportedOperationException {
        m1416e();
        if (m1415c()) {
            throw new IllegalStateException("setDialogButton is not supported.");
        }
        if (str == null) {
            throw new IllegalArgumentException("the buttonText passed is null.");
        }
        if (str.length() > 32) {
            throw new IllegalArgumentException("the title text passed is longer than 32 characters.");
        }
        this.f982k = str;
    }

    public void setDialogIcon(String str) throws UnsupportedOperationException {
        m1416e();
        if (!m1408a()) {
            throw new IllegalStateException("setDialogIcon is not supported.");
        }
        if (str == null) {
            throw new IllegalArgumentException("the iconName passed is null.");
        }
        if (!m1413a(str)) {
            throw new IllegalArgumentException("the iconName passed is not valid.");
        }
        this.f979h = str;
    }

    public void setDialogTitle(String str, int i) throws UnsupportedOperationException {
        m1416e();
        if (!m1408a()) {
            throw new IllegalStateException("setDialogTitle is not supported.");
        }
        if (str == null) {
            throw new IllegalArgumentException("the titletext passed is null.");
        }
        if (str.length() > 256) {
            throw new IllegalArgumentException("the title text passed is longer than 256 characters.");
        }
        if ((i >>> 24) != 0) {
            throw new IllegalArgumentException("alpha value is not supported in the titleColor.");
        }
        this.f977f = str;
        this.f978g = i + ViewCompat.MEASURED_STATE_MASK;
    }

    public void setIntendedFingerprintIndex(ArrayList arrayList) throws UnsupportedOperationException {
        m1416e();
        if (arrayList == null) {
            Log.w(TAG, "requestedIndex is null. Identify is carried out for all indexes.");
            return;
        }
        if (!m1408a()) {
            throw new IllegalStateException("setIntendedFingerprintIndex is not supported.");
        }
        this.f976e = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            this.f976e.add((Integer) arrayList.get(i));
        }
    }

    public void startIdentify(IdentifyListener identifyListener) throws UnsupportedOperationException {
        C8018a c8018a = new C8018a();
        ArrayList arrayList = this.f976e;
        byte b = 0;
        if (arrayList != null && arrayList.size() > 0) {
            int[] iArr = new int[this.f976e.size()];
            for (int i = 0; i < this.f976e.size(); i++) {
                iArr[i] = ((Integer) this.f976e.get(i)).intValue();
            }
            this.f976e = null;
            c8018a.m1419a(iArr);
        }
        m1416e();
        if (this.f972a.getEnrolledFingers() == 0) {
            throw new IllegalStateException("Identify operation is failed.");
        }
        if (this.f988v != null) {
            throw new IllegalStateException("Identify request is denied because a previous request is still in progress.");
        }
        if (identifyListener == null) {
            throw new IllegalArgumentException("listener passed is null.");
        }
        if (this.f987u == null) {
            this.f987u = new C8019b(this, identifyListener, b);
        }
        Bundle bundleM1418a = c8018a.m1418a();
        bundleM1418a.putString("appName", this.f973b.getPackageName());
        IBinder iBinderRegisterClient = this.f972a.registerClient(this.f987u, bundleM1418a);
        this.f988v = iBinderRegisterClient;
        if (iBinderRegisterClient == null) {
            IBinder iBinderRegisterClient2 = this.f972a.registerClient(this.f987u, bundleM1418a);
            this.f988v = iBinderRegisterClient2;
            if (iBinderRegisterClient2 == null) {
                Handler handler = this.f989w;
                if (handler == null) {
                    throw new IllegalStateException("failed because registerClient returned null.");
                }
                handler.post(new RunnableC8022b(this, identifyListener));
                return;
            }
        }
        int iIdentify = this.f972a.identify(this.f988v, null);
        if (iIdentify == 0) {
            this.f987u.m1422a(identifyListener);
            return;
        }
        m1417f();
        Log.i(TAG, "startIdentify : failed, " + iIdentify);
        if (iIdentify == -2) {
            throw new IllegalStateException("Identify request is denied because a previous request is still in progress.");
        }
        if (iIdentify != 51) {
            throw new IllegalStateException("Identify operation is failed.");
        }
        throw new SpassInvalidStateException("Identify request is denied because 5 identify attempts are failed.", 1);
    }

    public void startIdentifyWithDialog(Context context, IdentifyListener identifyListener, boolean z) throws UnsupportedOperationException {
        int[] iArr;
        m1416e();
        if (context == null) {
            throw new IllegalArgumentException("activityContext passed is null.");
        }
        if (identifyListener == null) {
            throw new IllegalArgumentException("listener passed is null.");
        }
        try {
            context.getPackageManager();
            if (!(context instanceof Activity)) {
                Log.w(TAG, "startIdentifyWithDialog : No Actvity Context");
            }
            byte b = 0;
            if (!m1408a()) {
                C8020c c8020c = new C8020c(this, identifyListener, b);
                Dialog dialogShowIdentifyDialog = this.f972a.showIdentifyDialog(context, c8020c, null, z);
                this.f985s = dialogShowIdentifyDialog;
                if (dialogShowIdentifyDialog == null) {
                    throw new IllegalStateException("Identify operation is failed.");
                }
                dialogShowIdentifyDialog.setOnDismissListener(new DialogInterfaceOnDismissListenerC8023c(c8020c));
                this.f985s.show();
                return;
            }
            ArrayList arrayList = this.f976e;
            if (arrayList == null || arrayList.size() <= 0) {
                iArr = null;
            } else {
                iArr = new int[this.f976e.size()];
                for (int i = 0; i < this.f976e.size(); i++) {
                    iArr[i] = ((Integer) this.f976e.get(i)).intValue();
                }
            }
            this.f986t = new C8019b(this, identifyListener, b);
            try {
                Bundle bundle = new Bundle();
                bundle.putBoolean("password", z);
                bundle.putString(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, context.getPackageName());
                bundle.putString("sdk_version", "Pass-v1.2.6");
                bundle.putBoolean("demandExtraEvent", true);
                if (iArr != null) {
                    bundle.putIntArray("request_template_index_list", iArr);
                }
                String str = this.f977f;
                if (str != null) {
                    bundle.putString("titletext", str);
                }
                int i2 = this.f978g;
                if (i2 != -1) {
                    bundle.putInt("titlecolor", i2);
                }
                String str2 = this.f979h;
                if (str2 != null) {
                    bundle.putString("iconname", str2);
                }
                int i3 = this.f980i;
                if (i3 != -1) {
                    bundle.putInt("transparency", i3);
                }
                boolean z2 = this.f981j;
                if (z2) {
                    bundle.putBoolean("touchoutside", z2);
                }
                String str3 = this.f982k;
                if (str3 != null) {
                    bundle.putString("button_name", str3);
                }
                String str4 = this.f983l;
                if (str4 != null) {
                    bundle.putString("standby_string", str4);
                }
                if (this.f972a.identifyWithDialog(context, this.f986t, bundle) != 0) {
                    throw new IllegalStateException("Identify operation is failed.");
                }
                this.f976e = null;
                this.f977f = null;
                this.f978g = -1;
                this.f980i = -1;
                this.f979h = null;
                this.f981j = false;
                this.f983l = null;
                this.f982k = null;
            } catch (Throwable th) {
                this.f976e = null;
                this.f977f = null;
                this.f978g = -1;
                this.f980i = -1;
                this.f979h = null;
                this.f981j = false;
                this.f983l = null;
                this.f982k = null;
                throw th;
            }
        } catch (NullPointerException unused) {
            throw new IllegalArgumentException("activityContext is invalid");
        }
    }
}
