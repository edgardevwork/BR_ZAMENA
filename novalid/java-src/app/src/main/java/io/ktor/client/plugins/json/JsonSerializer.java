package io.ktor.client.plugins.json;

import io.ktor.http.ContentType;
import io.ktor.http.content.OutgoingContent;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.utils.p050io.core.Input;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: JsonSerializer.kt */
@Deprecated(message = "Please use ContentNegotiation plugin and its converters: https://ktor.io/docs/migrating-2.html#serialization-client")
@Metadata(m7104d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0001H\u0016J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, m7105d2 = {"Lio/ktor/client/plugins/json/JsonSerializer;", "", "read", "type", "Lio/ktor/util/reflect/TypeInfo;", "body", "Lio/ktor/utils/io/core/Input;", "write", "Lio/ktor/http/content/OutgoingContent;", "data", "contentType", "Lio/ktor/http/ContentType;", "ktor-client-json"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public interface JsonSerializer {
    @NotNull
    Object read(@NotNull TypeInfo type, @NotNull Input body);

    @NotNull
    OutgoingContent write(@NotNull Object data);

    @NotNull
    OutgoingContent write(@NotNull Object data, @NotNull ContentType contentType);

    /* compiled from: JsonSerializer.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class DefaultImpls {
        @NotNull
        public static OutgoingContent write(@NotNull JsonSerializer jsonSerializer, @NotNull Object data) {
            Intrinsics.checkNotNullParameter(data, "data");
            return jsonSerializer.write(data, ContentType.Application.INSTANCE.getJson());
        }
    }
}
