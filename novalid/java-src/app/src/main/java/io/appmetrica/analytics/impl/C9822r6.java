package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.backport.Function;

/* renamed from: io.appmetrica.analytics.impl.r6 */
/* loaded from: classes6.dex */
public final class C9822r6 implements Function {
    @Override // io.appmetrica.analytics.coreapi.internal.backport.Function
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9938vm apply(Thread thread) {
        String name = thread.getName();
        int priority = thread.getPriority();
        long id = thread.getId();
        ThreadGroup threadGroup = thread.getThreadGroup();
        return new C9938vm(name, priority, id, threadGroup != null ? threadGroup.getName() : "", null, null);
    }
}
