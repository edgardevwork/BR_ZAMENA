package io.ktor.utils.p050io.jvm.javaio;

import io.ktor.utils.p050io.ByteReadChannel;
import io.ktor.utils.p050io.ByteWriteChannel;
import io.ktor.utils.p050io.CoroutinesKt;
import io.ktor.utils.p050io.WriterScope;
import io.ktor.utils.p050io.pool.ByteArrayPoolKt;
import io.ktor.utils.p050io.pool.ObjectPool;
import java.io.InputStream;
import java.nio.ByteBuffer;
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
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Reading.kt */
@Metadata(m7104d1 = {"\u00000\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\u001a'\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u001a\"\u0010\u0007\u001a\u00020\b*\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u001a+\u0010\u0007\u001a\u00020\b*\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u000e0\fH\u0007¢\u0006\u0002\b\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, m7105d2 = {"copyTo", "", "Ljava/io/InputStream;", "channel", "Lio/ktor/utils/io/ByteWriteChannel;", "limit", "(Ljava/io/InputStream;Lio/ktor/utils/io/ByteWriteChannel;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toByteReadChannel", "Lio/ktor/utils/io/ByteReadChannel;", "context", "Lkotlin/coroutines/CoroutineContext;", "pool", "Lio/ktor/utils/io/pool/ObjectPool;", "Ljava/nio/ByteBuffer;", "", "toByteReadChannelWithArrayPool", "ktor-io"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nReading.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Reading.kt\nio/ktor/utils/io/jvm/javaio/ReadingKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,99:1\n1#2:100\n*E\n"})
/* loaded from: classes5.dex */
public final class ReadingKt {

    /* compiled from: Reading.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.jvm.javaio.ReadingKt", m7120f = "Reading.kt", m7121i = {0, 0, 0, 0, 0, 0, 0}, m7122l = {29}, m7123m = "copyTo", m7124n = {"$this$copyTo", "channel", "buffer", "limit", "copied", "bufferSize", "rc"}, m7125s = {"L$0", "L$1", "L$2", "J$0", "J$1", "J$2", "I$0"})
    /* renamed from: io.ktor.utils.io.jvm.javaio.ReadingKt$copyTo$1 */
    /* loaded from: classes6.dex */
    public static final class C105071 extends ContinuationImpl {
        public int I$0;
        public long J$0;
        public long J$1;
        public long J$2;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C105071(Continuation<? super C105071> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ReadingKt.copyTo(null, null, 0L, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x008a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:113:? A[LOOP:0: B:80:0x0074->B:113:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0078  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:90:0x00a1 -> B:105:0x00a8). Please report as a decompilation issue!!! */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object copyTo(@NotNull InputStream inputStream, @NotNull ByteWriteChannel byteWriteChannel, long j, @NotNull Continuation<? super Long> continuation) throws Throwable {
        C105071 c105071;
        byte[] bArr;
        long length;
        byte[] bArr2;
        long j2;
        C105071 c1050712;
        long j3;
        InputStream inputStream2;
        ByteWriteChannel byteWriteChannel2;
        int i;
        if (continuation instanceof C105071) {
            c105071 = (C105071) continuation;
            int i2 = c105071.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c105071.label = i2 - Integer.MIN_VALUE;
            } else {
                c105071 = new C105071(continuation);
            }
        }
        Object obj = c105071.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c105071.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            if (j < 0) {
                throw new IllegalArgumentException(("Limit shouldn't be negative: " + j).toString());
            }
            byte[] bArrBorrow = ByteArrayPoolKt.getByteArrayPool().borrow();
            try {
                length = bArrBorrow.length;
                bArr2 = bArrBorrow;
                j2 = 0;
                c1050712 = c105071;
                j3 = j;
                inputStream2 = inputStream;
                byteWriteChannel2 = byteWriteChannel;
                while (j2 < j3) {
                }
                Long lBoxLong = Boxing.boxLong(j2);
                ByteArrayPoolKt.getByteArrayPool().recycle(bArr2);
                return lBoxLong;
            } catch (Throwable th) {
                th = th;
                bArr = bArrBorrow;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i4 = c105071.I$0;
            long j4 = c105071.J$2;
            long j5 = c105071.J$1;
            long j6 = c105071.J$0;
            bArr = (byte[]) c105071.L$2;
            ByteWriteChannel byteWriteChannel3 = (ByteWriteChannel) c105071.L$1;
            InputStream inputStream3 = (InputStream) c105071.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                bArr2 = bArr;
                byteWriteChannel2 = byteWriteChannel3;
                c1050712 = c105071;
                j3 = j6;
                long j7 = j4;
                try {
                    long j8 = j5 + i4;
                    inputStream2 = inputStream3;
                    length = j7;
                    j2 = j8;
                    while (j2 < j3 && (i = inputStream2.read(bArr2, 0, (int) Math.min(j3 - j2, length))) != -1) {
                        if (i <= 0) {
                            c1050712.L$0 = inputStream2;
                            c1050712.L$1 = byteWriteChannel2;
                            c1050712.L$2 = bArr2;
                            c1050712.J$0 = j3;
                            c1050712.J$1 = j2;
                            c1050712.J$2 = length;
                            c1050712.I$0 = i;
                            c1050712.label = 1;
                            if (byteWriteChannel2.writeFully(bArr2, 0, i, c1050712) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            inputStream3 = inputStream2;
                            i4 = i;
                            long j9 = length;
                            j5 = j2;
                            j7 = j9;
                            long j82 = j5 + i4;
                            inputStream2 = inputStream3;
                            length = j7;
                            j2 = j82;
                            while (j2 < j3) {
                                if (i <= 0) {
                                }
                            }
                        }
                    }
                    Long lBoxLong2 = Boxing.boxLong(j2);
                    ByteArrayPoolKt.getByteArrayPool().recycle(bArr2);
                    return lBoxLong2;
                } catch (Throwable th2) {
                    th = th2;
                    bArr = bArr2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
        ByteArrayPoolKt.getByteArrayPool().recycle(bArr);
        throw th;
    }

    public static /* synthetic */ Object copyTo$default(InputStream inputStream, ByteWriteChannel byteWriteChannel, long j, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            j = Long.MAX_VALUE;
        }
        return copyTo(inputStream, byteWriteChannel, j, continuation);
    }

    public static /* synthetic */ ByteReadChannel toByteReadChannel$default(InputStream inputStream, CoroutineContext coroutineContext, ObjectPool objectPool, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = Dispatchers.getIO();
        }
        return toByteReadChannel(inputStream, coroutineContext, objectPool);
    }

    /* compiled from: Reading.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lio/ktor/utils/io/WriterScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.jvm.javaio.ReadingKt$toByteReadChannel$1", m7120f = "Reading.kt", m7121i = {0, 0}, m7122l = {61}, m7123m = "invokeSuspend", m7124n = {"$this$writer", "buffer"}, m7125s = {"L$0", "L$1"})
    /* renamed from: io.ktor.utils.io.jvm.javaio.ReadingKt$toByteReadChannel$1 */
    /* loaded from: classes7.dex */
    public static final class C105081 extends SuspendLambda implements Function2<WriterScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ ObjectPool<ByteBuffer> $pool;
        public final /* synthetic */ InputStream $this_toByteReadChannel;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C105081(ObjectPool<ByteBuffer> objectPool, InputStream inputStream, Continuation<? super C105081> continuation) {
            super(2, continuation);
            this.$pool = objectPool;
            this.$this_toByteReadChannel = inputStream;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C105081 c105081 = new C105081(this.$pool, this.$this_toByteReadChannel, continuation);
            c105081.L$0 = obj;
            return c105081;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull WriterScope writerScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C105081) create(writerScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            ByteBuffer byteBufferBorrow;
            WriterScope writerScope;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                WriterScope writerScope2 = (WriterScope) this.L$0;
                byteBufferBorrow = this.$pool.borrow();
                writerScope = writerScope2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                byteBufferBorrow = (ByteBuffer) this.L$1;
                writerScope = (WriterScope) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                } finally {
                    try {
                        return Unit.INSTANCE;
                    } finally {
                    }
                }
            }
            while (true) {
                byteBufferBorrow.clear();
                int i2 = this.$this_toByteReadChannel.read(byteBufferBorrow.array(), byteBufferBorrow.arrayOffset() + byteBufferBorrow.position(), byteBufferBorrow.remaining());
                if (i2 < 0) {
                    break;
                }
                if (i2 != 0) {
                    byteBufferBorrow.position(byteBufferBorrow.position() + i2);
                    byteBufferBorrow.flip();
                    ByteWriteChannel channel = writerScope.getChannel();
                    this.L$0 = writerScope;
                    this.L$1 = byteBufferBorrow;
                    this.label = 1;
                    if (channel.writeFully(byteBufferBorrow, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
        }
    }

    @NotNull
    public static final ByteReadChannel toByteReadChannel(@NotNull InputStream inputStream, @NotNull CoroutineContext context, @NotNull ObjectPool<ByteBuffer> pool) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pool, "pool");
        return CoroutinesKt.writer((CoroutineScope) GlobalScope.INSTANCE, context, true, (Function2<? super WriterScope, ? super Continuation<? super Unit>, ? extends Object>) new C105081(pool, inputStream, null)).getChannel();
    }

    public static /* synthetic */ ByteReadChannel toByteReadChannelWithArrayPool$default(InputStream inputStream, CoroutineContext coroutineContext, ObjectPool objectPool, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = Dispatchers.getIO();
        }
        if ((i & 2) != 0) {
            objectPool = ByteArrayPoolKt.getByteArrayPool();
        }
        return toByteReadChannelWithArrayPool(inputStream, coroutineContext, objectPool);
    }

    /* compiled from: Reading.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lio/ktor/utils/io/WriterScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.jvm.javaio.ReadingKt$toByteReadChannel$2", m7120f = "Reading.kt", m7121i = {0, 0}, m7122l = {90}, m7123m = "invokeSuspend", m7124n = {"$this$writer", "buffer"}, m7125s = {"L$0", "L$1"})
    /* renamed from: io.ktor.utils.io.jvm.javaio.ReadingKt$toByteReadChannel$2 */
    /* loaded from: classes7.dex */
    public static final class C105092 extends SuspendLambda implements Function2<WriterScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ ObjectPool<byte[]> $pool;
        public final /* synthetic */ InputStream $this_toByteReadChannel;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C105092(ObjectPool<byte[]> objectPool, InputStream inputStream, Continuation<? super C105092> continuation) {
            super(2, continuation);
            this.$pool = objectPool;
            this.$this_toByteReadChannel = inputStream;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C105092 c105092 = new C105092(this.$pool, this.$this_toByteReadChannel, continuation);
            c105092.L$0 = obj;
            return c105092;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull WriterScope writerScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C105092) create(writerScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            byte[] bArrBorrow;
            WriterScope writerScope;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                WriterScope writerScope2 = (WriterScope) this.L$0;
                bArrBorrow = this.$pool.borrow();
                writerScope = writerScope2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bArrBorrow = (byte[]) this.L$1;
                writerScope = (WriterScope) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (Throwable th) {
                    try {
                        writerScope.getChannel().close(th);
                        this.$pool.recycle(bArrBorrow);
                        this.$this_toByteReadChannel.close();
                        return Unit.INSTANCE;
                    } catch (Throwable th2) {
                        this.$pool.recycle(bArrBorrow);
                        this.$this_toByteReadChannel.close();
                        throw th2;
                    }
                }
            }
            while (true) {
                int i2 = this.$this_toByteReadChannel.read(bArrBorrow, 0, bArrBorrow.length);
                if (i2 < 0) {
                    this.$pool.recycle(bArrBorrow);
                    break;
                }
                if (i2 != 0) {
                    ByteWriteChannel channel = writerScope.getChannel();
                    this.L$0 = writerScope;
                    this.L$1 = bArrBorrow;
                    this.label = 1;
                    if (channel.writeFully(bArrBorrow, 0, i2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
        }
    }

    @JvmName(name = "toByteReadChannelWithArrayPool")
    @NotNull
    public static final ByteReadChannel toByteReadChannelWithArrayPool(@NotNull InputStream inputStream, @NotNull CoroutineContext context, @NotNull ObjectPool<byte[]> pool) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pool, "pool");
        return CoroutinesKt.writer((CoroutineScope) GlobalScope.INSTANCE, context, true, (Function2<? super WriterScope, ? super Continuation<? super Unit>, ? extends Object>) new C105092(pool, inputStream, null)).getChannel();
    }
}
