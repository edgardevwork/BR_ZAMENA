package androidx.compose.p003ui.text.platform;

import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.p003ui.text.EmojiSupportMatch;
import androidx.compose.p003ui.text.ParagraphIntrinsics;
import androidx.compose.p003ui.text.Placeholder;
import androidx.compose.p003ui.text.PlatformParagraphStyle;
import androidx.compose.p003ui.text.PlatformTextStyle;
import androidx.compose.p003ui.text.SpanStyle;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.intl.AndroidLocale;
import androidx.compose.p003ui.text.intl.LocaleList;
import androidx.compose.p003ui.text.intl.PlatformLocale;
import androidx.compose.p003ui.text.style.TextDirection;
import androidx.compose.p003ui.unit.Density;
import androidx.core.text.TextUtilsCompat;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidParagraphIntrinsics.android.kt */
@Metadata(m7104d1 = {"\u0000P\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aP\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00022\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b2\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\f0\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0000\u001a&\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0000ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, m7105d2 = {"hasEmojiCompat", "", "Landroidx/compose/ui/text/TextStyle;", "getHasEmojiCompat", "(Landroidx/compose/ui/text/TextStyle;)Z", "ActualParagraphIntrinsics", "Landroidx/compose/ui/text/ParagraphIntrinsics;", "text", "", "style", "spanStyles", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/SpanStyle;", "placeholders", "Landroidx/compose/ui/text/Placeholder;", "density", "Landroidx/compose/ui/unit/Density;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "resolveTextDirectionHeuristics", "", "textDirection", "Landroidx/compose/ui/text/style/TextDirection;", "localeList", "Landroidx/compose/ui/text/intl/LocaleList;", "resolveTextDirectionHeuristics-HklW4sA", "(ILandroidx/compose/ui/text/intl/LocaleList;)I", "ui-text_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final class AndroidParagraphIntrinsics_androidKt {
    /* renamed from: resolveTextDirectionHeuristics-HklW4sA$default, reason: not valid java name */
    public static /* synthetic */ int m13415resolveTextDirectionHeuristicsHklW4sA$default(int i, LocaleList localeList, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            localeList = null;
        }
        return m13414resolveTextDirectionHeuristicsHklW4sA(i, localeList);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0063  */
    /* renamed from: resolveTextDirectionHeuristics-HklW4sA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int m13414resolveTextDirectionHeuristicsHklW4sA(int i, @Nullable LocaleList localeList) {
        TextDirection.Companion companion = TextDirection.INSTANCE;
        if (TextDirection.m13568equalsimpl0(i, companion.m13573getContentOrLtrs_7Xco())) {
            return 2;
        }
        if (!TextDirection.m13568equalsimpl0(i, companion.m13574getContentOrRtls_7Xco())) {
            if (TextDirection.m13568equalsimpl0(i, companion.m13575getLtrs_7Xco())) {
                return 0;
            }
            if (TextDirection.m13568equalsimpl0(i, companion.m13576getRtls_7Xco())) {
                return 1;
            }
            if (!(TextDirection.m13568equalsimpl0(i, companion.m13572getContents_7Xco()) ? true : TextDirection.m13568equalsimpl0(i, companion.m13577getUnspecifieds_7Xco()))) {
                throw new IllegalStateException("Invalid TextDirection.".toString());
            }
            if (localeList != null) {
                PlatformLocale platformLocale = localeList.get(0).getPlatformLocale();
                Intrinsics.checkNotNull(platformLocale, "null cannot be cast to non-null type androidx.compose.ui.text.intl.AndroidLocale");
                Locale javaLocale = ((AndroidLocale) platformLocale).getJavaLocale();
                if (javaLocale == null) {
                    javaLocale = Locale.getDefault();
                }
                int layoutDirectionFromLocale = TextUtilsCompat.getLayoutDirectionFromLocale(javaLocale);
                if (layoutDirectionFromLocale == 0 || layoutDirectionFromLocale != 1) {
                    return 2;
                }
            }
        }
        return 3;
    }

    @NotNull
    public static final ParagraphIntrinsics ActualParagraphIntrinsics(@NotNull String str, @NotNull TextStyle textStyle, @NotNull List<AnnotatedString.Range<SpanStyle>> list, @NotNull List<AnnotatedString.Range<Placeholder>> list2, @NotNull Density density, @NotNull FontFamily.Resolver resolver) {
        return new AndroidParagraphIntrinsics(str, textStyle, list, list2, resolver, density);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getHasEmojiCompat(TextStyle textStyle) {
        PlatformParagraphStyle paragraphSyle;
        PlatformTextStyle platformStyle = textStyle.getPlatformStyle();
        return !(((platformStyle == null || (paragraphSyle = platformStyle.getParagraphSyle()) == null) ? null : EmojiSupportMatch.m13029boximpl(paragraphSyle.getEmojiSupportMatch())) == null ? false : EmojiSupportMatch.m13032equalsimpl0(r1.getValue(), EmojiSupportMatch.INSTANCE.m13037getNone_3YsG6Y()));
    }
}
