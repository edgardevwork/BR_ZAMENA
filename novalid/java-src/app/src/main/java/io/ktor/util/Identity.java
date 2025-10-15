package io.ktor.util;

import io.ktor.utils.p050io.ByteReadChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* compiled from: Encoders.kt */
@Metadata(m7104d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0014\u0010\u0007\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\b"}, m7105d2 = {"Lio/ktor/util/Identity;", "Lio/ktor/util/Encoder;", "()V", "decode", "Lio/ktor/utils/io/ByteReadChannel;", "Lkotlinx/coroutines/CoroutineScope;", "source", "encode", "ktor-utils"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public final class Identity implements Encoder {

    @NotNull
    public static final Identity INSTANCE = new Identity();

    @Override // io.ktor.util.Encoder
    @NotNull
    public ByteReadChannel decode(@NotNull CoroutineScope coroutineScope, @NotNull ByteReadChannel source) {
        Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        return source;
    }

    @Override // io.ktor.util.Encoder
    @NotNull
    public ByteReadChannel encode(@NotNull CoroutineScope coroutineScope, @NotNull ByteReadChannel source) {
        Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        return source;
    }
}
