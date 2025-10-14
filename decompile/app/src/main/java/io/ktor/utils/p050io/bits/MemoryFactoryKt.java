package io.ktor.utils.p050io.bits;

import io.ktor.utils.p050io.DeprecationKt;
import java.nio.ByteBuffer;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: MemoryFactory.kt */
@Metadata(m7104d1 = {"\u0000\u001c\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u001aC\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H\u00010\u0005H\u0087\bø\u0001\u0000ø\u0001\u0001\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0002\u0010\u0007\u001aC\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u00020\b2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H\u00010\u0005H\u0087\bø\u0001\u0000ø\u0001\u0001\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0002\u0010\t\u0082\u0002\u000b\n\u0005\b\u009920\u0001\n\u0002\b\u0019¨\u0006\n"}, m7105d2 = {"withMemory", "R", "size", "", "block", "Lkotlin/Function1;", "Lio/ktor/utils/io/bits/Memory;", "(ILkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "", "(JLkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "ktor-io"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nMemoryFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MemoryFactory.kt\nio/ktor/utils/io/bits/MemoryFactoryKt\n*L\n1#1,71:1\n48#1,11:72\n*S KotlinDebug\n*F\n+ 1 MemoryFactory.kt\nio/ktor/utils/io/bits/MemoryFactoryKt\n*L\n37#1:72,11\n*E\n"})
/* loaded from: classes8.dex */
public final class MemoryFactoryKt {
    @Deprecated(message = DeprecationKt.IO_DEPRECATION_MESSAGE)
    public static final <R> R withMemory(long j, @NotNull Function1<? super Memory, ? extends R> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        DefaultAllocator defaultAllocator = DefaultAllocator.INSTANCE;
        ByteBuffer byteBufferMo15417allocgFvZug = defaultAllocator.mo15417allocgFvZug(j);
        try {
            return block.invoke(Memory.m15422boximpl(byteBufferMo15417allocgFvZug));
        } finally {
            InlineMarker.finallyStart(1);
            defaultAllocator.mo15418free3GNKZMM(byteBufferMo15417allocgFvZug);
            InlineMarker.finallyEnd(1);
        }
    }

    @Deprecated(message = DeprecationKt.IO_DEPRECATION_MESSAGE)
    public static final <R> R withMemory(int i, @NotNull Function1<? super Memory, ? extends R> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        long j = i;
        DefaultAllocator defaultAllocator = DefaultAllocator.INSTANCE;
        ByteBuffer byteBufferMo15417allocgFvZug = defaultAllocator.mo15417allocgFvZug(j);
        try {
            return block.invoke(Memory.m15422boximpl(byteBufferMo15417allocgFvZug));
        } finally {
            InlineMarker.finallyStart(1);
            defaultAllocator.mo15418free3GNKZMM(byteBufferMo15417allocgFvZug);
            InlineMarker.finallyEnd(1);
        }
    }
}
