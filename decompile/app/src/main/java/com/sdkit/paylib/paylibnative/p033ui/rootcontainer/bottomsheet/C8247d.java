package com.sdkit.paylib.paylibnative.p033ui.rootcontainer.bottomsheet;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;

/* renamed from: com.sdkit.paylib.paylibnative.ui.rootcontainer.bottomsheet.d */
/* loaded from: classes5.dex */
public final class C8247d implements InterfaceC8245b {

    /* renamed from: a */
    public final BottomSheetBehavior f2547a;

    /* renamed from: b */
    public final View f2548b;

    /* renamed from: c */
    public final boolean f2549c;

    /* renamed from: d */
    public float f2550d;

    /* renamed from: e */
    public Integer f2551e;

    /* renamed from: f */
    public boolean f2552f;

    /* renamed from: g */
    public boolean f2553g;

    /* renamed from: h */
    public int f2554h;

    /* renamed from: i */
    public int f2555i;

    /* renamed from: j */
    public boolean f2556j;

    /* renamed from: k */
    public boolean f2557k;

    /* renamed from: com.sdkit.paylib.paylibnative.ui.rootcontainer.bottomsheet.d$a */
    /* loaded from: classes8.dex */
    public static final class a implements View.OnLayoutChangeListener {
        public a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            Intrinsics.checkNotNullParameter(view, "view");
            view.removeOnLayoutChangeListener(this);
            C8247d c8247d = C8247d.this;
            c8247d.f2555i = c8247d.f2548b.getHeight();
            C8247d c8247d2 = C8247d.this;
            Object parent = c8247d2.f2548b.getParent();
            Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.View");
            c8247d2.f2554h = ((View) parent).getHeight();
            C8247d c8247d3 = C8247d.this;
            int i9 = c8247d3.f2554h;
            int i10 = C8247d.this.f2555i;
            c8247d3.f2552f = i10 >= 0 && i10 < i9;
            if (C8247d.this.f2552f) {
                C8247d.this.f2547a.setHalfExpandedRatio(C8247d.this.f2555i / C8247d.this.f2554h);
            }
            C8247d.this.f2547a.setFitToContents(!C8247d.this.f2552f);
        }
    }

    public C8247d(BottomSheetBehavior bottomSheetBehavior, View bottomSheet, boolean z) {
        Intrinsics.checkNotNullParameter(bottomSheetBehavior, "bottomSheetBehavior");
        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        this.f2547a = bottomSheetBehavior;
        this.f2548b = bottomSheet;
        this.f2549c = z;
        this.f2554h = -1;
        this.f2555i = -1;
        if (!ViewCompat.isLaidOut(bottomSheet) || bottomSheet.isLayoutRequested()) {
            bottomSheet.addOnLayoutChangeListener(new a());
            return;
        }
        this.f2555i = this.f2548b.getHeight();
        Object parent = this.f2548b.getParent();
        Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.View");
        this.f2554h = ((View) parent).getHeight();
        int i = this.f2554h;
        int i2 = this.f2555i;
        this.f2552f = i2 >= 0 && i2 < i;
        if (this.f2552f) {
            this.f2547a.setHalfExpandedRatio(this.f2555i / this.f2554h);
        }
        this.f2547a.setFitToContents(!this.f2552f);
    }

    /* renamed from: a */
    public final int m2393a() {
        return this.f2547a.getState();
    }

    /* renamed from: b */
    public final void m2394b(int i) {
        BottomSheetBehavior bottomSheetBehavior;
        boolean z;
        if (i == 3) {
            bottomSheetBehavior = this.f2547a;
            z = false;
        } else if (i == 4) {
            m2395c(6);
            return;
        } else {
            if (i != 6) {
                return;
            }
            bottomSheetBehavior = this.f2547a;
            z = true;
        }
        bottomSheetBehavior.setHideable(z);
    }

    /* renamed from: c */
    public final void m2395c(int i) {
        this.f2547a.setState(i);
    }

    /* renamed from: d */
    public final boolean m2396d(int i) {
        Integer num = this.f2551e;
        if (num != null && num.intValue() == i) {
            num = null;
        }
        if (num != null) {
            m2395c(num.intValue());
            if (i != m2393a()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.rootcontainer.bottomsheet.InterfaceC8245b
    /* renamed from: a */
    public boolean mo2373a(float f) {
        if (this.f2552f) {
            View view = this.f2548b;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            float fMax = Math.max(f, 0.0f);
            int i = this.f2554h;
            layoutParams.height = MathKt__MathJVMKt.roundToInt(this.f2555i + (fMax * (i - r4)));
            view.setLayoutParams(layoutParams);
        }
        this.f2550d = f;
        return false;
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.rootcontainer.bottomsheet.InterfaceC8245b
    /* renamed from: a */
    public boolean mo2374a(int i) {
        boolean zM2396d;
        if (!this.f2552f) {
            return false;
        }
        if (this.f2549c) {
            m2394b(i);
        }
        if (i == 1) {
            zM2396d = false;
        } else if ((this.f2557k || (this.f2556j && i != 2)) && m2396d(i)) {
            zM2396d = true;
        } else {
            Integer num = null;
            if (i == 2 && this.f2556j) {
                float f = this.f2550d;
                if (f == 0.0f || this.f2553g) {
                    num = 6;
                } else if (f > 0.0f) {
                    num = 3;
                } else if (f < 0.0f) {
                    num = 5;
                }
                this.f2551e = num;
                zM2396d = m2396d(i);
            } else {
                if (i == 3) {
                    this.f2553g = true;
                    num = 6;
                } else {
                    if (i == 6) {
                        this.f2553g = false;
                    }
                    zM2396d = false;
                }
                this.f2551e = num;
                zM2396d = false;
            }
        }
        this.f2557k = i == 2 && this.f2556j;
        this.f2556j = i == 1;
        return zM2396d;
    }
}
