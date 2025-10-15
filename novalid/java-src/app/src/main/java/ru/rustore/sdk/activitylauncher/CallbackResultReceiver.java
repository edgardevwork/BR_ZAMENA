package ru.rustore.sdk.activitylauncher;

import android.os.Bundle;
import android.os.ResultReceiver;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CallbackResultReceiver.kt */
@Metadata(m7104d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m7105d2 = {"Lru/rustore/sdk/activitylauncher/CallbackResultReceiver;", "Landroid/os/ResultReceiver;", "callback", "Lru/rustore/sdk/activitylauncher/OnReceiveResultCallback;", "(Lru/rustore/sdk/activitylauncher/OnReceiveResultCallback;)V", "onReceiveResult", "", "resultCode", "", "resultData", "Landroid/os/Bundle;", "sdk-public-activitylauncher_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
/* loaded from: classes6.dex */
public final class CallbackResultReceiver extends ResultReceiver {

    @NotNull
    public final OnReceiveResultCallback callback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallbackResultReceiver(@NotNull OnReceiveResultCallback callback) {
        super(null);
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.callback = callback;
    }

    @Override // android.os.ResultReceiver
    public void onReceiveResult(int resultCode, @Nullable Bundle resultData) {
        super.onReceiveResult(resultCode, resultData);
        this.callback.onReceiveResult(new ActivityLauncherResultMapper().toActivityLauncherResult(resultCode), resultData);
    }
}
