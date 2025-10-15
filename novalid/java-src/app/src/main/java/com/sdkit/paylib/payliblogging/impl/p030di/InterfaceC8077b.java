package com.sdkit.paylib.payliblogging.impl.p030di;

import com.sdkit.paylib.payliblogging.api.p029di.PaylibLoggingTools;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.payliblogging.impl.di.b */
/* loaded from: classes5.dex */
public interface InterfaceC8077b extends PaylibLoggingTools {

    /* renamed from: a */
    public static final a f1573a = a.f1574a;

    /* renamed from: com.sdkit.paylib.payliblogging.impl.di.b$a */
    /* loaded from: classes8.dex */
    public static final class a {

        /* renamed from: a */
        public static final /* synthetic */ a f1574a = new a();

        /* renamed from: a */
        public final InterfaceC8077b m1711a(PaylibLoggingDependencies deps) {
            Intrinsics.checkNotNullParameter(deps, "deps");
            InterfaceC8077b interfaceC8077bM1707a = AbstractC8076a.m1705a().m1706a(deps).m1707a();
            Intrinsics.checkNotNullExpressionValue(interfaceC8077bM1707a, "builder()\n              …\n                .build()");
            return interfaceC8077bM1707a;
        }
    }
}
