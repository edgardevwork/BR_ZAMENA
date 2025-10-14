package io.ktor.utils.p050io.core;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.datasource.cache.CacheFileMetadataIndex;
import androidx.media3.extractor.flv.ScriptTagPayloadReader;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import io.ktor.utils.p050io.bits.MemoryJvmKt;
import io.ktor.utils.p050io.charsets.CharsetJVMKt;
import io.ktor.utils.p050io.core.internal.ChunkBuffer;
import io.ktor.utils.p050io.core.internal.EncodeResult;
import io.ktor.utils.p050io.core.internal.NumbersKt;
import io.ktor.utils.p050io.core.internal.UTF8Kt;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.charset.CharsetDecoder;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.UShort;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BufferCompatibility.kt */
@Metadata(m7104d1 = {"\u0000r\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0019\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u0014\u0010\u0004\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007\u001a$\u0010\u0004\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003H\u0007\u001a\u0016\u0010\u0004\u001a\u00020\u0005*\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\fH\u0007\u001a&\u0010\u0004\u001a\u00020\u0005*\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\f2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003H\u0007\u001a(\u0010\r\u001a\u00020\u0003*\u00020\u00052\u0006\u0010\b\u001a\u00020\f2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003H\u0000\u001a\u001a\u0010\u000e\u001a\u00020\u000f*\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012\u001a'\u0010\u000e\u001a\u00020\u000f*\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0013ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001c\u0010\u000e\u001a\u00020\u000f*\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0012H\u0007\u001a\f\u0010\u0019\u001a\u00020\u000f*\u00020\u0005H\u0007\u001a\f\u0010\u001a\u001a\u00020\u0005*\u00020\u0005H\u0007\u001a\f\u0010\u001a\u001a\u00020\u001b*\u00020\u001bH\u0007\u001a\u0014\u0010\u001c\u001a\u00020\u000f*\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0003H\u0007\u001a1\u0010\u001d\u001a\u00020\u000f*\u00020\u00052\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00120\u001f2\b\b\u0002\u0010 \u001a\u00020\u00032\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010!\u001a6\u0010\"\u001a\u00020\u0003*\u00020\u00052\n\u0010#\u001a\u00060$j\u0002`%2\n\u0010&\u001a\u00060'j\u0002`(2\u0006\u0010)\u001a\u00020*2\b\b\u0002\u0010+\u001a\u00020\u0003H\u0007\u001a\f\u0010,\u001a\u00020\u0003*\u00020\u0005H\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006-"}, m7105d2 = {"appendFailed", "", CacheFileMetadataIndex.COLUMN_LENGTH, "", "append", "Lio/ktor/utils/io/core/Buffer;", "c", "", "csq", "", TtmlNode.START, "end", "", "appendChars", "fill", "", ScriptTagPayloadReader.KEY_TIMES, "value", "", "Lkotlin/UByte;", "fill-sEu17AQ", "(Lio/ktor/utils/io/core/Buffer;IB)V", "n", "", "v", "flush", "makeView", "Lio/ktor/utils/io/core/internal/ChunkBuffer;", "pushBack", "readFully", "dst", "", TypedValues.CycleType.S_WAVE_OFFSET, "(Lio/ktor/utils/io/core/Buffer;[Ljava/lang/Byte;II)V", "readText", "decoder", "Ljava/nio/charset/CharsetDecoder;", "Lio/ktor/utils/io/charsets/CharsetDecoder;", "out", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "lastBuffer", "", "max", "tryPeek", "ktor-io"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nBufferCompatibility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BufferCompatibility.kt\nio/ktor/utils/io/core/BufferCompatibilityKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Buffer.kt\nio/ktor/utils/io/core/Buffer\n+ 4 Numbers.kt\nio/ktor/utils/io/core/internal/NumbersKt\n+ 5 Buffer.kt\nio/ktor/utils/io/core/BufferKt\n+ 6 UTF8.kt\nio/ktor/utils/io/core/internal/UTF8Kt\n+ 7 MemoryJvm.kt\nio/ktor/utils/io/bits/Memory\n+ 8 Memory.kt\nio/ktor/utils/io/bits/MemoryKt\n*L\n1#1,177:1\n1#2:178\n74#3:179\n74#3:180\n6#4,2:181\n390#5,7:183\n390#5,5:190\n395#5,2:223\n372#5,5:225\n377#5,2:232\n319#6,3:195\n322#6,4:200\n326#6,18:205\n37#7,2:198\n26#7:231\n99#8:204\n84#8:230\n*S KotlinDebug\n*F\n+ 1 BufferCompatibility.kt\nio/ktor/utils/io/core/BufferCompatibilityKt\n*L\n15#1:179\n16#1:180\n37#1:181,2\n79#1:183,7\n94#1:190,5\n94#1:223,2\n165#1:225,5\n165#1:232,2\n95#1:195,3\n95#1:200,4\n95#1:205,18\n95#1:198,2\n171#1:231\n95#1:204\n171#1:230\n*E\n"})
/* loaded from: classes8.dex */
public final class BufferCompatibilityKt {
    @Deprecated(level = DeprecationLevel.ERROR, message = "Does nothing.")
    public static final void flush(@NotNull Buffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
    }

    /* renamed from: fill-sEu17AQ, reason: not valid java name */
    public static final void m15568fillsEu17AQ(@NotNull Buffer fill, int i, byte b) {
        Intrinsics.checkNotNullParameter(fill, "$this$fill");
        fill(fill, i, b);
    }

    @Deprecated(message = "Use fill with n with type Int")
    public static final void fill(@NotNull Buffer buffer, long j, byte b) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (j < ParserMinimalBase.MAX_INT_L) {
            fill(buffer, (int) j, b);
        } else {
            NumbersKt.failLongToIntConversion(j, "n");
            throw new KotlinNothingValueException();
        }
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Use rewind instead", replaceWith = @ReplaceWith(expression = "rewind(n)", imports = {}))
    public static final void pushBack(@NotNull Buffer buffer, int i) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        buffer.rewind(i);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Use duplicate instead", replaceWith = @ReplaceWith(expression = "duplicate()", imports = {}))
    @NotNull
    public static final Buffer makeView(@NotNull Buffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        return buffer.duplicate();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Use duplicate instead", replaceWith = @ReplaceWith(expression = "duplicate()", imports = {}))
    @NotNull
    public static final ChunkBuffer makeView(@NotNull ChunkBuffer chunkBuffer) {
        Intrinsics.checkNotNullParameter(chunkBuffer, "<this>");
        return chunkBuffer.duplicate();
    }

    public static /* synthetic */ int appendChars$default(Buffer buffer, CharSequence charSequence, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = charSequence.length();
        }
        return appendChars(buffer, charSequence, i, i2);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "This is no longer supported. Use a packet builder to append characters instead.")
    @NotNull
    public static final Buffer append(@NotNull Buffer buffer, @Nullable CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        throw new IllegalStateException("This is no longer supported. Use a packet builder to append characters instead.".toString());
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "This is no longer supported. Use a packet builder to append characters instead.")
    @NotNull
    public static final Buffer append(@NotNull Buffer buffer, @Nullable CharSequence charSequence, int i, int i2) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        throw new IllegalStateException("This is no longer supported. Use a packet builder to append characters instead.".toString());
    }

    public static final Void appendFailed(int i) throws BufferLimitExceededException {
        throw new BufferLimitExceededException("Not enough free space available to write " + i + " character(s).");
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "This is no longer supported. Use a packet builder to append characters instead.")
    @NotNull
    public static final Buffer append(@NotNull Buffer buffer, @NotNull char[] csq, int i, int i2) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(csq, "csq");
        throw new IllegalStateException("This is no longer supported. Use a packet builder to append characters instead.".toString());
    }

    public static /* synthetic */ int readText$default(Buffer buffer, CharsetDecoder charsetDecoder, Appendable appendable, boolean z, int i, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            i = Integer.MAX_VALUE;
        }
        return readText(buffer, charsetDecoder, appendable, z, i);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "This is no longer supported. Read from a packet instead.")
    public static final int readText(@NotNull Buffer buffer, @NotNull CharsetDecoder decoder, @NotNull Appendable out, boolean z, int i) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(out, "out");
        return CharsetJVMKt.decodeBuffer(decoder, buffer, out, z, i);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Use tryPeekByte instead", replaceWith = @ReplaceWith(expression = "tryPeekByte()", imports = {}))
    public static final int tryPeek(@NotNull Buffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        return buffer.tryPeekByte();
    }

    public static /* synthetic */ void readFully$default(Buffer buffer, Byte[] bArr, int i, int i2, int i3, Object obj) throws EOFException {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = bArr.length - i;
        }
        readFully(buffer, bArr, i, i2);
    }

    public static final void fill(@NotNull Buffer buffer, int i, byte b) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(("times shouldn't be negative: " + i).toString());
        }
        if (i > buffer.getLimit() - buffer.getWritePosition()) {
            throw new IllegalArgumentException(("times shouldn't be greater than the write remaining space: " + i + " > " + (buffer.getLimit() - buffer.getWritePosition())).toString());
        }
        MemoryJvmKt.m15445fillJT6ljtQ(buffer.getMemory(), buffer.getWritePosition(), i, b);
        buffer.commitWritten(i);
    }

    public static final int appendChars(@NotNull Buffer buffer, @NotNull CharSequence csq, int i, int i2) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(csq, "csq");
        int iM15685encodeUTF8lBXzO7A = UTF8Kt.m15685encodeUTF8lBXzO7A(buffer.getMemory(), csq, i, i2, buffer.getWritePosition(), buffer.getLimit());
        int iM15681getCharactersMh2AYeg = EncodeResult.m15681getCharactersMh2AYeg(iM15685encodeUTF8lBXzO7A) & UShort.MAX_VALUE;
        buffer.commitWritten(EncodeResult.m15680getBytesMh2AYeg(iM15685encodeUTF8lBXzO7A) & UShort.MAX_VALUE);
        return i + iM15681getCharactersMh2AYeg;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "This is no longer supported. Use a packet builder to append characters instead.")
    @NotNull
    public static final Buffer append(@NotNull Buffer buffer, char c) throws BufferLimitExceededException {
        int i;
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        ByteBuffer memory = buffer.getMemory();
        int writePosition = buffer.getWritePosition();
        int limit = buffer.getLimit();
        if (c >= 0 && c < 128) {
            memory.put(writePosition, (byte) c);
            i = 1;
        } else if (128 <= c && c < 2048) {
            memory.put(writePosition, (byte) (((c >> 6) & 31) | 192));
            memory.put(writePosition + 1, (byte) ((c & '?') | 128));
            i = 2;
        } else if (2048 <= c && c < 0) {
            memory.put(writePosition, (byte) (((c >> '\f') & 15) | 224));
            memory.put(writePosition + 1, (byte) (((c >> 6) & 63) | 128));
            memory.put(writePosition + 2, (byte) ((c & '?') | 128));
            i = 3;
        } else {
            if (0 > c || c >= 0) {
                UTF8Kt.malformedCodePoint(c);
                throw new KotlinNothingValueException();
            }
            memory.put(writePosition, (byte) (((c >> 18) & 7) | 240));
            memory.put(writePosition + 1, (byte) (((c >> '\f') & 63) | 128));
            memory.put(writePosition + 2, (byte) (((c >> 6) & 63) | 128));
            memory.put(writePosition + 3, (byte) ((c & '?') | 128));
            i = 4;
        }
        if (i > limit - writePosition) {
            appendFailed(1);
            throw new KotlinNothingValueException();
        }
        buffer.commitWritten(i);
        return buffer;
    }

    public static final void readFully(@NotNull Buffer buffer, @NotNull Byte[] dst, int i, int i2) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(dst, "dst");
        ByteBuffer memory = buffer.getMemory();
        int readPosition = buffer.getReadPosition();
        if (buffer.getWritePosition() - readPosition < i2) {
            throw new EOFException("Not enough bytes available to read " + i2 + " bytes");
        }
        for (int i3 = 0; i3 < i2; i3++) {
            dst[i3 + i] = Byte.valueOf(memory.get(i3 + readPosition));
        }
        buffer.discardExact(i2);
    }
}
