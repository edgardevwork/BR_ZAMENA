package ru.rustore.sdk.activitylauncher;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.fragment.app.FragmentStateManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.ivy.osgi.core.BundleInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.activitylauncher.ActivityLauncherResult;

/* compiled from: RuStoreActivityLauncher.kt */
@Metadata(m7104d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0005¢\u0006\u0002\u0010\u0002J\"\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014J\u0012\u0010\u000e\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\u001a\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0010H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m7105d2 = {"Lru/rustore/sdk/activitylauncher/RuStoreActivityLauncher;", "Landroid/app/Activity;", "()V", "activityLauncherAnalytics", "Lru/rustore/sdk/activitylauncher/ActivityLauncherAnalytics;", "resultReceiver", "Landroid/os/ResultReceiver;", "onActivityResult", "", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreate", FragmentStateManager.SAVED_INSTANCE_STATE_KEY, "Landroid/os/Bundle;", "sendResult", "code", BundleInfo.BUNDLE_TYPE, "Companion", "sdk-public-activitylauncher_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
/* loaded from: classes6.dex */
public final class RuStoreActivityLauncher extends Activity {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String KEY_CONFIRMATION_PENDING_INTENT = "CONFIRMATION_PENDING_INTENT";

    @NotNull
    public static final String KEY_RESULT_RECEIVER = "RESULT_RECEIVER";
    public static final int RC_CONFIRM = 0;
    public ActivityLauncherAnalytics activityLauncherAnalytics;
    public ResultReceiver resultReceiver;

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) throws IntentSender.SendIntentException {
        Object parcelableExtra;
        Object parcelableExtra2;
        super.onCreate(bundle);
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "this.applicationContext");
        this.activityLauncherAnalytics = new ActivityLauncherAnalytics(applicationContext);
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "intent");
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            parcelableExtra = intent.getParcelableExtra(KEY_RESULT_RECEIVER, ResultReceiver.class);
            if (parcelableExtra == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        } else {
            parcelableExtra = intent.getParcelableExtra(KEY_RESULT_RECEIVER);
            if (parcelableExtra == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        this.resultReceiver = (ResultReceiver) parcelableExtra;
        if (bundle == null) {
            Intent intent2 = getIntent();
            Intrinsics.checkNotNullExpressionValue(intent2, "intent");
            if (i >= 33) {
                parcelableExtra2 = intent2.getParcelableExtra(KEY_CONFIRMATION_PENDING_INTENT, PendingIntent.class);
                if (parcelableExtra2 == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            } else {
                parcelableExtra2 = intent2.getParcelableExtra(KEY_CONFIRMATION_PENDING_INTENT);
                if (parcelableExtra2 == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            try {
                startIntentSenderForResult(((PendingIntent) parcelableExtra2).getIntentSender(), 0, null, 0, 0, 0);
            } catch (ActivityNotFoundException e) {
                ActivityLauncherAnalytics activityLauncherAnalytics = this.activityLauncherAnalytics;
                if (activityLauncherAnalytics == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("activityLauncherAnalytics");
                    activityLauncherAnalytics = null;
                }
                activityLauncherAnalytics.sendExceptionActivityStart(e);
                sendResult(ActivityLauncherResult.ActivityNotFound.INSTANCE.getCode(), null);
            } catch (IntentSender.SendIntentException e2) {
                ActivityLauncherAnalytics activityLauncherAnalytics2 = this.activityLauncherAnalytics;
                if (activityLauncherAnalytics2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("activityLauncherAnalytics");
                    activityLauncherAnalytics2 = null;
                }
                activityLauncherAnalytics2.sendExceptionActivityStart(e2);
                sendResult(ActivityLauncherResult.ActivitySendIntentError.INSTANCE.getCode(), null);
            } catch (Exception e3) {
                ActivityLauncherAnalytics activityLauncherAnalytics3 = this.activityLauncherAnalytics;
                if (activityLauncherAnalytics3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("activityLauncherAnalytics");
                    activityLauncherAnalytics3 = null;
                }
                activityLauncherAnalytics3.sendExceptionActivityStart(e3);
                sendResult(ActivityLauncherResult.ActivityUnknownError.INSTANCE.getCode(), null);
            }
        }
    }

    @Override // android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 0) {
            sendResult(resultCode, data != null ? data.getExtras() : null);
        }
    }

    public final void sendResult(int code, Bundle bundle) {
        ResultReceiver resultReceiver = this.resultReceiver;
        if (resultReceiver == null) {
            Intrinsics.throwUninitializedPropertyAccessException("resultReceiver");
            resultReceiver = null;
        }
        resultReceiver.send(code, bundle);
        finish();
    }

    /* compiled from: RuStoreActivityLauncher.kt */
    @Metadata(m7104d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J%\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tH\u0000¢\u0006\u0002\b\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m7105d2 = {"Lru/rustore/sdk/activitylauncher/RuStoreActivityLauncher$Companion;", "", "()V", "KEY_CONFIRMATION_PENDING_INTENT", "", "KEY_RESULT_RECEIVER", "RC_CONFIRM", "", "getIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "resultReceiver", "Landroid/os/ResultReceiver;", "confirmationIntent", "getIntent$sdk_public_activitylauncher_release", "sdk-public-activitylauncher_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final Intent getIntent$sdk_public_activitylauncher_release(@NotNull Context context, @NotNull ResultReceiver resultReceiver, @NotNull Intent confirmationIntent) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(resultReceiver, "resultReceiver");
            Intrinsics.checkNotNullParameter(confirmationIntent, "confirmationIntent");
            Intent intent = new Intent(context, (Class<?>) RuStoreActivityLauncher.class);
            if (!(context instanceof Activity)) {
                intent.setFlags(268435456);
            }
            intent.putExtra(RuStoreActivityLauncher.KEY_RESULT_RECEIVER, resultReceiver);
            intent.putExtra(RuStoreActivityLauncher.KEY_CONFIRMATION_PENDING_INTENT, PendingIntent.getActivity(context, 0, confirmationIntent, 1140850688));
            return intent;
        }
    }
}
