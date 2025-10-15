package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.HashSet;

/* renamed from: io.appmetrica.analytics.impl.F6 */
/* loaded from: classes7.dex */
public final class C8892F6 implements DataSendingRestrictionController {

    /* renamed from: a */
    public final InterfaceC8842D6 f6569a;

    /* renamed from: b */
    public Boolean f6570b;

    /* renamed from: c */
    public final HashSet f6571c = new HashSet();

    /* renamed from: d */
    public final HashSet f6572d = new HashSet();

    public C8892F6(@NonNull InterfaceC8842D6 interfaceC8842D6) {
        this.f6569a = interfaceC8842D6;
        this.f6570b = ((C8867E6) interfaceC8842D6).m5102a();
    }

    /* renamed from: a */
    public final synchronized void m5126a(@Nullable Boolean bool) {
        try {
            if (AbstractC9664kn.m6342a(bool) || this.f6570b == null) {
                boolean zEquals = Boolean.FALSE.equals(bool);
                this.f6570b = Boolean.valueOf(zEquals);
                ((C8867E6) this.f6569a).f6528a.m6764b(zEquals).m6648b();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController
    public final boolean isRestrictedForBackgroundDataCollection() {
        Boolean bool = this.f6570b;
        return bool == null ? !this.f6571c.isEmpty() || this.f6572d.isEmpty() : bool.booleanValue();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController
    public final synchronized boolean isRestrictedForReporter() {
        Boolean bool;
        try {
            bool = this.f6570b;
        } finally {
        }
        return bool == null ? this.f6572d.isEmpty() && this.f6571c.isEmpty() : bool.booleanValue();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController
    public final synchronized boolean isRestrictedForSdk() {
        Boolean bool;
        try {
            bool = this.f6570b;
        } catch (Throwable th) {
            throw th;
        }
        return bool == null ? this.f6572d.isEmpty() : bool.booleanValue();
    }

    /* renamed from: a */
    public final synchronized void m5127a(@NonNull String str, @Nullable Boolean bool) {
        try {
            if (AbstractC9664kn.m6342a(bool) || (!this.f6572d.contains(str) && !this.f6571c.contains(str))) {
                if (((Boolean) WrapUtils.getOrDefault(bool, Boolean.TRUE)).booleanValue()) {
                    this.f6572d.add(str);
                    this.f6571c.remove(str);
                } else {
                    this.f6571c.add(str);
                    this.f6572d.remove(str);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
