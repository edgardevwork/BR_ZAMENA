package io.ktor.serialization;

import io.ktor.http.ContentType;
import io.ktor.http.content.OutgoingContent;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.utils.p050io.ByteReadChannel;
import java.nio.charset.Charset;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ContentConverter.kt */
@Metadata(m7104d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J/\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH¦@ø\u0001\u0000¢\u0006\u0002\u0010\nJ7\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0001H\u0097@ø\u0001\u0000¢\u0006\u0002\u0010\u0010J9\u0010\u0011\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, m7105d2 = {"Lio/ktor/serialization/ContentConverter;", "", "deserialize", "charset", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", "typeInfo", "Lio/ktor/util/reflect/TypeInfo;", "content", "Lio/ktor/utils/io/ByteReadChannel;", "(Ljava/nio/charset/Charset;Lio/ktor/util/reflect/TypeInfo;Lio/ktor/utils/io/ByteReadChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "serialize", "Lio/ktor/http/content/OutgoingContent;", "contentType", "Lio/ktor/http/ContentType;", "value", "(Lio/ktor/http/ContentType;Ljava/nio/charset/Charset;Lio/ktor/util/reflect/TypeInfo;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "serializeNullable", "ktor-serialization"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes6.dex */
public interface ContentConverter {
    @Nullable
    Object deserialize(@NotNull Charset charset, @NotNull TypeInfo typeInfo, @NotNull ByteReadChannel byteReadChannel, @NotNull Continuation<Object> continuation);

    @Deprecated(level = DeprecationLevel.WARNING, message = "Please override and use serializeNullable instead", replaceWith = @ReplaceWith(expression = "serializeNullable(charset, typeInfo, contentType, value)", imports = {}))
    @Nullable
    Object serialize(@NotNull ContentType contentType, @NotNull Charset charset, @NotNull TypeInfo typeInfo, @NotNull Object obj, @NotNull Continuation<? super OutgoingContent> continuation);

    @Nullable
    Object serializeNullable(@NotNull ContentType contentType, @NotNull Charset charset, @NotNull TypeInfo typeInfo, @Nullable Object obj, @NotNull Continuation<? super OutgoingContent> continuation);

    /* compiled from: ContentConverter.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class DefaultImpls {
        @Deprecated(level = DeprecationLevel.WARNING, message = "Please override and use serializeNullable instead", replaceWith = @ReplaceWith(expression = "serializeNullable(charset, typeInfo, contentType, value)", imports = {}))
        @Nullable
        public static Object serialize(@NotNull ContentConverter contentConverter, @NotNull ContentType contentType, @NotNull Charset charset, @NotNull TypeInfo typeInfo, @NotNull Object obj, @NotNull Continuation<? super OutgoingContent> continuation) {
            return contentConverter.serializeNullable(contentType, charset, typeInfo, obj, continuation);
        }

        @Nullable
        public static Object serializeNullable(@NotNull ContentConverter contentConverter, @NotNull ContentType contentType, @NotNull Charset charset, @NotNull TypeInfo typeInfo, @Nullable Object obj, @NotNull Continuation<? super OutgoingContent> continuation) {
            Intrinsics.checkNotNull(obj);
            return contentConverter.serialize(contentType, charset, typeInfo, obj, continuation);
        }
    }
}
