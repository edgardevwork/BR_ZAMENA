package com.sdkit.paylib.paylibnative.p033ui.launcher;

import android.app.Activity;
import kotlin.Metadata;

/* loaded from: classes8.dex */
public interface InternalLauncher {

    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void showPaylib$default(InternalLauncher internalLauncher, Activity activity, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showPaylib");
            }
            if ((i & 1) != 0) {
                activity = null;
            }
            internalLauncher.mo2244a(activity);
        }
    }

    /* renamed from: a */
    void mo2244a(Activity activity);
}
