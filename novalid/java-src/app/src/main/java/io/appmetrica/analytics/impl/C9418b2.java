package io.appmetrica.analytics.impl;

import androidx.annotation.MainThread;
import io.appmetrica.analytics.appsetid.internal.AppSetIdListener;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetId;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.b2 */
/* loaded from: classes5.dex */
public final class C9418b2 implements AppSetIdListener {

    /* renamed from: a */
    public final /* synthetic */ C9443c2 f7761a;

    public C9418b2(C9443c2 c9443c2) {
        this.f7761a = c9443c2;
    }

    @Override // io.appmetrica.analytics.appsetid.internal.AppSetIdListener
    @MainThread
    public final void onAppSetIdRetrieved(@Nullable String str, @NotNull AppSetIdScope appSetIdScope) {
        this.f7761a.f7807c = new AppSetId(str, appSetIdScope);
        this.f7761a.f7808d.countDown();
    }

    @Override // io.appmetrica.analytics.appsetid.internal.AppSetIdListener
    @MainThread
    public final void onFailure(@Nullable Throwable th) {
        this.f7761a.f7808d.countDown();
    }
}
