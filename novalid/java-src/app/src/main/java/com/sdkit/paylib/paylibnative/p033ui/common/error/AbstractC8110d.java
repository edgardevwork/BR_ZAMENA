package com.sdkit.paylib.paylibnative.p033ui.common.error;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8030a;
import com.sdkit.paylib.paylibdomain.api.entity.PaymentStatusPayload;
import com.sdkit.paylib.paylibnative.p033ui.core.purchase.entity.C8162e;
import com.sdkit.paylib.paylibnative.p033ui.screens.deeplinkresult.EnumC8289c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibnative.ui.common.error.d */
/* loaded from: classes8.dex */
public abstract class AbstractC8110d {

    /* renamed from: a */
    public final boolean f1872a;

    /* renamed from: com.sdkit.paylib.paylibnative.ui.common.error.d$a */
    /* loaded from: classes5.dex */
    public static final class a extends AbstractC8110d {

        /* renamed from: b */
        public static final a f1873b = new a();

        public a() {
            super(false, null);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.common.error.d$b */
    /* loaded from: classes5.dex */
    public static final class b extends AbstractC8110d {

        /* renamed from: b */
        public final EnumC8289c f1874b;

        /* renamed from: c */
        public final boolean f1875c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(EnumC8289c state, boolean z) {
            super(z, null);
            Intrinsics.checkNotNullParameter(state, "state");
            this.f1874b = state;
            this.f1875c = z;
        }

        /* renamed from: a */
        public final EnumC8289c m1929a() {
            return this.f1874b;
        }

        /* renamed from: b */
        public boolean m1930b() {
            return this.f1875c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f1874b == bVar.f1874b && this.f1875c == bVar.f1875c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int iHashCode = this.f1874b.hashCode() * 31;
            boolean z = this.f1875c;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return iHashCode + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("WithDeeplinkResultState(state=");
            sb.append(this.f1874b);
            sb.append(", isLongPolling=");
            return C8030a.m1428a(sb, this.f1875c, ')');
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.common.error.d$c */
    /* loaded from: classes5.dex */
    public static final class c extends AbstractC8110d {

        /* renamed from: b */
        public final PaymentStatusPayload f1876b;

        /* renamed from: c */
        public final boolean f1877c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(PaymentStatusPayload payload, boolean z) {
            super(z, null);
            Intrinsics.checkNotNullParameter(payload, "payload");
            this.f1876b = payload;
            this.f1877c = z;
        }

        /* renamed from: a */
        public final PaymentStatusPayload m1931a() {
            return this.f1876b;
        }

        /* renamed from: b */
        public boolean m1932b() {
            return this.f1877c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.areEqual(this.f1876b, cVar.f1876b) && this.f1877c == cVar.f1877c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int iHashCode = this.f1876b.hashCode() * 31;
            boolean z = this.f1877c;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return iHashCode + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("WithPaymentStatusPayload(payload=");
            sb.append(this.f1876b);
            sb.append(", isLongPolling=");
            return C8030a.m1428a(sb, this.f1877c, ')');
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.common.error.d$d */
    /* loaded from: classes5.dex */
    public static final class d extends AbstractC8110d {

        /* renamed from: b */
        public final C8162e f1878b;

        /* renamed from: c */
        public final boolean f1879c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C8162e payload, boolean z) {
            super(z, null);
            Intrinsics.checkNotNullParameter(payload, "payload");
            this.f1878b = payload;
            this.f1879c = z;
        }

        /* renamed from: a */
        public final C8162e m1933a() {
            return this.f1878b;
        }

        /* renamed from: b */
        public boolean m1934b() {
            return this.f1879c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Intrinsics.areEqual(this.f1878b, dVar.f1878b) && this.f1879c == dVar.f1879c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int iHashCode = this.f1878b.hashCode() * 31;
            boolean z = this.f1879c;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return iHashCode + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("WithPurchaseStatePayload(payload=");
            sb.append(this.f1878b);
            sb.append(", isLongPolling=");
            return C8030a.m1428a(sb, this.f1879c, ')');
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.common.error.d$e */
    /* loaded from: classes5.dex */
    public static final class e extends AbstractC8110d {

        /* renamed from: b */
        public final Throwable f1880b;

        /* renamed from: c */
        public final boolean f1881c;

        public e(Throwable th, boolean z) {
            super(z, null);
            this.f1880b = th;
            this.f1881c = z;
        }

        /* renamed from: a */
        public final Throwable m1935a() {
            return this.f1880b;
        }

        /* renamed from: b */
        public boolean m1936b() {
            return this.f1881c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return Intrinsics.areEqual(this.f1880b, eVar.f1880b) && this.f1881c == eVar.f1881c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            Throwable th = this.f1880b;
            int iHashCode = (th == null ? 0 : th.hashCode()) * 31;
            boolean z = this.f1881c;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return iHashCode + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("WithThrowable(throwable=");
            sb.append(this.f1880b);
            sb.append(", isLongPolling=");
            return C8030a.m1428a(sb, this.f1881c, ')');
        }
    }

    public AbstractC8110d(boolean z) {
        this.f1872a = z;
    }

    public /* synthetic */ AbstractC8110d(boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(z);
    }
}
