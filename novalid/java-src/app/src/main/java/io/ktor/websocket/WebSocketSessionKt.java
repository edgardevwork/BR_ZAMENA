package io.ktor.websocket;

import androidx.exifinterface.media.ExifInterface;
import io.ktor.websocket.CloseReason;
import io.ktor.websocket.Frame;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: WebSocketSession.kt */
@Metadata(m7104d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u001a\u001f\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\b\u001a\u001d\u0010\t\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\b\u001a/\u0010\n\u001a\u0002H\u000b\"\f\b\u0000\u0010\u000b*\u0006\u0012\u0002\b\u00030\f*\u00020\u00022\u0010\u0010\n\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u0002H\u000b0\r¢\u0006\u0002\u0010\u000e\u001a1\u0010\u000f\u001a\u0004\u0018\u0001H\u000b\"\f\b\u0000\u0010\u000b*\u0006\u0012\u0002\b\u00030\f*\u00020\u00022\u0010\u0010\n\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u0002H\u000b0\r¢\u0006\u0002\u0010\u000e\u001a\u001d\u0010\u0010\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0013\u001a\u001d\u0010\u0010\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0014H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, m7105d2 = {"close", "", "Lio/ktor/websocket/WebSocketSession;", "reason", "Lio/ktor/websocket/CloseReason;", "(Lio/ktor/websocket/WebSocketSession;Lio/ktor/websocket/CloseReason;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cause", "", "(Lio/ktor/websocket/WebSocketSession;Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "closeExceptionally", "extension", ExifInterface.GPS_DIRECTION_TRUE, "Lio/ktor/websocket/WebSocketExtension;", "Lio/ktor/websocket/WebSocketExtensionFactory;", "(Lio/ktor/websocket/WebSocketSession;Lio/ktor/websocket/WebSocketExtensionFactory;)Lio/ktor/websocket/WebSocketExtension;", "extensionOrNull", "send", "content", "", "(Lio/ktor/websocket/WebSocketSession;[BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "(Lio/ktor/websocket/WebSocketSession;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ktor-websockets"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nWebSocketSession.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebSocketSession.kt\nio/ktor/websocket/WebSocketSessionKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,149:1\n288#2,2:150\n*S KotlinDebug\n*F\n+ 1 WebSocketSession.kt\nio/ktor/websocket/WebSocketSessionKt\n*L\n96#1:150,2\n*E\n"})
/* loaded from: classes7.dex */
public final class WebSocketSessionKt {

    /* compiled from: WebSocketSession.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.websocket.WebSocketSessionKt", m7120f = "WebSocketSession.kt", m7121i = {0}, m7122l = {120, 121}, m7123m = "close", m7124n = {"$this$close"}, m7125s = {"L$0"})
    /* renamed from: io.ktor.websocket.WebSocketSessionKt$close$1 */
    /* loaded from: classes6.dex */
    public static final class C105361 extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C105361(Continuation<? super C105361> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WebSocketSessionKt.close((WebSocketSession) null, (CloseReason) null, this);
        }
    }

    @NotNull
    public static final <T extends WebSocketExtension<?>> T extension(@NotNull WebSocketSession webSocketSession, @NotNull WebSocketExtensionFactory<?, T> extension) {
        Intrinsics.checkNotNullParameter(webSocketSession, "<this>");
        Intrinsics.checkNotNullParameter(extension, "extension");
        T t = (T) extensionOrNull(webSocketSession, extension);
        if (t != null) {
            return t;
        }
        throw new IllegalStateException(("Extension " + extension + " not found.").toString());
    }

    @Nullable
    public static final <T extends WebSocketExtension<?>> T extensionOrNull(@NotNull WebSocketSession webSocketSession, @NotNull WebSocketExtensionFactory<?, T> extension) {
        Object next;
        Intrinsics.checkNotNullParameter(webSocketSession, "<this>");
        Intrinsics.checkNotNullParameter(extension, "extension");
        Iterator<T> it = webSocketSession.getExtensions().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((WebSocketExtension) next).getFactory().getKey() == extension.getKey()) {
                break;
            }
        }
        if (next instanceof WebSocketExtension) {
            return (T) next;
        }
        return null;
    }

    @Nullable
    public static final Object send(@NotNull WebSocketSession webSocketSession, @NotNull String str, @NotNull Continuation<? super Unit> continuation) {
        Object objSend = webSocketSession.send(new Frame.Text(str), continuation);
        return objSend == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSend : Unit.INSTANCE;
    }

    @Nullable
    public static final Object send(@NotNull WebSocketSession webSocketSession, @NotNull byte[] bArr, @NotNull Continuation<? super Unit> continuation) {
        Object objSend = webSocketSession.send(new Frame.Binary(true, bArr), continuation);
        return objSend == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSend : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object close(@NotNull WebSocketSession webSocketSession, @NotNull CloseReason closeReason, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        C105361 c105361;
        if (continuation instanceof C105361) {
            c105361 = (C105361) continuation;
            int i = c105361.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c105361.label = i - Integer.MIN_VALUE;
            } else {
                c105361 = new C105361(continuation);
            }
        }
        Object obj = c105361.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c105361.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Frame.Close close = new Frame.Close(closeReason);
            c105361.L$0 = webSocketSession;
            c105361.label = 1;
            if (webSocketSession.send(close, c105361) == coroutine_suspended) {
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
            webSocketSession = (WebSocketSession) c105361.L$0;
            ResultKt.throwOnFailure(obj);
        }
        c105361.L$0 = null;
        c105361.label = 2;
        if (webSocketSession.flush(c105361) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Object close$default(WebSocketSession webSocketSession, CloseReason closeReason, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            closeReason = new CloseReason(CloseReason.Codes.NORMAL, "");
        }
        return close(webSocketSession, closeReason, (Continuation<? super Unit>) continuation);
    }

    @Deprecated(message = "Close with reason or terminate instead.")
    @Nullable
    public static final Object close(@NotNull WebSocketSession webSocketSession, @Nullable Throwable th, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        if (th == null) {
            Object objClose$default = close$default(webSocketSession, null, continuation, 1, null);
            return objClose$default == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objClose$default : Unit.INSTANCE;
        }
        Object objCloseExceptionally = closeExceptionally(webSocketSession, th, continuation);
        return objCloseExceptionally == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCloseExceptionally : Unit.INSTANCE;
    }

    @Nullable
    public static final Object closeExceptionally(@NotNull WebSocketSession webSocketSession, @NotNull Throwable th, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        Object objClose = close(webSocketSession, th instanceof CancellationException ? new CloseReason(CloseReason.Codes.NORMAL, "") : new CloseReason(CloseReason.Codes.INTERNAL_ERROR, th.toString()), continuation);
        return objClose == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objClose : Unit.INSTANCE;
    }
}
