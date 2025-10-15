package io.ktor.http.parsing;

import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: ParserDsl.kt */
@Metadata(m7104d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\u0002\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u0010\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0000\u001a\u0010\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0000\u001a\u0010\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0000\u001a'\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\rH\u0000\u001a\u0010\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a%\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u000f\"\n\b\u0000\u0010\u0010\u0018\u0001*\u00020\u0011*\b\u0012\u0004\u0012\u00020\u00010\u000fH\u0080\b\u001a\u0014\u0010\u0012\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0003H\u0000\u001a\u0015\u0010\u0014\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0080\u0004\u001a\u0015\u0010\u0014\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0080\u0004\u001a\u0015\u0010\u0014\u001a\u00020\u0001*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0001H\u0080\u0004\u001a\u0015\u0010\u0015\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0080\u0004\u001a\u0015\u0010\u0015\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0080\u0004\u001a\u0015\u0010\u0015\u001a\u00020\u0001*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0001H\u0080\u0004\u001a\u0015\u0010\u0016\u001a\u00020\u0001*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0080\u0004¨\u0006\u0019"}, m7105d2 = {"anyOf", "Lio/ktor/http/parsing/Grammar;", "value", "", "atLeastOne", "grammar", "many", "maybe", "Lkotlin/Function0;", "block", "Lkotlin/Function1;", "Lio/ktor/http/parsing/GrammarBuilder;", "", "Lkotlin/ExtensionFunctionType;", "flatten", "", ExifInterface.GPS_DIRECTION_TRUE, "Lio/ktor/http/parsing/ComplexGrammar;", "named", "name", "or", "then", "to", "", "other", "ktor-http"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nParserDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ParserDsl.kt\nio/ktor/http/parsing/ParserDslKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,63:1\n1855#2,2:64\n*S KotlinDebug\n*F\n+ 1 ParserDsl.kt\nio/ktor/http/parsing/ParserDslKt\n*L\n58#1:64,2\n*E\n"})
/* loaded from: classes6.dex */
public final class ParserDslKt {
    @NotNull
    public static final Grammar maybe(@NotNull Grammar grammar) {
        Intrinsics.checkNotNullParameter(grammar, "grammar");
        return new MaybeGrammar(grammar);
    }

    @NotNull
    public static final Grammar maybe(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new MaybeGrammar(new StringGrammar(value));
    }

    @NotNull
    public static final Function0<Grammar> maybe(@NotNull final Function1<? super GrammarBuilder, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return new Function0<Grammar>() { // from class: io.ktor.http.parsing.ParserDslKt.maybe.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Grammar invoke() {
                GrammarBuilder grammarBuilder = new GrammarBuilder();
                block.invoke(grammarBuilder);
                return ParserDslKt.maybe(grammarBuilder.build());
            }
        };
    }

    @NotNull
    public static final Grammar then(@NotNull String str, @NotNull Grammar grammar) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(grammar, "grammar");
        return then(new StringGrammar(str), grammar);
    }

    @NotNull
    public static final Grammar then(@NotNull Grammar grammar, @NotNull Grammar grammar2) {
        Intrinsics.checkNotNullParameter(grammar, "<this>");
        Intrinsics.checkNotNullParameter(grammar2, "grammar");
        return new SequenceGrammar(CollectionsKt__CollectionsKt.listOf((Object[]) new Grammar[]{grammar, grammar2}));
    }

    @NotNull
    public static final Grammar then(@NotNull Grammar grammar, @NotNull String value) {
        Intrinsics.checkNotNullParameter(grammar, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        return then(grammar, new StringGrammar(value));
    }

    @NotNull
    /* renamed from: or */
    public static final Grammar m7078or(@NotNull Grammar grammar, @NotNull Grammar grammar2) {
        Intrinsics.checkNotNullParameter(grammar, "<this>");
        Intrinsics.checkNotNullParameter(grammar2, "grammar");
        return new OrGrammar(CollectionsKt__CollectionsKt.listOf((Object[]) new Grammar[]{grammar, grammar2}));
    }

    @NotNull
    /* renamed from: or */
    public static final Grammar m7079or(@NotNull Grammar grammar, @NotNull String value) {
        Intrinsics.checkNotNullParameter(grammar, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        return m7078or(grammar, new StringGrammar(value));
    }

    @NotNull
    /* renamed from: or */
    public static final Grammar m7080or(@NotNull String str, @NotNull Grammar grammar) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(grammar, "grammar");
        return m7078or(new StringGrammar(str), grammar);
    }

    @NotNull
    public static final Grammar many(@NotNull Grammar grammar) {
        Intrinsics.checkNotNullParameter(grammar, "grammar");
        return new ManyGrammar(grammar);
    }

    @NotNull
    public static final Grammar atLeastOne(@NotNull Grammar grammar) {
        Intrinsics.checkNotNullParameter(grammar, "grammar");
        return new AtLeastOne(grammar);
    }

    @NotNull
    public static final Grammar named(@NotNull Grammar grammar, @NotNull String name) {
        Intrinsics.checkNotNullParameter(grammar, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        return new NamedGrammar(name, grammar);
    }

    @NotNull
    public static final Grammar anyOf(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new AnyOfGrammar(value);
    }

    @NotNull
    /* renamed from: to */
    public static final Grammar m7081to(char c, char c2) {
        return new RangeGrammar(c, c2);
    }

    public static final /* synthetic */ <T extends ComplexGrammar> List<Grammar> flatten(List<? extends Grammar> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
            if (obj instanceof ComplexGrammar) {
                CollectionsKt__MutableCollectionsKt.addAll(arrayList, ((ComplexGrammar) obj).getGrammars());
            } else {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
