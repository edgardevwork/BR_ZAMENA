package ru.rustore.sdk.metrics.internal;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.metrics.MetricsClient;

/* renamed from: ru.rustore.sdk.metrics.internal.X */
/* loaded from: classes8.dex */
public final class C11605X {

    /* renamed from: c */
    public static final a f10657c = new a();

    /* renamed from: d */
    public static C11605X f10658d;

    /* renamed from: a */
    public final C11602U f10659a;

    /* renamed from: b */
    public final MetricsClient f10660b;

    /* renamed from: ru.rustore.sdk.metrics.internal.X$a */
    public static final class a {
        /* renamed from: a */
        public final C11605X m7492a(Context context) {
            C11605X c11605x;
            Intrinsics.checkNotNullParameter(context, "context");
            synchronized (this) {
                c11605x = C11605X.f10658d;
                if (c11605x == null) {
                    Context applicationContext = context.getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
                    c11605x = new C11605X(applicationContext);
                    C11605X.f10658d = c11605x;
                }
            }
            return c11605x;
        }
    }

    /* renamed from: ru.rustore.sdk.metrics.internal.X$b */
    /* loaded from: classes7.dex */
    public static final class b implements InterfaceC11620g {
        @Override // ru.rustore.sdk.metrics.internal.InterfaceC11620g
        /* renamed from: a */
        public final void mo7493a(Function0<String> messageBuilder) {
            Intrinsics.checkNotNullParameter(messageBuilder, "messageBuilder");
        }
    }

    public C11605X(Context context) {
        C11607Z c11607z = new C11607Z();
        b bVar = new b();
        C11606Y c11606y = new C11606Y(context);
        C11596N c11596n = new C11596N(new C11591I(new C11628o(context, new C11584B(new C11641w(), new C11642x(), new C11644z(new C11609a0()), new C11583A())), bVar), new C11593K(new C11638t(), new C11613c0()), new C11594L(new C11638t()), bVar);
        C11602U c11602u = new C11602U(c11596n, new C11601T(c11596n, new C11600S(new C11611b0(c11606y, new C11613c0()), new C11585C(context), new C11597O(new C11637s(new C11610b(), new C11599Q(), bVar)), new C11617e0(context))));
        this.f10659a = c11602u;
        this.f10660b = new MetricsClient(new C11627n(c11602u, new C11612c(c11596n), new C11603V(context, new C11614d(new C11618f(new C11616e()))), c11607z, bVar));
    }
}
