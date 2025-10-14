package io.ktor.http.parsing;

import kotlin.Metadata;

/* compiled from: ParserDsl.kt */
@Metadata(m7104d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, m7105d2 = {"Lio/ktor/http/parsing/RangeGrammar;", "Lio/ktor/http/parsing/Grammar;", "from", "", "to", "(CC)V", "getFrom", "()C", "getTo", "ktor-http"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public final class RangeGrammar extends Grammar {
    public final char from;
    public final char to;

    public RangeGrammar(char c, char c2) {
        super(null);
        this.from = c;
        this.to = c2;
    }

    public final char getFrom() {
        return this.from;
    }

    public final char getTo() {
        return this.to;
    }
}
