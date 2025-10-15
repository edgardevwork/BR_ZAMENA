package com.sdkit.paylib.paylibpayment.impl.domain.network.json;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.StringFormat;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;
import kotlinx.serialization.modules.SerializersModule;

/* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.json.b */
/* loaded from: classes8.dex */
public final class C8557b implements InterfaceC8556a, StringFormat {

    /* renamed from: b */
    public static final b f5024b = new b(null);

    /* renamed from: c */
    public static final Json f5025c = JsonKt.Json$default(null, a.f5027a, 1, null);

    /* renamed from: a */
    public final /* synthetic */ Json f5026a = f5025c;

    /* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.json.b$a */
    public static final class a extends Lambda implements Function1 {

        /* renamed from: a */
        public static final a f5027a = new a();

        public a() {
            super(1);
        }

        /* renamed from: a */
        public final void m4144a(JsonBuilder Json) {
            Intrinsics.checkNotNullParameter(Json, "$this$Json");
            Json.setIgnoreUnknownKeys(true);
            Json.setCoerceInputValues(true);
            Json.setExplicitNulls(false);
            Json.setLenient(true);
            Json.setEncodeDefaults(true);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m4144a((JsonBuilder) obj);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.json.b$b */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // kotlinx.serialization.StringFormat
    public Object decodeFromString(DeserializationStrategy deserializer, String string) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(string, "string");
        return this.f5026a.decodeFromString(deserializer, string);
    }

    @Override // kotlinx.serialization.StringFormat
    public String encodeToString(SerializationStrategy serializer, Object obj) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        return this.f5026a.encodeToString(serializer, obj);
    }

    @Override // kotlinx.serialization.SerialFormat
    public SerializersModule getSerializersModule() {
        return this.f5026a.getSerializersModule();
    }
}
