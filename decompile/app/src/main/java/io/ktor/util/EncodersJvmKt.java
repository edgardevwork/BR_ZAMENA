package io.ktor.util;

import androidx.media3.extractor.mkv.MatroskaExtractor;
import io.ktor.util.cio.ByteBufferPoolKt;
import io.ktor.utils.p050io.ByteReadChannel;
import io.ktor.utils.p050io.ByteWriteChannel;
import io.ktor.utils.p050io.CoroutinesKt;
import io.ktor.utils.p050io.WriterScope;
import io.ktor.utils.p050io.core.ByteReadPacket;
import io.ktor.utils.p050io.core.InputKt;
import io.ktor.utils.p050io.core.InputLittleEndianKt;
import io.ktor.utils.p050io.pool.ObjectPool;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.zip.CRC32;
import java.util.zip.Checksum;
import java.util.zip.Inflater;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: EncodersJvm.kt */
@Metadata(m7104d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\b\u001a\u00020\t*\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H\u0082\u0004\u001a\u001e\u0010\u000b\u001a\u00020\f*\u00020\r2\u0006\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\tH\u0002\u001a-\u0010\u0010\u001a\u00020\u0005*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0018\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000\"\u0011\u0010\u0006\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0003\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, m7105d2 = {"Deflate", "Lio/ktor/util/Encoder;", "getDeflate", "()Lio/ktor/util/Encoder;", "GZIP_HEADER_SIZE", "", "GZip", "getGZip", "has", "", "flag", "inflate", "Lio/ktor/utils/io/ByteReadChannel;", "Lkotlinx/coroutines/CoroutineScope;", "source", "gzip", "inflateTo", "Ljava/util/zip/Inflater;", "channel", "Lio/ktor/utils/io/ByteWriteChannel;", "buffer", "Ljava/nio/ByteBuffer;", "checksum", "Ljava/util/zip/Checksum;", "(Ljava/util/zip/Inflater;Lio/ktor/utils/io/ByteWriteChannel;Ljava/nio/ByteBuffer;Ljava/util/zip/Checksum;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ktor-utils"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public final class EncodersJvmKt {
    public static final int GZIP_HEADER_SIZE = 10;

    @NotNull
    public static final Encoder Deflate = new Encoder() { // from class: io.ktor.util.EncodersJvmKt$Deflate$1
        @Override // io.ktor.util.Encoder
        @NotNull
        public ByteReadChannel encode(@NotNull CoroutineScope coroutineScope, @NotNull ByteReadChannel source) {
            Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
            Intrinsics.checkNotNullParameter(source, "source");
            return DeflaterKt.deflated$default(source, true, (ObjectPool) null, coroutineScope.getCoroutineContext(), 2, (Object) null);
        }

        @Override // io.ktor.util.Encoder
        @NotNull
        public ByteReadChannel decode(@NotNull CoroutineScope coroutineScope, @NotNull ByteReadChannel source) {
            Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
            Intrinsics.checkNotNullParameter(source, "source");
            return EncodersJvmKt.inflate(coroutineScope, source, false);
        }
    };

    @NotNull
    public static final Encoder GZip = new Encoder() { // from class: io.ktor.util.EncodersJvmKt$GZip$1
        @Override // io.ktor.util.Encoder
        @NotNull
        public ByteReadChannel encode(@NotNull CoroutineScope coroutineScope, @NotNull ByteReadChannel source) {
            Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
            Intrinsics.checkNotNullParameter(source, "source");
            return DeflaterKt.deflated$default(source, true, (ObjectPool) null, coroutineScope.getCoroutineContext(), 2, (Object) null);
        }

        @Override // io.ktor.util.Encoder
        @NotNull
        public ByteReadChannel decode(@NotNull CoroutineScope coroutineScope, @NotNull ByteReadChannel source) {
            Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
            Intrinsics.checkNotNullParameter(source, "source");
            return EncodersJvmKt.inflate$default(coroutineScope, source, false, 2, null);
        }
    };

    /* compiled from: EncodersJvm.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.util.EncodersJvmKt", m7120f = "EncodersJvm.kt", m7121i = {0}, m7122l = {157}, m7123m = "inflateTo", m7124n = {"inflated"}, m7125s = {"I$0"})
    /* renamed from: io.ktor.util.EncodersJvmKt$inflateTo$1 */
    /* loaded from: classes5.dex */
    public static final class C103561 extends ContinuationImpl {
        public int I$0;
        public int label;
        public /* synthetic */ Object result;

        public C103561(Continuation<? super C103561> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EncodersJvmKt.inflateTo(null, null, null, null, this);
        }
    }

    public static final boolean has(int i, int i2) {
        return (i & i2) != 0;
    }

    @NotNull
    public static final Encoder getDeflate() {
        return Deflate;
    }

    @NotNull
    public static final Encoder getGZip() {
        return GZip;
    }

    public static /* synthetic */ ByteReadChannel inflate$default(CoroutineScope coroutineScope, ByteReadChannel byteReadChannel, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return inflate(coroutineScope, byteReadChannel, z);
    }

    /* compiled from: EncodersJvm.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lio/ktor/utils/io/WriterScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.util.EncodersJvmKt$inflate$1", m7120f = "EncodersJvm.kt", m7121i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6}, m7122l = {68, 85, MatroskaExtractor.ID_BLOCK, 164, 103, 109, 121}, m7123m = "invokeSuspend", m7124n = {"$this$writer", "readBuffer", "writeBuffer", "inflater", "checksum", "$this$writer", "readBuffer", "writeBuffer", "inflater", "checksum", "magic", "format", "flags", "$this$writer", "readBuffer", "writeBuffer", "inflater", "checksum", "magic", "format", "flags", "extraLen", "$this$writer", "readBuffer", "writeBuffer", "inflater", "checksum", "n$iv", "$this$writer", "readBuffer", "writeBuffer", "inflater", "checksum", "totalSize", "$this$writer", "readBuffer", "writeBuffer", "inflater", "checksum", "totalSize", "$this$writer", "readBuffer", "writeBuffer", "inflater", "checksum", "totalSize"}, m7125s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "S$0", "B$0", "B$1", "L$0", "L$1", "L$2", "L$3", "L$4", "S$0", "B$0", "B$1", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"})
    @SourceDebugExtension({"SMAP\nEncodersJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EncodersJvm.kt\nio/ktor/util/EncodersJvmKt$inflate$1\n+ 2 ByteReadChannel.kt\nio/ktor/utils/io/ByteReadChannelKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,160:1\n232#2,2:161\n232#2,2:164\n1#3:163\n*S KotlinDebug\n*F\n+ 1 EncodersJvm.kt\nio/ktor/util/EncodersJvmKt$inflate$1\n*L\n86#1:161,2\n96#1:164,2\n*E\n"})
    /* renamed from: io.ktor.util.EncodersJvmKt$inflate$1 */
    public static final class C103551 extends SuspendLambda implements Function2<WriterScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ boolean $gzip;
        public final /* synthetic */ ByteReadChannel $source;
        public byte B$0;
        public byte B$1;
        public int I$0;
        public long J$0;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public short S$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103551(boolean z, ByteReadChannel byteReadChannel, Continuation<? super C103551> continuation) {
            super(2, continuation);
            this.$gzip = z;
            this.$source = byteReadChannel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C103551 c103551 = new C103551(this.$gzip, this.$source, continuation);
            c103551.L$0 = obj;
            return c103551;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull WriterScope writerScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C103551) create(writerScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:101:0x0384 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:7:0x0037, B:100:0x036c, B:94:0x0344, B:96:0x034a, B:101:0x0384, B:103:0x0388, B:105:0x0390, B:107:0x03ae, B:110:0x03b3, B:111:0x03d7, B:112:0x03d8, B:113:0x03e3, B:114:0x03e4, B:115:0x0407, B:116:0x0408, B:121:0x0424, B:122:0x042f, B:12:0x0061, B:89:0x0318, B:81:0x02e7, B:83:0x02ed, B:85:0x02f3, B:90:0x0331, B:73:0x02aa, B:75:0x02b2, B:78:0x02cd, B:80:0x02d5, B:91:0x0336, B:93:0x033e, B:123:0x0430, B:15:0x0083), top: B:130:0x000e }] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0169  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x01ae A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x01af  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x01bf  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x01c5  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x01dd  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x01e5  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0227  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x022c  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x027f  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x02b2 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:7:0x0037, B:100:0x036c, B:94:0x0344, B:96:0x034a, B:101:0x0384, B:103:0x0388, B:105:0x0390, B:107:0x03ae, B:110:0x03b3, B:111:0x03d7, B:112:0x03d8, B:113:0x03e3, B:114:0x03e4, B:115:0x0407, B:116:0x0408, B:121:0x0424, B:122:0x042f, B:12:0x0061, B:89:0x0318, B:81:0x02e7, B:83:0x02ed, B:85:0x02f3, B:90:0x0331, B:73:0x02aa, B:75:0x02b2, B:78:0x02cd, B:80:0x02d5, B:91:0x0336, B:93:0x033e, B:123:0x0430, B:15:0x0083), top: B:130:0x000e }] */
        /* JADX WARN: Removed duplicated region for block: B:80:0x02d5 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:7:0x0037, B:100:0x036c, B:94:0x0344, B:96:0x034a, B:101:0x0384, B:103:0x0388, B:105:0x0390, B:107:0x03ae, B:110:0x03b3, B:111:0x03d7, B:112:0x03d8, B:113:0x03e3, B:114:0x03e4, B:115:0x0407, B:116:0x0408, B:121:0x0424, B:122:0x042f, B:12:0x0061, B:89:0x0318, B:81:0x02e7, B:83:0x02ed, B:85:0x02f3, B:90:0x0331, B:73:0x02aa, B:75:0x02b2, B:78:0x02cd, B:80:0x02d5, B:91:0x0336, B:93:0x033e, B:123:0x0430, B:15:0x0083), top: B:130:0x000e }] */
        /* JADX WARN: Removed duplicated region for block: B:83:0x02ed A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:7:0x0037, B:100:0x036c, B:94:0x0344, B:96:0x034a, B:101:0x0384, B:103:0x0388, B:105:0x0390, B:107:0x03ae, B:110:0x03b3, B:111:0x03d7, B:112:0x03d8, B:113:0x03e3, B:114:0x03e4, B:115:0x0407, B:116:0x0408, B:121:0x0424, B:122:0x042f, B:12:0x0061, B:89:0x0318, B:81:0x02e7, B:83:0x02ed, B:85:0x02f3, B:90:0x0331, B:73:0x02aa, B:75:0x02b2, B:78:0x02cd, B:80:0x02d5, B:91:0x0336, B:93:0x033e, B:123:0x0430, B:15:0x0083), top: B:130:0x000e }] */
        /* JADX WARN: Removed duplicated region for block: B:91:0x0336 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:7:0x0037, B:100:0x036c, B:94:0x0344, B:96:0x034a, B:101:0x0384, B:103:0x0388, B:105:0x0390, B:107:0x03ae, B:110:0x03b3, B:111:0x03d7, B:112:0x03d8, B:113:0x03e3, B:114:0x03e4, B:115:0x0407, B:116:0x0408, B:121:0x0424, B:122:0x042f, B:12:0x0061, B:89:0x0318, B:81:0x02e7, B:83:0x02ed, B:85:0x02f3, B:90:0x0331, B:73:0x02aa, B:75:0x02b2, B:78:0x02cd, B:80:0x02d5, B:91:0x0336, B:93:0x033e, B:123:0x0430, B:15:0x0083), top: B:130:0x000e }] */
        /* JADX WARN: Removed duplicated region for block: B:96:0x034a A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:7:0x0037, B:100:0x036c, B:94:0x0344, B:96:0x034a, B:101:0x0384, B:103:0x0388, B:105:0x0390, B:107:0x03ae, B:110:0x03b3, B:111:0x03d7, B:112:0x03d8, B:113:0x03e3, B:114:0x03e4, B:115:0x0407, B:116:0x0408, B:121:0x0424, B:122:0x042f, B:12:0x0061, B:89:0x0318, B:81:0x02e7, B:83:0x02ed, B:85:0x02f3, B:90:0x0331, B:73:0x02aa, B:75:0x02b2, B:78:0x02cd, B:80:0x02d5, B:91:0x0336, B:93:0x033e, B:123:0x0430, B:15:0x0083), top: B:130:0x000e }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x02d3 -> B:73:0x02aa). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x02d5 -> B:81:0x02e7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:88:0x0313 -> B:89:0x0318). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:99:0x036a -> B:100:0x036c). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            WriterScope writerScope;
            ByteBuffer byteBufferBorrow;
            ByteBuffer byteBufferBorrow2;
            Inflater inflater;
            CRC32 crc32;
            ByteBuffer byteBuffer;
            ByteBuffer byteBuffer2;
            Inflater inflater2;
            Object packet;
            short shortLittleEndian;
            byte b;
            byte b2;
            Inflater inflater3;
            WriterScope writerScope2;
            Object obj2;
            ByteBuffer byteBuffer3;
            CRC32 crc322;
            byte b3;
            Inflater inflater4;
            Object objDiscard;
            CRC32 crc323;
            long j;
            byte b4;
            long j2;
            Object objDiscard2;
            WriterScope writerScope3;
            ByteBuffer byteBuffer4;
            WriterScope writerScope4;
            ByteBuffer byteBuffer5;
            ByteBuffer byteBuffer6;
            CRC32 crc324;
            Ref.IntRef intRef;
            Object available;
            CRC32 crc325;
            WriterScope writerScope5;
            Ref.IntRef intRef2;
            Object objInflateTo;
            WriterScope writerScope6;
            Ref.IntRef intRef3;
            int i;
            CRC32 crc326;
            Ref.IntRef intRef4;
            int i2;
            Object objInflateTo2;
            CRC32 crc327;
            Ref.IntRef intRef5;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            try {
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        writerScope = (WriterScope) this.L$0;
                        byteBufferBorrow = ByteBufferPoolKt.getKtorDefaultPool().borrow();
                        byteBufferBorrow2 = ByteBufferPoolKt.getKtorDefaultPool().borrow();
                        inflater = new Inflater(true);
                        crc32 = new CRC32();
                        if (this.$gzip) {
                            ByteReadChannel byteReadChannel = this.$source;
                            this.L$0 = writerScope;
                            this.L$1 = byteBufferBorrow;
                            this.L$2 = byteBufferBorrow2;
                            this.L$3 = inflater;
                            this.L$4 = crc32;
                            this.label = 1;
                            packet = byteReadChannel.readPacket(10, this);
                            if (packet == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            ByteReadPacket byteReadPacket = (ByteReadPacket) packet;
                            shortLittleEndian = InputLittleEndianKt.readShortLittleEndian(byteReadPacket);
                            b = byteReadPacket.readByte();
                            b2 = byteReadPacket.readByte();
                            InputKt.discard(byteReadPacket);
                            if ((b2 & 4) == 0) {
                                ByteReadChannel byteReadChannel2 = this.$source;
                                this.L$0 = writerScope;
                                this.L$1 = byteBufferBorrow;
                                this.L$2 = byteBufferBorrow2;
                                this.L$3 = inflater;
                                this.L$4 = crc32;
                                this.S$0 = shortLittleEndian;
                                this.B$0 = b;
                                this.B$1 = b2;
                                this.label = 2;
                                obj2 = byteReadChannel2.readShort(this);
                                if (obj2 == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                byteBuffer3 = byteBufferBorrow2;
                                byteBuffer2 = byteBufferBorrow;
                                crc322 = crc32;
                                b3 = b2;
                                inflater4 = inflater;
                                writerScope2 = writerScope;
                                long jShortValue = ((Number) obj2).shortValue();
                                ByteReadChannel byteReadChannel3 = this.$source;
                                this.L$0 = writerScope2;
                                this.L$1 = byteBuffer2;
                                this.L$2 = byteBuffer3;
                                this.L$3 = inflater4;
                                this.L$4 = crc322;
                                this.S$0 = shortLittleEndian;
                                this.B$0 = b;
                                this.B$1 = b3;
                                this.J$0 = jShortValue;
                                this.label = 3;
                                objDiscard = byteReadChannel3.discard(jShortValue, this);
                                if (objDiscard != coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                byte b5 = b;
                                crc323 = crc322;
                                j = jShortValue;
                                b4 = b5;
                                if (((Number) objDiscard).longValue() == j) {
                                    throw new EOFException("Unable to discard " + j + " bytes");
                                }
                                inflater3 = inflater4;
                                b2 = b3;
                                crc32 = crc323;
                                b = b4;
                                byteBuffer = byteBuffer3;
                                if (shortLittleEndian == -29921) {
                                    throw new IllegalStateException(("GZIP magic invalid: " + ((int) shortLittleEndian)).toString());
                                }
                                if (b == 8) {
                                    if (!EncodersJvmKt.has(b2, 8)) {
                                        if (!EncodersJvmKt.has(b2, 16)) {
                                            if (EncodersJvmKt.has(b2, 2)) {
                                                ByteReadChannel byteReadChannel4 = this.$source;
                                                this.L$0 = writerScope2;
                                                this.L$1 = byteBuffer2;
                                                this.L$2 = byteBuffer;
                                                this.L$3 = inflater3;
                                                this.L$4 = crc32;
                                                j2 = 2;
                                                this.J$0 = 2L;
                                                this.label = 4;
                                                objDiscard2 = byteReadChannel4.discard(2L, this);
                                                if (objDiscard2 == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                writerScope3 = writerScope2;
                                                byteBuffer4 = byteBuffer2;
                                                if (((Number) objDiscard2).longValue() == j2) {
                                                    throw new EOFException("Unable to discard " + j2 + " bytes");
                                                }
                                                inflater2 = inflater3;
                                                byteBuffer2 = byteBuffer4;
                                                writerScope = writerScope3;
                                                try {
                                                    writerScope4 = writerScope;
                                                    byteBuffer5 = byteBuffer;
                                                    byteBuffer6 = byteBuffer2;
                                                    crc324 = crc32;
                                                    intRef = new Ref.IntRef();
                                                    if (this.$source.isClosedForRead()) {
                                                        ByteReadChannel byteReadChannel5 = this.$source;
                                                        this.L$0 = writerScope4;
                                                        this.L$1 = byteBuffer6;
                                                        this.L$2 = byteBuffer5;
                                                        this.L$3 = inflater2;
                                                        this.L$4 = crc324;
                                                        this.L$5 = intRef;
                                                        this.L$6 = null;
                                                        this.label = 5;
                                                        available = byteReadChannel5.readAvailable(byteBuffer6, this);
                                                        if (available == coroutine_suspended) {
                                                            return coroutine_suspended;
                                                        }
                                                        if (((Number) available).intValue() > 0) {
                                                            byteBuffer6.flip();
                                                            inflater2.setInput(byteBuffer6.array(), byteBuffer6.position(), byteBuffer6.remaining());
                                                            if (inflater2.needsInput() && !inflater2.finished()) {
                                                                int i3 = intRef.element;
                                                                ByteWriteChannel channel = writerScope4.getChannel();
                                                                this.L$0 = writerScope4;
                                                                this.L$1 = byteBuffer6;
                                                                this.L$2 = byteBuffer5;
                                                                this.L$3 = inflater2;
                                                                this.L$4 = crc324;
                                                                this.L$5 = intRef;
                                                                this.L$6 = intRef;
                                                                this.I$0 = i3;
                                                                this.label = 6;
                                                                objInflateTo = EncodersJvmKt.inflateTo(inflater2, channel, byteBuffer5, crc324, this);
                                                                if (objInflateTo == coroutine_suspended) {
                                                                    return coroutine_suspended;
                                                                }
                                                                writerScope6 = writerScope4;
                                                                intRef3 = intRef;
                                                                i = i3;
                                                                crc326 = crc324;
                                                                intRef4 = intRef3;
                                                                intRef4.element = i + ((Number) objInflateTo).intValue();
                                                                byteBuffer6.position(byteBuffer6.limit() - inflater2.getRemaining());
                                                                intRef = intRef3;
                                                                crc324 = crc326;
                                                                writerScope4 = writerScope6;
                                                                if (inflater2.needsInput()) {
                                                                }
                                                                byteBuffer6.compact();
                                                            } else {
                                                                byteBuffer6.compact();
                                                            }
                                                        }
                                                        if (this.$source.isClosedForRead()) {
                                                            Throwable closedCause = this.$source.getClosedCause();
                                                            if (closedCause != null) {
                                                                throw closedCause;
                                                            }
                                                            byteBuffer6.flip();
                                                            crc325 = crc324;
                                                            writerScope5 = writerScope4;
                                                            intRef2 = intRef;
                                                            if (!inflater2.finished()) {
                                                                i2 = intRef2.element;
                                                                ByteWriteChannel channel2 = writerScope5.getChannel();
                                                                this.L$0 = writerScope5;
                                                                this.L$1 = byteBuffer6;
                                                                this.L$2 = byteBuffer5;
                                                                this.L$3 = inflater2;
                                                                this.L$4 = crc325;
                                                                this.L$5 = intRef2;
                                                                this.L$6 = intRef2;
                                                                this.I$0 = i2;
                                                                this.label = 7;
                                                                objInflateTo2 = EncodersJvmKt.inflateTo(inflater2, channel2, byteBuffer5, crc325, this);
                                                                if (objInflateTo2 == coroutine_suspended) {
                                                                    return coroutine_suspended;
                                                                }
                                                                crc327 = crc325;
                                                                intRef5 = intRef2;
                                                                intRef2.element = i2 + ((Number) objInflateTo2).intValue();
                                                                byteBuffer6.position(byteBuffer6.limit() - inflater2.getRemaining());
                                                                intRef2 = intRef5;
                                                                crc325 = crc327;
                                                                if (!inflater2.finished()) {
                                                                    if (this.$gzip) {
                                                                        if (byteBuffer6.remaining() != 8) {
                                                                            throw new IllegalStateException(("Expected 8 bytes in the trailer. Actual: " + byteBuffer6.remaining() + " $").toString());
                                                                        }
                                                                        byteBuffer6.order(ByteOrder.LITTLE_ENDIAN);
                                                                        int i4 = byteBuffer6.getInt(byteBuffer6.position());
                                                                        int i5 = byteBuffer6.getInt(byteBuffer6.position() + 4);
                                                                        if (((int) crc325.getValue()) != i4) {
                                                                            throw new IllegalStateException("Gzip checksum invalid.".toString());
                                                                        }
                                                                        if (intRef2.element != i5) {
                                                                            throw new IllegalStateException(("Gzip size invalid. Expected " + i5 + ", actual " + intRef2.element).toString());
                                                                        }
                                                                    } else if (!(!byteBuffer6.hasRemaining())) {
                                                                        throw new IllegalStateException("Check failed.".toString());
                                                                    }
                                                                    inflater2.end();
                                                                    ByteBufferPoolKt.getKtorDefaultPool().recycle(byteBuffer6);
                                                                    ByteBufferPoolKt.getKtorDefaultPool().recycle(byteBuffer5);
                                                                    return Unit.INSTANCE;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable th) {
                                                    th = th;
                                                    ByteBuffer byteBuffer7 = byteBuffer;
                                                    ByteBuffer byteBuffer8 = byteBuffer2;
                                                    try {
                                                        throw th;
                                                    } catch (Throwable th2) {
                                                        inflater2.end();
                                                        ByteBufferPoolKt.getKtorDefaultPool().recycle(byteBuffer8);
                                                        ByteBufferPoolKt.getKtorDefaultPool().recycle(byteBuffer7);
                                                        throw th2;
                                                    }
                                                }
                                            } else {
                                                inflater2 = inflater3;
                                                writerScope = writerScope2;
                                                writerScope4 = writerScope;
                                                byteBuffer5 = byteBuffer;
                                                byteBuffer6 = byteBuffer2;
                                                crc324 = crc32;
                                                intRef = new Ref.IntRef();
                                                if (this.$source.isClosedForRead()) {
                                                }
                                            }
                                        } else {
                                            throw new IllegalStateException("Gzip file comment not supported".toString());
                                        }
                                    } else {
                                        throw new IllegalStateException("Gzip file name not supported".toString());
                                    }
                                } else {
                                    throw new IllegalStateException(("Deflater method unsupported: " + ((int) b) + '.').toString());
                                }
                            } else {
                                inflater3 = inflater;
                                byteBuffer = byteBufferBorrow2;
                                byteBuffer2 = byteBufferBorrow;
                                writerScope2 = writerScope;
                                if (shortLittleEndian == -29921) {
                                }
                            }
                        } else {
                            byteBuffer = byteBufferBorrow2;
                            byteBuffer2 = byteBufferBorrow;
                            inflater2 = inflater;
                            writerScope4 = writerScope;
                            byteBuffer5 = byteBuffer;
                            byteBuffer6 = byteBuffer2;
                            crc324 = crc32;
                            intRef = new Ref.IntRef();
                            if (this.$source.isClosedForRead()) {
                            }
                        }
                    case 1:
                        crc32 = (CRC32) this.L$4;
                        inflater = (Inflater) this.L$3;
                        byteBufferBorrow2 = (ByteBuffer) this.L$2;
                        byteBufferBorrow = (ByteBuffer) this.L$1;
                        writerScope = (WriterScope) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        packet = obj;
                        ByteReadPacket byteReadPacket2 = (ByteReadPacket) packet;
                        shortLittleEndian = InputLittleEndianKt.readShortLittleEndian(byteReadPacket2);
                        b = byteReadPacket2.readByte();
                        b2 = byteReadPacket2.readByte();
                        InputKt.discard(byteReadPacket2);
                        if ((b2 & 4) == 0) {
                        }
                        break;
                    case 2:
                        b3 = this.B$1;
                        byte b6 = this.B$0;
                        short s = this.S$0;
                        crc322 = (CRC32) this.L$4;
                        Inflater inflater5 = (Inflater) this.L$3;
                        ByteBuffer byteBuffer9 = (ByteBuffer) this.L$2;
                        ByteBuffer byteBuffer10 = (ByteBuffer) this.L$1;
                        WriterScope writerScope7 = (WriterScope) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        inflater4 = inflater5;
                        byteBuffer3 = byteBuffer9;
                        obj2 = obj;
                        b = b6;
                        writerScope2 = writerScope7;
                        shortLittleEndian = s;
                        byteBuffer2 = byteBuffer10;
                        long jShortValue2 = ((Number) obj2).shortValue();
                        ByteReadChannel byteReadChannel32 = this.$source;
                        this.L$0 = writerScope2;
                        this.L$1 = byteBuffer2;
                        this.L$2 = byteBuffer3;
                        this.L$3 = inflater4;
                        this.L$4 = crc322;
                        this.S$0 = shortLittleEndian;
                        this.B$0 = b;
                        this.B$1 = b3;
                        this.J$0 = jShortValue2;
                        this.label = 3;
                        objDiscard = byteReadChannel32.discard(jShortValue2, this);
                        if (objDiscard != coroutine_suspended) {
                        }
                        break;
                    case 3:
                        j = this.J$0;
                        b3 = this.B$1;
                        b4 = this.B$0;
                        shortLittleEndian = this.S$0;
                        crc323 = (CRC32) this.L$4;
                        inflater4 = (Inflater) this.L$3;
                        byteBuffer3 = (ByteBuffer) this.L$2;
                        byteBuffer2 = (ByteBuffer) this.L$1;
                        writerScope2 = (WriterScope) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        objDiscard = obj;
                        if (((Number) objDiscard).longValue() == j) {
                        }
                        break;
                    case 4:
                        j2 = this.J$0;
                        crc32 = (CRC32) this.L$4;
                        inflater3 = (Inflater) this.L$3;
                        byteBuffer = (ByteBuffer) this.L$2;
                        byteBuffer4 = (ByteBuffer) this.L$1;
                        writerScope3 = (WriterScope) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        objDiscard2 = obj;
                        if (((Number) objDiscard2).longValue() == j2) {
                        }
                        break;
                    case 5:
                        intRef = (Ref.IntRef) this.L$5;
                        crc324 = (CRC32) this.L$4;
                        inflater2 = (Inflater) this.L$3;
                        byteBuffer5 = (ByteBuffer) this.L$2;
                        byteBuffer6 = (ByteBuffer) this.L$1;
                        writerScope4 = (WriterScope) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        available = obj;
                        if (((Number) available).intValue() > 0) {
                        }
                        if (this.$source.isClosedForRead()) {
                        }
                        break;
                    case 6:
                        i = this.I$0;
                        intRef4 = (Ref.IntRef) this.L$6;
                        intRef3 = (Ref.IntRef) this.L$5;
                        crc326 = (CRC32) this.L$4;
                        inflater2 = (Inflater) this.L$3;
                        byteBuffer5 = (ByteBuffer) this.L$2;
                        byteBuffer6 = (ByteBuffer) this.L$1;
                        writerScope6 = (WriterScope) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        objInflateTo = obj;
                        intRef4.element = i + ((Number) objInflateTo).intValue();
                        byteBuffer6.position(byteBuffer6.limit() - inflater2.getRemaining());
                        intRef = intRef3;
                        crc324 = crc326;
                        writerScope4 = writerScope6;
                        if (inflater2.needsInput()) {
                        }
                        byteBuffer6.compact();
                        if (this.$source.isClosedForRead()) {
                        }
                        break;
                    case 7:
                        i2 = this.I$0;
                        intRef2 = (Ref.IntRef) this.L$6;
                        Ref.IntRef intRef6 = (Ref.IntRef) this.L$5;
                        CRC32 crc328 = (CRC32) this.L$4;
                        inflater2 = (Inflater) this.L$3;
                        byteBuffer5 = (ByteBuffer) this.L$2;
                        byteBuffer6 = (ByteBuffer) this.L$1;
                        writerScope5 = (WriterScope) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        crc327 = crc328;
                        intRef5 = intRef6;
                        objInflateTo2 = obj;
                        intRef2.element = i2 + ((Number) objInflateTo2).intValue();
                        byteBuffer6.position(byteBuffer6.limit() - inflater2.getRemaining());
                        intRef2 = intRef5;
                        crc325 = crc327;
                        if (!inflater2.finished()) {
                        }
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    public static final ByteReadChannel inflate(CoroutineScope coroutineScope, ByteReadChannel byteReadChannel, boolean z) {
        return CoroutinesKt.writer$default(coroutineScope, (CoroutineContext) null, false, (Function2) new C103551(z, byteReadChannel, null), 3, (Object) null).getChannel();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object inflateTo(Inflater inflater, ByteWriteChannel byteWriteChannel, ByteBuffer byteBuffer, Checksum checksum, Continuation<? super Integer> continuation) throws Throwable {
        C103561 c103561;
        int iInflate;
        if (continuation instanceof C103561) {
            c103561 = (C103561) continuation;
            int i = c103561.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c103561.label = i - Integer.MIN_VALUE;
            } else {
                c103561 = new C103561(continuation);
            }
        }
        Object obj = c103561.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c103561.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            byteBuffer.clear();
            iInflate = inflater.inflate(byteBuffer.array(), byteBuffer.position(), byteBuffer.remaining());
            byteBuffer.position(byteBuffer.position() + iInflate);
            byteBuffer.flip();
            DeflaterKt.updateKeepPosition(checksum, byteBuffer);
            c103561.I$0 = iInflate;
            c103561.label = 1;
            if (byteWriteChannel.writeFully(byteBuffer, c103561) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iInflate = c103561.I$0;
            ResultKt.throwOnFailure(obj);
        }
        return Boxing.boxInt(iInflate);
    }
}
