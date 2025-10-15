package io.ktor.websocket;

import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import io.ktor.util.cio.ChannelWriteException;
import io.ktor.utils.p050io.ByteWriteChannelKt;
import io.ktor.websocket.Frame;
import io.ktor.websocket.RawWebSocketCommon;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.ExceptionsKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.SendChannel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RawWebSocketCommon.kt */
@Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
@DebugMetadata(m7119c = "io.ktor.websocket.RawWebSocketCommon$writerJob$1", m7120f = "RawWebSocketCommon.kt", m7121i = {1}, m7122l = {58, 60}, m7123m = "invokeSuspend", m7124n = {ThrowableDeserializer.PROP_NAME_MESSAGE}, m7125s = {"L$0"})
/* loaded from: classes7.dex */
public final class RawWebSocketCommon$writerJob$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public Object L$0;
    public int label;
    public final /* synthetic */ RawWebSocketCommon this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RawWebSocketCommon$writerJob$1(RawWebSocketCommon rawWebSocketCommon, Continuation<? super RawWebSocketCommon$writerJob$1> continuation) {
        super(2, continuation);
        this.this$0 = rawWebSocketCommon;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new RawWebSocketCommon$writerJob$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((RawWebSocketCommon$writerJob$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041 A[Catch: all -> 0x0017, ChannelWriteException -> 0x001a, TryCatch #1 {all -> 0x0017, blocks: (B:7:0x0013, B:27:0x005c, B:18:0x002c, B:21:0x003d, B:23:0x0041, B:31:0x0089, B:33:0x008d, B:34:0x0093, B:35:0x00a9, B:29:0x0069, B:15:0x0025), top: B:50:0x000b, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0069 A[Catch: all -> 0x0017, ChannelWriteException -> 0x001a, TRY_LEAVE, TryCatch #1 {all -> 0x0017, blocks: (B:7:0x0013, B:27:0x005c, B:18:0x002c, B:21:0x003d, B:23:0x0041, B:31:0x0089, B:33:0x008d, B:34:0x0093, B:35:0x00a9, B:29:0x0069, B:15:0x0025), top: B:50:0x000b, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0089 A[Catch: all -> 0x0017, ChannelWriteException -> 0x001a, TRY_ENTER, TryCatch #1 {all -> 0x0017, blocks: (B:7:0x0013, B:27:0x005c, B:18:0x002c, B:21:0x003d, B:23:0x0041, B:31:0x0089, B:33:0x008d, B:34:0x0093, B:35:0x00a9, B:29:0x0069, B:15:0x0025), top: B:50:0x000b, outer: #0 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x005b -> B:27:0x005c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x008d -> B:18:0x002c). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            try {
                try {
                } catch (ChannelWriteException e) {
                    this.this$0._outgoing.close(ExceptionsKt.CancellationException("Failed to write to WebSocket.", e));
                }
            } catch (Throwable th) {
                this.this$0._outgoing.close(th);
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = this.this$0._outgoing;
                this.L$0 = null;
                this.label = 1;
                obj = channel.receive(this);
                if (obj == coroutine_suspended) {
                }
                if (obj instanceof Frame) {
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
                if (obj instanceof Frame) {
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Object obj2 = this.L$0;
                ResultKt.throwOnFailure(obj);
                this.this$0.output.flush();
                if (obj2 instanceof Frame.Close) {
                    SendChannel.DefaultImpls.close$default(this.this$0._outgoing, null, 1, null);
                    this.this$0._outgoing.close(ExceptionsKt.CancellationException("WebSocket closed.", null));
                    ByteWriteChannelKt.close(this.this$0.output);
                    while (true) {
                        Object objM17216getOrNullimpl = ChannelResult.m17216getOrNullimpl(this.this$0._outgoing.mo17206tryReceivePtdJZtk());
                        if (objM17216getOrNullimpl != null) {
                            if (objM17216getOrNullimpl instanceof RawWebSocketCommon.FlushRequest) {
                                ((RawWebSocketCommon.FlushRequest) objM17216getOrNullimpl).complete();
                            }
                        } else {
                            return Unit.INSTANCE;
                        }
                    }
                }
                Channel channel2 = this.this$0._outgoing;
                this.L$0 = null;
                this.label = 1;
                obj = channel2.receive(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                if (obj instanceof Frame) {
                    if (obj instanceof RawWebSocketCommon.FlushRequest) {
                        ((RawWebSocketCommon.FlushRequest) obj).complete();
                        Channel channel22 = this.this$0._outgoing;
                        this.L$0 = null;
                        this.label = 1;
                        obj = channel22.receive(this);
                        if (obj == coroutine_suspended) {
                        }
                        if (obj instanceof Frame) {
                            boolean masking = this.this$0.getMasking();
                            this.L$0 = obj;
                            this.label = 2;
                            if (RawWebSocketCommonKt.writeFrame(this.this$0.output, (Frame) obj, masking, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            obj2 = obj;
                            this.this$0.output.flush();
                            if (obj2 instanceof Frame.Close) {
                            }
                            Channel channel222 = this.this$0._outgoing;
                            this.L$0 = null;
                            this.label = 1;
                            obj = channel222.receive(this);
                            if (obj == coroutine_suspended) {
                            }
                            if (obj instanceof Frame) {
                            }
                        }
                    } else {
                        throw new IllegalArgumentException("unknown message " + obj);
                    }
                }
            }
        } catch (Throwable th2) {
            this.this$0._outgoing.close(ExceptionsKt.CancellationException("WebSocket closed.", null));
            ByteWriteChannelKt.close(this.this$0.output);
            throw th2;
        }
    }
}
