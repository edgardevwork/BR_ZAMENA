package com.sdkit.paylib.paylibdomain.impl.utils;

import com.sdkit.paylib.payliblogging.api.logging.PaylibLogger;
import com.sdkit.paylib.paylibutils.lib.AbstractC8611c;
import kotlin.Result;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.sdkit.paylib.paylibdomain.impl.utils.a */
/* loaded from: classes6.dex */
public abstract class AbstractC8074a {

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.utils.a$a */
    public static final class a extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ Throwable f1564a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Throwable th) {
            super(0);
            this.f1564a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Throwable: " + AbstractC8611c.m4716a(this.f1564a);
        }
    }

    /* renamed from: a */
    public static final Object m1688a(Object obj, PaylibLogger logger) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        Throwable thM15702exceptionOrNullimpl = Result.m15702exceptionOrNullimpl(obj);
        if (thM15702exceptionOrNullimpl != null) {
            PaylibLogger.DefaultImpls.e$default(logger, null, new a(thM15702exceptionOrNullimpl), 1, null);
        }
        return obj;
    }
}
