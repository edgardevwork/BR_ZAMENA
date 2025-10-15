package io.ktor.http.parsing;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: ParserDsl.kt */
@Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m7105d2 = {"Lio/ktor/http/parsing/ComplexGrammar;", "", "grammars", "", "Lio/ktor/http/parsing/Grammar;", "getGrammars", "()Ljava/util/List;", "ktor-http"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes6.dex */
public interface ComplexGrammar {
    @NotNull
    List<Grammar> getGrammars();
}
