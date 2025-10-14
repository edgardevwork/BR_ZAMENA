package com.sdkit.paylib.paylibnative.p033ui.launcher.domain;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8031b;
import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import com.sdkit.paylib.paylibdomain.api.entity.FinishReason;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibnative.ui.launcher.domain.k */
/* loaded from: classes8.dex */
public abstract class AbstractC8237k {

    /* renamed from: com.sdkit.paylib.paylibnative.ui.launcher.domain.k$a */
    /* loaded from: classes5.dex */
    public static abstract class a extends AbstractC8237k {

        /* renamed from: com.sdkit.paylib.paylibnative.ui.launcher.domain.k$a$a, reason: collision with other inner class name */
        public static final class C11912a extends b {

            /* renamed from: a */
            public final String f2468a;

            /* renamed from: b */
            public final String f2469b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C11912a(String applicationId, String str) {
                super(null);
                Intrinsics.checkNotNullParameter(applicationId, "applicationId");
                this.f2468a = applicationId;
                this.f2469b = str;
            }

            /* renamed from: a */
            public final String m2299a() {
                return this.f2468a;
            }

            /* renamed from: b */
            public final String m2300b() {
                return this.f2469b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C11912a)) {
                    return false;
                }
                C11912a c11912a = (C11912a) obj;
                return Intrinsics.areEqual(this.f2468a, c11912a.f2468a) && Intrinsics.areEqual(this.f2469b, c11912a.f2469b);
            }

            public int hashCode() {
                int iHashCode = this.f2468a.hashCode() * 31;
                String str = this.f2469b;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("ApplicationFlowArgs(applicationId=");
                sb.append(this.f2468a);
                sb.append(", developerPayload=");
                return C8032c.m1430a(sb, this.f2469b, ')');
            }
        }

        /* renamed from: com.sdkit.paylib.paylibnative.ui.launcher.domain.k$a$b */
        public static final class b extends a {

            /* renamed from: a */
            public final String f2470a;

            /* renamed from: b */
            public final String f2471b;

            /* renamed from: c */
            public final Integer f2472c;

            /* renamed from: d */
            public final C11912a f2473d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, String str2, Integer num, C11912a flowArgs) {
                super(null);
                Intrinsics.checkNotNullParameter(flowArgs, "flowArgs");
                this.f2470a = str;
                this.f2471b = str2;
                this.f2472c = num;
                this.f2473d = flowArgs;
            }

            @Override // com.sdkit.paylib.paylibnative.p033ui.launcher.domain.AbstractC8237k.a
            /* renamed from: a */
            public C11912a mo2298a() {
                return this.f2473d;
            }

            /* renamed from: b */
            public final Integer m2301b() {
                return this.f2472c;
            }

            /* renamed from: c */
            public final String m2302c() {
                return this.f2470a;
            }

            /* renamed from: d */
            public final String m2303d() {
                return this.f2471b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return Intrinsics.areEqual(this.f2470a, bVar.f2470a) && Intrinsics.areEqual(this.f2471b, bVar.f2471b) && Intrinsics.areEqual(this.f2472c, bVar.f2472c) && Intrinsics.areEqual(this.f2473d, bVar.f2473d);
            }

            public int hashCode() {
                String str = this.f2470a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.f2471b;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                Integer num = this.f2472c;
                return this.f2473d.hashCode() + ((iHashCode2 + (num != null ? num.hashCode() : 0)) * 31);
            }

            public String toString() {
                return "Failed(invoiceId=" + this.f2470a + ", purchaseId=" + this.f2471b + ", errorCode=" + this.f2472c + ", flowArgs=" + this.f2473d + ')';
            }
        }

        /* renamed from: com.sdkit.paylib.paylibnative.ui.launcher.domain.k$a$c */
        public static final class c extends a {

            /* renamed from: a */
            public final String f2474a;

            /* renamed from: b */
            public final String f2475b;

            /* renamed from: c */
            public final FinishReason f2476c;

            /* renamed from: d */
            public final C11912a f2477d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String invoiceId, String purchaseId, FinishReason finishReason, C11912a flowArgs) {
                super(null);
                Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
                Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
                Intrinsics.checkNotNullParameter(finishReason, "finishReason");
                Intrinsics.checkNotNullParameter(flowArgs, "flowArgs");
                this.f2474a = invoiceId;
                this.f2475b = purchaseId;
                this.f2476c = finishReason;
                this.f2477d = flowArgs;
            }

            @Override // com.sdkit.paylib.paylibnative.p033ui.launcher.domain.AbstractC8237k.a
            /* renamed from: a */
            public C11912a mo2298a() {
                return this.f2477d;
            }

            /* renamed from: b */
            public final FinishReason m2304b() {
                return this.f2476c;
            }

            /* renamed from: c */
            public final String m2305c() {
                return this.f2474a;
            }

            /* renamed from: d */
            public final String m2306d() {
                return this.f2475b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return Intrinsics.areEqual(this.f2474a, cVar.f2474a) && Intrinsics.areEqual(this.f2475b, cVar.f2475b) && Intrinsics.areEqual(this.f2476c, cVar.f2476c) && Intrinsics.areEqual(this.f2477d, cVar.f2477d);
            }

            public int hashCode() {
                return this.f2477d.hashCode() + ((this.f2476c.hashCode() + C8031b.m1429a(this.f2475b, this.f2474a.hashCode() * 31, 31)) * 31);
            }

            public String toString() {
                return "Finishing(invoiceId=" + this.f2474a + ", purchaseId=" + this.f2475b + ", finishReason=" + this.f2476c + ", flowArgs=" + this.f2477d + ')';
            }
        }

        /* renamed from: com.sdkit.paylib.paylibnative.ui.launcher.domain.k$a$d */
        public static final class d extends a {

            /* renamed from: a */
            public final String f2478a;

            /* renamed from: b */
            public final String f2479b;

            /* renamed from: c */
            public final C11912a f2480c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(String invoiceId, String purchaseId, C11912a flowArgs) {
                super(null);
                Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
                Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
                Intrinsics.checkNotNullParameter(flowArgs, "flowArgs");
                this.f2478a = invoiceId;
                this.f2479b = purchaseId;
                this.f2480c = flowArgs;
            }

            @Override // com.sdkit.paylib.paylibnative.p033ui.launcher.domain.AbstractC8237k.a
            /* renamed from: a */
            public C11912a mo2298a() {
                return this.f2480c;
            }

            /* renamed from: b */
            public final String m2307b() {
                return this.f2478a;
            }

            /* renamed from: c */
            public final String m2308c() {
                return this.f2479b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return Intrinsics.areEqual(this.f2478a, dVar.f2478a) && Intrinsics.areEqual(this.f2479b, dVar.f2479b) && Intrinsics.areEqual(this.f2480c, dVar.f2480c);
            }

            public int hashCode() {
                return this.f2480c.hashCode() + C8031b.m1429a(this.f2479b, this.f2478a.hashCode() * 31, 31);
            }

            public String toString() {
                return "InvoiceCreated(invoiceId=" + this.f2478a + ", purchaseId=" + this.f2479b + ", flowArgs=" + this.f2480c + ')';
            }
        }

        /* renamed from: com.sdkit.paylib.paylibnative.ui.launcher.domain.k$a$e */
        public static final class e extends a {

            /* renamed from: a */
            public final C11912a f2481a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(C11912a flowArgs) {
                super(null);
                Intrinsics.checkNotNullParameter(flowArgs, "flowArgs");
                this.f2481a = flowArgs;
            }

            @Override // com.sdkit.paylib.paylibnative.p033ui.launcher.domain.AbstractC8237k.a
            /* renamed from: a */
            public C11912a mo2298a() {
                return this.f2481a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && Intrinsics.areEqual(this.f2481a, ((e) obj).f2481a);
            }

            public int hashCode() {
                return this.f2481a.hashCode();
            }

            public String toString() {
                return "Started(flowArgs=" + this.f2481a + ')';
            }
        }

        public a() {
            super(null);
        }

        /* renamed from: a */
        public abstract C11912a mo2298a();

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.launcher.domain.k$b */
    public static abstract class b {
        public b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.launcher.domain.k$c */
    /* loaded from: classes5.dex */
    public static final class c extends AbstractC8237k {

        /* renamed from: a */
        public static final c f2482a = new c();

        public c() {
            super(null);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.launcher.domain.k$d */
    /* loaded from: classes5.dex */
    public static final class d extends AbstractC8237k {

        /* renamed from: a */
        public static final d f2483a = new d();

        public d() {
            super(null);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.launcher.domain.k$e */
    /* loaded from: classes5.dex */
    public static abstract class e extends AbstractC8237k {

        /* renamed from: com.sdkit.paylib.paylibnative.ui.launcher.domain.k$e$a */
        public static final class a extends e {

            /* renamed from: a */
            public final Integer f2484a;

            /* renamed from: b */
            public final c f2485b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Integer num, c flowArgs) {
                super(null);
                Intrinsics.checkNotNullParameter(flowArgs, "flowArgs");
                this.f2484a = num;
                this.f2485b = flowArgs;
            }

            @Override // com.sdkit.paylib.paylibnative.p033ui.launcher.domain.AbstractC8237k.e
            /* renamed from: a */
            public c mo2309a() {
                return this.f2485b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return Intrinsics.areEqual(this.f2484a, aVar.f2484a) && Intrinsics.areEqual(this.f2485b, aVar.f2485b);
            }

            public int hashCode() {
                Integer num = this.f2484a;
                return this.f2485b.hashCode() + ((num == null ? 0 : num.hashCode()) * 31);
            }

            public String toString() {
                return "Failed(errorCode=" + this.f2484a + ", flowArgs=" + this.f2485b + ')';
            }
        }

        /* renamed from: com.sdkit.paylib.paylibnative.ui.launcher.domain.k$e$b */
        public static final class b extends e {

            /* renamed from: a */
            public final FinishReason f2486a;

            /* renamed from: b */
            public final c f2487b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(FinishReason finishReason, c flowArgs) {
                super(null);
                Intrinsics.checkNotNullParameter(finishReason, "finishReason");
                Intrinsics.checkNotNullParameter(flowArgs, "flowArgs");
                this.f2486a = finishReason;
                this.f2487b = flowArgs;
            }

            @Override // com.sdkit.paylib.paylibnative.p033ui.launcher.domain.AbstractC8237k.e
            /* renamed from: a */
            public c mo2309a() {
                return this.f2487b;
            }

            /* renamed from: b */
            public final FinishReason m2310b() {
                return this.f2486a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return Intrinsics.areEqual(this.f2486a, bVar.f2486a) && Intrinsics.areEqual(this.f2487b, bVar.f2487b);
            }

            public int hashCode() {
                return this.f2487b.hashCode() + (this.f2486a.hashCode() * 31);
            }

            public String toString() {
                return "Finishing(finishReason=" + this.f2486a + ", flowArgs=" + this.f2487b + ')';
            }
        }

        /* renamed from: com.sdkit.paylib.paylibnative.ui.launcher.domain.k$e$c */
        public static final class c extends b {

            /* renamed from: a */
            public final String f2488a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String invoiceId) {
                super(null);
                Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
                this.f2488a = invoiceId;
            }

            /* renamed from: a */
            public final String m2311a() {
                return this.f2488a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && Intrinsics.areEqual(this.f2488a, ((c) obj).f2488a);
            }

            public int hashCode() {
                return this.f2488a.hashCode();
            }

            public String toString() {
                return C8032c.m1430a(new StringBuilder("InvoiceFlowArgs(invoiceId="), this.f2488a, ')');
            }
        }

        /* renamed from: com.sdkit.paylib.paylibnative.ui.launcher.domain.k$e$d */
        public static final class d extends e {

            /* renamed from: a */
            public final c f2489a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(c flowArgs) {
                super(null);
                Intrinsics.checkNotNullParameter(flowArgs, "flowArgs");
                this.f2489a = flowArgs;
            }

            @Override // com.sdkit.paylib.paylibnative.p033ui.launcher.domain.AbstractC8237k.e
            /* renamed from: a */
            public c mo2309a() {
                return this.f2489a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && Intrinsics.areEqual(this.f2489a, ((d) obj).f2489a);
            }

            public int hashCode() {
                return this.f2489a.hashCode();
            }

            public String toString() {
                return "Started(flowArgs=" + this.f2489a + ')';
            }
        }

        public e() {
            super(null);
        }

        /* renamed from: a */
        public abstract c mo2309a();

        public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.launcher.domain.k$f */
    /* loaded from: classes5.dex */
    public static abstract class f extends AbstractC8237k {

        /* renamed from: com.sdkit.paylib.paylibnative.ui.launcher.domain.k$f$a */
        public static final class a extends f {

            /* renamed from: a */
            public final String f2490a;

            /* renamed from: b */
            public final String f2491b;

            /* renamed from: c */
            public final Integer f2492c;

            /* renamed from: d */
            public final d f2493d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, String str2, Integer num, d flowArgs) {
                super(null);
                Intrinsics.checkNotNullParameter(flowArgs, "flowArgs");
                this.f2490a = str;
                this.f2491b = str2;
                this.f2492c = num;
                this.f2493d = flowArgs;
            }

            @Override // com.sdkit.paylib.paylibnative.p033ui.launcher.domain.AbstractC8237k.f
            /* renamed from: a */
            public d mo2312a() {
                return this.f2493d;
            }

            /* renamed from: b */
            public final Integer m2313b() {
                return this.f2492c;
            }

            /* renamed from: c */
            public final String m2314c() {
                return this.f2490a;
            }

            /* renamed from: d */
            public final String m2315d() {
                return this.f2491b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return Intrinsics.areEqual(this.f2490a, aVar.f2490a) && Intrinsics.areEqual(this.f2491b, aVar.f2491b) && Intrinsics.areEqual(this.f2492c, aVar.f2492c) && Intrinsics.areEqual(this.f2493d, aVar.f2493d);
            }

            public int hashCode() {
                String str = this.f2490a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.f2491b;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                Integer num = this.f2492c;
                return this.f2493d.hashCode() + ((iHashCode2 + (num != null ? num.hashCode() : 0)) * 31);
            }

            public String toString() {
                return "Failed(invoiceId=" + this.f2490a + ", purchaseId=" + this.f2491b + ", errorCode=" + this.f2492c + ", flowArgs=" + this.f2493d + ')';
            }
        }

        /* renamed from: com.sdkit.paylib.paylibnative.ui.launcher.domain.k$f$b */
        public static final class b extends f {

            /* renamed from: a */
            public final String f2494a;

            /* renamed from: b */
            public final String f2495b;

            /* renamed from: c */
            public final FinishReason f2496c;

            /* renamed from: d */
            public final d f2497d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String invoiceId, String purchaseId, FinishReason finishReason, d flowArgs) {
                super(null);
                Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
                Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
                Intrinsics.checkNotNullParameter(finishReason, "finishReason");
                Intrinsics.checkNotNullParameter(flowArgs, "flowArgs");
                this.f2494a = invoiceId;
                this.f2495b = purchaseId;
                this.f2496c = finishReason;
                this.f2497d = flowArgs;
            }

            @Override // com.sdkit.paylib.paylibnative.p033ui.launcher.domain.AbstractC8237k.f
            /* renamed from: a */
            public d mo2312a() {
                return this.f2497d;
            }

            /* renamed from: b */
            public final FinishReason m2316b() {
                return this.f2496c;
            }

            /* renamed from: c */
            public final String m2317c() {
                return this.f2494a;
            }

            /* renamed from: d */
            public final String m2318d() {
                return this.f2495b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return Intrinsics.areEqual(this.f2494a, bVar.f2494a) && Intrinsics.areEqual(this.f2495b, bVar.f2495b) && Intrinsics.areEqual(this.f2496c, bVar.f2496c) && Intrinsics.areEqual(this.f2497d, bVar.f2497d);
            }

            public int hashCode() {
                return this.f2497d.hashCode() + ((this.f2496c.hashCode() + C8031b.m1429a(this.f2495b, this.f2494a.hashCode() * 31, 31)) * 31);
            }

            public String toString() {
                return "Finishing(invoiceId=" + this.f2494a + ", purchaseId=" + this.f2495b + ", finishReason=" + this.f2496c + ", flowArgs=" + this.f2497d + ')';
            }
        }

        /* renamed from: com.sdkit.paylib.paylibnative.ui.launcher.domain.k$f$c */
        public static final class c extends f {

            /* renamed from: a */
            public final String f2498a;

            /* renamed from: b */
            public final String f2499b;

            /* renamed from: c */
            public final d f2500c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String invoiceId, String purchaseId, d flowArgs) {
                super(null);
                Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
                Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
                Intrinsics.checkNotNullParameter(flowArgs, "flowArgs");
                this.f2498a = invoiceId;
                this.f2499b = purchaseId;
                this.f2500c = flowArgs;
            }

            @Override // com.sdkit.paylib.paylibnative.p033ui.launcher.domain.AbstractC8237k.f
            /* renamed from: a */
            public d mo2312a() {
                return this.f2500c;
            }

            /* renamed from: b */
            public final String m2319b() {
                return this.f2498a;
            }

            /* renamed from: c */
            public final String m2320c() {
                return this.f2499b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return Intrinsics.areEqual(this.f2498a, cVar.f2498a) && Intrinsics.areEqual(this.f2499b, cVar.f2499b) && Intrinsics.areEqual(this.f2500c, cVar.f2500c);
            }

            public int hashCode() {
                return this.f2500c.hashCode() + C8031b.m1429a(this.f2499b, this.f2498a.hashCode() * 31, 31);
            }

            public String toString() {
                return "InvoiceCreated(invoiceId=" + this.f2498a + ", purchaseId=" + this.f2499b + ", flowArgs=" + this.f2500c + ')';
            }
        }

        /* renamed from: com.sdkit.paylib.paylibnative.ui.launcher.domain.k$f$d */
        public static final class d extends b {

            /* renamed from: a */
            public final String f2501a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(String purchaseId) {
                super(null);
                Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
                this.f2501a = purchaseId;
            }

            /* renamed from: a */
            public final String m2321a() {
                return this.f2501a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && Intrinsics.areEqual(this.f2501a, ((d) obj).f2501a);
            }

            public int hashCode() {
                return this.f2501a.hashCode();
            }

            public String toString() {
                return C8032c.m1430a(new StringBuilder("PaymentMethodChangeFlowArgs(purchaseId="), this.f2501a, ')');
            }
        }

        /* renamed from: com.sdkit.paylib.paylibnative.ui.launcher.domain.k$f$e */
        public static final class e extends f {

            /* renamed from: a */
            public final d f2502a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(d flowArgs) {
                super(null);
                Intrinsics.checkNotNullParameter(flowArgs, "flowArgs");
                this.f2502a = flowArgs;
            }

            @Override // com.sdkit.paylib.paylibnative.p033ui.launcher.domain.AbstractC8237k.f
            /* renamed from: a */
            public d mo2312a() {
                return this.f2502a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && Intrinsics.areEqual(this.f2502a, ((e) obj).f2502a);
            }

            public int hashCode() {
                return this.f2502a.hashCode();
            }

            public String toString() {
                return "Started(flowArgs=" + this.f2502a + ')';
            }
        }

        public f() {
            super(null);
        }

        /* renamed from: a */
        public abstract d mo2312a();

        public /* synthetic */ f(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.launcher.domain.k$g */
    /* loaded from: classes5.dex */
    public static abstract class g extends AbstractC8237k {

        /* renamed from: com.sdkit.paylib.paylibnative.ui.launcher.domain.k$g$a */
        public static final class a extends g {

            /* renamed from: a */
            public final String f2503a;

            /* renamed from: b */
            public final String f2504b;

            /* renamed from: c */
            public final Integer f2505c;

            /* renamed from: d */
            public final d f2506d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, String str2, Integer num, d flowArgs) {
                super(null);
                Intrinsics.checkNotNullParameter(flowArgs, "flowArgs");
                this.f2503a = str;
                this.f2504b = str2;
                this.f2505c = num;
                this.f2506d = flowArgs;
            }

            /* renamed from: a */
            public static /* synthetic */ a m2323a(a aVar, String str, String str2, Integer num, d dVar, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = aVar.f2503a;
                }
                if ((i & 2) != 0) {
                    str2 = aVar.f2504b;
                }
                if ((i & 4) != 0) {
                    num = aVar.f2505c;
                }
                if ((i & 8) != 0) {
                    dVar = aVar.f2506d;
                }
                return aVar.m2324a(str, str2, num, dVar);
            }

            /* renamed from: b */
            public final Integer m2325b() {
                return this.f2505c;
            }

            /* renamed from: c */
            public final String m2326c() {
                return this.f2503a;
            }

            /* renamed from: d */
            public final String m2327d() {
                return this.f2504b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return Intrinsics.areEqual(this.f2503a, aVar.f2503a) && Intrinsics.areEqual(this.f2504b, aVar.f2504b) && Intrinsics.areEqual(this.f2505c, aVar.f2505c) && Intrinsics.areEqual(this.f2506d, aVar.f2506d);
            }

            public int hashCode() {
                String str = this.f2503a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.f2504b;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                Integer num = this.f2505c;
                return this.f2506d.hashCode() + ((iHashCode2 + (num != null ? num.hashCode() : 0)) * 31);
            }

            public String toString() {
                return "Failed(invoiceId=" + this.f2503a + ", purchaseId=" + this.f2504b + ", errorCode=" + this.f2505c + ", flowArgs=" + this.f2506d + ')';
            }

            /* renamed from: a */
            public final a m2324a(String str, String str2, Integer num, d flowArgs) {
                Intrinsics.checkNotNullParameter(flowArgs, "flowArgs");
                return new a(str, str2, num, flowArgs);
            }

            @Override // com.sdkit.paylib.paylibnative.p033ui.launcher.domain.AbstractC8237k.g
            /* renamed from: a */
            public d mo2322a() {
                return this.f2506d;
            }
        }

        /* renamed from: com.sdkit.paylib.paylibnative.ui.launcher.domain.k$g$b */
        public static final class b extends g {

            /* renamed from: a */
            public final String f2507a;

            /* renamed from: b */
            public final String f2508b;

            /* renamed from: c */
            public final FinishReason f2509c;

            /* renamed from: d */
            public final d f2510d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String invoiceId, String purchaseId, FinishReason finishReason, d flowArgs) {
                super(null);
                Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
                Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
                Intrinsics.checkNotNullParameter(finishReason, "finishReason");
                Intrinsics.checkNotNullParameter(flowArgs, "flowArgs");
                this.f2507a = invoiceId;
                this.f2508b = purchaseId;
                this.f2509c = finishReason;
                this.f2510d = flowArgs;
            }

            /* renamed from: a */
            public static /* synthetic */ b m2328a(b bVar, String str, String str2, FinishReason finishReason, d dVar, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = bVar.f2507a;
                }
                if ((i & 2) != 0) {
                    str2 = bVar.f2508b;
                }
                if ((i & 4) != 0) {
                    finishReason = bVar.f2509c;
                }
                if ((i & 8) != 0) {
                    dVar = bVar.f2510d;
                }
                return bVar.m2329a(str, str2, finishReason, dVar);
            }

            /* renamed from: b */
            public final FinishReason m2330b() {
                return this.f2509c;
            }

            /* renamed from: c */
            public final String m2331c() {
                return this.f2507a;
            }

            /* renamed from: d */
            public final String m2332d() {
                return this.f2508b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return Intrinsics.areEqual(this.f2507a, bVar.f2507a) && Intrinsics.areEqual(this.f2508b, bVar.f2508b) && Intrinsics.areEqual(this.f2509c, bVar.f2509c) && Intrinsics.areEqual(this.f2510d, bVar.f2510d);
            }

            public int hashCode() {
                return this.f2510d.hashCode() + ((this.f2509c.hashCode() + C8031b.m1429a(this.f2508b, this.f2507a.hashCode() * 31, 31)) * 31);
            }

            public String toString() {
                return "Finishing(invoiceId=" + this.f2507a + ", purchaseId=" + this.f2508b + ", finishReason=" + this.f2509c + ", flowArgs=" + this.f2510d + ')';
            }

            /* renamed from: a */
            public final b m2329a(String invoiceId, String purchaseId, FinishReason finishReason, d flowArgs) {
                Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
                Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
                Intrinsics.checkNotNullParameter(finishReason, "finishReason");
                Intrinsics.checkNotNullParameter(flowArgs, "flowArgs");
                return new b(invoiceId, purchaseId, finishReason, flowArgs);
            }

            @Override // com.sdkit.paylib.paylibnative.p033ui.launcher.domain.AbstractC8237k.g
            /* renamed from: a */
            public d mo2322a() {
                return this.f2510d;
            }
        }

        /* renamed from: com.sdkit.paylib.paylibnative.ui.launcher.domain.k$g$c */
        public static final class c extends g {

            /* renamed from: a */
            public final String f2511a;

            /* renamed from: b */
            public final String f2512b;

            /* renamed from: c */
            public final d f2513c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String invoiceId, String purchaseId, d flowArgs) {
                super(null);
                Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
                Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
                Intrinsics.checkNotNullParameter(flowArgs, "flowArgs");
                this.f2511a = invoiceId;
                this.f2512b = purchaseId;
                this.f2513c = flowArgs;
            }

            /* renamed from: a */
            public static /* synthetic */ c m2333a(c cVar, String str, String str2, d dVar, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = cVar.f2511a;
                }
                if ((i & 2) != 0) {
                    str2 = cVar.f2512b;
                }
                if ((i & 4) != 0) {
                    dVar = cVar.f2513c;
                }
                return cVar.m2334a(str, str2, dVar);
            }

            /* renamed from: b */
            public final String m2335b() {
                return this.f2511a;
            }

            /* renamed from: c */
            public final String m2336c() {
                return this.f2512b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return Intrinsics.areEqual(this.f2511a, cVar.f2511a) && Intrinsics.areEqual(this.f2512b, cVar.f2512b) && Intrinsics.areEqual(this.f2513c, cVar.f2513c);
            }

            public int hashCode() {
                return this.f2513c.hashCode() + C8031b.m1429a(this.f2512b, this.f2511a.hashCode() * 31, 31);
            }

            public String toString() {
                return "InvoiceCreated(invoiceId=" + this.f2511a + ", purchaseId=" + this.f2512b + ", flowArgs=" + this.f2513c + ')';
            }

            /* renamed from: a */
            public final c m2334a(String invoiceId, String purchaseId, d flowArgs) {
                Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
                Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
                Intrinsics.checkNotNullParameter(flowArgs, "flowArgs");
                return new c(invoiceId, purchaseId, flowArgs);
            }

            @Override // com.sdkit.paylib.paylibnative.p033ui.launcher.domain.AbstractC8237k.g
            /* renamed from: a */
            public d mo2322a() {
                return this.f2513c;
            }
        }

        /* renamed from: com.sdkit.paylib.paylibnative.ui.launcher.domain.k$g$d */
        public static final class d extends b {

            /* renamed from: a */
            public final String f2514a;

            /* renamed from: b */
            public final String f2515b;

            /* renamed from: c */
            public final Integer f2516c;

            /* renamed from: d */
            public final String f2517d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(String productId, String str, Integer num, String str2) {
                super(null);
                Intrinsics.checkNotNullParameter(productId, "productId");
                this.f2514a = productId;
                this.f2515b = str;
                this.f2516c = num;
                this.f2517d = str2;
            }

            /* renamed from: a */
            public static /* synthetic */ d m2337a(d dVar, String str, String str2, Integer num, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = dVar.f2514a;
                }
                if ((i & 2) != 0) {
                    str2 = dVar.f2515b;
                }
                if ((i & 4) != 0) {
                    num = dVar.f2516c;
                }
                if ((i & 8) != 0) {
                    str3 = dVar.f2517d;
                }
                return dVar.m2338a(str, str2, num, str3);
            }

            /* renamed from: b */
            public final String m2340b() {
                return this.f2515b;
            }

            /* renamed from: c */
            public final String m2341c() {
                return this.f2514a;
            }

            /* renamed from: d */
            public final Integer m2342d() {
                return this.f2516c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return Intrinsics.areEqual(this.f2514a, dVar.f2514a) && Intrinsics.areEqual(this.f2515b, dVar.f2515b) && Intrinsics.areEqual(this.f2516c, dVar.f2516c) && Intrinsics.areEqual(this.f2517d, dVar.f2517d);
            }

            public int hashCode() {
                int iHashCode = this.f2514a.hashCode() * 31;
                String str = this.f2515b;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                Integer num = this.f2516c;
                int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
                String str2 = this.f2517d;
                return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("ProductFlowArgs(productId=");
                sb.append(this.f2514a);
                sb.append(", orderId=");
                sb.append(this.f2515b);
                sb.append(", quantity=");
                sb.append(this.f2516c);
                sb.append(", developerPayload=");
                return C8032c.m1430a(sb, this.f2517d, ')');
            }

            /* renamed from: a */
            public final d m2338a(String productId, String str, Integer num, String str2) {
                Intrinsics.checkNotNullParameter(productId, "productId");
                return new d(productId, str, num, str2);
            }

            /* renamed from: a */
            public final String m2339a() {
                return this.f2517d;
            }
        }

        /* renamed from: com.sdkit.paylib.paylibnative.ui.launcher.domain.k$g$e */
        public static final class e extends g {

            /* renamed from: a */
            public final d f2518a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(d flowArgs) {
                super(null);
                Intrinsics.checkNotNullParameter(flowArgs, "flowArgs");
                this.f2518a = flowArgs;
            }

            @Override // com.sdkit.paylib.paylibnative.p033ui.launcher.domain.AbstractC8237k.g
            /* renamed from: a */
            public d mo2322a() {
                return this.f2518a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && Intrinsics.areEqual(this.f2518a, ((e) obj).f2518a);
            }

            public int hashCode() {
                return this.f2518a.hashCode();
            }

            public String toString() {
                return "Started(flowArgs=" + this.f2518a + ')';
            }

            /* renamed from: a */
            public final e m2343a(d flowArgs) {
                Intrinsics.checkNotNullParameter(flowArgs, "flowArgs");
                return new e(flowArgs);
            }
        }

        public g() {
            super(null);
        }

        /* renamed from: a */
        public abstract d mo2322a();

        public /* synthetic */ g(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public AbstractC8237k() {
    }

    public /* synthetic */ AbstractC8237k(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
