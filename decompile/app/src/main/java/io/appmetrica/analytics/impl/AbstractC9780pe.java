package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;

/* renamed from: io.appmetrica.analytics.impl.pe */
/* loaded from: classes7.dex */
public abstract class AbstractC9780pe {

    /* renamed from: c */
    public static final String f8899c = "pe";

    /* renamed from: a */
    public final InterfaceC8896Fa f8900a;

    /* renamed from: b */
    public final String f8901b;

    public AbstractC9780pe(InterfaceC8896Fa interfaceC8896Fa, String str) {
        this.f8900a = interfaceC8896Fa;
        this.f8901b = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final <T extends AbstractC9780pe> T m6639a(String str, float f) {
        synchronized (this) {
            this.f8900a.mo5131a(str, f);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public final <T extends AbstractC9780pe> T m6646b(String str, String str2) {
        synchronized (this) {
            this.f8900a.mo5133a(str, str2);
        }
        return this;
    }

    /* renamed from: c */
    public final C9805qe m6650c(String str) {
        return new C9805qe(str, this.f8901b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    public final <T extends AbstractC9780pe> T m6651d(String str) {
        synchronized (this) {
            this.f8900a.remove(str);
        }
        return this;
    }

    @NonNull
    /* renamed from: c */
    public Set<String> mo6597c() {
        return this.f8900a.mo5135a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final <T extends AbstractC9780pe> T m6641a(String str, String[] strArr) {
        String string;
        try {
            JSONArray jSONArray = new JSONArray();
            for (String str2 : strArr) {
                jSONArray.put(str2);
            }
            string = jSONArray.toString();
        } catch (Throwable unused) {
            string = null;
        }
        this.f8900a.mo5133a(str, string);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public final <T extends AbstractC9780pe> T m6645b(String str, long j) {
        synchronized (this) {
            this.f8900a.mo5132a(str, j);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    /* renamed from: b */
    public final <T extends AbstractC9780pe> T m6644b(String str, int i) {
        synchronized (this) {
            this.f8900a.mo5130a(i, str);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public final <T extends AbstractC9780pe> T m6647b(String str, boolean z) {
        synchronized (this) {
            this.f8900a.mo5134a(str, z);
        }
        return this;
    }

    /* renamed from: a */
    public final <T extends AbstractC9780pe> T m6640a(String str, List<String> list) {
        return (T) m6641a(str, (String[]) list.toArray(new String[list.size()]));
    }

    /* renamed from: a */
    public final long m6638a(String str, long j) {
        return this.f8900a.getLong(str, j);
    }

    /* renamed from: a */
    public final int m6637a(@NonNull String str, int i) {
        return this.f8900a.getInt(str, i);
    }

    @Nullable
    /* renamed from: a */
    public final String m6642a(@NonNull String str, @Nullable String str2) {
        return this.f8900a.getString(str, str2);
    }

    /* renamed from: b */
    public final void m6648b() {
        synchronized (this) {
            this.f8900a.mo5137b();
        }
    }

    /* renamed from: a */
    public final boolean m6643a(String str, boolean z) {
        return this.f8900a.getBoolean(str, z);
    }

    /* renamed from: b */
    public final boolean m6649b(@NonNull String str) {
        return this.f8900a.mo5136a(str);
    }
}
