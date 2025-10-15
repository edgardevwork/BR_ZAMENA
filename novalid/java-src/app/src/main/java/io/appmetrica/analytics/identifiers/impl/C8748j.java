package io.appmetrica.analytics.identifiers.impl;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.identifiers.impl.j */
/* loaded from: classes7.dex */
public final class C8748j implements InterfaceC8740b {

    /* renamed from: a */
    public final C8744f f6289a;

    @VisibleForTesting
    public C8748j(@NotNull C8744f c8744f) {
        this.f6289a = c8744f;
    }

    @Override // io.appmetrica.analytics.identifiers.impl.InterfaceC8740b
    @NotNull
    /* renamed from: a */
    public final C8741c mo4914a(@NotNull Context context) {
        C8741c c8741c;
        C8744f c8744f;
        try {
            try {
                try {
                    C8751m c8751m = (C8751m) ((InterfaceC8753o) this.f6289a.m4916a(context));
                    c8741c = new C8741c(IdentifierStatus.OK, new C8739a("huawei", c8751m.m4919a(), Boolean.valueOf(c8751m.m4920b())), null, 4);
                    c8744f = this.f6289a;
                } finally {
                    c8744f.m4917b(context);
                }
            } catch (C8745g e) {
                String message = e.getMessage();
                if (message == null) {
                    message = "unknown exception during binding huawei services";
                }
                c8741c = new C8741c(IdentifierStatus.IDENTIFIER_PROVIDER_UNAVAILABLE, null, message);
                c8744f = this.f6289a;
            }
            c8744f.m4917b(context);
            return c8741c;
        } catch (Throwable th) {
            try {
                this.f6289a.m4917b(context);
            } catch (Throwable unused) {
            }
        }
    }

    public C8748j() {
        this(new C8744f(AbstractC8749k.f6290a, C8747i.f6288a, "huawei"));
    }
}
