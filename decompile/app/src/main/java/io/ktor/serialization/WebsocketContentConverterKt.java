package io.ktor.serialization;

import androidx.exifinterface.media.ExifInterface;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.util.reflect.TypeInfoJvmKt;
import io.ktor.websocket.Frame;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KType;
import kotlin.reflect.TypesJVMKt;
import kotlin.text.Charsets;

/* compiled from: WebsocketContentConverter.kt */
@Metadata(m7104d1 = {"\u0000\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a3\u0010\u0000\u001a\u0002H\u0001\"\u0006\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\f\b\u0002\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\b\u001a3\u0010\t\u001a\u00020\u0004\"\u0006\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00022\u0006\u0010\n\u001a\u0002H\u00012\f\b\u0002\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, m7105d2 = {"deserialize", ExifInterface.GPS_DIRECTION_TRUE, "Lio/ktor/serialization/WebsocketContentConverter;", "content", "Lio/ktor/websocket/Frame;", "charset", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", "(Lio/ktor/serialization/WebsocketContentConverter;Lio/ktor/websocket/Frame;Ljava/nio/charset/Charset;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "serialize", "value", "(Lio/ktor/serialization/WebsocketContentConverter;Ljava/lang/Object;Ljava/nio/charset/Charset;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ktor-serialization"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nWebsocketContentConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebsocketContentConverter.kt\nio/ktor/serialization/WebsocketContentConverterKt\n+ 2 TypeInfoJvm.kt\nio/ktor/util/reflect/TypeInfoJvmKt\n*L\n1#1,98:1\n17#2,3:99\n17#2,3:102\n*S KotlinDebug\n*F\n+ 1 WebsocketContentConverter.kt\nio/ktor/serialization/WebsocketContentConverterKt\n*L\n86#1:99,3\n97#1:102,3\n*E\n"})
/* loaded from: classes6.dex */
public final class WebsocketContentConverterKt {
    public static /* synthetic */ Object serialize$default(WebsocketContentConverter websocketContentConverter, Object obj, Charset charset, Continuation continuation, int i, Object obj2) {
        if ((i & 2) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
        Type javaType = TypesJVMKt.getJavaType((KType) null);
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        TypeInfo typeInfoTypeInfoImpl = TypeInfoJvmKt.typeInfoImpl(javaType, Reflection.getOrCreateKotlinClass(Object.class), null);
        InlineMarker.mark(0);
        Object objSerializeNullable = websocketContentConverter.serializeNullable(charset, typeInfoTypeInfoImpl, obj, continuation);
        InlineMarker.mark(1);
        return objSerializeNullable;
    }

    public static final /* synthetic */ <T> Object serialize(WebsocketContentConverter websocketContentConverter, T t, Charset charset, Continuation<? super Frame> continuation) {
        Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
        Type javaType = TypesJVMKt.getJavaType((KType) null);
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        TypeInfo typeInfoTypeInfoImpl = TypeInfoJvmKt.typeInfoImpl(javaType, Reflection.getOrCreateKotlinClass(Object.class), null);
        InlineMarker.mark(0);
        Object objSerializeNullable = websocketContentConverter.serializeNullable(charset, typeInfoTypeInfoImpl, t, continuation);
        InlineMarker.mark(1);
        return objSerializeNullable;
    }

    public static /* synthetic */ Object deserialize$default(WebsocketContentConverter websocketContentConverter, Frame frame, Charset charset, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
        Type javaType = TypesJVMKt.getJavaType((KType) null);
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        TypeInfo typeInfoTypeInfoImpl = TypeInfoJvmKt.typeInfoImpl(javaType, Reflection.getOrCreateKotlinClass(Object.class), null);
        InlineMarker.mark(0);
        Object objDeserialize = websocketContentConverter.deserialize(charset, typeInfoTypeInfoImpl, frame, continuation);
        InlineMarker.mark(1);
        Intrinsics.reifiedOperationMarker(1, ExifInterface.GPS_DIRECTION_TRUE);
        return objDeserialize;
    }

    public static final /* synthetic */ <T> Object deserialize(WebsocketContentConverter websocketContentConverter, Frame frame, Charset charset, Continuation<? super T> continuation) {
        Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
        Type javaType = TypesJVMKt.getJavaType((KType) null);
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        TypeInfo typeInfoTypeInfoImpl = TypeInfoJvmKt.typeInfoImpl(javaType, Reflection.getOrCreateKotlinClass(Object.class), null);
        InlineMarker.mark(0);
        Object objDeserialize = websocketContentConverter.deserialize(charset, typeInfoTypeInfoImpl, frame, continuation);
        InlineMarker.mark(1);
        Intrinsics.reifiedOperationMarker(1, ExifInterface.GPS_DIRECTION_TRUE);
        return objDeserialize;
    }
}
