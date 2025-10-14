package io.ktor.util.cio;

import io.ktor.util.InternalAPI;
import io.ktor.utils.p050io.ByteReadChannel;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ReadersJvm.kt */
@Metadata(m7104d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a1\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0006H\u0087Hø\u0001\u0000¢\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, m7105d2 = {"pass", "", "Lio/ktor/utils/io/ByteReadChannel;", "buffer", "Ljava/nio/ByteBuffer;", "block", "Lkotlin/Function1;", "(Lio/ktor/utils/io/ByteReadChannel;Ljava/nio/ByteBuffer;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ktor-utils"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nReadersJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReadersJvm.kt\nio/ktor/util/cio/ReadersJvmKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,26:1\n1#2:27\n*E\n"})
/* loaded from: classes7.dex */
public final class ReadersJvmKt {

    /* compiled from: ReadersJvm.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 176)
    @DebugMetadata(m7119c = "io.ktor.util.cio.ReadersJvmKt", m7120f = "ReadersJvm.kt", m7121i = {0, 0, 0}, m7122l = {18}, m7123m = "pass", m7124n = {"$this$pass", "buffer", "block"}, m7125s = {"L$0", "L$1", "L$2"})
    @SourceDebugExtension({"SMAP\nReadersJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReadersJvm.kt\nio/ktor/util/cio/ReadersJvmKt$pass$1\n*L\n1#1,26:1\n*E\n"})
    /* renamed from: io.ktor.util.cio.ReadersJvmKt$pass$1 */
    /* loaded from: classes5.dex */
    public static final class C103681 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C103681(Continuation<? super C103681> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ReadersJvmKt.pass(null, null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0058 -> B:20:0x005b). Please report as a decompilation issue!!! */
    @InternalAPI
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object pass(@NotNull ByteReadChannel byteReadChannel, @NotNull ByteBuffer byteBuffer, @NotNull Function1<? super ByteBuffer, Unit> function1, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        C103681 c103681;
        if (continuation instanceof C103681) {
            c103681 = (C103681) continuation;
            int i = c103681.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c103681.label = i - Integer.MIN_VALUE;
            } else {
                c103681 = new C103681(continuation);
            }
        }
        Object obj = c103681.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c103681.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (!byteReadChannel.isClosedForRead()) {
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Function1<? super ByteBuffer, Unit> function12 = (Function1) c103681.L$2;
            byteBuffer = (ByteBuffer) c103681.L$1;
            ByteReadChannel byteReadChannel2 = (ByteReadChannel) c103681.L$0;
            ResultKt.throwOnFailure(obj);
            function1 = function12;
            byteReadChannel = byteReadChannel2;
            byteBuffer.flip();
            function1.invoke(byteBuffer);
            if (!byteReadChannel.isClosedForRead()) {
                byteBuffer.clear();
                c103681.L$0 = byteReadChannel;
                c103681.L$1 = byteBuffer;
                c103681.L$2 = function1;
                c103681.label = 1;
                if (byteReadChannel.readAvailable(byteBuffer, c103681) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                byteBuffer.flip();
                function1.invoke(byteBuffer);
                if (!byteReadChannel.isClosedForRead()) {
                    Throwable closedCause = byteReadChannel.getClosedCause();
                    if (closedCause != null) {
                        throw closedCause;
                    }
                    return Unit.INSTANCE;
                }
            }
        }
    }

    @InternalAPI
    public static final Object pass$$forInline(ByteReadChannel byteReadChannel, ByteBuffer byteBuffer, Function1<? super ByteBuffer, Unit> function1, Continuation<? super Unit> continuation) throws Throwable {
        while (!byteReadChannel.isClosedForRead()) {
            byteBuffer.clear();
            InlineMarker.mark(0);
            byteReadChannel.readAvailable(byteBuffer, (Continuation<? super Integer>) continuation);
            InlineMarker.mark(1);
            byteBuffer.flip();
            function1.invoke(byteBuffer);
        }
        Throwable closedCause = byteReadChannel.getClosedCause();
        if (closedCause != null) {
            throw closedCause;
        }
        return Unit.INSTANCE;
    }
}
