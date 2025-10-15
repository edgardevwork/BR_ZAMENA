package com.sdkit.paylib.paylibsdk.client.p041di.utils;

import com.sdkit.paylib.payliblogging.api.p029di.PaylibLoggingTools;
import com.sdkit.paylib.paylibnetwork.api.p035di.PaylibNetworkTools;
import com.sdkit.paylib.paylibpayment.api.config.InternalConfigProvider;
import com.sdkit.paylib.paylibplatform.api.p039di.PaylibPlatformTools;
import com.sdkit.paylib.paylibsdk.client.domain.ExtraParamsProvider;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/* renamed from: com.sdkit.paylib.paylibsdk.client.di.utils.d */
/* loaded from: classes5.dex */
public final class C8606d {

    /* renamed from: a */
    public final Map f5868a;

    public C8606d(InternalConfigProvider internalConfigProvider) {
        ExtraParamsProvider extraParamsProvider = internalConfigProvider instanceof ExtraParamsProvider ? (ExtraParamsProvider) internalConfigProvider : null;
        this.f5868a = extraParamsProvider != null ? extraParamsProvider.provideExtraParams() : null;
    }

    /* renamed from: a */
    public static final PaylibNetworkTools m4704a(Function2 factoryMethod, PaylibLoggingTools paylibLoggingTools, PaylibPlatformTools paylibPlatformTools) {
        Intrinsics.checkNotNullParameter(factoryMethod, "$factoryMethod");
        Intrinsics.checkNotNullParameter(paylibLoggingTools, "paylibLoggingTools");
        Intrinsics.checkNotNullParameter(paylibPlatformTools, "paylibPlatformTools");
        return (PaylibNetworkTools) factoryMethod.invoke(paylibLoggingTools, paylibPlatformTools);
    }

    /* renamed from: b */
    public static final InterfaceC8604b m4706b() {
        return null;
    }

    /* renamed from: a */
    public static final InterfaceC8604b m4705a(InterfaceC8604b factory) {
        Intrinsics.checkNotNullParameter(factory, "$factory");
        return factory;
    }

    /* renamed from: a */
    public final InterfaceC8605c m4707a() {
        Object obj;
        Map map = this.f5868a;
        if (map == null || (obj = map.get("external_paylib_network_tools_factory")) == null) {
            return new InterfaceC8605c() { // from class: com.sdkit.paylib.paylibsdk.client.di.utils.d$$ExternalSyntheticLambda2
                @Override // com.sdkit.paylib.paylibsdk.client.p041di.utils.InterfaceC8605c
                public final InterfaceC8604b provide() {
                    return C8606d.m4706b();
                }
            };
        }
        final Function2 function2 = (Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(obj, 2);
        final InterfaceC8604b interfaceC8604b = new InterfaceC8604b() { // from class: com.sdkit.paylib.paylibsdk.client.di.utils.d$$ExternalSyntheticLambda0
            @Override // com.sdkit.paylib.paylibsdk.client.p041di.utils.InterfaceC8604b
            /* renamed from: a */
            public final PaylibNetworkTools mo4703a(PaylibLoggingTools paylibLoggingTools, PaylibPlatformTools paylibPlatformTools) {
                return C8606d.m4704a(function2, paylibLoggingTools, paylibPlatformTools);
            }
        };
        return new InterfaceC8605c() { // from class: com.sdkit.paylib.paylibsdk.client.di.utils.d$$ExternalSyntheticLambda1
            @Override // com.sdkit.paylib.paylibsdk.client.p041di.utils.InterfaceC8605c
            public final InterfaceC8604b provide() {
                return C8606d.m4705a(interfaceC8604b);
            }
        };
    }
}
