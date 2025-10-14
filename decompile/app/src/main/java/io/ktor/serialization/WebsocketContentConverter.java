package io.ktor.serialization;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.websocket.Frame;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: WebsocketContentConverter.kt */
@Metadata(m7104d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J/\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH¦@ø\u0001\u0000¢\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tH&J-\u0010\u000e\u001a\u00020\t2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0001H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0010J/\u0010\u0011\u001a\u00020\t2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, m7105d2 = {"Lio/ktor/serialization/WebsocketContentConverter;", "", "deserialize", "charset", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", "typeInfo", "Lio/ktor/util/reflect/TypeInfo;", "content", "Lio/ktor/websocket/Frame;", "(Ljava/nio/charset/Charset;Lio/ktor/util/reflect/TypeInfo;Lio/ktor/websocket/Frame;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isApplicable", "", TypedValues.AttributesType.S_FRAME, "serialize", "value", "(Ljava/nio/charset/Charset;Lio/ktor/util/reflect/TypeInfo;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "serializeNullable", "ktor-serialization"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes6.dex */
public interface WebsocketContentConverter {
    @Nullable
    Object deserialize(@NotNull Charset charset, @NotNull TypeInfo typeInfo, @NotNull Frame frame, @NotNull Continuation<Object> continuation);

    boolean isApplicable(@NotNull Frame frame);

    @Nullable
    Object serialize(@NotNull Charset charset, @NotNull TypeInfo typeInfo, @NotNull Object obj, @NotNull Continuation<? super Frame> continuation);

    @Nullable
    Object serializeNullable(@NotNull Charset charset, @NotNull TypeInfo typeInfo, @Nullable Object obj, @NotNull Continuation<? super Frame> continuation);

    /* compiled from: WebsocketContentConverter.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class DefaultImpls {
        @Nullable
        public static Object serialize(@NotNull WebsocketContentConverter websocketContentConverter, @NotNull Charset charset, @NotNull TypeInfo typeInfo, @NotNull Object obj, @NotNull Continuation<? super Frame> continuation) {
            return websocketContentConverter.serializeNullable(charset, typeInfo, obj, continuation);
        }

        @Nullable
        public static Object serializeNullable(@NotNull WebsocketContentConverter websocketContentConverter, @NotNull Charset charset, @NotNull TypeInfo typeInfo, @Nullable Object obj, @NotNull Continuation<? super Frame> continuation) {
            Intrinsics.checkNotNull(obj);
            return websocketContentConverter.serialize(charset, typeInfo, obj, continuation);
        }
    }
}
