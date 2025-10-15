package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreapi.internal.backport.BiConsumer;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.W2 */
/* loaded from: classes5.dex */
public final class C9297W2 implements BiConsumer {

    /* renamed from: a */
    public final /* synthetic */ C9321X2 f7386a;

    public C9297W2(C9321X2 c9321x2) {
        this.f7386a = c9321x2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.BiConsumer
    public final void consume(Object obj, Object obj2) {
        Intent intent = (Intent) obj2;
        synchronized (this.f7386a) {
            try {
                C9321X2 c9321x2 = this.f7386a;
                c9321x2.f7437b = intent;
                Iterator it = c9321x2.f7436a.iterator();
                while (it.hasNext()) {
                    ((Consumer) it.next()).consume(intent);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
