package io.ktor.http;

import io.ktor.util.StringValues;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Parameters.kt */
@Metadata(m7104d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m7105d2 = {"Lio/ktor/http/Parameters;", "Lio/ktor/util/StringValues;", "Companion", "ktor-http"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public interface Parameters extends StringValues {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: Parameters.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        public static boolean contains(@NotNull Parameters parameters, @NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return StringValues.DefaultImpls.contains(parameters, name);
        }

        public static boolean contains(@NotNull Parameters parameters, @NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            return StringValues.DefaultImpls.contains(parameters, name, value);
        }

        public static void forEach(@NotNull Parameters parameters, @NotNull Function2<? super String, ? super List<String>, Unit> body) {
            Intrinsics.checkNotNullParameter(body, "body");
            StringValues.DefaultImpls.forEach(parameters, body);
        }

        @Nullable
        public static String get(@NotNull Parameters parameters, @NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return StringValues.DefaultImpls.get(parameters, name);
        }
    }

    /* compiled from: Parameters.kt */
    @Metadata(m7104d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J%\u0010\u0007\u001a\u00020\u00042\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\fH\u0086\bø\u0001\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\r"}, m7105d2 = {"Lio/ktor/http/Parameters$Companion;", "", "()V", "Empty", "Lio/ktor/http/Parameters;", "getEmpty", "()Lio/ktor/http/Parameters;", "build", "builder", "Lkotlin/Function1;", "Lio/ktor/http/ParametersBuilder;", "", "Lkotlin/ExtensionFunctionType;", "ktor-http"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        public static final Parameters Empty = EmptyParameters.INSTANCE;

        @NotNull
        public final Parameters getEmpty() {
            return Empty;
        }

        @NotNull
        public final Parameters build(@NotNull Function1<? super ParametersBuilder, Unit> builder) {
            Intrinsics.checkNotNullParameter(builder, "builder");
            ParametersBuilder parametersBuilderParametersBuilder$default = ParametersKt.ParametersBuilder$default(0, 1, null);
            builder.invoke(parametersBuilderParametersBuilder$default);
            return parametersBuilderParametersBuilder$default.build();
        }
    }
}
