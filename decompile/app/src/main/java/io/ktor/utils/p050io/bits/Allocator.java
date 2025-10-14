package io.ktor.utils.p050io.bits;

import java.nio.ByteBuffer;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: MemoryFactory.kt */
@Metadata(m7104d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\bH&ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\tJ\u001d\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0003H&ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000f"}, m7105d2 = {"Lio/ktor/utils/io/bits/Allocator;", "", "alloc", "Lio/ktor/utils/io/bits/Memory;", "size", "", "alloc-gFv-Zug", "(I)Ljava/nio/ByteBuffer;", "", "(J)Ljava/nio/ByteBuffer;", "free", "", "instance", "free-3GNKZMM", "(Ljava/nio/ByteBuffer;)V", "ktor-io"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes8.dex */
public interface Allocator {
    @NotNull
    /* renamed from: alloc-gFv-Zug, reason: not valid java name */
    ByteBuffer mo15416allocgFvZug(int size);

    @NotNull
    /* renamed from: alloc-gFv-Zug, reason: not valid java name */
    ByteBuffer mo15417allocgFvZug(long size);

    /* renamed from: free-3GNKZMM, reason: not valid java name */
    void mo15418free3GNKZMM(@NotNull ByteBuffer instance);
}
