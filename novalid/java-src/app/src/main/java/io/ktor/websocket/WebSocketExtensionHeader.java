package io.ktor.websocket;

import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: WebSocketExtensionHeader.kt */
@Metadata(m7104d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\u0003H\u0002J\u0018\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000e0\rJ\b\u0010\u000f\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0010"}, m7105d2 = {"Lio/ktor/websocket/WebSocketExtensionHeader;", "", "name", "", "parameters", "", "(Ljava/lang/String;Ljava/util/List;)V", "getName", "()Ljava/lang/String;", "getParameters", "()Ljava/util/List;", "parametersToString", "parseParameters", "Lkotlin/sequences/Sequence;", "Lkotlin/Pair;", "toString", "ktor-websockets"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public final class WebSocketExtensionHeader {

    @NotNull
    public final String name;

    @NotNull
    public final List<String> parameters;

    public WebSocketExtensionHeader(@NotNull String name, @NotNull List<String> parameters) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        this.name = name;
        this.parameters = parameters;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final List<String> getParameters() {
        return this.parameters;
    }

    /* compiled from: WebSocketExtensionHeader.kt */
    @Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0004"}, m7105d2 = {"<anonymous>", "Lkotlin/Pair;", "", "it", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: io.ktor.websocket.WebSocketExtensionHeader$parseParameters$1 */
    /* loaded from: classes6.dex */
    public static final class C105301 extends Lambda implements Function1<String, Pair<? extends String, ? extends String>> {
        public static final C105301 INSTANCE = ;

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Pair<String, String> invoke(@NotNull String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) it, '=', 0, false, 6, (Object) null);
            String strSubstring = "";
            if (iIndexOf$default < 0) {
                return TuplesKt.m7112to(it, "");
            }
            String strSubstring2 = StringsKt__StringsKt.substring(it, RangesKt___RangesKt.until(0, iIndexOf$default));
            int i = iIndexOf$default + 1;
            if (i < it.length()) {
                strSubstring = it.substring(i);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
            }
            return TuplesKt.m7112to(strSubstring2, strSubstring);
        }
    }

    @NotNull
    public final Sequence<Pair<String, String>> parseParameters() {
        return SequencesKt___SequencesKt.map(CollectionsKt___CollectionsKt.asSequence(this.parameters), C105301.INSTANCE);
    }

    @NotNull
    public String toString() {
        return this.name + ' ' + parametersToString();
    }

    public final String parametersToString() {
        if (this.parameters.isEmpty()) {
            return "";
        }
        return ", " + CollectionsKt___CollectionsKt.joinToString$default(this.parameters, ",", null, null, 0, null, null, 62, null);
    }
}
