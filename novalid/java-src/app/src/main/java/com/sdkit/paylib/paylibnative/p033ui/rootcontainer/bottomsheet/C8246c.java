package com.sdkit.paylib.paylibnative.p033ui.rootcontainer.bottomsheet;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.sdkit.paylib.paylibnative.ui.rootcontainer.bottomsheet.c */
/* loaded from: classes8.dex */
public final class C8246c {

    /* renamed from: a */
    public final Function0 f2534a;

    /* renamed from: b */
    public BottomSheetBehavior f2535b;

    /* renamed from: c */
    public boolean f2536c;

    /* renamed from: com.sdkit.paylib.paylibnative.ui.rootcontainer.bottomsheet.c$a */
    /* loaded from: classes5.dex */
    public final class a implements InterfaceC8245b {
        public a() {
        }

        @Override // com.sdkit.paylib.paylibnative.p033ui.rootcontainer.bottomsheet.InterfaceC8245b
        /* renamed from: a */
        public boolean mo2373a(float f) {
            return false;
        }

        @Override // com.sdkit.paylib.paylibnative.p033ui.rootcontainer.bottomsheet.InterfaceC8245b
        /* renamed from: a */
        public boolean mo2374a(int i) {
            BottomSheetBehavior bottomSheetBehavior;
            if (i != 1) {
                if (i != 5) {
                    return false;
                }
                C8246c.this.f2534a.invoke();
                return false;
            }
            if (C8246c.this.m2383b() || (bottomSheetBehavior = C8246c.this.f2535b) == null) {
                return false;
            }
            bottomSheetBehavior.setState(3);
            return false;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.rootcontainer.bottomsheet.c$b */
    /* loaded from: classes6.dex */
    public static final class b extends Lambda implements Function1 {

        /* renamed from: b */
        public final /* synthetic */ Integer f2539b;

        /* renamed from: c */
        public final /* synthetic */ View f2540c;

        /* renamed from: d */
        public final /* synthetic */ boolean f2541d;

        /* renamed from: e */
        public final /* synthetic */ boolean f2542e;

        /* renamed from: f */
        public final /* synthetic */ boolean f2543f;

        /* renamed from: com.sdkit.paylib.paylibnative.ui.rootcontainer.bottomsheet.c$b$a */
        /* loaded from: classes8.dex */
        public static final class a implements View.OnLayoutChangeListener {

            /* renamed from: a */
            public final /* synthetic */ BottomSheetBehavior f2544a;

            /* renamed from: b */
            public final /* synthetic */ boolean f2545b;

            /* renamed from: c */
            public final /* synthetic */ boolean f2546c;

            public a(BottomSheetBehavior bottomSheetBehavior, boolean z, boolean z2) {
                this.f2544a = bottomSheetBehavior;
                this.f2545b = z;
                this.f2546c = z2;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                Intrinsics.checkNotNullParameter(view, "view");
                view.removeOnLayoutChangeListener(this);
                BottomSheetBehavior bottomSheetBehavior = this.f2544a;
                bottomSheetBehavior.setState((!this.f2545b || this.f2546c || bottomSheetBehavior.isFitToContents()) ? 3 : 6);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Integer num, View view, boolean z, boolean z2, boolean z3) {
            super(1);
            this.f2539b = num;
            this.f2540c = view;
            this.f2541d = z;
            this.f2542e = z2;
            this.f2543f = z3;
        }

        /* renamed from: a */
        public final void m2384a(BottomSheetBehavior setBottomSheetBehavior) {
            Intrinsics.checkNotNullParameter(setBottomSheetBehavior, "$this$setBottomSheetBehavior");
            C8246c.this.f2535b = setBottomSheetBehavior;
            setBottomSheetBehavior.setHideable(true);
            setBottomSheetBehavior.setSkipCollapsed(true);
            Integer num = this.f2539b;
            if (num != null) {
                setBottomSheetBehavior.setPeekHeight(this.f2540c.getResources().getDimensionPixelSize(num.intValue()));
            }
            C8244a c8244a = new C8244a();
            boolean z = this.f2541d;
            View view = this.f2540c;
            boolean z2 = this.f2542e;
            C8246c c8246c = C8246c.this;
            if (z) {
                c8244a.m2372a(new C8247d(setBottomSheetBehavior, view, z2));
            }
            c8244a.m2372a(c8246c.new a());
            setBottomSheetBehavior.addBottomSheetCallback(c8244a);
            View view2 = this.f2540c;
            boolean z3 = this.f2541d;
            boolean z4 = this.f2543f;
            if (!ViewCompat.isLaidOut(view2) || view2.isLayoutRequested()) {
                view2.addOnLayoutChangeListener(new a(setBottomSheetBehavior, z3, z4));
            } else {
                setBottomSheetBehavior.setState((!z3 || z4 || setBottomSheetBehavior.isFitToContents()) ? 3 : 6);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m2384a((BottomSheetBehavior) obj);
            return Unit.INSTANCE;
        }
    }

    public C8246c(Function0 onHidden) {
        Intrinsics.checkNotNullParameter(onHidden, "onHidden");
        this.f2534a = onHidden;
        this.f2536c = true;
    }

    /* renamed from: a */
    public final void m2379a() {
        BottomSheetBehavior bottomSheetBehavior = this.f2535b;
        if (bottomSheetBehavior != null) {
            if (bottomSheetBehavior.getState() == 5) {
                this.f2534a.invoke();
            } else {
                bottomSheetBehavior.setHideable(true);
                bottomSheetBehavior.setState(5);
            }
        }
    }

    /* renamed from: b */
    public final boolean m2383b() {
        return this.f2536c;
    }

    /* renamed from: a */
    public final void m2380a(View view, Integer num, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(view, "view");
        m2381a(view, z3, new b(num, view, z3, z, z2));
    }

    /* renamed from: a */
    public final void m2381a(View view, boolean z, Function1 function1) {
        BottomSheetBehavior bottomSheetBehavior;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        }
        CoordinatorLayout.LayoutParams layoutParams2 = (CoordinatorLayout.LayoutParams) layoutParams;
        if (z) {
            bottomSheetBehavior = new BottomSheetWithHandleBehavior();
        } else {
            CoordinatorLayout.Behavior behavior = layoutParams2.getBehavior();
            bottomSheetBehavior = behavior instanceof BottomSheetBehavior ? (BottomSheetBehavior) behavior : null;
            if (bottomSheetBehavior == null) {
                bottomSheetBehavior = new BottomSheetBehavior();
            }
        }
        layoutParams2.setBehavior(bottomSheetBehavior);
        function1.invoke(bottomSheetBehavior);
        view.setLayoutParams(layoutParams2);
    }

    /* renamed from: a */
    public static /* synthetic */ void m2376a(C8246c c8246c, View view, Integer num, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        c8246c.m2380a(view, num, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? false : z3);
    }

    /* renamed from: a */
    public final void m2382a(boolean z) {
        this.f2536c = z;
    }
}
