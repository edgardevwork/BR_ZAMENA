package androidx.compose.material;

import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.foundation.text.InlineTextContent;
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
@Metadata(m7104d1 = {"\u0000\u008a\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a(\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0002\b\nH\u0007¢\u0006\u0002\u0010\u000b\u001aæ\u0001\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00142\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020\u00142\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020&2\u0014\b\u0002\u0010(\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0)2\u0014\b\u0002\u0010,\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u00060-2\b\b\u0002\u0010/\u001a\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b0\u00101\u001aÜ\u0001\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00142\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020\u00142\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\u0014\b\u0002\u0010(\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0)2\u0014\b\u0002\u0010,\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u00060-2\b\b\u0002\u0010/\u001a\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b2\u00103\u001aÆ\u0001\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020*2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00142\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020\u00142\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\u0014\b\u0002\u0010,\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u00060-2\b\b\u0002\u0010/\u001a\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b4\u00105\u001aÒ\u0001\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020*2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00142\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020\u00142\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020&2\u0016\b\u0002\u0010,\u001a\u0010\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u0006\u0018\u00010-2\b\b\u0002\u0010/\u001a\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b2\u00106\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00067"}, m7105d2 = {"LocalTextStyle", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/ui/text/TextStyle;", "getLocalTextStyle", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "ProvideTextStyle", "", "value", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Text", "text", "Landroidx/compose/ui/text/AnnotatedString;", "modifier", "Landroidx/compose/ui/Modifier;", "color", "Landroidx/compose/ui/graphics/Color;", TtmlNode.ATTR_TTS_FONT_SIZE, "Landroidx/compose/ui/unit/TextUnit;", TtmlNode.ATTR_TTS_FONT_STYLE, "Landroidx/compose/ui/text/font/FontStyle;", TtmlNode.ATTR_TTS_FONT_WEIGHT, "Landroidx/compose/ui/text/font/FontWeight;", TtmlNode.ATTR_TTS_FONT_FAMILY, "Landroidx/compose/ui/text/font/FontFamily;", "letterSpacing", TtmlNode.ATTR_TTS_TEXT_DECORATION, "Landroidx/compose/ui/text/style/TextDecoration;", TtmlNode.ATTR_TTS_TEXT_ALIGN, "Landroidx/compose/ui/text/style/TextAlign;", "lineHeight", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "softWrap", "", "maxLines", "", "minLines", "inlineContent", "", "", "Landroidx/compose/foundation/text/InlineTextContent;", "onTextLayout", "Lkotlin/Function1;", "Landroidx/compose/ui/text/TextLayoutResult;", "style", "Text-IbK3jfQ", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILjava/util/Map;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "Text--4IGK_g", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZILjava/util/Map;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "Text-fLXpl1I", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "material_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Text.kt\nandroidx/compose/material/TextKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,398:1\n74#2:399\n74#2:400\n74#2:401\n74#2:410\n74#2:411\n74#2:412\n74#2:413\n74#2:422\n74#2:423\n646#3:402\n646#3:403\n646#3:414\n646#3:415\n1116#4,6:404\n1116#4,6:416\n*S KotlinDebug\n*F\n+ 1 Text.kt\nandroidx/compose/material/TextKt\n*L\n110#1:399\n129#1:400\n130#1:401\n182#1:410\n278#1:411\n297#1:412\n298#1:413\n352#1:422\n395#1:423\n131#1:402\n133#1:403\n299#1:414\n301#1:415\n157#1:404,6\n326#1:416,6\n*E\n"})
/* loaded from: classes2.dex */
public final class TextKt {

    @NotNull
    private static final ProvidableCompositionLocal<TextStyle> LocalTextStyle = CompositionLocalKt.compositionLocalOf(SnapshotStateKt.structuralEqualityPolicy(), new Function0<TextStyle>() { // from class: androidx.compose.material.TextKt$LocalTextStyle$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final TextStyle invoke() {
            return TypographyKt.getDefaultTextStyle();
        }
    });

    /* compiled from: Text.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material.TextKt$ProvideTextStyle$1 */
    public static final class C12521 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C12521(Function2<? super Composer, ? super Integer, Unit> function2, int i) {
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

    /* JADX WARN: Removed duplicated region for block: B:303:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:486:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:492:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:497:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:498:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:500:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:501:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:507:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:514:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:520:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:523:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:526:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:527:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:530:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:531:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:537:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:539:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:542:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:544:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:547:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:551:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:553:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: Text--4IGK_g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m9085Text4IGK_g(@NotNull final String str, @Nullable Modifier modifier, long j, long j2, @Nullable FontStyle fontStyle, @Nullable FontWeight fontWeight, @Nullable FontFamily fontFamily, long j3, @Nullable TextDecoration textDecoration, @Nullable TextAlign textAlign, long j4, int i, boolean z, int i2, int i3, @Nullable Function1<? super TextLayoutResult, Unit> function1, @Nullable TextStyle textStyle, @Nullable Composer composer, final int i4, final int i5, final int i6) {
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
        final long jM11376getUnspecified0d7_KjU;
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
        long jM11339copywmQWz5c$default;
        long j5;
        boolean zChanged;
        Object objRememberedValue;
        final int i28;
        final TextDecoration textDecoration3;
        final TextAlign textAlign3;
        final Modifier modifier3;
        final int i29;
        final FontStyle fontStyle3;
        final long j6;
        final long j7;
        final int i30;
        final boolean z3;
        final Function1<? super TextLayoutResult, Unit> function13;
        final FontFamily fontFamily3;
        final long j8;
        final long j9;
        final TextStyle textStyle3;
        final FontWeight fontWeight3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1028090691);
        if ((i6 & 1) != 0) {
            i7 = i4 | 6;
        } else if ((i4 & 14) == 0) {
            i7 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i4;
        } else {
            i7 = i4;
        }
        int i31 = i6 & 2;
        if (i31 != 0) {
            i7 |= 48;
        } else {
            if ((i4 & 112) == 0) {
                i7 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            i8 = i6 & 4;
            if (i8 == 0) {
                i7 |= 384;
            } else if ((i4 & 896) == 0) {
                i7 |= composerStartRestartGroup.changed(j) ? 256 : 128;
            }
            i9 = i6 & 8;
            if (i9 == 0) {
                i7 |= 3072;
            } else if ((i4 & 7168) == 0) {
                i7 |= composerStartRestartGroup.changed(j2) ? 2048 : 1024;
            }
            i10 = i6 & 16;
            if (i10 == 0) {
                i7 |= CpioConstants.C_ISBLK;
            } else if ((i4 & 57344) == 0) {
                i7 |= composerStartRestartGroup.changed(fontStyle) ? 16384 : 8192;
            }
            i11 = i6 & 32;
            if (i11 == 0) {
                i7 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
            } else if ((i4 & 458752) == 0) {
                i7 |= composerStartRestartGroup.changed(fontWeight) ? 131072 : 65536;
            }
            i12 = i6 & 64;
            if (i12 == 0) {
                i7 |= 1572864;
            } else if ((i4 & 3670016) == 0) {
                i7 |= composerStartRestartGroup.changed(fontFamily) ? 1048576 : 524288;
            }
            i13 = i6 & 128;
            if (i13 == 0) {
                i7 |= 12582912;
            } else if ((i4 & 29360128) == 0) {
                i7 |= composerStartRestartGroup.changed(j3) ? 8388608 : 4194304;
            }
            i14 = i6 & 256;
            if (i14 == 0) {
                i7 |= 100663296;
            } else {
                if ((234881024 & i4) == 0) {
                    i7 |= composerStartRestartGroup.changed(textDecoration) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                }
                i15 = i6 & 512;
                if (i15 != 0) {
                    i7 |= 805306368;
                } else if ((i4 & 1879048192) == 0) {
                    i7 |= composerStartRestartGroup.changed(textAlign) ? 536870912 : 268435456;
                }
                i16 = i6 & 1024;
                if (i16 != 0) {
                    i17 = i5 | 6;
                } else if ((i5 & 14) == 0) {
                    i17 = i5 | (composerStartRestartGroup.changed(j4) ? 4 : 2);
                } else {
                    i17 = i5;
                }
                i18 = i6 & 2048;
                if (i18 != 0) {
                    i17 |= 48;
                } else if ((i5 & 112) == 0) {
                    i17 |= composerStartRestartGroup.changed(i) ? 32 : 16;
                }
                int i32 = i17;
                i19 = i6 & 4096;
                if (i19 != 0) {
                    i32 |= 384;
                } else {
                    if ((i5 & 896) == 0) {
                        i32 |= composerStartRestartGroup.changed(z) ? 256 : 128;
                    }
                    i20 = i6 & 8192;
                    if (i20 == 0) {
                        i32 |= 3072;
                    } else {
                        if ((i5 & 7168) == 0) {
                            i32 |= composerStartRestartGroup.changed(i2) ? 2048 : 1024;
                        }
                        i21 = i6 & 16384;
                        if (i21 == 0) {
                            if ((i5 & 57344) == 0) {
                                i22 = i21;
                                i32 |= composerStartRestartGroup.changed(i3) ? 16384 : 8192;
                            }
                            i23 = i6 & 32768;
                            if (i23 == 0) {
                                i32 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                            } else if ((i5 & 458752) == 0) {
                                i32 |= composerStartRestartGroup.changedInstance(function1) ? 131072 : 65536;
                            }
                            if ((i5 & 3670016) == 0) {
                                i32 |= ((i6 & 65536) == 0 && composerStartRestartGroup.changed(textStyle)) ? 1048576 : 524288;
                            }
                            if ((i7 & 1533916891) == 306783378 || (2995931 & i32) != 599186 || !composerStartRestartGroup.getSkipping()) {
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
                                        ComposerKt.traceEventStart(1028090691, i7, i26, "androidx.compose.material.Text (Text.kt:110)");
                                    } else {
                                        i27 = i24;
                                    }
                                    long jM11350unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m11350unboximpl();
                                    float fFloatValue = ((Number) composerStartRestartGroup.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue();
                                    companion = Color.INSTANCE;
                                    if (jM11376getUnspecified0d7_KjU != companion.m11376getUnspecified0d7_KjU()) {
                                        j5 = jM11376getUnspecified0d7_KjU;
                                    } else {
                                        if (textStyle2.m13195getColor0d7_KjU() != companion.m11376getUnspecified0d7_KjU()) {
                                            jM11339copywmQWz5c$default = textStyle2.m13195getColor0d7_KjU();
                                        } else {
                                            jM11339copywmQWz5c$default = Color.m11339copywmQWz5c$default(jM11350unboximpl, fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
                                        }
                                        j5 = jM11376getUnspecified0d7_KjU;
                                        jM11376getUnspecified0d7_KjU = jM11339copywmQWz5c$default;
                                    }
                                    TextStyle textStyleM13210mergedA7vx0o = textStyle2.m13210mergedA7vx0o((16609105 & 1) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : 0L, (16609105 & 2) != 0 ? TextUnit.INSTANCE.m13868getUnspecifiedXSAIIZE() : jM13868getUnspecifiedXSAIIZE, (16609105 & 4) != 0 ? null : fontWeight2, (16609105 & 8) != 0 ? null : fontStyle2, (16609105 & 16) != 0 ? null : null, (16609105 & 32) != 0 ? null : fontFamily2, (16609105 & 64) != 0 ? null : null, (16609105 & 128) != 0 ? TextUnit.INSTANCE.m13868getUnspecifiedXSAIIZE() : jM13868getUnspecifiedXSAIIZE2, (16609105 & 256) != 0 ? null : null, (16609105 & 512) != 0 ? null : null, (16609105 & 1024) != 0 ? null : null, (16609105 & 2048) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : 0L, (16609105 & 4096) != 0 ? null : textDecoration2, (16609105 & 8192) != 0 ? null : null, (16609105 & 16384) != 0 ? null : null, (16609105 & 32768) != 0 ? TextAlign.INSTANCE.m13564getUnspecifiede0LSkKk() : textAlign2 != null ? textAlign2.getValue() : TextAlign.INSTANCE.m13564getUnspecifiede0LSkKk(), (16609105 & 65536) != 0 ? TextDirection.INSTANCE.m13577getUnspecifieds_7Xco() : 0, (16609105 & 131072) != 0 ? TextUnit.INSTANCE.m13868getUnspecifiedXSAIIZE() : jM13868getUnspecifiedXSAIIZE3, (16609105 & 262144) != 0 ? null : null, (16609105 & 524288) != 0 ? null : null, (16609105 & 1048576) != 0 ? LineBreak.INSTANCE.m13491getUnspecifiedrAG3T2k() : 0, (16609105 & 2097152) != 0 ? Hyphens.INSTANCE.m13470getUnspecifiedvmbZdU8() : 0, (16609105 & 4194304) != 0 ? null : null, (16609105 & 8388608) != 0 ? null : null);
                                    composerStartRestartGroup.startReplaceableGroup(-1723333857);
                                    zChanged = composerStartRestartGroup.changed(jM11376getUnspecified0d7_KjU);
                                    TextDecoration textDecoration5 = textDecoration2;
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new ColorProducer() { // from class: androidx.compose.material.TextKt$Text$1$1
                                            @Override // androidx.compose.p003ui.graphics.ColorProducer
                                            /* renamed from: invoke-0d7_KjU, reason: not valid java name */
                                            public final long mo9088invoke0d7_KjU() {
                                                return jM11376getUnspecified0d7_KjU;
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    int i33 = i26 << 9;
                                    BasicTextKt.m8402BasicTextVhcvRP8(str, modifier2, textStyleM13210mergedA7vx0o, function12, iM13607getClipgIe3tQ8, z2, i27, i25, (ColorProducer) objRememberedValue, composerStartRestartGroup, (i7 & 112) | 134217728 | (i7 & 14) | ((i26 >> 6) & 7168) | (i33 & 57344) | (i33 & 458752) | (i33 & 3670016) | (i33 & 29360128), 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    i28 = i27;
                                    textDecoration3 = textDecoration5;
                                    textAlign3 = textAlign2;
                                    modifier3 = modifier2;
                                    i29 = iM13607getClipgIe3tQ8;
                                    fontStyle3 = fontStyle2;
                                    j6 = jM13868getUnspecifiedXSAIIZE;
                                    j7 = jM13868getUnspecifiedXSAIIZE2;
                                    i30 = i25;
                                    z3 = z2;
                                    function13 = function12;
                                    fontFamily3 = fontFamily2;
                                    j8 = jM13868getUnspecifiedXSAIIZE3;
                                    j9 = j5;
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
                                long jM11350unboximpl2 = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m11350unboximpl();
                                float fFloatValue2 = ((Number) composerStartRestartGroup.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue();
                                companion = Color.INSTANCE;
                                if (jM11376getUnspecified0d7_KjU != companion.m11376getUnspecified0d7_KjU()) {
                                }
                                TextStyle textStyleM13210mergedA7vx0o2 = textStyle2.m13210mergedA7vx0o((16609105 & 1) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : 0L, (16609105 & 2) != 0 ? TextUnit.INSTANCE.m13868getUnspecifiedXSAIIZE() : jM13868getUnspecifiedXSAIIZE, (16609105 & 4) != 0 ? null : fontWeight2, (16609105 & 8) != 0 ? null : fontStyle2, (16609105 & 16) != 0 ? null : null, (16609105 & 32) != 0 ? null : fontFamily2, (16609105 & 64) != 0 ? null : null, (16609105 & 128) != 0 ? TextUnit.INSTANCE.m13868getUnspecifiedXSAIIZE() : jM13868getUnspecifiedXSAIIZE2, (16609105 & 256) != 0 ? null : null, (16609105 & 512) != 0 ? null : null, (16609105 & 1024) != 0 ? null : null, (16609105 & 2048) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : 0L, (16609105 & 4096) != 0 ? null : textDecoration2, (16609105 & 8192) != 0 ? null : null, (16609105 & 16384) != 0 ? null : null, (16609105 & 32768) != 0 ? TextAlign.INSTANCE.m13564getUnspecifiede0LSkKk() : textAlign2 != null ? textAlign2.getValue() : TextAlign.INSTANCE.m13564getUnspecifiede0LSkKk(), (16609105 & 65536) != 0 ? TextDirection.INSTANCE.m13577getUnspecifieds_7Xco() : 0, (16609105 & 131072) != 0 ? TextUnit.INSTANCE.m13868getUnspecifiedXSAIIZE() : jM13868getUnspecifiedXSAIIZE3, (16609105 & 262144) != 0 ? null : null, (16609105 & 524288) != 0 ? null : null, (16609105 & 1048576) != 0 ? LineBreak.INSTANCE.m13491getUnspecifiedrAG3T2k() : 0, (16609105 & 2097152) != 0 ? Hyphens.INSTANCE.m13470getUnspecifiedvmbZdU8() : 0, (16609105 & 4194304) != 0 ? null : null, (16609105 & 8388608) != 0 ? null : null);
                                composerStartRestartGroup.startReplaceableGroup(-1723333857);
                                zChanged = composerStartRestartGroup.changed(jM11376getUnspecified0d7_KjU);
                                TextDecoration textDecoration52 = textDecoration2;
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (zChanged) {
                                    objRememberedValue = new ColorProducer() { // from class: androidx.compose.material.TextKt$Text$1$1
                                        @Override // androidx.compose.p003ui.graphics.ColorProducer
                                        /* renamed from: invoke-0d7_KjU, reason: not valid java name */
                                        public final long mo9088invoke0d7_KjU() {
                                            return jM11376getUnspecified0d7_KjU;
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    composerStartRestartGroup.endReplaceableGroup();
                                    int i332 = i26 << 9;
                                    BasicTextKt.m8402BasicTextVhcvRP8(str, modifier2, textStyleM13210mergedA7vx0o2, function12, iM13607getClipgIe3tQ8, z2, i27, i25, (ColorProducer) objRememberedValue, composerStartRestartGroup, (i7 & 112) | 134217728 | (i7 & 14) | ((i26 >> 6) & 7168) | (i332 & 57344) | (i332 & 458752) | (i332 & 3670016) | (i332 & 29360128), 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    i28 = i27;
                                    textDecoration3 = textDecoration52;
                                    textAlign3 = textAlign2;
                                    modifier3 = modifier2;
                                    i29 = iM13607getClipgIe3tQ8;
                                    fontStyle3 = fontStyle2;
                                    j6 = jM13868getUnspecifiedXSAIIZE;
                                    j7 = jM13868getUnspecifiedXSAIIZE2;
                                    i30 = i25;
                                    z3 = z2;
                                    function13 = function12;
                                    fontFamily3 = fontFamily2;
                                    j8 = jM13868getUnspecifiedXSAIIZE3;
                                    j9 = j5;
                                    FontWeight fontWeight42 = fontWeight2;
                                    textStyle3 = textStyle2;
                                    fontWeight3 = fontWeight42;
                                }
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                modifier3 = modifier;
                                j9 = j;
                                j6 = j2;
                                fontStyle3 = fontStyle;
                                fontWeight3 = fontWeight;
                                fontFamily3 = fontFamily;
                                j7 = j3;
                                textDecoration3 = textDecoration;
                                textAlign3 = textAlign;
                                j8 = j4;
                                i29 = i;
                                z3 = z;
                                i28 = i2;
                                i30 = i3;
                                function13 = function1;
                                textStyle3 = textStyle;
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextKt$Text$2
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

                                    public final void invoke(@Nullable Composer composer2, int i34) {
                                        TextKt.m9085Text4IGK_g(str, modifier3, j9, j6, fontStyle3, fontWeight3, fontFamily3, j7, textDecoration3, textAlign3, j8, i29, z3, i28, i30, function13, textStyle3, composer2, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), RecomposeScopeImplKt.updateChangedFlags(i5), i6);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i32 |= CpioConstants.C_ISBLK;
                        i22 = i21;
                        i23 = i6 & 32768;
                        if (i23 == 0) {
                        }
                        if ((i5 & 3670016) == 0) {
                        }
                        if ((i7 & 1533916891) == 306783378) {
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
                                long jM11350unboximpl22 = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m11350unboximpl();
                                float fFloatValue22 = ((Number) composerStartRestartGroup.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue();
                                companion = Color.INSTANCE;
                                if (jM11376getUnspecified0d7_KjU != companion.m11376getUnspecified0d7_KjU()) {
                                }
                                TextStyle textStyleM13210mergedA7vx0o22 = textStyle2.m13210mergedA7vx0o((16609105 & 1) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : 0L, (16609105 & 2) != 0 ? TextUnit.INSTANCE.m13868getUnspecifiedXSAIIZE() : jM13868getUnspecifiedXSAIIZE, (16609105 & 4) != 0 ? null : fontWeight2, (16609105 & 8) != 0 ? null : fontStyle2, (16609105 & 16) != 0 ? null : null, (16609105 & 32) != 0 ? null : fontFamily2, (16609105 & 64) != 0 ? null : null, (16609105 & 128) != 0 ? TextUnit.INSTANCE.m13868getUnspecifiedXSAIIZE() : jM13868getUnspecifiedXSAIIZE2, (16609105 & 256) != 0 ? null : null, (16609105 & 512) != 0 ? null : null, (16609105 & 1024) != 0 ? null : null, (16609105 & 2048) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : 0L, (16609105 & 4096) != 0 ? null : textDecoration2, (16609105 & 8192) != 0 ? null : null, (16609105 & 16384) != 0 ? null : null, (16609105 & 32768) != 0 ? TextAlign.INSTANCE.m13564getUnspecifiede0LSkKk() : textAlign2 != null ? textAlign2.getValue() : TextAlign.INSTANCE.m13564getUnspecifiede0LSkKk(), (16609105 & 65536) != 0 ? TextDirection.INSTANCE.m13577getUnspecifieds_7Xco() : 0, (16609105 & 131072) != 0 ? TextUnit.INSTANCE.m13868getUnspecifiedXSAIIZE() : jM13868getUnspecifiedXSAIIZE3, (16609105 & 262144) != 0 ? null : null, (16609105 & 524288) != 0 ? null : null, (16609105 & 1048576) != 0 ? LineBreak.INSTANCE.m13491getUnspecifiedrAG3T2k() : 0, (16609105 & 2097152) != 0 ? Hyphens.INSTANCE.m13470getUnspecifiedvmbZdU8() : 0, (16609105 & 4194304) != 0 ? null : null, (16609105 & 8388608) != 0 ? null : null);
                                composerStartRestartGroup.startReplaceableGroup(-1723333857);
                                zChanged = composerStartRestartGroup.changed(jM11376getUnspecified0d7_KjU);
                                TextDecoration textDecoration522 = textDecoration2;
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (zChanged) {
                                }
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    i21 = i6 & 16384;
                    if (i21 == 0) {
                    }
                    i22 = i21;
                    i23 = i6 & 32768;
                    if (i23 == 0) {
                    }
                    if ((i5 & 3670016) == 0) {
                    }
                    if ((i7 & 1533916891) == 306783378) {
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
                i22 = i21;
                i23 = i6 & 32768;
                if (i23 == 0) {
                }
                if ((i5 & 3670016) == 0) {
                }
                if ((i7 & 1533916891) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
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
            int i322 = i17;
            i19 = i6 & 4096;
            if (i19 != 0) {
            }
            i20 = i6 & 8192;
            if (i20 == 0) {
            }
            i21 = i6 & 16384;
            if (i21 == 0) {
            }
            i22 = i21;
            i23 = i6 & 32768;
            if (i23 == 0) {
            }
            if ((i5 & 3670016) == 0) {
            }
            if ((i7 & 1533916891) == 306783378) {
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
        if (i11 == 0) {
        }
        i12 = i6 & 64;
        if (i12 == 0) {
        }
        i13 = i6 & 128;
        if (i13 == 0) {
        }
        i14 = i6 & 256;
        if (i14 == 0) {
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
        int i3222 = i17;
        i19 = i6 & 4096;
        if (i19 != 0) {
        }
        i20 = i6 & 8192;
        if (i20 == 0) {
        }
        i21 = i6 & 16384;
        if (i21 == 0) {
        }
        i22 = i21;
        i23 = i6 & 32768;
        if (i23 == 0) {
        }
        if ((i5 & 3670016) == 0) {
        }
        if ((i7 & 1533916891) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:273:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:493:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use version with minLines instead")
    @Composable
    /* renamed from: Text-fLXpl1I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m9087TextfLXpl1I(final String str, Modifier modifier, long j, long j2, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j3, TextDecoration textDecoration, TextAlign textAlign, long j4, int i, boolean z, int i2, Function1 function1, TextStyle textStyle, Composer composer, final int i3, final int i4, final int i5) {
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
        Composer composerStartRestartGroup = composer.startRestartGroup(-366126944);
        if ((i5 & 1) != 0) {
            i6 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i6 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        int i27 = i5 & 2;
        if (i27 != 0) {
            i6 |= 48;
        } else {
            if ((i3 & 112) == 0) {
                i6 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            i7 = i5 & 4;
            if (i7 == 0) {
                i6 |= 384;
            } else if ((i3 & 896) == 0) {
                i6 |= composerStartRestartGroup.changed(j) ? 256 : 128;
            }
            i8 = i5 & 8;
            if (i8 == 0) {
                i6 |= 3072;
            } else if ((i3 & 7168) == 0) {
                i6 |= composerStartRestartGroup.changed(j2) ? 2048 : 1024;
            }
            i9 = i5 & 16;
            if (i9 == 0) {
                i6 |= CpioConstants.C_ISBLK;
            } else if ((i3 & 57344) == 0) {
                i6 |= composerStartRestartGroup.changed(fontStyle) ? 16384 : 8192;
            }
            i10 = i5 & 32;
            if (i10 == 0) {
                i6 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
            } else if ((i3 & 458752) == 0) {
                i6 |= composerStartRestartGroup.changed(fontWeight) ? 131072 : 65536;
            }
            i11 = i5 & 64;
            if (i11 == 0) {
                i6 |= 1572864;
            } else if ((i3 & 3670016) == 0) {
                i6 |= composerStartRestartGroup.changed(fontFamily) ? 1048576 : 524288;
            }
            i12 = i5 & 128;
            if (i12 == 0) {
                i6 |= 12582912;
            } else if ((i3 & 29360128) == 0) {
                i6 |= composerStartRestartGroup.changed(j3) ? 8388608 : 4194304;
            }
            i13 = i5 & 256;
            if (i13 == 0) {
                i6 |= 100663296;
            } else {
                if ((234881024 & i3) == 0) {
                    i6 |= composerStartRestartGroup.changed(textDecoration) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                }
                i14 = i5 & 512;
                if (i14 != 0) {
                    i6 |= 805306368;
                } else if ((i3 & 1879048192) == 0) {
                    i6 |= composerStartRestartGroup.changed(textAlign) ? 536870912 : 268435456;
                }
                i15 = i5 & 1024;
                if (i15 != 0) {
                    i16 = i4 | 6;
                } else if ((i4 & 14) == 0) {
                    i16 = i4 | (composerStartRestartGroup.changed(j4) ? 4 : 2);
                } else {
                    i16 = i4;
                }
                i17 = i5 & 2048;
                if (i17 != 0) {
                    i16 |= 48;
                } else if ((i4 & 112) == 0) {
                    i16 |= composerStartRestartGroup.changed(i) ? 32 : 16;
                }
                int i28 = i16;
                i18 = i5 & 4096;
                if (i18 != 0) {
                    i28 |= 384;
                } else {
                    if ((i4 & 896) == 0) {
                        i28 |= composerStartRestartGroup.changed(z) ? 256 : 128;
                    }
                    i19 = i5 & 8192;
                    if (i19 == 0) {
                        i28 |= 3072;
                    } else {
                        if ((i4 & 7168) == 0) {
                            i28 |= composerStartRestartGroup.changed(i2) ? 2048 : 1024;
                        }
                        i20 = i5 & 16384;
                        if (i20 == 0) {
                            if ((i4 & 57344) == 0) {
                                i21 = i20;
                                i28 |= composerStartRestartGroup.changedInstance(function1) ? 16384 : 8192;
                            }
                            if ((i4 & 458752) == 0) {
                                i28 |= ((i5 & 32768) == 0 && composerStartRestartGroup.changed(textStyle)) ? 131072 : 65536;
                            }
                            if ((i6 & 1533916891) == 306783378 || (374491 & i28) != 74898 || !composerStartRestartGroup.getSkipping()) {
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
                                    int i29 = i19 == 0 ? Integer.MAX_VALUE : i2;
                                    Function1 function14 = i21 == 0 ? new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.material.TextKt$Text$3
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
                                        i28 &= -458753;
                                        textStyle2 = (TextStyle) composerStartRestartGroup.consume(LocalTextStyle);
                                    } else {
                                        textStyle2 = textStyle;
                                    }
                                    j5 = jM13868getUnspecifiedXSAIIZE3;
                                    i22 = iM13607getClipgIe3tQ8;
                                    z2 = z4;
                                    i23 = i28;
                                    i24 = i29;
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
                                        i28 &= -458753;
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
                                    i23 = i28;
                                    j7 = j3;
                                }
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    composer2 = composerStartRestartGroup;
                                } else {
                                    composer2 = composerStartRestartGroup;
                                    ComposerKt.traceEventStart(-366126944, i6, i23, "androidx.compose.material.Text (Text.kt:182)");
                                }
                                int i30 = i23 << 3;
                                m9085Text4IGK_g(str, modifier2, jM11376getUnspecified0d7_KjU, j6, fontStyle2, fontWeight2, fontFamily2, j7, textDecoration2, textAlign2, j5, i22, z2, i24, 1, (Function1<? super TextLayoutResult, Unit>) function12, textStyle2, composer2, i6 & 2147483646, (i23 & 14) | CpioConstants.C_ISBLK | (i23 & 112) | (i23 & 896) | (i23 & 7168) | (i30 & 458752) | (i30 & 3670016), 0);
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
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextKt$Text$4
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

                                    public final void invoke(@Nullable Composer composer3, int i31) {
                                        TextKt.m9087TextfLXpl1I(str, modifier3, j10, j9, fontStyle3, fontWeight3, fontFamily3, j11, textDecoration2, textAlign3, j8, i25, z3, i26, function13, textStyle3, composer3, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i28 |= CpioConstants.C_ISBLK;
                        i21 = i20;
                        if ((i4 & 458752) == 0) {
                        }
                        if ((i6 & 1533916891) == 306783378) {
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
                                i23 = i28;
                                i24 = i29;
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
                                int i302 = i23 << 3;
                                m9085Text4IGK_g(str, modifier2, jM11376getUnspecified0d7_KjU, j6, fontStyle2, fontWeight2, fontFamily2, j7, textDecoration2, textAlign2, j5, i22, z2, i24, 1, (Function1<? super TextLayoutResult, Unit>) function12, textStyle2, composer2, i6 & 2147483646, (i23 & 14) | CpioConstants.C_ISBLK | (i23 & 112) | (i23 & 896) | (i23 & 7168) | (i302 & 458752) | (i302 & 3670016), 0);
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
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    i20 = i5 & 16384;
                    if (i20 == 0) {
                    }
                    i21 = i20;
                    if ((i4 & 458752) == 0) {
                    }
                    if ((i6 & 1533916891) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                i19 = i5 & 8192;
                if (i19 == 0) {
                }
                i20 = i5 & 16384;
                if (i20 == 0) {
                }
                i21 = i20;
                if ((i4 & 458752) == 0) {
                }
                if ((i6 & 1533916891) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            i14 = i5 & 512;
            if (i14 != 0) {
            }
            i15 = i5 & 1024;
            if (i15 != 0) {
            }
            i17 = i5 & 2048;
            if (i17 != 0) {
            }
            int i282 = i16;
            i18 = i5 & 4096;
            if (i18 != 0) {
            }
            i19 = i5 & 8192;
            if (i19 == 0) {
            }
            i20 = i5 & 16384;
            if (i20 == 0) {
            }
            i21 = i20;
            if ((i4 & 458752) == 0) {
            }
            if ((i6 & 1533916891) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
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
        if (i10 == 0) {
        }
        i11 = i5 & 64;
        if (i11 == 0) {
        }
        i12 = i5 & 128;
        if (i12 == 0) {
        }
        i13 = i5 & 256;
        if (i13 == 0) {
        }
        i14 = i5 & 512;
        if (i14 != 0) {
        }
        i15 = i5 & 1024;
        if (i15 != 0) {
        }
        i17 = i5 & 2048;
        if (i17 != 0) {
        }
        int i2822 = i16;
        i18 = i5 & 4096;
        if (i18 != 0) {
        }
        i19 = i5 & 8192;
        if (i19 == 0) {
        }
        i20 = i5 & 16384;
        if (i20 == 0) {
        }
        i21 = i20;
        if ((i4 & 458752) == 0) {
        }
        if ((i6 & 1533916891) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:312:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:497:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:500:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:501:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:507:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:509:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:518:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:521:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:526:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:528:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:532:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:534:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:535:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:537:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:538:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:541:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:544:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:545:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:548:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:549:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:555:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:557:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:560:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:562:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:565:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:569:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:571:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: Text-IbK3jfQ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m9086TextIbK3jfQ(@NotNull final AnnotatedString annotatedString, @Nullable Modifier modifier, long j, long j2, @Nullable FontStyle fontStyle, @Nullable FontWeight fontWeight, @Nullable FontFamily fontFamily, long j3, @Nullable TextDecoration textDecoration, @Nullable TextAlign textAlign, long j4, int i, boolean z, int i2, int i3, @Nullable Map<String, InlineTextContent> map, @Nullable Function1<? super TextLayoutResult, Unit> function1, @Nullable TextStyle textStyle, @Nullable Composer composer, final int i4, final int i5, final int i6) {
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
        int i25;
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
        int i26;
        int i27;
        Map<String, InlineTextContent> mapEmptyMap;
        Function1<? super TextLayoutResult, Unit> function12;
        int i28;
        TextStyle textStyle2;
        Map<String, InlineTextContent> map2;
        Color.Companion companion;
        long jM11339copywmQWz5c$default;
        Modifier modifier3;
        int i29;
        final long j5;
        boolean zChanged;
        Object objRememberedValue;
        final TextStyle textStyle3;
        final TextAlign textAlign3;
        final FontStyle fontStyle3;
        final FontWeight fontWeight3;
        final int i30;
        final long j6;
        final long j7;
        final int i31;
        final TextDecoration textDecoration3;
        final long j8;
        final Modifier modifier4;
        final Map<String, InlineTextContent> map3;
        final Function1<? super TextLayoutResult, Unit> function13;
        final int i32;
        final long j9;
        final boolean z3;
        final FontFamily fontFamily3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(744129681);
        if ((i6 & 1) != 0) {
            i7 = i4 | 6;
        } else if ((i4 & 14) == 0) {
            i7 = (composerStartRestartGroup.changed(annotatedString) ? 4 : 2) | i4;
        } else {
            i7 = i4;
        }
        int i33 = i6 & 2;
        if (i33 != 0) {
            i7 |= 48;
        } else {
            if ((i4 & 112) == 0) {
                i7 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            i8 = i6 & 4;
            if (i8 == 0) {
                i7 |= 384;
            } else if ((i4 & 896) == 0) {
                i7 |= composerStartRestartGroup.changed(j) ? 256 : 128;
            }
            i9 = i6 & 8;
            if (i9 == 0) {
                i7 |= 3072;
            } else if ((i4 & 7168) == 0) {
                i7 |= composerStartRestartGroup.changed(j2) ? 2048 : 1024;
            }
            i10 = i6 & 16;
            if (i10 == 0) {
                i7 |= CpioConstants.C_ISBLK;
            } else if ((i4 & 57344) == 0) {
                i7 |= composerStartRestartGroup.changed(fontStyle) ? 16384 : 8192;
            }
            i11 = i6 & 32;
            if (i11 == 0) {
                i7 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
            } else if ((i4 & 458752) == 0) {
                i7 |= composerStartRestartGroup.changed(fontWeight) ? 131072 : 65536;
            }
            i12 = i6 & 64;
            if (i12 == 0) {
                i7 |= 1572864;
            } else if ((i4 & 3670016) == 0) {
                i7 |= composerStartRestartGroup.changed(fontFamily) ? 1048576 : 524288;
            }
            i13 = i6 & 128;
            if (i13 == 0) {
                i7 |= 12582912;
            } else if ((i4 & 29360128) == 0) {
                i7 |= composerStartRestartGroup.changed(j3) ? 8388608 : 4194304;
            }
            i14 = i6 & 256;
            if (i14 == 0) {
                i7 |= 100663296;
            } else {
                if ((234881024 & i4) == 0) {
                    i7 |= composerStartRestartGroup.changed(textDecoration) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                }
                i15 = i6 & 512;
                if (i15 != 0) {
                    i7 |= 805306368;
                } else if ((i4 & 1879048192) == 0) {
                    i7 |= composerStartRestartGroup.changed(textAlign) ? 536870912 : 268435456;
                }
                i16 = i6 & 1024;
                if (i16 != 0) {
                    i17 = i5 | 6;
                } else if ((i5 & 14) == 0) {
                    i17 = i5 | (composerStartRestartGroup.changed(j4) ? 4 : 2);
                } else {
                    i17 = i5;
                }
                i18 = i6 & 2048;
                if (i18 != 0) {
                    i17 |= 48;
                } else if ((i5 & 112) == 0) {
                    i17 |= composerStartRestartGroup.changed(i) ? 32 : 16;
                }
                int i34 = i17;
                i19 = i6 & 4096;
                if (i19 != 0) {
                    i34 |= 384;
                } else {
                    if ((i5 & 896) == 0) {
                        i34 |= composerStartRestartGroup.changed(z) ? 256 : 128;
                    }
                    i20 = i6 & 8192;
                    if (i20 == 0) {
                        i34 |= 3072;
                    } else {
                        if ((i5 & 7168) == 0) {
                            i34 |= composerStartRestartGroup.changed(i2) ? 2048 : 1024;
                        }
                        i21 = i6 & 16384;
                        if (i21 != 0) {
                            i34 |= CpioConstants.C_ISBLK;
                        } else {
                            if ((i5 & 57344) == 0) {
                                i22 = i21;
                                i34 |= composerStartRestartGroup.changed(i3) ? 16384 : 8192;
                            }
                            i23 = i6 & 32768;
                            if (i23 != 0) {
                                i34 |= 65536;
                            }
                            i24 = i6 & 65536;
                            if (i24 != 0) {
                                if ((i5 & 3670016) == 0) {
                                    i25 = i20;
                                    i34 |= composerStartRestartGroup.changedInstance(function1) ? 1048576 : 524288;
                                }
                                if ((i5 & 29360128) == 0) {
                                    i34 |= ((i6 & 131072) == 0 && composerStartRestartGroup.changed(textStyle)) ? 8388608 : 4194304;
                                }
                                if (i23 != 32768 || (1533916891 & i7) != 306783378 || (23967451 & i34) != 4793490 || !composerStartRestartGroup.getSkipping()) {
                                    composerStartRestartGroup.startDefaults();
                                    if ((i4 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                        modifier2 = i33 == 0 ? Modifier.INSTANCE : modifier;
                                        jM11376getUnspecified0d7_KjU = i8 == 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j;
                                        jM13868getUnspecifiedXSAIIZE = i9 == 0 ? TextUnit.INSTANCE.m13868getUnspecifiedXSAIIZE() : j2;
                                        fontStyle2 = i10 == 0 ? null : fontStyle;
                                        fontWeight2 = i11 == 0 ? null : fontWeight;
                                        fontFamily2 = i12 == 0 ? null : fontFamily;
                                        jM13868getUnspecifiedXSAIIZE2 = i13 == 0 ? TextUnit.INSTANCE.m13868getUnspecifiedXSAIIZE() : j3;
                                        textDecoration2 = i14 == 0 ? null : textDecoration;
                                        textAlign2 = i15 == 0 ? textAlign : null;
                                        jM13868getUnspecifiedXSAIIZE3 = i16 == 0 ? TextUnit.INSTANCE.m13868getUnspecifiedXSAIIZE() : j4;
                                        iM13607getClipgIe3tQ8 = i18 == 0 ? TextOverflow.INSTANCE.m13607getClipgIe3tQ8() : i;
                                        z2 = i19 == 0 ? true : z;
                                        i26 = i25 == 0 ? Integer.MAX_VALUE : i2;
                                        i27 = i22 == 0 ? i3 : 1;
                                        mapEmptyMap = i23 == 0 ? MapsKt__MapsKt.emptyMap() : map;
                                        function12 = i24 == 0 ? new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.material.TextKt$Text$5
                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                                invoke2(textLayoutResult);
                                                return Unit.INSTANCE;
                                            }
                                        } : function1;
                                        TextDecoration textDecoration4 = textDecoration2;
                                        if ((i6 & 131072) == 0) {
                                            i28 = i34 & (-29360129);
                                            textStyle2 = (TextStyle) composerStartRestartGroup.consume(LocalTextStyle);
                                            textDecoration2 = textDecoration4;
                                        }
                                        composerStartRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                            map2 = mapEmptyMap;
                                            ComposerKt.traceEventStart(744129681, i7, i28, "androidx.compose.material.Text (Text.kt:278)");
                                        } else {
                                            map2 = mapEmptyMap;
                                        }
                                        long jM11350unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m11350unboximpl();
                                        float fFloatValue = ((Number) composerStartRestartGroup.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue();
                                        companion = Color.INSTANCE;
                                        if (jM11376getUnspecified0d7_KjU != companion.m11376getUnspecified0d7_KjU()) {
                                            modifier3 = modifier2;
                                            i29 = i27;
                                            j5 = jM11376getUnspecified0d7_KjU;
                                        } else {
                                            if (textStyle2.m13195getColor0d7_KjU() != companion.m11376getUnspecified0d7_KjU()) {
                                                jM11339copywmQWz5c$default = textStyle2.m13195getColor0d7_KjU();
                                            } else {
                                                jM11339copywmQWz5c$default = Color.m11339copywmQWz5c$default(jM11350unboximpl, fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
                                            }
                                            modifier3 = modifier2;
                                            i29 = i27;
                                            j5 = jM11339copywmQWz5c$default;
                                        }
                                        TextStyle textStyleM13210mergedA7vx0o = textStyle2.m13210mergedA7vx0o((16609105 & 1) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : 0L, (16609105 & 2) != 0 ? TextUnit.INSTANCE.m13868getUnspecifiedXSAIIZE() : jM13868getUnspecifiedXSAIIZE, (16609105 & 4) != 0 ? null : fontWeight2, (16609105 & 8) != 0 ? null : fontStyle2, (16609105 & 16) != 0 ? null : null, (16609105 & 32) != 0 ? null : fontFamily2, (16609105 & 64) != 0 ? null : null, (16609105 & 128) != 0 ? TextUnit.INSTANCE.m13868getUnspecifiedXSAIIZE() : jM13868getUnspecifiedXSAIIZE2, (16609105 & 256) != 0 ? null : null, (16609105 & 512) != 0 ? null : null, (16609105 & 1024) != 0 ? null : null, (16609105 & 2048) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : 0L, (16609105 & 4096) != 0 ? null : textDecoration2, (16609105 & 8192) != 0 ? null : null, (16609105 & 16384) != 0 ? null : null, (16609105 & 32768) != 0 ? TextAlign.INSTANCE.m13564getUnspecifiede0LSkKk() : textAlign2 != null ? textAlign2.getValue() : TextAlign.INSTANCE.m13564getUnspecifiede0LSkKk(), (16609105 & 65536) != 0 ? TextDirection.INSTANCE.m13577getUnspecifieds_7Xco() : 0, (16609105 & 131072) != 0 ? TextUnit.INSTANCE.m13868getUnspecifiedXSAIIZE() : jM13868getUnspecifiedXSAIIZE3, (16609105 & 262144) != 0 ? null : null, (16609105 & 524288) != 0 ? null : null, (16609105 & 1048576) != 0 ? LineBreak.INSTANCE.m13491getUnspecifiedrAG3T2k() : 0, (16609105 & 2097152) != 0 ? Hyphens.INSTANCE.m13470getUnspecifiedvmbZdU8() : 0, (16609105 & 4194304) != 0 ? null : null, (16609105 & 8388608) != 0 ? null : null);
                                        composerStartRestartGroup.startReplaceableGroup(-1723326223);
                                        zChanged = composerStartRestartGroup.changed(j5);
                                        TextDecoration textDecoration5 = textDecoration2;
                                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = new ColorProducer() { // from class: androidx.compose.material.TextKt$Text$6$1
                                                @Override // androidx.compose.p003ui.graphics.ColorProducer
                                                /* renamed from: invoke-0d7_KjU */
                                                public final long mo9088invoke0d7_KjU() {
                                                    return j5;
                                                }
                                            };
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                        }
                                        composerStartRestartGroup.endReplaceableGroup();
                                        int i35 = i28 << 9;
                                        BasicTextKt.m8400BasicTextRWo7tUw(annotatedString, modifier3, textStyleM13210mergedA7vx0o, function12, iM13607getClipgIe3tQ8, z2, i26, i29, map2, (ColorProducer) objRememberedValue, composerStartRestartGroup, (i7 & 112) | 1207959552 | (i7 & 14) | ((i28 >> 9) & 7168) | (i35 & 57344) | (458752 & i35) | (i35 & 3670016) | (i35 & 29360128), 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        textStyle3 = textStyle2;
                                        textAlign3 = textAlign2;
                                        fontStyle3 = fontStyle2;
                                        fontWeight3 = fontWeight2;
                                        i30 = i26;
                                        j6 = jM13868getUnspecifiedXSAIIZE;
                                        j7 = jM13868getUnspecifiedXSAIIZE2;
                                        i31 = i29;
                                        textDecoration3 = textDecoration5;
                                        j8 = jM13868getUnspecifiedXSAIIZE3;
                                        modifier4 = modifier3;
                                        long j10 = jM11376getUnspecified0d7_KjU;
                                        map3 = map2;
                                        function13 = function12;
                                        i32 = iM13607getClipgIe3tQ8;
                                        j9 = j10;
                                        FontFamily fontFamily4 = fontFamily2;
                                        z3 = z2;
                                        fontFamily3 = fontFamily4;
                                    } else {
                                        composerStartRestartGroup.skipToGroupEnd();
                                        if ((i6 & 131072) != 0) {
                                            i34 &= -29360129;
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
                                        i26 = i2;
                                        i27 = i3;
                                        mapEmptyMap = map;
                                        function12 = function1;
                                    }
                                    i28 = i34;
                                    textStyle2 = textStyle;
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    long jM11350unboximpl2 = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m11350unboximpl();
                                    float fFloatValue2 = ((Number) composerStartRestartGroup.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue();
                                    companion = Color.INSTANCE;
                                    if (jM11376getUnspecified0d7_KjU != companion.m11376getUnspecified0d7_KjU()) {
                                    }
                                    TextStyle textStyleM13210mergedA7vx0o2 = textStyle2.m13210mergedA7vx0o((16609105 & 1) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : 0L, (16609105 & 2) != 0 ? TextUnit.INSTANCE.m13868getUnspecifiedXSAIIZE() : jM13868getUnspecifiedXSAIIZE, (16609105 & 4) != 0 ? null : fontWeight2, (16609105 & 8) != 0 ? null : fontStyle2, (16609105 & 16) != 0 ? null : null, (16609105 & 32) != 0 ? null : fontFamily2, (16609105 & 64) != 0 ? null : null, (16609105 & 128) != 0 ? TextUnit.INSTANCE.m13868getUnspecifiedXSAIIZE() : jM13868getUnspecifiedXSAIIZE2, (16609105 & 256) != 0 ? null : null, (16609105 & 512) != 0 ? null : null, (16609105 & 1024) != 0 ? null : null, (16609105 & 2048) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : 0L, (16609105 & 4096) != 0 ? null : textDecoration2, (16609105 & 8192) != 0 ? null : null, (16609105 & 16384) != 0 ? null : null, (16609105 & 32768) != 0 ? TextAlign.INSTANCE.m13564getUnspecifiede0LSkKk() : textAlign2 != null ? textAlign2.getValue() : TextAlign.INSTANCE.m13564getUnspecifiede0LSkKk(), (16609105 & 65536) != 0 ? TextDirection.INSTANCE.m13577getUnspecifieds_7Xco() : 0, (16609105 & 131072) != 0 ? TextUnit.INSTANCE.m13868getUnspecifiedXSAIIZE() : jM13868getUnspecifiedXSAIIZE3, (16609105 & 262144) != 0 ? null : null, (16609105 & 524288) != 0 ? null : null, (16609105 & 1048576) != 0 ? LineBreak.INSTANCE.m13491getUnspecifiedrAG3T2k() : 0, (16609105 & 2097152) != 0 ? Hyphens.INSTANCE.m13470getUnspecifiedvmbZdU8() : 0, (16609105 & 4194304) != 0 ? null : null, (16609105 & 8388608) != 0 ? null : null);
                                    composerStartRestartGroup.startReplaceableGroup(-1723326223);
                                    zChanged = composerStartRestartGroup.changed(j5);
                                    TextDecoration textDecoration52 = textDecoration2;
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (zChanged) {
                                        objRememberedValue = new ColorProducer() { // from class: androidx.compose.material.TextKt$Text$6$1
                                            @Override // androidx.compose.p003ui.graphics.ColorProducer
                                            /* renamed from: invoke-0d7_KjU */
                                            public final long mo9088invoke0d7_KjU() {
                                                return j5;
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                        composerStartRestartGroup.endReplaceableGroup();
                                        int i352 = i28 << 9;
                                        BasicTextKt.m8400BasicTextRWo7tUw(annotatedString, modifier3, textStyleM13210mergedA7vx0o2, function12, iM13607getClipgIe3tQ8, z2, i26, i29, map2, (ColorProducer) objRememberedValue, composerStartRestartGroup, (i7 & 112) | 1207959552 | (i7 & 14) | ((i28 >> 9) & 7168) | (i352 & 57344) | (458752 & i352) | (i352 & 3670016) | (i352 & 29360128), 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        textStyle3 = textStyle2;
                                        textAlign3 = textAlign2;
                                        fontStyle3 = fontStyle2;
                                        fontWeight3 = fontWeight2;
                                        i30 = i26;
                                        j6 = jM13868getUnspecifiedXSAIIZE;
                                        j7 = jM13868getUnspecifiedXSAIIZE2;
                                        i31 = i29;
                                        textDecoration3 = textDecoration52;
                                        j8 = jM13868getUnspecifiedXSAIIZE3;
                                        modifier4 = modifier3;
                                        long j102 = jM11376getUnspecified0d7_KjU;
                                        map3 = map2;
                                        function13 = function12;
                                        i32 = iM13607getClipgIe3tQ8;
                                        j9 = j102;
                                        FontFamily fontFamily42 = fontFamily2;
                                        z3 = z2;
                                        fontFamily3 = fontFamily42;
                                    }
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    modifier4 = modifier;
                                    j9 = j;
                                    j6 = j2;
                                    fontStyle3 = fontStyle;
                                    fontWeight3 = fontWeight;
                                    fontFamily3 = fontFamily;
                                    j7 = j3;
                                    textDecoration3 = textDecoration;
                                    textAlign3 = textAlign;
                                    j8 = j4;
                                    i32 = i;
                                    z3 = z;
                                    i30 = i2;
                                    i31 = i3;
                                    map3 = map;
                                    function13 = function1;
                                    textStyle3 = textStyle;
                                }
                                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextKt$Text$7
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

                                        public final void invoke(@Nullable Composer composer2, int i36) {
                                            TextKt.m9086TextIbK3jfQ(annotatedString, modifier4, j9, j6, fontStyle3, fontWeight3, fontFamily3, j7, textDecoration3, textAlign3, j8, i32, z3, i30, i31, map3, function13, textStyle3, composer2, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), RecomposeScopeImplKt.updateChangedFlags(i5), i6);
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i34 |= 1572864;
                            i25 = i20;
                            if ((i5 & 29360128) == 0) {
                            }
                            if (i23 != 32768) {
                                composerStartRestartGroup.startDefaults();
                                if ((i4 & 1) != 0) {
                                    if (i33 == 0) {
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
                                    if (i25 == 0) {
                                    }
                                    if (i22 == 0) {
                                    }
                                    if (i23 == 0) {
                                    }
                                    if (i24 == 0) {
                                    }
                                    TextDecoration textDecoration42 = textDecoration2;
                                    if ((i6 & 131072) == 0) {
                                        i28 = i34;
                                        textStyle2 = textStyle;
                                    }
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    long jM11350unboximpl22 = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m11350unboximpl();
                                    float fFloatValue22 = ((Number) composerStartRestartGroup.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue();
                                    companion = Color.INSTANCE;
                                    if (jM11376getUnspecified0d7_KjU != companion.m11376getUnspecified0d7_KjU()) {
                                    }
                                    TextStyle textStyleM13210mergedA7vx0o22 = textStyle2.m13210mergedA7vx0o((16609105 & 1) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : 0L, (16609105 & 2) != 0 ? TextUnit.INSTANCE.m13868getUnspecifiedXSAIIZE() : jM13868getUnspecifiedXSAIIZE, (16609105 & 4) != 0 ? null : fontWeight2, (16609105 & 8) != 0 ? null : fontStyle2, (16609105 & 16) != 0 ? null : null, (16609105 & 32) != 0 ? null : fontFamily2, (16609105 & 64) != 0 ? null : null, (16609105 & 128) != 0 ? TextUnit.INSTANCE.m13868getUnspecifiedXSAIIZE() : jM13868getUnspecifiedXSAIIZE2, (16609105 & 256) != 0 ? null : null, (16609105 & 512) != 0 ? null : null, (16609105 & 1024) != 0 ? null : null, (16609105 & 2048) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : 0L, (16609105 & 4096) != 0 ? null : textDecoration2, (16609105 & 8192) != 0 ? null : null, (16609105 & 16384) != 0 ? null : null, (16609105 & 32768) != 0 ? TextAlign.INSTANCE.m13564getUnspecifiede0LSkKk() : textAlign2 != null ? textAlign2.getValue() : TextAlign.INSTANCE.m13564getUnspecifiede0LSkKk(), (16609105 & 65536) != 0 ? TextDirection.INSTANCE.m13577getUnspecifieds_7Xco() : 0, (16609105 & 131072) != 0 ? TextUnit.INSTANCE.m13868getUnspecifiedXSAIIZE() : jM13868getUnspecifiedXSAIIZE3, (16609105 & 262144) != 0 ? null : null, (16609105 & 524288) != 0 ? null : null, (16609105 & 1048576) != 0 ? LineBreak.INSTANCE.m13491getUnspecifiedrAG3T2k() : 0, (16609105 & 2097152) != 0 ? Hyphens.INSTANCE.m13470getUnspecifiedvmbZdU8() : 0, (16609105 & 4194304) != 0 ? null : null, (16609105 & 8388608) != 0 ? null : null);
                                    composerStartRestartGroup.startReplaceableGroup(-1723326223);
                                    zChanged = composerStartRestartGroup.changed(j5);
                                    TextDecoration textDecoration522 = textDecoration2;
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (zChanged) {
                                    }
                                }
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                            }
                        }
                        i22 = i21;
                        i23 = i6 & 32768;
                        if (i23 != 0) {
                        }
                        i24 = i6 & 65536;
                        if (i24 != 0) {
                        }
                        i25 = i20;
                        if ((i5 & 29360128) == 0) {
                        }
                        if (i23 != 32768) {
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    i21 = i6 & 16384;
                    if (i21 != 0) {
                    }
                    i22 = i21;
                    i23 = i6 & 32768;
                    if (i23 != 0) {
                    }
                    i24 = i6 & 65536;
                    if (i24 != 0) {
                    }
                    i25 = i20;
                    if ((i5 & 29360128) == 0) {
                    }
                    if (i23 != 32768) {
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                i20 = i6 & 8192;
                if (i20 == 0) {
                }
                i21 = i6 & 16384;
                if (i21 != 0) {
                }
                i22 = i21;
                i23 = i6 & 32768;
                if (i23 != 0) {
                }
                i24 = i6 & 65536;
                if (i24 != 0) {
                }
                i25 = i20;
                if ((i5 & 29360128) == 0) {
                }
                if (i23 != 32768) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
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
            int i342 = i17;
            i19 = i6 & 4096;
            if (i19 != 0) {
            }
            i20 = i6 & 8192;
            if (i20 == 0) {
            }
            i21 = i6 & 16384;
            if (i21 != 0) {
            }
            i22 = i21;
            i23 = i6 & 32768;
            if (i23 != 0) {
            }
            i24 = i6 & 65536;
            if (i24 != 0) {
            }
            i25 = i20;
            if ((i5 & 29360128) == 0) {
            }
            if (i23 != 32768) {
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
        if (i11 == 0) {
        }
        i12 = i6 & 64;
        if (i12 == 0) {
        }
        i13 = i6 & 128;
        if (i13 == 0) {
        }
        i14 = i6 & 256;
        if (i14 == 0) {
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
        int i3422 = i17;
        i19 = i6 & 4096;
        if (i19 != 0) {
        }
        i20 = i6 & 8192;
        if (i20 == 0) {
        }
        i21 = i6 & 16384;
        if (i21 != 0) {
        }
        i22 = i21;
        i23 = i6 & 32768;
        if (i23 != 0) {
        }
        i24 = i6 & 65536;
        if (i24 != 0) {
        }
        i25 = i20;
        if ((i5 & 29360128) == 0) {
        }
        if (i23 != 32768) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:282:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:486:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:492:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:498:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:501:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:509:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:511:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use version with minLines instead")
    @Composable
    /* renamed from: Text--4IGK_g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m9084Text4IGK_g(final AnnotatedString annotatedString, Modifier modifier, long j, long j2, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j3, TextDecoration textDecoration, TextAlign textAlign, long j4, int i, boolean z, int i2, Map map, Function1 function1, TextStyle textStyle, Composer composer, final int i3, final int i4, final int i5) {
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
        FontStyle fontStyle2;
        FontWeight fontWeight2;
        TextStyle textStyle2;
        long j5;
        int i23;
        boolean z2;
        int i24;
        int i25;
        Map map2;
        Function1 function12;
        FontFamily fontFamily2;
        long j6;
        long j7;
        TextDecoration textDecoration2;
        TextAlign textAlign2;
        long j8;
        Composer composer2;
        final TextAlign textAlign3;
        final int i26;
        final boolean z3;
        final int i27;
        final Map map3;
        final Function1 function13;
        final TextStyle textStyle3;
        final long j9;
        final FontFamily fontFamily3;
        final TextDecoration textDecoration3;
        final long j10;
        final Modifier modifier3;
        final long j11;
        final FontStyle fontStyle3;
        final FontWeight fontWeight3;
        final long j12;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-422393234);
        if ((i5 & 1) != 0) {
            i6 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i6 = (composerStartRestartGroup.changed(annotatedString) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        int i28 = i5 & 2;
        if (i28 != 0) {
            i6 |= 48;
        } else {
            if ((i3 & 112) == 0) {
                i6 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            i7 = i5 & 4;
            if (i7 == 0) {
                i6 |= 384;
            } else if ((i3 & 896) == 0) {
                i6 |= composerStartRestartGroup.changed(j) ? 256 : 128;
            }
            i8 = i5 & 8;
            if (i8 == 0) {
                i6 |= 3072;
            } else if ((i3 & 7168) == 0) {
                i6 |= composerStartRestartGroup.changed(j2) ? 2048 : 1024;
            }
            i9 = i5 & 16;
            if (i9 == 0) {
                i6 |= CpioConstants.C_ISBLK;
            } else if ((i3 & 57344) == 0) {
                i6 |= composerStartRestartGroup.changed(fontStyle) ? 16384 : 8192;
            }
            i10 = i5 & 32;
            if (i10 == 0) {
                i6 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
            } else if ((i3 & 458752) == 0) {
                i6 |= composerStartRestartGroup.changed(fontWeight) ? 131072 : 65536;
            }
            i11 = i5 & 64;
            if (i11 == 0) {
                i6 |= 1572864;
            } else if ((i3 & 3670016) == 0) {
                i6 |= composerStartRestartGroup.changed(fontFamily) ? 1048576 : 524288;
            }
            i12 = i5 & 128;
            if (i12 == 0) {
                i6 |= 12582912;
            } else if ((i3 & 29360128) == 0) {
                i6 |= composerStartRestartGroup.changed(j3) ? 8388608 : 4194304;
            }
            i13 = i5 & 256;
            if (i13 == 0) {
                i6 |= 100663296;
            } else {
                if ((234881024 & i3) == 0) {
                    i6 |= composerStartRestartGroup.changed(textDecoration) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                }
                i14 = i5 & 512;
                if (i14 != 0) {
                    i6 |= 805306368;
                } else if ((i3 & 1879048192) == 0) {
                    i6 |= composerStartRestartGroup.changed(textAlign) ? 536870912 : 268435456;
                }
                i15 = i5 & 1024;
                if (i15 != 0) {
                    i16 = i4 | 6;
                } else if ((i4 & 14) == 0) {
                    i16 = i4 | (composerStartRestartGroup.changed(j4) ? 4 : 2);
                } else {
                    i16 = i4;
                }
                i17 = i5 & 2048;
                if (i17 != 0) {
                    i16 |= 48;
                } else if ((i4 & 112) == 0) {
                    i16 |= composerStartRestartGroup.changed(i) ? 32 : 16;
                }
                int i29 = i16;
                i18 = i5 & 4096;
                if (i18 != 0) {
                    i29 |= 384;
                } else {
                    if ((i4 & 896) == 0) {
                        i29 |= composerStartRestartGroup.changed(z) ? 256 : 128;
                    }
                    i19 = i5 & 8192;
                    if (i19 == 0) {
                        i29 |= 3072;
                    } else {
                        if ((i4 & 7168) == 0) {
                            i29 |= composerStartRestartGroup.changed(i2) ? 2048 : 1024;
                        }
                        i20 = i5 & 16384;
                        if (i20 != 0) {
                            i29 |= 8192;
                        }
                        i21 = i5 & 32768;
                        if (i21 == 0) {
                            if ((i4 & 458752) == 0) {
                                i22 = i19;
                                i29 |= composerStartRestartGroup.changedInstance(function1) ? 131072 : 65536;
                            }
                            if ((i4 & 3670016) == 0) {
                                i29 |= ((i5 & 65536) == 0 && composerStartRestartGroup.changed(textStyle)) ? 1048576 : 524288;
                            }
                            if (i20 == 16384 || (1533916891 & i6) != 306783378 || (2995931 & i29) != 599186 || !composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.startDefaults();
                                if ((i3 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                    modifier2 = i28 == 0 ? Modifier.INSTANCE : modifier;
                                    long jM11376getUnspecified0d7_KjU = i7 == 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j;
                                    long jM13868getUnspecifiedXSAIIZE = i8 == 0 ? TextUnit.INSTANCE.m13868getUnspecifiedXSAIIZE() : j2;
                                    fontStyle2 = i9 == 0 ? null : fontStyle;
                                    fontWeight2 = i10 == 0 ? null : fontWeight;
                                    FontFamily fontFamily4 = i11 == 0 ? null : fontFamily;
                                    long jM13868getUnspecifiedXSAIIZE2 = i12 == 0 ? TextUnit.INSTANCE.m13868getUnspecifiedXSAIIZE() : j3;
                                    TextDecoration textDecoration4 = i13 == 0 ? null : textDecoration;
                                    TextAlign textAlign4 = i14 == 0 ? textAlign : null;
                                    long jM13868getUnspecifiedXSAIIZE3 = i15 == 0 ? TextUnit.INSTANCE.m13868getUnspecifiedXSAIIZE() : j4;
                                    int iM13607getClipgIe3tQ8 = i17 == 0 ? TextOverflow.INSTANCE.m13607getClipgIe3tQ8() : i;
                                    boolean z4 = i18 == 0 ? true : z;
                                    int i30 = i22 == 0 ? Integer.MAX_VALUE : i2;
                                    Map mapEmptyMap = i20 == 0 ? MapsKt__MapsKt.emptyMap() : map;
                                    Function1 function14 = i21 == 0 ? new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.material.TextKt$Text$8
                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                            invoke2(textLayoutResult);
                                            return Unit.INSTANCE;
                                        }
                                    } : function1;
                                    TextDecoration textDecoration5 = textDecoration4;
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
                                    fontFamily2 = fontFamily4;
                                    j6 = jM11376getUnspecified0d7_KjU;
                                    j7 = jM13868getUnspecifiedXSAIIZE;
                                    textDecoration2 = textDecoration5;
                                    textAlign2 = textAlign4;
                                    j8 = jM13868getUnspecifiedXSAIIZE2;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    if ((i5 & 65536) != 0) {
                                        i29 &= -3670017;
                                    }
                                    modifier2 = modifier;
                                    j6 = j;
                                    fontStyle2 = fontStyle;
                                    fontWeight2 = fontWeight;
                                    fontFamily2 = fontFamily;
                                    j8 = j3;
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
                                    j7 = j2;
                                }
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    composer2 = composerStartRestartGroup;
                                } else {
                                    composer2 = composerStartRestartGroup;
                                    ComposerKt.traceEventStart(-422393234, i6, i24, "androidx.compose.material.Text (Text.kt:352)");
                                }
                                int i31 = i24 << 3;
                                m9086TextIbK3jfQ(annotatedString, modifier2, j6, j7, fontStyle2, fontWeight2, fontFamily2, j8, textDecoration2, textAlign2, j5, i23, z2, i25, 1, map2, function12, textStyle2, composer2, i6 & 2147483646, 286720 | (i24 & 14) | (i24 & 112) | (i24 & 896) | (i24 & 7168) | (i31 & 3670016) | (i31 & 29360128), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                textAlign3 = textAlign2;
                                i26 = i23;
                                z3 = z2;
                                i27 = i25;
                                map3 = map2;
                                function13 = function12;
                                textStyle3 = textStyle2;
                                j9 = j8;
                                fontFamily3 = fontFamily2;
                                FontStyle fontStyle4 = fontStyle2;
                                textDecoration3 = textDecoration2;
                                j10 = j6;
                                modifier3 = modifier2;
                                j11 = j7;
                                fontStyle3 = fontStyle4;
                                fontWeight3 = fontWeight2;
                                j12 = j5;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                modifier3 = modifier;
                                j10 = j;
                                j11 = j2;
                                fontStyle3 = fontStyle;
                                fontWeight3 = fontWeight;
                                fontFamily3 = fontFamily;
                                j9 = j3;
                                textDecoration3 = textDecoration;
                                textAlign3 = textAlign;
                                j12 = j4;
                                i26 = i;
                                z3 = z;
                                i27 = i2;
                                map3 = map;
                                function13 = function1;
                                textStyle3 = textStyle;
                                composer2 = composerStartRestartGroup;
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextKt$Text$9
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
                                        TextKt.m9084Text4IGK_g(annotatedString, modifier3, j10, j11, fontStyle3, fontWeight3, fontFamily3, j9, textDecoration3, textAlign3, j12, i26, z3, i27, map3, function13, textStyle3, composer3, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i29 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                        i22 = i19;
                        if ((i4 & 3670016) == 0) {
                        }
                        if (i20 == 16384) {
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
                                if (i22 == 0) {
                                }
                                if (i20 == 0) {
                                }
                                if (i21 == 0) {
                                }
                                TextDecoration textDecoration52 = textDecoration4;
                                if ((i5 & 65536) == 0) {
                                }
                                j5 = jM13868getUnspecifiedXSAIIZE3;
                                i23 = iM13607getClipgIe3tQ8;
                                z2 = z4;
                                i24 = i29;
                                i25 = i30;
                                map2 = mapEmptyMap;
                                function12 = function14;
                                fontFamily2 = fontFamily4;
                                j6 = jM11376getUnspecified0d7_KjU;
                                j7 = jM13868getUnspecifiedXSAIIZE;
                                textDecoration2 = textDecoration52;
                                textAlign2 = textAlign4;
                                j8 = jM13868getUnspecifiedXSAIIZE2;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                int i312 = i24 << 3;
                                m9086TextIbK3jfQ(annotatedString, modifier2, j6, j7, fontStyle2, fontWeight2, fontFamily2, j8, textDecoration2, textAlign2, j5, i23, z2, i25, 1, map2, function12, textStyle2, composer2, i6 & 2147483646, 286720 | (i24 & 14) | (i24 & 112) | (i24 & 896) | (i24 & 7168) | (i312 & 3670016) | (i312 & 29360128), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                textAlign3 = textAlign2;
                                i26 = i23;
                                z3 = z2;
                                i27 = i25;
                                map3 = map2;
                                function13 = function12;
                                textStyle3 = textStyle2;
                                j9 = j8;
                                fontFamily3 = fontFamily2;
                                FontStyle fontStyle42 = fontStyle2;
                                textDecoration3 = textDecoration2;
                                j10 = j6;
                                modifier3 = modifier2;
                                j11 = j7;
                                fontStyle3 = fontStyle42;
                                fontWeight3 = fontWeight2;
                                j12 = j5;
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    i20 = i5 & 16384;
                    if (i20 != 0) {
                    }
                    i21 = i5 & 32768;
                    if (i21 == 0) {
                    }
                    i22 = i19;
                    if ((i4 & 3670016) == 0) {
                    }
                    if (i20 == 16384) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                i19 = i5 & 8192;
                if (i19 == 0) {
                }
                i20 = i5 & 16384;
                if (i20 != 0) {
                }
                i21 = i5 & 32768;
                if (i21 == 0) {
                }
                i22 = i19;
                if ((i4 & 3670016) == 0) {
                }
                if (i20 == 16384) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            i14 = i5 & 512;
            if (i14 != 0) {
            }
            i15 = i5 & 1024;
            if (i15 != 0) {
            }
            i17 = i5 & 2048;
            if (i17 != 0) {
            }
            int i292 = i16;
            i18 = i5 & 4096;
            if (i18 != 0) {
            }
            i19 = i5 & 8192;
            if (i19 == 0) {
            }
            i20 = i5 & 16384;
            if (i20 != 0) {
            }
            i21 = i5 & 32768;
            if (i21 == 0) {
            }
            i22 = i19;
            if ((i4 & 3670016) == 0) {
            }
            if (i20 == 16384) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
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
        if (i10 == 0) {
        }
        i11 = i5 & 64;
        if (i11 == 0) {
        }
        i12 = i5 & 128;
        if (i12 == 0) {
        }
        i13 = i5 & 256;
        if (i13 == 0) {
        }
        i14 = i5 & 512;
        if (i14 != 0) {
        }
        i15 = i5 & 1024;
        if (i15 != 0) {
        }
        i17 = i5 & 2048;
        if (i17 != 0) {
        }
        int i2922 = i16;
        i18 = i5 & 4096;
        if (i18 != 0) {
        }
        i19 = i5 & 8192;
        if (i19 == 0) {
        }
        i20 = i5 & 16384;
        if (i20 != 0) {
        }
        i21 = i5 & 32768;
        if (i21 == 0) {
        }
        i22 = i19;
        if ((i4 & 3670016) == 0) {
        }
        if (i20 == 16384) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
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
        Composer composerStartRestartGroup = composer.startRestartGroup(1772272796);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(textStyle) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1772272796, i2, -1, "androidx.compose.material.ProvideTextStyle (Text.kt:393)");
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextKt.ProvideTextStyle.1
                public final /* synthetic */ int $$changed;
                public final /* synthetic */ Function2<Composer, Integer, Unit> $content;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C12521(Function2<? super Composer, ? super Integer, Unit> function22, int i3) {
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
