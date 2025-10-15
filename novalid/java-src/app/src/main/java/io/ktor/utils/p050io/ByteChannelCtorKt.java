package io.ktor.utils.p050io;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import io.ktor.utils.p050io.charsets.CharsetJVMKt;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: ByteChannelCtor.kt */
@Metadata(m7104d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u001c\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\f\b\u0002\u0010\b\u001a\u00060\tj\u0002`\n¨\u0006\u000b"}, m7105d2 = {"ByteReadChannel", "Lio/ktor/utils/io/ByteReadChannel;", "content", "", TypedValues.CycleType.S_WAVE_OFFSET, "", "text", "", "charset", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", "ktor-io"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nByteChannelCtor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteChannelCtor.kt\nio/ktor/utils/io/ByteChannelCtorKt\n+ 2 Strings.kt\nio/ktor/utils/io/core/StringsKt\n*L\n1#1,66:1\n8#2,3:67\n*S KotlinDebug\n*F\n+ 1 ByteChannelCtor.kt\nio/ktor/utils/io/ByteChannelCtorKt\n*L\n65#1:67,3\n*E\n"})
/* loaded from: classes8.dex */
public final class ByteChannelCtorKt {
    @NotNull
    public static final ByteReadChannel ByteReadChannel(@NotNull byte[] content) {
        Intrinsics.checkNotNullParameter(content, "content");
        return ByteChannelKt.ByteReadChannel(content, 0, content.length);
    }

    @NotNull
    public static final ByteReadChannel ByteReadChannel(@NotNull byte[] content, int i) {
        Intrinsics.checkNotNullParameter(content, "content");
        return ByteChannelKt.ByteReadChannel(content, i, content.length);
    }

    public static /* synthetic */ ByteReadChannel ByteReadChannel$default(String str, Charset charset, int i, Object obj) {
        if ((i & 2) != 0) {
            charset = Charsets.UTF_8;
        }
        return ByteReadChannel(str, charset);
    }

    @NotNull
    public static final ByteReadChannel ByteReadChannel(@NotNull String text, @NotNull Charset charset) {
        byte[] bArrEncodeToByteArray;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (Intrinsics.areEqual(charset, Charsets.UTF_8)) {
            bArrEncodeToByteArray = StringsKt__StringsJVMKt.encodeToByteArray(text);
        } else {
            CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
            Intrinsics.checkNotNullExpressionValue(charsetEncoderNewEncoder, "charset.newEncoder()");
            bArrEncodeToByteArray = CharsetJVMKt.encodeToByteArray(charsetEncoderNewEncoder, text, 0, text.length());
        }
        return ByteReadChannel(bArrEncodeToByteArray);
    }
}
