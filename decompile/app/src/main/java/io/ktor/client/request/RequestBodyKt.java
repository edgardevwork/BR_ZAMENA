package io.ktor.client.request;

import androidx.exifinterface.media.ExifInterface;
import io.ktor.http.content.NullBody;
import io.ktor.http.content.OutgoingContent;
import io.ktor.util.AttributeKey;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.util.reflect.TypeInfoJvmKt;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KType;
import kotlin.reflect.TypesJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RequestBody.kt */
@Metadata(m7104d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a\"\u0010\u0005\u001a\u00020\u0006\"\u0006\b\u0000\u0010\u0007\u0018\u0001*\u00020\b2\u0006\u0010\t\u001a\u0002H\u0007H\u0086\b¢\u0006\u0002\u0010\n\u001a\u001c\u0010\u0005\u001a\u00020\u0006*\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u0002\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\r"}, m7105d2 = {"BodyTypeAttributeKey", "Lio/ktor/util/AttributeKey;", "Lio/ktor/util/reflect/TypeInfo;", "getBodyTypeAttributeKey", "()Lio/ktor/util/AttributeKey;", "setBody", "", ExifInterface.GPS_DIRECTION_TRUE, "Lio/ktor/client/request/HttpRequestBuilder;", "body", "(Lio/ktor/client/request/HttpRequestBuilder;Ljava/lang/Object;)V", "", "bodyType", "ktor-client-core"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nRequestBody.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RequestBody.kt\nio/ktor/client/request/RequestBodyKt\n+ 2 TypeInfoJvm.kt\nio/ktor/util/reflect/TypeInfoJvmKt\n*L\n1#1,37:1\n17#2,3:38\n17#2,3:41\n*S KotlinDebug\n*F\n+ 1 RequestBody.kt\nio/ktor/client/request/RequestBodyKt\n*L\n19#1:38,3\n27#1:41,3\n*E\n"})
/* loaded from: classes4.dex */
public final class RequestBodyKt {

    @NotNull
    public static final AttributeKey<TypeInfo> BodyTypeAttributeKey = new AttributeKey<>("BodyTypeAttributeKey");

    @NotNull
    public static final AttributeKey<TypeInfo> getBodyTypeAttributeKey() {
        return BodyTypeAttributeKey;
    }

    public static final /* synthetic */ <T> void setBody(HttpRequestBuilder httpRequestBuilder, T t) {
        Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        if (t == null) {
            httpRequestBuilder.setBody(NullBody.INSTANCE);
            Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
            Type javaType = TypesJVMKt.getJavaType((KType) null);
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            httpRequestBuilder.setBodyType(TypeInfoJvmKt.typeInfoImpl(javaType, Reflection.getOrCreateKotlinClass(Object.class), null));
            return;
        }
        if (t instanceof OutgoingContent) {
            httpRequestBuilder.setBody(t);
            httpRequestBuilder.setBodyType(null);
            return;
        }
        httpRequestBuilder.setBody(t);
        Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
        Type javaType2 = TypesJVMKt.getJavaType((KType) null);
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        httpRequestBuilder.setBodyType(TypeInfoJvmKt.typeInfoImpl(javaType2, Reflection.getOrCreateKotlinClass(Object.class), null));
    }

    public static final void setBody(@NotNull HttpRequestBuilder httpRequestBuilder, @Nullable Object obj, @NotNull TypeInfo bodyType) {
        Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        Intrinsics.checkNotNullParameter(bodyType, "bodyType");
        if (obj == null) {
            obj = NullBody.INSTANCE;
        }
        httpRequestBuilder.setBody(obj);
        httpRequestBuilder.setBodyType(bodyType);
    }
}
