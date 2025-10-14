package io.ktor.utils.p050io.streams;

import io.ktor.utils.p050io.core.Output;
import io.ktor.utils.p050io.core.internal.ChunkBuffer;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Output.kt */
@Metadata(m7104d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m7105d2 = {"asOutput", "Lio/ktor/utils/io/core/Output;", "Ljava/io/OutputStream;", "ktor-io"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes5.dex */
public final class OutputKt {
    @NotNull
    public static final Output asOutput(@NotNull OutputStream outputStream) {
        Intrinsics.checkNotNullParameter(outputStream, "<this>");
        return new OutputStreamAdapter(ChunkBuffer.INSTANCE.getPool(), outputStream);
    }
}
