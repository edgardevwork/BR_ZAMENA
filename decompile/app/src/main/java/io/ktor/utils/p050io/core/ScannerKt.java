package io.ktor.utils.p050io.core;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.datasource.cache.CacheFileMetadataIndex;
import androidx.media3.extractor.text.ttml.TtmlNode;
import io.ktor.utils.p050io.bits.MemoryJvmKt;
import io.ktor.utils.p050io.core.internal.ChunkBuffer;
import io.ktor.utils.p050io.core.internal.UnsafeKt;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: Scanner.kt */
@Metadata(m7104d1 = {"\u00008\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a \u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0000\u001a,\u0010\t\u001a\u00020\u0001*\u00020\u00032\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0080\bø\u0001\u0000\u001a<\u0010\t\u001a\u00020\u0001*\u00020\u00032\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0080\bø\u0001\u0000\u001a\u0012\u0010\u0012\u001a\u00020\u0013*\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u001a\u0010\u0015\u001a\u00020\u0013*\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005\u001a\u001a\u0010\u0016\u001a\u00020\u0013*\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e\u001a.\u0010\u0016\u001a\u00020\u0001*\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00012\b\b\u0002\u0010\u0011\u001a\u00020\u0001\u001a\"\u0010\u0017\u001a\u00020\u0013*\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e\u001a6\u0010\u0017\u001a\u00020\u0001*\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00012\b\b\u0002\u0010\u0011\u001a\u00020\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0018"}, m7105d2 = {"discardUntilDelimiterImplMemory", "", "buffer", "Lio/ktor/utils/io/core/Buffer;", TtmlNode.RUBY_DELIMITER, "", "discardUntilDelimitersImplMemory", "delimiter1", "delimiter2", "copyUntil", "predicate", "Lkotlin/Function1;", "", "dst", "Lio/ktor/utils/io/core/Output;", "", TypedValues.CycleType.S_WAVE_OFFSET, CacheFileMetadataIndex.COLUMN_LENGTH, "discardUntilDelimiter", "", "Lio/ktor/utils/io/core/Input;", "discardUntilDelimiters", "readUntilDelimiter", "readUntilDelimiters", "ktor-io"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nScanner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scanner.kt\nio/ktor/utils/io/core/ScannerKt\n+ 2 Input.kt\nio/ktor/utils/io/core/InputKt\n+ 3 Buffer.kt\nio/ktor/utils/io/core/BufferKt\n+ 4 Memory.kt\nio/ktor/utils/io/bits/MemoryKt\n+ 5 MemoryJvm.kt\nio/ktor/utils/io/bits/Memory\n+ 6 PrimiteArrays.kt\nio/ktor/utils/io/bits/PrimiteArraysKt\n*L\n1#1,222:1\n823#2,6:223\n829#2,13:230\n823#2,6:243\n829#2,13:250\n823#2,6:263\n829#2,13:270\n823#2,6:283\n829#2,13:290\n823#2,6:303\n829#2,13:310\n823#2,6:323\n829#2,13:330\n355#3:229\n355#3:249\n355#3:269\n355#3:289\n355#3:309\n355#3:329\n84#4:343\n84#4:345\n26#5:344\n26#5:346\n26#5:347\n26#5:350\n15#6,2:348\n*S KotlinDebug\n*F\n+ 1 Scanner.kt\nio/ktor/utils/io/core/ScannerKt\n*L\n13#1:223,6\n13#1:230,13\n30#1:243,6\n30#1:250,13\n48#1:263,6\n48#1:270,13\n76#1:283,6\n76#1:290,13\n93#1:303,6\n93#1:310,13\n111#1:323,6\n111#1:330,13\n16#1:229\n33#1:249\n52#1:269\n80#1:289\n96#1:309\n114#1:329\n131#1:343\n150#1:345\n131#1:344\n150#1:346\n195#1:347\n212#1:350\n202#1:348,2\n*E\n"})
/* loaded from: classes5.dex */
public final class ScannerKt {
    public static /* synthetic */ int readUntilDelimiter$default(Input input, byte b, byte[] bArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = bArr.length;
        }
        return readUntilDelimiter(input, b, bArr, i, i2);
    }

    public static /* synthetic */ int readUntilDelimiters$default(Input input, byte b, byte b2, byte[] bArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 8) != 0) {
            i = 0;
        }
        int i4 = i;
        if ((i3 & 16) != 0) {
            i2 = bArr.length;
        }
        return readUntilDelimiters(input, b, b2, bArr, i4, i2);
    }

    public static final int readUntilDelimiters(@NotNull Input input, byte b, byte b2, @NotNull byte[] dst, int i, int i2) throws Throwable {
        int i3;
        Intrinsics.checkNotNullParameter(input, "<this>");
        Intrinsics.checkNotNullParameter(dst, "dst");
        if (b == b2) {
            return readUntilDelimiter(input, b, dst, i, i2);
        }
        boolean z = true;
        ChunkBuffer chunkBufferPrepareReadFirstHead = UnsafeKt.prepareReadFirstHead(input, 1);
        if (chunkBufferPrepareReadFirstHead == null) {
            i3 = i;
        } else {
            i3 = i;
            do {
                try {
                    int untilDelimitersImpl = ScannerJVMKt.readUntilDelimitersImpl(chunkBufferPrepareReadFirstHead, b, b2, dst, i3, i2);
                    i3 += untilDelimitersImpl;
                    i2 -= untilDelimitersImpl;
                    if (chunkBufferPrepareReadFirstHead.getWritePosition() <= chunkBufferPrepareReadFirstHead.getReadPosition() && i2 > 0) {
                        try {
                            chunkBufferPrepareReadFirstHead = UnsafeKt.prepareReadNextHead(input, chunkBufferPrepareReadFirstHead);
                        } catch (Throwable th) {
                            th = th;
                            z = false;
                            if (z) {
                                UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
                            }
                            throw th;
                        }
                    } else {
                        UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
                        break;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } while (chunkBufferPrepareReadFirstHead != null);
        }
        return i3 - i;
    }

    public static final int discardUntilDelimiterImplMemory(@NotNull Buffer buffer, byte b) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        int readPosition = buffer.getReadPosition();
        int writePosition = buffer.getWritePosition();
        ByteBuffer memory = buffer.getMemory();
        int i = readPosition;
        while (i < writePosition && memory.get(i) != b) {
            i++;
        }
        buffer.discardUntilIndex$ktor_io(i);
        return i - readPosition;
    }

    public static final int discardUntilDelimitersImplMemory(@NotNull Buffer buffer, byte b, byte b2) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        int readPosition = buffer.getReadPosition();
        int writePosition = buffer.getWritePosition();
        ByteBuffer memory = buffer.getMemory();
        int i = readPosition;
        while (i < writePosition) {
            byte b3 = memory.get(i);
            if (b3 == b || b3 == b2) {
                break;
            }
            i++;
        }
        buffer.discardUntilIndex$ktor_io(i);
        return i - readPosition;
    }

    public static final int copyUntil(@NotNull Buffer buffer, @NotNull Function1<? super Byte, Boolean> predicate, @NotNull byte[] dst, int i, int i2) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Intrinsics.checkNotNullParameter(dst, "dst");
        int readPosition = buffer.getReadPosition();
        int iMin = Math.min(buffer.getWritePosition(), i2 + readPosition);
        ByteBuffer memory = buffer.getMemory();
        int i3 = readPosition;
        while (true) {
            if (i3 >= iMin) {
                break;
            }
            if (predicate.invoke(Byte.valueOf(memory.get(i3))).booleanValue()) {
                iMin = i3;
                break;
            }
            i3++;
        }
        int i4 = iMin - readPosition;
        MemoryJvmKt.m15442copyTo9zorpBc(memory, dst, readPosition, i4, i);
        return i4;
    }

    public static final int copyUntil(@NotNull Buffer buffer, @NotNull Function1<? super Byte, Boolean> predicate, @NotNull Output dst) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Intrinsics.checkNotNullParameter(dst, "dst");
        int readPosition = buffer.getReadPosition();
        int writePosition = buffer.getWritePosition();
        ByteBuffer memory = buffer.getMemory();
        while (readPosition != writePosition && !predicate.invoke(Byte.valueOf(memory.get(readPosition))).booleanValue()) {
            readPosition++;
        }
        int readPosition2 = readPosition - buffer.getReadPosition();
        OutputKt.writeFully(dst, buffer, readPosition2);
        return readPosition2;
    }

    public static final long discardUntilDelimiter(@NotNull Input input, byte b) throws Throwable {
        Intrinsics.checkNotNullParameter(input, "<this>");
        boolean z = true;
        ChunkBuffer chunkBufferPrepareReadFirstHead = UnsafeKt.prepareReadFirstHead(input, 1);
        long j = 0;
        if (chunkBufferPrepareReadFirstHead != null) {
            do {
                try {
                    int iDiscardUntilDelimiterImpl = ScannerJVMKt.discardUntilDelimiterImpl(chunkBufferPrepareReadFirstHead, b);
                    j += iDiscardUntilDelimiterImpl;
                    if (iDiscardUntilDelimiterImpl > 0 && chunkBufferPrepareReadFirstHead.getWritePosition() <= chunkBufferPrepareReadFirstHead.getReadPosition()) {
                        try {
                            chunkBufferPrepareReadFirstHead = UnsafeKt.prepareReadNextHead(input, chunkBufferPrepareReadFirstHead);
                        } catch (Throwable th) {
                            th = th;
                            z = false;
                            if (z) {
                                UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
                            }
                            throw th;
                        }
                    } else {
                        UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
                        break;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } while (chunkBufferPrepareReadFirstHead != null);
        }
        return j;
    }

    public static final long discardUntilDelimiters(@NotNull Input input, byte b, byte b2) throws Throwable {
        Intrinsics.checkNotNullParameter(input, "<this>");
        boolean z = true;
        ChunkBuffer chunkBufferPrepareReadFirstHead = UnsafeKt.prepareReadFirstHead(input, 1);
        long j = 0;
        if (chunkBufferPrepareReadFirstHead != null) {
            do {
                try {
                    int iDiscardUntilDelimitersImpl = ScannerJVMKt.discardUntilDelimitersImpl(chunkBufferPrepareReadFirstHead, b, b2);
                    j += iDiscardUntilDelimitersImpl;
                    if (iDiscardUntilDelimitersImpl > 0 && chunkBufferPrepareReadFirstHead.getWritePosition() <= chunkBufferPrepareReadFirstHead.getReadPosition()) {
                        try {
                            chunkBufferPrepareReadFirstHead = UnsafeKt.prepareReadNextHead(input, chunkBufferPrepareReadFirstHead);
                        } catch (Throwable th) {
                            th = th;
                            z = false;
                            if (z) {
                                UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
                            }
                            throw th;
                        }
                    } else {
                        UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
                        break;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } while (chunkBufferPrepareReadFirstHead != null);
        }
        return j;
    }

    public static final int readUntilDelimiter(@NotNull Input input, byte b, @NotNull byte[] dst, int i, int i2) throws Throwable {
        int i3;
        Intrinsics.checkNotNullParameter(input, "<this>");
        Intrinsics.checkNotNullParameter(dst, "dst");
        boolean z = true;
        ChunkBuffer chunkBufferPrepareReadFirstHead = UnsafeKt.prepareReadFirstHead(input, 1);
        if (chunkBufferPrepareReadFirstHead == null) {
            i3 = i;
        } else {
            i3 = i;
            do {
                try {
                    int untilDelimiterImpl = ScannerJVMKt.readUntilDelimiterImpl(chunkBufferPrepareReadFirstHead, b, dst, i3, i2);
                    i3 += untilDelimiterImpl;
                    i2 -= untilDelimiterImpl;
                    if (i2 > 0 && chunkBufferPrepareReadFirstHead.getWritePosition() <= chunkBufferPrepareReadFirstHead.getReadPosition()) {
                        try {
                            chunkBufferPrepareReadFirstHead = UnsafeKt.prepareReadNextHead(input, chunkBufferPrepareReadFirstHead);
                        } catch (Throwable th) {
                            th = th;
                            z = false;
                            if (z) {
                                UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
                            }
                            throw th;
                        }
                    } else {
                        UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
                        break;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } while (chunkBufferPrepareReadFirstHead != null);
        }
        return i3 - i;
    }

    public static final long readUntilDelimiter(@NotNull Input input, byte b, @NotNull Output dst) {
        Intrinsics.checkNotNullParameter(input, "<this>");
        Intrinsics.checkNotNullParameter(dst, "dst");
        boolean z = true;
        ChunkBuffer chunkBufferPrepareReadFirstHead = UnsafeKt.prepareReadFirstHead(input, 1);
        long untilDelimiterImpl = 0;
        if (chunkBufferPrepareReadFirstHead != null) {
            while (true) {
                try {
                    untilDelimiterImpl += ScannerJVMKt.readUntilDelimiterImpl(chunkBufferPrepareReadFirstHead, b, dst);
                    if (!(chunkBufferPrepareReadFirstHead.getWritePosition() > chunkBufferPrepareReadFirstHead.getReadPosition())) {
                        try {
                            chunkBufferPrepareReadFirstHead = UnsafeKt.prepareReadNextHead(input, chunkBufferPrepareReadFirstHead);
                            if (chunkBufferPrepareReadFirstHead == null) {
                                break;
                            }
                        } catch (Throwable th) {
                            th = th;
                            z = false;
                            if (z) {
                                UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
                            }
                            throw th;
                        }
                    } else {
                        UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
                        break;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }
        return untilDelimiterImpl;
    }

    public static final long readUntilDelimiters(@NotNull Input input, byte b, byte b2, @NotNull Output dst) {
        Intrinsics.checkNotNullParameter(input, "<this>");
        Intrinsics.checkNotNullParameter(dst, "dst");
        boolean z = true;
        ChunkBuffer chunkBufferPrepareReadFirstHead = UnsafeKt.prepareReadFirstHead(input, 1);
        long untilDelimitersImpl = 0;
        if (chunkBufferPrepareReadFirstHead != null) {
            while (true) {
                try {
                    untilDelimitersImpl += ScannerJVMKt.readUntilDelimitersImpl(chunkBufferPrepareReadFirstHead, b, b2, dst);
                    if (!(chunkBufferPrepareReadFirstHead.getWritePosition() > chunkBufferPrepareReadFirstHead.getReadPosition())) {
                        try {
                            chunkBufferPrepareReadFirstHead = UnsafeKt.prepareReadNextHead(input, chunkBufferPrepareReadFirstHead);
                            if (chunkBufferPrepareReadFirstHead == null) {
                                break;
                            }
                        } catch (Throwable th) {
                            th = th;
                            z = false;
                            if (z) {
                                UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
                            }
                            throw th;
                        }
                    } else {
                        UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
                        break;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }
        return untilDelimitersImpl;
    }
}
