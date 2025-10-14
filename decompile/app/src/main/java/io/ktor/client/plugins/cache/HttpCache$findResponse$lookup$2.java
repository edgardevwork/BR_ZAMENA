package io.ktor.client.plugins.cache;

import io.ktor.http.HeadersBuilder;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HttpCache.kt */
@Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public /* synthetic */ class HttpCache$findResponse$lookup$2 extends FunctionReferenceImpl implements Function1<String, List<? extends String>> {
    public HttpCache$findResponse$lookup$2(Object obj) {
        super(1, obj, HeadersBuilder.class, "getAll", "getAll(Ljava/lang/String;)Ljava/util/List;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final List<String> invoke(@NotNull String p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((HeadersBuilder) this.receiver).getAll(p0);
    }
}
