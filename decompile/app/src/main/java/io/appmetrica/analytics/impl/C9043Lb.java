package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.coreapi.internal.control.ToggleObserver;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.Lb */
/* loaded from: classes6.dex */
public final class C9043Lb implements InterfaceC8971Ib, ToggleObserver {

    /* renamed from: a */
    public final ArrayList f6931a = new ArrayList();

    /* renamed from: b */
    public final IHandlerExecutor f6932b = C9676la.m6362h().m6384u().m6968c();

    /* renamed from: c */
    public C9006Jm f6933c;

    /* renamed from: d */
    public boolean f6934d;

    /* renamed from: a */
    public final void m5349a(@Nullable Toggle toggle) {
        C9006Jm c9006Jm = new C9006Jm(toggle);
        this.f6933c = c9006Jm;
        c9006Jm.f6845c.registerObserver(this, true);
    }

    /* renamed from: b */
    public final void m5353b(@NotNull Object obj) {
        C9006Jm c9006Jm = this.f6933c;
        if (c9006Jm == null) {
            Intrinsics.throwUninitializedPropertyAccessException("togglesHolder");
            c9006Jm = null;
        }
        c9006Jm.f6844b.m5013b(obj);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.ToggleObserver
    public final void onStateChanged(final boolean z) {
        this.f6932b.execute(new Runnable() { // from class: io.appmetrica.analytics.impl.Lb$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                C9043Lb.m5348a(this.f$0, z);
            }
        });
    }

    /* renamed from: a */
    public final void m5350a(@NotNull final LocationControllerObserver locationControllerObserver, final boolean z) {
        this.f6932b.execute(new Runnable() { // from class: io.appmetrica.analytics.impl.Lb$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C9043Lb.m5347a(this.f$0, locationControllerObserver, z);
            }
        });
    }

    /* renamed from: a */
    public static final void m5347a(C9043Lb c9043Lb, LocationControllerObserver locationControllerObserver, boolean z) {
        c9043Lb.f6931a.add(locationControllerObserver);
        if (z) {
            if (c9043Lb.f6934d) {
                locationControllerObserver.startLocationTracking();
            } else {
                locationControllerObserver.stopLocationTracking();
            }
        }
    }

    /* renamed from: a */
    public static final void m5348a(C9043Lb c9043Lb, boolean z) {
        if (c9043Lb.f6934d != z) {
            c9043Lb.f6934d = z;
            Function1 function1 = z ? C8995Jb.f6817a : C9019Kb.f6883a;
            Iterator it = c9043Lb.f6931a.iterator();
            while (it.hasNext()) {
                function1.invoke((LocationControllerObserver) it.next());
            }
        }
    }

    /* renamed from: a */
    public final void m5351a(@NotNull Object obj) {
        C9006Jm c9006Jm = this.f6933c;
        if (c9006Jm == null) {
            Intrinsics.throwUninitializedPropertyAccessException("togglesHolder");
            c9006Jm = null;
        }
        c9006Jm.f6844b.m5012a(obj);
    }

    /* renamed from: a */
    public final void m5352a(boolean z) {
        C9006Jm c9006Jm = this.f6933c;
        if (c9006Jm == null) {
            Intrinsics.throwUninitializedPropertyAccessException("togglesHolder");
            c9006Jm = null;
        }
        c9006Jm.f6843a.m5701a(z);
    }
}
