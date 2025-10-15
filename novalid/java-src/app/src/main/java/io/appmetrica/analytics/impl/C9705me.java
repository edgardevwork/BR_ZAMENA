package io.appmetrica.analytics.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.me */
/* loaded from: classes6.dex */
public final class C9705me implements InterfaceC8823Cc {

    /* renamed from: a */
    public final Context f8649a;

    /* renamed from: b */
    public final String f8650b;

    /* renamed from: c */
    public final String f8651c;

    public C9705me(@NotNull Context context, @NotNull String str, @NotNull String str2) {
        this.f8649a = context;
        this.f8650b = str;
        this.f8651c = str2;
    }

    @NotNull
    /* renamed from: a */
    public final C9705me m6487a(@NotNull Context context, @NotNull String str, @NotNull String str2) {
        return new C9705me(context, str, str2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9705me)) {
            return false;
        }
        C9705me c9705me = (C9705me) obj;
        return Intrinsics.areEqual(this.f8649a, c9705me.f8649a) && Intrinsics.areEqual(this.f8650b, c9705me.f8650b) && Intrinsics.areEqual(this.f8651c, c9705me.f8651c);
    }

    public final int hashCode() {
        return this.f8651c.hashCode() + ((this.f8650b.hashCode() + (this.f8649a.hashCode() * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "PreferencesBasedModuleEntryPoint(context=" + this.f8649a + ", prefName=" + this.f8650b + ", prefValueName=" + this.f8651c + ')';
    }

    /* renamed from: a */
    public static C9705me m6486a(C9705me c9705me, Context context, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            context = c9705me.f8649a;
        }
        if ((i & 2) != 0) {
            str = c9705me.f8650b;
        }
        if ((i & 4) != 0) {
            str2 = c9705me.f8651c;
        }
        c9705me.getClass();
        return new C9705me(context, str, str2);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8823Cc
    @NotNull
    /* renamed from: a */
    public final String mo5027a() {
        String string = this.f8649a.getSharedPreferences(this.f8650b, 0).getString(this.f8651c, "");
        return string == null ? "" : string;
    }
}
