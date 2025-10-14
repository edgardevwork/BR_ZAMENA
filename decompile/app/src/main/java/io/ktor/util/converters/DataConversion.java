package io.ktor.util.converters;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.SavedStateHandle;
import io.ktor.util.KtorDsl;
import io.ktor.util.converters.DelegatingConversionService;
import io.ktor.util.reflect.TypeInfo;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DataConversion.kt */
@Metadata(m7104d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0011B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J \u0010\b\u001a\u0004\u0018\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\tH\u0016R\u001e\u0010\u0005\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007\u0012\u0004\u0012\u00020\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m7105d2 = {"Lio/ktor/util/converters/DataConversion;", "Lio/ktor/util/converters/ConversionService;", "configuration", "Lio/ktor/util/converters/DataConversion$Configuration;", "(Lio/ktor/util/converters/DataConversion$Configuration;)V", "converters", "", "Lkotlin/reflect/KClass;", "fromValues", "", SavedStateHandle.VALUES, "", "", "type", "Lio/ktor/util/reflect/TypeInfo;", "toValues", "value", "Configuration", "ktor-utils"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nDataConversion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataConversion.kt\nio/ktor/util/converters/DataConversion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,117:1\n1#2:118\n*E\n"})
/* loaded from: classes7.dex */
public final class DataConversion implements ConversionService {

    @NotNull
    public final Map<KClass<?>, ConversionService> converters;

    public DataConversion(@NotNull Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.converters = MapsKt__MapsKt.toMap(configuration.getConverters$ktor_utils());
    }

    @Override // io.ktor.util.converters.ConversionService
    @Nullable
    public Object fromValues(@NotNull List<String> values, @NotNull TypeInfo type) {
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(type, "type");
        if (values.isEmpty()) {
            return null;
        }
        ConversionService conversionService = this.converters.get(type.getType());
        if (conversionService == null) {
            conversionService = DefaultConversionService.INSTANCE;
        }
        return conversionService.fromValues(values, type);
    }

    @Override // io.ktor.util.converters.ConversionService
    @NotNull
    public List<String> toValues(@Nullable Object value) {
        if (value != null) {
            ConversionService conversionService = this.converters.get(Reflection.getOrCreateKotlinClass(value.getClass()));
            if (conversionService == null) {
                conversionService = DefaultConversionService.INSTANCE;
            }
            return conversionService.toValues(value);
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    /* compiled from: DataConversion.kt */
    @KtorDsl
    @Metadata(m7104d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J9\u0010\t\u001a\u00020\n\"\n\b\u0000\u0010\u000b\u0018\u0001*\u00020\u00012\u001f\b\b\u0010\f\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\u000e\u0012\u0004\u0012\u00020\n0\r¢\u0006\u0002\b\u000fH\u0086\bø\u0001\u0000J\u001a\u0010\t\u001a\u00020\n2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0011\u001a\u00020\u0006J7\u0010\t\u001a\u00020\n\"\b\b\u0000\u0010\u000b*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00122\u001d\u0010\f\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\u000e\u0012\u0004\u0012\u00020\n0\r¢\u0006\u0002\b\u000fR$\u0010\u0003\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0013"}, m7105d2 = {"Lio/ktor/util/converters/DataConversion$Configuration;", "", "()V", "converters", "", "Lkotlin/reflect/KClass;", "Lio/ktor/util/converters/ConversionService;", "getConverters$ktor_utils", "()Ljava/util/Map;", "convert", "", ExifInterface.GPS_DIRECTION_TRUE, "configure", "Lkotlin/Function1;", "Lio/ktor/util/converters/DelegatingConversionService$Configuration;", "Lkotlin/ExtensionFunctionType;", "type", "convertor", "Lkotlin/reflect/KType;", "ktor-utils"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Configuration {

        @NotNull
        public final Map<KClass<?>, ConversionService> converters = new LinkedHashMap();

        @NotNull
        public final Map<KClass<?>, ConversionService> getConverters$ktor_utils() {
            return this.converters;
        }

        public final void convert(@NotNull KClass<?> type, @NotNull ConversionService convertor) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(convertor, "convertor");
            this.converters.put(type, convertor);
        }

        public final <T> void convert(@NotNull KType type, @NotNull Function1<? super DelegatingConversionService.Configuration<T>, Unit> configure) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(configure, "configure");
            KClassifier classifier = type.getClassifier();
            Intrinsics.checkNotNull(classifier, "null cannot be cast to non-null type kotlin.reflect.KClass<T of io.ktor.util.converters.DataConversion.Configuration.convert>");
            KClass<?> kClass = (KClass) classifier;
            DelegatingConversionService.Configuration configuration = new DelegatingConversionService.Configuration(kClass);
            configure.invoke(configuration);
            convert(kClass, new DelegatingConversionService(kClass, configuration.getDecoder$ktor_utils(), (Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(configuration.getEncoder$ktor_utils(), 1)));
        }

        public final /* synthetic */ <T> void convert(Function1<? super DelegatingConversionService.Configuration<T>, Unit> configure) {
            Intrinsics.checkNotNullParameter(configure, "configure");
            Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
            convert((KType) null, configure);
        }
    }
}
