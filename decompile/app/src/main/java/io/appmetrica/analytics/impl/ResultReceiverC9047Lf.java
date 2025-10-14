package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* renamed from: io.appmetrica.analytics.impl.Lf */
/* loaded from: classes8.dex */
public final class ResultReceiverC9047Lf extends ResultReceiver {

    /* renamed from: a */
    public final InterfaceC9931vf f6940a;

    public ResultReceiverC9047Lf(Handler handler, InterfaceC9931vf interfaceC9931vf) {
        super(handler);
        this.f6940a = interfaceC9931vf;
    }

    /* renamed from: a */
    public static void m5357a(ResultReceiver resultReceiver, C8901Ff c8901Ff) {
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            bundle.putByteArray("referrer", c8901Ff == null ? null : c8901Ff.m5147a());
            resultReceiver.send(1, bundle);
        }
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        if (i == 1) {
            C8901Ff c8901Ff = null;
            try {
                byte[] byteArray = bundle.getByteArray("referrer");
                if (byteArray != null && byteArray.length != 0) {
                    c8901Ff = new C8901Ff(byteArray);
                }
            } catch (Throwable unused) {
            }
            this.f6940a.mo5002a(c8901Ff);
        }
    }
}
