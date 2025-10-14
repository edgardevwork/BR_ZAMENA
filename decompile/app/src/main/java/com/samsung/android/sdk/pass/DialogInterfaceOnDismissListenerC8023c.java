package com.samsung.android.sdk.pass;

import android.content.DialogInterface;
import com.samsung.android.sdk.pass.SpassFingerprint;

/* renamed from: com.samsung.android.sdk.pass.c */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnDismissListenerC8023c implements DialogInterface.OnDismissListener {

    /* renamed from: a */
    public final /* synthetic */ SpassFingerprint.C8020c f1002a;

    public DialogInterfaceOnDismissListenerC8023c(SpassFingerprint.C8020c c8020c) {
        this.f1002a = c8020c;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f1002a.m1425a();
    }
}
