package com.sdkit.paylib.paylibdomain.impl.p028di;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;

/* renamed from: com.sdkit.paylib.paylibdomain.impl.di.c */
/* loaded from: classes6.dex */
public final class C8051c {

    /* renamed from: a */
    public static final C8051c f1207a = new C8051c();

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.di.c$a */
    /* loaded from: classes7.dex */
    public static final class a extends Lambda implements Function1 {

        /* renamed from: a */
        public static final a f1208a = new a();

        public a() {
            super(1);
        }

        /* renamed from: a */
        public final void m1518a(JsonBuilder Json) {
            Intrinsics.checkNotNullParameter(Json, "$this$Json");
            Json.setIgnoreUnknownKeys(true);
            Json.setExplicitNulls(false);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m1518a((JsonBuilder) obj);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: a */
    public final Json m1517a() {
        return JsonKt.Json$default(null, a.f1208a, 1, null);
    }
}
