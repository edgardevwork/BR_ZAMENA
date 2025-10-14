package io.ktor.http.parsing;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ParserDsl.kt */
@Metadata(m7104d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m7105d2 = {"Lio/ktor/http/parsing/StringGrammar;", "Lio/ktor/http/parsing/Grammar;", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "ktor-http"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public final class StringGrammar extends Grammar {

    @NotNull
    public final String value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StringGrammar(@NotNull String value) {
        super(null);
        Intrinsics.checkNotNullParameter(value, "value");
        this.value = value;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
