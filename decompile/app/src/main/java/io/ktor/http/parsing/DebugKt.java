package io.ktor.http.parsing;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: Debug.kt */
@Metadata(m7104d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a\u0016\u0010\u0006\u001a\u00020\u0001*\u00020\u00072\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\b"}, m7105d2 = {"printlnWithOffset", "", TypedValues.CycleType.S_WAVE_OFFSET, "", "node", "", "printDebug", "Lio/ktor/http/parsing/Grammar;", "ktor-http"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nDebug.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Debug.kt\nio/ktor/http/parsing/DebugKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,41:1\n1855#2,2:42\n1855#2,2:44\n*S KotlinDebug\n*F\n+ 1 Debug.kt\nio/ktor/http/parsing/DebugKt\n*L\n16#1:42,2\n20#1:44,2\n*E\n"})
/* loaded from: classes6.dex */
public final class DebugKt {
    public static /* synthetic */ void printDebug$default(Grammar grammar, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        printDebug(grammar, i);
    }

    public static final void printDebug(@NotNull Grammar grammar, int i) {
        Intrinsics.checkNotNullParameter(grammar, "<this>");
        if (grammar instanceof StringGrammar) {
            printlnWithOffset(i, "STRING[" + Regex.INSTANCE.escape(((StringGrammar) grammar).getValue()) + AbstractJsonLexerKt.END_LIST);
            return;
        }
        if (grammar instanceof RawGrammar) {
            printlnWithOffset(i, "STRING[" + ((RawGrammar) grammar).getValue() + AbstractJsonLexerKt.END_LIST);
            return;
        }
        if (grammar instanceof NamedGrammar) {
            StringBuilder sb = new StringBuilder();
            sb.append("NAMED[");
            NamedGrammar namedGrammar = (NamedGrammar) grammar;
            sb.append(namedGrammar.getName());
            sb.append(AbstractJsonLexerKt.END_LIST);
            printlnWithOffset(i, sb.toString());
            printDebug(namedGrammar.getGrammar(), i + 2);
            return;
        }
        if (grammar instanceof SequenceGrammar) {
            printlnWithOffset(i, "SEQUENCE");
            Iterator<T> it = ((SequenceGrammar) grammar).getGrammars().iterator();
            while (it.hasNext()) {
                printDebug((Grammar) it.next(), i + 2);
            }
            return;
        }
        if (grammar instanceof OrGrammar) {
            printlnWithOffset(i, "OR");
            Iterator<T> it2 = ((OrGrammar) grammar).getGrammars().iterator();
            while (it2.hasNext()) {
                printDebug((Grammar) it2.next(), i + 2);
            }
            return;
        }
        if (grammar instanceof MaybeGrammar) {
            printlnWithOffset(i, "MAYBE");
            printDebug(((MaybeGrammar) grammar).getGrammar(), i + 2);
            return;
        }
        if (grammar instanceof ManyGrammar) {
            printlnWithOffset(i, "MANY");
            printDebug(((ManyGrammar) grammar).getGrammar(), i + 2);
            return;
        }
        if (grammar instanceof AtLeastOne) {
            printlnWithOffset(i, "MANY_NOT_EMPTY");
            printDebug(((AtLeastOne) grammar).getGrammar(), i + 2);
            return;
        }
        if (grammar instanceof AnyOfGrammar) {
            printlnWithOffset(i, "ANY_OF[" + Regex.INSTANCE.escape(((AnyOfGrammar) grammar).getValue()) + AbstractJsonLexerKt.END_LIST);
            return;
        }
        if (!(grammar instanceof RangeGrammar)) {
            throw new NoWhenBranchMatchedException();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("RANGE[");
        RangeGrammar rangeGrammar = (RangeGrammar) grammar;
        sb2.append(rangeGrammar.getFrom());
        sb2.append('-');
        sb2.append(rangeGrammar.getTo());
        sb2.append(AbstractJsonLexerKt.END_LIST);
        printlnWithOffset(i, sb2.toString());
    }

    public static final void printlnWithOffset(int i, Object obj) {
        System.out.println((Object) (StringsKt__StringsJVMKt.repeat(" ", i) + (i / 2) + ": " + obj));
    }
}
