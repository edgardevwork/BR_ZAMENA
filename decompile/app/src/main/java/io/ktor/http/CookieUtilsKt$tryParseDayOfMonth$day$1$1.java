package io.ktor.http;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: CookieUtils.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m7105d2 = {"<anonymous>", "", "it", "", "invoke", "(C)Ljava/lang/Boolean;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 176)
@SourceDebugExtension({"SMAP\nCookieUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CookieUtils.kt\nio/ktor/http/CookieUtilsKt$tryParseDayOfMonth$day$1$1\n*L\n1#1,349:1\n*E\n"})
/* loaded from: classes6.dex */
public final class CookieUtilsKt$tryParseDayOfMonth$day$1$1 extends Lambda implements Function1<Character, Boolean> {
    public static final CookieUtilsKt$tryParseDayOfMonth$day$1$1 INSTANCE = new CookieUtilsKt$tryParseDayOfMonth$day$1$1();

    public CookieUtilsKt$tryParseDayOfMonth$day$1$1() {
        super(1);
    }

    @NotNull
    public final Boolean invoke(char c) {
        return Boolean.valueOf(CookieUtilsKt.isDigit(c));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Boolean invoke(Character ch) {
        return invoke(ch.charValue());
    }
}
