package io.ktor.http.parsing;

import androidx.media3.extractor.text.webvtt.WebvttCssParser;
import io.ktor.util.date.GMTDateParser;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: Primitives.kt */
@Metadata(m7104d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\"\u0014\u0010\u0000\u001a\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0004\u001a\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0003\"\u0014\u0010\u0006\u001a\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0003\"\u0014\u0010\b\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\"\u0014\u0010\f\u001a\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0003\"\u0014\u0010\u000e\u001a\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0003\"\u0014\u0010\u0010\u001a\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0003¨\u0006\u0012"}, m7105d2 = {"alpha", "Lio/ktor/http/parsing/Grammar;", "getAlpha", "()Lio/ktor/http/parsing/Grammar;", "alphaDigit", "getAlphaDigit", "alphas", "getAlphas", "digit", "Lio/ktor/http/parsing/RawGrammar;", "getDigit", "()Lio/ktor/http/parsing/RawGrammar;", WebvttCssParser.VALUE_DIGITS, "getDigits", "hex", "getHex", "lowAlpha", "getLowAlpha", "ktor-http"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes6.dex */
public final class PrimitivesKt {
    @NotNull
    public static final Grammar getLowAlpha() {
        return ParserDslKt.m7081to('a', GMTDateParser.ZONE);
    }

    @NotNull
    public static final Grammar getAlpha() {
        return ParserDslKt.m7078or(ParserDslKt.m7081to('a', GMTDateParser.ZONE), ParserDslKt.m7081to('A', 'Z'));
    }

    @NotNull
    public static final RawGrammar getDigit() {
        return new RawGrammar("\\d");
    }

    @NotNull
    public static final Grammar getHex() {
        return ParserDslKt.m7078or(ParserDslKt.m7078or(getDigit(), ParserDslKt.m7081to('A', 'F')), ParserDslKt.m7081to('a', 'f'));
    }

    @NotNull
    public static final Grammar getAlphaDigit() {
        return ParserDslKt.m7078or(getAlpha(), getDigit());
    }

    @NotNull
    public static final Grammar getAlphas() {
        return ParserDslKt.atLeastOne(getAlpha());
    }

    @NotNull
    public static final Grammar getDigits() {
        return ParserDslKt.atLeastOne(getDigit());
    }
}
