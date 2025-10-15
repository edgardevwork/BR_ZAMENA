package io.ktor.websocket.internals;

import io.ktor.util.cio.ByteBufferPoolKt;
import io.ktor.utils.p050io.core.BytePacketBuilder;
import io.ktor.utils.p050io.core.ByteReadPacket;
import io.ktor.utils.p050io.core.OutputArraysJVMKt;
import io.ktor.utils.p050io.core.StringsKt;
import io.ktor.utils.p050io.pool.ObjectPool;
import java.nio.ByteBuffer;
import java.util.zip.Deflater;
import java.util.zip.Inflater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: DeflaterUtils.kt */
@Metadata(m7104d1 = {"\u00000\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0003\u001a\u00020\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0001H\u0000\u001a$\u0010\u0006\u001a\u00020\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002\u001a\u0014\u0010\u000e\u001a\u00020\u0001*\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0001H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m7105d2 = {"EMPTY_CHUNK", "", "PADDED_EMPTY_CHUNK", "deflateFully", "Ljava/util/zip/Deflater;", "data", "deflateTo", "", "Lio/ktor/utils/io/core/BytePacketBuilder;", "deflater", "buffer", "Ljava/nio/ByteBuffer;", "flush", "", "inflateFully", "Ljava/util/zip/Inflater;", "ktor-websockets"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nDeflaterUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeflaterUtils.kt\nio/ktor/websocket/internals/DeflaterUtilsKt\n+ 2 Builder.kt\nio/ktor/utils/io/core/BuilderKt\n+ 3 Pool.kt\nio/ktor/utils/io/pool/PoolKt\n*L\n1#1,85:1\n12#2,7:86\n19#2,4:98\n12#2,11:102\n12#2,7:113\n19#2,4:125\n159#3,5:93\n159#3,5:120\n*S KotlinDebug\n*F\n+ 1 DeflaterUtils.kt\nio/ktor/websocket/internals/DeflaterUtilsKt\n*L\n19#1:86,7\n19#1:98,4\n35#1:102,11\n45#1:113,7\n45#1:125,4\n20#1:93,5\n46#1:120,5\n*E\n"})
/* loaded from: classes7.dex */
public final class DeflaterUtilsKt {

    @NotNull
    public static final byte[] PADDED_EMPTY_CHUNK = {0, 0, 0, -1, -1};

    @NotNull
    public static final byte[] EMPTY_CHUNK = {0, 0, -1, -1};

    @NotNull
    public static final byte[] deflateFully(@NotNull Deflater deflater, @NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(deflater, "<this>");
        Intrinsics.checkNotNullParameter(data, "data");
        deflater.setInput(data);
        BytePacketBuilder bytePacketBuilder = new BytePacketBuilder(null, 1, null);
        try {
            ObjectPool<ByteBuffer> ktorDefaultPool = ByteBufferPoolKt.getKtorDefaultPool();
            ByteBuffer byteBufferBorrow = ktorDefaultPool.borrow();
            try {
                ByteBuffer byteBuffer = byteBufferBorrow;
                while (!deflater.needsInput()) {
                    deflateTo(bytePacketBuilder, deflater, byteBuffer, false);
                }
                while (deflateTo(bytePacketBuilder, deflater, byteBuffer, true) != 0) {
                }
                Unit unit = Unit.INSTANCE;
                ktorDefaultPool.recycle(byteBufferBorrow);
                ByteReadPacket byteReadPacketBuild = bytePacketBuilder.build();
                if (BytePacketUtilsKt.endsWith(byteReadPacketBuild, PADDED_EMPTY_CHUNK)) {
                    byte[] bytes = StringsKt.readBytes(byteReadPacketBuild, ((int) byteReadPacketBuild.getRemaining()) - EMPTY_CHUNK.length);
                    byteReadPacketBuild.release();
                    return bytes;
                }
                bytePacketBuilder = new BytePacketBuilder(null, 1, null);
                try {
                    bytePacketBuilder.writePacket(byteReadPacketBuild);
                    bytePacketBuilder.writeByte((byte) 0);
                    return StringsKt.readBytes$default(bytePacketBuilder.build(), 0, 1, null);
                } finally {
                }
            } catch (Throwable th) {
                ktorDefaultPool.recycle(byteBufferBorrow);
                throw th;
            }
        } finally {
        }
    }

    @NotNull
    public static final byte[] inflateFully(@NotNull Inflater inflater, @NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(inflater, "<this>");
        Intrinsics.checkNotNullParameter(data, "data");
        inflater.setInput(ArraysKt___ArraysJvmKt.plus(data, EMPTY_CHUNK));
        BytePacketBuilder bytePacketBuilder = new BytePacketBuilder(null, 1, null);
        try {
            ObjectPool<ByteBuffer> ktorDefaultPool = ByteBufferPoolKt.getKtorDefaultPool();
            ByteBuffer byteBufferBorrow = ktorDefaultPool.borrow();
            try {
                ByteBuffer byteBuffer = byteBufferBorrow;
                long length = r11.length + inflater.getBytesRead();
                while (inflater.getBytesRead() < length) {
                    byteBuffer.clear();
                    byteBuffer.position(byteBuffer.position() + inflater.inflate(byteBuffer.array(), byteBuffer.position(), byteBuffer.limit()));
                    byteBuffer.flip();
                    OutputArraysJVMKt.writeFully(bytePacketBuilder, byteBuffer);
                }
                Unit unit = Unit.INSTANCE;
                ktorDefaultPool.recycle(byteBufferBorrow);
                return StringsKt.readBytes$default(bytePacketBuilder.build(), 0, 1, null);
            } catch (Throwable th) {
                ktorDefaultPool.recycle(byteBufferBorrow);
                throw th;
            }
        } catch (Throwable th2) {
            bytePacketBuilder.release();
            throw th2;
        }
    }

    public static final int deflateTo(BytePacketBuilder bytePacketBuilder, Deflater deflater, ByteBuffer byteBuffer, boolean z) {
        int iDeflate;
        byteBuffer.clear();
        if (z) {
            iDeflate = deflater.deflate(byteBuffer.array(), byteBuffer.position(), byteBuffer.limit(), 2);
        } else {
            iDeflate = deflater.deflate(byteBuffer.array(), byteBuffer.position(), byteBuffer.limit());
        }
        if (iDeflate == 0) {
            return 0;
        }
        byteBuffer.position(byteBuffer.position() + iDeflate);
        byteBuffer.flip();
        OutputArraysJVMKt.writeFully(bytePacketBuilder, byteBuffer);
        return iDeflate;
    }
}
