package io.ktor.client.plugins.kotlinx.serializer;

import io.ktor.client.plugins.json.JsonSerializer;
import io.ktor.http.ContentType;
import io.ktor.http.content.OutgoingContent;
import io.ktor.http.content.TextContent;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.utils.p050io.core.Input;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KType;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;
import kotlinx.serialization.modules.SerializersModule;
import org.jetbrains.annotations.NotNull;

/* compiled from: KotlinxSerializer.kt */
@Metadata(m7104d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0015\u0010\u0010\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m7105d2 = {"Lio/ktor/client/plugins/kotlinx/serializer/KotlinxSerializer;", "Lio/ktor/client/plugins/json/JsonSerializer;", "json", "Lkotlinx/serialization/json/Json;", "(Lkotlinx/serialization/json/Json;)V", "read", "", "type", "Lio/ktor/util/reflect/TypeInfo;", "body", "Lio/ktor/utils/io/core/Input;", "write", "Lio/ktor/http/content/OutgoingContent;", "data", "contentType", "Lio/ktor/http/ContentType;", "writeContent", "", "writeContent$ktor_client_serialization", "Companion", "ktor-client-serialization"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@Deprecated(message = "Please use ContentNegotiation plugin and its converters: https://ktor.io/docs/migrating-2.html#serialization-client")
@SourceDebugExtension({"SMAP\nKotlinxSerializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KotlinxSerializer.kt\nio/ktor/client/plugins/kotlinx/serializer/KotlinxSerializer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,102:1\n1#2:103\n*E\n"})
/* loaded from: classes7.dex */
public final class KotlinxSerializer implements JsonSerializer {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Json DefaultJson = JsonKt.Json$default(null, new Function1<JsonBuilder, Unit>() { // from class: io.ktor.client.plugins.kotlinx.serializer.KotlinxSerializer$Companion$DefaultJson$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(JsonBuilder jsonBuilder) {
            invoke2(jsonBuilder);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull JsonBuilder Json) {
            Intrinsics.checkNotNullParameter(Json, "$this$Json");
            Json.setLenient(false);
            Json.setIgnoreUnknownKeys(false);
            Json.setAllowSpecialFloatingPointValues(true);
            Json.setUseArrayPolymorphism(false);
        }
    }, 1, null);

    @NotNull
    public final Json json;

    public KotlinxSerializer() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public KotlinxSerializer(@NotNull Json json) {
        Intrinsics.checkNotNullParameter(json, "json");
        this.json = json;
    }

    @Override // io.ktor.client.plugins.json.JsonSerializer
    @NotNull
    public OutgoingContent write(@NotNull Object obj) {
        return JsonSerializer.DefaultImpls.write(this, obj);
    }

    public /* synthetic */ KotlinxSerializer(Json json, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? DefaultJson : json);
    }

    @Override // io.ktor.client.plugins.json.JsonSerializer
    @NotNull
    public OutgoingContent write(@NotNull Object data, @NotNull ContentType contentType) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        return new TextContent(writeContent$ktor_client_serialization(data), contentType, null, 4, null);
    }

    @NotNull
    public final String writeContent$ktor_client_serialization(@NotNull Object data) {
        Intrinsics.checkNotNullParameter(data, "data");
        Json json = this.json;
        return json.encodeToString(KotlinxSerializerKt.buildSerializer(data, json.getSerializersModule()), data);
    }

    @Override // io.ktor.client.plugins.json.JsonSerializer
    @NotNull
    public Object read(@NotNull TypeInfo type, @NotNull Input body) {
        KType kotlinType;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(body, "body");
        String text$default = Input.readText$default(body, 0, 0, 3, null);
        KSerializer<Object> contextual$default = SerializersModule.getContextual$default(this.json.getSerializersModule(), type.getType(), null, 2, null);
        if (contextual$default == null && ((kotlinType = type.getKotlinType()) == null || (contextual$default = SerializersKt.serializer(kotlinType)) == null)) {
            contextual$default = SerializersKt.serializer(type.getType());
        }
        Object objDecodeFromString = this.json.decodeFromString(contextual$default, text$default);
        Intrinsics.checkNotNull(objDecodeFromString);
        return objDecodeFromString;
    }

    /* compiled from: KotlinxSerializer.kt */
    @Metadata(m7104d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m7105d2 = {"Lio/ktor/client/plugins/kotlinx/serializer/KotlinxSerializer$Companion;", "", "()V", "DefaultJson", "Lkotlinx/serialization/json/Json;", "getDefaultJson", "()Lkotlinx/serialization/json/Json;", "ktor-client-serialization"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final Json getDefaultJson() {
            return KotlinxSerializer.DefaultJson;
        }
    }
}
