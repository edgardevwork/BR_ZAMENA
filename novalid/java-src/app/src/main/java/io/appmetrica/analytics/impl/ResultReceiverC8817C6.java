package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* renamed from: io.appmetrica.analytics.impl.C6 */
/* loaded from: classes6.dex */
public final class ResultReceiverC8817C6 extends ResultReceiver {

    /* renamed from: a */
    public final InterfaceC8792B6 f6428a;

    public ResultReceiverC8817C6(Handler handler, InterfaceC8792B6 interfaceC8792B6) {
        super(handler);
        this.f6428a = interfaceC8792B6;
    }

    /* renamed from: a */
    public static void m5020a(ResultReceiver resultReceiver, C9595i4 c9595i4) {
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            c9595i4.m6276b(bundle);
            resultReceiver.send(1, bundle);
        }
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.f6428a.mo4934a(i, bundle);
    }

    /* renamed from: a */
    public static void m5019a(ResultReceiver resultReceiver, EnumC9100Nk enumC9100Nk, C9595i4 c9595i4) {
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("startup_error_key_code", enumC9100Nk.f7042a);
            c9595i4.m6276b(bundle);
            resultReceiver.send(2, bundle);
        }
    }
}
