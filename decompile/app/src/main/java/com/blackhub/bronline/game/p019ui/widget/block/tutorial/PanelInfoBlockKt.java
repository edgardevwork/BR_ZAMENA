package com.blackhub.bronline.game.p019ui.widget.block.tutorial;

import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.ClipKt;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.Shape;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PainterResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.p003ui.text.style.TextAlign;
import androidx.compose.p003ui.text.style.TextDecoration;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.profileinstaller.ProfileVerifier;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.game.p019ui.widget.block.ClickAnimateBlockKt;
import com.blackhub.bronline.game.p019ui.widget.other.FakeDialogKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.StringCompanionObject;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PanelInfoBlock.kt */
@Metadata(m7104d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a±\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0003\u0010\u000e\u001a\u00020\u000f2\b\b\u0003\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\b\b\u0003\u0010\u0015\u001a\u00020\u000f2\b\b\u0003\u0010\u0016\u001a\u00020\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u000f2\b\b\u0002\u0010\u0018\u001a\u00020\u000f2\b\b\u0003\u0010\u0019\u001a\u00020\u000f2\b\b\u0003\u0010\u001a\u001a\u00020\u000f2\b\b\u0003\u0010\u001b\u001a\u00020\u000f2\b\b\u0003\u0010\u001c\u001a\u00020\u000f2\b\b\u0003\u0010\u001d\u001a\u00020\u000f2\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u001f2\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\u001f2\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\u001f2\b\b\u0002\u0010\"\u001a\u00020\u00122\b\b\u0002\u0010#\u001a\u00020\u00122\u0011\u0010$\u001a\r\u0012\u0004\u0012\u00020\u00030\u001f¢\u0006\u0002\b%H\u0007ø\u0001\u0000¢\u0006\u0004\b&\u0010'\u001a\r\u0010(\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010)\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006*"}, m7105d2 = {"FILL_PERCENT", "", "PanelInfoBlock", "", "fillWidthPercent", "fillHeightPercent", "backShape", "Landroidx/compose/ui/graphics/Shape;", "titleText", "", "titleTextColor", "Landroidx/compose/ui/graphics/Color;", "titleTextStyle", "Landroidx/compose/ui/text/TextStyle;", "bgColorId", "", "dialogBgColorId", "isCrossNeed", "", "isArrowsNeed", "isBottomIndicationNeed", "arrowRightColorId", "arrowLeftColorId", "countOfIndicators", "selectedIndicator", "sizeOfIndicatorCirclesId", "colorUnselectedIndicator", "colorSelectedIndicator", "icLeftArrow", "icRightArrow", "onCloseClick", "Lkotlin/Function0;", "onLeftArrowClick", "onRightArrowClick", "isAllowedLeftArrowClick", "isAllowedRightArrowClick", "content", "Landroidx/compose/runtime/Composable;", "PanelInfoBlock-GF-6hDo", "(FFLandroidx/compose/ui/graphics/Shape;Ljava/lang/String;JLandroidx/compose/ui/text/TextStyle;IIZZZIIIIIIIIILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;IIII)V", "PreviewPanelInfoBlock", "(Landroidx/compose/runtime/Composer;I)V", "app_siteRelease"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class PanelInfoBlockKt {
    public static final float FILL_PERCENT = 0.8f;

    /* compiled from: PanelInfoBlock.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.widget.block.tutorial.PanelInfoBlockKt$PreviewPanelInfoBlock$2 */
    /* loaded from: classes7.dex */
    public static final class C63362 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C63362(int i) {
            super(2);
            i = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            PanelInfoBlockKt.PreviewPanelInfoBlock(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:413:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:486:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:508:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:528:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:530:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:539:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:540:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:549:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:550:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:559:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:560:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:569:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:570:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:579:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:580:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:589:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:590:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:599:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:600:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:610:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:612:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:621:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:623:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:631:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:633:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:641:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:642:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:650:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:651:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:659:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:667:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:682:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:683:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:684:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:686:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:687:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:690:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:691:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:694:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:695:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:697:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:698:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:701:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:702:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:704:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:705:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:707:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:708:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:710:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:711:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:714:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:715:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:717:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:718:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:720:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:721:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:723:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:724:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:726:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:727:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:730:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:732:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:733:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:735:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:736:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:738:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:739:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:741:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:742:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:744:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:745:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:747:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:748:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:750:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:751:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:753:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:754:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:756:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:757:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:760:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:761:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:764:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:767:0x0573  */
    /* JADX WARN: Removed duplicated region for block: B:771:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:773:? A[RETURN, SYNTHETIC] */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: PanelInfoBlock-GF-6hDo */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m15068PanelInfoBlockGF6hDo(float f, float f2, @Nullable Shape shape, @Nullable String str, long j, @Nullable TextStyle textStyle, @ColorRes int i, @ColorRes int i2, boolean z, boolean z2, boolean z3, @ColorRes int i3, @ColorRes int i4, int i5, int i6, @DimenRes int i7, @ColorRes int i8, @ColorRes int i9, @DrawableRes int i10, @DrawableRes int i11, @Nullable Function0<Unit> function0, @Nullable Function0<Unit> function02, @Nullable Function0<Unit> function03, boolean z4, boolean z5, @NotNull final Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, final int i12, final int i13, final int i14, final int i15) {
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
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i40;
        int i41;
        float f3;
        float f4;
        Shape shapeM8392RoundedCornerShape0680j_4;
        String strEmpty;
        long jM11377getWhite0d7_KjU;
        TextStyle textStyleM14811montserratBoldCustomSpIzzofJo;
        boolean z6;
        boolean z7;
        int i42;
        int i43;
        int i44;
        int i45;
        int i46;
        int i47;
        int i48;
        int i49;
        int i50;
        Function0<Unit> function04;
        Function0<Unit> function05;
        Function0<Unit> function06;
        boolean z8;
        int i51;
        boolean z9;
        int i52;
        int i53;
        boolean z10;
        final float f5;
        final int i54;
        final boolean z11;
        final float f6;
        final boolean z12;
        final Shape shape2;
        final TextStyle textStyle2;
        final int i55;
        final int i56;
        final int i57;
        final int i58;
        final Function0<Unit> function07;
        final Function0<Unit> function08;
        final long j2;
        final boolean z13;
        final String str2;
        final boolean z14;
        final int i59;
        final int i60;
        final boolean z15;
        final int i61;
        final int i62;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(245494841);
        int i63 = i15 & 1;
        if (i63 != 0) {
            i16 = i12 | 6;
        } else if ((i12 & 14) == 0) {
            i16 = (composerStartRestartGroup.changed(f) ? 4 : 2) | i12;
        } else {
            i16 = i12;
        }
        int i64 = i15 & 2;
        if (i64 != 0) {
            i16 |= 48;
        } else {
            if ((i12 & 112) == 0) {
                i16 |= composerStartRestartGroup.changed(f2) ? 32 : 16;
            }
            if ((i12 & 896) == 0) {
                i16 |= ((i15 & 4) == 0 && composerStartRestartGroup.changed(shape)) ? 256 : 128;
            }
            if ((i12 & 7168) == 0) {
                i16 |= ((i15 & 8) == 0 && composerStartRestartGroup.changed(str)) ? 2048 : 1024;
            }
            i17 = i15 & 16;
            if (i17 == 0) {
                i16 |= CpioConstants.C_ISBLK;
            } else if ((i12 & 57344) == 0) {
                i16 |= composerStartRestartGroup.changed(j) ? 16384 : 8192;
            }
            if ((i12 & 458752) == 0) {
                i16 |= ((i15 & 32) == 0 && composerStartRestartGroup.changed(textStyle)) ? 131072 : 65536;
            }
            i18 = i15 & 64;
            if (i18 == 0) {
                i16 |= 1572864;
            } else if ((i12 & 3670016) == 0) {
                i16 |= composerStartRestartGroup.changed(i) ? 1048576 : 524288;
            }
            i19 = i15 & 128;
            if (i19 == 0) {
                i16 |= 12582912;
            } else if ((i12 & 29360128) == 0) {
                i16 |= composerStartRestartGroup.changed(i2) ? 8388608 : 4194304;
            }
            i20 = i15 & 256;
            if (i20 == 0) {
                i16 |= 100663296;
            } else if ((i12 & 234881024) == 0) {
                i16 |= composerStartRestartGroup.changed(z) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
            }
            i21 = i15 & 512;
            if (i21 == 0) {
                i16 |= 805306368;
            } else if ((i12 & 1879048192) == 0) {
                i16 |= composerStartRestartGroup.changed(z2) ? 536870912 : 268435456;
            }
            i22 = i15 & 1024;
            if (i22 == 0) {
                i23 = i13 | 6;
            } else if ((i13 & 14) == 0) {
                i23 = i13 | (composerStartRestartGroup.changed(z3) ? 4 : 2);
            } else {
                i23 = i13;
            }
            i24 = i15 & 2048;
            if (i24 == 0) {
                i23 |= 48;
            } else if ((i13 & 112) == 0) {
                i23 |= composerStartRestartGroup.changed(i3) ? 32 : 16;
            }
            int i65 = i23;
            i25 = i15 & 4096;
            if (i25 == 0) {
                i65 |= 384;
                i26 = i25;
            } else {
                i26 = i25;
                if ((i13 & 896) == 0) {
                    i65 |= composerStartRestartGroup.changed(i4) ? 256 : 128;
                }
                i27 = i15 & 8192;
                if (i27 != 0) {
                    i65 |= 3072;
                    i28 = i27;
                } else {
                    i28 = i27;
                    if ((i13 & 7168) == 0) {
                        i65 |= composerStartRestartGroup.changed(i5) ? 2048 : 1024;
                    }
                    i29 = i15 & 16384;
                    if (i29 == 0) {
                        i65 |= CpioConstants.C_ISBLK;
                        i30 = i29;
                    } else {
                        i30 = i29;
                        if ((i13 & 57344) == 0) {
                            i65 |= composerStartRestartGroup.changed(i6) ? 16384 : 8192;
                        }
                    }
                    i31 = i15 & 32768;
                    if (i31 == 0) {
                        i65 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                    } else if ((i13 & 458752) == 0) {
                        i65 |= composerStartRestartGroup.changed(i7) ? 131072 : 65536;
                    }
                    i32 = i15 & 65536;
                    if (i32 == 0) {
                        i65 |= 1572864;
                    } else if ((i13 & 3670016) == 0) {
                        i65 |= composerStartRestartGroup.changed(i8) ? 1048576 : 524288;
                    }
                    i33 = i15 & 131072;
                    if (i33 == 0) {
                        i65 |= 12582912;
                    } else if ((i13 & 29360128) == 0) {
                        i65 |= composerStartRestartGroup.changed(i9) ? 8388608 : 4194304;
                    }
                    i34 = i15 & 262144;
                    if (i34 == 0) {
                        i65 |= 100663296;
                    } else if ((i13 & 234881024) == 0) {
                        i65 |= composerStartRestartGroup.changed(i10) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                    }
                    i35 = i15 & 524288;
                    if (i35 == 0) {
                        i65 |= 805306368;
                    } else if ((i13 & 1879048192) == 0) {
                        i65 |= composerStartRestartGroup.changed(i11) ? 536870912 : 268435456;
                    }
                    i36 = i15 & 1048576;
                    if (i36 == 0) {
                        i37 = i14 | 6;
                    } else if ((i14 & 14) == 0) {
                        i37 = i14 | (composerStartRestartGroup.changedInstance(function0) ? 4 : 2);
                    } else {
                        i37 = i14;
                    }
                    i38 = i15 & 2097152;
                    if (i38 == 0) {
                        i37 |= 48;
                    } else if ((i14 & 112) == 0) {
                        i37 |= composerStartRestartGroup.changedInstance(function02) ? 32 : 16;
                    }
                    int i66 = i37;
                    i39 = i15 & 4194304;
                    if (i39 == 0) {
                        i66 |= 384;
                    } else {
                        if ((i14 & 896) == 0) {
                            i66 |= composerStartRestartGroup.changedInstance(function03) ? 256 : 128;
                        }
                        i40 = i15 & 8388608;
                        if (i40 == 0) {
                            if ((i14 & 7168) == 0) {
                                i66 |= composerStartRestartGroup.changed(z4) ? 2048 : 1024;
                            }
                            i41 = i15 & 16777216;
                            if (i41 == 0) {
                                i66 |= CpioConstants.C_ISBLK;
                            } else if ((i14 & 57344) == 0) {
                                i66 |= composerStartRestartGroup.changed(z5) ? 16384 : 8192;
                            }
                            if ((i15 & NTLMEngineImpl.FLAG_REQUEST_VERSION) == 0) {
                                i66 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                            } else if ((i14 & 458752) == 0) {
                                i66 |= composerStartRestartGroup.changedInstance(content) ? 131072 : 65536;
                            }
                            if ((i16 & 1533916891) == 306783378 || (1533916891 & i65) != 306783378 || (i66 & 374491) != 74898 || !composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.startDefaults();
                                if ((i12 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                    f3 = i63 == 0 ? 0.8f : f;
                                    f4 = i64 == 0 ? 0.8f : f2;
                                    if ((i15 & 4) == 0) {
                                        shapeM8392RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._14wdp, composerStartRestartGroup, 6));
                                        i16 &= -897;
                                    } else {
                                        shapeM8392RoundedCornerShape0680j_4 = shape;
                                    }
                                    if ((i15 & 8) == 0) {
                                        strEmpty = AnyExtensionKt.empty(StringCompanionObject.INSTANCE);
                                        i16 &= -7169;
                                    } else {
                                        strEmpty = str;
                                    }
                                    jM11377getWhite0d7_KjU = i17 == 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
                                    if ((i15 & 32) == 0) {
                                        textStyleM14811montserratBoldCustomSpIzzofJo = TypographyStyle.INSTANCE.m14811montserratBoldCustomSpIzzofJo(R.dimen._21wsp, jM11377getWhite0d7_KjU, 0, 0L, 0.0f, null, null, composerStartRestartGroup, ((i16 >> 9) & 112) | 12582918, 124);
                                        i16 &= -458753;
                                    } else {
                                        textStyleM14811montserratBoldCustomSpIzzofJo = textStyle;
                                    }
                                    int i67 = i18 == 0 ? R.color.black_80 : i;
                                    int i68 = i19 == 0 ? R.color.black_gray_blue_80 : i2;
                                    z6 = i20 == 0 ? true : z;
                                    boolean z16 = i21 == 0 ? false : z2;
                                    z7 = i22 == 0 ? false : z3;
                                    i42 = i24 == 0 ? R.color.white : i3;
                                    i43 = i26 == 0 ? R.color.white : i4;
                                    i44 = i28 == 0 ? 0 : i5;
                                    i45 = i30 == 0 ? i6 : 0;
                                    i46 = i31 == 0 ? R.dimen._10wdp : i7;
                                    i47 = i32 == 0 ? R.color.white_25 : i8;
                                    i48 = i33 == 0 ? R.color.red : i9;
                                    i49 = i34 == 0 ? R.drawable.ic_left_arrow : i10;
                                    i50 = i35 == 0 ? R.drawable.ic_right_arrow : i11;
                                    function04 = i36 == 0 ? new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.tutorial.PanelInfoBlockKt$PanelInfoBlock$1
                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }
                                    } : function0;
                                    function05 = i38 == 0 ? new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.tutorial.PanelInfoBlockKt$PanelInfoBlock$2
                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }
                                    } : function02;
                                    function06 = i39 == 0 ? new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.tutorial.PanelInfoBlockKt$PanelInfoBlock$3
                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }
                                    } : function03;
                                    z8 = i40 == 0 ? true : z4;
                                    i51 = i16;
                                    z9 = z16;
                                    i52 = i68;
                                    i53 = i67;
                                    z10 = i41 == 0 ? true : z5;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    if ((i15 & 4) != 0) {
                                        i16 &= -897;
                                    }
                                    if ((i15 & 8) != 0) {
                                        i16 &= -7169;
                                    }
                                    if ((i15 & 32) != 0) {
                                        i16 &= -458753;
                                    }
                                    f3 = f;
                                    f4 = f2;
                                    shapeM8392RoundedCornerShape0680j_4 = shape;
                                    strEmpty = str;
                                    jM11377getWhite0d7_KjU = j;
                                    textStyleM14811montserratBoldCustomSpIzzofJo = textStyle;
                                    i53 = i;
                                    i52 = i2;
                                    z6 = z;
                                    z7 = z3;
                                    i42 = i3;
                                    i43 = i4;
                                    i44 = i5;
                                    i45 = i6;
                                    i46 = i7;
                                    i47 = i8;
                                    i48 = i9;
                                    i49 = i10;
                                    i50 = i11;
                                    function04 = function0;
                                    function05 = function02;
                                    function06 = function03;
                                    z8 = z4;
                                    z10 = z5;
                                    i51 = i16;
                                    z9 = z2;
                                }
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(245494841, i51, i65, "com.blackhub.bronline.game.ui.widget.block.tutorial.PanelInfoBlock (PanelInfoBlock.kt:73)");
                                }
                                Modifier.Companion companion = Modifier.INSTANCE;
                                long jColorResource = ColorResources_androidKt.colorResource(i53, composerStartRestartGroup, (i51 >> 18) & 14);
                                final boolean z17 = z9;
                                final boolean z18 = z8;
                                final Function0<Unit> function09 = function05;
                                final boolean z19 = z10;
                                final Function0<Unit> function010 = function06;
                                final int i69 = i49;
                                final int i70 = i43;
                                final float f7 = f3;
                                final float f8 = f4;
                                final Shape shape3 = shapeM8392RoundedCornerShape0680j_4;
                                final int i71 = i52;
                                final boolean z20 = z7;
                                final String str3 = strEmpty;
                                final TextStyle textStyle3 = textStyleM14811montserratBoldCustomSpIzzofJo;
                                final boolean z21 = z6;
                                final Function0<Unit> function011 = function04;
                                final int i72 = i44;
                                final int i73 = i45;
                                final int i74 = i46;
                                final int i75 = i48;
                                final int i76 = i47;
                                final int i77 = i50;
                                final int i78 = i42;
                                Function2<Composer, Integer, Unit> function2 = new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.tutorial.PanelInfoBlockKt$PanelInfoBlock$4
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

                                    /* JADX WARN: Multi-variable type inference failed */
                                    /* JADX WARN: Removed duplicated region for block: B:118:0x06ed  */
                                    /* JADX WARN: Removed duplicated region for block: B:29:0x0150  */
                                    /* JADX WARN: Removed duplicated region for block: B:74:0x0472  */
                                    /* JADX WARN: Type inference failed for: r12v22 */
                                    /* JADX WARN: Type inference failed for: r12v7 */
                                    /* JADX WARN: Type inference failed for: r12v8, types: [boolean, int] */
                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                    */
                                    public final void invoke(@Nullable Composer composer2, int i79) {
                                        Modifier.Companion companion2;
                                        int i80;
                                        Composer composer3;
                                        ?? r12;
                                        Function0<Unit> function012;
                                        boolean z22;
                                        boolean z23;
                                        RowScopeInstance rowScopeInstance;
                                        float f9;
                                        float f10;
                                        Shape shape4;
                                        int i81;
                                        Function2<Composer, Integer, Unit> function22;
                                        String str4;
                                        TextStyle textStyle4;
                                        Function0<Unit> function013;
                                        int i82;
                                        int i83;
                                        int i84;
                                        int i85;
                                        int i86;
                                        int i87;
                                        int i88;
                                        boolean z24;
                                        boolean z25;
                                        Modifier.Companion companion3;
                                        int i89;
                                        boolean z26;
                                        int i90;
                                        int i91;
                                        int i92;
                                        int i93;
                                        if ((i79 & 11) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1633972165, i79, -1, "com.blackhub.bronline.game.ui.widget.block.tutorial.PanelInfoBlock.<anonymous> (PanelInfoBlock.kt:78)");
                                            }
                                            Modifier.Companion companion4 = Modifier.INSTANCE;
                                            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion4, 0.0f, 1, null);
                                            Alignment.Companion companion5 = Alignment.INSTANCE;
                                            Alignment.Vertical centerVertically = companion5.getCenterVertically();
                                            Arrangement arrangement = Arrangement.INSTANCE;
                                            Arrangement.HorizontalOrVertical center = arrangement.getCenter();
                                            boolean z27 = z17;
                                            boolean z28 = z18;
                                            final Function0<Unit> function014 = function09;
                                            boolean z29 = z19;
                                            Function0<Unit> function015 = function010;
                                            final int i94 = i69;
                                            final int i95 = i70;
                                            float f11 = f7;
                                            float f12 = f8;
                                            Shape shape5 = shape3;
                                            int i96 = i71;
                                            Function2<Composer, Integer, Unit> function23 = content;
                                            boolean z30 = z20;
                                            String str5 = str3;
                                            TextStyle textStyle5 = textStyle3;
                                            boolean z31 = z21;
                                            Function0<Unit> function016 = function011;
                                            int i97 = i72;
                                            int i98 = i73;
                                            int i99 = i74;
                                            int i100 = i75;
                                            int i101 = i76;
                                            int i102 = i77;
                                            int i103 = i78;
                                            composer2.startReplaceableGroup(693286680);
                                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer2, 54);
                                            composer2.startReplaceableGroup(-1323940314);
                                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                            ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor = companion6.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
                                            if (!(composer2.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer2.startReusableNode();
                                            if (composer2.getInserting()) {
                                                composer2.createNode(constructor);
                                            } else {
                                                composer2.useNode();
                                            }
                                            Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer2);
                                            Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRowMeasurePolicy, companion6.getSetMeasurePolicy());
                                            Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion6.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion6.getSetCompositeKeyHash();
                                            if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                            }
                                            function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                                            composer2.startReplaceableGroup(2058660585);
                                            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                                            composer2.startReplaceableGroup(1027787316);
                                            if (z27) {
                                                Modifier modifierM8172size3ABfNKs = SizeKt.m8172size3ABfNKs(rowScopeInstance2.align(companion4, companion5.getCenterVertically()), PrimitiveResources_androidKt.dimensionResource(R.dimen._34wdp, composer2, 6));
                                                composer2.startReplaceableGroup(1027787676);
                                                boolean zChanged = composer2.changed(function014);
                                                Object objRememberedValue = composer2.rememberedValue();
                                                if (!zChanged) {
                                                    Object obj = objRememberedValue;
                                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                        Function0<Unit> function017 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.tutorial.PanelInfoBlockKt$PanelInfoBlock$4$1$1$1
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            {
                                                                super(0);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function0
                                                            public /* bridge */ /* synthetic */ Unit invoke() {
                                                                invoke2();
                                                                return Unit.INSTANCE;
                                                            }

                                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                            public final void invoke2() {
                                                                function014.invoke();
                                                            }
                                                        };
                                                        composer2.updateRememberedValue(function017);
                                                        obj = function017;
                                                    }
                                                    composer2.endReplaceableGroup();
                                                    function012 = function015;
                                                    z22 = z29;
                                                    z23 = z27;
                                                    rowScopeInstance = rowScopeInstance2;
                                                    f9 = f11;
                                                    f10 = f12;
                                                    shape4 = shape5;
                                                    i81 = i96;
                                                    function22 = function23;
                                                    str4 = str5;
                                                    textStyle4 = textStyle5;
                                                    function013 = function016;
                                                    i82 = i97;
                                                    i83 = i98;
                                                    i84 = i99;
                                                    i85 = i100;
                                                    i86 = i101;
                                                    i87 = i102;
                                                    i88 = i103;
                                                    z24 = z31;
                                                    z25 = z30;
                                                    ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(modifierM8172size3ABfNKs, null, z28, null, true, false, false, false, null, 0, 0L, null, (Function0) obj, ComposableLambdaKt.composableLambda(composer2, 808350611, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.tutorial.PanelInfoBlockKt$PanelInfoBlock$4$1$2
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(2);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                            invoke(composer4, num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                                        @Composable
                                                        public final void invoke(@Nullable Composer composer4, int i104) {
                                                            if ((i104 & 11) != 2 || !composer4.getSkipping()) {
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventStart(808350611, i104, -1, "com.blackhub.bronline.game.ui.widget.block.tutorial.PanelInfoBlock.<anonymous>.<anonymous>.<anonymous> (PanelInfoBlock.kt:95)");
                                                                }
                                                                IconKt.m9496Iconww6aTOc(PainterResources_androidKt.painterResource(i94, composer4, 0), (String) null, (Modifier) null, ColorResources_androidKt.colorResource(i95, composer4, 0), composer4, 56, 4);
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventEnd();
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            composer4.skipToGroupEnd();
                                                        }
                                                    }), composer2, CpioConstants.C_ISBLK, 3072, 4074);
                                                    composer3 = composer2;
                                                    i80 = 6;
                                                    companion2 = companion4;
                                                    r12 = 0;
                                                    SpacerKt.Spacer(SizeKt.m8177width3ABfNKs(companion2, PrimitiveResources_androidKt.dimensionResource(R.dimen._40wdp, composer3, 6)), composer3, 0);
                                                }
                                            } else {
                                                companion2 = companion4;
                                                i80 = 6;
                                                composer3 = composer2;
                                                r12 = 0;
                                                function012 = function015;
                                                z22 = z29;
                                                z23 = z27;
                                                rowScopeInstance = rowScopeInstance2;
                                                f9 = f11;
                                                f10 = f12;
                                                shape4 = shape5;
                                                i81 = i96;
                                                function22 = function23;
                                                str4 = str5;
                                                textStyle4 = textStyle5;
                                                function013 = function016;
                                                i82 = i97;
                                                i83 = i98;
                                                i84 = i99;
                                                i85 = i100;
                                                i86 = i101;
                                                i87 = i102;
                                                i88 = i103;
                                                z24 = z31;
                                                z25 = z30;
                                            }
                                            composer2.endReplaceableGroup();
                                            Alignment center2 = companion5.getCenter();
                                            composer3.startReplaceableGroup(733328855);
                                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center2, r12, composer3, i80);
                                            composer3.startReplaceableGroup(-1323940314);
                                            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, r12);
                                            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                                            Function0<ComposeUiNode> constructor2 = companion6.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion2);
                                            if (!(composer2.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer2.startReusableNode();
                                            if (composer2.getInserting()) {
                                                composer3.createNode(constructor2);
                                            } else {
                                                composer2.useNode();
                                            }
                                            Composer composerM10870constructorimpl2 = Updater.m10870constructorimpl(composer2);
                                            Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy, companion6.getSetMeasurePolicy());
                                            Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion6.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion6.getSetCompositeKeyHash();
                                            if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                            }
                                            function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer3, Integer.valueOf((int) r12));
                                            composer3.startReplaceableGroup(2058660585);
                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                            Shape shape6 = shape4;
                                            Modifier modifierM8123padding3ABfNKs = PaddingKt.m8123padding3ABfNKs(BorderKt.m7782borderxT4_qwU(BackgroundKt.m7771backgroundbw27NRU$default(ClipKt.clip(SizeKt.fillMaxHeight(SizeKt.fillMaxWidth(companion2, f9), f10), shape6), ColorResources_androidKt.colorResource(i81, composer3, r12), null, 2, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._1wdp, composer3, i80), ColorResources_androidKt.colorResource(R.color.light_gray_blue, composer3, i80), shape6), PrimitiveResources_androidKt.dimensionResource(R.dimen._16wdp, composer3, i80));
                                            composer3.startReplaceableGroup(-483455358);
                                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion5.getStart(), composer3, r12);
                                            composer3.startReplaceableGroup(-1323940314);
                                            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, r12);
                                            CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                                            Function0<ComposeUiNode> constructor3 = companion6.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM8123padding3ABfNKs);
                                            if (!(composer2.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer2.startReusableNode();
                                            if (composer2.getInserting()) {
                                                composer3.createNode(constructor3);
                                            } else {
                                                composer2.useNode();
                                            }
                                            Composer composerM10870constructorimpl3 = Updater.m10870constructorimpl(composer2);
                                            Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyColumnMeasurePolicy, companion6.getSetMeasurePolicy());
                                            Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion6.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion6.getSetCompositeKeyHash();
                                            if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                                composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                                composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                            }
                                            function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer3, Integer.valueOf((int) r12));
                                            composer3.startReplaceableGroup(2058660585);
                                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                                            composer3.startReplaceableGroup(733328855);
                                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion5.getTopStart(), r12, composer3, r12);
                                            composer3.startReplaceableGroup(-1323940314);
                                            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer3, r12);
                                            CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                                            Function0<ComposeUiNode> constructor4 = companion6.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
                                            if (!(composer2.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer2.startReusableNode();
                                            if (composer2.getInserting()) {
                                                composer3.createNode(constructor4);
                                            } else {
                                                composer2.useNode();
                                            }
                                            Composer composerM10870constructorimpl4 = Updater.m10870constructorimpl(composer2);
                                            Updater.m10877setimpl(composerM10870constructorimpl4, measurePolicyRememberBoxMeasurePolicy2, companion6.getSetMeasurePolicy());
                                            Updater.m10877setimpl(composerM10870constructorimpl4, currentCompositionLocalMap4, companion6.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion6.getSetCompositeKeyHash();
                                            if (composerM10870constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                                composerM10870constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                                composerM10870constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                            }
                                            function3ModifierMaterializerOf4.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer3, Integer.valueOf((int) r12));
                                            composer3.startReplaceableGroup(2058660585);
                                            int i104 = r12;
                                            Modifier.Companion companion7 = companion2;
                                            TextKt.m10024Text4IGK_g(str4, boxScopeInstance.align(companion2, companion5.getCenter()), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle4, composer2, 0, 0, 65532);
                                            composer2.startReplaceableGroup(688005267);
                                            if (z24) {
                                                Modifier modifierM8172size3ABfNKs2 = SizeKt.m8172size3ABfNKs(boxScopeInstance.align(companion7, companion5.getTopEnd()), PrimitiveResources_androidKt.dimensionResource(R.dimen._16wdp, composer2, 6));
                                                composer2.startReplaceableGroup(-1487746325);
                                                final Function0<Unit> function018 = function013;
                                                boolean zChanged2 = composer2.changed(function018);
                                                Object objRememberedValue2 = composer2.rememberedValue();
                                                if (!zChanged2) {
                                                    Object obj2 = objRememberedValue2;
                                                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                        Function0<Unit> function019 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.tutorial.PanelInfoBlockKt$PanelInfoBlock$4$1$3$1$1$1$1
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            {
                                                                super(0);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function0
                                                            public /* bridge */ /* synthetic */ Unit invoke() {
                                                                invoke2();
                                                                return Unit.INSTANCE;
                                                            }

                                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                            public final void invoke2() {
                                                                function018.invoke();
                                                            }
                                                        };
                                                        composer2.updateRememberedValue(function019);
                                                        obj2 = function019;
                                                    }
                                                    composer2.endReplaceableGroup();
                                                    companion3 = companion7;
                                                    ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(modifierM8172size3ABfNKs2, null, false, null, false, false, false, false, null, 0, 0L, null, (Function0) obj2, ComposableSingletons$PanelInfoBlockKt.INSTANCE.m15066getLambda1$app_siteRelease(), composer2, 0, 3072, 4094);
                                                }
                                            } else {
                                                companion3 = companion7;
                                            }
                                            composer2.endReplaceableGroup();
                                            composer2.endReplaceableGroup();
                                            composer2.endNode();
                                            composer2.endReplaceableGroup();
                                            composer2.endReplaceableGroup();
                                            function22.invoke(composer2, Integer.valueOf(i104));
                                            composer2.startReplaceableGroup(-1228041920);
                                            if (z25) {
                                                Modifier.Companion companion8 = companion3;
                                                z26 = true;
                                                Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion8, 0.0f, 1, null);
                                                Alignment bottomCenter = companion5.getBottomCenter();
                                                composer2.startReplaceableGroup(733328855);
                                                boolean z32 = i104;
                                                i90 = 6;
                                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(bottomCenter, z32, composer2, 6);
                                                composer2.startReplaceableGroup(-1323940314);
                                                int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer2, z32 ? 1 : 0);
                                                CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                                                Function0<ComposeUiNode> constructor5 = companion6.getConstructor();
                                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default2);
                                                if (!(composer2.getApplier() instanceof Applier)) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer2.startReusableNode();
                                                if (composer2.getInserting()) {
                                                    composer2.createNode(constructor5);
                                                } else {
                                                    composer2.useNode();
                                                }
                                                Composer composerM10870constructorimpl5 = Updater.m10870constructorimpl(composer2);
                                                Updater.m10877setimpl(composerM10870constructorimpl5, measurePolicyRememberBoxMeasurePolicy3, companion6.getSetMeasurePolicy());
                                                Updater.m10877setimpl(composerM10870constructorimpl5, currentCompositionLocalMap5, companion6.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion6.getSetCompositeKeyHash();
                                                if (composerM10870constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                                                    composerM10870constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                                                    composerM10870constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                                                }
                                                function3ModifierMaterializerOf5.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, Integer.valueOf(z32 ? 1 : 0));
                                                composer2.startReplaceableGroup(2058660585);
                                                composer2.startReplaceableGroup(693286680);
                                                MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion5.getTop(), composer2, z32 ? 1 : 0);
                                                composer2.startReplaceableGroup(-1323940314);
                                                int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer2, z32 ? 1 : 0);
                                                CompositionLocalMap currentCompositionLocalMap6 = composer2.getCurrentCompositionLocalMap();
                                                Function0<ComposeUiNode> constructor6 = companion6.getConstructor();
                                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(companion8);
                                                if (!(composer2.getApplier() instanceof Applier)) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer2.startReusableNode();
                                                if (composer2.getInserting()) {
                                                    composer2.createNode(constructor6);
                                                } else {
                                                    composer2.useNode();
                                                }
                                                Composer composerM10870constructorimpl6 = Updater.m10870constructorimpl(composer2);
                                                Updater.m10877setimpl(composerM10870constructorimpl6, measurePolicyRowMeasurePolicy2, companion6.getSetMeasurePolicy());
                                                Updater.m10877setimpl(composerM10870constructorimpl6, currentCompositionLocalMap6, companion6.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = companion6.getSetCompositeKeyHash();
                                                if (composerM10870constructorimpl6.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                                                    composerM10870constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                                                    composerM10870constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                                                }
                                                function3ModifierMaterializerOf6.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, Integer.valueOf(z32 ? 1 : 0));
                                                composer2.startReplaceableGroup(2058660585);
                                                composer2.startReplaceableGroup(-1487745503);
                                                int i105 = z32 ? 1 : 0;
                                                int i106 = i82;
                                                while (i105 < i106) {
                                                    int i107 = i83;
                                                    if (i105 == i107) {
                                                        composer2.startReplaceableGroup(-416193372);
                                                        i91 = i84;
                                                        i92 = i85;
                                                        BoxKt.Box(BackgroundKt.m7770backgroundbw27NRU(SizeKt.m8172size3ABfNKs(PaddingKt.m8123padding3ABfNKs(Modifier.INSTANCE, PrimitiveResources_androidKt.dimensionResource(R.dimen._3wdp, composer2, 6)), PrimitiveResources_androidKt.dimensionResource(i91, composer2, z32 ? 1 : 0)), ColorResources_androidKt.colorResource(i92, composer2, z32 ? 1 : 0), RoundedCornerShapeKt.getCircleShape()), composer2, z32 ? 1 : 0);
                                                        composer2.endReplaceableGroup();
                                                        i93 = i86;
                                                    } else {
                                                        i91 = i84;
                                                        i92 = i85;
                                                        composer2.startReplaceableGroup(-416192649);
                                                        i93 = i86;
                                                        BoxKt.Box(BackgroundKt.m7770backgroundbw27NRU(SizeKt.m8172size3ABfNKs(PaddingKt.m8123padding3ABfNKs(Modifier.INSTANCE, PrimitiveResources_androidKt.dimensionResource(R.dimen._3wdp, composer2, 6)), PrimitiveResources_androidKt.dimensionResource(i91, composer2, z32 ? 1 : 0)), ColorResources_androidKt.colorResource(i93, composer2, z32 ? 1 : 0), RoundedCornerShapeKt.getCircleShape()), composer2, z32 ? 1 : 0);
                                                        composer2.endReplaceableGroup();
                                                    }
                                                    i105++;
                                                    i83 = i107;
                                                    i84 = i91;
                                                    i85 = i92;
                                                    i86 = i93;
                                                }
                                                composer2.endReplaceableGroup();
                                                composer2.endReplaceableGroup();
                                                composer2.endNode();
                                                composer2.endReplaceableGroup();
                                                composer2.endReplaceableGroup();
                                                composer2.endReplaceableGroup();
                                                composer2.endNode();
                                                composer2.endReplaceableGroup();
                                                composer2.endReplaceableGroup();
                                                i89 = z32;
                                            } else {
                                                i89 = i104;
                                                z26 = true;
                                                i90 = 6;
                                            }
                                            composer2.endReplaceableGroup();
                                            composer2.endReplaceableGroup();
                                            composer2.endNode();
                                            composer2.endReplaceableGroup();
                                            composer2.endReplaceableGroup();
                                            composer2.endReplaceableGroup();
                                            composer2.endNode();
                                            composer2.endReplaceableGroup();
                                            composer2.endReplaceableGroup();
                                            composer2.startReplaceableGroup(-1081100435);
                                            if (z23) {
                                                Modifier.Companion companion9 = Modifier.INSTANCE;
                                                SpacerKt.Spacer(SizeKt.m8177width3ABfNKs(companion9, PrimitiveResources_androidKt.dimensionResource(R.dimen._40wdp, composer2, i90)), composer2, i89);
                                                Modifier modifierM8172size3ABfNKs3 = SizeKt.m8172size3ABfNKs(rowScopeInstance.align(companion9, Alignment.INSTANCE.getCenterVertically()), PrimitiveResources_androidKt.dimensionResource(R.dimen._34wdp, composer2, i90));
                                                composer2.startReplaceableGroup(1027792594);
                                                final Function0<Unit> function020 = function012;
                                                boolean zChanged3 = composer2.changed(function020);
                                                Object objRememberedValue3 = composer2.rememberedValue();
                                                if (!zChanged3) {
                                                    Object obj3 = objRememberedValue3;
                                                    if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                        Function0<Unit> function021 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.tutorial.PanelInfoBlockKt$PanelInfoBlock$4$1$4$1
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            {
                                                                super(0);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function0
                                                            public /* bridge */ /* synthetic */ Unit invoke() {
                                                                invoke2();
                                                                return Unit.INSTANCE;
                                                            }

                                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                            public final void invoke2() {
                                                                function020.invoke();
                                                            }
                                                        };
                                                        composer2.updateRememberedValue(function021);
                                                        obj3 = function021;
                                                    }
                                                    Function0 function022 = (Function0) obj3;
                                                    composer2.endReplaceableGroup();
                                                    final int i108 = i87;
                                                    final int i109 = i88;
                                                    ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(modifierM8172size3ABfNKs3, null, z22, null, true, false, false, false, null, 0, 0L, null, function022, ComposableLambdaKt.composableLambda(composer2, 1183897418, z26, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.tutorial.PanelInfoBlockKt$PanelInfoBlock$4$1$5
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(2);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                            invoke(composer4, num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                                        @Composable
                                                        public final void invoke(@Nullable Composer composer4, int i110) {
                                                            if ((i110 & 11) != 2 || !composer4.getSkipping()) {
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventStart(1183897418, i110, -1, "com.blackhub.bronline.game.ui.widget.block.tutorial.PanelInfoBlock.<anonymous>.<anonymous>.<anonymous> (PanelInfoBlock.kt:201)");
                                                                }
                                                                IconKt.m9496Iconww6aTOc(PainterResources_androidKt.painterResource(i108, composer4, 0), (String) null, (Modifier) null, ColorResources_androidKt.colorResource(i109, composer4, 0), composer4, 56, 4);
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventEnd();
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            composer4.skipToGroupEnd();
                                                        }
                                                    }), composer2, CpioConstants.C_ISBLK, 3072, 4074);
                                                }
                                            }
                                            composer2.endReplaceableGroup();
                                            composer2.endReplaceableGroup();
                                            composer2.endNode();
                                            composer2.endReplaceableGroup();
                                            composer2.endReplaceableGroup();
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }
                                };
                                float f9 = f3;
                                int i79 = i53;
                                FakeDialogKt.m15089FakeDialog3IgeMak(companion, jColorResource, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1633972165, true, function2), composerStartRestartGroup, 390, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                f5 = f9;
                                i54 = i52;
                                z11 = z9;
                                f6 = f4;
                                z12 = z7;
                                shape2 = shapeM8392RoundedCornerShape0680j_4;
                                textStyle2 = textStyleM14811montserratBoldCustomSpIzzofJo;
                                i55 = i45;
                                i56 = i43;
                                i57 = i47;
                                i58 = i48;
                                function07 = function04;
                                function08 = function05;
                                j2 = jM11377getWhite0d7_KjU;
                                z13 = z6;
                                str2 = strEmpty;
                                z14 = z10;
                                i59 = i46;
                                i60 = i50;
                                z15 = z8;
                                i61 = i42;
                                i62 = i79;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                f5 = f;
                                f6 = f2;
                                shape2 = shape;
                                str2 = str;
                                j2 = j;
                                textStyle2 = textStyle;
                                i62 = i;
                                i54 = i2;
                                z13 = z;
                                z11 = z2;
                                z12 = z3;
                                i61 = i3;
                                i56 = i4;
                                i44 = i5;
                                i55 = i6;
                                i59 = i7;
                                i57 = i8;
                                i58 = i9;
                                i49 = i10;
                                i60 = i11;
                                function07 = function0;
                                function08 = function02;
                                function06 = function03;
                                z15 = z4;
                                z14 = z5;
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                final int i80 = i44;
                                final int i81 = i49;
                                final Function0<Unit> function012 = function06;
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.tutorial.PanelInfoBlockKt$PanelInfoBlock$5
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

                                    public final void invoke(@Nullable Composer composer2, int i82) {
                                        PanelInfoBlockKt.m15068PanelInfoBlockGF6hDo(f5, f6, shape2, str2, j2, textStyle2, i62, i54, z13, z11, z12, i61, i56, i80, i55, i59, i57, i58, i81, i60, function07, function08, function012, z15, z14, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i12 | 1), RecomposeScopeImplKt.updateChangedFlags(i13), RecomposeScopeImplKt.updateChangedFlags(i14), i15);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i66 |= 3072;
                        i41 = i15 & 16777216;
                        if (i41 == 0) {
                        }
                        if ((i15 & NTLMEngineImpl.FLAG_REQUEST_VERSION) == 0) {
                        }
                        if ((i16 & 1533916891) == 306783378) {
                            composerStartRestartGroup.startDefaults();
                            if ((i12 & 1) != 0) {
                                if (i63 == 0) {
                                }
                                if (i64 == 0) {
                                }
                                if ((i15 & 4) == 0) {
                                }
                                if ((i15 & 8) == 0) {
                                }
                                if (i17 == 0) {
                                }
                                if ((i15 & 32) == 0) {
                                }
                                if (i18 == 0) {
                                }
                                if (i19 == 0) {
                                }
                                if (i20 == 0) {
                                }
                                if (i21 == 0) {
                                }
                                if (i22 == 0) {
                                }
                                if (i24 == 0) {
                                }
                                if (i26 == 0) {
                                }
                                if (i28 == 0) {
                                }
                                if (i30 == 0) {
                                }
                                if (i31 == 0) {
                                }
                                if (i32 == 0) {
                                }
                                if (i33 == 0) {
                                }
                                if (i34 == 0) {
                                }
                                if (i35 == 0) {
                                }
                                if (i36 == 0) {
                                }
                                if (i38 == 0) {
                                }
                                if (i39 == 0) {
                                }
                                if (i40 == 0) {
                                }
                                i51 = i16;
                                z9 = z16;
                                i52 = i68;
                                i53 = i67;
                                if (i41 == 0) {
                                }
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                long jColorResource2 = ColorResources_androidKt.colorResource(i53, composerStartRestartGroup, (i51 >> 18) & 14);
                                final boolean z172 = z9;
                                final boolean z182 = z8;
                                final Function0<Unit> function092 = function05;
                                final boolean z192 = z10;
                                final Function0<Unit> function0102 = function06;
                                final int i692 = i49;
                                final int i702 = i43;
                                final float f72 = f3;
                                final float f82 = f4;
                                final Shape shape32 = shapeM8392RoundedCornerShape0680j_4;
                                final int i712 = i52;
                                final boolean z202 = z7;
                                final String str32 = strEmpty;
                                final TextStyle textStyle32 = textStyleM14811montserratBoldCustomSpIzzofJo;
                                final boolean z212 = z6;
                                final Function0<Unit> function0112 = function04;
                                final int i722 = i44;
                                final int i732 = i45;
                                final int i742 = i46;
                                final int i752 = i48;
                                final int i762 = i47;
                                final int i772 = i50;
                                final int i782 = i42;
                                Function2<Composer, Integer, Unit> function22 = new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.tutorial.PanelInfoBlockKt$PanelInfoBlock$4
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

                                    /* JADX WARN: Multi-variable type inference failed */
                                    /* JADX WARN: Removed duplicated region for block: B:118:0x06ed  */
                                    /* JADX WARN: Removed duplicated region for block: B:29:0x0150  */
                                    /* JADX WARN: Removed duplicated region for block: B:74:0x0472  */
                                    /* JADX WARN: Type inference failed for: r12v22 */
                                    /* JADX WARN: Type inference failed for: r12v7 */
                                    /* JADX WARN: Type inference failed for: r12v8, types: [boolean, int] */
                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                    */
                                    public final void invoke(@Nullable Composer composer2, int i792) {
                                        Modifier.Companion companion22;
                                        int i802;
                                        Composer composer3;
                                        ?? r12;
                                        Function0<Unit> function0122;
                                        boolean z22;
                                        boolean z23;
                                        RowScopeInstance rowScopeInstance;
                                        float f92;
                                        float f10;
                                        Shape shape4;
                                        int i812;
                                        Function2<Composer, Integer, Unit> function222;
                                        String str4;
                                        TextStyle textStyle4;
                                        Function0<Unit> function013;
                                        int i82;
                                        int i83;
                                        int i84;
                                        int i85;
                                        int i86;
                                        int i87;
                                        int i88;
                                        boolean z24;
                                        boolean z25;
                                        Modifier.Companion companion3;
                                        int i89;
                                        boolean z26;
                                        int i90;
                                        int i91;
                                        int i92;
                                        int i93;
                                        if ((i792 & 11) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1633972165, i792, -1, "com.blackhub.bronline.game.ui.widget.block.tutorial.PanelInfoBlock.<anonymous> (PanelInfoBlock.kt:78)");
                                            }
                                            Modifier.Companion companion4 = Modifier.INSTANCE;
                                            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion4, 0.0f, 1, null);
                                            Alignment.Companion companion5 = Alignment.INSTANCE;
                                            Alignment.Vertical centerVertically = companion5.getCenterVertically();
                                            Arrangement arrangement = Arrangement.INSTANCE;
                                            Arrangement.HorizontalOrVertical center = arrangement.getCenter();
                                            boolean z27 = z172;
                                            boolean z28 = z182;
                                            final Function0<Unit> function014 = function092;
                                            boolean z29 = z192;
                                            Function0<Unit> function015 = function0102;
                                            final int i94 = i692;
                                            final int i95 = i702;
                                            float f11 = f72;
                                            float f12 = f82;
                                            Shape shape5 = shape32;
                                            int i96 = i712;
                                            Function2<Composer, Integer, Unit> function23 = content;
                                            boolean z30 = z202;
                                            String str5 = str32;
                                            TextStyle textStyle5 = textStyle32;
                                            boolean z31 = z212;
                                            Function0<Unit> function016 = function0112;
                                            int i97 = i722;
                                            int i98 = i732;
                                            int i99 = i742;
                                            int i100 = i752;
                                            int i101 = i762;
                                            int i102 = i772;
                                            int i103 = i782;
                                            composer2.startReplaceableGroup(693286680);
                                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer2, 54);
                                            composer2.startReplaceableGroup(-1323940314);
                                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                            ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor = companion6.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
                                            if (!(composer2.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer2.startReusableNode();
                                            if (composer2.getInserting()) {
                                                composer2.createNode(constructor);
                                            } else {
                                                composer2.useNode();
                                            }
                                            Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer2);
                                            Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRowMeasurePolicy, companion6.getSetMeasurePolicy());
                                            Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion6.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion6.getSetCompositeKeyHash();
                                            if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                            }
                                            function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                                            composer2.startReplaceableGroup(2058660585);
                                            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                                            composer2.startReplaceableGroup(1027787316);
                                            if (z27) {
                                                Modifier modifierM8172size3ABfNKs = SizeKt.m8172size3ABfNKs(rowScopeInstance2.align(companion4, companion5.getCenterVertically()), PrimitiveResources_androidKt.dimensionResource(R.dimen._34wdp, composer2, 6));
                                                composer2.startReplaceableGroup(1027787676);
                                                boolean zChanged = composer2.changed(function014);
                                                Object objRememberedValue = composer2.rememberedValue();
                                                if (!zChanged) {
                                                    Object obj = objRememberedValue;
                                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                        Function0<Unit> function017 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.tutorial.PanelInfoBlockKt$PanelInfoBlock$4$1$1$1
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            {
                                                                super(0);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function0
                                                            public /* bridge */ /* synthetic */ Unit invoke() {
                                                                invoke2();
                                                                return Unit.INSTANCE;
                                                            }

                                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                            public final void invoke2() {
                                                                function014.invoke();
                                                            }
                                                        };
                                                        composer2.updateRememberedValue(function017);
                                                        obj = function017;
                                                    }
                                                    composer2.endReplaceableGroup();
                                                    function0122 = function015;
                                                    z22 = z29;
                                                    z23 = z27;
                                                    rowScopeInstance = rowScopeInstance2;
                                                    f92 = f11;
                                                    f10 = f12;
                                                    shape4 = shape5;
                                                    i812 = i96;
                                                    function222 = function23;
                                                    str4 = str5;
                                                    textStyle4 = textStyle5;
                                                    function013 = function016;
                                                    i82 = i97;
                                                    i83 = i98;
                                                    i84 = i99;
                                                    i85 = i100;
                                                    i86 = i101;
                                                    i87 = i102;
                                                    i88 = i103;
                                                    z24 = z31;
                                                    z25 = z30;
                                                    ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(modifierM8172size3ABfNKs, null, z28, null, true, false, false, false, null, 0, 0L, null, (Function0) obj, ComposableLambdaKt.composableLambda(composer2, 808350611, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.tutorial.PanelInfoBlockKt$PanelInfoBlock$4$1$2
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(2);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                            invoke(composer4, num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                                        @Composable
                                                        public final void invoke(@Nullable Composer composer4, int i104) {
                                                            if ((i104 & 11) != 2 || !composer4.getSkipping()) {
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventStart(808350611, i104, -1, "com.blackhub.bronline.game.ui.widget.block.tutorial.PanelInfoBlock.<anonymous>.<anonymous>.<anonymous> (PanelInfoBlock.kt:95)");
                                                                }
                                                                IconKt.m9496Iconww6aTOc(PainterResources_androidKt.painterResource(i94, composer4, 0), (String) null, (Modifier) null, ColorResources_androidKt.colorResource(i95, composer4, 0), composer4, 56, 4);
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventEnd();
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            composer4.skipToGroupEnd();
                                                        }
                                                    }), composer2, CpioConstants.C_ISBLK, 3072, 4074);
                                                    composer3 = composer2;
                                                    i802 = 6;
                                                    companion22 = companion4;
                                                    r12 = 0;
                                                    SpacerKt.Spacer(SizeKt.m8177width3ABfNKs(companion22, PrimitiveResources_androidKt.dimensionResource(R.dimen._40wdp, composer3, 6)), composer3, 0);
                                                }
                                            } else {
                                                companion22 = companion4;
                                                i802 = 6;
                                                composer3 = composer2;
                                                r12 = 0;
                                                function0122 = function015;
                                                z22 = z29;
                                                z23 = z27;
                                                rowScopeInstance = rowScopeInstance2;
                                                f92 = f11;
                                                f10 = f12;
                                                shape4 = shape5;
                                                i812 = i96;
                                                function222 = function23;
                                                str4 = str5;
                                                textStyle4 = textStyle5;
                                                function013 = function016;
                                                i82 = i97;
                                                i83 = i98;
                                                i84 = i99;
                                                i85 = i100;
                                                i86 = i101;
                                                i87 = i102;
                                                i88 = i103;
                                                z24 = z31;
                                                z25 = z30;
                                            }
                                            composer2.endReplaceableGroup();
                                            Alignment center2 = companion5.getCenter();
                                            composer3.startReplaceableGroup(733328855);
                                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center2, r12, composer3, i802);
                                            composer3.startReplaceableGroup(-1323940314);
                                            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, r12);
                                            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                                            Function0<ComposeUiNode> constructor2 = companion6.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion22);
                                            if (!(composer2.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer2.startReusableNode();
                                            if (composer2.getInserting()) {
                                                composer3.createNode(constructor2);
                                            } else {
                                                composer2.useNode();
                                            }
                                            Composer composerM10870constructorimpl2 = Updater.m10870constructorimpl(composer2);
                                            Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy, companion6.getSetMeasurePolicy());
                                            Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion6.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion6.getSetCompositeKeyHash();
                                            if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                            }
                                            function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer3, Integer.valueOf((int) r12));
                                            composer3.startReplaceableGroup(2058660585);
                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                            Shape shape6 = shape4;
                                            Modifier modifierM8123padding3ABfNKs = PaddingKt.m8123padding3ABfNKs(BorderKt.m7782borderxT4_qwU(BackgroundKt.m7771backgroundbw27NRU$default(ClipKt.clip(SizeKt.fillMaxHeight(SizeKt.fillMaxWidth(companion22, f92), f10), shape6), ColorResources_androidKt.colorResource(i812, composer3, r12), null, 2, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._1wdp, composer3, i802), ColorResources_androidKt.colorResource(R.color.light_gray_blue, composer3, i802), shape6), PrimitiveResources_androidKt.dimensionResource(R.dimen._16wdp, composer3, i802));
                                            composer3.startReplaceableGroup(-483455358);
                                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion5.getStart(), composer3, r12);
                                            composer3.startReplaceableGroup(-1323940314);
                                            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, r12);
                                            CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                                            Function0<ComposeUiNode> constructor3 = companion6.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM8123padding3ABfNKs);
                                            if (!(composer2.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer2.startReusableNode();
                                            if (composer2.getInserting()) {
                                                composer3.createNode(constructor3);
                                            } else {
                                                composer2.useNode();
                                            }
                                            Composer composerM10870constructorimpl3 = Updater.m10870constructorimpl(composer2);
                                            Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyColumnMeasurePolicy, companion6.getSetMeasurePolicy());
                                            Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion6.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion6.getSetCompositeKeyHash();
                                            if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                                composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                                composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                            }
                                            function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer3, Integer.valueOf((int) r12));
                                            composer3.startReplaceableGroup(2058660585);
                                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion22, 0.0f, 1, null);
                                            composer3.startReplaceableGroup(733328855);
                                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion5.getTopStart(), r12, composer3, r12);
                                            composer3.startReplaceableGroup(-1323940314);
                                            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer3, r12);
                                            CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                                            Function0<ComposeUiNode> constructor4 = companion6.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
                                            if (!(composer2.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer2.startReusableNode();
                                            if (composer2.getInserting()) {
                                                composer3.createNode(constructor4);
                                            } else {
                                                composer2.useNode();
                                            }
                                            Composer composerM10870constructorimpl4 = Updater.m10870constructorimpl(composer2);
                                            Updater.m10877setimpl(composerM10870constructorimpl4, measurePolicyRememberBoxMeasurePolicy2, companion6.getSetMeasurePolicy());
                                            Updater.m10877setimpl(composerM10870constructorimpl4, currentCompositionLocalMap4, companion6.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion6.getSetCompositeKeyHash();
                                            if (composerM10870constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                                composerM10870constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                                composerM10870constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                            }
                                            function3ModifierMaterializerOf4.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer3, Integer.valueOf((int) r12));
                                            composer3.startReplaceableGroup(2058660585);
                                            int i104 = r12;
                                            Modifier.Companion companion7 = companion22;
                                            TextKt.m10024Text4IGK_g(str4, boxScopeInstance.align(companion22, companion5.getCenter()), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle4, composer2, 0, 0, 65532);
                                            composer2.startReplaceableGroup(688005267);
                                            if (z24) {
                                                Modifier modifierM8172size3ABfNKs2 = SizeKt.m8172size3ABfNKs(boxScopeInstance.align(companion7, companion5.getTopEnd()), PrimitiveResources_androidKt.dimensionResource(R.dimen._16wdp, composer2, 6));
                                                composer2.startReplaceableGroup(-1487746325);
                                                final Function0<Unit> function018 = function013;
                                                boolean zChanged2 = composer2.changed(function018);
                                                Object objRememberedValue2 = composer2.rememberedValue();
                                                if (!zChanged2) {
                                                    Object obj2 = objRememberedValue2;
                                                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                        Function0<Unit> function019 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.tutorial.PanelInfoBlockKt$PanelInfoBlock$4$1$3$1$1$1$1
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            {
                                                                super(0);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function0
                                                            public /* bridge */ /* synthetic */ Unit invoke() {
                                                                invoke2();
                                                                return Unit.INSTANCE;
                                                            }

                                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                            public final void invoke2() {
                                                                function018.invoke();
                                                            }
                                                        };
                                                        composer2.updateRememberedValue(function019);
                                                        obj2 = function019;
                                                    }
                                                    composer2.endReplaceableGroup();
                                                    companion3 = companion7;
                                                    ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(modifierM8172size3ABfNKs2, null, false, null, false, false, false, false, null, 0, 0L, null, (Function0) obj2, ComposableSingletons$PanelInfoBlockKt.INSTANCE.m15066getLambda1$app_siteRelease(), composer2, 0, 3072, 4094);
                                                }
                                            } else {
                                                companion3 = companion7;
                                            }
                                            composer2.endReplaceableGroup();
                                            composer2.endReplaceableGroup();
                                            composer2.endNode();
                                            composer2.endReplaceableGroup();
                                            composer2.endReplaceableGroup();
                                            function222.invoke(composer2, Integer.valueOf(i104));
                                            composer2.startReplaceableGroup(-1228041920);
                                            if (z25) {
                                                Modifier.Companion companion8 = companion3;
                                                z26 = true;
                                                Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion8, 0.0f, 1, null);
                                                Alignment bottomCenter = companion5.getBottomCenter();
                                                composer2.startReplaceableGroup(733328855);
                                                boolean z32 = i104;
                                                i90 = 6;
                                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(bottomCenter, z32, composer2, 6);
                                                composer2.startReplaceableGroup(-1323940314);
                                                int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer2, z32 ? 1 : 0);
                                                CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                                                Function0<ComposeUiNode> constructor5 = companion6.getConstructor();
                                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default2);
                                                if (!(composer2.getApplier() instanceof Applier)) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer2.startReusableNode();
                                                if (composer2.getInserting()) {
                                                    composer2.createNode(constructor5);
                                                } else {
                                                    composer2.useNode();
                                                }
                                                Composer composerM10870constructorimpl5 = Updater.m10870constructorimpl(composer2);
                                                Updater.m10877setimpl(composerM10870constructorimpl5, measurePolicyRememberBoxMeasurePolicy3, companion6.getSetMeasurePolicy());
                                                Updater.m10877setimpl(composerM10870constructorimpl5, currentCompositionLocalMap5, companion6.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion6.getSetCompositeKeyHash();
                                                if (composerM10870constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                                                    composerM10870constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                                                    composerM10870constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                                                }
                                                function3ModifierMaterializerOf5.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, Integer.valueOf(z32 ? 1 : 0));
                                                composer2.startReplaceableGroup(2058660585);
                                                composer2.startReplaceableGroup(693286680);
                                                MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion5.getTop(), composer2, z32 ? 1 : 0);
                                                composer2.startReplaceableGroup(-1323940314);
                                                int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer2, z32 ? 1 : 0);
                                                CompositionLocalMap currentCompositionLocalMap6 = composer2.getCurrentCompositionLocalMap();
                                                Function0<ComposeUiNode> constructor6 = companion6.getConstructor();
                                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(companion8);
                                                if (!(composer2.getApplier() instanceof Applier)) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer2.startReusableNode();
                                                if (composer2.getInserting()) {
                                                    composer2.createNode(constructor6);
                                                } else {
                                                    composer2.useNode();
                                                }
                                                Composer composerM10870constructorimpl6 = Updater.m10870constructorimpl(composer2);
                                                Updater.m10877setimpl(composerM10870constructorimpl6, measurePolicyRowMeasurePolicy2, companion6.getSetMeasurePolicy());
                                                Updater.m10877setimpl(composerM10870constructorimpl6, currentCompositionLocalMap6, companion6.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = companion6.getSetCompositeKeyHash();
                                                if (composerM10870constructorimpl6.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                                                    composerM10870constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                                                    composerM10870constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                                                }
                                                function3ModifierMaterializerOf6.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, Integer.valueOf(z32 ? 1 : 0));
                                                composer2.startReplaceableGroup(2058660585);
                                                composer2.startReplaceableGroup(-1487745503);
                                                int i105 = z32 ? 1 : 0;
                                                int i106 = i82;
                                                while (i105 < i106) {
                                                    int i107 = i83;
                                                    if (i105 == i107) {
                                                        composer2.startReplaceableGroup(-416193372);
                                                        i91 = i84;
                                                        i92 = i85;
                                                        BoxKt.Box(BackgroundKt.m7770backgroundbw27NRU(SizeKt.m8172size3ABfNKs(PaddingKt.m8123padding3ABfNKs(Modifier.INSTANCE, PrimitiveResources_androidKt.dimensionResource(R.dimen._3wdp, composer2, 6)), PrimitiveResources_androidKt.dimensionResource(i91, composer2, z32 ? 1 : 0)), ColorResources_androidKt.colorResource(i92, composer2, z32 ? 1 : 0), RoundedCornerShapeKt.getCircleShape()), composer2, z32 ? 1 : 0);
                                                        composer2.endReplaceableGroup();
                                                        i93 = i86;
                                                    } else {
                                                        i91 = i84;
                                                        i92 = i85;
                                                        composer2.startReplaceableGroup(-416192649);
                                                        i93 = i86;
                                                        BoxKt.Box(BackgroundKt.m7770backgroundbw27NRU(SizeKt.m8172size3ABfNKs(PaddingKt.m8123padding3ABfNKs(Modifier.INSTANCE, PrimitiveResources_androidKt.dimensionResource(R.dimen._3wdp, composer2, 6)), PrimitiveResources_androidKt.dimensionResource(i91, composer2, z32 ? 1 : 0)), ColorResources_androidKt.colorResource(i93, composer2, z32 ? 1 : 0), RoundedCornerShapeKt.getCircleShape()), composer2, z32 ? 1 : 0);
                                                        composer2.endReplaceableGroup();
                                                    }
                                                    i105++;
                                                    i83 = i107;
                                                    i84 = i91;
                                                    i85 = i92;
                                                    i86 = i93;
                                                }
                                                composer2.endReplaceableGroup();
                                                composer2.endReplaceableGroup();
                                                composer2.endNode();
                                                composer2.endReplaceableGroup();
                                                composer2.endReplaceableGroup();
                                                composer2.endReplaceableGroup();
                                                composer2.endNode();
                                                composer2.endReplaceableGroup();
                                                composer2.endReplaceableGroup();
                                                i89 = z32;
                                            } else {
                                                i89 = i104;
                                                z26 = true;
                                                i90 = 6;
                                            }
                                            composer2.endReplaceableGroup();
                                            composer2.endReplaceableGroup();
                                            composer2.endNode();
                                            composer2.endReplaceableGroup();
                                            composer2.endReplaceableGroup();
                                            composer2.endReplaceableGroup();
                                            composer2.endNode();
                                            composer2.endReplaceableGroup();
                                            composer2.endReplaceableGroup();
                                            composer2.startReplaceableGroup(-1081100435);
                                            if (z23) {
                                                Modifier.Companion companion9 = Modifier.INSTANCE;
                                                SpacerKt.Spacer(SizeKt.m8177width3ABfNKs(companion9, PrimitiveResources_androidKt.dimensionResource(R.dimen._40wdp, composer2, i90)), composer2, i89);
                                                Modifier modifierM8172size3ABfNKs3 = SizeKt.m8172size3ABfNKs(rowScopeInstance.align(companion9, Alignment.INSTANCE.getCenterVertically()), PrimitiveResources_androidKt.dimensionResource(R.dimen._34wdp, composer2, i90));
                                                composer2.startReplaceableGroup(1027792594);
                                                final Function0<Unit> function020 = function0122;
                                                boolean zChanged3 = composer2.changed(function020);
                                                Object objRememberedValue3 = composer2.rememberedValue();
                                                if (!zChanged3) {
                                                    Object obj3 = objRememberedValue3;
                                                    if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                        Function0<Unit> function021 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.tutorial.PanelInfoBlockKt$PanelInfoBlock$4$1$4$1
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            {
                                                                super(0);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function0
                                                            public /* bridge */ /* synthetic */ Unit invoke() {
                                                                invoke2();
                                                                return Unit.INSTANCE;
                                                            }

                                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                            public final void invoke2() {
                                                                function020.invoke();
                                                            }
                                                        };
                                                        composer2.updateRememberedValue(function021);
                                                        obj3 = function021;
                                                    }
                                                    Function0 function022 = (Function0) obj3;
                                                    composer2.endReplaceableGroup();
                                                    final int i108 = i87;
                                                    final int i109 = i88;
                                                    ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(modifierM8172size3ABfNKs3, null, z22, null, true, false, false, false, null, 0, 0L, null, function022, ComposableLambdaKt.composableLambda(composer2, 1183897418, z26, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.tutorial.PanelInfoBlockKt$PanelInfoBlock$4$1$5
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(2);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                            invoke(composer4, num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                                        @Composable
                                                        public final void invoke(@Nullable Composer composer4, int i110) {
                                                            if ((i110 & 11) != 2 || !composer4.getSkipping()) {
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventStart(1183897418, i110, -1, "com.blackhub.bronline.game.ui.widget.block.tutorial.PanelInfoBlock.<anonymous>.<anonymous>.<anonymous> (PanelInfoBlock.kt:201)");
                                                                }
                                                                IconKt.m9496Iconww6aTOc(PainterResources_androidKt.painterResource(i108, composer4, 0), (String) null, (Modifier) null, ColorResources_androidKt.colorResource(i109, composer4, 0), composer4, 56, 4);
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventEnd();
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            composer4.skipToGroupEnd();
                                                        }
                                                    }), composer2, CpioConstants.C_ISBLK, 3072, 4074);
                                                }
                                            }
                                            composer2.endReplaceableGroup();
                                            composer2.endReplaceableGroup();
                                            composer2.endNode();
                                            composer2.endReplaceableGroup();
                                            composer2.endReplaceableGroup();
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }
                                };
                                float f92 = f3;
                                int i792 = i53;
                                FakeDialogKt.m15089FakeDialog3IgeMak(companion2, jColorResource2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1633972165, true, function22), composerStartRestartGroup, 390, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                f5 = f92;
                                i54 = i52;
                                z11 = z9;
                                f6 = f4;
                                z12 = z7;
                                shape2 = shapeM8392RoundedCornerShape0680j_4;
                                textStyle2 = textStyleM14811montserratBoldCustomSpIzzofJo;
                                i55 = i45;
                                i56 = i43;
                                i57 = i47;
                                i58 = i48;
                                function07 = function04;
                                function08 = function05;
                                j2 = jM11377getWhite0d7_KjU;
                                z13 = z6;
                                str2 = strEmpty;
                                z14 = z10;
                                i59 = i46;
                                i60 = i50;
                                z15 = z8;
                                i61 = i42;
                                i62 = i792;
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    i40 = i15 & 8388608;
                    if (i40 == 0) {
                    }
                    i41 = i15 & 16777216;
                    if (i41 == 0) {
                    }
                    if ((i15 & NTLMEngineImpl.FLAG_REQUEST_VERSION) == 0) {
                    }
                    if ((i16 & 1533916891) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                i29 = i15 & 16384;
                if (i29 == 0) {
                }
                i31 = i15 & 32768;
                if (i31 == 0) {
                }
                i32 = i15 & 65536;
                if (i32 == 0) {
                }
                i33 = i15 & 131072;
                if (i33 == 0) {
                }
                i34 = i15 & 262144;
                if (i34 == 0) {
                }
                i35 = i15 & 524288;
                if (i35 == 0) {
                }
                i36 = i15 & 1048576;
                if (i36 == 0) {
                }
                i38 = i15 & 2097152;
                if (i38 == 0) {
                }
                int i662 = i37;
                i39 = i15 & 4194304;
                if (i39 == 0) {
                }
                i40 = i15 & 8388608;
                if (i40 == 0) {
                }
                i41 = i15 & 16777216;
                if (i41 == 0) {
                }
                if ((i15 & NTLMEngineImpl.FLAG_REQUEST_VERSION) == 0) {
                }
                if ((i16 & 1533916891) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            i27 = i15 & 8192;
            if (i27 != 0) {
            }
            i29 = i15 & 16384;
            if (i29 == 0) {
            }
            i31 = i15 & 32768;
            if (i31 == 0) {
            }
            i32 = i15 & 65536;
            if (i32 == 0) {
            }
            i33 = i15 & 131072;
            if (i33 == 0) {
            }
            i34 = i15 & 262144;
            if (i34 == 0) {
            }
            i35 = i15 & 524288;
            if (i35 == 0) {
            }
            i36 = i15 & 1048576;
            if (i36 == 0) {
            }
            i38 = i15 & 2097152;
            if (i38 == 0) {
            }
            int i6622 = i37;
            i39 = i15 & 4194304;
            if (i39 == 0) {
            }
            i40 = i15 & 8388608;
            if (i40 == 0) {
            }
            i41 = i15 & 16777216;
            if (i41 == 0) {
            }
            if ((i15 & NTLMEngineImpl.FLAG_REQUEST_VERSION) == 0) {
            }
            if ((i16 & 1533916891) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        if ((i12 & 896) == 0) {
        }
        if ((i12 & 7168) == 0) {
        }
        i17 = i15 & 16;
        if (i17 == 0) {
        }
        if ((i12 & 458752) == 0) {
        }
        i18 = i15 & 64;
        if (i18 == 0) {
        }
        i19 = i15 & 128;
        if (i19 == 0) {
        }
        i20 = i15 & 256;
        if (i20 == 0) {
        }
        i21 = i15 & 512;
        if (i21 == 0) {
        }
        i22 = i15 & 1024;
        if (i22 == 0) {
        }
        i24 = i15 & 2048;
        if (i24 == 0) {
        }
        int i652 = i23;
        i25 = i15 & 4096;
        if (i25 == 0) {
        }
        i27 = i15 & 8192;
        if (i27 != 0) {
        }
        i29 = i15 & 16384;
        if (i29 == 0) {
        }
        i31 = i15 & 32768;
        if (i31 == 0) {
        }
        i32 = i15 & 65536;
        if (i32 == 0) {
        }
        i33 = i15 & 131072;
        if (i33 == 0) {
        }
        i34 = i15 & 262144;
        if (i34 == 0) {
        }
        i35 = i15 & 524288;
        if (i35 == 0) {
        }
        i36 = i15 & 1048576;
        if (i36 == 0) {
        }
        i38 = i15 & 2097152;
        if (i38 == 0) {
        }
        int i66222 = i37;
        i39 = i15 & 4194304;
        if (i39 == 0) {
        }
        i40 = i15 & 8388608;
        if (i40 == 0) {
        }
        i41 = i15 & 16777216;
        if (i41 == 0) {
        }
        if ((i15 & NTLMEngineImpl.FLAG_REQUEST_VERSION) == 0) {
        }
        if ((i16 & 1533916891) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: PanelInfoBlock.kt */
    @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.widget.block.tutorial.PanelInfoBlockKt$PreviewPanelInfoBlock$1 */
    /* loaded from: classes7.dex */
    public static final class C63351 extends Lambda implements Function0<Unit> {
        public static final C63351 INSTANCE = ;

        /* renamed from: invoke */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void PreviewPanelInfoBlock(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(593402565);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(593402565, i, -1, "com.blackhub.bronline.game.ui.widget.block.tutorial.PreviewPanelInfoBlock (PanelInfoBlock.kt:214)");
            }
            m15068PanelInfoBlockGF6hDo(0.0f, 0.0f, null, "Hello world", 0L, null, R.color.total_black_90, R.color.black_80, true, true, true, R.color.white_40, R.color.white_40, 4, 0, 0, 0, 0, 0, 0, C63351.INSTANCE, null, null, false, false, ComposableSingletons$PanelInfoBlockKt.INSTANCE.m15067getLambda2$app_siteRelease(), composerStartRestartGroup, 920128512, 3510, 196614, 32489527);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.tutorial.PanelInfoBlockKt.PreviewPanelInfoBlock.2
                public final /* synthetic */ int $$changed;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C63362(int i2) {
                    super(2);
                    i = i2;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i2) {
                    PanelInfoBlockKt.PreviewPanelInfoBlock(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}
