package com.blackhub.bronline.game.p019ui.widget.button;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.OutlinedTextFieldKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.ClipKt;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.Shape;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.tooling.preview.Preview;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
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
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.profileinstaller.ProfileVerifier;
import com.blackhub.bronline.game.core.extension.ComposeExtensionKt;
import com.blackhub.bronline.game.p019ui.widget.block.ClickAnimateBlockKt;
import com.blackhub.bronline.game.p019ui.widget.other.RectNeonCornerKt;
import com.bless.client.R;
import com.google.firebase.perf.util.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ButtonContentBlock.kt */
@Metadata(m7104d1 = {"\u0000\\\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aõ\u0001\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00132\b\b\u0002\u0010\u0018\u001a\u00020\u00132\b\b\u0002\u0010\u0019\u001a\u00020\u00132\b\b\u0002\u0010\u001a\u001a\u00020\u00132\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00010\u001e2\u0011\u0010 \u001a\r\u0012\u0004\u0012\u00020\u00010\u001e¢\u0006\u0002\b!H\u0007ø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001a\r\u0010$\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010%\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006&"}, m7105d2 = {"ButtonContentBlock", "", "modifier", "Landroidx/compose/ui/Modifier;", "modifierInner", "centerColor", "Landroidx/compose/ui/graphics/Color;", "sideColor", "radiusGradient", "", "brush", "Landroidx/compose/ui/graphics/Brush;", "shape", "Landroidx/compose/ui/graphics/Shape;", OutlinedTextFieldKt.BorderId, "Landroidx/compose/foundation/BorderStroke;", "contentAlignment", "Landroidx/compose/ui/Alignment;", "isShadowVisible", "", Constants.ENABLE_DISABLE, "isEnabledState", "Landroidx/compose/runtime/MutableState;", "isNotDarkened", "isAlphaActive", "isGlareVisible", "isAnimateShow", "animateDurationMillis", "", "onStartClick", "Lkotlin/Function0;", "onFinishClick", "content", "Landroidx/compose/runtime/Composable;", "ButtonContentBlock-kmJHe8M", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;JJFLandroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/ui/Alignment;ZZLandroidx/compose/runtime/MutableState;ZZZZILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "PreviewButtonContentBlock", "(Landroidx/compose/runtime/Composer;I)V", "app_siteRelease"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nButtonContentBlock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ButtonContentBlock.kt\ncom/blackhub/bronline/game/ui/widget/button/ButtonContentBlockKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,118:1\n154#2:119\n154#2:120\n*S KotlinDebug\n*F\n+ 1 ButtonContentBlock.kt\ncom/blackhub/bronline/game/ui/widget/button/ButtonContentBlockKt\n*L\n112#1:119\n113#1:120\n*E\n"})
/* loaded from: classes3.dex */
public final class ButtonContentBlockKt {

    /* compiled from: ButtonContentBlock.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.widget.button.ButtonContentBlockKt$PreviewButtonContentBlock$2 */
    /* loaded from: classes7.dex */
    public static final class C63662 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C63662(int i) {
            super(2);
            i = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            ButtonContentBlockKt.PreviewButtonContentBlock(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:475:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:514:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:524:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:526:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:534:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:540:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:573:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:574:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:575:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:578:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:579:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:582:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:583:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:586:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:587:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:590:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:591:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:594:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:595:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:598:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:599:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:602:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:603:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:605:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:606:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:608:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:609:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:611:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:612:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:615:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:616:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:619:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:620:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:622:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:623:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:625:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:626:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:628:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:629:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:631:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:632:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:634:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:635:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:638:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:641:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:645:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:647:? A[RETURN, SYNTHETIC] */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: ButtonContentBlock-kmJHe8M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m15069ButtonContentBlockkmJHe8M(@Nullable Modifier modifier, @Nullable Modifier modifier2, long j, long j2, float f, @Nullable Brush brush, @Nullable Shape shape, @Nullable BorderStroke borderStroke, @Nullable Alignment alignment, boolean z, boolean z2, @Nullable MutableState<Boolean> mutableState, boolean z3, boolean z4, boolean z5, boolean z6, int i, @Nullable Function0<Unit> function0, @NotNull final Function0<Unit> onFinishClick, @NotNull final Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        Modifier modifier3;
        Modifier modifier4;
        int i12;
        long jColorResource;
        long jColorResource2;
        Modifier modifier5;
        float fM14409dpToPx8Feqmps;
        Brush brushM11293radialGradientP_VxKs$default;
        Brush brush2;
        Shape shapeM8392RoundedCornerShape0680j_4;
        float f2;
        Shape shape2;
        BorderStroke borderStrokeM7798BorderStrokecXLIe8U;
        int i13;
        BorderStroke borderStroke2;
        MutableState<Boolean> mutableStateMutableStateOf$default;
        int i14;
        boolean z7;
        Function0<Unit> function02;
        boolean z8;
        boolean z9;
        int i15;
        boolean z10;
        int i16;
        float f3;
        MutableState<Boolean> mutableState2;
        Alignment alignment2;
        boolean z11;
        boolean z12;
        int i17;
        boolean z13;
        final Modifier modifier6;
        Modifier modifier7;
        Brush brush3;
        Shape shape3;
        BorderStroke borderStroke3;
        final Alignment alignment3;
        final MutableState<Boolean> mutableState3;
        boolean z14;
        final boolean z15;
        final Modifier modifier8;
        final float f4;
        final BorderStroke borderStroke4;
        final boolean z16;
        final boolean z17;
        final Brush brush4;
        final boolean z18;
        final long j3;
        final int i18;
        final Function0<Unit> function03;
        final boolean z19;
        final Shape shape4;
        final long j4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i19;
        int i20;
        Intrinsics.checkNotNullParameter(onFinishClick, "onFinishClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1880916476);
        int i21 = i4 & 1;
        if (i21 != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i5 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 112) == 0) {
            i5 |= ((i4 & 2) == 0 && composerStartRestartGroup.changed(modifier2)) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i5 |= ((i4 & 4) == 0 && composerStartRestartGroup.changed(j)) ? 256 : 128;
        }
        if ((i2 & 7168) == 0) {
            i5 |= ((i4 & 8) == 0 && composerStartRestartGroup.changed(j2)) ? 2048 : 1024;
        }
        if ((i2 & 57344) == 0) {
            i5 |= ((i4 & 16) == 0 && composerStartRestartGroup.changed(f)) ? 16384 : 8192;
        }
        if ((i2 & 458752) == 0) {
            i5 |= ((i4 & 32) == 0 && composerStartRestartGroup.changed(brush)) ? 131072 : 65536;
        }
        if ((i2 & 3670016) == 0) {
            i5 |= ((i4 & 64) == 0 && composerStartRestartGroup.changed(shape)) ? 1048576 : 524288;
        }
        if ((i2 & 29360128) == 0) {
            i5 |= ((i4 & 128) == 0 && composerStartRestartGroup.changed(borderStroke)) ? 8388608 : 4194304;
        }
        int i22 = i4 & 256;
        if (i22 != 0) {
            i5 |= 100663296;
        } else if ((i2 & 234881024) == 0) {
            i5 |= composerStartRestartGroup.changed(alignment) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
        }
        int i23 = i4 & 512;
        if (i23 != 0) {
            i5 |= 805306368;
        } else if ((i2 & 1879048192) == 0) {
            i5 |= composerStartRestartGroup.changed(z) ? 536870912 : 268435456;
        }
        int i24 = i4 & 1024;
        if (i24 != 0) {
            i6 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i6 = i3 | (composerStartRestartGroup.changed(z2) ? 4 : 2);
        } else {
            i6 = i3;
        }
        if ((i3 & 112) == 0) {
            i6 |= ((i4 & 2048) == 0 && composerStartRestartGroup.changed(mutableState)) ? 32 : 16;
        }
        if ((i3 & 896) == 0) {
            i6 |= ((i4 & 4096) == 0 && composerStartRestartGroup.changed(z3)) ? 256 : 128;
        }
        int i25 = i6;
        int i26 = i4 & 8192;
        if (i26 != 0) {
            i25 |= 3072;
        } else {
            if ((i3 & 7168) == 0) {
                i25 |= composerStartRestartGroup.changed(z4) ? 2048 : 1024;
            }
            i7 = i4 & 16384;
            if (i7 == 0) {
                i25 |= CpioConstants.C_ISBLK;
            } else if ((i3 & 57344) == 0) {
                i25 |= composerStartRestartGroup.changed(z5) ? 16384 : 8192;
            }
            i8 = 32768 & i4;
            if (i8 == 0) {
                i25 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
            } else if ((i3 & 458752) == 0) {
                i25 |= composerStartRestartGroup.changed(z6) ? 131072 : 65536;
            }
            i9 = i4 & 65536;
            if (i9 == 0) {
                i25 |= 1572864;
            } else if ((i3 & 3670016) == 0) {
                i25 |= composerStartRestartGroup.changed(i) ? 1048576 : 524288;
            }
            i10 = i4 & 131072;
            if (i10 == 0) {
                i25 |= 12582912;
            } else if ((i3 & 29360128) == 0) {
                i25 |= composerStartRestartGroup.changedInstance(function0) ? 8388608 : 4194304;
            }
            if ((i4 & 262144) != 0) {
                i20 = (i3 & 234881024) == 0 ? composerStartRestartGroup.changedInstance(onFinishClick) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION : 100663296;
                if ((i4 & 524288) == 0) {
                    i19 = (i3 & 1879048192) == 0 ? composerStartRestartGroup.changedInstance(content) ? 536870912 : 268435456 : 805306368;
                    if ((i5 & 1533916891) == 306783378 || (1533916891 & i25) != 306783378 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            Modifier modifier9 = i21 == 0 ? Modifier.INSTANCE : modifier;
                            if ((i4 & 2) == 0) {
                                i11 = i5 & (-113);
                                modifier3 = modifier9;
                            } else {
                                i11 = i5;
                                modifier3 = modifier2;
                            }
                            if ((i4 & 4) == 0) {
                                modifier4 = modifier9;
                                i12 = 6;
                                jColorResource = ColorResources_androidKt.colorResource(R.color.red, composerStartRestartGroup, 6);
                                i11 &= -897;
                            } else {
                                modifier4 = modifier9;
                                i12 = 6;
                                jColorResource = j;
                            }
                            if ((i4 & 8) == 0) {
                                jColorResource2 = ColorResources_androidKt.colorResource(R.color.black_60, composerStartRestartGroup, i12);
                                i11 &= -7169;
                            } else {
                                jColorResource2 = j2;
                            }
                            if ((i4 & 16) == 0) {
                                modifier5 = modifier3;
                                fM14409dpToPx8Feqmps = ComposeExtensionKt.m14409dpToPx8Feqmps(PrimitiveResources_androidKt.dimensionResource(R.dimen._90sdp, composerStartRestartGroup, 6), composerStartRestartGroup, 0);
                                i11 &= -57345;
                            } else {
                                modifier5 = modifier3;
                                fM14409dpToPx8Feqmps = f;
                            }
                            if ((i4 & 32) == 0) {
                                brushM11293radialGradientP_VxKs$default = Brush.Companion.m11293radialGradientP_VxKs$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(jColorResource), Color.m11330boximpl(jColorResource2)}), 0L, fM14409dpToPx8Feqmps, 0, 10, (Object) null);
                                i11 &= -458753;
                            } else {
                                brushM11293radialGradientP_VxKs$default = brush;
                            }
                            if ((i4 & 64) == 0) {
                                brush2 = brushM11293radialGradientP_VxKs$default;
                                shapeM8392RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._5sdp, composerStartRestartGroup, 6));
                                i11 &= -3670017;
                            } else {
                                brush2 = brushM11293radialGradientP_VxKs$default;
                                shapeM8392RoundedCornerShape0680j_4 = shape;
                            }
                            if ((i4 & 128) == 0) {
                                f2 = fM14409dpToPx8Feqmps;
                                shape2 = shapeM8392RoundedCornerShape0680j_4;
                                borderStrokeM7798BorderStrokecXLIe8U = BorderStrokeKt.m7798BorderStrokecXLIe8U(PrimitiveResources_androidKt.dimensionResource(R.dimen._05sdp, composerStartRestartGroup, 6), Color.INSTANCE.m11377getWhite0d7_KjU());
                                i13 = (-29360129) & i11;
                            } else {
                                f2 = fM14409dpToPx8Feqmps;
                                shape2 = shapeM8392RoundedCornerShape0680j_4;
                                borderStrokeM7798BorderStrokecXLIe8U = borderStroke;
                                i13 = i11;
                            }
                            Alignment center = i22 == 0 ? Alignment.INSTANCE.getCenter() : alignment;
                            boolean z20 = i23 == 0 ? false : z;
                            boolean z21 = i24 == 0 ? true : z2;
                            if ((i4 & 2048) == 0) {
                                borderStroke2 = borderStrokeM7798BorderStrokecXLIe8U;
                                mutableStateMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                                i25 &= -113;
                            } else {
                                borderStroke2 = borderStrokeM7798BorderStrokecXLIe8U;
                                mutableStateMutableStateOf$default = mutableState;
                            }
                            if ((i4 & 4096) == 0) {
                                i14 = i25 & (-897);
                                z7 = z21;
                            } else {
                                i14 = i25;
                                z7 = z3;
                            }
                            boolean z22 = i26 == 0 ? false : z4;
                            boolean z23 = i7 == 0 ? false : z5;
                            boolean z24 = i8 == 0 ? false : z6;
                            int i27 = i9 == 0 ? 125 : i;
                            if (i10 == 0) {
                                f3 = f2;
                                z9 = z23;
                                i15 = i14;
                                z10 = z24;
                                i16 = i27;
                                function02 = null;
                                mutableState2 = mutableStateMutableStateOf$default;
                                z11 = z20;
                                z12 = z21;
                                i17 = i13;
                                z13 = z7;
                                z8 = z22;
                                modifier6 = modifier4;
                                brush3 = brush2;
                                shape3 = shape2;
                                borderStroke3 = borderStroke2;
                                alignment2 = center;
                                modifier7 = modifier5;
                            } else {
                                function02 = function0;
                                z8 = z22;
                                z9 = z23;
                                i15 = i14;
                                z10 = z24;
                                i16 = i27;
                                f3 = f2;
                                mutableState2 = mutableStateMutableStateOf$default;
                                alignment2 = center;
                                z11 = z20;
                                z12 = z21;
                                i17 = i13;
                                z13 = z7;
                                modifier6 = modifier4;
                                modifier7 = modifier5;
                                brush3 = brush2;
                                shape3 = shape2;
                                borderStroke3 = borderStroke2;
                            }
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i4 & 2) != 0) {
                                i5 &= -113;
                            }
                            if ((i4 & 4) != 0) {
                                i5 &= -897;
                            }
                            if ((i4 & 8) != 0) {
                                i5 &= -7169;
                            }
                            if ((i4 & 16) != 0) {
                                i5 &= -57345;
                            }
                            if ((i4 & 32) != 0) {
                                i5 &= -458753;
                            }
                            if ((i4 & 64) != 0) {
                                i5 &= -3670017;
                            }
                            if ((i4 & 128) != 0) {
                                i5 &= -29360129;
                            }
                            if ((i4 & 2048) != 0) {
                                i25 &= -113;
                            }
                            if ((i4 & 4096) != 0) {
                                i25 &= -897;
                            }
                            modifier6 = modifier;
                            modifier7 = modifier2;
                            jColorResource = j;
                            jColorResource2 = j2;
                            brush3 = brush;
                            alignment2 = alignment;
                            z11 = z;
                            z12 = z2;
                            mutableState2 = mutableState;
                            z13 = z3;
                            z8 = z4;
                            z9 = z5;
                            z10 = z6;
                            i16 = i;
                            function02 = function0;
                            i17 = i5;
                            i15 = i25;
                            f3 = f;
                            shape3 = shape;
                            borderStroke3 = borderStroke;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1880916476, i17, i15, "com.blackhub.bronline.game.ui.widget.button.ButtonContentBlock (ButtonContentBlock.kt:64)");
                        }
                        final boolean z25 = z11;
                        final Modifier modifier10 = modifier7;
                        final Shape shape5 = shape3;
                        final BorderStroke borderStroke5 = borderStroke3;
                        final Brush brush5 = brush3;
                        final Alignment alignment4 = alignment2;
                        final Modifier modifier11 = modifier6;
                        Modifier modifier12 = modifier7;
                        int i28 = i15 << 6;
                        int i29 = i15 >> 18;
                        ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(modifier6, null, z12, mutableState2, z13, z8, z9, z10, shape3, i16, 0L, function02, onFinishClick, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 2099401805, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.button.ButtonContentBlockKt$ButtonContentBlock$1
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

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer2, int i30) {
                                if ((i30 & 11) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(2099401805, i30, -1, "com.blackhub.bronline.game.ui.widget.button.ButtonContentBlock.<anonymous> (ButtonContentBlock.kt:79)");
                                    }
                                    Boolean boolValueOf = Boolean.valueOf(z25);
                                    final Modifier modifier13 = modifier11;
                                    ComposeExtensionKt.IfTrue(boolValueOf, ComposableLambdaKt.composableLambda(composer2, 548641909, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.button.ButtonContentBlockKt$ButtonContentBlock$1.1
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            invoke(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                        @Composable
                                        public final void invoke(@Nullable Composer composer3, int i31) {
                                            if ((i31 & 11) != 2 || !composer3.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(548641909, i31, -1, "com.blackhub.bronline.game.ui.widget.button.ButtonContentBlock.<anonymous>.<anonymous> (ButtonContentBlock.kt:80)");
                                                }
                                                RectNeonCornerKt.m15097RectNeonCornerFuCtLKA(modifier13, Color.INSTANCE.m11375getTransparent0d7_KjU(), 0.0f, 0L, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, composer3, 48, 1020);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer3.skipToGroupEnd();
                                        }
                                    }), composer2, 48);
                                    Modifier modifierBackground$default = BackgroundKt.background$default(PaddingKt.m8123padding3ABfNKs(BorderKt.border(BackgroundKt.m7770backgroundbw27NRU(ClipKt.clip(modifier10, shape5), ColorResources_androidKt.colorResource(R.color.black_80, composer2, 6), shape5), borderStroke5, shape5), C2046Dp.m13666constructorimpl(PrimitiveResources_androidKt.dimensionResource(R.dimen._1sdp, composer2, 6) / 4)), brush5, shape5, 0.0f, 4, null);
                                    Alignment alignment5 = alignment4;
                                    Function2<Composer, Integer, Unit> function2 = content;
                                    composer2.startReplaceableGroup(733328855);
                                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(alignment5, false, composer2, 0);
                                    composer2.startReplaceableGroup(-1323940314);
                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                                    Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                    Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                    if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                                    composer2.startReplaceableGroup(2058660585);
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    function2.invoke(composer2, 0);
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
                        }), composerStartRestartGroup, (i17 & 14) | (i28 & 896) | (i28 & 7168) | (i28 & 57344) | (i28 & 458752) | (3670016 & i28) | (i28 & 29360128) | ((i17 << 6) & 234881024) | ((i15 << 9) & 1879048192), (i29 & 896) | (i29 & 112) | 3072, AnalyticsListener.EVENT_DRM_KEYS_REMOVED);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        alignment3 = alignment2;
                        mutableState3 = mutableState2;
                        z14 = z13;
                        z15 = z10;
                        modifier8 = modifier12;
                        f4 = f3;
                        borderStroke4 = borderStroke3;
                        z16 = z11;
                        z17 = z9;
                        brush4 = brush3;
                        z18 = z8;
                        j3 = jColorResource;
                        i18 = i16;
                        function03 = function02;
                        z19 = z12;
                        shape4 = shape3;
                        j4 = jColorResource2;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier6 = modifier;
                        modifier8 = modifier2;
                        j3 = j;
                        j4 = j2;
                        f4 = f;
                        brush4 = brush;
                        shape4 = shape;
                        borderStroke4 = borderStroke;
                        alignment3 = alignment;
                        z16 = z;
                        z19 = z2;
                        mutableState3 = mutableState;
                        z14 = z3;
                        z18 = z4;
                        z17 = z5;
                        z15 = z6;
                        i18 = i;
                        function03 = function0;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        final boolean z26 = z14;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.button.ButtonContentBlockKt$ButtonContentBlock$2
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

                            public final void invoke(@Nullable Composer composer2, int i30) {
                                ButtonContentBlockKt.m15069ButtonContentBlockkmJHe8M(modifier6, modifier8, j3, j4, f4, brush4, shape4, borderStroke4, alignment3, z16, z19, mutableState3, z26, z18, z17, z15, i18, function03, onFinishClick, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
                            }
                        });
                        return;
                    }
                    return;
                }
                i25 |= i19;
                if ((i5 & 1533916891) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i21 == 0) {
                        }
                        if ((i4 & 2) == 0) {
                        }
                        if ((i4 & 4) == 0) {
                        }
                        if ((i4 & 8) == 0) {
                        }
                        if ((i4 & 16) == 0) {
                        }
                        if ((i4 & 32) == 0) {
                        }
                        if ((i4 & 64) == 0) {
                        }
                        if ((i4 & 128) == 0) {
                        }
                        if (i22 == 0) {
                        }
                        if (i23 == 0) {
                        }
                        if (i24 == 0) {
                        }
                        if ((i4 & 2048) == 0) {
                        }
                        if ((i4 & 4096) == 0) {
                        }
                        if (i26 == 0) {
                        }
                        if (i7 == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (i9 == 0) {
                        }
                        if (i10 == 0) {
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        final boolean z252 = z11;
                        final Modifier modifier102 = modifier7;
                        final Shape shape52 = shape3;
                        final BorderStroke borderStroke52 = borderStroke3;
                        final Brush brush52 = brush3;
                        final Alignment alignment42 = alignment2;
                        final Modifier modifier112 = modifier6;
                        Modifier modifier122 = modifier7;
                        int i282 = i15 << 6;
                        int i292 = i15 >> 18;
                        ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(modifier6, null, z12, mutableState2, z13, z8, z9, z10, shape3, i16, 0L, function02, onFinishClick, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 2099401805, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.button.ButtonContentBlockKt$ButtonContentBlock$1
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

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer2, int i30) {
                                if ((i30 & 11) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(2099401805, i30, -1, "com.blackhub.bronline.game.ui.widget.button.ButtonContentBlock.<anonymous> (ButtonContentBlock.kt:79)");
                                    }
                                    Boolean boolValueOf = Boolean.valueOf(z252);
                                    final Modifier modifier13 = modifier112;
                                    ComposeExtensionKt.IfTrue(boolValueOf, ComposableLambdaKt.composableLambda(composer2, 548641909, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.button.ButtonContentBlockKt$ButtonContentBlock$1.1
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            invoke(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                        @Composable
                                        public final void invoke(@Nullable Composer composer3, int i31) {
                                            if ((i31 & 11) != 2 || !composer3.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(548641909, i31, -1, "com.blackhub.bronline.game.ui.widget.button.ButtonContentBlock.<anonymous>.<anonymous> (ButtonContentBlock.kt:80)");
                                                }
                                                RectNeonCornerKt.m15097RectNeonCornerFuCtLKA(modifier13, Color.INSTANCE.m11375getTransparent0d7_KjU(), 0.0f, 0L, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, composer3, 48, 1020);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer3.skipToGroupEnd();
                                        }
                                    }), composer2, 48);
                                    Modifier modifierBackground$default = BackgroundKt.background$default(PaddingKt.m8123padding3ABfNKs(BorderKt.border(BackgroundKt.m7770backgroundbw27NRU(ClipKt.clip(modifier102, shape52), ColorResources_androidKt.colorResource(R.color.black_80, composer2, 6), shape52), borderStroke52, shape52), C2046Dp.m13666constructorimpl(PrimitiveResources_androidKt.dimensionResource(R.dimen._1sdp, composer2, 6) / 4)), brush52, shape52, 0.0f, 4, null);
                                    Alignment alignment5 = alignment42;
                                    Function2<Composer, Integer, Unit> function2 = content;
                                    composer2.startReplaceableGroup(733328855);
                                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(alignment5, false, composer2, 0);
                                    composer2.startReplaceableGroup(-1323940314);
                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                                    Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                    Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                    if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                                    composer2.startReplaceableGroup(2058660585);
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    function2.invoke(composer2, 0);
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
                        }), composerStartRestartGroup, (i17 & 14) | (i282 & 896) | (i282 & 7168) | (i282 & 57344) | (i282 & 458752) | (3670016 & i282) | (i282 & 29360128) | ((i17 << 6) & 234881024) | ((i15 << 9) & 1879048192), (i292 & 896) | (i292 & 112) | 3072, AnalyticsListener.EVENT_DRM_KEYS_REMOVED);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        alignment3 = alignment2;
                        mutableState3 = mutableState2;
                        z14 = z13;
                        z15 = z10;
                        modifier8 = modifier122;
                        f4 = f3;
                        borderStroke4 = borderStroke3;
                        z16 = z11;
                        z17 = z9;
                        brush4 = brush3;
                        z18 = z8;
                        j3 = jColorResource;
                        i18 = i16;
                        function03 = function02;
                        z19 = z12;
                        shape4 = shape3;
                        j4 = jColorResource2;
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            i25 |= i20;
            if ((i4 & 524288) == 0) {
            }
            i25 |= i19;
            if ((i5 & 1533916891) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        i7 = i4 & 16384;
        if (i7 == 0) {
        }
        i8 = 32768 & i4;
        if (i8 == 0) {
        }
        i9 = i4 & 65536;
        if (i9 == 0) {
        }
        i10 = i4 & 131072;
        if (i10 == 0) {
        }
        if ((i4 & 262144) != 0) {
        }
        i25 |= i20;
        if ((i4 & 524288) == 0) {
        }
        i25 |= i19;
        if ((i5 & 1533916891) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: ButtonContentBlock.kt */
    @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.widget.button.ButtonContentBlockKt$PreviewButtonContentBlock$1 */
    /* loaded from: classes7.dex */
    public static final class C63651 extends Lambda implements Function0<Unit> {
        public static final C63651 INSTANCE = ;

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
    @Preview
    public static final void PreviewButtonContentBlock(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(504194876);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(504194876, i, -1, "com.blackhub.bronline.game.ui.widget.button.PreviewButtonContentBlock (ButtonContentBlock.kt:107)");
            }
            m15069ButtonContentBlockkmJHe8M(SizeKt.m8156defaultMinSizeVpY3zN4(Modifier.INSTANCE, C2046Dp.m13666constructorimpl(91), C2046Dp.m13666constructorimpl(24)), null, 0L, 0L, 0.0f, null, null, null, null, false, false, null, false, false, false, false, 0, null, C63651.INSTANCE, ComposableSingletons$ButtonContentBlockKt.INSTANCE.m15072getLambda1$app_siteRelease(), composerStartRestartGroup, 6, 905969664, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.button.ButtonContentBlockKt.PreviewButtonContentBlock.2
                public final /* synthetic */ int $$changed;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C63662(int i2) {
                    super(2);
                    i = i2;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i2) {
                    ButtonContentBlockKt.PreviewButtonContentBlock(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}
