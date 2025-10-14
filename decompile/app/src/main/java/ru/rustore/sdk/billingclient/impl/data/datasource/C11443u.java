package ru.rustore.sdk.billingclient.impl.data.datasource;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.activitylauncher.ActivityLauncherResult;
import ru.rustore.sdk.activitylauncher.ContextExtensionKt;
import ru.rustore.sdk.activitylauncher.OnReceiveResultCallback;
import ru.rustore.sdk.billingclient.impl.presentation.auth.AuthActivity;

/* renamed from: ru.rustore.sdk.billingclient.impl.data.datasource.u */
/* loaded from: classes5.dex */
public final class C11443u {

    /* renamed from: a */
    public final Context f10233a;

    public C11443u(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f10233a = context;
    }

    /* renamed from: a */
    public final void m7446a() {
        Context context = this.f10233a;
        int i = AuthActivity.f10549a;
        Intrinsics.checkNotNullParameter(context, "context");
        Intent intent = new Intent(context, (Class<?>) AuthActivity.class);
        intent.setFlags(268435456);
        ContextExtensionKt.openActivityForResult(context, intent, new OnReceiveResultCallback() { // from class: ru.rustore.sdk.billingclient.impl.data.datasource.u$$ExternalSyntheticLambda0
            @Override // ru.rustore.sdk.activitylauncher.OnReceiveResultCallback
            public final void onReceiveResult(ActivityLauncherResult activityLauncherResult, Bundle bundle) {
                C11443u.m7445a(activityLauncherResult, bundle);
            }
        });
    }

    /* renamed from: a */
    public static final void m7445a(ActivityLauncherResult activityLauncherResult, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activityLauncherResult, "<anonymous parameter 0>");
    }
}
