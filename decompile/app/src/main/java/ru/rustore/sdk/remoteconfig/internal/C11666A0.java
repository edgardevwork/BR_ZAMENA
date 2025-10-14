package ru.rustore.sdk.remoteconfig.internal;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ru.rustore.sdk.remoteconfig.internal.A0 */
/* loaded from: classes5.dex */
public final class C11666A0 {

    /* renamed from: a */
    public final Context f10724a;

    public C11666A0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f10724a = context;
    }

    /* renamed from: a */
    public final void m7506a(String segmentsJsonString) {
        Intrinsics.checkNotNullParameter(segmentsJsonString, "segmentsJsonString");
        Intent intent = new Intent();
        intent.setPackage(this.f10724a.getPackageName());
        intent.setAction("ru.rustore.sdk.remoteconfig.SEGMENT_HANDLED");
        intent.putExtra("payload", segmentsJsonString);
        this.f10724a.sendBroadcast(intent);
    }
}
