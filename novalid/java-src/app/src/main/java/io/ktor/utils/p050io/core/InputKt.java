package io.ktor.utils.p050io.core;

import io.ktor.utils.p050io.core.internal.ChunkBuffer;
import io.ktor.utils.p050io.core.internal.MalformedUTF8InputException;
import io.ktor.utils.p050io.core.internal.UTF8Kt;
import io.ktor.utils.p050io.core.internal.UnsafeKt;
import java.io.EOFException;
import java.nio.ByteBuffer;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.http.cookie.ClientCookie;
import org.jetbrains.annotations.NotNull;

/* compiled from: Input.kt */
@Metadata(m7104d1 = {"\u00008\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0012\u0010\u0003\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u0012\u0010\u0003\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0001\u001a$\u0010\u0007\u001a\u00020\u0004*\u00020\u00022\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\tH\u0080\bø\u0001\u0000\u001a\n\u0010\u000b\u001a\u00020\f*\u00020\u0002\u001a\u0014\u0010\r\u001a\u00020\f*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0006H\u0002\u001a$\u0010\u000f\u001a\u00020\u0004*\u00020\u00022\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\tH\u0086\bø\u0001\u0000\u001a.\u0010\u0012\u001a\u00020\u0004*\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00062\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\tH\u0080\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, m7105d2 = {ClientCookie.DISCARD_ATTR, "", "Lio/ktor/utils/io/core/Input;", "discardExact", "", "n", "", "forEach", "block", "Lkotlin/Function1;", "", "peekCharUtf8", "", "peekCharUtf8Impl", "first", "takeWhile", "Lio/ktor/utils/io/core/Buffer;", "", "takeWhileSize", "initialSize", "ktor-io"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nInput.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Input.kt\nio/ktor/utils/io/core/InputKt\n+ 2 Buffer.kt\nio/ktor/utils/io/core/Buffer\n+ 3 BufferPrimitives.kt\nio/ktor/utils/io/core/BufferPrimitivesKt\n+ 4 Buffer.kt\nio/ktor/utils/io/core/BufferKt\n+ 5 Memory.kt\nio/ktor/utils/io/bits/MemoryKt\n+ 6 MemoryJvm.kt\nio/ktor/utils/io/bits/Memory\n+ 7 UTF8.kt\nio/ktor/utils/io/core/internal/UTF8Kt\n*L\n1#1,932:1\n823#1,6:938\n829#1,13:958\n853#1,7:971\n862#1,3:979\n866#1,11:1060\n877#1,15:1072\n69#2:933\n69#2:934\n59#2:935\n69#2:936\n59#2:937\n69#2:978\n59#2:1071\n14#3:944\n15#3,2:950\n18#3:954\n20#3:957\n372#4,5:945\n377#4,2:955\n372#4,5:987\n377#4,2:1057\n84#5:952\n84#5:994\n26#6:953\n26#6:995\n123#7,5:982\n128#7,2:992\n130#7,61:996\n193#7:1059\n*S KotlinDebug\n*F\n+ 1 Input.kt\nio/ktor/utils/io/core/InputKt\n*L\n907#1:938,6\n907#1:958,13\n918#1:971,7\n918#1:979,3\n918#1:1060,11\n918#1:1072,15\n859#1:933\n866#1:934\n876#1:935\n866#1:936\n876#1:937\n918#1:978\n918#1:1071\n908#1:944\n908#1:950,2\n908#1:954\n908#1:957\n908#1:945,5\n908#1:955,2\n919#1:987,5\n919#1:1057,2\n908#1:952\n919#1:994\n908#1:953\n919#1:995\n919#1:982,5\n919#1:992,2\n919#1:996,61\n919#1:1059\n*E\n"})
/* loaded from: classes5.dex */
public final class InputKt {
    public static final long discard(@NotNull Input input) {
        Intrinsics.checkNotNullParameter(input, "<this>");
        return input.discard(Long.MAX_VALUE);
    }

    public static final void discardExact(@NotNull Input input, long j) {
        Intrinsics.checkNotNullParameter(input, "<this>");
        long jDiscard = input.discard(j);
        if (jDiscard == j) {
            return;
        }
        throw new IllegalStateException("Only " + jDiscard + " bytes were discarded of " + j + " requested");
    }

    public static final void discardExact(@NotNull Input input, int i) {
        Intrinsics.checkNotNullParameter(input, "<this>");
        discardExact(input, i);
    }

    public static final void takeWhile(@NotNull Input input, @NotNull Function1<? super Buffer, Boolean> block) throws Throwable {
        boolean z;
        Intrinsics.checkNotNullParameter(input, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        ChunkBuffer chunkBufferPrepareReadFirstHead = UnsafeKt.prepareReadFirstHead(input, 1);
        if (chunkBufferPrepareReadFirstHead == null) {
            return;
        }
        while (true) {
            try {
                if (!block.invoke(chunkBufferPrepareReadFirstHead).booleanValue()) {
                    z = true;
                    break;
                }
                z = false;
                try {
                    ChunkBuffer chunkBufferPrepareReadNextHead = UnsafeKt.prepareReadNextHead(input, chunkBufferPrepareReadFirstHead);
                    if (chunkBufferPrepareReadNextHead == null) {
                        break;
                    } else {
                        chunkBufferPrepareReadFirstHead = chunkBufferPrepareReadNextHead;
                    }
                } catch (Throwable th) {
                    th = th;
                    InlineMarker.finallyStart(1);
                    if (z) {
                        UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
                    }
                    InlineMarker.finallyEnd(1);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                z = true;
            }
        }
        InlineMarker.finallyStart(1);
        if (z) {
            UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
        }
        InlineMarker.finallyEnd(1);
    }

    public static /* synthetic */ void takeWhileSize$default(Input input, int i, Function1 block, int i2, Object obj) throws Throwable {
        boolean z;
        ChunkBuffer chunkBufferPrepareReadNextHead;
        if ((i2 & 1) != 0) {
            i = 1;
        }
        Intrinsics.checkNotNullParameter(input, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        ChunkBuffer chunkBufferPrepareReadFirstHead = UnsafeKt.prepareReadFirstHead(input, i);
        if (chunkBufferPrepareReadFirstHead == null) {
            return;
        }
        while (true) {
            try {
                int writePosition = chunkBufferPrepareReadFirstHead.getWritePosition() - chunkBufferPrepareReadFirstHead.getReadPosition();
                if (writePosition >= i) {
                    try {
                        i = ((Number) block.invoke(chunkBufferPrepareReadFirstHead)).intValue();
                        InlineMarker.finallyStart(1);
                        writePosition = chunkBufferPrepareReadFirstHead.getWritePosition() - chunkBufferPrepareReadFirstHead.getReadPosition();
                        InlineMarker.finallyEnd(1);
                    } finally {
                    }
                }
                z = false;
                if (writePosition == 0) {
                    try {
                        chunkBufferPrepareReadNextHead = UnsafeKt.prepareReadNextHead(input, chunkBufferPrepareReadFirstHead);
                    } catch (Throwable th) {
                        th = th;
                        InlineMarker.finallyStart(1);
                        if (z) {
                            UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
                        }
                        InlineMarker.finallyEnd(1);
                        throw th;
                    }
                } else if (writePosition < i || chunkBufferPrepareReadFirstHead.getCapacity() - chunkBufferPrepareReadFirstHead.getLimit() < 8) {
                    UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
                    chunkBufferPrepareReadNextHead = UnsafeKt.prepareReadFirstHead(input, i);
                } else {
                    chunkBufferPrepareReadNextHead = chunkBufferPrepareReadFirstHead;
                }
                if (chunkBufferPrepareReadNextHead == null) {
                    break;
                }
                if (i <= 0) {
                    z = true;
                    chunkBufferPrepareReadFirstHead = chunkBufferPrepareReadNextHead;
                    break;
                }
                chunkBufferPrepareReadFirstHead = chunkBufferPrepareReadNextHead;
            } catch (Throwable th2) {
                th = th2;
                z = true;
            }
        }
        InlineMarker.finallyStart(1);
        if (z) {
            UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
        }
        InlineMarker.finallyEnd(1);
    }

    public static final void takeWhileSize(@NotNull Input input, int i, @NotNull Function1<? super Buffer, Integer> block) throws Throwable {
        boolean z;
        ChunkBuffer chunkBufferPrepareReadNextHead;
        Intrinsics.checkNotNullParameter(input, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        ChunkBuffer chunkBufferPrepareReadFirstHead = UnsafeKt.prepareReadFirstHead(input, i);
        if (chunkBufferPrepareReadFirstHead == null) {
            return;
        }
        while (true) {
            try {
                int writePosition = chunkBufferPrepareReadFirstHead.getWritePosition() - chunkBufferPrepareReadFirstHead.getReadPosition();
                if (writePosition >= i) {
                    try {
                        i = block.invoke(chunkBufferPrepareReadFirstHead).intValue();
                        InlineMarker.finallyStart(1);
                        writePosition = chunkBufferPrepareReadFirstHead.getWritePosition() - chunkBufferPrepareReadFirstHead.getReadPosition();
                        InlineMarker.finallyEnd(1);
                    } finally {
                    }
                }
                z = false;
                if (writePosition == 0) {
                    try {
                        chunkBufferPrepareReadNextHead = UnsafeKt.prepareReadNextHead(input, chunkBufferPrepareReadFirstHead);
                    } catch (Throwable th) {
                        th = th;
                        InlineMarker.finallyStart(1);
                        if (z) {
                            UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
                        }
                        InlineMarker.finallyEnd(1);
                        throw th;
                    }
                } else if (writePosition < i || chunkBufferPrepareReadFirstHead.getCapacity() - chunkBufferPrepareReadFirstHead.getLimit() < 8) {
                    UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
                    chunkBufferPrepareReadNextHead = UnsafeKt.prepareReadFirstHead(input, i);
                } else {
                    chunkBufferPrepareReadNextHead = chunkBufferPrepareReadFirstHead;
                }
                if (chunkBufferPrepareReadNextHead == null) {
                    break;
                }
                if (i <= 0) {
                    z = true;
                    chunkBufferPrepareReadFirstHead = chunkBufferPrepareReadNextHead;
                    break;
                }
                chunkBufferPrepareReadFirstHead = chunkBufferPrepareReadNextHead;
            } catch (Throwable th2) {
                th = th2;
                z = true;
            }
        }
        InlineMarker.finallyStart(1);
        if (z) {
            UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
        }
        InlineMarker.finallyEnd(1);
    }

    public static final char peekCharUtf8(@NotNull Input input) throws EOFException {
        Intrinsics.checkNotNullParameter(input, "<this>");
        int iTryPeek = input.tryPeek();
        if ((iTryPeek & 128) == 0) {
            return (char) iTryPeek;
        }
        if (iTryPeek == -1) {
            throw new EOFException("Failed to peek a char: end of input");
        }
        return peekCharUtf8Impl(input, iTryPeek);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final char peekCharUtf8Impl(Input input, int i) throws Throwable {
        int i2;
        ChunkBuffer chunkBufferPrepareReadNextHead;
        int iByteCountUtf8 = UTF8Kt.byteCountUtf8(i);
        ChunkBuffer chunkBufferPrepareReadFirstHead = UnsafeKt.prepareReadFirstHead(input, iByteCountUtf8);
        char cHighSurrogate = '?';
        boolean z = false;
        if (chunkBufferPrepareReadFirstHead != null) {
            boolean z2 = false;
            while (true) {
                try {
                    int writePosition = chunkBufferPrepareReadFirstHead.getWritePosition() - chunkBufferPrepareReadFirstHead.getReadPosition();
                    if (writePosition >= iByteCountUtf8) {
                        try {
                            ByteBuffer memory = chunkBufferPrepareReadFirstHead.getMemory();
                            int readPosition = chunkBufferPrepareReadFirstHead.getReadPosition();
                            int writePosition2 = chunkBufferPrepareReadFirstHead.getWritePosition();
                            int i3 = 0;
                            int i4 = 0;
                            int i5 = 0;
                            int i6 = readPosition;
                            while (true) {
                                if (i6 < writePosition2) {
                                    byte b = memory.get(i6);
                                    int i7 = b & 255;
                                    i2 = -1;
                                    if ((b & 128) != 0) {
                                        if (i3 == 0) {
                                            int i8 = 128;
                                            for (int i9 = 1; i9 < 7 && (i7 & i8) != 0; i9++) {
                                                i7 &= ~i8;
                                                i8 >>= 1;
                                                i3++;
                                            }
                                            int i10 = i3 - 1;
                                            if (i3 > writePosition2 - i6) {
                                                chunkBufferPrepareReadFirstHead.discardExact(i6 - readPosition);
                                                i2 = i3;
                                                break;
                                            }
                                            i5 = i3;
                                            i3 = i10;
                                            i4 = i7;
                                        } else {
                                            i4 = (i4 << 6) | (b & Byte.MAX_VALUE);
                                            i3--;
                                            if (i3 == 0) {
                                                if (UTF8Kt.isBmpCodePoint(i4)) {
                                                    cHighSurrogate = (char) i4;
                                                    chunkBufferPrepareReadFirstHead.discardExact(((i6 - readPosition) - i5) + 1);
                                                } else {
                                                    if (!UTF8Kt.isValidCodePoint(i4)) {
                                                        UTF8Kt.malformedCodePoint(i4);
                                                        throw new KotlinNothingValueException();
                                                    }
                                                    cHighSurrogate = (char) UTF8Kt.highSurrogate(i4);
                                                    chunkBufferPrepareReadFirstHead.discardExact(((i6 - readPosition) - i5) + 1);
                                                }
                                            }
                                        }
                                        i6++;
                                    } else {
                                        if (i3 != 0) {
                                            UTF8Kt.malformedByteCount(i3);
                                            throw new KotlinNothingValueException();
                                        }
                                        cHighSurrogate = (char) i7;
                                        chunkBufferPrepareReadFirstHead.discardExact(i6 - readPosition);
                                    }
                                } else {
                                    chunkBufferPrepareReadFirstHead.discardExact(writePosition2 - readPosition);
                                    i2 = 0;
                                    break;
                                }
                            }
                            writePosition = chunkBufferPrepareReadFirstHead.getWritePosition() - chunkBufferPrepareReadFirstHead.getReadPosition();
                            iByteCountUtf8 = i2;
                        } catch (Throwable th) {
                            chunkBufferPrepareReadFirstHead.getWritePosition();
                            chunkBufferPrepareReadFirstHead.getReadPosition();
                            throw th;
                        }
                    }
                    if (writePosition == 0) {
                        try {
                            chunkBufferPrepareReadNextHead = UnsafeKt.prepareReadNextHead(input, chunkBufferPrepareReadFirstHead);
                        } catch (Throwable th2) {
                            th = th2;
                            if (z) {
                                UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
                            }
                            throw th;
                        }
                    } else if (writePosition < iByteCountUtf8 || chunkBufferPrepareReadFirstHead.getCapacity() - chunkBufferPrepareReadFirstHead.getLimit() < 8) {
                        UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
                        chunkBufferPrepareReadNextHead = UnsafeKt.prepareReadFirstHead(input, iByteCountUtf8);
                    } else {
                        chunkBufferPrepareReadNextHead = chunkBufferPrepareReadFirstHead;
                    }
                    if (chunkBufferPrepareReadNextHead == null) {
                        break;
                    }
                    if (iByteCountUtf8 <= 0) {
                        z = true;
                        chunkBufferPrepareReadFirstHead = chunkBufferPrepareReadNextHead;
                        break;
                    }
                    chunkBufferPrepareReadFirstHead = chunkBufferPrepareReadNextHead;
                } catch (Throwable th3) {
                    th = th3;
                    z = true;
                }
            }
            if (z) {
                UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
            }
            z = z2;
        }
        if (z) {
            return cHighSurrogate;
        }
        throw new MalformedUTF8InputException("No UTF-8 character found");
    }

    public static final void forEach(@NotNull Input input, @NotNull Function1<? super Byte, Unit> block) throws Throwable {
        boolean z;
        Intrinsics.checkNotNullParameter(input, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        ChunkBuffer chunkBufferPrepareReadFirstHead = UnsafeKt.prepareReadFirstHead(input, 1);
        if (chunkBufferPrepareReadFirstHead == null) {
            return;
        }
        do {
            try {
                ByteBuffer memory = chunkBufferPrepareReadFirstHead.getMemory();
                int readPosition = chunkBufferPrepareReadFirstHead.getReadPosition();
                int writePosition = chunkBufferPrepareReadFirstHead.getWritePosition();
                for (int i = readPosition; i < writePosition; i++) {
                    block.invoke(Byte.valueOf(memory.get(i)));
                }
                chunkBufferPrepareReadFirstHead.discardExact(writePosition - readPosition);
            } catch (Throwable th) {
                th = th;
                z = true;
            }
            try {
                chunkBufferPrepareReadFirstHead = UnsafeKt.prepareReadNextHead(input, chunkBufferPrepareReadFirstHead);
            } catch (Throwable th2) {
                th = th2;
                z = false;
                InlineMarker.finallyStart(1);
                if (z) {
                    UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
                }
                InlineMarker.finallyEnd(1);
                throw th;
            }
        } while (chunkBufferPrepareReadFirstHead != null);
        InlineMarker.finallyStart(1);
        InlineMarker.finallyEnd(1);
    }
}
