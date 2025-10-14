package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.re */
/* loaded from: classes7.dex */
public final class C9830re extends AbstractC9454cd implements InterfaceC8784An {

    /* renamed from: d */
    public static final C9805qe f8997d = new C9805qe("LOCATION_TRACKING_ENABLED", null);

    /* renamed from: e */
    public static final C9805qe f8998e = new C9805qe("PREF_KEY_OFFSET", null);

    /* renamed from: f */
    public static final C9805qe f8999f = new C9805qe("UNCHECKED_TIME", null);

    /* renamed from: g */
    public static final C9805qe f9000g = new C9805qe("STATISTICS_RESTRICTED_IN_MAIN", null);

    /* renamed from: h */
    public static final C9805qe f9001h = new C9805qe("LAST_IDENTITY_LIGHT_SEND_TIME", null);

    /* renamed from: i */
    public static final C9805qe f9002i = new C9805qe("NEXT_REPORT_SEND_ATTEMPT_NUMBER", null);

    /* renamed from: j */
    public static final C9805qe f9003j = new C9805qe("NEXT_LOCATION_SEND_ATTEMPT_NUMBER", null);

    /* renamed from: k */
    public static final C9805qe f9004k = new C9805qe("NEXT_STARTUP_SEND_ATTEMPT_NUMBER", null);

    /* renamed from: l */
    public static final C9805qe f9005l = new C9805qe("LAST_REPORT_SEND_ATTEMPT_TIME", null);

    /* renamed from: m */
    public static final C9805qe f9006m = new C9805qe("LAST_LOCATION_SEND_ATTEMPT_TIME", null);

    /* renamed from: n */
    public static final C9805qe f9007n = new C9805qe("LAST_STARTUP_SEND_ATTEMPT_TIME", null);

    /* renamed from: o */
    public static final C9805qe f9008o = new C9805qe("SATELLITE_PRELOAD_INFO_CHECKED", null);

    /* renamed from: p */
    public static final C9805qe f9009p = new C9805qe("SATELLITE_CLIDS_CHECKED", null);

    /* renamed from: q */
    public static final C9805qe f9010q = new C9805qe("VITAL_DATA", null);

    /* renamed from: r */
    public static final C9805qe f9011r = new C9805qe("LAST_KOTLIN_VERSION_SEND_TIME", null);

    public C9830re(InterfaceC8896Fa interfaceC8896Fa) {
        super(interfaceC8896Fa);
    }

    /* renamed from: a */
    public final long m6757a(int i) {
        return this.f8900a.getLong(f8998e.f8942b, i);
    }

    /* renamed from: b */
    public final C9830re m6764b(boolean z) {
        return (C9830re) m6647b(f9000g.f8942b, z);
    }

    /* renamed from: c */
    public final C9830re m6766c(boolean z) {
        return (C9830re) m6647b(f8999f.f8942b, z);
    }

    /* renamed from: d */
    public final void m6769d(boolean z) {
        m6647b(f8997d.f8942b, z).m6648b();
    }

    /* renamed from: e */
    public final boolean m6770e() {
        return this.f8900a.getBoolean(f8997d.f8942b, false);
    }

    /* renamed from: f */
    public final long m6771f() {
        return this.f8900a.getLong(f9011r.f8942b, 0L);
    }

    /* renamed from: g */
    public final C9830re m6772g() {
        return (C9830re) m6647b(f9009p.f8942b, true);
    }

    /* renamed from: h */
    public final C9830re m6773h() {
        return (C9830re) m6647b(f9008o.f8942b, true);
    }

    /* renamed from: i */
    public final boolean m6774i() {
        return this.f8900a.getBoolean(f9008o.f8942b, false);
    }

    /* renamed from: j */
    public final boolean m6775j() {
        return this.f8900a.getBoolean(f9009p.f8942b, false);
    }

    /* renamed from: a */
    public final boolean m6760a(boolean z) {
        return this.f8900a.getBoolean(f8999f.f8942b, z);
    }

    /* renamed from: b */
    public final C9830re m6761b(long j) {
        return (C9830re) m6645b(f9001h.f8942b, j);
    }

    /* renamed from: c */
    public final C9830re m6765c(long j) {
        return (C9830re) m6645b(f9011r.f8942b, j);
    }

    /* renamed from: d */
    public final C9830re m6767d(long j) {
        return (C9830re) m6645b(f8998e.f8942b, j);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC9454cd
    @NonNull
    /* renamed from: f */
    public final String mo5982f(@NonNull String str) {
        return new C9805qe(str, null).f8942b;
    }

    /* renamed from: a */
    public final long m6758a(long j) {
        return this.f8900a.getLong(f9001h.f8942b, j);
    }

    /* renamed from: b */
    public final C9830re m6762b(@NonNull EnumC9779pd enumC9779pd, int i) {
        C9805qe c9805qe;
        int iOrdinal = enumC9779pd.ordinal();
        if (iOrdinal == 0) {
            c9805qe = f9002i;
        } else if (iOrdinal != 1) {
            c9805qe = iOrdinal != 2 ? null : f9004k;
        } else {
            c9805qe = f9003j;
        }
        return c9805qe != null ? (C9830re) m6644b(c9805qe.f8942b, i) : this;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC9780pe
    @NonNull
    /* renamed from: c */
    public final Set<String> mo6597c() {
        return this.f8900a.mo5135a();
    }

    @Nullable
    /* renamed from: d */
    public final Boolean m6768d() {
        C9805qe c9805qe = f9000g;
        if (!this.f8900a.mo5136a(c9805qe.f8942b)) {
            return null;
        }
        return Boolean.valueOf(this.f8900a.getBoolean(c9805qe.f8942b, true));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8784An
    @Nullable
    /* renamed from: a */
    public final String mo4978a() {
        return this.f8900a.getString(f9010q.f8942b, null);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8784An
    /* renamed from: a */
    public final void mo4979a(@NonNull String str) {
        m6646b(f9010q.f8942b, str).m6648b();
    }

    /* renamed from: a */
    public final int m6756a(@NonNull EnumC9779pd enumC9779pd, int i) {
        C9805qe c9805qe;
        int iOrdinal = enumC9779pd.ordinal();
        if (iOrdinal == 0) {
            c9805qe = f9002i;
        } else if (iOrdinal != 1) {
            c9805qe = iOrdinal != 2 ? null : f9004k;
        } else {
            c9805qe = f9003j;
        }
        if (c9805qe == null) {
            return i;
        }
        return this.f8900a.getInt(c9805qe.f8942b, i);
    }

    /* renamed from: b */
    public final C9830re m6763b(@NonNull EnumC9779pd enumC9779pd, long j) {
        C9805qe c9805qe;
        int iOrdinal = enumC9779pd.ordinal();
        if (iOrdinal == 0) {
            c9805qe = f9005l;
        } else if (iOrdinal != 1) {
            c9805qe = iOrdinal != 2 ? null : f9007n;
        } else {
            c9805qe = f9006m;
        }
        return c9805qe != null ? (C9830re) m6645b(c9805qe.f8942b, j) : this;
    }

    /* renamed from: a */
    public final long m6759a(@NonNull EnumC9779pd enumC9779pd, long j) {
        C9805qe c9805qe;
        int iOrdinal = enumC9779pd.ordinal();
        if (iOrdinal == 0) {
            c9805qe = f9005l;
        } else if (iOrdinal != 1) {
            c9805qe = iOrdinal != 2 ? null : f9007n;
        } else {
            c9805qe = f9006m;
        }
        if (c9805qe == null) {
            return j;
        }
        return this.f8900a.getLong(c9805qe.f8942b, j);
    }
}
