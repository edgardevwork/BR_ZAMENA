package io.ktor.utils.p050io.core;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Builder.kt */
@Metadata(m7104d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a2\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u001a\n\u0010\u0007\u001a\u00020\u0005*\u00020\u0004\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\b"}, m7105d2 = {"buildPacket", "Lio/ktor/utils/io/core/ByteReadPacket;", "block", "Lkotlin/Function1;", "Lio/ktor/utils/io/core/BytePacketBuilder;", "", "Lkotlin/ExtensionFunctionType;", "reset", "ktor-io"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes8.dex */
public final class BuilderKt {
    @NotNull
    public static final ByteReadPacket buildPacket(@NotNull Function1<? super BytePacketBuilder, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        BytePacketBuilder bytePacketBuilder = new BytePacketBuilder(null, 1, null);
        try {
            block.invoke(bytePacketBuilder);
            return bytePacketBuilder.build();
        } catch (Throwable th) {
            bytePacketBuilder.release();
            throw th;
        }
    }

    public static final void reset(@NotNull BytePacketBuilder bytePacketBuilder) {
        Intrinsics.checkNotNullParameter(bytePacketBuilder, "<this>");
        bytePacketBuilder.release();
    }
}
