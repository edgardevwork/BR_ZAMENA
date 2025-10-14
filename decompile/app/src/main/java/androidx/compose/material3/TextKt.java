package androidx.compose.material3;

import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.foundation.text.InlineTextContent;
import androidx.compose.material3.tokens.TypographyTokensKt;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ColorProducer;
import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.p003ui.text.style.Hyphens;
import androidx.compose.p003ui.text.style.LineBreak;
import androidx.compose.p003ui.text.style.TextAlign;
import androidx.compose.p003ui.text.style.TextDecoration;
import androidx.compose.p003ui.text.style.TextDirection;
import androidx.compose.p003ui.text.style.TextOverflow;
import androidx.compose.p003ui.unit.TextUnit;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.profileinstaller.ProfileVerifier;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Text.kt */
@Metadata(m7104d1 = {"\u0000\u008a\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a(\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0002\b\nH\u0007¢\u0006\u0002\u0010\u000b\u001aæ\u0001\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00142\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020\u00142\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020&2\u0014\b\u0002\u0010(\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0)2\u0014\b\u0002\u0010,\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u00060-2\b\b\u0002\u0010/\u001a\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b0\u00101\u001aÜ\u0001\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00142\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020\u00142\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\u0014\b\u0002\u0010(\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0)2\u0014\b\u0002\u0010,\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u00060-2\b\b\u0002\u0010/\u001a\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b2\u00103\u001aÆ\u0001\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020*2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00142\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020\u00142\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\u0014\b\u0002\u0010,\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u00060-2\b\b\u0002\u0010/\u001a\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b4\u00105\u001aÒ\u0001\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020*2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00142\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020\u00142\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020&2\u0016\b\u0002\u0010,\u001a\u0010\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u0006\u0018\u00010-2\b\b\u0002\u0010/\u001a\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b2\u00106\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00067"}, m7105d2 = {"LocalTextStyle", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/ui/text/TextStyle;", "getLocalTextStyle", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "ProvideTextStyle", "", "value", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Text", "text", "Landroidx/compose/ui/text/AnnotatedString;", "modifier", "Landroidx/compose/ui/Modifier;", "color", "Landroidx/compose/ui/graphics/Color;", TtmlNode.ATTR_TTS_FONT_SIZE, "Landroidx/compose/ui/unit/TextUnit;", TtmlNode.ATTR_TTS_FONT_STYLE, "Landroidx/compose/ui/text/font/FontStyle;", TtmlNode.ATTR_TTS_FONT_WEIGHT, "Landroidx/compose/ui/text/font/FontWeight;", TtmlNode.ATTR_TTS_FONT_FAMILY, "Landroidx/compose/ui/text/font/FontFamily;", "letterSpacing", TtmlNode.ATTR_TTS_TEXT_DECORATION, "Landroidx/compose/ui/text/style/TextDecoration;", TtmlNode.ATTR_TTS_TEXT_ALIGN, "Landroidx/compose/ui/text/style/TextAlign;", "lineHeight", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "softWrap", "", "maxLines", "", "minLines", "inlineContent", "", "", "Landroidx/compose/foundation/text/InlineTextContent;", "onTextLayout", "Lkotlin/Function1;", "Landroidx/compose/ui/text/TextLayoutResult;", "style", "Text-IbK3jfQ", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILjava/util/Map;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "Text--4IGK_g", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZILjava/util/Map;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "Text-fLXpl1I", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "material3_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Text.kt\nandroidx/compose/material3/TextKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,354:1\n74#2:355\n74#2:360\n74#2:361\n74#2:362\n74#2:367\n74#2:368\n74#2:369\n658#3:356\n646#3:357\n658#3:358\n646#3:359\n658#3:363\n646#3:364\n658#3:365\n646#3:366\n*S KotlinDebug\n*F\n+ 1 Text.kt\nandroidx/compose/material3/TextKt\n*L\n109#1:355\n114#1:360\n161#1:361\n255#1:362\n259#1:367\n308#1:368\n351#1:369\n112#1:356\n112#1:357\n113#1:358\n113#1:359\n257#1:363\n257#1:364\n258#1:365\n258#1:366\n*E\n"})
/* loaded from: classes2.dex */
public final class TextKt {

    @NotNull
    private static final ProvidableCompositionLocal<TextStyle> LocalTextStyle = CompositionLocalKt.compositionLocalOf(SnapshotStateKt.structuralEqualityPolicy(), new Function0<TextStyle>() { // from class: androidx.compose.material3.TextKt$LocalTextStyle$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final TextStyle invoke() {
            return TypographyTokensKt.getDefaultTextStyle();
        }
    });

    /* compiled from: Text.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.TextKt$ProvideTextStyle$1 */
    public static final class C16781 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C16781(Function2<? super Composer, ? super Integer, Unit> function2, int i) {
            super(2);
            function2 = function2;
            i = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            TextKt.ProvideTextStyle(textStyle, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:300:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:486:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:492:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:498:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:501:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:508:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:509:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:518:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:521:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:524:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:528:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:536:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:538:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:541:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:545:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:547:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: Text--4IGK_g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m10024Text4IGK_g(@NotNull final String str, @Nullable Modifier modifier, long j, long j2, @Nullable FontStyle fontStyle, @Nullable FontWeight fontWeight, @Nullable FontFamily fontFamily, long j3, @Nullable TextDecoration textDecoration, @Nullable TextAlign textAlign, long j4, int i, boolean z, int i2, int i3, @Nullable Function1<? super TextLayoutResult, Unit> function1, @Nullable TextStyle textStyle, @Nullable Composer composer, final int i4, final int i5, final int i6) {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        Modifier modifier2;
        long jM11376getUnspecified0d7_KjU;
        long jM13868getUnspecifiedXSAIIZE;
        FontStyle fontStyle2;
        FontWeight fontWeight2;
        FontFamily fontFamily2;
        long jM13868getUnspecifiedXSAIIZE2;
        TextDecoration textDecoration2;
        TextAlign textAlign2;
        long jM13868getUnspecifiedXSAIIZE3;
        int iM13607getClipgIe3tQ8;
        boolean z2;
        int i24;
        int i25;
        Function1<? super TextLayoutResult, Unit> function12;
        int i26;
        TextStyle textStyle2;
        int i27;
        Color.Companion companion;
        long j5;
        final int i28;
        final TextDecoration textDecoration3;
        final TextAlign textAlign3;
        final Modifier modifier3;
        final int i29;
        final FontStyle fontStyle3;
        final long j6;
        final int i30;
        final boolean z3;
        final Function1<? super TextLayoutResult, Unit> function13;
        final FontFamily fontFamily3;
        final long j7;
        final long j8;
        final long j9;
        final TextStyle textStyle3;
        final FontWeight fontWeight3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2055108902);
        if ((i6 & 1) != 0) {
            i7 = i4 | 6;
        } else if ((i4 & 6) == 0) {
            i7 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i4;
        } else {
            i7 = i4;
        }
        int i31 = i6 & 2;
        if (i31 != 0) {
            i7 |= 48;
        } else {
            if ((i4 & 48) == 0) {
                i7 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            i8 = i6 & 4;
            if (i8 == 0) {
                i7 |= 384;
            } else if ((i4 & 384) == 0) {
                i7 |= composerStartRestartGroup.changed(j) ? 256 : 128;
            }
            i9 = i6 & 8;
            if (i9 == 0) {
                i7 |= 3072;
            } else if ((i4 & 3072) == 0) {
                i7 |= composerStartRestartGroup.changed(j2) ? 2048 : 1024;
            }
            i10 = i6 & 16;
            if (i10 == 0) {
                i7 |= CpioConstants.C_ISBLK;
            } else {
                if ((i4 & CpioConstants.C_ISBLK) == 0) {
                    i7 |= composerStartRestartGroup.changed(fontStyle) ? 16384 : 8192;
                }
                i11 = i6 & 32;
                if (i11 != 0) {
                    i7 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                } else if ((i4 & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
                    i7 |= composerStartRestartGroup.changed(fontWeight) ? 131072 : 65536;
                }
                i12 = i6 & 64;
                if (i12 != 0) {
                    i7 |= 1572864;
                } else if ((i4 & 1572864) == 0) {
                    i7 |= composerStartRestartGroup.changed(fontFamily) ? 1048576 : 524288;
                }
                i13 = i6 & 128;
                if (i13 != 0) {
                    i7 |= 12582912;
                } else if ((i4 & 12582912) == 0) {
                    i7 |= composerStartRestartGroup.changed(j3) ? 8388608 : 4194304;
                }
                i14 = i6 & 256;
                if (i14 != 0) {
                    i7 |= 100663296;
                } else {
                    if ((100663296 & i4) == 0) {
                        i7 |= composerStartRestartGroup.changed(textDecoration) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                    }
                    i15 = i6 & 512;
                    if (i15 == 0) {
                        i7 |= 805306368;
                    } else if ((i4 & 805306368) == 0) {
                        i7 |= composerStartRestartGroup.changed(textAlign) ? 536870912 : 268435456;
                    }
                    i16 = i6 & 1024;
                    if (i16 == 0) {
                        i17 = i5 | 6;
                    } else if ((i5 & 6) == 0) {
                        i17 = i5 | (composerStartRestartGroup.changed(j4) ? 4 : 2);
                    } else {
                        i17 = i5;
                    }
                    i18 = i6 & 2048;
                    if (i18 == 0) {
                        i17 |= 48;
                    } else if ((i5 & 48) == 0) {
                        i17 |= composerStartRestartGroup.changed(i) ? 32 : 16;
                    }
                    int i32 = i17;
                    i19 = i6 & 4096;
                    if (i19 == 0) {
                        i32 |= 384;
                    } else {
                        if ((i5 & 384) == 0) {
                            i32 |= composerStartRestartGroup.changed(z) ? 256 : 128;
                        }
                        i20 = i6 & 8192;
                        if (i20 != 0) {
                            i32 |= 3072;
                        } else {
                            if ((i5 & 3072) == 0) {
                                i32 |= composerStartRestartGroup.changed(i2) ? 2048 : 1024;
                            }
                            i21 = i6 & 16384;
                            if (i21 != 0) {
                                i22 = i21;
                                if ((i5 & CpioConstants.C_ISBLK) == 0) {
                                    i32 |= composerStartRestartGroup.changed(i3) ? 16384 : 8192;
                                }
                                i23 = i6 & 32768;
                                if (i23 != 0) {
                                    i32 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                                } else if ((i5 & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
                                    i32 |= composerStartRestartGroup.changedInstance(function1) ? 131072 : 65536;
                                }
                                if ((i5 & 1572864) == 0) {
                                    i32 |= ((i6 & 65536) == 0 && composerStartRestartGroup.changed(textStyle)) ? 1048576 : 524288;
                                }
                                if ((i7 & 306783379) != 306783378 || (599187 & i32) != 599186 || !composerStartRestartGroup.getSkipping()) {
                                    composerStartRestartGroup.startDefaults();
                                    if ((i4 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                        modifier2 = i31 == 0 ? Modifier.INSTANCE : modifier;
                                        jM11376getUnspecified0d7_KjU = i8 == 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j;
                                        jM13868getUnspecifiedXSAIIZE = i9 == 0 ? TextUnit.INSTANCE.m13868getUnspecifiedXSAIIZE() : j2;
                                        fontStyle2 = i10 == 0 ? null : fontStyle;
                                        fontWeight2 = i11 == 0 ? null : fontWeight;
                                        fontFamily2 = i12 == 0 ? null : fontFamily;
                                        jM13868getUnspecifiedXSAIIZE2 = i13 == 0 ? TextUnit.INSTANCE.m13868getUnspecifiedXSAIIZE() : j3;
                                        textDecoration2 = i14 == 0 ? null : textDecoration;
                                        textAlign2 = i15 == 0 ? null : textAlign;
                                        jM13868getUnspecifiedXSAIIZE3 = i16 == 0 ? TextUnit.INSTANCE.m13868getUnspecifiedXSAIIZE() : j4;
                                        iM13607getClipgIe3tQ8 = i18 == 0 ? TextOverflow.INSTANCE.m13607getClipgIe3tQ8() : i;
                                        z2 = i19 == 0 ? true : z;
                                        i24 = i20 == 0 ? Integer.MAX_VALUE : i2;
                                        i25 = i22 == 0 ? i3 : 1;
                                        function12 = i23 == 0 ? function1 : null;
                                        TextDecoration textDecoration4 = textDecoration2;
                                        if ((i6 & 65536) == 0) {
                                            i26 = i32 & (-3670017);
                                            textStyle2 = (TextStyle) composerStartRestartGroup.consume(LocalTextStyle);
                                            textDecoration2 = textDecoration4;
                                        }
                                        composerStartRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                            i27 = i24;
                                            ComposerKt.traceEventStart(-2055108902, i7, i26, "androidx.compose.material3.Text (Text.kt:109)");
                                        } else {
                                            i27 = i24;
                                        }
                                        composerStartRestartGroup.startReplaceableGroup(79582827);
                                        companion = Color.INSTANCE;
                                        if (jM11376getUnspecified0d7_KjU != companion.m11376getUnspecified0d7_KjU()) {
                                            j5 = jM11376getUnspecified0d7_KjU;
                                        } else {
                                            composerStartRestartGroup.startReplaceableGroup(79582860);
                                            long jM13195getColor0d7_KjU = textStyle2.m13195getColor0d7_KjU();
                                            if (jM13195getColor0d7_KjU == companion.m11376getUnspecified0d7_KjU()) {
                                                jM13195getColor0d7_KjU = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m11350unboximpl();
                                            }
                                            composerStartRestartGroup.endReplaceableGroup();
                                            j5 = jM13195getColor0d7_KjU;
                                        }
                                        composerStartRestartGroup.endReplaceableGroup();
                                        int i33 = (i7 & 126) | ((i26 >> 6) & 7168);
                                        int i34 = i26 << 9;
                                        BasicTextKt.m8402BasicTextVhcvRP8(str, modifier2, textStyle2.m13210mergedA7vx0o((16609105 & 1) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j5, (16609105 & 2) != 0 ? TextUnit.INSTANCE.m13868getUnspecifiedXSAIIZE() : jM13868getUnspecifiedXSAIIZE, (16609105 & 4) != 0 ? null : fontWeight2, (16609105 & 8) != 0 ? null : fontStyle2, (16609105 & 16) != 0 ? null : null, (16609105 & 32) != 0 ? null : fontFamily2, (16609105 & 64) != 0 ? null : null, (16609105 & 128) != 0 ? TextUnit.INSTANCE.m13868getUnspecifiedXSAIIZE() : jM13868getUnspecifiedXSAIIZE2, (16609105 & 256) != 0 ? null : null, (16609105 & 512) != 0 ? null : null, (16609105 & 1024) != 0 ? null : null, (16609105 & 2048) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : 0L, (16609105 & 4096) != 0 ? null : textDecoration2, (16609105 & 8192) != 0 ? null : null, (16609105 & 16384) != 0 ? null : null, (16609105 & 32768) != 0 ? TextAlign.INSTANCE.m13564getUnspecifiede0LSkKk() : textAlign2 != null ? textAlign2.getValue() : TextAlign.INSTANCE.m13564getUnspecifiede0LSkKk(), (16609105 & 65536) != 0 ? TextDirection.INSTANCE.m13577getUnspecifieds_7Xco() : 0, (16609105 & 131072) != 0 ? TextUnit.INSTANCE.m13868getUnspecifiedXSAIIZE() : jM13868getUnspecifiedXSAIIZE3, (16609105 & 262144) != 0 ? null : null, (16609105 & 524288) != 0 ? null : null, (16609105 & 1048576) != 0 ? LineBreak.INSTANCE.m13491getUnspecifiedrAG3T2k() : 0, (16609105 & 2097152) != 0 ? Hyphens.INSTANCE.m13470getUnspecifiedvmbZdU8() : 0, (16609105 & 4194304) != 0 ? null : null, (16609105 & 8388608) != 0 ? null : null), function12, iM13607getClipgIe3tQ8, z2, i27, i25, (ColorProducer) null, composerStartRestartGroup, i33 | (57344 & i34) | (458752 & i34) | (3670016 & i34) | (i34 & 29360128), 256);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        i28 = i27;
                                        textDecoration3 = textDecoration2;
                                        textAlign3 = textAlign2;
                                        modifier3 = modifier2;
                                        i29 = iM13607getClipgIe3tQ8;
                                        fontStyle3 = fontStyle2;
                                        j6 = jM13868getUnspecifiedXSAIIZE;
                                        i30 = i25;
                                        z3 = z2;
                                        function13 = function12;
                                        fontFamily3 = fontFamily2;
                                        j7 = jM13868getUnspecifiedXSAIIZE3;
                                        j8 = jM11376getUnspecified0d7_KjU;
                                        j9 = jM13868getUnspecifiedXSAIIZE2;
                                        FontWeight fontWeight4 = fontWeight2;
                                        textStyle3 = textStyle2;
                                        fontWeight3 = fontWeight4;
                                    } else {
                                        composerStartRestartGroup.skipToGroupEnd();
                                        if ((i6 & 65536) != 0) {
                                            i32 &= -3670017;
                                        }
                                        modifier2 = modifier;
                                        jM11376getUnspecified0d7_KjU = j;
                                        jM13868getUnspecifiedXSAIIZE = j2;
                                        fontStyle2 = fontStyle;
                                        fontWeight2 = fontWeight;
                                        fontFamily2 = fontFamily;
                                        jM13868getUnspecifiedXSAIIZE2 = j3;
                                        textDecoration2 = textDecoration;
                                        textAlign2 = textAlign;
                                        jM13868getUnspecifiedXSAIIZE3 = j4;
                                        iM13607getClipgIe3tQ8 = i;
                                        z2 = z;
                                        i24 = i2;
                                        i25 = i3;
                                        function12 = function1;
                                    }
                                    i26 = i32;
                                    textStyle2 = textStyle;
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    composerStartRestartGroup.startReplaceableGroup(79582827);
                                    companion = Color.INSTANCE;
                                    if (jM11376getUnspecified0d7_KjU != companion.m11376getUnspecified0d7_KjU()) {
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    int i332 = (i7 & 126) | ((i26 >> 6) & 7168);
                                    int i342 = i26 << 9;
                                    BasicTextKt.m8402BasicTextVhcvRP8(str, modifier2, textStyle2.m13210mergedA7vx0o((16609105 & 1) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j5, (16609105 & 2) != 0 ? TextUnit.INSTANCE.m13868getUnspecifiedXSAIIZE() : jM13868getUnspecifiedXSAIIZE, (16609105 & 4) != 0 ? null : fontWeight2, (16609105 & 8) != 0 ? null : fontStyle2, (16609105 & 16) != 0 ? null : null, (16609105 & 32) != 0 ? null : fontFamily2, (16609105 & 64) != 0 ? null : null, (16609105 & 128) != 0 ? TextUnit.INSTANCE.m13868getUnspecifiedXSAIIZE() : jM13868getUnspecifiedXSAIIZE2, (16609105 & 256) != 0 ? null : null, (16609105 & 512) != 0 ? null : null, (16609105 & 1024) != 0 ? null : null, (16609105 & 2048) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : 0L, (16609105 & 4096) != 0 ? null : textDecoration2, (16609105 & 8192) != 0 ? null : null, (16609105 & 16384) != 0 ? null : null, (16609105 & 32768) != 0 ? TextAlign.INSTANCE.m13564getUnspecifiede0LSkKk() : textAlign2 != null ? textAlign2.getValue() : TextAlign.INSTANCE.m13564getUnspecifiede0LSkKk(), (16609105 & 65536) != 0 ? TextDirection.INSTANCE.m13577getUnspecifieds_7Xco() : 0, (16609105 & 131072) != 0 ? TextUnit.INSTANCE.m13868getUnspecifiedXSAIIZE() : jM13868getUnspecifiedXSAIIZE3, (16609105 & 262144) != 0 ? null : null, (16609105 & 524288) != 0 ? null : null, (16609105 & 1048576) != 0 ? LineBreak.INSTANCE.m13491getUnspecifiedrAG3T2k() : 0, (16609105 & 2097152) != 0 ? Hyphens.INSTANCE.m13470getUnspecifiedvmbZdU8() : 0, (16609105 & 4194304) != 0 ? null : null, (16609105 & 8388608) != 0 ? null : null), function12, iM13607getClipgIe3tQ8, z2, i27, i25, (ColorProducer) null, composerStartRestartGroup, i332 | (57344 & i342) | (458752 & i342) | (3670016 & i342) | (i342 & 29360128), 256);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    i28 = i27;
                                    textDecoration3 = textDecoration2;
                                    textAlign3 = textAlign2;
                                    modifier3 = modifier2;
                                    i29 = iM13607getClipgIe3tQ8;
                                    fontStyle3 = fontStyle2;
                                    j6 = jM13868getUnspecifiedXSAIIZE;
                                    i30 = i25;
                                    z3 = z2;
                                    function13 = function12;
                                    fontFamily3 = fontFamily2;
                                    j7 = jM13868getUnspecifiedXSAIIZE3;
                                    j8 = jM11376getUnspecified0d7_KjU;
                                    j9 = jM13868getUnspecifiedXSAIIZE2;
                                    FontWeight fontWeight42 = fontWeight2;
                                    textStyle3 = textStyle2;
                                    fontWeight3 = fontWeight42;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    modifier3 = modifier;
                                    j8 = j;
                                    j6 = j2;
                                    fontStyle3 = fontStyle;
                                    fontWeight3 = fontWeight;
                                    fontFamily3 = fontFamily;
                                    j9 = j3;
                                    textDecoration3 = textDecoration;
                                    textAlign3 = textAlign;
                                    j7 = j4;
                                    i29 = i;
                                    z3 = z;
                                    i28 = i2;
                                    i30 = i3;
                                    function13 = function1;
                                    textStyle3 = textStyle;
                                }
                                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextKt$Text$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                            invoke(composer2, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(@Nullable Composer composer2, int i35) {
                                            TextKt.m10024Text4IGK_g(str, modifier3, j8, j6, fontStyle3, fontWeight3, fontFamily3, j9, textDecoration3, textAlign3, j7, i29, z3, i28, i30, function13, textStyle3, composer2, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), RecomposeScopeImplKt.updateChangedFlags(i5), i6);
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i32 |= CpioConstants.C_ISBLK;
                            i22 = i21;
                            i23 = i6 & 32768;
                            if (i23 != 0) {
                            }
                            if ((i5 & 1572864) == 0) {
                            }
                            if ((i7 & 306783379) != 306783378) {
                                composerStartRestartGroup.startDefaults();
                                if ((i4 & 1) != 0) {
                                    if (i31 == 0) {
                                    }
                                    if (i8 == 0) {
                                    }
                                    if (i9 == 0) {
                                    }
                                    if (i10 == 0) {
                                    }
                                    if (i11 == 0) {
                                    }
                                    if (i12 == 0) {
                                    }
                                    if (i13 == 0) {
                                    }
                                    if (i14 == 0) {
                                    }
                                    if (i15 == 0) {
                                    }
                                    if (i16 == 0) {
                                    }
                                    if (i18 == 0) {
                                    }
                                    if (i19 == 0) {
                                    }
                                    if (i20 == 0) {
                                    }
                                    if (i22 == 0) {
                                    }
                                    if (i23 == 0) {
                                    }
                                    TextDecoration textDecoration42 = textDecoration2;
                                    if ((i6 & 65536) == 0) {
                                        i26 = i32;
                                        textStyle2 = textStyle;
                                    }
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    composerStartRestartGroup.startReplaceableGroup(79582827);
                                    companion = Color.INSTANCE;
                                    if (jM11376getUnspecified0d7_KjU != companion.m11376getUnspecified0d7_KjU()) {
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    int i3322 = (i7 & 126) | ((i26 >> 6) & 7168);
                                    int i3422 = i26 << 9;
                                    BasicTextKt.m8402BasicTextVhcvRP8(str, modifier2, textStyle2.m13210mergedA7vx0o((16609105 & 1) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j5, (16609105 & 2) != 0 ? TextUnit.INSTANCE.m13868getUnspecifiedXSAIIZE() : jM13868getUnspecifiedXSAIIZE, (16609105 & 4) != 0 ? null : fontWeight2, (16609105 & 8) != 0 ? null : fontStyle2, (16609105 & 16) != 0 ? null : null, (16609105 & 32) != 0 ? null : fontFamily2, (16609105 & 64) != 0 ? null : null, (16609105 & 128) != 0 ? TextUnit.INSTANCE.m13868getUnspecifiedXSAIIZE() : jM13868getUnspecifiedXSAIIZE2, (16609105 & 256) != 0 ? null : null, (16609105 & 512) != 0 ? null : null, (16609105 & 1024) != 0 ? null : null, (16609105 & 2048) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : 0L, (16609105 & 4096) != 0 ? null : textDecoration2, (16609105 & 8192) != 0 ? null : null, (16609105 & 16384) != 0 ? null : null, (16609105 & 32768) != 0 ? TextAlign.INSTANCE.m13564getUnspecifiede0LSkKk() : textAlign2 != null ? textAlign2.getValue() : TextAlign.INSTANCE.m13564getUnspecifiede0LSkKk(), (16609105 & 65536) != 0 ? TextDirection.INSTANCE.m13577getUnspecifieds_7Xco() : 0, (16609105 & 131072) != 0 ? TextUnit.INSTANCE.m13868getUnspecifiedXSAIIZE() : jM13868getUnspecifiedXSAIIZE3, (16609105 & 262144) != 0 ? null : null, (16609105 & 524288) != 0 ? null : null, (16609105 & 1048576) != 0 ? LineBreak.INSTANCE.m13491getUnspecifiedrAG3T2k() : 0, (16609105 & 2097152) != 0 ? Hyphens.INSTANCE.m13470getUnspecifiedvmbZdU8() : 0, (16609105 & 4194304) != 0 ? null : null, (16609105 & 8388608) != 0 ? null : null), function12, iM13607getClipgIe3tQ8, z2, i27, i25, (ColorProducer) null, composerStartRestartGroup, i3322 | (57344 & i3422) | (458752 & i3422) | (3670016 & i3422) | (i3422 & 29360128), 256);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    i28 = i27;
                                    textDecoration3 = textDecoration2;
                                    textAlign3 = textAlign2;
                                    modifier3 = modifier2;
                                    i29 = iM13607getClipgIe3tQ8;
                                    fontStyle3 = fontStyle2;
                                    j6 = jM13868getUnspecifiedXSAIIZE;
                                    i30 = i25;
                                    z3 = z2;
                                    function13 = function12;
                                    fontFamily3 = fontFamily2;
                                    j7 = jM13868getUnspecifiedXSAIIZE3;
                                    j8 = jM11376getUnspecified0d7_KjU;
                                    j9 = jM13868getUnspecifiedXSAIIZE2;
                                    FontWeight fontWeight422 = fontWeight2;
                                    textStyle3 = textStyle2;
                                    fontWeight3 = fontWeight422;
                                }
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                            }
                        }
                        i21 = i6 & 16384;
                        if (i21 != 0) {
                        }
                        i23 = i6 & 32768;
                        if (i23 != 0) {
                        }
                        if ((i5 & 1572864) == 0) {
                        }
                        if ((i7 & 306783379) != 306783378) {
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    i20 = i6 & 8192;
                    if (i20 != 0) {
                    }
                    i21 = i6 & 16384;
                    if (i21 != 0) {
                    }
                    i23 = i6 & 32768;
                    if (i23 != 0) {
                    }
                    if ((i5 & 1572864) == 0) {
                    }
                    if ((i7 & 306783379) != 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                i15 = i6 & 512;
                if (i15 == 0) {
                }
                i16 = i6 & 1024;
                if (i16 == 0) {
                }
                i18 = i6 & 2048;
                if (i18 == 0) {
                }
                int i322 = i17;
                i19 = i6 & 4096;
                if (i19 == 0) {
                }
                i20 = i6 & 8192;
                if (i20 != 0) {
                }
                i21 = i6 & 16384;
                if (i21 != 0) {
                }
                i23 = i6 & 32768;
                if (i23 != 0) {
                }
                if ((i5 & 1572864) == 0) {
                }
                if ((i7 & 306783379) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            i11 = i6 & 32;
            if (i11 != 0) {
            }
            i12 = i6 & 64;
            if (i12 != 0) {
            }
            i13 = i6 & 128;
            if (i13 != 0) {
            }
            i14 = i6 & 256;
            if (i14 != 0) {
            }
            i15 = i6 & 512;
            if (i15 == 0) {
            }
            i16 = i6 & 1024;
            if (i16 == 0) {
            }
            i18 = i6 & 2048;
            if (i18 == 0) {
            }
            int i3222 = i17;
            i19 = i6 & 4096;
            if (i19 == 0) {
            }
            i20 = i6 & 8192;
            if (i20 != 0) {
            }
            i21 = i6 & 16384;
            if (i21 != 0) {
            }
            i23 = i6 & 32768;
            if (i23 != 0) {
            }
            if ((i5 & 1572864) == 0) {
            }
            if ((i7 & 306783379) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i8 = i6 & 4;
        if (i8 == 0) {
        }
        i9 = i6 & 8;
        if (i9 == 0) {
        }
        i10 = i6 & 16;
        if (i10 == 0) {
        }
        i11 = i6 & 32;
        if (i11 != 0) {
        }
        i12 = i6 & 64;
        if (i12 != 0) {
        }
        i13 = i6 & 128;
        if (i13 != 0) {
        }
        i14 = i6 & 256;
        if (i14 != 0) {
        }
        i15 = i6 & 512;
        if (i15 == 0) {
        }
        i16 = i6 & 1024;
        if (i16 == 0) {
        }
        i18 = i6 & 2048;
        if (i18 == 0) {
        }
        int i32222 = i17;
        i19 = i6 & 4096;
        if (i19 == 0) {
        }
        i20 = i6 & 8192;
        if (i20 != 0) {
        }
        i21 = i6 & 16384;
        if (i21 != 0) {
        }
        i23 = i6 & 32768;
        if (i23 != 0) {
        }
        if ((i5 & 1572864) == 0) {
        }
        if ((i7 & 306783379) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:273:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:493:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use version with minLines instead")
    @Composable
    /* renamed from: Text-fLXpl1I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m10026TextfLXpl1I(final String str, Modifier modifier, long j, long j2, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j3, TextDecoration textDecoration, TextAlign textAlign, long j4, int i, boolean z, int i2, Function1 function1, TextStyle textStyle, Composer composer, final int i3, final int i4, final int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        Modifier modifier2;
        long jM11376getUnspecified0d7_KjU;
        TextAlign textAlign2;
        TextStyle textStyle2;
        long j5;
        int i22;
        boolean z2;
        int i23;
        int i24;
        Function1 function12;
        long j6;
        FontStyle fontStyle2;
        FontWeight fontWeight2;
        FontFamily fontFamily2;
        long j7;
        final TextDecoration textDecoration2;
        Composer composer2;
        final TextAlign textAlign3;
        final long j8;
        final int i25;
        final boolean z3;
        final int i26;
        final Function1 function13;
        final TextStyle textStyle3;
        final FontStyle fontStyle3;
        final FontWeight fontWeight3;
        final FontFamily fontFamily3;
        final Modifier modifier3;
        final long j9;
        final long j10;
        final long j11;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1968784669);
        if ((i5 & 1) != 0) {
            i6 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i6 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        int i27 = i5 & 2;
        if (i27 != 0) {
            i6 |= 48;
        } else {
            if ((i3 & 48) == 0) {
                i6 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            i7 = i5 & 4;
            if (i7 == 0) {
                i6 |= 384;
            } else if ((i3 & 384) == 0) {
                i6 |= composerStartRestartGroup.changed(j) ? 256 : 128;
            }
            i8 = i5 & 8;
            if (i8 == 0) {
                i6 |= 3072;
            } else if ((i3 & 3072) == 0) {
                i6 |= composerStartRestartGroup.changed(j2) ? 2048 : 1024;
            }
            i9 = i5 & 16;
            if (i9 == 0) {
                i6 |= CpioConstants.C_ISBLK;
            } else {
                if ((i3 & CpioConstants.C_ISBLK) == 0) {
                    i6 |= composerStartRestartGroup.changed(fontStyle) ? 16384 : 8192;
                }
                i10 = i5 & 32;
                int i28 = 65536;
                if (i10 != 0) {
                    i6 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                } else if ((i3 & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
                    i6 |= composerStartRestartGroup.changed(fontWeight) ? 131072 : 65536;
                }
                i11 = i5 & 64;
                if (i11 != 0) {
                    i6 |= 1572864;
                } else if ((i3 & 1572864) == 0) {
                    i6 |= composerStartRestartGroup.changed(fontFamily) ? 1048576 : 524288;
                }
                i12 = i5 & 128;
                if (i12 != 0) {
                    i6 |= 12582912;
                } else if ((i3 & 12582912) == 0) {
                    i6 |= composerStartRestartGroup.changed(j3) ? 8388608 : 4194304;
                }
                i13 = i5 & 256;
                if (i13 != 0) {
                    i6 |= 100663296;
                } else {
                    if ((100663296 & i3) == 0) {
                        i6 |= composerStartRestartGroup.changed(textDecoration) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                    }
                    i14 = i5 & 512;
                    if (i14 == 0) {
                        i6 |= 805306368;
                    } else if ((i3 & 805306368) == 0) {
                        i6 |= composerStartRestartGroup.changed(textAlign) ? 536870912 : 268435456;
                    }
                    i15 = i5 & 1024;
                    if (i15 == 0) {
                        i16 = i4 | 6;
                    } else if ((i4 & 6) == 0) {
                        i16 = i4 | (composerStartRestartGroup.changed(j4) ? 4 : 2);
                    } else {
                        i16 = i4;
                    }
                    i17 = i5 & 2048;
                    if (i17 == 0) {
                        i16 |= 48;
                    } else if ((i4 & 48) == 0) {
                        i16 |= composerStartRestartGroup.changed(i) ? 32 : 16;
                    }
                    int i29 = i16;
                    i18 = i5 & 4096;
                    if (i18 == 0) {
                        i29 |= 384;
                    } else {
                        if ((i4 & 384) == 0) {
                            i29 |= composerStartRestartGroup.changed(z) ? 256 : 128;
                        }
                        i19 = i5 & 8192;
                        if (i19 != 0) {
                            i29 |= 3072;
                        } else {
                            if ((i4 & 3072) == 0) {
                                i29 |= composerStartRestartGroup.changed(i2) ? 2048 : 1024;
                            }
                            i20 = i5 & 16384;
                            if (i20 != 0) {
                                i21 = i20;
                                if ((i4 & CpioConstants.C_ISBLK) == 0) {
                                    i29 |= composerStartRestartGroup.changedInstance(function1) ? 16384 : 8192;
                                }
                                if ((i4 & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
                                    if ((i5 & 32768) == 0 && composerStartRestartGroup.changed(textStyle)) {
                                        i28 = 131072;
                                    }
                                    i29 |= i28;
                                }
                                if ((i6 & 306783379) != 306783378 || (74899 & i29) != 74898 || !composerStartRestartGroup.getSkipping()) {
                                    composerStartRestartGroup.startDefaults();
                                    if ((i3 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                        modifier2 = i27 == 0 ? Modifier.INSTANCE : modifier;
                                        jM11376getUnspecified0d7_KjU = i7 == 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j;
                                        long jM13868getUnspecifiedXSAIIZE = i8 == 0 ? TextUnit.INSTANCE.m13868getUnspecifiedXSAIIZE() : j2;
                                        FontStyle fontStyle4 = i9 == 0 ? null : fontStyle;
                                        FontWeight fontWeight4 = i10 == 0 ? null : fontWeight;
                                        FontFamily fontFamily4 = i11 == 0 ? null : fontFamily;
                                        long jM13868getUnspecifiedXSAIIZE2 = i12 == 0 ? TextUnit.INSTANCE.m13868getUnspecifiedXSAIIZE() : j3;
                                        TextDecoration textDecoration3 = i13 == 0 ? null : textDecoration;
                                        textAlign2 = i14 == 0 ? textAlign : null;
                                        long jM13868getUnspecifiedXSAIIZE3 = i15 == 0 ? TextUnit.INSTANCE.m13868getUnspecifiedXSAIIZE() : j4;
                                        int iM13607getClipgIe3tQ8 = i17 == 0 ? TextOverflow.INSTANCE.m13607getClipgIe3tQ8() : i;
                                        boolean z4 = i18 == 0 ? true : z;
                                        int i30 = i19 == 0 ? Integer.MAX_VALUE : i2;
                                        Function1 function14 = i21 == 0 ? new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.material3.TextKt$Text$2
                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                                invoke2(textLayoutResult);
                                                return Unit.INSTANCE;
                                            }
                                        } : function1;
                                        TextDecoration textDecoration4 = textDecoration3;
                                        if ((i5 & 32768) == 0) {
                                            i29 &= -458753;
                                            textStyle2 = (TextStyle) composerStartRestartGroup.consume(LocalTextStyle);
                                        } else {
                                            textStyle2 = textStyle;
                                        }
                                        j5 = jM13868getUnspecifiedXSAIIZE3;
                                        i22 = iM13607getClipgIe3tQ8;
                                        z2 = z4;
                                        i23 = i29;
                                        i24 = i30;
                                        function12 = function14;
                                        j6 = jM13868getUnspecifiedXSAIIZE;
                                        fontStyle2 = fontStyle4;
                                        fontWeight2 = fontWeight4;
                                        fontFamily2 = fontFamily4;
                                        j7 = jM13868getUnspecifiedXSAIIZE2;
                                        textDecoration2 = textDecoration4;
                                    } else {
                                        composerStartRestartGroup.skipToGroupEnd();
                                        if ((i5 & 32768) != 0) {
                                            i29 &= -458753;
                                        }
                                        modifier2 = modifier;
                                        jM11376getUnspecified0d7_KjU = j;
                                        j6 = j2;
                                        fontStyle2 = fontStyle;
                                        fontWeight2 = fontWeight;
                                        fontFamily2 = fontFamily;
                                        textDecoration2 = textDecoration;
                                        textAlign2 = textAlign;
                                        j5 = j4;
                                        i22 = i;
                                        z2 = z;
                                        i24 = i2;
                                        function12 = function1;
                                        textStyle2 = textStyle;
                                        i23 = i29;
                                        j7 = j3;
                                    }
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        composer2 = composerStartRestartGroup;
                                    } else {
                                        composer2 = composerStartRestartGroup;
                                        ComposerKt.traceEventStart(1968784669, i6, i23, "androidx.compose.material3.Text (Text.kt:161)");
                                    }
                                    int i31 = i23 << 3;
                                    m10024Text4IGK_g(str, modifier2, jM11376getUnspecified0d7_KjU, j6, fontStyle2, fontWeight2, fontFamily2, j7, textDecoration2, textAlign2, j5, i22, z2, i24, 1, (Function1<? super TextLayoutResult, Unit>) function12, textStyle2, composer2, i6 & 2147483646, (i23 & 14) | CpioConstants.C_ISBLK | (i23 & 112) | (i23 & 896) | (i23 & 7168) | (458752 & i31) | (i31 & 3670016), 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    textAlign3 = textAlign2;
                                    j8 = j5;
                                    i25 = i22;
                                    z3 = z2;
                                    i26 = i24;
                                    function13 = function12;
                                    textStyle3 = textStyle2;
                                    FontFamily fontFamily5 = fontFamily2;
                                    fontStyle3 = fontStyle2;
                                    long j12 = j7;
                                    fontWeight3 = fontWeight2;
                                    fontFamily3 = fontFamily5;
                                    long j13 = j6;
                                    modifier3 = modifier2;
                                    j9 = j13;
                                    j10 = jM11376getUnspecified0d7_KjU;
                                    j11 = j12;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    modifier3 = modifier;
                                    j10 = j;
                                    j9 = j2;
                                    fontStyle3 = fontStyle;
                                    fontWeight3 = fontWeight;
                                    fontFamily3 = fontFamily;
                                    j11 = j3;
                                    textDecoration2 = textDecoration;
                                    textAlign3 = textAlign;
                                    j8 = j4;
                                    i25 = i;
                                    z3 = z;
                                    i26 = i2;
                                    function13 = function1;
                                    textStyle3 = textStyle;
                                    composer2 = composerStartRestartGroup;
                                }
                                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextKt$Text$3
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            invoke(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(@Nullable Composer composer3, int i32) {
                                            TextKt.m10026TextfLXpl1I(str, modifier3, j10, j9, fontStyle3, fontWeight3, fontFamily3, j11, textDecoration2, textAlign3, j8, i25, z3, i26, function13, textStyle3, composer3, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i29 |= CpioConstants.C_ISBLK;
                            i21 = i20;
                            if ((i4 & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
                            }
                            if ((i6 & 306783379) != 306783378) {
                                composerStartRestartGroup.startDefaults();
                                if ((i3 & 1) != 0) {
                                    if (i27 == 0) {
                                    }
                                    if (i7 == 0) {
                                    }
                                    if (i8 == 0) {
                                    }
                                    if (i9 == 0) {
                                    }
                                    if (i10 == 0) {
                                    }
                                    if (i11 == 0) {
                                    }
                                    if (i12 == 0) {
                                    }
                                    if (i13 == 0) {
                                    }
                                    if (i14 == 0) {
                                    }
                                    if (i15 == 0) {
                                    }
                                    if (i17 == 0) {
                                    }
                                    if (i18 == 0) {
                                    }
                                    if (i19 == 0) {
                                    }
                                    if (i21 == 0) {
                                    }
                                    TextDecoration textDecoration42 = textDecoration3;
                                    if ((i5 & 32768) == 0) {
                                    }
                                    j5 = jM13868getUnspecifiedXSAIIZE3;
                                    i22 = iM13607getClipgIe3tQ8;
                                    z2 = z4;
                                    i23 = i29;
                                    i24 = i30;
                                    function12 = function14;
                                    j6 = jM13868getUnspecifiedXSAIIZE;
                                    fontStyle2 = fontStyle4;
                                    fontWeight2 = fontWeight4;
                                    fontFamily2 = fontFamily4;
                                    j7 = jM13868getUnspecifiedXSAIIZE2;
                                    textDecoration2 = textDecoration42;
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    int i312 = i23 << 3;
                                    m10024Text4IGK_g(str, modifier2, jM11376getUnspecified0d7_KjU, j6, fontStyle2, fontWeight2, fontFamily2, j7, textDecoration2, textAlign2, j5, i22, z2, i24, 1, (Function1<? super TextLayoutResult, Unit>) function12, textStyle2, composer2, i6 & 2147483646, (i23 & 14) | CpioConstants.C_ISBLK | (i23 & 112) | (i23 & 896) | (i23 & 7168) | (458752 & i312) | (i312 & 3670016), 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    textAlign3 = textAlign2;
                                    j8 = j5;
                                    i25 = i22;
                                    z3 = z2;
                                    i26 = i24;
                                    function13 = function12;
                                    textStyle3 = textStyle2;
                                    FontFamily fontFamily52 = fontFamily2;
                                    fontStyle3 = fontStyle2;
                                    long j122 = j7;
                                    fontWeight3 = fontWeight2;
                                    fontFamily3 = fontFamily52;
                                    long j132 = j6;
                                    modifier3 = modifier2;
                                    j9 = j132;
                                    j10 = jM11376getUnspecified0d7_KjU;
                                    j11 = j122;
                                }
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                            }
                        }
                        i20 = i5 & 16384;
                        if (i20 != 0) {
                        }
                        if ((i4 & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
                        }
                        if ((i6 & 306783379) != 306783378) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    i19 = i5 & 8192;
                    if (i19 != 0) {
                    }
                    i20 = i5 & 16384;
                    if (i20 != 0) {
                    }
                    if ((i4 & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
                    }
                    if ((i6 & 306783379) != 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                i14 = i5 & 512;
                if (i14 == 0) {
                }
                i15 = i5 & 1024;
                if (i15 == 0) {
                }
                i17 = i5 & 2048;
                if (i17 == 0) {
                }
                int i292 = i16;
                i18 = i5 & 4096;
                if (i18 == 0) {
                }
                i19 = i5 & 8192;
                if (i19 != 0) {
                }
                i20 = i5 & 16384;
                if (i20 != 0) {
                }
                if ((i4 & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
                }
                if ((i6 & 306783379) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            i10 = i5 & 32;
            int i282 = 65536;
            if (i10 != 0) {
            }
            i11 = i5 & 64;
            if (i11 != 0) {
            }
            i12 = i5 & 128;
            if (i12 != 0) {
            }
            i13 = i5 & 256;
            if (i13 != 0) {
            }
            i14 = i5 & 512;
            if (i14 == 0) {
            }
            i15 = i5 & 1024;
            if (i15 == 0) {
            }
            i17 = i5 & 2048;
            if (i17 == 0) {
            }
            int i2922 = i16;
            i18 = i5 & 4096;
            if (i18 == 0) {
            }
            i19 = i5 & 8192;
            if (i19 != 0) {
            }
            i20 = i5 & 16384;
            if (i20 != 0) {
            }
            if ((i4 & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
            }
            if ((i6 & 306783379) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i7 = i5 & 4;
        if (i7 == 0) {
        }
        i8 = i5 & 8;
        if (i8 == 0) {
        }
        i9 = i5 & 16;
        if (i9 == 0) {
        }
        i10 = i5 & 32;
        int i2822 = 65536;
        if (i10 != 0) {
        }
        i11 = i5 & 64;
        if (i11 != 0) {
        }
        i12 = i5 & 128;
        if (i12 != 0) {
        }
        i13 = i5 & 256;
        if (i13 != 0) {
        }
        i14 = i5 & 512;
        if (i14 == 0) {
        }
        i15 = i5 & 1024;
        if (i15 == 0) {
        }
        i17 = i5 & 2048;
        if (i17 == 0) {
        }
        int i29222 = i16;
        i18 = i5 & 4096;
        if (i18 == 0) {
        }
        i19 = i5 & 8192;
        if (i19 != 0) {
        }
        i20 = i5 & 16384;
        if (i20 != 0) {
        }
        if ((i4 & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
        }
        if ((i6 & 306783379) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:312:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:492:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:498:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:508:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:509:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:514:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:518:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:520:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:521:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:523:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:524:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:527:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:528:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:530:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:531:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:534:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:536:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:537:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:539:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:540:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:543:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:545:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:548:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:549:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:552:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:553:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:560:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:562:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:565:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:569:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:571:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: Text-IbK3jfQ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m10025TextIbK3jfQ(@NotNull final AnnotatedString annotatedString, @Nullable Modifier modifier, long j, long j2, @Nullable FontStyle fontStyle, @Nullable FontWeight fontWeight, @Nullable FontFamily fontFamily, long j3, @Nullable TextDecoration textDecoration, @Nullable TextAlign textAlign, long j4, int i, boolean z, int i2, int i3, @Nullable Map<String, InlineTextContent> map, @Nullable Function1<? super TextLayoutResult, Unit> function1, @Nullable TextStyle textStyle, @Nullable Composer composer, final int i4, final int i5, final int i6) {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        Modifier modifier2;
        long jM11376getUnspecified0d7_KjU;
        long jM13868getUnspecifiedXSAIIZE;
        FontStyle fontStyle2;
        FontWeight fontWeight2;
        TextAlign textAlign2;
        TextStyle textStyle2;
        int i25;
        Map<String, InlineTextContent> map2;
        Function1<? super TextLayoutResult, Unit> function12;
        FontFamily fontFamily2;
        int i26;
        int i27;
        boolean z2;
        int i28;
        long j5;
        TextDecoration textDecoration2;
        long j6;
        boolean z3;
        Color.Companion companion;
        long j7;
        final TextDecoration textDecoration3;
        final TextAlign textAlign3;
        final FontFamily fontFamily3;
        final boolean z4;
        final Modifier modifier3;
        final long j8;
        final long j9;
        final Function1<? super TextLayoutResult, Unit> function13;
        final TextStyle textStyle3;
        final long j10;
        final int i29;
        final FontStyle fontStyle3;
        final FontWeight fontWeight3;
        final long j11;
        final Map<String, InlineTextContent> map3;
        final int i30;
        final int i31;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(2027001676);
        if ((i6 & 1) != 0) {
            i7 = i4 | 6;
        } else if ((i4 & 6) == 0) {
            i7 = (composerStartRestartGroup.changed(annotatedString) ? 4 : 2) | i4;
        } else {
            i7 = i4;
        }
        int i32 = i6 & 2;
        if (i32 != 0) {
            i7 |= 48;
        } else {
            if ((i4 & 48) == 0) {
                i7 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            i8 = i6 & 4;
            if (i8 == 0) {
                i7 |= 384;
            } else if ((i4 & 384) == 0) {
                i7 |= composerStartRestartGroup.changed(j) ? 256 : 128;
            }
            i9 = i6 & 8;
            if (i9 == 0) {
                i7 |= 3072;
            } else if ((i4 & 3072) == 0) {
                i7 |= composerStartRestartGroup.changed(j2) ? 2048 : 1024;
            }
            i10 = i6 & 16;
            if (i10 == 0) {
                i7 |= CpioConstants.C_ISBLK;
            } else {
                if ((i4 & CpioConstants.C_ISBLK) == 0) {
                    i7 |= composerStartRestartGroup.changed(fontStyle) ? 16384 : 8192;
                }
                i11 = i6 & 32;
                if (i11 != 0) {
                    i7 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                } else if ((i4 & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
                    i7 |= composerStartRestartGroup.changed(fontWeight) ? 131072 : 65536;
                }
                i12 = i6 & 64;
                if (i12 != 0) {
                    i7 |= 1572864;
                } else if ((i4 & 1572864) == 0) {
                    i7 |= composerStartRestartGroup.changed(fontFamily) ? 1048576 : 524288;
                }
                i13 = i6 & 128;
                if (i13 != 0) {
                    i7 |= 12582912;
                } else if ((i4 & 12582912) == 0) {
                    i7 |= composerStartRestartGroup.changed(j3) ? 8388608 : 4194304;
                }
                i14 = i6 & 256;
                if (i14 != 0) {
                    i7 |= 100663296;
                } else if ((i4 & 100663296) == 0) {
                    i7 |= composerStartRestartGroup.changed(textDecoration) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                }
                i15 = i6 & 512;
                if (i15 != 0) {
                    i7 |= 805306368;
                } else if ((i4 & 805306368) == 0) {
                    i7 |= composerStartRestartGroup.changed(textAlign) ? 536870912 : 268435456;
                }
                i16 = i6 & 1024;
                if (i16 != 0) {
                    i17 = i5 | 6;
                } else if ((i5 & 6) == 0) {
                    i17 = i5 | (composerStartRestartGroup.changed(j4) ? 4 : 2);
                } else {
                    i17 = i5;
                }
                i18 = i6 & 2048;
                if (i18 != 0) {
                    i17 |= 48;
                } else if ((i5 & 48) == 0) {
                    i17 |= composerStartRestartGroup.changed(i) ? 32 : 16;
                }
                int i33 = i17;
                i19 = i6 & 4096;
                if (i19 != 0) {
                    i33 |= 384;
                } else {
                    if ((i5 & 384) == 0) {
                        i33 |= composerStartRestartGroup.changed(z) ? 256 : 128;
                    }
                    i20 = i6 & 8192;
                    if (i20 == 0) {
                        i33 |= 3072;
                    } else {
                        if ((i5 & 3072) == 0) {
                            i33 |= composerStartRestartGroup.changed(i2) ? 2048 : 1024;
                        }
                        i21 = i6 & 16384;
                        if (i21 == 0) {
                            i22 = i21;
                            if ((i5 & CpioConstants.C_ISBLK) == 0) {
                                i33 |= composerStartRestartGroup.changed(i3) ? 16384 : 8192;
                            }
                            i23 = i6 & 32768;
                            if (i23 == 0) {
                                i33 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                            } else if ((i5 & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
                                i33 |= composerStartRestartGroup.changedInstance(map) ? 131072 : 65536;
                            }
                            i24 = i6 & 65536;
                            if (i24 == 0) {
                                i33 |= 1572864;
                            } else if ((i5 & 1572864) == 0) {
                                i33 |= composerStartRestartGroup.changedInstance(function1) ? 1048576 : 524288;
                            }
                            if ((i5 & 12582912) == 0) {
                                i33 |= ((i6 & 131072) == 0 && composerStartRestartGroup.changed(textStyle)) ? 8388608 : 4194304;
                            }
                            if ((i7 & 306783379) == 306783378 || (4793491 & i33) != 4793490 || !composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.startDefaults();
                                if ((i4 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                    modifier2 = i32 == 0 ? Modifier.INSTANCE : modifier;
                                    jM11376getUnspecified0d7_KjU = i8 == 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j;
                                    jM13868getUnspecifiedXSAIIZE = i9 == 0 ? TextUnit.INSTANCE.m13868getUnspecifiedXSAIIZE() : j2;
                                    fontStyle2 = i10 == 0 ? null : fontStyle;
                                    fontWeight2 = i11 == 0 ? null : fontWeight;
                                    FontFamily fontFamily4 = i12 == 0 ? null : fontFamily;
                                    long jM13868getUnspecifiedXSAIIZE2 = i13 == 0 ? TextUnit.INSTANCE.m13868getUnspecifiedXSAIIZE() : j3;
                                    TextDecoration textDecoration4 = i14 == 0 ? null : textDecoration;
                                    textAlign2 = i15 == 0 ? textAlign : null;
                                    long jM13868getUnspecifiedXSAIIZE3 = i16 == 0 ? TextUnit.INSTANCE.m13868getUnspecifiedXSAIIZE() : j4;
                                    int iM13607getClipgIe3tQ8 = i18 == 0 ? TextOverflow.INSTANCE.m13607getClipgIe3tQ8() : i;
                                    boolean z5 = i19 == 0 ? true : z;
                                    int i34 = i20 == 0 ? Integer.MAX_VALUE : i2;
                                    int i35 = i22 == 0 ? i3 : 1;
                                    Map<String, InlineTextContent> mapEmptyMap = i23 == 0 ? MapsKt__MapsKt.emptyMap() : map;
                                    Function1<? super TextLayoutResult, Unit> function14 = i24 == 0 ? new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.material3.TextKt$Text$4
                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                            invoke2(textLayoutResult);
                                            return Unit.INSTANCE;
                                        }
                                    } : function1;
                                    long j12 = jM13868getUnspecifiedXSAIIZE3;
                                    if ((i6 & 131072) == 0) {
                                        i33 &= -29360129;
                                        textStyle2 = (TextStyle) composerStartRestartGroup.consume(LocalTextStyle);
                                    } else {
                                        textStyle2 = textStyle;
                                    }
                                    i25 = i33;
                                    map2 = mapEmptyMap;
                                    function12 = function14;
                                    fontFamily2 = fontFamily4;
                                    i26 = i34;
                                    i27 = i35;
                                    z2 = z5;
                                    i28 = iM13607getClipgIe3tQ8;
                                    j5 = j12;
                                    textDecoration2 = textDecoration4;
                                    j6 = jM13868getUnspecifiedXSAIIZE2;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    if ((i6 & 131072) != 0) {
                                        i33 &= -29360129;
                                    }
                                    modifier2 = modifier;
                                    jM11376getUnspecified0d7_KjU = j;
                                    jM13868getUnspecifiedXSAIIZE = j2;
                                    fontStyle2 = fontStyle;
                                    fontWeight2 = fontWeight;
                                    fontFamily2 = fontFamily;
                                    j6 = j3;
                                    textDecoration2 = textDecoration;
                                    textAlign2 = textAlign;
                                    i28 = i;
                                    z2 = z;
                                    i26 = i2;
                                    i27 = i3;
                                    map2 = map;
                                    function12 = function1;
                                    textStyle2 = textStyle;
                                    i25 = i33;
                                    j5 = j4;
                                }
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    z3 = z2;
                                } else {
                                    z3 = z2;
                                    ComposerKt.traceEventStart(2027001676, i7, i25, "androidx.compose.material3.Text (Text.kt:255)");
                                }
                                composerStartRestartGroup.startReplaceableGroup(79588770);
                                companion = Color.INSTANCE;
                                if (jM11376getUnspecified0d7_KjU == companion.m11376getUnspecified0d7_KjU()) {
                                    j7 = jM11376getUnspecified0d7_KjU;
                                } else {
                                    composerStartRestartGroup.startReplaceableGroup(79588803);
                                    long jM13195getColor0d7_KjU = textStyle2.m13195getColor0d7_KjU();
                                    if (jM13195getColor0d7_KjU == companion.m11376getUnspecified0d7_KjU()) {
                                        jM13195getColor0d7_KjU = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m11350unboximpl();
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    j7 = jM13195getColor0d7_KjU;
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                int i36 = (i7 & 126) | ((i25 >> 9) & 7168);
                                int i37 = i25 << 9;
                                BasicTextKt.m8400BasicTextRWo7tUw(annotatedString, modifier2, textStyle2.m13210mergedA7vx0o((16609105 & 1) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j7, (16609105 & 2) != 0 ? TextUnit.INSTANCE.m13868getUnspecifiedXSAIIZE() : jM13868getUnspecifiedXSAIIZE, (16609105 & 4) != 0 ? null : fontWeight2, (16609105 & 8) != 0 ? null : fontStyle2, (16609105 & 16) != 0 ? null : null, (16609105 & 32) != 0 ? null : fontFamily2, (16609105 & 64) != 0 ? null : null, (16609105 & 128) != 0 ? TextUnit.INSTANCE.m13868getUnspecifiedXSAIIZE() : j6, (16609105 & 256) != 0 ? null : null, (16609105 & 512) != 0 ? null : null, (16609105 & 1024) != 0 ? null : null, (16609105 & 2048) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : 0L, (16609105 & 4096) != 0 ? null : textDecoration2, (16609105 & 8192) != 0 ? null : null, (16609105 & 16384) != 0 ? null : null, (16609105 & 32768) != 0 ? TextAlign.INSTANCE.m13564getUnspecifiede0LSkKk() : textAlign2 == null ? textAlign2.getValue() : TextAlign.INSTANCE.m13564getUnspecifiede0LSkKk(), (16609105 & 65536) != 0 ? TextDirection.INSTANCE.m13577getUnspecifieds_7Xco() : 0, (16609105 & 131072) != 0 ? TextUnit.INSTANCE.m13868getUnspecifiedXSAIIZE() : j5, (16609105 & 262144) != 0 ? null : null, (16609105 & 524288) != 0 ? null : null, (16609105 & 1048576) != 0 ? LineBreak.INSTANCE.m13491getUnspecifiedrAG3T2k() : 0, (16609105 & 2097152) != 0 ? Hyphens.INSTANCE.m13470getUnspecifiedvmbZdU8() : 0, (16609105 & 4194304) != 0 ? null : null, (16609105 & 8388608) != 0 ? null : null), function12, i28, z3, i26, i27, map2, null, composerStartRestartGroup, i36 | (57344 & i37) | (458752 & i37) | (3670016 & i37) | (29360128 & i37) | (i37 & 234881024), 512);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                textDecoration3 = textDecoration2;
                                textAlign3 = textAlign2;
                                fontFamily3 = fontFamily2;
                                int i38 = i26;
                                z4 = z3;
                                long j13 = j6;
                                modifier3 = modifier2;
                                j8 = jM13868getUnspecifiedXSAIIZE;
                                j9 = jM11376getUnspecified0d7_KjU;
                                function13 = function12;
                                textStyle3 = textStyle2;
                                j10 = j5;
                                i29 = i28;
                                fontStyle3 = fontStyle2;
                                fontWeight3 = fontWeight2;
                                j11 = j13;
                                map3 = map2;
                                i30 = i27;
                                i31 = i38;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                modifier3 = modifier;
                                j9 = j;
                                j8 = j2;
                                fontStyle3 = fontStyle;
                                fontWeight3 = fontWeight;
                                fontFamily3 = fontFamily;
                                j11 = j3;
                                textDecoration3 = textDecoration;
                                textAlign3 = textAlign;
                                j10 = j4;
                                i29 = i;
                                z4 = z;
                                i31 = i2;
                                i30 = i3;
                                map3 = map;
                                function13 = function1;
                                textStyle3 = textStyle;
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextKt$Text$5
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(@Nullable Composer composer2, int i39) {
                                        TextKt.m10025TextIbK3jfQ(annotatedString, modifier3, j9, j8, fontStyle3, fontWeight3, fontFamily3, j11, textDecoration3, textAlign3, j10, i29, z4, i31, i30, map3, function13, textStyle3, composer2, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), RecomposeScopeImplKt.updateChangedFlags(i5), i6);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i33 |= CpioConstants.C_ISBLK;
                        i22 = i21;
                        i23 = i6 & 32768;
                        if (i23 == 0) {
                        }
                        i24 = i6 & 65536;
                        if (i24 == 0) {
                        }
                        if ((i5 & 12582912) == 0) {
                        }
                        if ((i7 & 306783379) == 306783378) {
                            composerStartRestartGroup.startDefaults();
                            if ((i4 & 1) != 0) {
                                if (i32 == 0) {
                                }
                                if (i8 == 0) {
                                }
                                if (i9 == 0) {
                                }
                                if (i10 == 0) {
                                }
                                if (i11 == 0) {
                                }
                                if (i12 == 0) {
                                }
                                if (i13 == 0) {
                                }
                                if (i14 == 0) {
                                }
                                if (i15 == 0) {
                                }
                                if (i16 == 0) {
                                }
                                if (i18 == 0) {
                                }
                                if (i19 == 0) {
                                }
                                if (i20 == 0) {
                                }
                                if (i22 == 0) {
                                }
                                if (i23 == 0) {
                                }
                                if (i24 == 0) {
                                }
                                long j122 = jM13868getUnspecifiedXSAIIZE3;
                                if ((i6 & 131072) == 0) {
                                }
                                i25 = i33;
                                map2 = mapEmptyMap;
                                function12 = function14;
                                fontFamily2 = fontFamily4;
                                i26 = i34;
                                i27 = i35;
                                z2 = z5;
                                i28 = iM13607getClipgIe3tQ8;
                                j5 = j122;
                                textDecoration2 = textDecoration4;
                                j6 = jM13868getUnspecifiedXSAIIZE2;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                composerStartRestartGroup.startReplaceableGroup(79588770);
                                companion = Color.INSTANCE;
                                if (jM11376getUnspecified0d7_KjU == companion.m11376getUnspecified0d7_KjU()) {
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                int i362 = (i7 & 126) | ((i25 >> 9) & 7168);
                                int i372 = i25 << 9;
                                BasicTextKt.m8400BasicTextRWo7tUw(annotatedString, modifier2, textStyle2.m13210mergedA7vx0o((16609105 & 1) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j7, (16609105 & 2) != 0 ? TextUnit.INSTANCE.m13868getUnspecifiedXSAIIZE() : jM13868getUnspecifiedXSAIIZE, (16609105 & 4) != 0 ? null : fontWeight2, (16609105 & 8) != 0 ? null : fontStyle2, (16609105 & 16) != 0 ? null : null, (16609105 & 32) != 0 ? null : fontFamily2, (16609105 & 64) != 0 ? null : null, (16609105 & 128) != 0 ? TextUnit.INSTANCE.m13868getUnspecifiedXSAIIZE() : j6, (16609105 & 256) != 0 ? null : null, (16609105 & 512) != 0 ? null : null, (16609105 & 1024) != 0 ? null : null, (16609105 & 2048) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : 0L, (16609105 & 4096) != 0 ? null : textDecoration2, (16609105 & 8192) != 0 ? null : null, (16609105 & 16384) != 0 ? null : null, (16609105 & 32768) != 0 ? TextAlign.INSTANCE.m13564getUnspecifiede0LSkKk() : textAlign2 == null ? textAlign2.getValue() : TextAlign.INSTANCE.m13564getUnspecifiede0LSkKk(), (16609105 & 65536) != 0 ? TextDirection.INSTANCE.m13577getUnspecifieds_7Xco() : 0, (16609105 & 131072) != 0 ? TextUnit.INSTANCE.m13868getUnspecifiedXSAIIZE() : j5, (16609105 & 262144) != 0 ? null : null, (16609105 & 524288) != 0 ? null : null, (16609105 & 1048576) != 0 ? LineBreak.INSTANCE.m13491getUnspecifiedrAG3T2k() : 0, (16609105 & 2097152) != 0 ? Hyphens.INSTANCE.m13470getUnspecifiedvmbZdU8() : 0, (16609105 & 4194304) != 0 ? null : null, (16609105 & 8388608) != 0 ? null : null), function12, i28, z3, i26, i27, map2, null, composerStartRestartGroup, i362 | (57344 & i372) | (458752 & i372) | (3670016 & i372) | (29360128 & i372) | (i372 & 234881024), 512);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                textDecoration3 = textDecoration2;
                                textAlign3 = textAlign2;
                                fontFamily3 = fontFamily2;
                                int i382 = i26;
                                z4 = z3;
                                long j132 = j6;
                                modifier3 = modifier2;
                                j8 = jM13868getUnspecifiedXSAIIZE;
                                j9 = jM11376getUnspecified0d7_KjU;
                                function13 = function12;
                                textStyle3 = textStyle2;
                                j10 = j5;
                                i29 = i28;
                                fontStyle3 = fontStyle2;
                                fontWeight3 = fontWeight2;
                                j11 = j132;
                                map3 = map2;
                                i30 = i27;
                                i31 = i382;
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    i21 = i6 & 16384;
                    if (i21 == 0) {
                    }
                    i23 = i6 & 32768;
                    if (i23 == 0) {
                    }
                    i24 = i6 & 65536;
                    if (i24 == 0) {
                    }
                    if ((i5 & 12582912) == 0) {
                    }
                    if ((i7 & 306783379) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                i20 = i6 & 8192;
                if (i20 == 0) {
                }
                i21 = i6 & 16384;
                if (i21 == 0) {
                }
                i23 = i6 & 32768;
                if (i23 == 0) {
                }
                i24 = i6 & 65536;
                if (i24 == 0) {
                }
                if ((i5 & 12582912) == 0) {
                }
                if ((i7 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            i11 = i6 & 32;
            if (i11 != 0) {
            }
            i12 = i6 & 64;
            if (i12 != 0) {
            }
            i13 = i6 & 128;
            if (i13 != 0) {
            }
            i14 = i6 & 256;
            if (i14 != 0) {
            }
            i15 = i6 & 512;
            if (i15 != 0) {
            }
            i16 = i6 & 1024;
            if (i16 != 0) {
            }
            i18 = i6 & 2048;
            if (i18 != 0) {
            }
            int i332 = i17;
            i19 = i6 & 4096;
            if (i19 != 0) {
            }
            i20 = i6 & 8192;
            if (i20 == 0) {
            }
            i21 = i6 & 16384;
            if (i21 == 0) {
            }
            i23 = i6 & 32768;
            if (i23 == 0) {
            }
            i24 = i6 & 65536;
            if (i24 == 0) {
            }
            if ((i5 & 12582912) == 0) {
            }
            if ((i7 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        i8 = i6 & 4;
        if (i8 == 0) {
        }
        i9 = i6 & 8;
        if (i9 == 0) {
        }
        i10 = i6 & 16;
        if (i10 == 0) {
        }
        i11 = i6 & 32;
        if (i11 != 0) {
        }
        i12 = i6 & 64;
        if (i12 != 0) {
        }
        i13 = i6 & 128;
        if (i13 != 0) {
        }
        i14 = i6 & 256;
        if (i14 != 0) {
        }
        i15 = i6 & 512;
        if (i15 != 0) {
        }
        i16 = i6 & 1024;
        if (i16 != 0) {
        }
        i18 = i6 & 2048;
        if (i18 != 0) {
        }
        int i3322 = i17;
        i19 = i6 & 4096;
        if (i19 != 0) {
        }
        i20 = i6 & 8192;
        if (i20 == 0) {
        }
        i21 = i6 & 16384;
        if (i21 == 0) {
        }
        i23 = i6 & 32768;
        if (i23 == 0) {
        }
        i24 = i6 & 65536;
        if (i24 == 0) {
        }
        if ((i5 & 12582912) == 0) {
        }
        if ((i7 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:287:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:497:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:500:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:508:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:521:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use version with minLines instead")
    @Composable
    /* renamed from: Text--4IGK_g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m10023Text4IGK_g(final AnnotatedString annotatedString, Modifier modifier, long j, long j2, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j3, TextDecoration textDecoration, TextAlign textAlign, long j4, int i, boolean z, int i2, Map map, Function1 function1, TextStyle textStyle, Composer composer, final int i3, final int i4, final int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        Modifier modifier2;
        long jM11376getUnspecified0d7_KjU;
        TextAlign textAlign2;
        TextStyle textStyle2;
        long j5;
        int i23;
        boolean z2;
        int i24;
        int i25;
        Map map2;
        Function1 function12;
        FontStyle fontStyle2;
        long j6;
        FontWeight fontWeight2;
        FontFamily fontFamily2;
        long j7;
        final TextDecoration textDecoration2;
        Composer composer2;
        final TextAlign textAlign3;
        final long j8;
        final int i26;
        final boolean z3;
        final int i27;
        final Map map3;
        final Function1 function13;
        final TextStyle textStyle3;
        final FontStyle fontStyle3;
        final FontWeight fontWeight3;
        final FontFamily fontFamily3;
        final Modifier modifier3;
        final long j9;
        final long j10;
        final long j11;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(224529679);
        if ((i5 & 1) != 0) {
            i6 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i6 = (composerStartRestartGroup.changed(annotatedString) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        int i28 = i5 & 2;
        if (i28 != 0) {
            i6 |= 48;
        } else {
            if ((i3 & 48) == 0) {
                i6 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            i7 = i5 & 4;
            if (i7 == 0) {
                i6 |= 384;
            } else if ((i3 & 384) == 0) {
                i6 |= composerStartRestartGroup.changed(j) ? 256 : 128;
            }
            i8 = i5 & 8;
            if (i8 == 0) {
                i6 |= 3072;
            } else if ((i3 & 3072) == 0) {
                i6 |= composerStartRestartGroup.changed(j2) ? 2048 : 1024;
            }
            i9 = i5 & 16;
            if (i9 == 0) {
                i6 |= CpioConstants.C_ISBLK;
            } else {
                if ((i3 & CpioConstants.C_ISBLK) == 0) {
                    i6 |= composerStartRestartGroup.changed(fontStyle) ? 16384 : 8192;
                }
                i10 = i5 & 32;
                if (i10 != 0) {
                    i6 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                } else if ((i3 & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
                    i6 |= composerStartRestartGroup.changed(fontWeight) ? 131072 : 65536;
                }
                i11 = i5 & 64;
                if (i11 != 0) {
                    i6 |= 1572864;
                } else if ((i3 & 1572864) == 0) {
                    i6 |= composerStartRestartGroup.changed(fontFamily) ? 1048576 : 524288;
                }
                i12 = i5 & 128;
                if (i12 != 0) {
                    i6 |= 12582912;
                } else if ((i3 & 12582912) == 0) {
                    i6 |= composerStartRestartGroup.changed(j3) ? 8388608 : 4194304;
                }
                i13 = i5 & 256;
                if (i13 != 0) {
                    i6 |= 100663296;
                } else {
                    if ((100663296 & i3) == 0) {
                        i6 |= composerStartRestartGroup.changed(textDecoration) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                    }
                    i14 = i5 & 512;
                    if (i14 == 0) {
                        i6 |= 805306368;
                    } else if ((i3 & 805306368) == 0) {
                        i6 |= composerStartRestartGroup.changed(textAlign) ? 536870912 : 268435456;
                    }
                    i15 = i5 & 1024;
                    if (i15 == 0) {
                        i16 = i4 | 6;
                    } else if ((i4 & 6) == 0) {
                        i16 = i4 | (composerStartRestartGroup.changed(j4) ? 4 : 2);
                    } else {
                        i16 = i4;
                    }
                    i17 = i5 & 2048;
                    if (i17 == 0) {
                        i16 |= 48;
                    } else if ((i4 & 48) == 0) {
                        i16 |= composerStartRestartGroup.changed(i) ? 32 : 16;
                    }
                    int i29 = i16;
                    i18 = i5 & 4096;
                    if (i18 == 0) {
                        i29 |= 384;
                    } else {
                        if ((i4 & 384) == 0) {
                            i29 |= composerStartRestartGroup.changed(z) ? 256 : 128;
                        }
                        i19 = i5 & 8192;
                        if (i19 != 0) {
                            i29 |= 3072;
                        } else {
                            if ((i4 & 3072) == 0) {
                                i29 |= composerStartRestartGroup.changed(i2) ? 2048 : 1024;
                            }
                            i20 = i5 & 16384;
                            if (i20 != 0) {
                                i21 = i20;
                                if ((i4 & CpioConstants.C_ISBLK) == 0) {
                                    i29 |= composerStartRestartGroup.changedInstance(map) ? 16384 : 8192;
                                }
                                i22 = i5 & 32768;
                                if (i22 != 0) {
                                    i29 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                                } else if ((i4 & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
                                    i29 |= composerStartRestartGroup.changedInstance(function1) ? 131072 : 65536;
                                }
                                if ((i4 & 1572864) == 0) {
                                    i29 |= ((i5 & 65536) == 0 && composerStartRestartGroup.changed(textStyle)) ? 1048576 : 524288;
                                }
                                if ((i6 & 306783379) != 306783378 || (599187 & i29) != 599186 || !composerStartRestartGroup.getSkipping()) {
                                    composerStartRestartGroup.startDefaults();
                                    if ((i3 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                        modifier2 = i28 == 0 ? Modifier.INSTANCE : modifier;
                                        jM11376getUnspecified0d7_KjU = i7 == 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j;
                                        long jM13868getUnspecifiedXSAIIZE = i8 == 0 ? TextUnit.INSTANCE.m13868getUnspecifiedXSAIIZE() : j2;
                                        FontStyle fontStyle4 = i9 == 0 ? null : fontStyle;
                                        FontWeight fontWeight4 = i10 == 0 ? null : fontWeight;
                                        FontFamily fontFamily4 = i11 == 0 ? null : fontFamily;
                                        long jM13868getUnspecifiedXSAIIZE2 = i12 == 0 ? TextUnit.INSTANCE.m13868getUnspecifiedXSAIIZE() : j3;
                                        TextDecoration textDecoration3 = i13 == 0 ? null : textDecoration;
                                        textAlign2 = i14 == 0 ? textAlign : null;
                                        long jM13868getUnspecifiedXSAIIZE3 = i15 == 0 ? TextUnit.INSTANCE.m13868getUnspecifiedXSAIIZE() : j4;
                                        int iM13607getClipgIe3tQ8 = i17 == 0 ? TextOverflow.INSTANCE.m13607getClipgIe3tQ8() : i;
                                        boolean z4 = i18 == 0 ? true : z;
                                        int i30 = i19 == 0 ? Integer.MAX_VALUE : i2;
                                        Map mapEmptyMap = i21 == 0 ? MapsKt__MapsKt.emptyMap() : map;
                                        Function1 function14 = i22 == 0 ? new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.material3.TextKt$Text$6
                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                                invoke2(textLayoutResult);
                                                return Unit.INSTANCE;
                                            }
                                        } : function1;
                                        TextDecoration textDecoration4 = textDecoration3;
                                        if ((i5 & 65536) == 0) {
                                            i29 &= -3670017;
                                            textStyle2 = (TextStyle) composerStartRestartGroup.consume(LocalTextStyle);
                                        } else {
                                            textStyle2 = textStyle;
                                        }
                                        j5 = jM13868getUnspecifiedXSAIIZE3;
                                        i23 = iM13607getClipgIe3tQ8;
                                        z2 = z4;
                                        i24 = i29;
                                        i25 = i30;
                                        map2 = mapEmptyMap;
                                        function12 = function14;
                                        fontStyle2 = fontStyle4;
                                        j6 = jM13868getUnspecifiedXSAIIZE;
                                        fontWeight2 = fontWeight4;
                                        fontFamily2 = fontFamily4;
                                        j7 = jM13868getUnspecifiedXSAIIZE2;
                                        textDecoration2 = textDecoration4;
                                    } else {
                                        composerStartRestartGroup.skipToGroupEnd();
                                        if ((i5 & 65536) != 0) {
                                            i29 &= -3670017;
                                        }
                                        modifier2 = modifier;
                                        jM11376getUnspecified0d7_KjU = j;
                                        j6 = j2;
                                        fontStyle2 = fontStyle;
                                        fontWeight2 = fontWeight;
                                        fontFamily2 = fontFamily;
                                        textDecoration2 = textDecoration;
                                        textAlign2 = textAlign;
                                        j5 = j4;
                                        i23 = i;
                                        z2 = z;
                                        i25 = i2;
                                        map2 = map;
                                        function12 = function1;
                                        textStyle2 = textStyle;
                                        i24 = i29;
                                        j7 = j3;
                                    }
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        composer2 = composerStartRestartGroup;
                                    } else {
                                        composer2 = composerStartRestartGroup;
                                        ComposerKt.traceEventStart(224529679, i6, i24, "androidx.compose.material3.Text (Text.kt:308)");
                                    }
                                    int i31 = i24 << 3;
                                    m10025TextIbK3jfQ(annotatedString, modifier2, jM11376getUnspecified0d7_KjU, j6, fontStyle2, fontWeight2, fontFamily2, j7, textDecoration2, textAlign2, j5, i23, z2, i25, 1, map2, function12, textStyle2, composer2, i6 & 2147483646, (i24 & 14) | CpioConstants.C_ISBLK | (i24 & 112) | (i24 & 896) | (i24 & 7168) | (458752 & i31) | (3670016 & i31) | (i31 & 29360128), 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    textAlign3 = textAlign2;
                                    j8 = j5;
                                    i26 = i23;
                                    z3 = z2;
                                    i27 = i25;
                                    map3 = map2;
                                    function13 = function12;
                                    textStyle3 = textStyle2;
                                    FontFamily fontFamily5 = fontFamily2;
                                    fontStyle3 = fontStyle2;
                                    long j12 = j7;
                                    fontWeight3 = fontWeight2;
                                    fontFamily3 = fontFamily5;
                                    long j13 = j6;
                                    modifier3 = modifier2;
                                    j9 = j13;
                                    j10 = jM11376getUnspecified0d7_KjU;
                                    j11 = j12;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    modifier3 = modifier;
                                    j10 = j;
                                    j9 = j2;
                                    fontStyle3 = fontStyle;
                                    fontWeight3 = fontWeight;
                                    fontFamily3 = fontFamily;
                                    j11 = j3;
                                    textDecoration2 = textDecoration;
                                    textAlign3 = textAlign;
                                    j8 = j4;
                                    i26 = i;
                                    z3 = z;
                                    i27 = i2;
                                    map3 = map;
                                    function13 = function1;
                                    textStyle3 = textStyle;
                                    composer2 = composerStartRestartGroup;
                                }
                                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextKt$Text$7
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            invoke(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(@Nullable Composer composer3, int i32) {
                                            TextKt.m10023Text4IGK_g(annotatedString, modifier3, j10, j9, fontStyle3, fontWeight3, fontFamily3, j11, textDecoration2, textAlign3, j8, i26, z3, i27, map3, function13, textStyle3, composer3, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i29 |= CpioConstants.C_ISBLK;
                            i21 = i20;
                            i22 = i5 & 32768;
                            if (i22 != 0) {
                            }
                            if ((i4 & 1572864) == 0) {
                            }
                            if ((i6 & 306783379) != 306783378) {
                                composerStartRestartGroup.startDefaults();
                                if ((i3 & 1) != 0) {
                                    if (i28 == 0) {
                                    }
                                    if (i7 == 0) {
                                    }
                                    if (i8 == 0) {
                                    }
                                    if (i9 == 0) {
                                    }
                                    if (i10 == 0) {
                                    }
                                    if (i11 == 0) {
                                    }
                                    if (i12 == 0) {
                                    }
                                    if (i13 == 0) {
                                    }
                                    if (i14 == 0) {
                                    }
                                    if (i15 == 0) {
                                    }
                                    if (i17 == 0) {
                                    }
                                    if (i18 == 0) {
                                    }
                                    if (i19 == 0) {
                                    }
                                    if (i21 == 0) {
                                    }
                                    if (i22 == 0) {
                                    }
                                    TextDecoration textDecoration42 = textDecoration3;
                                    if ((i5 & 65536) == 0) {
                                    }
                                    j5 = jM13868getUnspecifiedXSAIIZE3;
                                    i23 = iM13607getClipgIe3tQ8;
                                    z2 = z4;
                                    i24 = i29;
                                    i25 = i30;
                                    map2 = mapEmptyMap;
                                    function12 = function14;
                                    fontStyle2 = fontStyle4;
                                    j6 = jM13868getUnspecifiedXSAIIZE;
                                    fontWeight2 = fontWeight4;
                                    fontFamily2 = fontFamily4;
                                    j7 = jM13868getUnspecifiedXSAIIZE2;
                                    textDecoration2 = textDecoration42;
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    int i312 = i24 << 3;
                                    m10025TextIbK3jfQ(annotatedString, modifier2, jM11376getUnspecified0d7_KjU, j6, fontStyle2, fontWeight2, fontFamily2, j7, textDecoration2, textAlign2, j5, i23, z2, i25, 1, map2, function12, textStyle2, composer2, i6 & 2147483646, (i24 & 14) | CpioConstants.C_ISBLK | (i24 & 112) | (i24 & 896) | (i24 & 7168) | (458752 & i312) | (3670016 & i312) | (i312 & 29360128), 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    textAlign3 = textAlign2;
                                    j8 = j5;
                                    i26 = i23;
                                    z3 = z2;
                                    i27 = i25;
                                    map3 = map2;
                                    function13 = function12;
                                    textStyle3 = textStyle2;
                                    FontFamily fontFamily52 = fontFamily2;
                                    fontStyle3 = fontStyle2;
                                    long j122 = j7;
                                    fontWeight3 = fontWeight2;
                                    fontFamily3 = fontFamily52;
                                    long j132 = j6;
                                    modifier3 = modifier2;
                                    j9 = j132;
                                    j10 = jM11376getUnspecified0d7_KjU;
                                    j11 = j122;
                                }
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                            }
                        }
                        i20 = i5 & 16384;
                        if (i20 != 0) {
                        }
                        i22 = i5 & 32768;
                        if (i22 != 0) {
                        }
                        if ((i4 & 1572864) == 0) {
                        }
                        if ((i6 & 306783379) != 306783378) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    i19 = i5 & 8192;
                    if (i19 != 0) {
                    }
                    i20 = i5 & 16384;
                    if (i20 != 0) {
                    }
                    i22 = i5 & 32768;
                    if (i22 != 0) {
                    }
                    if ((i4 & 1572864) == 0) {
                    }
                    if ((i6 & 306783379) != 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                i14 = i5 & 512;
                if (i14 == 0) {
                }
                i15 = i5 & 1024;
                if (i15 == 0) {
                }
                i17 = i5 & 2048;
                if (i17 == 0) {
                }
                int i292 = i16;
                i18 = i5 & 4096;
                if (i18 == 0) {
                }
                i19 = i5 & 8192;
                if (i19 != 0) {
                }
                i20 = i5 & 16384;
                if (i20 != 0) {
                }
                i22 = i5 & 32768;
                if (i22 != 0) {
                }
                if ((i4 & 1572864) == 0) {
                }
                if ((i6 & 306783379) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            i10 = i5 & 32;
            if (i10 != 0) {
            }
            i11 = i5 & 64;
            if (i11 != 0) {
            }
            i12 = i5 & 128;
            if (i12 != 0) {
            }
            i13 = i5 & 256;
            if (i13 != 0) {
            }
            i14 = i5 & 512;
            if (i14 == 0) {
            }
            i15 = i5 & 1024;
            if (i15 == 0) {
            }
            i17 = i5 & 2048;
            if (i17 == 0) {
            }
            int i2922 = i16;
            i18 = i5 & 4096;
            if (i18 == 0) {
            }
            i19 = i5 & 8192;
            if (i19 != 0) {
            }
            i20 = i5 & 16384;
            if (i20 != 0) {
            }
            i22 = i5 & 32768;
            if (i22 != 0) {
            }
            if ((i4 & 1572864) == 0) {
            }
            if ((i6 & 306783379) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i7 = i5 & 4;
        if (i7 == 0) {
        }
        i8 = i5 & 8;
        if (i8 == 0) {
        }
        i9 = i5 & 16;
        if (i9 == 0) {
        }
        i10 = i5 & 32;
        if (i10 != 0) {
        }
        i11 = i5 & 64;
        if (i11 != 0) {
        }
        i12 = i5 & 128;
        if (i12 != 0) {
        }
        i13 = i5 & 256;
        if (i13 != 0) {
        }
        i14 = i5 & 512;
        if (i14 == 0) {
        }
        i15 = i5 & 1024;
        if (i15 == 0) {
        }
        i17 = i5 & 2048;
        if (i17 == 0) {
        }
        int i29222 = i16;
        i18 = i5 & 4096;
        if (i18 == 0) {
        }
        i19 = i5 & 8192;
        if (i19 != 0) {
        }
        i20 = i5 & 16384;
        if (i20 != 0) {
        }
        i22 = i5 & 32768;
        if (i22 != 0) {
        }
        if ((i4 & 1572864) == 0) {
        }
        if ((i6 & 306783379) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    @NotNull
    public static final ProvidableCompositionLocal<TextStyle> getLocalTextStyle() {
        return LocalTextStyle;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void ProvideTextStyle(@NotNull TextStyle textStyle, @NotNull Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-460300127);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(textStyle) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-460300127, i2, -1, "androidx.compose.material3.ProvideTextStyle (Text.kt:349)");
            }
            ProvidableCompositionLocal<TextStyle> providableCompositionLocal = LocalTextStyle;
            CompositionLocalKt.CompositionLocalProvider(providableCompositionLocal.provides(((TextStyle) composerStartRestartGroup.consume(providableCompositionLocal)).merge(textStyle)), function2, composerStartRestartGroup, (i2 & 112) | ProvidedValue.$stable);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextKt.ProvideTextStyle.1
                public final /* synthetic */ int $$changed;
                public final /* synthetic */ Function2<Composer, Integer, Unit> $content;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C16781(Function2<? super Composer, ? super Integer, Unit> function22, int i3) {
                    super(2);
                    function2 = function22;
                    i = i3;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i3) {
                    TextKt.ProvideTextStyle(textStyle, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}
