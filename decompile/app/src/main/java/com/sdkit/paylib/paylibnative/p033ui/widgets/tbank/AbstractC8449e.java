package com.sdkit.paylib.paylibnative.p033ui.widgets.tbank;

import com.sdkit.paylib.paylibnative.p033ui.domain.InterfaceC8218b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.tbank.e */
/* loaded from: classes6.dex */
public abstract class AbstractC8449e {

    /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.tbank.e$a */
    public static final class a extends AbstractC8449e implements InterfaceC8218b {

        /* renamed from: a */
        public final Throwable f4073a;

        public a(Throwable th) {
            super(null);
            this.f4073a = th;
        }

        @Override // com.sdkit.paylib.paylibnative.p033ui.domain.InterfaceC8218b
        /* renamed from: a */
        public Throwable mo2235a() {
            return this.f4073a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.f4073a, ((a) obj).f4073a);
        }

        public int hashCode() {
            Throwable th = this.f4073a;
            if (th == null) {
                return 0;
            }
            return th.hashCode();
        }

        public String toString() {
            return "Error(cause=" + this.f4073a + ')';
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.tbank.e$b */
    public static final class b extends AbstractC8449e {

        /* renamed from: a */
        public static final b f4074a = new b();

        public b() {
            super(null);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.tbank.e$c */
    public static final class c extends AbstractC8449e {

        /* renamed from: a */
        public static final c f4075a = new c();

        public c() {
            super(null);
        }
    }

    public AbstractC8449e() {
    }

    public /* synthetic */ AbstractC8449e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
