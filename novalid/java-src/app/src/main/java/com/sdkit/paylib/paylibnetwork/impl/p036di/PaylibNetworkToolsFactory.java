package com.sdkit.paylib.paylibnetwork.impl.p036di;

import com.sdkit.paylib.payliblogging.api.p029di.PaylibLoggingTools;
import com.sdkit.paylib.paylibnetwork.api.p035di.PaylibNetworkTools;
import com.sdkit.paylib.paylibplatform.api.p039di.PaylibPlatformTools;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m7104d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, m7105d2 = {"Lcom/sdkit/paylib/paylibnetwork/impl/di/PaylibNetworkToolsFactory;", "", "()V", "create", "Lcom/sdkit/paylib/paylibnetwork/api/di/PaylibNetworkTools;", "paylibLoggingTools", "Lcom/sdkit/paylib/payliblogging/api/di/PaylibLoggingTools;", "paylibPlatformTools", "Lcom/sdkit/paylib/paylibplatform/api/di/PaylibPlatformTools;", "com-sdkit-assistant_paylib_network"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes6.dex */
public final class PaylibNetworkToolsFactory {
    public static final PaylibNetworkToolsFactory INSTANCE = new PaylibNetworkToolsFactory();

    @JvmStatic
    public static final PaylibNetworkTools create(PaylibLoggingTools paylibLoggingTools, PaylibPlatformTools paylibPlatformTools) {
        Intrinsics.checkNotNullParameter(paylibLoggingTools, "paylibLoggingTools");
        Intrinsics.checkNotNullParameter(paylibPlatformTools, "paylibPlatformTools");
        return InterfaceC8456b.f4128a.m3801a(paylibLoggingTools, paylibPlatformTools);
    }
}
