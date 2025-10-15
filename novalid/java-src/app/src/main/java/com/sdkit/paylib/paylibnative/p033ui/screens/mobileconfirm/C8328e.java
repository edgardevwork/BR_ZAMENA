package com.sdkit.paylib.paylibnative.p033ui.screens.mobileconfirm;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8030a;
import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import com.sdkit.paylib.paylibdomain.impl.entity.C8054b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibnative.ui.screens.mobileconfirm.e */
/* loaded from: classes5.dex */
public final class C8328e {

    /* renamed from: a */
    public final boolean f3372a;

    /* renamed from: b */
    public final int f3373b;

    /* renamed from: c */
    public final b f3374c;

    /* renamed from: d */
    public final c f3375d;

    /* renamed from: e */
    public final a f3376e;

    /* renamed from: f */
    public final boolean f3377f;

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.mobileconfirm.e$a */
    public static final class a {

        /* renamed from: a */
        public final boolean f3378a;

        public a(boolean z) {
            this.f3378a = z;
        }

        /* renamed from: a */
        public final a m3121a(boolean z) {
            return new a(z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f3378a == ((a) obj).f3378a;
        }

        public int hashCode() {
            boolean z = this.f3378a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public String toString() {
            return C8030a.m1428a(new StringBuilder("ButtonState(enabled="), this.f3378a, ')');
        }

        /* renamed from: a */
        public final boolean m3122a() {
            return this.f3378a;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.mobileconfirm.e$b */
    public static abstract class b {

        /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.mobileconfirm.e$b$a */
        /* loaded from: classes6.dex */
        public static final class a extends b {

            /* renamed from: a */
            public final String f3379a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String text) {
                super(null);
                Intrinsics.checkNotNullParameter(text, "text");
                this.f3379a = text;
            }

            /* renamed from: a */
            public final String m3123a() {
                return this.f3379a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && Intrinsics.areEqual(this.f3379a, ((a) obj).f3379a);
            }

            public int hashCode() {
                return this.f3379a.hashCode();
            }

            public String toString() {
                return C8032c.m1430a(new StringBuilder("ErrorText(text="), this.f3379a, ')');
            }
        }

        /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.mobileconfirm.e$b$b, reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C11933b extends b {

            /* renamed from: a */
            public final String f3380a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C11933b(String text) {
                super(null);
                Intrinsics.checkNotNullParameter(text, "text");
                this.f3380a = text;
            }

            /* renamed from: a */
            public final String m3124a() {
                return this.f3380a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C11933b) && Intrinsics.areEqual(this.f3380a, ((C11933b) obj).f3380a);
            }

            public int hashCode() {
                return this.f3380a.hashCode();
            }

            public String toString() {
                return C8032c.m1430a(new StringBuilder("PhoneDescription(text="), this.f3380a, ')');
            }
        }

        public b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.mobileconfirm.e$c */
    public static abstract class c {

        /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.mobileconfirm.e$c$a */
        /* loaded from: classes6.dex */
        public static final class a extends c {

            /* renamed from: a */
            public final String f3381a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String text) {
                super(null);
                Intrinsics.checkNotNullParameter(text, "text");
                this.f3381a = text;
            }

            /* renamed from: a */
            public final String m3125a() {
                return this.f3381a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && Intrinsics.areEqual(this.f3381a, ((a) obj).f3381a);
            }

            public int hashCode() {
                return this.f3381a.hashCode();
            }

            public String toString() {
                return C8032c.m1430a(new StringBuilder("MessageWithTimer(text="), this.f3381a, ')');
            }
        }

        /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.mobileconfirm.e$c$b */
        /* loaded from: classes6.dex */
        public static final class b extends c {

            /* renamed from: a */
            public static final b f3382a = new b();

            public b() {
                super(null);
            }
        }

        /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.mobileconfirm.e$c$c, reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C11934c extends c {

            /* renamed from: a */
            public static final C11934c f3383a = new C11934c();

            public C11934c() {
                super(null);
            }
        }

        public c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C8328e(boolean z, int i, b description, c resendText, a buttonState, boolean z2) {
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(resendText, "resendText");
        Intrinsics.checkNotNullParameter(buttonState, "buttonState");
        this.f3372a = z;
        this.f3373b = i;
        this.f3374c = description;
        this.f3375d = resendText;
        this.f3376e = buttonState;
        this.f3377f = z2;
    }

    /* renamed from: a */
    public final a m3114a() {
        return this.f3376e;
    }

    /* renamed from: b */
    public final b m3116b() {
        return this.f3374c;
    }

    /* renamed from: c */
    public final int m3117c() {
        return this.f3373b;
    }

    /* renamed from: d */
    public final c m3118d() {
        return this.f3375d;
    }

    /* renamed from: e */
    public final boolean m3119e() {
        return this.f3372a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8328e)) {
            return false;
        }
        C8328e c8328e = (C8328e) obj;
        return this.f3372a == c8328e.f3372a && this.f3373b == c8328e.f3373b && Intrinsics.areEqual(this.f3374c, c8328e.f3374c) && Intrinsics.areEqual(this.f3375d, c8328e.f3375d) && Intrinsics.areEqual(this.f3376e, c8328e.f3376e) && this.f3377f == c8328e.f3377f;
    }

    /* renamed from: f */
    public final boolean m3120f() {
        return this.f3377f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public int hashCode() {
        boolean z = this.f3372a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int iHashCode = (this.f3376e.hashCode() + ((this.f3375d.hashCode() + ((this.f3374c.hashCode() + C8054b.m1525a(this.f3373b, r0 * 31, 31)) * 31)) * 31)) * 31;
        boolean z2 = this.f3377f;
        return iHashCode + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MobileConfirmationViewState(isLoading=");
        sb.append(this.f3372a);
        sb.append(", maxSmsLength=");
        sb.append(this.f3373b);
        sb.append(", description=");
        sb.append(this.f3374c);
        sb.append(", resendText=");
        sb.append(this.f3375d);
        sb.append(", buttonState=");
        sb.append(this.f3376e);
        sb.append(", isSandbox=");
        return C8030a.m1428a(sb, this.f3377f, ')');
    }

    /* renamed from: a */
    public static /* synthetic */ C8328e m3113a(C8328e c8328e, boolean z, int i, b bVar, c cVar, a aVar, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = c8328e.f3372a;
        }
        if ((i2 & 2) != 0) {
            i = c8328e.f3373b;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            bVar = c8328e.f3374c;
        }
        b bVar2 = bVar;
        if ((i2 & 8) != 0) {
            cVar = c8328e.f3375d;
        }
        c cVar2 = cVar;
        if ((i2 & 16) != 0) {
            aVar = c8328e.f3376e;
        }
        a aVar2 = aVar;
        if ((i2 & 32) != 0) {
            z2 = c8328e.f3377f;
        }
        return c8328e.m3115a(z, i3, bVar2, cVar2, aVar2, z2);
    }

    /* renamed from: a */
    public final C8328e m3115a(boolean z, int i, b description, c resendText, a buttonState, boolean z2) {
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(resendText, "resendText");
        Intrinsics.checkNotNullParameter(buttonState, "buttonState");
        return new C8328e(z, i, description, resendText, buttonState, z2);
    }
}
