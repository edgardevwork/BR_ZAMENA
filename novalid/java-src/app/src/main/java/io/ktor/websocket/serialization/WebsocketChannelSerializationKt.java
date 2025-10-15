package io.ktor.websocket.serialization;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import io.ktor.serialization.WebsocketContentConverter;
import io.ktor.serialization.WebsocketDeserializeException;
import io.ktor.util.InternalAPI;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.util.reflect.TypeInfoJvmKt;
import io.ktor.websocket.Frame;
import io.ktor.websocket.WebSocketSession;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KType;
import kotlin.reflect.TypesJVMKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.channels.SendChannel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: WebsocketChannelSerialization.kt */
@Metadata(m7104d1 = {"\u00000\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a3\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0087Hø\u0001\u0000¢\u0006\u0002\u0010\t\u001a3\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00052\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\f\u001a;\u0010\r\u001a\u00020\u000e\"\u0006\b\u0000\u0010\u0002\u0018\u0001*\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u00052\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0087Hø\u0001\u0000¢\u0006\u0002\u0010\u0010\u001a;\u0010\r\u001a\u00020\u000e*\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00052\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, m7105d2 = {"receiveDeserializedBase", "", ExifInterface.GPS_DIRECTION_TRUE, "Lio/ktor/websocket/WebSocketSession;", "converter", "Lio/ktor/serialization/WebsocketContentConverter;", "charset", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", "(Lio/ktor/websocket/WebSocketSession;Lio/ktor/serialization/WebsocketContentConverter;Ljava/nio/charset/Charset;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "typeInfo", "Lio/ktor/util/reflect/TypeInfo;", "(Lio/ktor/websocket/WebSocketSession;Lio/ktor/util/reflect/TypeInfo;Lio/ktor/serialization/WebsocketContentConverter;Ljava/nio/charset/Charset;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendSerializedBase", "", "data", "(Lio/ktor/websocket/WebSocketSession;Ljava/lang/Object;Lio/ktor/serialization/WebsocketContentConverter;Ljava/nio/charset/Charset;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lio/ktor/websocket/WebSocketSession;Ljava/lang/Object;Lio/ktor/util/reflect/TypeInfo;Lio/ktor/serialization/WebsocketContentConverter;Ljava/nio/charset/Charset;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ktor-websocket-serialization"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nWebsocketChannelSerialization.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebsocketChannelSerialization.kt\nio/ktor/websocket/serialization/WebsocketChannelSerializationKt\n+ 2 TypeInfoJvm.kt\nio/ktor/util/reflect/TypeInfoJvmKt\n*L\n1#1,124:1\n17#2,3:125\n17#2,3:128\n*S KotlinDebug\n*F\n+ 1 WebsocketChannelSerialization.kt\nio/ktor/websocket/serialization/WebsocketChannelSerializationKt\n*L\n29#1:125,3\n74#1:128,3\n*E\n"})
/* loaded from: classes7.dex */
public final class WebsocketChannelSerializationKt {

    /* compiled from: WebsocketChannelSerialization.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.websocket.serialization.WebsocketChannelSerializationKt", m7120f = "WebsocketChannelSerialization.kt", m7121i = {0, 0, 0, 1, 1}, m7122l = {95, 104}, m7123m = "receiveDeserializedBase", m7124n = {"typeInfo", "converter", "charset", "typeInfo", TypedValues.AttributesType.S_FRAME}, m7125s = {"L$0", "L$1", "L$2", "L$0", "L$1"})
    /* renamed from: io.ktor.websocket.serialization.WebsocketChannelSerializationKt$receiveDeserializedBase$2 */
    /* loaded from: classes6.dex */
    public static final class C105402 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C105402(Continuation<? super C105402> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WebsocketChannelSerializationKt.receiveDeserializedBase(null, null, null, null, this);
        }
    }

    /* compiled from: WebsocketChannelSerialization.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.websocket.serialization.WebsocketChannelSerializationKt", m7120f = "WebsocketChannelSerialization.kt", m7121i = {0}, m7122l = {50, 55}, m7123m = "sendSerializedBase", m7124n = {"$this$sendSerializedBase"}, m7125s = {"L$0"})
    /* renamed from: io.ktor.websocket.serialization.WebsocketChannelSerializationKt$sendSerializedBase$2 */
    /* loaded from: classes6.dex */
    public static final class C105412 extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C105412(Continuation<? super C105412> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WebsocketChannelSerializationKt.sendSerializedBase(null, null, null, null, null, this);
        }
    }

    @InternalAPI
    public static final /* synthetic */ <T> Object sendSerializedBase(WebSocketSession webSocketSession, Object obj, WebsocketContentConverter websocketContentConverter, Charset charset, Continuation<? super Unit> continuation) throws Throwable {
        Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
        Type javaType = TypesJVMKt.getJavaType((KType) null);
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        TypeInfo typeInfoTypeInfoImpl = TypeInfoJvmKt.typeInfoImpl(javaType, Reflection.getOrCreateKotlinClass(Object.class), null);
        InlineMarker.mark(0);
        sendSerializedBase(webSocketSession, obj, typeInfoTypeInfoImpl, websocketContentConverter, charset, continuation);
        InlineMarker.mark(1);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @InternalAPI
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object sendSerializedBase(@NotNull WebSocketSession webSocketSession, @Nullable Object obj, @NotNull TypeInfo typeInfo, @NotNull WebsocketContentConverter websocketContentConverter, @NotNull Charset charset, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        C105412 c105412;
        if (continuation instanceof C105412) {
            c105412 = (C105412) continuation;
            int i = c105412.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c105412.label = i - Integer.MIN_VALUE;
            } else {
                c105412 = new C105412(continuation);
            }
        }
        Object objSerializeNullable = c105412.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c105412.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objSerializeNullable);
            c105412.L$0 = webSocketSession;
            c105412.label = 1;
            objSerializeNullable = websocketContentConverter.serializeNullable(charset, typeInfo, obj, c105412);
            if (objSerializeNullable == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objSerializeNullable);
                return Unit.INSTANCE;
            }
            webSocketSession = (WebSocketSession) c105412.L$0;
            ResultKt.throwOnFailure(objSerializeNullable);
        }
        SendChannel<Frame> outgoing = webSocketSession.getOutgoing();
        c105412.L$0 = null;
        c105412.label = 2;
        if (outgoing.send((Frame) objSerializeNullable, c105412) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    @InternalAPI
    public static final /* synthetic */ <T> Object receiveDeserializedBase(WebSocketSession webSocketSession, WebsocketContentConverter websocketContentConverter, Charset charset, Continuation<Object> continuation) throws Throwable {
        Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
        Type javaType = TypesJVMKt.getJavaType((KType) null);
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        TypeInfo typeInfoTypeInfoImpl = TypeInfoJvmKt.typeInfoImpl(javaType, Reflection.getOrCreateKotlinClass(Object.class), null);
        InlineMarker.mark(0);
        Object objReceiveDeserializedBase = receiveDeserializedBase(webSocketSession, typeInfoTypeInfoImpl, websocketContentConverter, charset, continuation);
        InlineMarker.mark(1);
        return objReceiveDeserializedBase;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0093 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @InternalAPI
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object receiveDeserializedBase(@NotNull WebSocketSession webSocketSession, @NotNull TypeInfo typeInfo, @NotNull WebsocketContentConverter websocketContentConverter, @NotNull Charset charset, @NotNull Continuation<Object> continuation) throws Throwable {
        C105402 c105402;
        TypeInfo typeInfo2;
        WebsocketContentConverter websocketContentConverter2;
        Charset charset2;
        TypeInfo typeInfo3;
        Frame frame;
        if (continuation instanceof C105402) {
            c105402 = (C105402) continuation;
            int i = c105402.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c105402.label = i - Integer.MIN_VALUE;
            } else {
                c105402 = new C105402(continuation);
            }
        }
        Object objReceive = c105402.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c105402.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objReceive);
            ReceiveChannel<Frame> incoming = webSocketSession.getIncoming();
            typeInfo2 = typeInfo;
            c105402.L$0 = typeInfo2;
            websocketContentConverter2 = websocketContentConverter;
            c105402.L$1 = websocketContentConverter2;
            charset2 = charset;
            c105402.L$2 = charset2;
            c105402.label = 1;
            objReceive = incoming.receive(c105402);
            if (objReceive == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Frame frame2 = (Frame) c105402.L$1;
                typeInfo3 = (TypeInfo) c105402.L$0;
                ResultKt.throwOnFailure(objReceive);
                frame = frame2;
                if (!typeInfo3.getType().isInstance(objReceive)) {
                    return objReceive;
                }
                if (objReceive == null) {
                    KType kotlinType = typeInfo3.getKotlinType();
                    if (kotlinType == null || !kotlinType.isMarkedNullable()) {
                        throw new WebsocketDeserializeException("Frame has null content", null, frame, 2, null);
                    }
                    return null;
                }
                throw new WebsocketDeserializeException("Can't deserialize value: expected value of type " + typeInfo3.getType().getSimpleName() + ", got " + Reflection.getOrCreateKotlinClass(objReceive.getClass()).getSimpleName(), null, frame, 2, null);
            }
            Charset charset3 = (Charset) c105402.L$2;
            websocketContentConverter2 = (WebsocketContentConverter) c105402.L$1;
            TypeInfo typeInfo4 = (TypeInfo) c105402.L$0;
            ResultKt.throwOnFailure(objReceive);
            charset2 = charset3;
            typeInfo2 = typeInfo4;
        }
        Frame frame3 = (Frame) objReceive;
        if (!websocketContentConverter2.isApplicable(frame3)) {
            throw new WebsocketDeserializeException("Converter doesn't support frame type " + frame3.getFrameType().name(), null, frame3, 2, null);
        }
        c105402.L$0 = typeInfo2;
        c105402.L$1 = frame3;
        c105402.L$2 = null;
        c105402.label = 2;
        objReceive = websocketContentConverter2.deserialize(charset2, typeInfo2, frame3, c105402);
        if (objReceive == coroutine_suspended) {
            return coroutine_suspended;
        }
        typeInfo3 = typeInfo2;
        frame = frame3;
        if (!typeInfo3.getType().isInstance(objReceive)) {
        }
    }
}
