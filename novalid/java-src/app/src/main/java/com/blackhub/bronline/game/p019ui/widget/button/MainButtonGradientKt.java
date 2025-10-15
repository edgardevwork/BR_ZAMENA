package com.blackhub.bronline.game.p019ui.widget.button;

import android.os.Build;
import androidx.annotation.DrawableRes;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.OutlinedTextFieldKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.AlphaKt;
import androidx.compose.p003ui.draw.ClipKt;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ColorFilter;
import androidx.compose.p003ui.graphics.Shape;
import androidx.compose.p003ui.graphics.painter.Painter;
import androidx.compose.p003ui.layout.ContentScale;
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
import androidx.compose.p003ui.tooling.preview.Preview;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.profileinstaller.ProfileVerifier;
import com.blackhub.bronline.game.core.extension.ComposeExtensionKt;
import com.blackhub.bronline.game.p019ui.widget.block.ClickAnimateBlockKt;
import com.blackhub.bronline.game.p019ui.widget.other.RectNeonCornerKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import com.google.firebase.perf.util.Constants;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MainButtonGradient.kt */
@Metadata(m7104d1 = {"\u0000d\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a¦\u0002\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\n2\b\b\u0002\u0010\u001c\u001a\u00020\n2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001e0!2\b\b\u0002\u0010\"\u001a\u00020\u001e2\b\b\u0002\u0010#\u001a\u00020\u001e2\b\b\u0002\u0010$\u001a\u00020\u001e2\u0010\b\u0002\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010&2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00010&H\u0007ø\u0001\u0000¢\u0006\u0004\b(\u0010)\u001a\r\u0010*\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010+\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006,"}, m7105d2 = {"MainButtonGradient", "", "modifier", "Landroidx/compose/ui/Modifier;", "modifierInner", "text", "", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "textPaddingHorizontal", "Landroidx/compose/ui/unit/Dp;", "maxLines", "", "startImage", "sizeOfStartImage", "endImage", "textAlpha", "", "centerColor", "Landroidx/compose/ui/graphics/Color;", "radiusGradient", "brush", "Landroidx/compose/ui/graphics/Brush;", "shape", "Landroidx/compose/ui/graphics/Shape;", OutlinedTextFieldKt.BorderId, "Landroidx/compose/foundation/BorderStroke;", "horizontalTextPadding", "verticalTextPadding", "isShadowVisible", "", "isUpperCase", "isEnabledState", "Landroidx/compose/runtime/MutableState;", Constants.ENABLE_DISABLE, "isGlareVisible", "isAnimateShow", "onStartClick", "Lkotlin/Function0;", "onFinishClick", "MainButtonGradient-lunQu3Y", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;FILjava/lang/Integer;Landroidx/compose/ui/unit/Dp;Ljava/lang/Integer;FJFLandroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/foundation/BorderStroke;FFZZLandroidx/compose/runtime/MutableState;ZZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;IIII)V", "PreviewMainButtonGradientAndBlur", "(Landroidx/compose/runtime/Composer;I)V", "app_siteRelease"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nMainButtonGradient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainButtonGradient.kt\ncom/blackhub/bronline/game/ui/widget/button/MainButtonGradientKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,180:1\n154#2:181\n154#2:182\n154#2:183\n*S KotlinDebug\n*F\n+ 1 MainButtonGradient.kt\ncom/blackhub/bronline/game/ui/widget/button/MainButtonGradientKt\n*L\n76#1:181\n174#1:182\n175#1:183\n*E\n"})
/* loaded from: classes3.dex */
public final class MainButtonGradientKt {

    /* compiled from: MainButtonGradient.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.widget.button.MainButtonGradientKt$PreviewMainButtonGradientAndBlur$2 */
    /* loaded from: classes7.dex */
    public static final class C63912 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C63912(int i) {
            super(2);
            i = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            MainButtonGradientKt.PreviewMainButtonGradientAndBlur(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:444:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:486:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:497:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:508:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:518:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:526:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:537:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:540:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:548:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:551:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:559:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:562:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:569:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:572:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:574:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:583:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:584:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:593:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:594:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:603:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:610:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:613:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:614:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:624:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:626:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:635:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:637:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:646:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:648:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:656:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:658:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:667:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:675:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:711:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:712:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:713:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:716:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:717:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:719:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:720:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:723:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:724:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:727:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:728:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:730:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:731:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:733:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:734:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:736:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:737:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:739:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:740:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:742:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:743:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:746:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:747:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:750:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:752:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:755:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:756:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:759:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:760:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:763:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:764:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:767:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:768:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:771:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:772:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:774:0x0542  */
    /* JADX WARN: Removed duplicated region for block: B:775:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:777:0x0549  */
    /* JADX WARN: Removed duplicated region for block: B:778:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:781:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:782:0x0563  */
    /* JADX WARN: Removed duplicated region for block: B:784:0x056d  */
    /* JADX WARN: Removed duplicated region for block: B:785:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:787:0x0573  */
    /* JADX WARN: Removed duplicated region for block: B:788:0x0576  */
    /* JADX WARN: Removed duplicated region for block: B:790:0x057a  */
    /* JADX WARN: Removed duplicated region for block: B:791:0x057d  */
    /* JADX WARN: Removed duplicated region for block: B:794:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:796:0x05aa  */
    /* JADX WARN: Removed duplicated region for block: B:799:0x05d0  */
    /* JADX WARN: Removed duplicated region for block: B:801:0x05da  */
    /* JADX WARN: Removed duplicated region for block: B:804:0x05eb  */
    /* JADX WARN: Removed duplicated region for block: B:807:0x0673  */
    /* JADX WARN: Removed duplicated region for block: B:811:0x0697  */
    /* JADX WARN: Removed duplicated region for block: B:813:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: MainButtonGradient-lunQu3Y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m15077MainButtonGradientlunQu3Y(@Nullable Modifier modifier, @Nullable Modifier modifier2, @Nullable String str, @Nullable TextStyle textStyle, float f, int i, @DrawableRes @Nullable Integer num, @Nullable C2046Dp c2046Dp, @DrawableRes @Nullable Integer num2, float f2, long j, float f3, @Nullable Brush brush, @Nullable Shape shape, @Nullable BorderStroke borderStroke, float f4, float f5, boolean z, boolean z2, @Nullable MutableState<Boolean> mutableState, boolean z3, boolean z4, boolean z5, @Nullable Function0<Unit> function0, @NotNull final Function0<Unit> onFinishClick, @Nullable Composer composer, final int i2, final int i3, final int i4, final int i5) {
        int i6;
        Modifier modifier3;
        TextStyle textStyle2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        float f6;
        int i16;
        float f7;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z6;
        int i22;
        int i23;
        int i24;
        Modifier modifier4;
        Modifier modifier5;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        TextStyle textStyleM14790montserratBold12brsp67j0QOw;
        float fDimensionResource;
        int i30;
        Integer num3;
        float f8;
        long jColorResource;
        float f9;
        float fM14409dpToPx8Feqmps;
        int i31;
        int i32;
        Integer num4;
        Brush brushM11293radialGradientP_VxKs$default;
        int i33;
        Shape shapeM8392RoundedCornerShape0680j_4;
        Brush brush2;
        float f10;
        BorderStroke borderStrokeM7798BorderStrokecXLIe8U;
        float fDimensionResource2;
        BorderStroke borderStroke2;
        float f11;
        Function0<Unit> function02;
        MutableState<Boolean> mutableStateMutableStateOf$default;
        int i34;
        float f12;
        Brush brush3;
        MutableState<Boolean> mutableState2;
        int i35;
        C2046Dp c2046Dp2;
        boolean z7;
        boolean z8;
        boolean z9;
        String str2;
        float f13;
        Function0<Unit> function03;
        Shape shape2;
        boolean z10;
        int i36;
        BorderStroke borderStroke3;
        float f14;
        float f15;
        boolean z11;
        String upperCase;
        final String str3;
        final Modifier modifier6;
        final Integer num5;
        final float f16;
        float f17;
        final Integer num6;
        final Modifier modifier7;
        final float f18;
        final C2046Dp c2046Dp3;
        final TextStyle textStyle3;
        final int i37;
        float f19;
        Shape shape3;
        BorderStroke borderStroke4;
        Brush brush4;
        long j2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i38;
        Intrinsics.checkNotNullParameter(onFinishClick, "onFinishClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-598993479);
        int i39 = i5 & 1;
        if (i39 != 0) {
            i6 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i6 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i6 = i2;
        }
        if ((i2 & 112) == 0) {
            if ((i5 & 2) == 0) {
                modifier3 = modifier2;
                int i40 = composerStartRestartGroup.changed(modifier3) ? 32 : 16;
                i6 |= i40;
            } else {
                modifier3 = modifier2;
            }
            i6 |= i40;
        } else {
            modifier3 = modifier2;
        }
        int i41 = i5 & 4;
        if (i41 != 0) {
            i6 |= 384;
        } else {
            if ((i2 & 896) == 0) {
                i6 |= composerStartRestartGroup.changed(str) ? 256 : 128;
            }
            if ((i2 & 7168) != 0) {
                if ((i5 & 8) == 0) {
                    textStyle2 = textStyle;
                    if (composerStartRestartGroup.changed(textStyle2)) {
                        i38 = 2048;
                    }
                    i6 |= i38;
                } else {
                    textStyle2 = textStyle;
                }
                i38 = 1024;
                i6 |= i38;
            } else {
                textStyle2 = textStyle;
            }
            i7 = i5 & 32;
            if (i7 == 0) {
                i6 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
            } else if ((i2 & 458752) == 0) {
                i6 |= composerStartRestartGroup.changed(i) ? 131072 : 65536;
            }
            i8 = i5 & 64;
            if (i8 == 0) {
                i6 |= 1572864;
            } else if ((i2 & 3670016) == 0) {
                i6 |= composerStartRestartGroup.changed(num) ? 1048576 : 524288;
            }
            i9 = i5 & 128;
            if (i9 == 0) {
                i6 |= 12582912;
            } else {
                if ((i2 & 29360128) == 0) {
                    i10 = i9;
                    i6 |= composerStartRestartGroup.changed(c2046Dp) ? 8388608 : 4194304;
                }
                i11 = i5 & 256;
                if (i11 != 0) {
                    i6 |= 100663296;
                } else {
                    if ((i2 & 234881024) == 0) {
                        i12 = i11;
                        i6 |= composerStartRestartGroup.changed(num2) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                    }
                    i13 = i5 & 512;
                    if (i13 == 0) {
                        i6 |= 805306368;
                    } else {
                        if ((i2 & 1879048192) == 0) {
                            i14 = i13;
                            i6 |= composerStartRestartGroup.changed(f2) ? 536870912 : 268435456;
                        }
                        if ((i3 & 14) == 0) {
                            i15 = i3 | (((i5 & 1024) == 0 && composerStartRestartGroup.changed(j)) ? 4 : 2);
                        } else {
                            i15 = i3;
                        }
                        if ((i3 & 112) == 0) {
                            if ((i5 & 2048) == 0) {
                                f6 = f3;
                                int i42 = composerStartRestartGroup.changed(f6) ? 32 : 16;
                                i15 |= i42;
                            } else {
                                f6 = f3;
                            }
                            i15 |= i42;
                        } else {
                            f6 = f3;
                        }
                        if ((i3 & 896) == 0) {
                            i15 |= ((i5 & 4096) == 0 && composerStartRestartGroup.changed(brush)) ? 256 : 128;
                        }
                        if ((i3 & 7168) == 0) {
                            i15 |= ((i5 & 8192) == 0 && composerStartRestartGroup.changed(shape)) ? 2048 : 1024;
                        }
                        if ((i3 & 57344) == 0) {
                            i15 |= ((i5 & 16384) == 0 && composerStartRestartGroup.changed(borderStroke)) ? 16384 : 8192;
                        }
                        if ((i3 & 458752) == 0) {
                            i15 |= ((i5 & 32768) == 0 && composerStartRestartGroup.changed(f4)) ? 131072 : 65536;
                        }
                        i16 = i5 & 65536;
                        if (i16 != 0) {
                            i15 |= 1572864;
                        } else {
                            if ((3670016 & i3) == 0) {
                                f7 = f5;
                                i15 |= composerStartRestartGroup.changed(f7) ? 1048576 : 524288;
                            }
                            i17 = i5 & 131072;
                            if (i17 == 0) {
                                i15 |= 12582912;
                            } else if ((i3 & 29360128) == 0) {
                                i15 |= composerStartRestartGroup.changed(z) ? 8388608 : 4194304;
                            }
                            i18 = i5 & 262144;
                            if (i18 == 0) {
                                i15 |= 100663296;
                            } else if ((i3 & 234881024) == 0) {
                                i15 |= composerStartRestartGroup.changed(z2) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                            }
                            if ((i3 & 1879048192) == 0) {
                                i15 |= ((i5 & 524288) == 0 && composerStartRestartGroup.changed(mutableState)) ? 536870912 : 268435456;
                            }
                            i19 = i5 & 1048576;
                            if (i19 == 0) {
                                i20 = i4 | 6;
                            } else if ((i4 & 14) == 0) {
                                i20 = i4 | (composerStartRestartGroup.changed(z3) ? 4 : 2);
                            } else {
                                i20 = i4;
                            }
                            i21 = i5 & 2097152;
                            if (i21 == 0) {
                                i20 |= 48;
                                z6 = z4;
                            } else {
                                z6 = z4;
                                if ((i4 & 112) == 0) {
                                    i20 |= composerStartRestartGroup.changed(z6) ? 32 : 16;
                                }
                            }
                            int i43 = i20;
                            i22 = i5 & 4194304;
                            if (i22 == 0) {
                                i43 |= 384;
                            } else {
                                if ((i4 & 896) == 0) {
                                    i43 |= composerStartRestartGroup.changed(z5) ? 256 : 128;
                                }
                                i23 = i5 & 8388608;
                                if (i23 == 0) {
                                    if ((i4 & 7168) == 0) {
                                        i43 |= composerStartRestartGroup.changedInstance(function0) ? 2048 : 1024;
                                    }
                                    if ((i5 & 16777216) == 0) {
                                        i43 |= CpioConstants.C_ISBLK;
                                    } else if ((i4 & 57344) == 0) {
                                        i43 |= composerStartRestartGroup.changedInstance(onFinishClick) ? 16384 : 8192;
                                    }
                                    i24 = i43;
                                    if ((1533875931 & i6) == 306775186 || (i15 & 1533916891) != 306783378 || (i24 & 46811) != 9362 || !composerStartRestartGroup.getSkipping()) {
                                        composerStartRestartGroup.startDefaults();
                                        if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                            modifier4 = i39 == 0 ? Modifier.INSTANCE : modifier;
                                            if ((i5 & 2) == 0) {
                                                i25 = i6 & (-113);
                                                modifier5 = modifier4;
                                            } else {
                                                modifier5 = modifier3;
                                                i25 = i6;
                                            }
                                            String str4 = i41 == 0 ? null : str;
                                            if ((i5 & 8) == 0) {
                                                i26 = i10;
                                                i27 = i12;
                                                i28 = i14;
                                                i29 = 6;
                                                textStyleM14790montserratBold12brsp67j0QOw = TypographyStyle.INSTANCE.m14790montserratBold12brsp67j0QOw(0L, TextAlign.INSTANCE.m13558getCentere0LSkKk(), 0L, 0.0f, composerStartRestartGroup, CpioConstants.C_ISBLK, 13);
                                                i25 &= -7169;
                                            } else {
                                                i26 = i10;
                                                i27 = i12;
                                                i28 = i14;
                                                i29 = 6;
                                                textStyleM14790montserratBold12brsp67j0QOw = textStyle2;
                                            }
                                            if ((i5 & 16) == 0) {
                                                fDimensionResource = PrimitiveResources_androidKt.dimensionResource(R.dimen._4sdp, composerStartRestartGroup, i29);
                                                i30 = i25 & (-57345);
                                            } else {
                                                fDimensionResource = f;
                                                i30 = i25;
                                            }
                                            int i44 = i7 == 0 ? 1 : i;
                                            Integer num7 = i8 == 0 ? null : num;
                                            C2046Dp c2046Dp4 = i26 == 0 ? null : c2046Dp;
                                            num3 = i27 == 0 ? null : num2;
                                            f8 = i28 == 0 ? 1.0f : f2;
                                            if ((i5 & 1024) == 0) {
                                                jColorResource = ColorResources_androidKt.colorResource(R.color.red, composerStartRestartGroup, i29);
                                                i15 &= -15;
                                            } else {
                                                jColorResource = j;
                                            }
                                            TextStyle textStyle4 = textStyleM14790montserratBold12brsp67j0QOw;
                                            if ((i5 & 2048) == 0) {
                                                f9 = fDimensionResource;
                                                fM14409dpToPx8Feqmps = ComposeExtensionKt.m14409dpToPx8Feqmps(PrimitiveResources_androidKt.dimensionResource(R.dimen._90sdp, composerStartRestartGroup, 6), composerStartRestartGroup, 0);
                                                i15 &= -113;
                                            } else {
                                                f9 = fDimensionResource;
                                                fM14409dpToPx8Feqmps = f3;
                                            }
                                            int i45 = i15;
                                            if ((i5 & 4096) == 0) {
                                                i31 = i44;
                                                i32 = i30;
                                                num4 = num7;
                                                brushM11293radialGradientP_VxKs$default = Brush.Companion.m11293radialGradientP_VxKs$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(jColorResource), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.black_60, composerStartRestartGroup, 6))}), 0L, fM14409dpToPx8Feqmps, 0, 10, (Object) null);
                                                i45 &= -897;
                                            } else {
                                                i31 = i44;
                                                i32 = i30;
                                                num4 = num7;
                                                brushM11293radialGradientP_VxKs$default = brush;
                                            }
                                            if ((i5 & 8192) == 0) {
                                                i33 = 6;
                                                shapeM8392RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._5sdp, composerStartRestartGroup, 6));
                                                i45 &= -7169;
                                            } else {
                                                i33 = 6;
                                                shapeM8392RoundedCornerShape0680j_4 = shape;
                                            }
                                            if ((i5 & 16384) == 0) {
                                                brush2 = brushM11293radialGradientP_VxKs$default;
                                                f10 = fM14409dpToPx8Feqmps;
                                                borderStrokeM7798BorderStrokecXLIe8U = BorderStrokeKt.m7798BorderStrokecXLIe8U(PrimitiveResources_androidKt.dimensionResource(R.dimen._05sdp, composerStartRestartGroup, i33), Color.INSTANCE.m11377getWhite0d7_KjU());
                                                i45 &= -57345;
                                            } else {
                                                brush2 = brushM11293radialGradientP_VxKs$default;
                                                f10 = fM14409dpToPx8Feqmps;
                                                borderStrokeM7798BorderStrokecXLIe8U = borderStroke;
                                            }
                                            if ((32768 & i5) == 0) {
                                                fDimensionResource2 = PrimitiveResources_androidKt.dimensionResource(R.dimen._4sdp, composerStartRestartGroup, i33);
                                                i45 &= -458753;
                                            } else {
                                                fDimensionResource2 = f4;
                                            }
                                            float fM13666constructorimpl = i16 == 0 ? C2046Dp.m13666constructorimpl(0) : f5;
                                            boolean z12 = i17 == 0 ? false : z;
                                            boolean z13 = i18 == 0 ? true : z2;
                                            if ((i5 & 524288) == 0) {
                                                borderStroke2 = borderStrokeM7798BorderStrokecXLIe8U;
                                                f11 = fDimensionResource2;
                                                function02 = null;
                                                mutableStateMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                                                i34 = (-1879048193) & i45;
                                            } else {
                                                borderStroke2 = borderStrokeM7798BorderStrokecXLIe8U;
                                                f11 = fDimensionResource2;
                                                function02 = null;
                                                mutableStateMutableStateOf$default = mutableState;
                                                i34 = i45;
                                            }
                                            boolean z14 = i19 == 0 ? true : z3;
                                            boolean z15 = i21 == 0 ? false : z4;
                                            boolean z16 = i22 == 0 ? false : z5;
                                            f12 = f9;
                                            if (i23 == 0) {
                                                brush3 = brush2;
                                                mutableState2 = mutableStateMutableStateOf$default;
                                                z7 = z14;
                                                z8 = z16;
                                                z9 = z13;
                                                str2 = str4;
                                                f13 = f10;
                                                function03 = function02;
                                                shape2 = shapeM8392RoundedCornerShape0680j_4;
                                                i35 = i34;
                                                c2046Dp2 = c2046Dp4;
                                                z10 = z12;
                                                i36 = i32;
                                                textStyle2 = textStyle4;
                                            } else {
                                                brush3 = brush2;
                                                mutableState2 = mutableStateMutableStateOf$default;
                                                i35 = i34;
                                                c2046Dp2 = c2046Dp4;
                                                z7 = z14;
                                                z8 = z16;
                                                z9 = z13;
                                                str2 = str4;
                                                textStyle2 = textStyle4;
                                                f13 = f10;
                                                function03 = function0;
                                                shape2 = shapeM8392RoundedCornerShape0680j_4;
                                                z10 = z12;
                                                i36 = i32;
                                            }
                                            borderStroke3 = borderStroke2;
                                            f14 = f11;
                                            boolean z17 = z15;
                                            f15 = fM13666constructorimpl;
                                            modifier3 = modifier5;
                                            z11 = z17;
                                        } else {
                                            composerStartRestartGroup.skipToGroupEnd();
                                            if ((i5 & 2) != 0) {
                                                i6 &= -113;
                                            }
                                            if ((i5 & 8) != 0) {
                                                i6 &= -7169;
                                            }
                                            if ((i5 & 16) != 0) {
                                                i6 &= -57345;
                                            }
                                            if ((i5 & 1024) != 0) {
                                                i15 &= -15;
                                            }
                                            if ((i5 & 2048) != 0) {
                                                i15 &= -113;
                                            }
                                            int i46 = i15;
                                            if ((i5 & 4096) != 0) {
                                                i46 &= -897;
                                            }
                                            if ((i5 & 8192) != 0) {
                                                i46 &= -7169;
                                            }
                                            if ((i5 & 16384) != 0) {
                                                i46 &= -57345;
                                            }
                                            if ((32768 & i5) != 0) {
                                                i46 &= -458753;
                                            }
                                            if ((i5 & 524288) != 0) {
                                                i46 &= -1879048193;
                                            }
                                            modifier4 = modifier;
                                            i31 = i;
                                            num4 = num;
                                            f8 = f2;
                                            brush3 = brush;
                                            shape2 = shape;
                                            borderStroke3 = borderStroke;
                                            f14 = f4;
                                            z10 = z;
                                            z9 = z2;
                                            mutableState2 = mutableState;
                                            z7 = z3;
                                            z11 = z4;
                                            z8 = z5;
                                            function03 = function0;
                                            i35 = i46;
                                            i36 = i6;
                                            f13 = f6;
                                            f15 = f7;
                                            str2 = str;
                                            f12 = f;
                                            c2046Dp2 = c2046Dp;
                                            num3 = num2;
                                            jColorResource = j;
                                        }
                                        composerStartRestartGroup.endDefaults();
                                        long j3 = jColorResource;
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-598993479, i36, i35, "com.blackhub.bronline.game.ui.widget.button.MainButtonGradient (MainButtonGradient.kt:84)");
                                        }
                                        if (z9) {
                                            upperCase = str2;
                                        } else if (str2 != null) {
                                            upperCase = str2.toUpperCase(Locale.ROOT);
                                            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                                        } else {
                                            upperCase = null;
                                        }
                                        final boolean z18 = z10;
                                        final Modifier modifier8 = modifier3;
                                        final Shape shape4 = shape2;
                                        final BorderStroke borderStroke5 = borderStroke3;
                                        final Brush brush5 = brush3;
                                        final Modifier modifier9 = modifier4;
                                        final Integer num8 = num4;
                                        final String str5 = upperCase;
                                        final Integer num9 = num3;
                                        final C2046Dp c2046Dp5 = c2046Dp2;
                                        final float f20 = f14;
                                        final float f21 = f15;
                                        final float f22 = f8;
                                        final int i47 = i31;
                                        final TextStyle textStyle5 = textStyle2;
                                        Function2<Composer, Integer, Unit> function2 = new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.button.MainButtonGradientKt$MainButtonGradient$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num10) {
                                                invoke(composer2, num10.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            /* JADX WARN: Multi-variable type inference failed */
                                            /* JADX WARN: Type inference failed for: r0v16, types: [androidx.compose.ui.Modifier] */
                                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                            @Composable
                                            public final void invoke(@Nullable Composer composer2, int i48) {
                                                Modifier.Companion companion;
                                                TextStyle textStyle6;
                                                int i49;
                                                float f23;
                                                ?? M8172size3ABfNKs;
                                                Integer num10;
                                                if ((i48 & 11) != 2 || !composer2.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(787435144, i48, -1, "com.blackhub.bronline.game.ui.widget.button.MainButtonGradient.<anonymous> (MainButtonGradient.kt:99)");
                                                    }
                                                    Boolean boolValueOf = Boolean.valueOf(z18);
                                                    final Modifier modifier10 = modifier9;
                                                    final Shape shape5 = shape4;
                                                    ComposeExtensionKt.IfTrue(boolValueOf, ComposableLambdaKt.composableLambda(composer2, -775376032, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.button.MainButtonGradientKt$MainButtonGradient$1.1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(2);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num11) {
                                                            invoke(composer3, num11.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                                        @Composable
                                                        public final void invoke(@Nullable Composer composer3, int i50) {
                                                            if ((i50 & 11) != 2 || !composer3.getSkipping()) {
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventStart(-775376032, i50, -1, "com.blackhub.bronline.game.ui.widget.button.MainButtonGradient.<anonymous>.<anonymous> (MainButtonGradient.kt:101)");
                                                                }
                                                                if (Build.VERSION.SDK_INT >= 25) {
                                                                    composer3.startReplaceableGroup(-1252076163);
                                                                    RectNeonCornerKt.m15097RectNeonCornerFuCtLKA(modifier10, Color.INSTANCE.m11375getTransparent0d7_KjU(), 0.0f, 0L, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, composer3, 48, 1020);
                                                                    composer3.endReplaceableGroup();
                                                                } else {
                                                                    composer3.startReplaceableGroup(-1252075932);
                                                                    BoxKt.Box(BorderKt.border(modifier10, BorderStrokeKt.m7798BorderStrokecXLIe8U(PrimitiveResources_androidKt.dimensionResource(R.dimen._1sdp, composer3, 6), Color.INSTANCE.m11374getRed0d7_KjU()), shape5), composer3, 0);
                                                                    composer3.endReplaceableGroup();
                                                                }
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventEnd();
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            composer3.skipToGroupEnd();
                                                        }
                                                    }), composer2, 48);
                                                    Modifier modifierBackground$default = BackgroundKt.background$default(PaddingKt.m8123padding3ABfNKs(BorderKt.border(BackgroundKt.m7770backgroundbw27NRU(ClipKt.clip(modifier8, shape4), ColorResources_androidKt.colorResource(R.color.black_80, composer2, 6), shape4), borderStroke5, shape4), C2046Dp.m13666constructorimpl(PrimitiveResources_androidKt.dimensionResource(R.dimen._1sdp, composer2, 6) / 4)), brush5, shape4, 0.0f, 4, null);
                                                    Alignment.Companion companion2 = Alignment.INSTANCE;
                                                    Alignment center = companion2.getCenter();
                                                    Integer num11 = num8;
                                                    String str6 = str5;
                                                    Integer num12 = num9;
                                                    C2046Dp c2046Dp6 = c2046Dp5;
                                                    float f24 = f20;
                                                    float f25 = f21;
                                                    float f26 = f22;
                                                    int i50 = i47;
                                                    TextStyle textStyle7 = textStyle5;
                                                    composer2.startReplaceableGroup(733328855);
                                                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
                                                    composer2.startReplaceableGroup(-1323940314);
                                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierBackground$default);
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
                                                    Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                                                    Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                                    if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                        composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                        composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                    }
                                                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                                                    composer2.startReplaceableGroup(2058660585);
                                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                    Arrangement.HorizontalOrVertical center2 = Arrangement.INSTANCE.getCenter();
                                                    Alignment.Vertical centerVertically = companion2.getCenterVertically();
                                                    composer2.startReplaceableGroup(693286680);
                                                    Modifier.Companion companion4 = Modifier.INSTANCE;
                                                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center2, centerVertically, composer2, 54);
                                                    composer2.startReplaceableGroup(-1323940314);
                                                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                                                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion4);
                                                    if (!(composer2.getApplier() instanceof Applier)) {
                                                        ComposablesKt.invalidApplier();
                                                    }
                                                    composer2.startReusableNode();
                                                    if (composer2.getInserting()) {
                                                        composer2.createNode(constructor2);
                                                    } else {
                                                        composer2.useNode();
                                                    }
                                                    Composer composerM10870constructorimpl2 = Updater.m10870constructorimpl(composer2);
                                                    Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                                                    Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                                                    if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                        composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                        composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                                    }
                                                    function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                                                    composer2.startReplaceableGroup(2058660585);
                                                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                                    composer2.startReplaceableGroup(-1826885117);
                                                    if (num11 == null) {
                                                        companion = companion4;
                                                        i49 = i50;
                                                        f23 = f26;
                                                        textStyle6 = textStyle7;
                                                    } else {
                                                        Painter painterPainterResource = PainterResources_androidKt.painterResource(num11.intValue(), composer2, 0);
                                                        Modifier.Companion companion5 = (c2046Dp6 == null || (M8172size3ABfNKs = SizeKt.m8172size3ABfNKs(companion4, c2046Dp6.m13680unboximpl())) == 0) ? companion4 : M8172size3ABfNKs;
                                                        companion = companion4;
                                                        textStyle6 = textStyle7;
                                                        i49 = i50;
                                                        f23 = f26;
                                                        ImageKt.Image(painterPainterResource, (String) null, companion5, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 120);
                                                    }
                                                    composer2.endReplaceableGroup();
                                                    composer2.startReplaceableGroup(-1826884762);
                                                    if (str6 == null) {
                                                        num10 = num12;
                                                    } else {
                                                        Modifier modifierAlpha = AlphaKt.alpha(PaddingKt.m8124paddingVpY3zN4(companion, f24, f25), f23);
                                                        num10 = num12;
                                                        TextKt.m10024Text4IGK_g(str6, modifierAlpha, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, i49, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle6, composer2, 0, 0, 57340);
                                                    }
                                                    composer2.endReplaceableGroup();
                                                    composer2.startReplaceableGroup(-1252074037);
                                                    if (num10 != null) {
                                                        ImageKt.Image(PainterResources_androidKt.painterResource(num10.intValue(), composer2, 0), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 124);
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
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer2.skipToGroupEnd();
                                            }
                                        };
                                        String str6 = str2;
                                        int i48 = (i36 & 126) | ((i24 << 6) & 896) | ((i35 >> 18) & 7168);
                                        int i49 = i24 << 15;
                                        int i50 = i48 | (3670016 & i49) | (i49 & 29360128) | ((i35 << 15) & 234881024);
                                        int i51 = i24 >> 6;
                                        ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(modifier4, modifier3, z7, mutableState2, false, false, z11, z8, shape2, 0, 0L, function03, onFinishClick, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 787435144, true, function2), composerStartRestartGroup, i50, (i51 & 896) | (i51 & 112) | 3072, 1584);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        str3 = str6;
                                        modifier6 = modifier3;
                                        num5 = num3;
                                        f16 = f8;
                                        f17 = f13;
                                        num6 = num4;
                                        modifier7 = modifier4;
                                        f18 = f12;
                                        c2046Dp3 = c2046Dp2;
                                        textStyle3 = textStyle2;
                                        i37 = i31;
                                        f19 = f14;
                                        shape3 = shape2;
                                        borderStroke4 = borderStroke3;
                                        brush4 = brush3;
                                        j2 = j3;
                                    } else {
                                        composerStartRestartGroup.skipToGroupEnd();
                                        modifier7 = modifier;
                                        str3 = str;
                                        c2046Dp3 = c2046Dp;
                                        j2 = j;
                                        brush4 = brush;
                                        shape3 = shape;
                                        borderStroke4 = borderStroke;
                                        f19 = f4;
                                        z10 = z;
                                        z9 = z2;
                                        mutableState2 = mutableState;
                                        z7 = z3;
                                        z8 = z5;
                                        function03 = function0;
                                        modifier6 = modifier3;
                                        textStyle3 = textStyle2;
                                        f17 = f6;
                                        f15 = f7;
                                        z11 = z6;
                                        f18 = f;
                                        i37 = i;
                                        num6 = num;
                                        num5 = num2;
                                        f16 = f2;
                                    }
                                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                                    if (scopeUpdateScopeEndRestartGroup == null) {
                                        final long j4 = j2;
                                        final float f23 = f17;
                                        final Brush brush6 = brush4;
                                        final Shape shape5 = shape3;
                                        final BorderStroke borderStroke6 = borderStroke4;
                                        final float f24 = f19;
                                        final float f25 = f15;
                                        final boolean z19 = z10;
                                        final boolean z20 = z9;
                                        final MutableState<Boolean> mutableState3 = mutableState2;
                                        final boolean z21 = z7;
                                        final boolean z22 = z11;
                                        final boolean z23 = z8;
                                        final Function0<Unit> function04 = function03;
                                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.button.MainButtonGradientKt$MainButtonGradient$2
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num10) {
                                                invoke(composer2, num10.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(@Nullable Composer composer2, int i52) {
                                                MainButtonGradientKt.m15077MainButtonGradientlunQu3Y(modifier7, modifier6, str3, textStyle3, f18, i37, num6, c2046Dp3, num5, f16, j4, f23, brush6, shape5, borderStroke6, f24, f25, z19, z20, mutableState3, z21, z22, z23, function04, onFinishClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                i43 |= 3072;
                                if ((i5 & 16777216) == 0) {
                                }
                                i24 = i43;
                                if ((1533875931 & i6) == 306775186) {
                                    composerStartRestartGroup.startDefaults();
                                    if ((i2 & 1) != 0) {
                                        if (i39 == 0) {
                                        }
                                        if ((i5 & 2) == 0) {
                                        }
                                        if (i41 == 0) {
                                        }
                                        if ((i5 & 8) == 0) {
                                        }
                                        if ((i5 & 16) == 0) {
                                        }
                                        if (i7 == 0) {
                                        }
                                        if (i8 == 0) {
                                        }
                                        if (i26 == 0) {
                                        }
                                        if (i27 == 0) {
                                        }
                                        if (i28 == 0) {
                                        }
                                        if ((i5 & 1024) == 0) {
                                        }
                                        TextStyle textStyle42 = textStyleM14790montserratBold12brsp67j0QOw;
                                        if ((i5 & 2048) == 0) {
                                        }
                                        int i452 = i15;
                                        if ((i5 & 4096) == 0) {
                                        }
                                        if ((i5 & 8192) == 0) {
                                        }
                                        if ((i5 & 16384) == 0) {
                                        }
                                        if ((32768 & i5) == 0) {
                                        }
                                        if (i16 == 0) {
                                        }
                                        if (i17 == 0) {
                                        }
                                        if (i18 == 0) {
                                        }
                                        if ((i5 & 524288) == 0) {
                                        }
                                        if (i19 == 0) {
                                        }
                                        if (i21 == 0) {
                                        }
                                        if (i22 == 0) {
                                        }
                                        f12 = f9;
                                        if (i23 == 0) {
                                        }
                                        borderStroke3 = borderStroke2;
                                        f14 = f11;
                                        boolean z172 = z15;
                                        f15 = fM13666constructorimpl;
                                        modifier3 = modifier5;
                                        z11 = z172;
                                        composerStartRestartGroup.endDefaults();
                                        long j32 = jColorResource;
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        if (z9) {
                                        }
                                        final boolean z182 = z10;
                                        final Modifier modifier82 = modifier3;
                                        final Shape shape42 = shape2;
                                        final BorderStroke borderStroke52 = borderStroke3;
                                        final Brush brush52 = brush3;
                                        final Modifier modifier92 = modifier4;
                                        final Integer num82 = num4;
                                        final String str52 = upperCase;
                                        final Integer num92 = num3;
                                        final C2046Dp c2046Dp52 = c2046Dp2;
                                        final float f202 = f14;
                                        final float f212 = f15;
                                        final float f222 = f8;
                                        final int i472 = i31;
                                        final TextStyle textStyle52 = textStyle2;
                                        Function2<Composer, Integer, Unit> function22 = new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.button.MainButtonGradientKt$MainButtonGradient$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num10) {
                                                invoke(composer2, num10.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            /* JADX WARN: Multi-variable type inference failed */
                                            /* JADX WARN: Type inference failed for: r0v16, types: [androidx.compose.ui.Modifier] */
                                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                            @Composable
                                            public final void invoke(@Nullable Composer composer2, int i482) {
                                                Modifier.Companion companion;
                                                TextStyle textStyle6;
                                                int i492;
                                                float f232;
                                                ?? M8172size3ABfNKs;
                                                Integer num10;
                                                if ((i482 & 11) != 2 || !composer2.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(787435144, i482, -1, "com.blackhub.bronline.game.ui.widget.button.MainButtonGradient.<anonymous> (MainButtonGradient.kt:99)");
                                                    }
                                                    Boolean boolValueOf = Boolean.valueOf(z182);
                                                    final Modifier modifier10 = modifier92;
                                                    final Shape shape52 = shape42;
                                                    ComposeExtensionKt.IfTrue(boolValueOf, ComposableLambdaKt.composableLambda(composer2, -775376032, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.button.MainButtonGradientKt$MainButtonGradient$1.1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(2);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num11) {
                                                            invoke(composer3, num11.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                                        @Composable
                                                        public final void invoke(@Nullable Composer composer3, int i502) {
                                                            if ((i502 & 11) != 2 || !composer3.getSkipping()) {
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventStart(-775376032, i502, -1, "com.blackhub.bronline.game.ui.widget.button.MainButtonGradient.<anonymous>.<anonymous> (MainButtonGradient.kt:101)");
                                                                }
                                                                if (Build.VERSION.SDK_INT >= 25) {
                                                                    composer3.startReplaceableGroup(-1252076163);
                                                                    RectNeonCornerKt.m15097RectNeonCornerFuCtLKA(modifier10, Color.INSTANCE.m11375getTransparent0d7_KjU(), 0.0f, 0L, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, composer3, 48, 1020);
                                                                    composer3.endReplaceableGroup();
                                                                } else {
                                                                    composer3.startReplaceableGroup(-1252075932);
                                                                    BoxKt.Box(BorderKt.border(modifier10, BorderStrokeKt.m7798BorderStrokecXLIe8U(PrimitiveResources_androidKt.dimensionResource(R.dimen._1sdp, composer3, 6), Color.INSTANCE.m11374getRed0d7_KjU()), shape52), composer3, 0);
                                                                    composer3.endReplaceableGroup();
                                                                }
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventEnd();
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            composer3.skipToGroupEnd();
                                                        }
                                                    }), composer2, 48);
                                                    Modifier modifierBackground$default = BackgroundKt.background$default(PaddingKt.m8123padding3ABfNKs(BorderKt.border(BackgroundKt.m7770backgroundbw27NRU(ClipKt.clip(modifier82, shape42), ColorResources_androidKt.colorResource(R.color.black_80, composer2, 6), shape42), borderStroke52, shape42), C2046Dp.m13666constructorimpl(PrimitiveResources_androidKt.dimensionResource(R.dimen._1sdp, composer2, 6) / 4)), brush52, shape42, 0.0f, 4, null);
                                                    Alignment.Companion companion2 = Alignment.INSTANCE;
                                                    Alignment center = companion2.getCenter();
                                                    Integer num11 = num82;
                                                    String str62 = str52;
                                                    Integer num12 = num92;
                                                    C2046Dp c2046Dp6 = c2046Dp52;
                                                    float f242 = f202;
                                                    float f252 = f212;
                                                    float f26 = f222;
                                                    int i502 = i472;
                                                    TextStyle textStyle7 = textStyle52;
                                                    composer2.startReplaceableGroup(733328855);
                                                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
                                                    composer2.startReplaceableGroup(-1323940314);
                                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierBackground$default);
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
                                                    Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                                                    Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                                    if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                        composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                        composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                    }
                                                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                                                    composer2.startReplaceableGroup(2058660585);
                                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                    Arrangement.HorizontalOrVertical center2 = Arrangement.INSTANCE.getCenter();
                                                    Alignment.Vertical centerVertically = companion2.getCenterVertically();
                                                    composer2.startReplaceableGroup(693286680);
                                                    Modifier.Companion companion4 = Modifier.INSTANCE;
                                                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center2, centerVertically, composer2, 54);
                                                    composer2.startReplaceableGroup(-1323940314);
                                                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                                                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion4);
                                                    if (!(composer2.getApplier() instanceof Applier)) {
                                                        ComposablesKt.invalidApplier();
                                                    }
                                                    composer2.startReusableNode();
                                                    if (composer2.getInserting()) {
                                                        composer2.createNode(constructor2);
                                                    } else {
                                                        composer2.useNode();
                                                    }
                                                    Composer composerM10870constructorimpl2 = Updater.m10870constructorimpl(composer2);
                                                    Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                                                    Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                                                    if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                        composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                        composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                                    }
                                                    function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                                                    composer2.startReplaceableGroup(2058660585);
                                                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                                    composer2.startReplaceableGroup(-1826885117);
                                                    if (num11 == null) {
                                                        companion = companion4;
                                                        i492 = i502;
                                                        f232 = f26;
                                                        textStyle6 = textStyle7;
                                                    } else {
                                                        Painter painterPainterResource = PainterResources_androidKt.painterResource(num11.intValue(), composer2, 0);
                                                        Modifier.Companion companion5 = (c2046Dp6 == null || (M8172size3ABfNKs = SizeKt.m8172size3ABfNKs(companion4, c2046Dp6.m13680unboximpl())) == 0) ? companion4 : M8172size3ABfNKs;
                                                        companion = companion4;
                                                        textStyle6 = textStyle7;
                                                        i492 = i502;
                                                        f232 = f26;
                                                        ImageKt.Image(painterPainterResource, (String) null, companion5, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 120);
                                                    }
                                                    composer2.endReplaceableGroup();
                                                    composer2.startReplaceableGroup(-1826884762);
                                                    if (str62 == null) {
                                                        num10 = num12;
                                                    } else {
                                                        Modifier modifierAlpha = AlphaKt.alpha(PaddingKt.m8124paddingVpY3zN4(companion, f242, f252), f232);
                                                        num10 = num12;
                                                        TextKt.m10024Text4IGK_g(str62, modifierAlpha, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, i492, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle6, composer2, 0, 0, 57340);
                                                    }
                                                    composer2.endReplaceableGroup();
                                                    composer2.startReplaceableGroup(-1252074037);
                                                    if (num10 != null) {
                                                        ImageKt.Image(PainterResources_androidKt.painterResource(num10.intValue(), composer2, 0), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 124);
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
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer2.skipToGroupEnd();
                                            }
                                        };
                                        String str62 = str2;
                                        int i482 = (i36 & 126) | ((i24 << 6) & 896) | ((i35 >> 18) & 7168);
                                        int i492 = i24 << 15;
                                        int i502 = i482 | (3670016 & i492) | (i492 & 29360128) | ((i35 << 15) & 234881024);
                                        int i512 = i24 >> 6;
                                        ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(modifier4, modifier3, z7, mutableState2, false, false, z11, z8, shape2, 0, 0L, function03, onFinishClick, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 787435144, true, function22), composerStartRestartGroup, i502, (i512 & 896) | (i512 & 112) | 3072, 1584);
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        str3 = str62;
                                        modifier6 = modifier3;
                                        num5 = num3;
                                        f16 = f8;
                                        f17 = f13;
                                        num6 = num4;
                                        modifier7 = modifier4;
                                        f18 = f12;
                                        c2046Dp3 = c2046Dp2;
                                        textStyle3 = textStyle2;
                                        i37 = i31;
                                        f19 = f14;
                                        shape3 = shape2;
                                        borderStroke4 = borderStroke3;
                                        brush4 = brush3;
                                        j2 = j32;
                                    }
                                }
                                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup == null) {
                                }
                            }
                            i23 = i5 & 8388608;
                            if (i23 == 0) {
                            }
                            if ((i5 & 16777216) == 0) {
                            }
                            i24 = i43;
                            if ((1533875931 & i6) == 306775186) {
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                            }
                        }
                        f7 = f5;
                        i17 = i5 & 131072;
                        if (i17 == 0) {
                        }
                        i18 = i5 & 262144;
                        if (i18 == 0) {
                        }
                        if ((i3 & 1879048192) == 0) {
                        }
                        i19 = i5 & 1048576;
                        if (i19 == 0) {
                        }
                        i21 = i5 & 2097152;
                        if (i21 == 0) {
                        }
                        int i432 = i20;
                        i22 = i5 & 4194304;
                        if (i22 == 0) {
                        }
                        i23 = i5 & 8388608;
                        if (i23 == 0) {
                        }
                        if ((i5 & 16777216) == 0) {
                        }
                        i24 = i432;
                        if ((1533875931 & i6) == 306775186) {
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    i14 = i13;
                    if ((i3 & 14) == 0) {
                    }
                    if ((i3 & 112) == 0) {
                    }
                    if ((i3 & 896) == 0) {
                    }
                    if ((i3 & 7168) == 0) {
                    }
                    if ((i3 & 57344) == 0) {
                    }
                    if ((i3 & 458752) == 0) {
                    }
                    i16 = i5 & 65536;
                    if (i16 != 0) {
                    }
                    f7 = f5;
                    i17 = i5 & 131072;
                    if (i17 == 0) {
                    }
                    i18 = i5 & 262144;
                    if (i18 == 0) {
                    }
                    if ((i3 & 1879048192) == 0) {
                    }
                    i19 = i5 & 1048576;
                    if (i19 == 0) {
                    }
                    i21 = i5 & 2097152;
                    if (i21 == 0) {
                    }
                    int i4322 = i20;
                    i22 = i5 & 4194304;
                    if (i22 == 0) {
                    }
                    i23 = i5 & 8388608;
                    if (i23 == 0) {
                    }
                    if ((i5 & 16777216) == 0) {
                    }
                    i24 = i4322;
                    if ((1533875931 & i6) == 306775186) {
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                i12 = i11;
                i13 = i5 & 512;
                if (i13 == 0) {
                }
                i14 = i13;
                if ((i3 & 14) == 0) {
                }
                if ((i3 & 112) == 0) {
                }
                if ((i3 & 896) == 0) {
                }
                if ((i3 & 7168) == 0) {
                }
                if ((i3 & 57344) == 0) {
                }
                if ((i3 & 458752) == 0) {
                }
                i16 = i5 & 65536;
                if (i16 != 0) {
                }
                f7 = f5;
                i17 = i5 & 131072;
                if (i17 == 0) {
                }
                i18 = i5 & 262144;
                if (i18 == 0) {
                }
                if ((i3 & 1879048192) == 0) {
                }
                i19 = i5 & 1048576;
                if (i19 == 0) {
                }
                i21 = i5 & 2097152;
                if (i21 == 0) {
                }
                int i43222 = i20;
                i22 = i5 & 4194304;
                if (i22 == 0) {
                }
                i23 = i5 & 8388608;
                if (i23 == 0) {
                }
                if ((i5 & 16777216) == 0) {
                }
                i24 = i43222;
                if ((1533875931 & i6) == 306775186) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            i10 = i9;
            i11 = i5 & 256;
            if (i11 != 0) {
            }
            i12 = i11;
            i13 = i5 & 512;
            if (i13 == 0) {
            }
            i14 = i13;
            if ((i3 & 14) == 0) {
            }
            if ((i3 & 112) == 0) {
            }
            if ((i3 & 896) == 0) {
            }
            if ((i3 & 7168) == 0) {
            }
            if ((i3 & 57344) == 0) {
            }
            if ((i3 & 458752) == 0) {
            }
            i16 = i5 & 65536;
            if (i16 != 0) {
            }
            f7 = f5;
            i17 = i5 & 131072;
            if (i17 == 0) {
            }
            i18 = i5 & 262144;
            if (i18 == 0) {
            }
            if ((i3 & 1879048192) == 0) {
            }
            i19 = i5 & 1048576;
            if (i19 == 0) {
            }
            i21 = i5 & 2097152;
            if (i21 == 0) {
            }
            int i432222 = i20;
            i22 = i5 & 4194304;
            if (i22 == 0) {
            }
            i23 = i5 & 8388608;
            if (i23 == 0) {
            }
            if ((i5 & 16777216) == 0) {
            }
            i24 = i432222;
            if ((1533875931 & i6) == 306775186) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        if ((i2 & 7168) != 0) {
        }
        i7 = i5 & 32;
        if (i7 == 0) {
        }
        i8 = i5 & 64;
        if (i8 == 0) {
        }
        i9 = i5 & 128;
        if (i9 == 0) {
        }
        i10 = i9;
        i11 = i5 & 256;
        if (i11 != 0) {
        }
        i12 = i11;
        i13 = i5 & 512;
        if (i13 == 0) {
        }
        i14 = i13;
        if ((i3 & 14) == 0) {
        }
        if ((i3 & 112) == 0) {
        }
        if ((i3 & 896) == 0) {
        }
        if ((i3 & 7168) == 0) {
        }
        if ((i3 & 57344) == 0) {
        }
        if ((i3 & 458752) == 0) {
        }
        i16 = i5 & 65536;
        if (i16 != 0) {
        }
        f7 = f5;
        i17 = i5 & 131072;
        if (i17 == 0) {
        }
        i18 = i5 & 262144;
        if (i18 == 0) {
        }
        if ((i3 & 1879048192) == 0) {
        }
        i19 = i5 & 1048576;
        if (i19 == 0) {
        }
        i21 = i5 & 2097152;
        if (i21 == 0) {
        }
        int i4322222 = i20;
        i22 = i5 & 4194304;
        if (i22 == 0) {
        }
        i23 = i5 & 8388608;
        if (i23 == 0) {
        }
        if ((i5 & 16777216) == 0) {
        }
        i24 = i4322222;
        if ((1533875931 & i6) == 306775186) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: MainButtonGradient.kt */
    @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.widget.button.MainButtonGradientKt$PreviewMainButtonGradientAndBlur$1 */
    /* loaded from: classes7.dex */
    public static final class C63901 extends Lambda implements Function0<Unit> {
        public static final C63901 INSTANCE = ;

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
    @Preview(apiLevel = 33, name = "MainButtonGradientAndBlur")
    public static final void PreviewMainButtonGradientAndBlur(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(869778142);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(869778142, i, -1, "com.blackhub.bronline.game.ui.widget.button.PreviewMainButtonGradientAndBlur (MainButtonGradient.kt:169)");
            }
            m15077MainButtonGradientlunQu3Y(SizeKt.m8156defaultMinSizeVpY3zN4(Modifier.INSTANCE, C2046Dp.m13666constructorimpl(91), C2046Dp.m13666constructorimpl(24)), null, "Играть", TypographyStyle.INSTANCE.m14809montserratBold9spOr7ssp67j0QOw(0L, 0, 0L, 0.0f, composerStartRestartGroup, CpioConstants.C_ISBLK, 15), 0.0f, 0, null, null, null, 0.0f, 0L, 0.0f, null, null, null, 0.0f, 0.0f, false, false, null, false, false, false, null, C63901.INSTANCE, composerStartRestartGroup, 390, 0, CpioConstants.C_ISBLK, 16777202);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.button.MainButtonGradientKt.PreviewMainButtonGradientAndBlur.2
                public final /* synthetic */ int $$changed;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C63912(int i2) {
                    super(2);
                    i = i2;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i2) {
                    MainButtonGradientKt.PreviewMainButtonGradientAndBlur(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}
