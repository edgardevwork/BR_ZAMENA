package ru.rustore.sdk.activitylauncher;

import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ContextExtension.kt */
@Metadata(m7104d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m7105d2 = {"openActivityForResult", "", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "callback", "Lru/rustore/sdk/activitylauncher/OnReceiveResultCallback;", "sdk-public-activitylauncher_release"}, m7106k = 2, m7107mv = {1, 7, 0}, m7109xi = 48)
/* loaded from: classes6.dex */
public final class ContextExtensionKt {
    public static final void openActivityForResult(@NotNull Context context, @NotNull Intent intent, @NotNull OnReceiveResultCallback callback) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(callback, "callback");
        context.startActivity(RuStoreActivityLauncher.INSTANCE.getIntent$sdk_public_activitylauncher_release(context, new CallbackResultReceiver(callback), intent));
    }
}
