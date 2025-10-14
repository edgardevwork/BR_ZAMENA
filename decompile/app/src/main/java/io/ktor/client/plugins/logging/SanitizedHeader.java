package io.ktor.client.plugins.logging;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Logging.kt */
@Metadata(m7104d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m7105d2 = {"Lio/ktor/client/plugins/logging/SanitizedHeader;", "", "placeholder", "", "predicate", "Lkotlin/Function1;", "", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "getPlaceholder", "()Ljava/lang/String;", "getPredicate", "()Lkotlin/jvm/functions/Function1;", "ktor-client-logging"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public final class SanitizedHeader {

    @NotNull
    public final String placeholder;

    @NotNull
    public final Function1<String, Boolean> predicate;

    /* JADX WARN: Multi-variable type inference failed */
    public SanitizedHeader(@NotNull String placeholder, @NotNull Function1<? super String, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(placeholder, "placeholder");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        this.placeholder = placeholder;
        this.predicate = predicate;
    }

    @NotNull
    public final String getPlaceholder() {
        return this.placeholder;
    }

    @NotNull
    public final Function1<String, Boolean> getPredicate() {
        return this.predicate;
    }
}
