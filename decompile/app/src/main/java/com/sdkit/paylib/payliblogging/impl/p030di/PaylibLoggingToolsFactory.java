package com.sdkit.paylib.payliblogging.impl.p030di;

import com.sdkit.paylib.payliblogging.api.p029di.PaylibLoggingTools;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m7104d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, m7105d2 = {"Lcom/sdkit/paylib/payliblogging/impl/di/PaylibLoggingToolsFactory;", "", "()V", "create", "Lcom/sdkit/paylib/payliblogging/api/di/PaylibLoggingTools;", "paylibLoggingDependencies", "Lcom/sdkit/paylib/payliblogging/impl/di/PaylibLoggingDependencies;", "com-sdkit-assistant_paylib_logging"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes8.dex */
public final class PaylibLoggingToolsFactory {
    public static final PaylibLoggingToolsFactory INSTANCE = new PaylibLoggingToolsFactory();

    @JvmStatic
    public static final PaylibLoggingTools create(PaylibLoggingDependencies paylibLoggingDependencies) {
        Intrinsics.checkNotNullParameter(paylibLoggingDependencies, "paylibLoggingDependencies");
        return InterfaceC8077b.f1573a.m1711a(paylibLoggingDependencies);
    }
}
