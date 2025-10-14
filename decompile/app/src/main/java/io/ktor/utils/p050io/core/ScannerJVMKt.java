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
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: ScannerJVM.kt */
@Metadata(m7104d1 = {"\u00002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a \u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0002\u001a0\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0002\u001a)\u0010\u000e\u001a\u00020\u0001*\u00020\u00032\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\n\u001a\u00020\u0012H\u0082\b\u001aA\u0010\u000e\u001a\u00020\u0001*\u00020\u00132\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0014\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0082\b\u001a9\u0010\u0015\u001a\u00020\u0001*\u00020\u00132\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0082\b\u001a\u0014\u0010\u0016\u001a\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u001c\u0010\u0017\u001a\u00020\u0001*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0000\u001a\u001c\u0010\t\u001a\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0012H\u0000\u001a\u001c\u0010\u0018\u001a\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0012H\u0000\u001a,\u0010\u0018\u001a\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0002\u001a\u001c\u0010\u0019\u001a\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0012H\u0000\u001a,\u0010\u0019\u001a\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0000\u001a$\u0010\u001a\u001a\u00020\u0001*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0012H\u0000\u001a4\u0010\u001a\u001a\u00020\u0001*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0002\u001a$\u0010\u001b\u001a\u00020\u0001*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0012H\u0000\u001a4\u0010\u001b\u001a\u00020\u0001*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0002\u001a$\u0010\u001c\u001a\u00020\u0001*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0012H\u0000\u001a4\u0010\u001c\u001a\u00020\u0001*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0000¨\u0006\u001d"}, m7105d2 = {"discardUntilDelimiterImplArrays", "", "buffer", "Lio/ktor/utils/io/core/Buffer;", TtmlNode.RUBY_DELIMITER, "", "discardUntilDelimitersImplArrays", "delimiter1", "delimiter2", "readUntilDelimiterArrays", "dst", "", TypedValues.CycleType.S_WAVE_OFFSET, CacheFileMetadataIndex.COLUMN_LENGTH, "copyUntilArrays", "predicate", "Lkotlin/Function1;", "", "Lio/ktor/utils/io/core/Output;", "Ljava/nio/ByteBuffer;", "bufferOffset", "copyUntilDirect", "discardUntilDelimiterImpl", "discardUntilDelimitersImpl", "readUntilDelimiterDirect", "readUntilDelimiterImpl", "readUntilDelimitersArrays", "readUntilDelimitersDirect", "readUntilDelimitersImpl", "ktor-io"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nScannerJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScannerJVM.kt\nio/ktor/utils/io/core/ScannerJVMKt\n+ 2 Buffer.kt\nio/ktor/utils/io/core/Buffer\n+ 3 Scanner.kt\nio/ktor/utils/io/core/ScannerKt\n+ 4 MemoryJvm.kt\nio/ktor/utils/io/bits/Memory\n+ 5 PrimiteArrays.kt\nio/ktor/utils/io/bits/PrimiteArraysKt\n+ 6 Output.kt\nio/ktor/utils/io/core/OutputKt\n+ 7 Buffer.kt\nio/ktor/utils/io/core/BufferKt\n*L\n1#1,257:1\n211#1,14:277\n211#1,14:308\n229#1,7:336\n236#1,2:347\n239#1,13:350\n254#1,2:370\n229#1,7:386\n236#1,2:397\n239#1,13:400\n254#1,2:420\n69#2:258\n69#2:259\n69#2:276\n69#2:307\n74#2:349\n74#2:399\n74#2:426\n191#3,5:260\n196#3,7:266\n203#3:275\n191#3,5:291\n196#3,7:297\n203#3:306\n208#3,5:322\n213#3,8:328\n208#3,5:372\n213#3,8:378\n26#4:265\n26#4:296\n26#4:327\n26#4:377\n15#5,2:273\n15#5,2:304\n488#6,4:343\n492#6,6:364\n488#6,4:393\n492#6,6:414\n488#6,4:422\n492#6,6:428\n361#7:363\n361#7:413\n361#7:427\n*S KotlinDebug\n*F\n+ 1 ScannerJVM.kt\nio/ktor/utils/io/core/ScannerJVMKt\n*L\n82#1:277,14\n134#1:308,14\n161#1:336,7\n161#1:347,2\n161#1:350,13\n161#1:370,2\n182#1:386,7\n182#1:397,2\n182#1:400,13\n182#1:420,2\n20#1:258\n47#1:259\n87#1:276\n139#1:307\n161#1:349\n182#1:399\n237#1:426\n75#1:260,5\n75#1:266,7\n75#1:275\n121#1:291,5\n121#1:297,7\n121#1:306\n156#1:322,5\n156#1:328,8\n177#1:372,5\n177#1:378,8\n75#1:265\n121#1:296\n156#1:327\n177#1:377\n75#1:273,2\n121#1:304,2\n161#1:343,4\n161#1:364,6\n182#1:393,4\n182#1:414,6\n235#1:422,4\n235#1:428,6\n161#1:363\n182#1:413\n251#1:427\n*E\n"})
/* loaded from: classes5.dex */
public final class ScannerJVMKt {
    public static final int discardUntilDelimiterImpl(@NotNull Buffer buffer, byte b) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (ByteBuffersKt.hasArray(buffer)) {
            return discardUntilDelimiterImplArrays(buffer, b);
        }
        return ScannerKt.discardUntilDelimiterImplMemory(buffer, b);
    }

    public static final int discardUntilDelimiterImplArrays(Buffer buffer, byte b) {
        int i;
        ByteBuffer memory = buffer.getMemory();
        byte[] bArrArray = memory.array();
        int iArrayOffset = memory.arrayOffset() + memory.position() + buffer.getReadPosition();
        int writePosition = (buffer.getWritePosition() - buffer.getReadPosition()) + iArrayOffset;
        if (writePosition <= bArrArray.length) {
            i = iArrayOffset;
            while (i < writePosition && bArrArray[i] != b) {
                i++;
            }
        } else {
            i = iArrayOffset;
        }
        buffer.discardUntilIndex$ktor_io(i);
        return i - iArrayOffset;
    }

    public static final int discardUntilDelimitersImpl(@NotNull Buffer buffer, byte b, byte b2) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (ByteBuffersKt.hasArray(buffer)) {
            return discardUntilDelimitersImplArrays(buffer, b, b2);
        }
        return ScannerKt.discardUntilDelimitersImplMemory(buffer, b, b2);
    }

    public static final int discardUntilDelimitersImplArrays(Buffer buffer, byte b, byte b2) {
        int i;
        ByteBuffer memory = buffer.getMemory();
        byte[] bArrArray = memory.array();
        int iArrayOffset = memory.arrayOffset() + memory.position() + buffer.getReadPosition();
        int writePosition = (buffer.getWritePosition() - buffer.getReadPosition()) + iArrayOffset;
        if (writePosition <= bArrArray.length) {
            i = iArrayOffset;
            while (i < writePosition) {
                byte b3 = bArrArray[i];
                if (b3 == b || b3 == b2) {
                    break;
                }
                i++;
            }
        } else {
            i = iArrayOffset;
        }
        buffer.discardUntilIndex$ktor_io(i);
        return i - iArrayOffset;
    }

    public static final int readUntilDelimiterImpl(@NotNull Buffer buffer, byte b, @NotNull byte[] dst, int i, int i2) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(dst, "dst");
        int length = dst.length;
        if (ByteBuffersKt.hasArray(buffer)) {
            return readUntilDelimiterArrays(buffer, b, dst, i, i2);
        }
        return readUntilDelimiterDirect(buffer, b, dst, i, i2);
    }

    public static final int readUntilDelimiterArrays(Buffer buffer, byte b, byte[] bArr, int i, int i2) {
        int i3;
        ByteBuffer memory = buffer.getMemory();
        int readPosition = buffer.getReadPosition();
        int iMin = Math.min(i2, buffer.getWritePosition() - buffer.getReadPosition());
        byte[] bArrArray = memory.array();
        int iPosition = readPosition + memory.position() + memory.arrayOffset();
        int iMin2 = Math.min(iMin, memory.remaining()) + iPosition;
        if (iMin2 <= bArrArray.length) {
            i3 = iPosition;
            while (i3 < iMin2 && bArrArray[i3] != b) {
                i3++;
            }
        } else {
            i3 = iPosition;
        }
        int i4 = i3 - iPosition;
        System.arraycopy(bArrArray, iPosition, bArr, i, i4);
        buffer.discardExact(i4);
        return i4;
    }

    public static final int readUntilDelimitersImpl(@NotNull Buffer buffer, byte b, byte b2, @NotNull byte[] dst, int i, int i2) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(dst, "dst");
        int length = dst.length;
        if (ByteBuffersKt.hasArray(buffer)) {
            return readUntilDelimitersArrays(buffer, b, b2, dst, i, i2);
        }
        return readUntilDelimitersDirect(buffer, b, b2, dst, i, i2);
    }

    public static final int readUntilDelimitersArrays(Buffer buffer, byte b, byte b2, byte[] bArr, int i, int i2) {
        int i3;
        ByteBuffer memory = buffer.getMemory();
        int readPosition = buffer.getReadPosition();
        int iMin = Math.min(i2, buffer.getWritePosition() - buffer.getReadPosition());
        byte[] bArrArray = memory.array();
        int iPosition = readPosition + memory.position() + memory.arrayOffset();
        int iMin2 = Math.min(iMin, memory.remaining()) + iPosition;
        if (iMin2 <= bArrArray.length) {
            i3 = iPosition;
            while (i3 < iMin2) {
                byte b3 = bArrArray[i3];
                if (b3 == b || b3 == b2) {
                    break;
                }
                i3++;
            }
        } else {
            i3 = iPosition;
        }
        int i4 = i3 - iPosition;
        System.arraycopy(bArrArray, iPosition, bArr, i, i4);
        buffer.discardExact(i4);
        return i4;
    }

    public static final int readUntilDelimiterImpl(@NotNull Buffer buffer, byte b, @NotNull Output dst) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(dst, "dst");
        if (ByteBuffersKt.hasArray(buffer)) {
            return readUntilDelimiterArrays(buffer, b, dst);
        }
        return readUntilDelimiterDirect(buffer, b, dst);
    }

    public static final int readUntilDelimitersImpl(@NotNull Buffer buffer, byte b, byte b2, @NotNull Output dst) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(dst, "dst");
        if (ByteBuffersKt.hasArray(buffer)) {
            return readUntilDelimitersArrays(buffer, b, b2, dst);
        }
        return readUntilDelimitersDirect(buffer, b, b2, dst);
    }

    public static final int copyUntilDirect(ByteBuffer byteBuffer, Function1<? super Byte, Boolean> function1, byte[] bArr, int i, int i2) {
        int iPosition = byteBuffer.position();
        int i3 = i2 + iPosition;
        int i4 = iPosition;
        while (i4 < byteBuffer.limit() && i4 < i3 && !function1.invoke(Byte.valueOf(byteBuffer.get(i4))).booleanValue()) {
            i4++;
        }
        int i5 = i4 - iPosition;
        byteBuffer.get(bArr, i, i5);
        return i5;
    }

    public static final int copyUntilArrays(ByteBuffer byteBuffer, Function1<? super Byte, Boolean> function1, int i, byte[] bArr, int i2, int i3) {
        int i4;
        byte[] bArrArray = byteBuffer.array();
        int iPosition = i + byteBuffer.position() + byteBuffer.arrayOffset();
        int iMin = Math.min(i3, byteBuffer.remaining()) + iPosition;
        if (iMin <= bArrArray.length) {
            i4 = iPosition;
            while (i4 < iMin && !function1.invoke(Byte.valueOf(bArrArray[i4])).booleanValue()) {
                i4++;
            }
        } else {
            i4 = iPosition;
        }
        int i5 = i4 - iPosition;
        System.arraycopy(bArrArray, iPosition, bArr, i2, i5);
        return i5;
    }

    /* JADX WARN: Finally extract failed */
    public static final int copyUntilArrays(Buffer buffer, Function1<? super Byte, Boolean> function1, Output output) {
        int i;
        ByteBuffer memory = buffer.getMemory();
        byte[] array = memory.array();
        int iPosition = memory.position() + memory.arrayOffset() + buffer.getReadPosition();
        int iPosition2 = memory.position() + memory.arrayOffset() + buffer.getWritePosition();
        ChunkBuffer chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(output, 1, null);
        int i2 = 0;
        while (true) {
            try {
                int iMin = Math.min((chunkBufferPrepareWriteHead.getLimit() - chunkBufferPrepareWriteHead.getWritePosition()) + iPosition, iPosition2);
                if (iMin <= array.length) {
                    i = iPosition;
                    while (i < iMin && !function1.invoke(Byte.valueOf(array[i])).booleanValue()) {
                        i++;
                    }
                } else {
                    i = iPosition;
                }
                int i3 = i - iPosition;
                Intrinsics.checkNotNullExpressionValue(array, "array");
                BufferPrimitivesKt.writeFully((Buffer) chunkBufferPrepareWriteHead, array, iPosition, i3);
                i2 += i3;
                if (chunkBufferPrepareWriteHead.getLimit() > chunkBufferPrepareWriteHead.getWritePosition() || i >= iPosition2) {
                    break;
                }
                chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(output, 1, chunkBufferPrepareWriteHead);
                iPosition = i;
            } catch (Throwable th) {
                InlineMarker.finallyStart(1);
                output.afterHeadWrite();
                InlineMarker.finallyEnd(1);
                throw th;
            }
        }
        InlineMarker.finallyStart(1);
        output.afterHeadWrite();
        InlineMarker.finallyEnd(1);
        buffer.discardUntilIndex$ktor_io(i);
        return i2;
    }

    public static final int readUntilDelimiterDirect(Buffer buffer, byte b, byte[] bArr, int i, int i2) {
        int readPosition = buffer.getReadPosition();
        int iMin = Math.min(buffer.getWritePosition(), i2 + readPosition);
        ByteBuffer memory = buffer.getMemory();
        int i3 = readPosition;
        while (true) {
            if (i3 >= iMin) {
                break;
            }
            if (memory.get(i3) == b) {
                iMin = i3;
                break;
            }
            i3++;
        }
        int i4 = iMin - readPosition;
        MemoryJvmKt.m15442copyTo9zorpBc(memory, bArr, readPosition, i4, i);
        buffer.discardExact(i4);
        return i4;
    }

    public static final int readUntilDelimitersDirect(Buffer buffer, byte b, byte b2, byte[] bArr, int i, int i2) {
        int readPosition = buffer.getReadPosition();
        int iMin = Math.min(buffer.getWritePosition(), i2 + readPosition);
        ByteBuffer memory = buffer.getMemory();
        for (int i3 = readPosition; i3 < iMin; i3++) {
            byte b3 = memory.get(i3);
            if (b3 == b || b3 == b2) {
                iMin = i3;
                break;
            }
        }
        int i4 = iMin - readPosition;
        MemoryJvmKt.m15442copyTo9zorpBc(memory, bArr, readPosition, i4, i);
        buffer.discardExact(i4);
        return i4;
    }

    public static final int readUntilDelimiterDirect(@NotNull Buffer buffer, byte b, @NotNull Output dst) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(dst, "dst");
        int readPosition = buffer.getReadPosition();
        int writePosition = buffer.getWritePosition();
        ByteBuffer memory = buffer.getMemory();
        while (readPosition != writePosition && memory.get(readPosition) != b) {
            readPosition++;
        }
        int readPosition2 = readPosition - buffer.getReadPosition();
        OutputKt.writeFully(dst, buffer, readPosition2);
        return readPosition2;
    }

    /* JADX WARN: Finally extract failed */
    public static final int readUntilDelimiterArrays(@NotNull Buffer buffer, byte b, @NotNull Output dst) {
        int i;
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(dst, "dst");
        ByteBuffer memory = buffer.getMemory();
        byte[] array = memory.array();
        int iPosition = memory.position() + memory.arrayOffset() + buffer.getReadPosition();
        int iPosition2 = memory.position() + memory.arrayOffset() + buffer.getWritePosition();
        ChunkBuffer chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(dst, 1, null);
        int i2 = 0;
        while (true) {
            try {
                int iMin = Math.min((chunkBufferPrepareWriteHead.getLimit() - chunkBufferPrepareWriteHead.getWritePosition()) + iPosition, iPosition2);
                if (iMin <= array.length) {
                    i = iPosition;
                    while (i < iMin && array[i] != b) {
                        i++;
                    }
                } else {
                    i = iPosition;
                }
                int i3 = i - iPosition;
                Intrinsics.checkNotNullExpressionValue(array, "array");
                BufferPrimitivesKt.writeFully((Buffer) chunkBufferPrepareWriteHead, array, iPosition, i3);
                i2 += i3;
                if (chunkBufferPrepareWriteHead.getLimit() > chunkBufferPrepareWriteHead.getWritePosition() || i >= iPosition2) {
                    break;
                }
                chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(dst, 1, chunkBufferPrepareWriteHead);
                iPosition = i;
            } catch (Throwable th) {
                dst.afterHeadWrite();
                throw th;
            }
        }
        dst.afterHeadWrite();
        buffer.discardUntilIndex$ktor_io(i);
        return i2;
    }

    public static final int readUntilDelimitersDirect(@NotNull Buffer buffer, byte b, byte b2, @NotNull Output dst) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(dst, "dst");
        int readPosition = buffer.getReadPosition();
        int writePosition = buffer.getWritePosition();
        ByteBuffer memory = buffer.getMemory();
        while (readPosition != writePosition) {
            byte b3 = memory.get(readPosition);
            if (b3 == b || b3 == b2) {
                break;
            }
            readPosition++;
        }
        int readPosition2 = readPosition - buffer.getReadPosition();
        OutputKt.writeFully(dst, buffer, readPosition2);
        return readPosition2;
    }

    /* JADX WARN: Finally extract failed */
    public static final int readUntilDelimitersArrays(@NotNull Buffer buffer, byte b, byte b2, @NotNull Output dst) {
        int i;
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(dst, "dst");
        ByteBuffer memory = buffer.getMemory();
        byte[] array = memory.array();
        int iPosition = memory.position() + memory.arrayOffset() + buffer.getReadPosition();
        int iPosition2 = memory.position() + memory.arrayOffset() + buffer.getWritePosition();
        ChunkBuffer chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(dst, 1, null);
        int i2 = 0;
        while (true) {
            try {
                int iMin = Math.min((chunkBufferPrepareWriteHead.getLimit() - chunkBufferPrepareWriteHead.getWritePosition()) + iPosition, iPosition2);
                if (iMin <= array.length) {
                    i = iPosition;
                    while (i < iMin) {
                        byte b3 = array[i];
                        if (b3 == b || b3 == b2) {
                            break;
                        }
                        i++;
                    }
                } else {
                    i = iPosition;
                }
                int i3 = i - iPosition;
                Intrinsics.checkNotNullExpressionValue(array, "array");
                BufferPrimitivesKt.writeFully((Buffer) chunkBufferPrepareWriteHead, array, iPosition, i3);
                i2 += i3;
                if (chunkBufferPrepareWriteHead.getLimit() > chunkBufferPrepareWriteHead.getWritePosition() || i >= iPosition2) {
                    break;
                }
                chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(dst, 1, chunkBufferPrepareWriteHead);
                iPosition = i;
            } catch (Throwable th) {
                dst.afterHeadWrite();
                throw th;
            }
        }
        dst.afterHeadWrite();
        buffer.discardUntilIndex$ktor_io(i);
        return i2;
    }
}
