package io.appmetrica.analytics.impl;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.cd */
/* loaded from: classes8.dex */
public abstract class AbstractC9454cd extends AbstractC9780pe implements InterfaceC10011yk {
    public AbstractC9454cd(@NotNull InterfaceC8896Fa interfaceC8896Fa, @Nullable String str) {
        super(interfaceC8896Fa, str);
    }

    @Nullable
    /* renamed from: c */
    public final String m5975c(@NotNull String str, @Nullable String str2) {
        return this.f8900a.getString(mo5982f(str), str2);
    }

    @NotNull
    /* renamed from: d */
    public final InterfaceC10011yk m5979d(@NotNull String str, @Nullable String str2) {
        return (InterfaceC10011yk) m6646b(mo5982f(str), str2);
    }

    /* renamed from: e */
    public final boolean m5981e(@NotNull String str) {
        return this.f8900a.mo5136a(mo5982f(str));
    }

    @NotNull
    /* renamed from: f */
    public abstract String mo5982f(@NotNull String str);

    @NotNull
    /* renamed from: g */
    public InterfaceC10011yk mo5983g(@NotNull String str) {
        return (InterfaceC10011yk) m6651d(mo5982f(str));
    }

    public AbstractC9454cd(@NotNull InterfaceC8896Fa interfaceC8896Fa) {
        this(interfaceC8896Fa, null);
    }

    @NotNull
    /* renamed from: d */
    public final InterfaceC10011yk m5977d(@NotNull String str, int i) {
        return (InterfaceC10011yk) m6644b(mo5982f(str), i);
    }

    /* renamed from: c */
    public final int m5973c(@NotNull String str, int i) {
        return this.f8900a.getInt(mo5982f(str), i);
    }

    @NotNull
    /* renamed from: d */
    public final InterfaceC10011yk m5978d(@NotNull String str, long j) {
        return (InterfaceC10011yk) m6645b(mo5982f(str), j);
    }

    @NotNull
    /* renamed from: d */
    public final InterfaceC10011yk m5980d(@NotNull String str, boolean z) {
        return (InterfaceC10011yk) m6647b(mo5982f(str), z);
    }

    /* renamed from: c */
    public final long m5974c(@NotNull String str, long j) {
        return this.f8900a.getLong(mo5982f(str), j);
    }

    /* renamed from: c */
    public final boolean m5976c(@NotNull String str, boolean z) {
        return this.f8900a.getBoolean(mo5982f(str), z);
    }
}
