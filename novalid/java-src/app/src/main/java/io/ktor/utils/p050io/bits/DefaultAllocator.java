package io.ktor.utils.p050io.bits;

import com.fasterxml.jackson.core.base.ParserMinimalBase;
import io.ktor.utils.p050io.core.internal.NumbersKt;
import java.nio.ByteBuffer;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: MemoryFactoryJvm.kt */
@Metadata(m7104d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0007\u0010\bJ \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\tH\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0007\u0010\nJ\u001d\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0004H\u0016ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0010"}, m7105d2 = {"Lio/ktor/utils/io/bits/DefaultAllocator;", "Lio/ktor/utils/io/bits/Allocator;", "()V", "alloc", "Lio/ktor/utils/io/bits/Memory;", "size", "", "alloc-gFv-Zug", "(I)Ljava/nio/ByteBuffer;", "", "(J)Ljava/nio/ByteBuffer;", "free", "", "instance", "free-3GNKZMM", "(Ljava/nio/ByteBuffer;)V", "ktor-io"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@PublishedApi
@SourceDebugExtension({"SMAP\nMemoryFactoryJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MemoryFactoryJvm.kt\nio/ktor/utils/io/bits/DefaultAllocator\n+ 2 Numbers.kt\nio/ktor/utils/io/core/internal/NumbersKt\n*L\n1#1,48:1\n6#2,2:49\n*S KotlinDebug\n*F\n+ 1 MemoryFactoryJvm.kt\nio/ktor/utils/io/bits/DefaultAllocator\n*L\n43#1:49,2\n*E\n"})
/* loaded from: classes7.dex */
public final class DefaultAllocator implements Allocator {

    @NotNull
    public static final DefaultAllocator INSTANCE = new DefaultAllocator();

    @Override // io.ktor.utils.p050io.bits.Allocator
    /* renamed from: free-3GNKZMM */
    public void mo15418free3GNKZMM(@NotNull ByteBuffer instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
    }

    @Override // io.ktor.utils.p050io.bits.Allocator
    @NotNull
    /* renamed from: alloc-gFv-Zug */
    public ByteBuffer mo15416allocgFvZug(int size) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(size);
        Intrinsics.checkNotNullExpressionValue(byteBufferAllocate, "allocate(size)");
        return Memory.m15423constructorimpl(byteBufferAllocate);
    }

    @Override // io.ktor.utils.p050io.bits.Allocator
    @NotNull
    /* renamed from: alloc-gFv-Zug */
    public ByteBuffer mo15417allocgFvZug(long size) {
        if (size < ParserMinimalBase.MAX_INT_L) {
            return mo15416allocgFvZug((int) size);
        }
        NumbersKt.failLongToIntConversion(size, "size");
        throw new KotlinNothingValueException();
    }
}
