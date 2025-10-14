package io.ktor.http;

import androidx.lifecycle.SavedStateHandle;
import io.ktor.http.Parameters;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: Parameters.kt */
@Metadata(m7104d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0003\u001a\u0010\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u001a\u001f\u0010\u0004\u001a\u00020\u00052\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\t\u001a\u0006\u0010\n\u001a\u00020\u0005\u001aC\u0010\n\u001a\u00020\u000526\u0010\u000b\u001a\u001c\u0012\u0018\b\u0001\u0012\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u000f0\r0\f\"\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u000f0\r¢\u0006\u0002\u0010\u0010\u001a\u0016\u0010\n\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000e\u001a\u001c\u0010\n\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000f\u001a \u0010\n\u001a\u00020\u00052\u0018\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u000f0\u0015\u001a\u0015\u0010\u0016\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0005H\u0086\u0002¨\u0006\u0018"}, m7105d2 = {"ParametersBuilder", "Lio/ktor/http/ParametersBuilder;", "size", "", "parameters", "Lio/ktor/http/Parameters;", "builder", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "parametersOf", "pairs", "", "Lkotlin/Pair;", "", "", "([Lkotlin/Pair;)Lio/ktor/http/Parameters;", "name", "value", SavedStateHandle.VALUES, "map", "", "plus", "other", "ktor-http"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nParameters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Parameters.kt\nio/ktor/http/ParametersKt\n+ 2 Parameters.kt\nio/ktor/http/Parameters$Companion\n*L\n1#1,116:1\n24#2:117\n24#2:118\n*S KotlinDebug\n*F\n+ 1 Parameters.kt\nio/ktor/http/ParametersKt\n*L\n74#1:117\n96#1:118\n*E\n"})
/* loaded from: classes6.dex */
public final class ParametersKt {
    @NotNull
    public static final ParametersBuilder ParametersBuilder(int i) {
        return new ParametersBuilderImpl(i);
    }

    public static /* synthetic */ ParametersBuilder ParametersBuilder$default(int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 8;
        }
        return ParametersBuilder(i);
    }

    @NotNull
    public static final Parameters parametersOf() {
        return Parameters.INSTANCE.getEmpty();
    }

    @NotNull
    public static final Parameters parametersOf(@NotNull String name, @NotNull String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        return new ParametersSingleImpl(name, CollectionsKt__CollectionsJVMKt.listOf(value));
    }

    @NotNull
    public static final Parameters parametersOf(@NotNull String name, @NotNull List<String> values) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(values, "values");
        return new ParametersSingleImpl(name, values);
    }

    @NotNull
    public static final Parameters parametersOf(@NotNull Map<String, ? extends List<String>> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        return new ParametersImpl(map);
    }

    @NotNull
    public static final Parameters parametersOf(@NotNull Pair<String, ? extends List<String>>... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        return new ParametersImpl(MapsKt__MapsKt.toMap(ArraysKt___ArraysJvmKt.asList(pairs)));
    }

    @NotNull
    public static final Parameters parameters(@NotNull Function1<? super ParametersBuilder, Unit> builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        Parameters.Companion companion = Parameters.INSTANCE;
        ParametersBuilder parametersBuilderParametersBuilder$default = ParametersBuilder$default(0, 1, null);
        builder.invoke(parametersBuilderParametersBuilder$default);
        return parametersBuilderParametersBuilder$default.build();
    }

    @NotNull
    public static final Parameters plus(@NotNull Parameters parameters, @NotNull Parameters other) {
        Intrinsics.checkNotNullParameter(parameters, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (parameters.getCaseInsensitiveName() == other.getCaseInsensitiveName()) {
            if (parameters.isEmpty()) {
                return other;
            }
            if (other.isEmpty()) {
                return parameters;
            }
            Parameters.Companion companion = Parameters.INSTANCE;
            ParametersBuilder parametersBuilderParametersBuilder$default = ParametersBuilder$default(0, 1, null);
            parametersBuilderParametersBuilder$default.appendAll(parameters);
            parametersBuilderParametersBuilder$default.appendAll(other);
            return parametersBuilderParametersBuilder$default.build();
        }
        throw new IllegalArgumentException("Cannot concatenate Parameters with case-sensitive and case-insensitive names");
    }
}
