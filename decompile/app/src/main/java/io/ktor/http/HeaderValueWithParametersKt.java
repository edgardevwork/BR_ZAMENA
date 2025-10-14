package io.ktor.http;

import io.ktor.util.StringValuesBuilder;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt___StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.commons.lang3.ObjectUtils;
import org.jetbrains.annotations.NotNull;

/* compiled from: HeaderValueWithParameters.kt */
@Metadata(m7104d1 = {"\u00006\n\u0000\n\u0002\u0010\"\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u001a\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t\u001a\n\u0010\n\u001a\u00020\u0007*\u00020\u0007\u001a\u0019\u0010\u000b\u001a\u00020\u0004*\u00020\u00072\n\u0010\f\u001a\u00060\rj\u0002`\u000eH\u0082\b\u001a\f\u0010\u000f\u001a\u00020\u0010*\u00020\u0007H\u0002\u001a\f\u0010\u0011\u001a\u00020\u0010*\u00020\u0007H\u0002\u001a\n\u0010\u0012\u001a\u00020\u0007*\u00020\u0007\u001a\u0018\u0010\u0013\u001a\u00020\u0004*\u00020\u00072\n\u0010\f\u001a\u00060\rj\u0002`\u000eH\u0002\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m7105d2 = {"HeaderFieldValueSeparators", "", "", "append", "", "Lio/ktor/util/StringValuesBuilder;", "name", "", "value", "Lio/ktor/http/HeaderValueWithParameters;", "escapeIfNeeded", "escapeIfNeededTo", "out", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "isQuoted", "", "needQuotes", "quote", "quoteTo", "ktor-http"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nHeaderValueWithParameters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeaderValueWithParameters.kt\nio/ktor/http/HeaderValueWithParametersKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,152:1\n1#2:153\n*E\n"})
/* loaded from: classes5.dex */
public final class HeaderValueWithParametersKt {

    @NotNull
    public static final Set<Character> HeaderFieldValueSeparators = SetsKt__SetsKt.setOf((Object[]) new Character[]{'(', ')', '<', '>', Character.valueOf(ObjectUtils.AT_SIGN), ',', ';', ':', '\\', '\"', '/', Character.valueOf(AbstractJsonLexerKt.BEGIN_LIST), Character.valueOf(AbstractJsonLexerKt.END_LIST), '?', '=', '{', '}', ' ', '\t', '\n', '\r'});

    public static final void append(@NotNull StringValuesBuilder stringValuesBuilder, @NotNull String name, @NotNull HeaderValueWithParameters value) {
        Intrinsics.checkNotNullParameter(stringValuesBuilder, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        stringValuesBuilder.append(name, value.toString());
    }

    @NotNull
    public static final String escapeIfNeeded(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return needQuotes(str) ? quote(str) : str;
    }

    public static final void escapeIfNeededTo(String str, StringBuilder sb) {
        if (needQuotes(str)) {
            sb.append(quote(str));
        } else {
            sb.append(str);
        }
    }

    public static final boolean needQuotes(String str) {
        if (str.length() == 0) {
            return true;
        }
        if (isQuoted(str)) {
            return false;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (HeaderFieldValueSeparators.contains(Character.valueOf(str.charAt(i)))) {
                return true;
            }
        }
        return false;
    }

    public static final boolean isQuoted(String str) {
        if (str.length() < 2 || StringsKt___StringsKt.first(str) != '\"' || StringsKt___StringsKt.last(str) != '\"') {
            return false;
        }
        int i = 1;
        do {
            int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, '\"', i, false, 4, (Object) null);
            if (iIndexOf$default == StringsKt__StringsKt.getLastIndex(str)) {
                break;
            }
            int i2 = 0;
            for (int i3 = iIndexOf$default - 1; str.charAt(i3) == '\\'; i3--) {
                i2++;
            }
            if (i2 % 2 == 0) {
                return false;
            }
            i = iIndexOf$default + 1;
        } while (i < str.length());
        return true;
    }

    @NotNull
    public static final String quote(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        StringBuilder sb = new StringBuilder();
        quoteTo(str, sb);
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public static final void quoteTo(String str, StringBuilder sb) {
        sb.append("\"");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\\') {
                sb.append("\\\\");
            } else if (cCharAt == '\n') {
                sb.append("\\n");
            } else if (cCharAt == '\r') {
                sb.append("\\r");
            } else if (cCharAt == '\t') {
                sb.append("\\t");
            } else if (cCharAt == '\"') {
                sb.append("\\\"");
            } else {
                sb.append(cCharAt);
            }
        }
        sb.append("\"");
    }
}
