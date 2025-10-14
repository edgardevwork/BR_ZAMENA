package kotlinx.serialization.internal;

import androidx.exifinterface.media.ExifInterface;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.BooleanCompanionObject;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.CharCompanionObject;
import kotlin.jvm.internal.DoubleCompanionObject;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ShortCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.reflect.KClass;
import kotlin.text.CharsKt__CharKt;
import kotlin.text.StringsKt__IndentKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.time.Duration;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Primitives.kt */
@Metadata(m7104d1 = {"\u00000\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0000\u001a\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\nH\u0002\u001a$\u0010\u000f\u001a\n\u0012\u0004\u0012\u0002H\u0010\u0018\u00010\u0004\"\b\b\u0000\u0010\u0010*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00100\u0002H\u0000\u001a\f\u0010\u0011\u001a\u00020\n*\u00020\nH\u0002\"2\u0010\u0000\u001a\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00040\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, m7105d2 = {"BUILTIN_SERIALIZERS", "", "Lkotlin/reflect/KClass;", "", "Lkotlinx/serialization/KSerializer;", "getBUILTIN_SERIALIZERS$annotations", "()V", "PrimitiveDescriptorSafe", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialName", "", "kind", "Lkotlinx/serialization/descriptors/PrimitiveKind;", "checkName", "", "builtinSerializerOrNull", ExifInterface.GPS_DIRECTION_TRUE, "capitalize", "kotlinx-serialization-core"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nPrimitives.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Primitives.kt\nkotlinx/serialization/internal/PrimitivesKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,163:1\n1#2:164\n*E\n"})
/* loaded from: classes5.dex */
public final class PrimitivesKt {

    @NotNull
    public static final Map<KClass<? extends Object>, KSerializer<? extends Object>> BUILTIN_SERIALIZERS = MapsKt__MapsKt.mapOf(kotlin.TuplesKt.m7112to(Reflection.getOrCreateKotlinClass(String.class), BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE)), kotlin.TuplesKt.m7112to(Reflection.getOrCreateKotlinClass(Character.TYPE), BuiltinSerializersKt.serializer(CharCompanionObject.INSTANCE)), kotlin.TuplesKt.m7112to(Reflection.getOrCreateKotlinClass(char[].class), BuiltinSerializersKt.CharArraySerializer()), kotlin.TuplesKt.m7112to(Reflection.getOrCreateKotlinClass(Double.TYPE), BuiltinSerializersKt.serializer(DoubleCompanionObject.INSTANCE)), kotlin.TuplesKt.m7112to(Reflection.getOrCreateKotlinClass(double[].class), BuiltinSerializersKt.DoubleArraySerializer()), kotlin.TuplesKt.m7112to(Reflection.getOrCreateKotlinClass(Float.TYPE), BuiltinSerializersKt.serializer(FloatCompanionObject.INSTANCE)), kotlin.TuplesKt.m7112to(Reflection.getOrCreateKotlinClass(float[].class), BuiltinSerializersKt.FloatArraySerializer()), kotlin.TuplesKt.m7112to(Reflection.getOrCreateKotlinClass(Long.TYPE), BuiltinSerializersKt.serializer(LongCompanionObject.INSTANCE)), kotlin.TuplesKt.m7112to(Reflection.getOrCreateKotlinClass(long[].class), BuiltinSerializersKt.LongArraySerializer()), kotlin.TuplesKt.m7112to(Reflection.getOrCreateKotlinClass(ULong.class), BuiltinSerializersKt.serializer(ULong.INSTANCE)), kotlin.TuplesKt.m7112to(Reflection.getOrCreateKotlinClass(ULongArray.class), BuiltinSerializersKt.ULongArraySerializer()), kotlin.TuplesKt.m7112to(Reflection.getOrCreateKotlinClass(Integer.TYPE), BuiltinSerializersKt.serializer(IntCompanionObject.INSTANCE)), kotlin.TuplesKt.m7112to(Reflection.getOrCreateKotlinClass(int[].class), BuiltinSerializersKt.IntArraySerializer()), kotlin.TuplesKt.m7112to(Reflection.getOrCreateKotlinClass(UInt.class), BuiltinSerializersKt.serializer(UInt.INSTANCE)), kotlin.TuplesKt.m7112to(Reflection.getOrCreateKotlinClass(UIntArray.class), BuiltinSerializersKt.UIntArraySerializer()), kotlin.TuplesKt.m7112to(Reflection.getOrCreateKotlinClass(Short.TYPE), BuiltinSerializersKt.serializer(ShortCompanionObject.INSTANCE)), kotlin.TuplesKt.m7112to(Reflection.getOrCreateKotlinClass(short[].class), BuiltinSerializersKt.ShortArraySerializer()), kotlin.TuplesKt.m7112to(Reflection.getOrCreateKotlinClass(UShort.class), BuiltinSerializersKt.serializer(UShort.INSTANCE)), kotlin.TuplesKt.m7112to(Reflection.getOrCreateKotlinClass(UShortArray.class), BuiltinSerializersKt.UShortArraySerializer()), kotlin.TuplesKt.m7112to(Reflection.getOrCreateKotlinClass(Byte.TYPE), BuiltinSerializersKt.serializer(ByteCompanionObject.INSTANCE)), kotlin.TuplesKt.m7112to(Reflection.getOrCreateKotlinClass(byte[].class), BuiltinSerializersKt.ByteArraySerializer()), kotlin.TuplesKt.m7112to(Reflection.getOrCreateKotlinClass(UByte.class), BuiltinSerializersKt.serializer(UByte.INSTANCE)), kotlin.TuplesKt.m7112to(Reflection.getOrCreateKotlinClass(UByteArray.class), BuiltinSerializersKt.UByteArraySerializer()), kotlin.TuplesKt.m7112to(Reflection.getOrCreateKotlinClass(Boolean.TYPE), BuiltinSerializersKt.serializer(BooleanCompanionObject.INSTANCE)), kotlin.TuplesKt.m7112to(Reflection.getOrCreateKotlinClass(boolean[].class), BuiltinSerializersKt.BooleanArraySerializer()), kotlin.TuplesKt.m7112to(Reflection.getOrCreateKotlinClass(Unit.class), BuiltinSerializersKt.serializer(Unit.INSTANCE)), kotlin.TuplesKt.m7112to(Reflection.getOrCreateKotlinClass(Void.class), BuiltinSerializersKt.NothingSerializer()), kotlin.TuplesKt.m7112to(Reflection.getOrCreateKotlinClass(Duration.class), BuiltinSerializersKt.serializer(Duration.INSTANCE)));

    public static /* synthetic */ void getBUILTIN_SERIALIZERS$annotations() {
    }

    @NotNull
    public static final SerialDescriptor PrimitiveDescriptorSafe(@NotNull String serialName, @NotNull PrimitiveKind kind) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        checkName(serialName);
        return new PrimitiveDescriptor(serialName, kind);
    }

    public static final void checkName(String str) {
        Iterator<KClass<? extends Object>> it = BUILTIN_SERIALIZERS.keySet().iterator();
        while (it.hasNext()) {
            String simpleName = it.next().getSimpleName();
            Intrinsics.checkNotNull(simpleName);
            String strCapitalize = capitalize(simpleName);
            if (StringsKt__StringsJVMKt.equals(str, "kotlin." + strCapitalize, true) || StringsKt__StringsJVMKt.equals(str, strCapitalize, true)) {
                throw new IllegalArgumentException(StringsKt__IndentKt.trimIndent("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name " + str + " there already exist " + capitalize(strCapitalize) + "Serializer.\n                Please refer to SerialDescriptor documentation for additional information.\n            "));
            }
        }
    }

    public static final String capitalize(String str) {
        if (str.length() <= 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char cCharAt = str.charAt(0);
        sb.append((Object) (Character.isLowerCase(cCharAt) ? CharsKt__CharKt.titlecase(cCharAt) : String.valueOf(cCharAt)));
        String strSubstring = str.substring(1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
        sb.append(strSubstring);
        return sb.toString();
    }

    @Nullable
    public static final <T> KSerializer<T> builtinSerializerOrNull(@NotNull KClass<T> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        return (KSerializer) BUILTIN_SERIALIZERS.get(kClass);
    }
}
