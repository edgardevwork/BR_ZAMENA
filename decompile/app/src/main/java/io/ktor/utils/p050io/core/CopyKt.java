package io.ktor.utils.p050io.core;

import io.ktor.utils.p050io.core.internal.ChunkBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.ivy.osgi.p063p2.P2ArtifactParser;
import org.jetbrains.annotations.NotNull;

/* compiled from: Copy.kt */
@Metadata(m7104d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m7105d2 = {"copyTo", "", "Lio/ktor/utils/io/core/Input;", P2ArtifactParser.RuleHandler.OUTPUT, "Lio/ktor/utils/io/core/Output;", "ktor-io"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes5.dex */
public final class CopyKt {
    public static final long copyTo(@NotNull Input input, @NotNull Output output) {
        Intrinsics.checkNotNullParameter(input, "<this>");
        Intrinsics.checkNotNullParameter(output, "output");
        long jRemainingAll = 0;
        while (true) {
            ChunkBuffer chunkBufferStealAll$ktor_io = input.stealAll$ktor_io();
            if (chunkBufferStealAll$ktor_io == null) {
                if (input.prepareRead(1) == null) {
                    return jRemainingAll;
                }
            } else {
                jRemainingAll += BuffersKt.remainingAll(chunkBufferStealAll$ktor_io);
                output.appendChain$ktor_io(chunkBufferStealAll$ktor_io);
            }
        }
    }
}
