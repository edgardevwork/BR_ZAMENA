package io.ktor.serialization;

import androidx.exifinterface.media.ExifInterface;
import io.ktor.http.ContentType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ContentConverter.kt */
@Metadata(m7104d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001JB\u0010\u0002\u001a\u00020\u0003\"\b\b\u0000\u0010\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u0002H\u00042\u0019\b\u0002\u0010\t\u001a\u0013\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u00020\u00030\n¢\u0006\u0002\b\u000bH&¢\u0006\u0002\u0010\f¨\u0006\r"}, m7105d2 = {"Lio/ktor/serialization/Configuration;", "", "register", "", ExifInterface.GPS_DIRECTION_TRUE, "Lio/ktor/serialization/ContentConverter;", "contentType", "Lio/ktor/http/ContentType;", "converter", "configuration", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(Lio/ktor/http/ContentType;Lio/ktor/serialization/ContentConverter;Lkotlin/jvm/functions/Function1;)V", "ktor-serialization"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes6.dex */
public interface Configuration {
    <T extends ContentConverter> void register(@NotNull ContentType contentType, @NotNull T converter, @NotNull Function1<? super T, Unit> configuration);

    /* compiled from: ContentConverter.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void register$default(Configuration configuration, ContentType contentType, ContentConverter contentConverter, Function1 function1, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: register");
            }
            if ((i & 4) != 0) {
                function1 = new Function1<Object, Unit>() { // from class: io.ktor.serialization.Configuration.register.1
                    public final void invoke(@NotNull Object obj2) {
                        Intrinsics.checkNotNullParameter(obj2, "$this$null");
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Object obj2) {
                        invoke(obj2);
                        return Unit.INSTANCE;
                    }
                };
            }
            configuration.register(contentType, contentConverter, function1);
        }
    }
}
