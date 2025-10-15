package io.ktor.http.parsing.regex;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import io.ktor.http.parsing.AnyOfGrammar;
import io.ktor.http.parsing.AtLeastOne;
import io.ktor.http.parsing.ComplexGrammar;
import io.ktor.http.parsing.Grammar;
import io.ktor.http.parsing.ManyGrammar;
import io.ktor.http.parsing.MaybeGrammar;
import io.ktor.http.parsing.NamedGrammar;
import io.ktor.http.parsing.OrGrammar;
import io.ktor.http.parsing.Parser;
import io.ktor.http.parsing.RangeGrammar;
import io.ktor.http.parsing.RawGrammar;
import io.ktor.http.parsing.SimpleGrammar;
import io.ktor.http.parsing.StringGrammar;
import io.ktor.util.date.GMTDateParser;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: RegexParserGenerator.kt */
@Metadata(m7104d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010!\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u001a.\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00022\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0002\u001a\f\u0010\b\u001a\u00020\t*\u00020\nH\u0000\u001a:\u0010\u000b\u001a\u00020\f*\u00020\n2\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0002¨\u0006\u0011"}, m7105d2 = {"add", "", "", "", "", "", "key", "value", "buildRegexParser", "Lio/ktor/http/parsing/Parser;", "Lio/ktor/http/parsing/Grammar;", "toRegex", "Lio/ktor/http/parsing/regex/GrammarRegex;", "groups", TypedValues.CycleType.S_WAVE_OFFSET, "shouldGroup", "", "ktor-http"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nRegexParserGenerator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RegexParserGenerator.kt\nio/ktor/http/parsing/regex/RegexParserGeneratorKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,72:1\n1864#2,3:73\n*S KotlinDebug\n*F\n+ 1 RegexParserGenerator.kt\nio/ktor/http/parsing/regex/RegexParserGeneratorKt\n*L\n41#1:73,3\n*E\n"})
/* loaded from: classes6.dex */
public final class RegexParserGeneratorKt {
    @NotNull
    public static final Parser buildRegexParser(@NotNull Grammar grammar) {
        Intrinsics.checkNotNullParameter(grammar, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        return new RegexParser(new Regex(toRegex$default(grammar, linkedHashMap, 0, false, 6, null).getRegex()), linkedHashMap);
    }

    public static /* synthetic */ GrammarRegex toRegex$default(Grammar grammar, Map map, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 1;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return toRegex(grammar, map, i, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final GrammarRegex toRegex(Grammar grammar, Map<String, List<Integer>> map, int i, boolean z) {
        char c;
        if (grammar instanceof StringGrammar) {
            return new GrammarRegex(Regex.INSTANCE.escape(((StringGrammar) grammar).getValue()), 0, false, 6, null);
        }
        if (grammar instanceof RawGrammar) {
            return new GrammarRegex(((RawGrammar) grammar).getValue(), 0, false, 6, null);
        }
        if (grammar instanceof NamedGrammar) {
            NamedGrammar namedGrammar = (NamedGrammar) grammar;
            GrammarRegex regex$default = toRegex$default(namedGrammar.getGrammar(), map, i + 1, false, 4, null);
            add(map, namedGrammar.getName(), i);
            return new GrammarRegex(regex$default.getRegex(), regex$default.getGroupsCount(), true);
        }
        if (grammar instanceof ComplexGrammar) {
            StringBuilder sb = new StringBuilder();
            int groupsCount = z ? i + 1 : i;
            int i2 = 0;
            for (Object obj : ((ComplexGrammar) grammar).getGrammars()) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                GrammarRegex regex = toRegex((Grammar) obj, map, groupsCount, true);
                if (i2 != 0 && (grammar instanceof OrGrammar)) {
                    sb.append("|");
                }
                sb.append(regex.getRegex());
                groupsCount += regex.getGroupsCount();
                i2 = i3;
            }
            int i4 = groupsCount - i;
            if (z) {
                i4--;
            }
            String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "expression.toString()");
            return new GrammarRegex(string, i4, z);
        }
        if (grammar instanceof SimpleGrammar) {
            if (grammar instanceof MaybeGrammar) {
                c = '?';
            } else if (grammar instanceof ManyGrammar) {
                c = GMTDateParser.ANY;
            } else {
                if (!(grammar instanceof AtLeastOne)) {
                    throw new IllegalStateException(("Unsupported simple grammar element: " + grammar).toString());
                }
                c = '+';
            }
            GrammarRegex regex2 = toRegex(((SimpleGrammar) grammar).getGrammar(), map, i, true);
            return new GrammarRegex(regex2.getRegex() + c, regex2.getGroupsCount(), false, 4, null);
        }
        if (grammar instanceof AnyOfGrammar) {
            return new GrammarRegex(AbstractJsonLexerKt.BEGIN_LIST + Regex.INSTANCE.escape(((AnyOfGrammar) grammar).getValue()) + AbstractJsonLexerKt.END_LIST, 0, false, 6, null);
        }
        if (!(grammar instanceof RangeGrammar)) {
            throw new IllegalStateException(("Unsupported grammar element: " + grammar).toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
        RangeGrammar rangeGrammar = (RangeGrammar) grammar;
        sb2.append(rangeGrammar.getFrom());
        sb2.append('-');
        sb2.append(rangeGrammar.getTo());
        sb2.append(AbstractJsonLexerKt.END_LIST);
        return new GrammarRegex(sb2.toString(), 0, false, 6, null);
    }

    public static final void add(Map<String, List<Integer>> map, String str, int i) {
        if (!map.containsKey(str)) {
            map.put(str, new ArrayList());
        }
        Integer numValueOf = Integer.valueOf(i);
        List<Integer> list = map.get(str);
        Intrinsics.checkNotNull(list);
        list.add(numValueOf);
    }
}
