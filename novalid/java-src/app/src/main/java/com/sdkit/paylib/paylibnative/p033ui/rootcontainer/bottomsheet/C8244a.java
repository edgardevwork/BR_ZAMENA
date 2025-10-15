package com.sdkit.paylib.paylibnative.p033ui.rootcontainer.bottomsheet;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibnative.ui.rootcontainer.bottomsheet.a */
/* loaded from: classes5.dex */
public final class C8244a extends BottomSheetBehavior.BottomSheetCallback {

    /* renamed from: a */
    public final List f2533a = new ArrayList();

    /* renamed from: a */
    public final void m2372a(InterfaceC8245b callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f2533a.add(callback);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
    public void onSlide(View bottomSheet, float f) {
        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        List list = this.f2533a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext() && !((InterfaceC8245b) it.next()).mo2373a(f)) {
        }
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
    public void onStateChanged(View bottomSheet, int i) {
        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        List list = this.f2533a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext() && !((InterfaceC8245b) it.next()).mo2374a(i)) {
        }
    }
}
