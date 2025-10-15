package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.blackhub.bronline.launcher.LauncherConstants;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;

/* renamed from: io.appmetrica.analytics.impl.a5 */
/* loaded from: classes6.dex */
public class C9396a5 {

    /* renamed from: a */
    public final String f7668a;

    /* renamed from: b */
    public final String f7669b;

    public C9396a5(String str, String str2) {
        this.f7668a = str;
        this.f7669b = str2;
    }

    @NonNull
    /* renamed from: a */
    public final String m5826a() {
        return ApiKeyUtils.createPartialApiKey(this.f7669b);
    }

    @Nullable
    /* renamed from: b */
    public final String m5827b() {
        return this.f7669b;
    }

    /* renamed from: c */
    public final String m5828c() {
        return this.f7668a;
    }

    /* renamed from: d */
    public boolean mo5829d() {
        return false;
    }

    /* renamed from: e */
    public String mo5830e() {
        return this.f7668a + LauncherConstants.UNDERSCORE_STRING + ApiKeyUtils.createPartialApiKey(this.f7669b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C9396a5 c9396a5 = (C9396a5) obj;
        String str = this.f7668a;
        if (str == null ? c9396a5.f7668a != null : !str.equals(c9396a5.f7668a)) {
            return false;
        }
        String str2 = this.f7669b;
        String str3 = c9396a5.f7669b;
        return str2 != null ? str2.equals(str3) : str3 == null;
    }

    public final int hashCode() {
        String str = this.f7668a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f7669b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return this.f7668a + LauncherConstants.UNDERSCORE_STRING + this.f7669b;
    }
}
