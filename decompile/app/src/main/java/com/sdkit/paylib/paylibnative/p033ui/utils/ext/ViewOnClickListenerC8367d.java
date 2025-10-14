package com.sdkit.paylib.paylibnative.p033ui.utils.ext;

import android.os.SystemClock;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibnative.ui.utils.ext.d */
/* loaded from: classes5.dex */
public final class ViewOnClickListenerC8367d implements View.OnClickListener {

    /* renamed from: a */
    public final View.OnClickListener f3671a;

    /* renamed from: b */
    public long f3672b;

    public ViewOnClickListenerC8367d(View.OnClickListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f3671a = listener;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - this.f3672b < 300) {
            return;
        }
        this.f3672b = jElapsedRealtime;
        this.f3671a.onClick(v);
    }
}
