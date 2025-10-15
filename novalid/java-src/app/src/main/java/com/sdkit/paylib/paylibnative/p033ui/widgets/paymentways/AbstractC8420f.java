package com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.paymentways.f */
/* loaded from: classes6.dex */
public abstract class AbstractC8420f {

    /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.paymentways.f$a */
    public static final class a extends AbstractC8420f {

        /* renamed from: a */
        public final Throwable f3905a;

        public a(Throwable th) {
            super(null);
            this.f3905a = th;
        }

        /* renamed from: a */
        public final Throwable m3673a() {
            return this.f3905a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.f3905a, ((a) obj).f3905a);
        }

        public int hashCode() {
            Throwable th = this.f3905a;
            if (th == null) {
                return 0;
            }
            return th.hashCode();
        }

        public String toString() {
            return "Error(cause=" + this.f3905a + ')';
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.paymentways.f$b */
    public static final class b extends AbstractC8420f {

        /* renamed from: a */
        public static final b f3906a = new b();

        public b() {
            super(null);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.paymentways.f$c */
    public static final class c extends AbstractC8420f {

        /* renamed from: a */
        public static final c f3907a = new c();

        public c() {
            super(null);
        }
    }

    public AbstractC8420f() {
    }

    public /* synthetic */ AbstractC8420f(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
