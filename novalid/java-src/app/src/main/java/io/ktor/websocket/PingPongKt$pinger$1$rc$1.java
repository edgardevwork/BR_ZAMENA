package io.ktor.websocket;

import io.ktor.utils.p050io.charsets.CharsetJVMKt;
import io.ktor.websocket.Frame;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.SendChannel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PingPong.kt */
@Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
@DebugMetadata(m7119c = "io.ktor.websocket.PingPongKt$pinger$1$rc$1", m7120f = "PingPong.kt", m7121i = {}, m7122l = {75, 79}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
@SourceDebugExtension({"SMAP\nPingPong.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PingPong.kt\nio/ktor/websocket/PingPongKt$pinger$1$rc$1\n+ 2 Strings.kt\nio/ktor/utils/io/core/StringsKt\n+ 3 StringsJVM.kt\nio/ktor/utils/io/core/StringsJVMKt\n*L\n1#1,111:1\n8#2,3:112\n10#3,6:115\n*S KotlinDebug\n*F\n+ 1 PingPong.kt\nio/ktor/websocket/PingPongKt$pinger$1$rc$1\n*L\n75#1:112,3\n80#1:115,6\n*E\n"})
/* loaded from: classes7.dex */
public final class PingPongKt$pinger$1$rc$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ Channel<Frame.Pong> $channel;
    public final /* synthetic */ SendChannel<Frame> $outgoing;
    public final /* synthetic */ String $pingMessage;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PingPongKt$pinger$1$rc$1(SendChannel<? super Frame> sendChannel, String str, Channel<Frame.Pong> channel, Continuation<? super PingPongKt$pinger$1$rc$1> continuation) {
        super(2, continuation);
        this.$outgoing = sendChannel;
        this.$pingMessage = str;
        this.$channel = channel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new PingPongKt$pinger$1$rc$1(this.$outgoing, this.$pingMessage, this.$channel, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((PingPongKt$pinger$1$rc$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0099  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0065 -> B:20:0x0068). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        byte[] bArrEncodeToByteArray;
        byte[] data;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            DefaultWebSocketSessionKt.getLOGGER().trace("WebSocket Pinger: sending ping frame");
            SendChannel<Frame> sendChannel = this.$outgoing;
            String str = this.$pingMessage;
            Charset charset = Charsets.ISO_8859_1;
            if (Intrinsics.areEqual(charset, Charsets.UTF_8)) {
                bArrEncodeToByteArray = StringsKt__StringsJVMKt.encodeToByteArray(str);
            } else {
                CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
                Intrinsics.checkNotNullExpressionValue(charsetEncoderNewEncoder, "charset.newEncoder()");
                bArrEncodeToByteArray = CharsetJVMKt.encodeToByteArray(charsetEncoderNewEncoder, str, 0, str.length());
            }
            Frame.Ping ping = new Frame.Ping(bArrEncodeToByteArray);
            this.label = 1;
            if (sendChannel.send(ping, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Frame.Pong pong = (Frame.Pong) obj;
            data = pong.getData();
            if (!Intrinsics.areEqual(new String(data, 0, data.length, Charsets.ISO_8859_1), this.$pingMessage)) {
                DefaultWebSocketSessionKt.getLOGGER().trace("WebSocket Pinger: received valid pong frame " + pong);
                return Unit.INSTANCE;
            }
            DefaultWebSocketSessionKt.getLOGGER().trace("WebSocket Pinger: received invalid pong frame " + pong + ", continue waiting");
        }
        Channel<Frame.Pong> channel = this.$channel;
        this.label = 2;
        obj = channel.receive(this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        Frame.Pong pong2 = (Frame.Pong) obj;
        data = pong2.getData();
        if (!Intrinsics.areEqual(new String(data, 0, data.length, Charsets.ISO_8859_1), this.$pingMessage)) {
        }
    }
}
