package com.sdkit.paylib.paylibnetwork.impl.p036di;

import com.sdkit.paylib.payliblogging.api.p029di.PaylibLoggingTools;
import com.sdkit.paylib.paylibnetwork.api.p035di.PaylibNetworkTools;
import com.sdkit.paylib.paylibplatform.api.p039di.PaylibPlatformTools;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibnetwork.impl.di.b */
/* loaded from: classes6.dex */
public interface InterfaceC8456b extends PaylibNetworkTools {

    /* renamed from: a */
    public static final a f4128a = a.f4129a;

    /* renamed from: com.sdkit.paylib.paylibnetwork.impl.di.b$a */
    public static final class a {

        /* renamed from: a */
        public static final /* synthetic */ a f4129a = new a();

        /* renamed from: a */
        public final InterfaceC8456b m3801a(PaylibLoggingTools paylibLoggingTools, PaylibPlatformTools paylibPlatformTools) {
            Intrinsics.checkNotNullParameter(paylibLoggingTools, "paylibLoggingTools");
            Intrinsics.checkNotNullParameter(paylibPlatformTools, "paylibPlatformTools");
            InterfaceC8456b interfaceC8456bM3795a = AbstractC8455a.m3792a().m3793a(paylibLoggingTools).m3794a(paylibPlatformTools).m3795a();
            Intrinsics.checkNotNullExpressionValue(interfaceC8456bM3795a, "builder()\n            .p…ols)\n            .build()");
            return interfaceC8456bM3795a;
        }
    }
}
