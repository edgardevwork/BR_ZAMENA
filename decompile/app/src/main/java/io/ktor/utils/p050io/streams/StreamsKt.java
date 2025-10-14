package io.ktor.utils.p050io.streams;

import com.fasterxml.jackson.core.base.ParserMinimalBase;
import io.ktor.utils.p050io.core.BytePacketBuilder;
import io.ktor.utils.p050io.core.ByteReadPacket;
import io.ktor.utils.p050io.core.Input;
import io.ktor.utils.p050io.core.InputArraysKt;
import io.ktor.utils.p050io.core.InsufficientSpaceException;
import io.ktor.utils.p050io.core.Output;
import io.ktor.utils.p050io.core.OutputKt;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: Streams.kt */
@Metadata(m7104d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0002\u001a\u00020\u0003*\u00020\u0004\u001a\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0007\u001a\u0012\u0010\b\u001a\u00020\u0004*\u00020\u00032\u0006\u0010\t\u001a\u00020\n\u001a\u0012\u0010\u000b\u001a\u00020\u0004*\u00020\u00032\u0006\u0010\t\u001a\u00020\n\u001a\u0012\u0010\f\u001a\u00020\u0004*\u00020\u00032\u0006\u0010\t\u001a\u00020\n\u001a\u001c\u0010\r\u001a\u00020\u0004*\u00020\u00032\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH\u0002\u001a\n\u0010\u0010\u001a\u00020\u0011*\u00020\u0004\u001a#\u0010\u0012\u001a\u00020\u0013*\u00020\u00062\u0017\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00130\u0015¢\u0006\u0002\b\u0016\u001a\u0012\u0010\u0012\u001a\u00020\u0013*\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0004\u001a\n\u0010\u0018\u001a\u00020\u0019*\u00020\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m7105d2 = {"SkipBuffer", "", "inputStream", "Ljava/io/InputStream;", "Lio/ktor/utils/io/core/ByteReadPacket;", "outputStream", "Ljava/io/OutputStream;", "Lio/ktor/utils/io/core/BytePacketBuilder;", "readPacketAtLeast", "n", "", "readPacketAtMost", "readPacketExact", "readPacketImpl", "min", "max", "readerUTF8", "Ljava/io/Reader;", "writePacket", "", "builder", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "packet", "writerUTF8", "Ljava/io/Writer;", "ktor-io"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nStreams.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Streams.kt\nio/ktor/utils/io/streams/StreamsKt\n+ 2 Builder.kt\nio/ktor/utils/io/core/BuilderKt\n+ 3 Packet.kt\nio/ktor/utils/io/core/PacketKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,155:1\n12#2,11:156\n43#3:167\n1#4:168\n*S KotlinDebug\n*F\n+ 1 Streams.kt\nio/ktor/utils/io/streams/StreamsKt\n*L\n11#1:156,11\n23#1:167\n*E\n"})
/* loaded from: classes5.dex */
public final class StreamsKt {

    @NotNull
    public static final char[] SkipBuffer = new char[8192];

    public static final void writePacket(@NotNull OutputStream outputStream, @NotNull ByteReadPacket packet) {
        Intrinsics.checkNotNullParameter(outputStream, "<this>");
        Intrinsics.checkNotNullParameter(packet, "packet");
        long remaining = packet.getRemaining();
        if (remaining == 0) {
            return;
        }
        byte[] bArr = new byte[(int) RangesKt___RangesKt.coerceAtMost(remaining, 4096L)];
        while (!packet.getEndOfInput()) {
            try {
                outputStream.write(bArr, 0, InputArraysKt.readAvailable$default((Input) packet, bArr, 0, 0, 6, (Object) null));
            } finally {
                packet.release();
            }
        }
    }

    @NotNull
    public static final ByteReadPacket readPacketExact(@NotNull InputStream inputStream, long j) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        return readPacketImpl(inputStream, j, j);
    }

    @NotNull
    public static final ByteReadPacket readPacketAtLeast(@NotNull InputStream inputStream, long j) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        return readPacketImpl(inputStream, j, Long.MAX_VALUE);
    }

    @NotNull
    public static final ByteReadPacket readPacketAtMost(@NotNull InputStream inputStream, long j) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        return readPacketImpl(inputStream, 1L, j);
    }

    public static final ByteReadPacket readPacketImpl(InputStream inputStream, long j, long j2) {
        long j3 = 0;
        if (j < 0) {
            throw new IllegalArgumentException("min shouldn't be negative".toString());
        }
        if (j > j2) {
            throw new IllegalArgumentException(("min shouldn't be greater than max: " + j + " > " + j2).toString());
        }
        int iCoerceAtMost = (int) RangesKt___RangesKt.coerceAtMost(j2, 4096L);
        byte[] bArr = new byte[iCoerceAtMost];
        BytePacketBuilder bytePacketBuilder = new BytePacketBuilder(null, 1, null);
        while (true) {
            if (j3 >= j && (j3 != j || j != 0)) {
                break;
            }
            try {
                int i = inputStream.read(bArr, 0, Math.min((int) Math.min(j2 - j3, ParserMinimalBase.MAX_INT_L), iCoerceAtMost));
                if (i == -1) {
                    throw new EOFException("Premature end of stream: was read " + j3 + " bytes of " + j);
                }
                j3 += i;
                OutputKt.writeFully((Output) bytePacketBuilder, bArr, 0, i);
            } catch (Throwable th) {
                bytePacketBuilder.release();
                throw th;
            }
        }
        return bytePacketBuilder.build();
    }

    @NotNull
    public static final InputStream inputStream(@NotNull final ByteReadPacket byteReadPacket) {
        Intrinsics.checkNotNullParameter(byteReadPacket, "<this>");
        return new InputStream() { // from class: io.ktor.utils.io.streams.StreamsKt.inputStream.1
            @Override // java.io.InputStream
            public int read() {
                if (byteReadPacket.getEndOfInput()) {
                    return -1;
                }
                return byteReadPacket.readByte() & 255;
            }

            @Override // java.io.InputStream
            public int available() {
                return (int) Math.min(byteReadPacket.getRemaining(), ParserMinimalBase.MAX_INT_L);
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                byteReadPacket.release();
            }
        };
    }

    @NotNull
    public static final Reader readerUTF8(@NotNull final ByteReadPacket byteReadPacket) {
        Intrinsics.checkNotNullParameter(byteReadPacket, "<this>");
        return new Reader() { // from class: io.ktor.utils.io.streams.StreamsKt.readerUTF8.1
            @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                byteReadPacket.release();
            }

            @Override // java.io.Reader
            public long skip(long n) {
                int i;
                char[] cArr = StreamsKt.SkipBuffer;
                int length = cArr.length;
                long j = 0;
                while (j < n && (i = read(cArr, 0, (int) Math.min(length, n - j))) != -1) {
                    j += i;
                }
                return j;
            }

            @Override // java.io.Reader
            public int read(@NotNull char[] cbuf, int off, int len) {
                Intrinsics.checkNotNullParameter(cbuf, "cbuf");
                return byteReadPacket.readAvailableCharacters$ktor_io(cbuf, off, len);
            }
        };
    }

    @NotNull
    public static final OutputStream outputStream(@NotNull final BytePacketBuilder bytePacketBuilder) {
        Intrinsics.checkNotNullParameter(bytePacketBuilder, "<this>");
        return new OutputStream() { // from class: io.ktor.utils.io.streams.StreamsKt.outputStream.1
            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // java.io.OutputStream
            public void write(int b) throws InsufficientSpaceException {
                bytePacketBuilder.writeByte((byte) b);
            }

            @Override // java.io.OutputStream
            public void write(@NotNull byte[] b, int off, int len) {
                Intrinsics.checkNotNullParameter(b, "b");
                OutputKt.writeFully((Output) bytePacketBuilder, b, off, len);
            }
        };
    }

    @NotNull
    public static final Writer writerUTF8(@NotNull final BytePacketBuilder bytePacketBuilder) {
        Intrinsics.checkNotNullParameter(bytePacketBuilder, "<this>");
        return new Writer() { // from class: io.ktor.utils.io.streams.StreamsKt.writerUTF8.1
            @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // java.io.Writer, java.io.Flushable
            public void flush() {
            }

            @Override // java.io.Writer
            public void write(@NotNull char[] cbuf, int off, int len) {
                Intrinsics.checkNotNullParameter(cbuf, "cbuf");
                bytePacketBuilder.append(cbuf, off, len + off);
            }
        };
    }

    public static final void writePacket(@NotNull OutputStream outputStream, @NotNull Function1<? super BytePacketBuilder, Unit> builder) {
        Intrinsics.checkNotNullParameter(outputStream, "<this>");
        Intrinsics.checkNotNullParameter(builder, "builder");
        BytePacketBuilder bytePacketBuilder = new BytePacketBuilder(null, 1, null);
        try {
            builder.invoke(bytePacketBuilder);
            writePacket(outputStream, bytePacketBuilder.build());
        } catch (Throwable th) {
            bytePacketBuilder.release();
            throw th;
        }
    }
}
