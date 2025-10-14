package io.ktor.client.network.sockets;

import io.ktor.client.request.HttpRequestData;
import io.ktor.util.InternalAPI;
import io.ktor.util.PlatformUtils;
import io.ktor.utils.p050io.ByteChannel;
import io.ktor.utils.p050io.ByteReadChannel;
import io.ktor.utils.p050io.ByteReadChannelKt;
import io.ktor.utils.p050io.ByteWriteChannel;
import io.ktor.utils.p050io.CoroutinesKt;
import io.ktor.utils.p050io.WriterScope;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.apache.ivy.osgi.p063p2.P2ArtifactParser;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TimeoutExceptionsCommon.kt */
@Metadata(m7104d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\u001c\u0010\u0000\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\b"}, m7105d2 = {"mapEngineExceptions", "Lio/ktor/utils/io/ByteReadChannel;", "Lkotlinx/coroutines/CoroutineScope;", "input", "request", "Lio/ktor/client/request/HttpRequestData;", "Lio/ktor/utils/io/ByteWriteChannel;", P2ArtifactParser.RuleHandler.OUTPUT, "ktor-client-core"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public final class TimeoutExceptionsCommonKt {
    @InternalAPI
    @NotNull
    public static final ByteReadChannel mapEngineExceptions(@NotNull CoroutineScope coroutineScope, @NotNull ByteReadChannel input, @NotNull HttpRequestData request) {
        Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(request, "request");
        if (PlatformUtils.INSTANCE.getIS_NATIVE()) {
            return input;
        }
        ByteChannel byteChannelByteChannelWithMappedExceptions = TimeoutExceptionsKt.ByteChannelWithMappedExceptions(request);
        CoroutinesKt.writer$default(coroutineScope, (CoroutineContext) null, byteChannelByteChannelWithMappedExceptions, new C101271(input, byteChannelByteChannelWithMappedExceptions, null), 1, (Object) null);
        return byteChannelByteChannelWithMappedExceptions;
    }

    /* compiled from: TimeoutExceptionsCommon.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lio/ktor/utils/io/WriterScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.client.network.sockets.TimeoutExceptionsCommonKt$mapEngineExceptions$1", m7120f = "TimeoutExceptionsCommon.kt", m7121i = {}, m7122l = {39}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: io.ktor.client.network.sockets.TimeoutExceptionsCommonKt$mapEngineExceptions$1 */
    /* loaded from: classes7.dex */
    public static final class C101271 extends SuspendLambda implements Function2<WriterScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ ByteReadChannel $input;
        public final /* synthetic */ ByteChannel $replacementChannel;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C101271(ByteReadChannel byteReadChannel, ByteChannel byteChannel, Continuation<? super C101271> continuation) {
            super(2, continuation);
            this.$input = byteReadChannel;
            this.$replacementChannel = byteChannel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C101271(this.$input, this.$replacementChannel, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull WriterScope writerScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C101271) create(writerScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    ByteReadChannel byteReadChannel = this.$input;
                    ByteChannel byteChannel = this.$replacementChannel;
                    this.label = 1;
                    if (ByteReadChannelKt.copyAndClose$default(byteReadChannel, byteChannel, 0L, this, 2, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
            } catch (Throwable th) {
                this.$input.cancel(th);
            }
            return Unit.INSTANCE;
        }
    }

    @InternalAPI
    @NotNull
    public static final ByteWriteChannel mapEngineExceptions(@NotNull CoroutineScope coroutineScope, @NotNull ByteWriteChannel output, @NotNull HttpRequestData request) {
        Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(request, "request");
        if (PlatformUtils.INSTANCE.getIS_NATIVE()) {
            return output;
        }
        ByteChannel byteChannelByteChannelWithMappedExceptions = TimeoutExceptionsKt.ByteChannelWithMappedExceptions(request);
        CoroutinesKt.writer$default(coroutineScope, (CoroutineContext) null, byteChannelByteChannelWithMappedExceptions, new C101282(byteChannelByteChannelWithMappedExceptions, output, null), 1, (Object) null);
        return byteChannelByteChannelWithMappedExceptions;
    }

    /* compiled from: TimeoutExceptionsCommon.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lio/ktor/utils/io/WriterScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.client.network.sockets.TimeoutExceptionsCommonKt$mapEngineExceptions$2", m7120f = "TimeoutExceptionsCommon.kt", m7121i = {}, m7122l = {63}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: io.ktor.client.network.sockets.TimeoutExceptionsCommonKt$mapEngineExceptions$2 */
    /* loaded from: classes7.dex */
    public static final class C101282 extends SuspendLambda implements Function2<WriterScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ ByteWriteChannel $output;
        public final /* synthetic */ ByteChannel $replacementChannel;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C101282(ByteChannel byteChannel, ByteWriteChannel byteWriteChannel, Continuation<? super C101282> continuation) {
            super(2, continuation);
            this.$replacementChannel = byteChannel;
            this.$output = byteWriteChannel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C101282(this.$replacementChannel, this.$output, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull WriterScope writerScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C101282) create(writerScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    ByteChannel byteChannel = this.$replacementChannel;
                    ByteWriteChannel byteWriteChannel = this.$output;
                    this.label = 1;
                    if (ByteReadChannelKt.copyAndClose$default(byteChannel, byteWriteChannel, 0L, this, 2, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
            } catch (Throwable th) {
                this.$replacementChannel.close(th);
            }
            return Unit.INSTANCE;
        }
    }
}
