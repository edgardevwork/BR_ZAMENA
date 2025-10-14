package com.sdkit.paylib.paylibnative.p033ui.widgets.sbolpay;

import com.sdkit.paylib.paylibnative.p033ui.domain.InterfaceC8218b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.sbolpay.a */
/* loaded from: classes6.dex */
public abstract class AbstractC8427a {

    /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.sbolpay.a$a */
    public static final class a extends AbstractC8427a implements InterfaceC8218b {

        /* renamed from: a */
        public final Throwable f3977a;

        public a(Throwable th) {
            super(null);
            this.f3977a = th;
        }

        @Override // com.sdkit.paylib.paylibnative.p033ui.domain.InterfaceC8218b
        /* renamed from: a */
        public Throwable mo2235a() {
            return this.f3977a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.f3977a, ((a) obj).f3977a);
        }

        public int hashCode() {
            Throwable th = this.f3977a;
            if (th == null) {
                return 0;
            }
            return th.hashCode();
        }

        public String toString() {
            return "Error(cause=" + this.f3977a + ')';
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.sbolpay.a$b */
    public static final class b extends AbstractC8427a {

        /* renamed from: a */
        public static final b f3978a = new b();

        public b() {
            super(null);
        }
    }

    public AbstractC8427a() {
    }

    public /* synthetic */ AbstractC8427a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
