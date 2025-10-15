package io.ktor.util;

import androidx.multidex.MultiDexExtractor;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.ktor.util.cio.ByteBufferPoolKt;
import io.ktor.utils.p050io.ByteReadChannel;
import io.ktor.utils.p050io.ByteWriteChannel;
import io.ktor.utils.p050io.ByteWriteChannelKt;
import io.ktor.utils.p050io.CoroutinesKt;
import io.ktor.utils.p050io.ReaderScope;
import io.ktor.utils.p050io.WriterScope;
import io.ktor.utils.p050io.pool.ObjectPool;
import java.nio.ByteBuffer;
import java.util.zip.CRC32;
import java.util.zip.Checksum;
import java.util.zip.Deflater;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Deflater.kt */
@Metadata(m7104d1 = {"\u0000P\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\u0006\u001a\u00020\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0010\u001a\u0014\u0010\u0006\u001a\u00020\u0007*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000fH\u0002\u001a3\u0010\u0013\u001a\u00020\u0007*\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u000f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u0017H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0018\u001a.\u0010\u0019\u001a\u00020\b*\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0002\u0010\u001a\u001a\u00020\u001b\u001a.\u0010\u0019\u001a\u00020\n*\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0002\u0010\u001a\u001a\u00020\u001b\u001a\u0015\u0010\u001c\u001a\u00020\u0007*\u00020\nH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u001d\u001a%\u0010\u001e\u001a\u00020\u0007*\u00020\n2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u0014\u001a\u00020\u0011H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010!\u001a\u0014\u0010\"\u001a\u00020\u0007*\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u000fH\u0002\u001a\u0014\u0010#\u001a\u00020\u0007*\u00020 2\u0006\u0010\u0015\u001a\u00020\u000fH\u0000\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006$"}, m7105d2 = {"GZIP_HEADER_PADDING", "", "getGZIP_HEADER_PADDING", "()[B", "GZIP_MAGIC", "", "deflateTo", "", "Lio/ktor/utils/io/ByteReadChannel;", FirebaseAnalytics.Param.DESTINATION, "Lio/ktor/utils/io/ByteWriteChannel;", "gzip", "", "pool", "Lio/ktor/utils/io/pool/ObjectPool;", "Ljava/nio/ByteBuffer;", "(Lio/ktor/utils/io/ByteReadChannel;Lio/ktor/utils/io/ByteWriteChannel;ZLio/ktor/utils/io/pool/ObjectPool;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/util/zip/Deflater;", "outBuffer", "deflateWhile", "deflater", "buffer", "predicate", "Lkotlin/Function0;", "(Lio/ktor/utils/io/ByteWriteChannel;Ljava/util/zip/Deflater;Ljava/nio/ByteBuffer;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deflated", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "putGzipHeader", "(Lio/ktor/utils/io/ByteWriteChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "putGzipTrailer", MultiDexExtractor.KEY_CRC, "Ljava/util/zip/Checksum;", "(Lio/ktor/utils/io/ByteWriteChannel;Ljava/util/zip/Checksum;Ljava/util/zip/Deflater;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setInputBuffer", "updateKeepPosition", "ktor-utils"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nDeflater.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Deflater.kt\nio/ktor/util/DeflaterKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ByteOrderJvm.kt\nio/ktor/utils/io/bits/ByteOrderJVMKt\n*L\n1#1,125:1\n1#2:126\n9#3:127\n15#3:128\n15#3:129\n*S KotlinDebug\n*F\n+ 1 Deflater.kt\nio/ktor/util/DeflaterKt\n*L\n37#1:127\n43#1:128\n44#1:129\n*E\n"})
/* loaded from: classes7.dex */
public final class DeflaterKt {

    @NotNull
    public static final byte[] GZIP_HEADER_PADDING = new byte[7];
    public static final short GZIP_MAGIC = -29921;

    /* compiled from: Deflater.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.util.DeflaterKt", m7120f = "Deflater.kt", m7121i = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4}, m7122l = {72, 77, 82, 88, 91}, m7123m = "deflateTo", m7124n = {"$this$deflateTo", FirebaseAnalytics.Param.DESTINATION, "pool", MultiDexExtractor.KEY_CRC, "deflater", "input", "compressed", "gzip", "$this$deflateTo", FirebaseAnalytics.Param.DESTINATION, "pool", MultiDexExtractor.KEY_CRC, "deflater", "input", "compressed", "gzip", "$this$deflateTo", FirebaseAnalytics.Param.DESTINATION, "pool", MultiDexExtractor.KEY_CRC, "deflater", "input", "compressed", "gzip", FirebaseAnalytics.Param.DESTINATION, "pool", MultiDexExtractor.KEY_CRC, "deflater", "input", "compressed", "gzip", "pool", "deflater", "input", "compressed"}, m7125s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "Z$0", "L$0", "L$1", "L$2", "L$3"})
    /* renamed from: io.ktor.util.DeflaterKt$deflateTo$1 */
    /* loaded from: classes5.dex */
    public static final class C103461 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public C103461(Continuation<? super C103461> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DeflaterKt.deflateTo(null, null, false, null, this);
        }
    }

    /* compiled from: Deflater.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.util.DeflaterKt", m7120f = "Deflater.kt", m7121i = {0, 0, 0, 0}, m7122l = {52}, m7123m = "deflateWhile", m7124n = {"$this$deflateWhile", "deflater", "buffer", "predicate"}, m7125s = {"L$0", "L$1", "L$2", "L$3"})
    /* renamed from: io.ktor.util.DeflaterKt$deflateWhile$1 */
    /* loaded from: classes5.dex */
    public static final class C103491 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public C103491(Continuation<? super C103491> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DeflaterKt.deflateWhile(null, null, null, null, this);
        }
    }

    /* compiled from: Deflater.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.util.DeflaterKt", m7120f = "Deflater.kt", m7121i = {0, 1}, m7122l = {37, 38, 39}, m7123m = "putGzipHeader", m7124n = {"$this$putGzipHeader", "$this$putGzipHeader"}, m7125s = {"L$0", "L$0"})
    /* renamed from: io.ktor.util.DeflaterKt$putGzipHeader$1 */
    /* loaded from: classes5.dex */
    public static final class C103521 extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C103521(Continuation<? super C103521> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DeflaterKt.putGzipHeader(null, this);
        }
    }

    /* compiled from: Deflater.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.util.DeflaterKt", m7120f = "Deflater.kt", m7121i = {0, 0}, m7122l = {43, 44}, m7123m = "putGzipTrailer", m7124n = {"$this$putGzipTrailer", "deflater"}, m7125s = {"L$0", "L$1"})
    /* renamed from: io.ktor.util.DeflaterKt$putGzipTrailer$1 */
    /* loaded from: classes5.dex */
    public static final class C103531 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C103531(Continuation<? super C103531> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DeflaterKt.putGzipTrailer(null, null, null, this);
        }
    }

    @NotNull
    public static final byte[] getGZIP_HEADER_PADDING() {
        return GZIP_HEADER_PADDING;
    }

    public static final void deflateTo(Deflater deflater, ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            byteBuffer.position(byteBuffer.position() + deflater.deflate(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining()));
        }
    }

    public static final void setInputBuffer(Deflater deflater, ByteBuffer byteBuffer) {
        if (!byteBuffer.hasArray()) {
            throw new IllegalArgumentException("buffer need to be array-backed".toString());
        }
        deflater.setInput(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
    }

    public static final void updateKeepPosition(@NotNull Checksum checksum, @NotNull ByteBuffer buffer) {
        Intrinsics.checkNotNullParameter(checksum, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        if (!buffer.hasArray()) {
            throw new IllegalArgumentException("buffer need to be array-backed".toString());
        }
        checksum.update(buffer.array(), buffer.arrayOffset() + buffer.position(), buffer.remaining());
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0076 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object putGzipHeader(ByteWriteChannel byteWriteChannel, Continuation<? super Unit> continuation) throws Throwable {
        C103521 c103521;
        byte[] bArr;
        if (continuation instanceof C103521) {
            c103521 = (C103521) continuation;
            int i = c103521.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c103521.label = i - Integer.MIN_VALUE;
            } else {
                c103521 = new C103521(continuation);
            }
        }
        Object obj = c103521.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c103521.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            short sReverseBytes = Short.reverseBytes((short) (-29921));
            c103521.L$0 = byteWriteChannel;
            c103521.label = 1;
            if (byteWriteChannel.writeShort(sReverseBytes, c103521) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                byteWriteChannel = (ByteWriteChannel) c103521.L$0;
                ResultKt.throwOnFailure(obj);
                bArr = GZIP_HEADER_PADDING;
                c103521.L$0 = null;
                c103521.label = 3;
                if (ByteWriteChannelKt.writeFully(byteWriteChannel, bArr, c103521) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
            byteWriteChannel = (ByteWriteChannel) c103521.L$0;
            ResultKt.throwOnFailure(obj);
        }
        c103521.L$0 = byteWriteChannel;
        c103521.label = 2;
        if (byteWriteChannel.writeByte((byte) 8, c103521) == coroutine_suspended) {
            return coroutine_suspended;
        }
        bArr = GZIP_HEADER_PADDING;
        c103521.L$0 = null;
        c103521.label = 3;
        if (ByteWriteChannelKt.writeFully(byteWriteChannel, bArr, c103521) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object putGzipTrailer(ByteWriteChannel byteWriteChannel, Checksum checksum, Deflater deflater, Continuation<? super Unit> continuation) throws Throwable {
        C103531 c103531;
        if (continuation instanceof C103531) {
            c103531 = (C103531) continuation;
            int i = c103531.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c103531.label = i - Integer.MIN_VALUE;
            } else {
                c103531 = new C103531(continuation);
            }
        }
        Object obj = c103531.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c103531.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            int iReverseBytes = Integer.reverseBytes((int) checksum.getValue());
            c103531.L$0 = byteWriteChannel;
            c103531.L$1 = deflater;
            c103531.label = 1;
            if (byteWriteChannel.writeInt(iReverseBytes, c103531) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            deflater = (Deflater) c103531.L$1;
            byteWriteChannel = (ByteWriteChannel) c103531.L$0;
            ResultKt.throwOnFailure(obj);
        }
        int iReverseBytes2 = Integer.reverseBytes(deflater.getTotalIn());
        c103531.L$0 = null;
        c103531.L$1 = null;
        c103531.label = 2;
        if (byteWriteChannel.writeInt(iReverseBytes2, c103531) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object deflateWhile(ByteWriteChannel byteWriteChannel, Deflater deflater, ByteBuffer byteBuffer, Function0<Boolean> function0, Continuation<? super Unit> continuation) throws Throwable {
        C103491 c103491;
        if (continuation instanceof C103491) {
            c103491 = (C103491) continuation;
            int i = c103491.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c103491.label = i - Integer.MIN_VALUE;
            } else {
                c103491 = new C103491(continuation);
            }
        }
        Object obj = c103491.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c103491.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Function0<Boolean> function02 = (Function0) c103491.L$3;
            ByteBuffer byteBuffer2 = (ByteBuffer) c103491.L$2;
            Deflater deflater2 = (Deflater) c103491.L$1;
            ByteWriteChannel byteWriteChannel2 = (ByteWriteChannel) c103491.L$0;
            ResultKt.throwOnFailure(obj);
            function0 = function02;
            byteWriteChannel = byteWriteChannel2;
            byteBuffer = byteBuffer2;
            deflater = deflater2;
        }
        while (function0.invoke().booleanValue()) {
            byteBuffer.clear();
            deflateTo(deflater, byteBuffer);
            byteBuffer.flip();
            c103491.L$0 = byteWriteChannel;
            c103491.L$1 = deflater;
            c103491.L$2 = byteBuffer;
            c103491.L$3 = function0;
            c103491.label = 1;
            if (byteWriteChannel.writeFully(byteBuffer, c103491) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x01b2, code lost:
    
        r2 = r3;
        r3 = r5;
        r5 = r11;
        r11 = r12;
        r12 = r13;
        r13 = r14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x014f A[Catch: all -> 0x01b4, TRY_LEAVE, TryCatch #1 {all -> 0x01b4, blocks: (B:51:0x0149, B:53:0x014f, B:68:0x01b8, B:70:0x01be, B:82:0x020f), top: B:87:0x0149 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x017e A[Catch: all -> 0x01a5, TRY_LEAVE, TryCatch #2 {all -> 0x01a5, blocks: (B:57:0x0176, B:59:0x017e), top: B:88:0x0176 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b8 A[Catch: all -> 0x01b4, TRY_ENTER, TryCatch #1 {all -> 0x01b4, blocks: (B:51:0x0149, B:53:0x014f, B:68:0x01b8, B:70:0x01be, B:82:0x020f), top: B:87:0x0149 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01e8 A[Catch: all -> 0x00a7, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x00a7, blocks: (B:75:0x01e8, B:28:0x00a3, B:33:0x00ca), top: B:92:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v11, types: [java.lang.Object, java.util.zip.Deflater] */
    /* JADX WARN: Type inference failed for: r11v12, types: [java.util.zip.Deflater] */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object, java.util.zip.Deflater] */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v4, types: [io.ktor.utils.io.ByteReadChannel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object, java.nio.ByteBuffer] */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object deflateTo(ByteReadChannel byteReadChannel, ByteWriteChannel byteWriteChannel, boolean z, ObjectPool<ByteBuffer> objectPool, Continuation<? super Unit> continuation) throws Throwable {
        C103461 c103461;
        ObjectPool objectPool2;
        ByteBuffer byteBuffer;
        Deflater deflater;
        ByteBuffer byteBuffer2;
        CRC32 crc32;
        ByteReadChannel byteReadChannel2;
        ObjectPool<ByteBuffer> objectPool3;
        ByteBuffer byteBuffer3;
        ByteReadChannel byteReadChannel3;
        boolean z2;
        ByteBuffer byteBuffer4;
        Deflater deflater2;
        ?? r14;
        boolean z3;
        CRC32 crc322;
        ByteWriteChannel byteWriteChannel2;
        boolean z4;
        ObjectPool objectPool4;
        boolean z5;
        ByteBuffer byteBuffer5;
        ByteWriteChannel byteWriteChannel3;
        ByteWriteChannel byteWriteChannel4 = byteWriteChannel;
        ?? r1 = z;
        if (continuation instanceof C103461) {
            c103461 = (C103461) continuation;
            int i = c103461.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c103461.label = i - Integer.MIN_VALUE;
            } else {
                c103461 = new C103461(continuation);
            }
        }
        Object obj = c103461.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r5 = c103461.label;
        final ?? r11 = 1;
        try {
            if (r5 == 0) {
                ResultKt.throwOnFailure(obj);
                crc32 = new CRC32();
                deflater = new Deflater(-1, true);
                ByteBuffer byteBufferBorrow = objectPool.borrow();
                ByteBuffer byteBufferBorrow2 = objectPool.borrow();
                if (r1 != 0) {
                    ByteReadChannel byteReadChannel4 = byteReadChannel;
                    try {
                        c103461.L$0 = byteReadChannel4;
                        c103461.L$1 = byteWriteChannel4;
                        objectPool3 = objectPool;
                    } catch (Throwable th) {
                        th = th;
                        objectPool3 = objectPool;
                    }
                    try {
                        c103461.L$2 = objectPool3;
                        c103461.L$3 = crc32;
                        c103461.L$4 = deflater;
                        c103461.L$5 = byteBufferBorrow;
                        c103461.L$6 = byteBufferBorrow2;
                        c103461.Z$0 = r1;
                        c103461.label = 1;
                        byteReadChannel2 = byteReadChannel4;
                        if (putGzipHeader(byteWriteChannel4, c103461) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        byteBuffer = byteBufferBorrow;
                        byteBuffer2 = byteBufferBorrow2;
                        objectPool2 = objectPool3;
                        deflater.end();
                        objectPool2.recycle(byteBuffer);
                        objectPool2.recycle(byteBuffer2);
                        throw th;
                    }
                } else {
                    byteReadChannel2 = byteReadChannel;
                    objectPool3 = objectPool;
                }
                r11 = deflater;
                r5 = byteBufferBorrow;
                byteBuffer3 = byteBufferBorrow2;
                objectPool2 = objectPool3;
                z3 = r1;
                r14 = byteReadChannel2;
                if (r14.isClosedForRead()) {
                }
            } else {
                try {
                    if (r5 == 1) {
                        z5 = c103461.Z$0;
                        byteBuffer5 = (ByteBuffer) c103461.L$6;
                        ByteBuffer byteBuffer6 = (ByteBuffer) c103461.L$5;
                        Deflater deflater3 = (Deflater) c103461.L$4;
                        crc32 = (CRC32) c103461.L$3;
                        objectPool2 = (ObjectPool) c103461.L$2;
                        byteWriteChannel3 = (ByteWriteChannel) c103461.L$1;
                        byteReadChannel3 = (ByteReadChannel) c103461.L$0;
                        byteBuffer4 = byteBuffer6;
                        deflater2 = deflater3;
                    } else if (r5 == 2) {
                        boolean z6 = c103461.Z$0;
                        ByteBuffer byteBuffer7 = (ByteBuffer) c103461.L$6;
                        ByteBuffer byteBuffer8 = (ByteBuffer) c103461.L$5;
                        Deflater deflater4 = (Deflater) c103461.L$4;
                        CRC32 crc323 = (CRC32) c103461.L$3;
                        ObjectPool objectPool5 = (ObjectPool) c103461.L$2;
                        ByteWriteChannel byteWriteChannel5 = (ByteWriteChannel) c103461.L$1;
                        byteReadChannel3 = (ByteReadChannel) c103461.L$0;
                        ResultKt.throwOnFailure(obj);
                        z2 = z6;
                        byteWriteChannel4 = byteWriteChannel5;
                        ObjectPool objectPool6 = objectPool5;
                        CRC32 crc324 = crc323;
                        final Deflater deflater5 = deflater4;
                        ByteBuffer byteBuffer9 = byteBuffer8;
                        C103461 c1034612 = c103461;
                        ByteBuffer byteBuffer10 = byteBuffer7;
                        try {
                            if (((Number) obj).intValue() <= 0) {
                                byteBuffer9.flip();
                                updateKeepPosition(crc324, byteBuffer9);
                                setInputBuffer(deflater5, byteBuffer9);
                                Function0<Boolean> function0 = new Function0<Boolean>() { // from class: io.ktor.util.DeflaterKt.deflateTo.2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function0
                                    @NotNull
                                    public final Boolean invoke() {
                                        return Boolean.valueOf(!deflater5.needsInput());
                                    }
                                };
                                c1034612.L$0 = byteReadChannel3;
                                c1034612.L$1 = byteWriteChannel4;
                                c1034612.L$2 = objectPool6;
                                c1034612.L$3 = crc324;
                                c1034612.L$4 = deflater5;
                                c1034612.L$5 = byteBuffer9;
                                c1034612.L$6 = byteBuffer10;
                                c1034612.Z$0 = z2;
                                c1034612.label = 3;
                                if (deflateWhile(byteWriteChannel4, deflater5, byteBuffer10, function0, c1034612) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                byteBuffer3 = byteBuffer10;
                                c103461 = c1034612;
                                byteBuffer4 = byteBuffer9;
                                deflater2 = deflater5;
                                crc32 = crc324;
                                objectPool2 = objectPool6;
                            }
                            r14 = byteReadChannel3;
                            z3 = z2;
                            r5 = byteBuffer4;
                            r11 = deflater2;
                            if (r14.isClosedForRead()) {
                                r5.clear();
                                c103461.L$0 = r14;
                                c103461.L$1 = byteWriteChannel4;
                                c103461.L$2 = objectPool2;
                                c103461.L$3 = crc32;
                                c103461.L$4 = r11;
                                c103461.L$5 = r5;
                                c103461.L$6 = byteBuffer3;
                                c103461.Z$0 = z3;
                                c103461.label = 2;
                                Object available = r14.readAvailable(r5, c103461);
                                if (available == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                C103461 c1034613 = c103461;
                                byteBuffer10 = byteBuffer3;
                                obj = available;
                                byteReadChannel3 = r14;
                                objectPool6 = objectPool2;
                                crc324 = crc32;
                                deflater5 = r11;
                                byteBuffer9 = r5;
                                c1034612 = c1034613;
                                z2 = z3;
                                if (((Number) obj).intValue() <= 0) {
                                }
                                r14 = byteReadChannel3;
                                z3 = z2;
                                r5 = byteBuffer4;
                                r11 = deflater2;
                                if (r14.isClosedForRead()) {
                                    Throwable closedCause = r14.getClosedCause();
                                    if (closedCause != null) {
                                        throw closedCause;
                                    }
                                    r11.finish();
                                    Function0<Boolean> function02 = new Function0<Boolean>() { // from class: io.ktor.util.DeflaterKt.deflateTo.4
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function0
                                        @NotNull
                                        public final Boolean invoke() {
                                            return Boolean.valueOf(!r11.finished());
                                        }
                                    };
                                    c103461.L$0 = byteWriteChannel4;
                                    c103461.L$1 = objectPool2;
                                    c103461.L$2 = crc32;
                                    c103461.L$3 = r11;
                                    c103461.L$4 = r5;
                                    c103461.L$5 = byteBuffer3;
                                    c103461.L$6 = null;
                                    c103461.Z$0 = z3;
                                    c103461.label = 4;
                                    if (deflateWhile(byteWriteChannel4, r11, byteBuffer3, function02, c103461) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    crc322 = crc32;
                                    ByteBuffer byteBuffer11 = byteBuffer3;
                                    byteWriteChannel2 = byteWriteChannel4;
                                    z4 = z3 ? 1 : 0;
                                    r1 = byteBuffer11;
                                    r5 = r5;
                                    r11 = r11;
                                    if (z4) {
                                    }
                                    r11.end();
                                    objectPool2.recycle(r5);
                                    objectPool2.recycle(r1);
                                    return Unit.INSTANCE;
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            byteBuffer2 = byteBuffer10;
                            byteBuffer = byteBuffer9;
                            deflater = deflater5;
                            objectPool2 = objectPool6;
                        }
                    } else if (r5 == 3) {
                        z5 = c103461.Z$0;
                        byteBuffer5 = (ByteBuffer) c103461.L$6;
                        ByteBuffer byteBuffer12 = (ByteBuffer) c103461.L$5;
                        Deflater deflater6 = (Deflater) c103461.L$4;
                        crc32 = (CRC32) c103461.L$3;
                        objectPool2 = (ObjectPool) c103461.L$2;
                        byteWriteChannel3 = (ByteWriteChannel) c103461.L$1;
                        byteReadChannel3 = (ByteReadChannel) c103461.L$0;
                        byteBuffer4 = byteBuffer12;
                        deflater2 = deflater6;
                    } else if (r5 == 4) {
                        z4 = c103461.Z$0;
                        ByteBuffer byteBuffer13 = (ByteBuffer) c103461.L$5;
                        ByteBuffer byteBuffer14 = (ByteBuffer) c103461.L$4;
                        Deflater deflater7 = (Deflater) c103461.L$3;
                        crc322 = (CRC32) c103461.L$2;
                        ObjectPool objectPool7 = (ObjectPool) c103461.L$1;
                        ByteWriteChannel byteWriteChannel6 = (ByteWriteChannel) c103461.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            objectPool2 = objectPool7;
                            byteWriteChannel2 = byteWriteChannel6;
                            r11 = deflater7;
                            r1 = byteBuffer13;
                            r5 = byteBuffer14;
                            if (z4) {
                                c103461.L$0 = objectPool2;
                                c103461.L$1 = r11;
                                c103461.L$2 = r5;
                                c103461.L$3 = r1;
                                c103461.L$4 = null;
                                c103461.L$5 = null;
                                c103461.label = 5;
                                if (putGzipTrailer(byteWriteChannel2, crc322, r11, c103461) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                byteBuffer = r5;
                                deflater = r11;
                                objectPool4 = objectPool2;
                                r1 = r1;
                                objectPool2 = objectPool4;
                                r11 = deflater;
                                r5 = byteBuffer;
                            }
                            r11.end();
                            objectPool2.recycle(r5);
                            objectPool2.recycle(r1);
                            return Unit.INSTANCE;
                        } catch (Throwable th4) {
                            th = th4;
                            byteBuffer = byteBuffer14;
                            deflater = deflater7;
                            objectPool2 = objectPool7;
                            byteBuffer2 = byteBuffer13;
                        }
                    } else {
                        if (r5 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ByteBuffer byteBuffer15 = (ByteBuffer) c103461.L$3;
                        byteBuffer = (ByteBuffer) c103461.L$2;
                        deflater = (Deflater) c103461.L$1;
                        objectPool4 = (ObjectPool) c103461.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            r1 = byteBuffer15;
                            objectPool2 = objectPool4;
                            r11 = deflater;
                            r5 = byteBuffer;
                            r11.end();
                            objectPool2.recycle(r5);
                            objectPool2.recycle(r1);
                            return Unit.INSTANCE;
                        } catch (Throwable th5) {
                            th = th5;
                            objectPool2 = objectPool4;
                            byteBuffer2 = byteBuffer15;
                        }
                    }
                    if (r14.isClosedForRead()) {
                    }
                } catch (Throwable th6) {
                    th = th6;
                    r1 = byteBuffer3;
                    byteBuffer = r5;
                    deflater = r11;
                    byteBuffer2 = r1;
                    deflater.end();
                    objectPool2.recycle(byteBuffer);
                    objectPool2.recycle(byteBuffer2);
                    throw th;
                }
                ResultKt.throwOnFailure(obj);
                byteBuffer3 = byteBuffer5;
                z2 = z5;
                byteWriteChannel4 = byteWriteChannel3;
                r14 = byteReadChannel3;
                z3 = z2;
                r5 = byteBuffer4;
                r11 = deflater2;
            }
        } catch (Throwable th7) {
            th = th7;
        }
        deflater.end();
        objectPool2.recycle(byteBuffer);
        objectPool2.recycle(byteBuffer2);
        throw th;
    }

    public static /* synthetic */ Object deflateTo$default(ByteReadChannel byteReadChannel, ByteWriteChannel byteWriteChannel, boolean z, ObjectPool objectPool, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            objectPool = ByteBufferPoolKt.getKtorDefaultPool();
        }
        return deflateTo(byteReadChannel, byteWriteChannel, z, objectPool, continuation);
    }

    public static /* synthetic */ ByteReadChannel deflated$default(ByteReadChannel byteReadChannel, boolean z, ObjectPool objectPool, CoroutineContext coroutineContext, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            objectPool = ByteBufferPoolKt.getKtorDefaultPool();
        }
        if ((i & 4) != 0) {
            coroutineContext = Dispatchers.getUnconfined();
        }
        return deflated(byteReadChannel, z, (ObjectPool<ByteBuffer>) objectPool, coroutineContext);
    }

    /* compiled from: Deflater.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lio/ktor/utils/io/WriterScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.util.DeflaterKt$deflated$1", m7120f = "Deflater.kt", m7121i = {}, m7122l = {110}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: io.ktor.util.DeflaterKt$deflated$1 */
    public static final class C103501 extends SuspendLambda implements Function2<WriterScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ boolean $gzip;
        public final /* synthetic */ ObjectPool<ByteBuffer> $pool;
        public final /* synthetic */ ByteReadChannel $this_deflated;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103501(ByteReadChannel byteReadChannel, boolean z, ObjectPool<ByteBuffer> objectPool, Continuation<? super C103501> continuation) {
            super(2, continuation);
            this.$this_deflated = byteReadChannel;
            this.$gzip = z;
            this.$pool = objectPool;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C103501 c103501 = new C103501(this.$this_deflated, this.$gzip, this.$pool, continuation);
            c103501.L$0 = obj;
            return c103501;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull WriterScope writerScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C103501) create(writerScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                WriterScope writerScope = (WriterScope) this.L$0;
                ByteReadChannel byteReadChannel = this.$this_deflated;
                ByteWriteChannel channel = writerScope.getChannel();
                boolean z = this.$gzip;
                ObjectPool<ByteBuffer> objectPool = this.$pool;
                this.label = 1;
                if (DeflaterKt.deflateTo(byteReadChannel, channel, z, objectPool, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public static final ByteReadChannel deflated(@NotNull ByteReadChannel byteReadChannel, boolean z, @NotNull ObjectPool<ByteBuffer> pool, @NotNull CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(byteReadChannel, "<this>");
        Intrinsics.checkNotNullParameter(pool, "pool");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        return CoroutinesKt.writer((CoroutineScope) GlobalScope.INSTANCE, coroutineContext, true, (Function2<? super WriterScope, ? super Continuation<? super Unit>, ? extends Object>) new C103501(byteReadChannel, z, pool, null)).getChannel();
    }

    public static /* synthetic */ ByteWriteChannel deflated$default(ByteWriteChannel byteWriteChannel, boolean z, ObjectPool objectPool, CoroutineContext coroutineContext, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            objectPool = ByteBufferPoolKt.getKtorDefaultPool();
        }
        if ((i & 4) != 0) {
            coroutineContext = Dispatchers.getUnconfined();
        }
        return deflated(byteWriteChannel, z, (ObjectPool<ByteBuffer>) objectPool, coroutineContext);
    }

    /* compiled from: Deflater.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lio/ktor/utils/io/ReaderScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.util.DeflaterKt$deflated$2", m7120f = "Deflater.kt", m7121i = {}, m7122l = {123}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: io.ktor.util.DeflaterKt$deflated$2 */
    public static final class C103512 extends SuspendLambda implements Function2<ReaderScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ boolean $gzip;
        public final /* synthetic */ ObjectPool<ByteBuffer> $pool;
        public final /* synthetic */ ByteWriteChannel $this_deflated;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103512(ByteWriteChannel byteWriteChannel, boolean z, ObjectPool<ByteBuffer> objectPool, Continuation<? super C103512> continuation) {
            super(2, continuation);
            this.$this_deflated = byteWriteChannel;
            this.$gzip = z;
            this.$pool = objectPool;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C103512 c103512 = new C103512(this.$this_deflated, this.$gzip, this.$pool, continuation);
            c103512.L$0 = obj;
            return c103512;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull ReaderScope readerScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C103512) create(readerScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ByteReadChannel channel = ((ReaderScope) this.L$0).getChannel();
                ByteWriteChannel byteWriteChannel = this.$this_deflated;
                boolean z = this.$gzip;
                ObjectPool<ByteBuffer> objectPool = this.$pool;
                this.label = 1;
                if (DeflaterKt.deflateTo(channel, byteWriteChannel, z, objectPool, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public static final ByteWriteChannel deflated(@NotNull ByteWriteChannel byteWriteChannel, boolean z, @NotNull ObjectPool<ByteBuffer> pool, @NotNull CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(byteWriteChannel, "<this>");
        Intrinsics.checkNotNullParameter(pool, "pool");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        return CoroutinesKt.reader((CoroutineScope) GlobalScope.INSTANCE, coroutineContext, true, (Function2<? super ReaderScope, ? super Continuation<? super Unit>, ? extends Object>) new C103512(byteWriteChannel, z, pool, null)).getChannel();
    }
}
