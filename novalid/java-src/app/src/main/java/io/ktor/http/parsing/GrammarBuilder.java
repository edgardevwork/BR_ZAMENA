package io.ktor.http.parsing;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: GrammarBuilder.kt */
@Metadata(m7104d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0006\u001a\u00020\u0005J\u0011\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0005H\u0086\u0004J\u0011\u0010\u0007\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nH\u0086\u0004J\u0013\u0010\u000b\u001a\u00020\f*\b\u0012\u0004\u0012\u00020\u00050\rH\u0086\u0002J\r\u0010\u000b\u001a\u00020\f*\u00020\u0005H\u0086\u0002J\r\u0010\u000b\u001a\u00020\f*\u00020\nH\u0086\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m7105d2 = {"Lio/ktor/http/parsing/GrammarBuilder;", "", "()V", "grammars", "", "Lio/ktor/http/parsing/Grammar;", "build", "then", "grammar", "value", "", "unaryPlus", "", "Lkotlin/Function0;", "ktor-http"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes6.dex */
public final class GrammarBuilder {

    @NotNull
    public final List<Grammar> grammars = new ArrayList();

    @NotNull
    public final GrammarBuilder then(@NotNull Grammar grammar) {
        Intrinsics.checkNotNullParameter(grammar, "grammar");
        this.grammars.add(grammar);
        return this;
    }

    @NotNull
    public final GrammarBuilder then(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.grammars.add(new StringGrammar(value));
        return this;
    }

    public final void unaryPlus(@NotNull Function0<? extends Grammar> function0) {
        Intrinsics.checkNotNullParameter(function0, "<this>");
        this.grammars.add(function0.invoke());
    }

    public final void unaryPlus(@NotNull Grammar grammar) {
        Intrinsics.checkNotNullParameter(grammar, "<this>");
        this.grammars.add(grammar);
    }

    public final void unaryPlus(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        this.grammars.add(new StringGrammar(str));
    }

    @NotNull
    public final Grammar build() {
        return this.grammars.size() == 1 ? (Grammar) CollectionsKt___CollectionsKt.first((List) this.grammars) : new SequenceGrammar(this.grammars);
    }
}
