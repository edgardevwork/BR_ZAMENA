package com.sdkit.paylib.paylibnative.p033ui.config;

import com.sdkit.paylib.paylibnative.api.presentation.PaylibHostRouter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibnative.ui.config.a */
/* loaded from: classes8.dex */
public abstract class AbstractC8130a {

    /* renamed from: com.sdkit.paylib.paylibnative.ui.config.a$a */
    /* loaded from: classes5.dex */
    public static final class a extends AbstractC8130a {

        /* renamed from: a */
        public static final a f1946a = new a();

        public a() {
            super(null);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.config.a$b */
    /* loaded from: classes5.dex */
    public static final class b extends AbstractC8130a {

        /* renamed from: a */
        public final PaylibHostRouter f1947a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(PaylibHostRouter hostRouter) {
            super(null);
            Intrinsics.checkNotNullParameter(hostRouter, "hostRouter");
            this.f1947a = hostRouter;
        }

        /* renamed from: a */
        public final PaylibHostRouter m2005a() {
            return this.f1947a;
        }
    }

    public AbstractC8130a() {
    }

    public /* synthetic */ AbstractC8130a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
