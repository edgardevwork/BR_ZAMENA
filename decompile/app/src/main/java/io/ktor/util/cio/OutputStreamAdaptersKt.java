package io.ktor.util.cio;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import io.ktor.utils.p050io.ByteWriteChannel;
import io.ktor.utils.p050io.ByteWriteChannelKt;
import io.ktor.utils.p050io.jvm.javaio.BlockingKt;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: OutputStreamAdapters.kt */
@Metadata(m7104d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u001a'\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\t\u001a\u0014\u0010\n\u001a\u00020\u000b*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, m7105d2 = {"bufferedWriter", "Ljava/io/BufferedWriter;", "Lio/ktor/utils/io/ByteWriteChannel;", "charset", "Ljava/nio/charset/Charset;", "write", "", TypedValues.Custom.S_STRING, "", "(Lio/ktor/utils/io/ByteWriteChannel;Ljava/lang/String;Ljava/nio/charset/Charset;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writer", "Ljava/io/Writer;", "ktor-utils"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public final class OutputStreamAdaptersKt {
    public static /* synthetic */ Object write$default(ByteWriteChannel byteWriteChannel, String str, Charset charset, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            charset = Charsets.UTF_8;
        }
        return write(byteWriteChannel, str, charset, continuation);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "This is going to be removed or renamed.", replaceWith = @ReplaceWith(expression = "writeFully(string.toByteArray(charset))", imports = {"io.ktor.utils.io.writeFully"}))
    @Nullable
    public static final Object write(@NotNull ByteWriteChannel byteWriteChannel, @NotNull String str, @NotNull Charset charset, @NotNull Continuation<? super Unit> continuation) {
        byte[] bytes = str.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        Object objWriteFully = ByteWriteChannelKt.writeFully(byteWriteChannel, bytes, continuation);
        return objWriteFully == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWriteFully : Unit.INSTANCE;
    }

    public static /* synthetic */ BufferedWriter bufferedWriter$default(ByteWriteChannel byteWriteChannel, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        return bufferedWriter(byteWriteChannel, charset);
    }

    @NotNull
    public static final BufferedWriter bufferedWriter(@NotNull ByteWriteChannel byteWriteChannel, @NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(byteWriteChannel, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Writer outputStreamWriter = new OutputStreamWriter(BlockingKt.toOutputStream$default(byteWriteChannel, null, 1, null), charset);
        return outputStreamWriter instanceof BufferedWriter ? (BufferedWriter) outputStreamWriter : new BufferedWriter(outputStreamWriter, 8192);
    }

    public static /* synthetic */ Writer writer$default(ByteWriteChannel byteWriteChannel, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        return writer(byteWriteChannel, charset);
    }

    @NotNull
    public static final Writer writer(@NotNull ByteWriteChannel byteWriteChannel, @NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(byteWriteChannel, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new OutputStreamWriter(BlockingKt.toOutputStream$default(byteWriteChannel, null, 1, null), charset);
    }
}
