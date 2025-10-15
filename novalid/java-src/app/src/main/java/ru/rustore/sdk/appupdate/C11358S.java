package ru.rustore.sdk.appupdate;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.appupdate.model.InstallState;

/* renamed from: ru.rustore.sdk.appupdate.S */
/* loaded from: classes6.dex */
public final class C11358S extends BroadcastReceiver {

    /* renamed from: a */
    @NotNull
    public final C11356Q f10061a;

    public C11358S(@NotNull C11356Q installStateProvider) {
        Intrinsics.checkNotNullParameter(installStateProvider, "installStateProvider");
        this.f10061a = installStateProvider;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(@NotNull Context context, @NotNull Intent intent) {
        InstallState state;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        Bundle extras = intent.getExtras();
        if (extras == null || (state = InstallState.INSTANCE.of$sdk_public_appupdate_release(extras)) == null) {
            return;
        }
        C11356Q c11356q = this.f10061a;
        c11356q.getClass();
        Intrinsics.checkNotNullParameter(state, "state");
        c11356q.f10059a.setValue(state);
    }
}
