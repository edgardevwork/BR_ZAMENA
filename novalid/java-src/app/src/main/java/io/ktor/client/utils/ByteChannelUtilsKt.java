package io.ktor.client.utils;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import io.ktor.utils.p050io.ByteReadChannel;
import io.ktor.utils.p050io.ByteReadChannelKt;
import io.ktor.utils.p050io.ByteWriteChannel;
import io.ktor.utils.p050io.CoroutinesKt;
import io.ktor.utils.p050io.WriterScope;
import io.ktor.utils.p050io.pool.ByteArrayPoolKt;
import io.ktor.utils.p050io.pool.ObjectPool;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ByteChannelUtils.kt */
@Metadata(m7104d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u001an\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052F\u0010\u0006\u001aB\b\u0001\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0007H\u0000ø\u0001\u0000¢\u0006\u0002\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, m7105d2 = {"observable", "Lio/ktor/utils/io/ByteReadChannel;", "context", "Lkotlin/coroutines/CoroutineContext;", "contentLength", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "bytesSentTotal", "Lkotlin/coroutines/Continuation;", "", "", "(Lio/ktor/utils/io/ByteReadChannel;Lkotlin/coroutines/CoroutineContext;Ljava/lang/Long;Lkotlin/jvm/functions/Function3;)Lio/ktor/utils/io/ByteReadChannel;", "ktor-client-core"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public final class ByteChannelUtilsKt {

    /* compiled from: ByteChannelUtils.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lio/ktor/utils/io/WriterScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.client.utils.ByteChannelUtilsKt$observable$1", m7120f = "ByteChannelUtils.kt", m7121i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3}, m7122l = {23, 24, 26, 31}, m7123m = "invokeSuspend", m7124n = {"$this$writer", "$this$useInstance$iv", "instance$iv", "byteArray", "total", "bytesSend", "$this$writer", "$this$useInstance$iv", "instance$iv", "byteArray", "total", "bytesSend", "read", "$this$writer", "$this$useInstance$iv", "instance$iv", "byteArray", "total", "bytesSend", "$this$useInstance$iv", "instance$iv"}, m7125s = {"L$0", "L$1", "L$4", "L$5", "J$0", "J$1", "L$0", "L$1", "L$4", "L$5", "J$0", "J$1", "I$0", "L$0", "L$1", "L$4", "L$5", "J$0", "J$1", "L$0", "L$1"})
    @SourceDebugExtension({"SMAP\nByteChannelUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteChannelUtils.kt\nio/ktor/client/utils/ByteChannelUtilsKt$observable$1\n+ 2 Pool.kt\nio/ktor/utils/io/pool/PoolKt\n*L\n1#1,35:1\n159#2,5:36\n*S KotlinDebug\n*F\n+ 1 ByteChannelUtils.kt\nio/ktor/client/utils/ByteChannelUtilsKt$observable$1\n*L\n19#1:36,5\n*E\n"})
    /* renamed from: io.ktor.client.utils.ByteChannelUtilsKt$observable$1 */
    /* loaded from: classes6.dex */
    public static final class C102891 extends SuspendLambda implements Function2<WriterScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Long $contentLength;
        public final /* synthetic */ Function3<Long, Long, Continuation<? super Unit>, Object> $listener;
        public final /* synthetic */ ByteReadChannel $this_observable;
        public int I$0;
        public long J$0;
        public long J$1;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C102891(Long l, ByteReadChannel byteReadChannel, Function3<? super Long, ? super Long, ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super C102891> continuation) {
            super(2, continuation);
            this.$contentLength = l;
            this.$this_observable = byteReadChannel;
            this.$listener = function3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C102891 c102891 = new C102891(this.$contentLength, this.$this_observable, this.$listener, continuation);
            c102891.L$0 = obj;
            return c102891;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull WriterScope writerScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C102891) create(writerScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:121:0x00eb A[Catch: all -> 0x0022, TryCatch #1 {all -> 0x0022, blocks: (B:89:0x001d, B:143:0x01a4, B:119:0x00e5, B:121:0x00eb, B:124:0x0104, B:136:0x0172, B:140:0x0185), top: B:150:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:126:0x012a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:127:0x012b  */
        /* JADX WARN: Removed duplicated region for block: B:131:0x015d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:132:0x015e  */
        /* JADX WARN: Removed duplicated region for block: B:136:0x0172 A[Catch: all -> 0x0022, TRY_ENTER, TryCatch #1 {all -> 0x0022, blocks: (B:89:0x001d, B:143:0x01a4, B:119:0x00e5, B:121:0x00eb, B:124:0x0104, B:136:0x0172, B:140:0x0185), top: B:150:0x000c }] */
        /* JADX WARN: Type inference failed for: r2v0, types: [int] */
        /* JADX WARN: Type inference failed for: r2v1 */
        /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r2v17 */
        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r2v20 */
        /* JADX WARN: Type inference failed for: r2v23 */
        /* JADX WARN: Type inference failed for: r2v27 */
        /* JADX WARN: Type inference failed for: r2v28 */
        /* JADX WARN: Type inference failed for: r2v29 */
        /* JADX WARN: Type inference failed for: r2v30 */
        /* JADX WARN: Type inference failed for: r2v5 */
        /* JADX WARN: Type inference failed for: r2v9 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:132:0x015e -> B:133:0x016b). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            ObjectPool byteArrayPool;
            WriterScope writerScope;
            Object obj2;
            long j;
            ByteReadChannel byteReadChannel;
            long jLongValue;
            Function3<Long, Long, Continuation<? super Unit>, Object> function3;
            byte[] bArr;
            ByteReadChannel byteReadChannel2;
            Function3<Long, Long, Continuation<? super Unit>, Object> function32;
            Object obj3;
            long j2;
            ObjectPool objectPool;
            byte[] bArr2;
            long j3;
            int i;
            long j4;
            Long lBoxLong;
            Long lBoxLong2;
            Object available;
            Object obj4;
            int iIntValue;
            ByteWriteChannel channel;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ?? r2 = this.label;
            int i2 = 1;
            try {
                if (r2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    WriterScope writerScope2 = (WriterScope) this.L$0;
                    byteArrayPool = ByteArrayPoolKt.getByteArrayPool();
                    Long l = this.$contentLength;
                    ByteReadChannel byteReadChannel3 = this.$this_observable;
                    Function3<Long, Long, Continuation<? super Unit>, Object> function33 = this.$listener;
                    Object objBorrow = byteArrayPool.borrow();
                    try {
                        byte[] bArr3 = (byte[]) objBorrow;
                        writerScope = writerScope2;
                        obj2 = objBorrow;
                        j = 0;
                        byteReadChannel = byteReadChannel3;
                        jLongValue = l != null ? l.longValue() : -1L;
                        function3 = function33;
                        bArr = bArr3;
                        if (!byteReadChannel.isClosedForRead()) {
                        }
                    } catch (Throwable th) {
                        th = th;
                        r2 = objBorrow;
                    }
                } else if (r2 == 1) {
                    long j5 = this.J$1;
                    jLongValue = this.J$0;
                    bArr = (byte[]) this.L$5;
                    Object obj5 = this.L$4;
                    function3 = (Function3) this.L$3;
                    byteReadChannel = (ByteReadChannel) this.L$2;
                    ObjectPool objectPool2 = (ObjectPool) this.L$1;
                    writerScope = (WriterScope) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        j = j5;
                        obj4 = obj5;
                        byteArrayPool = objectPool2;
                        available = obj;
                        iIntValue = ((Number) available).intValue();
                        channel = writerScope.getChannel();
                        this.L$0 = writerScope;
                        this.L$1 = byteArrayPool;
                        this.L$2 = byteReadChannel;
                        this.L$3 = function3;
                        this.L$4 = obj4;
                        this.L$5 = bArr;
                        this.J$0 = jLongValue;
                        this.J$1 = j;
                        this.I$0 = iIntValue;
                        this.label = 2;
                        if (channel.writeFully(bArr, 0, iIntValue, this) != coroutine_suspended) {
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        r2 = obj5;
                        byteArrayPool = objectPool2;
                    }
                } else if (r2 == 2) {
                    i = this.I$0;
                    j3 = this.J$1;
                    j2 = this.J$0;
                    bArr2 = (byte[]) this.L$5;
                    obj3 = this.L$4;
                    function32 = (Function3) this.L$3;
                    byteReadChannel2 = (ByteReadChannel) this.L$2;
                    ObjectPool objectPool3 = (ObjectPool) this.L$1;
                    WriterScope writerScope3 = (WriterScope) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        objectPool = objectPool3;
                        writerScope = writerScope3;
                        j4 = j3 + i;
                        lBoxLong = Boxing.boxLong(j4);
                        lBoxLong2 = Boxing.boxLong(j2);
                        this.L$0 = writerScope;
                        this.L$1 = objectPool;
                        this.L$2 = byteReadChannel2;
                        this.L$3 = function32;
                        this.L$4 = obj3;
                        this.L$5 = bArr2;
                        this.J$0 = j2;
                        this.J$1 = j4;
                        this.label = 3;
                        if (function32.invoke(lBoxLong, lBoxLong2, this) != coroutine_suspended) {
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        r2 = obj3;
                        byteArrayPool = objectPool3;
                    }
                } else {
                    if (r2 != 3) {
                        if (r2 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Object obj6 = this.L$1;
                        byteArrayPool = (ObjectPool) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        r2 = obj6;
                        Unit unit = Unit.INSTANCE;
                        byteArrayPool.recycle(r2);
                        return unit;
                    }
                    long j6 = this.J$1;
                    long j7 = this.J$0;
                    byte[] bArr4 = (byte[]) this.L$5;
                    Object obj7 = this.L$4;
                    Function3<Long, Long, Continuation<? super Unit>, Object> function34 = (Function3) this.L$3;
                    ByteReadChannel byteReadChannel4 = (ByteReadChannel) this.L$2;
                    ObjectPool objectPool4 = (ObjectPool) this.L$1;
                    WriterScope writerScope4 = (WriterScope) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        bArr = bArr4;
                        Object obj8 = obj7;
                        writerScope = writerScope4;
                        byteArrayPool = objectPool4;
                        jLongValue = j7;
                        function3 = function34;
                        byteReadChannel = byteReadChannel4;
                        j = j6;
                        i2 = 1;
                        obj2 = obj8;
                        if (!byteReadChannel.isClosedForRead()) {
                            this.L$0 = writerScope;
                            this.L$1 = byteArrayPool;
                            this.L$2 = byteReadChannel;
                            this.L$3 = function3;
                            this.L$4 = obj2;
                            this.L$5 = bArr;
                            this.J$0 = jLongValue;
                            this.J$1 = j;
                            this.label = i2;
                            available = ByteReadChannelKt.readAvailable(byteReadChannel, bArr, this);
                            obj4 = obj2;
                            if (available == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            iIntValue = ((Number) available).intValue();
                            channel = writerScope.getChannel();
                            this.L$0 = writerScope;
                            this.L$1 = byteArrayPool;
                            this.L$2 = byteReadChannel;
                            this.L$3 = function3;
                            this.L$4 = obj4;
                            this.L$5 = bArr;
                            this.J$0 = jLongValue;
                            this.J$1 = j;
                            this.I$0 = iIntValue;
                            this.label = 2;
                            if (channel.writeFully(bArr, 0, iIntValue, this) != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            try {
                                byteReadChannel2 = byteReadChannel;
                                function32 = function3;
                                obj3 = obj4;
                                i = iIntValue;
                                long j8 = j;
                                objectPool = byteArrayPool;
                                bArr2 = bArr;
                                j2 = jLongValue;
                                j3 = j8;
                                lBoxLong = Boxing.boxLong(j4);
                                lBoxLong2 = Boxing.boxLong(j2);
                                this.L$0 = writerScope;
                                this.L$1 = objectPool;
                                this.L$2 = byteReadChannel2;
                                this.L$3 = function32;
                                this.L$4 = obj3;
                                this.L$5 = bArr2;
                                this.J$0 = j2;
                                this.J$1 = j4;
                                this.label = 3;
                                if (function32.invoke(lBoxLong, lBoxLong2, this) != coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                long j9 = j2;
                                bArr = bArr2;
                                jLongValue = j9;
                                byteArrayPool = objectPool;
                                j = j4;
                                obj8 = obj3;
                                function3 = function32;
                                byteReadChannel = byteReadChannel2;
                                i2 = 1;
                                obj2 = obj8;
                                if (!byteReadChannel.isClosedForRead()) {
                                    Throwable closedCause = byteReadChannel.getClosedCause();
                                    writerScope.getChannel().close(closedCause);
                                    r2 = obj2;
                                    if (closedCause == null) {
                                        r2 = obj2;
                                        if (j == 0) {
                                            Long lBoxLong3 = Boxing.boxLong(j);
                                            Long lBoxLong4 = Boxing.boxLong(jLongValue);
                                            this.L$0 = byteArrayPool;
                                            this.L$1 = obj2;
                                            this.L$2 = null;
                                            this.L$3 = null;
                                            this.L$4 = null;
                                            this.L$5 = null;
                                            this.label = 4;
                                            r2 = obj2;
                                            if (function3.invoke(lBoxLong3, lBoxLong4, this) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        }
                                    }
                                    Unit unit2 = Unit.INSTANCE;
                                    byteArrayPool.recycle(r2);
                                    return unit2;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                byteArrayPool = objectPool;
                                r2 = obj3;
                            }
                            j4 = j3 + i;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        byteArrayPool = objectPool4;
                        r2 = obj7;
                    }
                }
            } catch (Throwable th6) {
                th = th6;
            }
            byteArrayPool.recycle(r2);
            throw th;
        }
    }

    @NotNull
    public static final ByteReadChannel observable(@NotNull ByteReadChannel byteReadChannel, @NotNull CoroutineContext context, @Nullable Long l, @NotNull Function3<? super Long, ? super Long, ? super Continuation<? super Unit>, ? extends Object> listener) {
        Intrinsics.checkNotNullParameter(byteReadChannel, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
        return CoroutinesKt.writer((CoroutineScope) GlobalScope.INSTANCE, context, true, (Function2<? super WriterScope, ? super Continuation<? super Unit>, ? extends Object>) new C102891(l, byteReadChannel, listener, null)).getChannel();
    }
}
