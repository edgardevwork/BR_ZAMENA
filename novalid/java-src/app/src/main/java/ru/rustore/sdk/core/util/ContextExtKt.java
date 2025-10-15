package ru.rustore.sdk.core.util;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.util.Log;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ContextExt.kt */
@Metadata(m7104d1 = {"\u0000(\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0001\u001a \u0010\u0006\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u001a \u0010\n\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u001a\u0014\u0010\f\u001a\u00020\u0007*\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u000e\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m7105d2 = {"TAG", "", "isAppInstalled", "", "Landroid/content/Context;", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "openApp", "", "onFail", "Lkotlin/Function0;", "openUrl", "url", "unbindServiceSafely", "serviceConnection", "Landroid/content/ServiceConnection;", "sdk-public-core_release"}, m7106k = 2, m7107mv = {1, 7, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public final class ContextExtKt {

    @NotNull
    public static final String TAG = "ServiceExt";

    public static final void openUrl(@NotNull Context context, @NotNull String url, @NotNull Function0<Unit> onFail) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(onFail, "onFail");
        try {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(url)));
        } catch (ActivityNotFoundException unused) {
            onFail.invoke();
        }
    }

    public static final void openApp(@NotNull Context context, @NotNull String packageName, @NotNull Function0<Unit> onFail) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(onFail, "onFail");
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(packageName);
        if (launchIntentForPackage == null) {
            return;
        }
        try {
            context.startActivity(launchIntentForPackage);
        } catch (ActivityNotFoundException unused) {
            onFail.invoke();
        }
    }

    public static final boolean isAppInstalled(@NotNull Context context, @NotNull String packageName) throws PackageManager.NameNotFoundException {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        try {
            context.getPackageManager().getPackageInfo(packageName, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static final void unbindServiceSafely(@NotNull Context context, @Nullable ServiceConnection serviceConnection) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        if (serviceConnection != null) {
            try {
                context.unbindService(serviceConnection);
            } catch (Throwable th) {
                Log.e(TAG, "unbindServiceSafely", th);
            }
        }
    }
}
