package com.blackhub.bronline.game.p019ui.widget.button;

import androidx.annotation.DrawableRes;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.ClipKt;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ColorFilter;
import androidx.compose.p003ui.graphics.ColorKt;
import androidx.compose.p003ui.graphics.painter.Painter;
import androidx.compose.p003ui.layout.ContentScale;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
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
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.profileinstaller.ProfileVerifier;
import com.blackhub.bronline.game.core.extension.ComposeExtensionKt;
import com.blackhub.bronline.game.p019ui.widget.block.ClickAnimateBlockKt;
import com.blackhub.bronline.game.p019ui.widget.other.NarrowOvalWithGradientKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import com.google.firebase.perf.util.Constants;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MainButtonWithTopNarrowOvalGradient.kt */
@Metadata(m7104d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0086\u0001\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u0014H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\r\u0010\u0017\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0018\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, m7105d2 = {"MainButtonWithTopNarrowOvalGradient", "", "modifier", "Landroidx/compose/ui/Modifier;", "text", "", "textStyle", "Landroidx/compose/ui/text/TextStyle;", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "Landroidx/compose/ui/graphics/Color;", "cornerRadius", "Landroidx/compose/ui/unit/Dp;", "startImage", "", "sizeOfStartImage", Constants.ENABLE_DISABLE, "", "isColorDarkened", "isAnimateShow", "onCLick", "Lkotlin/Function0;", "MainButtonWithTopNarrowOvalGradient-GE33TkQ", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;JFLjava/lang/Integer;Landroidx/compose/ui/unit/Dp;ZZZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V", "PreviewMainButtonWithTopNarrowOvalGradient", "(Landroidx/compose/runtime/Composer;I)V", "app_siteRelease"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class MainButtonWithTopNarrowOvalGradientKt {
    /* JADX WARN: Removed duplicated region for block: B:100:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:185:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011b  */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v6 */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: MainButtonWithTopNarrowOvalGradient-GE33TkQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m15078MainButtonWithTopNarrowOvalGradientGE33TkQ(@Nullable Modifier modifier, @NotNull final String text, @Nullable TextStyle textStyle, final long j, float f, @DrawableRes @Nullable Integer num, @Nullable C2046Dp c2046Dp, boolean z, boolean z2, boolean z3, @Nullable Function0<Unit> function0, @Nullable Composer composer, final int i, final int i2, final int i3) {
        int i4;
        TextStyle textStyle2;
        float f2;
        final Integer num2;
        int i5;
        C2046Dp c2046Dp2;
        int i6;
        boolean z4;
        int i7;
        int i8;
        int i9;
        int i10;
        Function0<Unit> function02;
        int i11;
        int i12;
        boolean z5;
        TextStyle textStyleM14788montserratBold11sp67j0QOw;
        int i13;
        float fDimensionResource;
        int i14;
        boolean z6;
        Function0<Unit> function03;
        boolean z7;
        TextStyle textStyle3;
        float f3;
        C2046Dp c2046Dp3;
        Integer num3;
        boolean z8;
        int i15;
        boolean z9;
        Modifier modifier2;
        ?? r11;
        int i16;
        final Modifier modifier3;
        final TextStyle textStyle4;
        final float f4;
        final C2046Dp c2046Dp4;
        final boolean z10;
        final boolean z11;
        final boolean z12;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i17;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer composerStartRestartGroup = composer.startRestartGroup(1387982870);
        int i18 = i3 & 1;
        if (i18 != 0) {
            i4 = i | 6;
        } else if ((i & 14) == 0) {
            i4 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 112) == 0) {
            i4 |= composerStartRestartGroup.changed(text) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            if ((i3 & 4) == 0) {
                textStyle2 = textStyle;
                int i19 = composerStartRestartGroup.changed(textStyle2) ? 256 : 128;
                i4 |= i19;
            } else {
                textStyle2 = textStyle;
            }
            i4 |= i19;
        } else {
            textStyle2 = textStyle;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i & 7168) == 0) {
            i4 |= composerStartRestartGroup.changed(j) ? 2048 : 1024;
        }
        if ((i & 57344) == 0) {
            f2 = f;
            i4 |= ((i3 & 16) == 0 && composerStartRestartGroup.changed(f2)) ? 16384 : 8192;
        } else {
            f2 = f;
        }
        int i20 = i3 & 32;
        if (i20 != 0) {
            i4 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
        } else {
            if ((458752 & i) == 0) {
                num2 = num;
                i4 |= composerStartRestartGroup.changed(num2) ? 131072 : 65536;
            }
            i5 = i3 & 64;
            if (i5 == 0) {
                i4 |= 1572864;
                c2046Dp2 = c2046Dp;
            } else {
                c2046Dp2 = c2046Dp;
                if ((i & 3670016) == 0) {
                    i4 |= composerStartRestartGroup.changed(c2046Dp2) ? 1048576 : 524288;
                }
            }
            i6 = i3 & 128;
            if (i6 == 0) {
                i4 |= 12582912;
            } else if ((i & 29360128) == 0) {
                i4 |= composerStartRestartGroup.changed(z) ? 8388608 : 4194304;
            }
            if ((234881024 & i) != 0) {
                if ((i3 & 256) == 0) {
                    z4 = z2;
                    if (composerStartRestartGroup.changed(z4)) {
                        i17 = 67108864;
                    }
                    i4 |= i17;
                } else {
                    z4 = z2;
                }
                i17 = NTLMEngineImpl.FLAG_REQUEST_VERSION;
                i4 |= i17;
            } else {
                z4 = z2;
            }
            i7 = i3 & 512;
            if (i7 != 0) {
                if ((i & 1879048192) == 0) {
                    i8 = i7;
                    i4 |= composerStartRestartGroup.changed(z3) ? 536870912 : 268435456;
                }
                i9 = i3 & 1024;
                if (i9 != 0) {
                    i11 = i2 | 6;
                    i10 = i9;
                    function02 = function0;
                } else if ((i2 & 14) == 0) {
                    i10 = i9;
                    function02 = function0;
                    i11 = i2 | (composerStartRestartGroup.changedInstance(function02) ? 4 : 2);
                } else {
                    i10 = i9;
                    function02 = function0;
                    i11 = i2;
                }
                if ((i4 & 1533916891) != 306783378 || (i11 & 11) != 2 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        Modifier modifier4 = i18 == 0 ? Modifier.INSTANCE : modifier;
                        if ((i3 & 4) == 0) {
                            i12 = i11;
                            z5 = true;
                            textStyleM14788montserratBold11sp67j0QOw = TypographyStyle.INSTANCE.m14788montserratBold11sp67j0QOw(0L, TextAlign.INSTANCE.m13558getCentere0LSkKk(), 0L, 0.0f, composerStartRestartGroup, CpioConstants.C_ISBLK, 13);
                            i4 &= -897;
                        } else {
                            i12 = i11;
                            z5 = true;
                            textStyleM14788montserratBold11sp67j0QOw = textStyle2;
                        }
                        if ((i3 & 16) == 0) {
                            i13 = 6;
                            fDimensionResource = PrimitiveResources_androidKt.dimensionResource(R.dimen._1sdp, composerStartRestartGroup, 6);
                            i4 &= -57345;
                        } else {
                            i13 = 6;
                            fDimensionResource = f;
                        }
                        Integer num4 = i20 == 0 ? null : num;
                        C2046Dp c2046Dp5 = i5 == 0 ? c2046Dp2 : null;
                        boolean z13 = i6 == 0 ? z5 ? 1 : 0 : z;
                        if ((i3 & 256) == 0) {
                            i14 = i4 & (-234881025);
                            z6 = z13;
                        } else {
                            i14 = i4;
                            z6 = z2;
                        }
                        boolean z14 = i8 == 0 ? false : z3;
                        if (i10 == 0) {
                            z7 = z13;
                            textStyle3 = textStyleM14788montserratBold11sp67j0QOw;
                            f3 = fDimensionResource;
                            c2046Dp3 = c2046Dp5;
                            num3 = num4;
                            z8 = z6;
                            i15 = i14;
                            z9 = z14;
                            function03 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.widget.button.MainButtonWithTopNarrowOvalGradientKt$MainButtonWithTopNarrowOvalGradient$1
                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }
                            };
                        } else {
                            function03 = function0;
                            z7 = z13;
                            textStyle3 = textStyleM14788montserratBold11sp67j0QOw;
                            f3 = fDimensionResource;
                            c2046Dp3 = c2046Dp5;
                            num3 = num4;
                            z8 = z6;
                            i15 = i14;
                            z9 = z14;
                        }
                        modifier2 = modifier4;
                        r11 = z5;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                        }
                        if ((i3 & 16) != 0) {
                            i4 &= -57345;
                        }
                        if ((i3 & 256) != 0) {
                            i4 &= -234881025;
                        }
                        z7 = z;
                        z9 = z3;
                        function03 = function0;
                        i12 = i11;
                        textStyle3 = textStyle2;
                        num3 = num2;
                        f3 = f2;
                        z8 = z4;
                        r11 = 1;
                        c2046Dp3 = c2046Dp2;
                        modifier2 = modifier;
                        i13 = 6;
                        i15 = i4;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        i16 = i12;
                    } else {
                        i16 = i12;
                        ComposerKt.traceEventStart(1387982870, i15, i16, "com.blackhub.bronline.game.ui.widget.button.MainButtonWithTopNarrowOvalGradient (MainButtonWithTopNarrowOvalGradient.kt:43)");
                    }
                    final RoundedCornerShape roundedCornerShapeM8392RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(f3);
                    final float fPxToDp = ComposeExtensionKt.pxToDp(r11, composerStartRestartGroup, i13);
                    final float f5 = 0.6f;
                    final Modifier modifier5 = modifier2;
                    final Integer num5 = num3;
                    int i21 = i15;
                    final TextStyle textStyle5 = textStyle3;
                    final C2046Dp c2046Dp6 = c2046Dp3;
                    ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(Modifier.INSTANCE, null, z7, null, z8, false, false, z9, roundedCornerShapeM8392RoundedCornerShape0680j_4, 0, 0L, null, function03, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1440159385, r11, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.button.MainButtonWithTopNarrowOvalGradientKt$MainButtonWithTopNarrowOvalGradient$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num6) {
                            invoke(composer2, num6.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i22) {
                            Modifier modifierM8172size3ABfNKs;
                            int i23;
                            Modifier.Companion companion;
                            if ((i22 & 11) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1440159385, i22, -1, "com.blackhub.bronline.game.ui.widget.button.MainButtonWithTopNarrowOvalGradient.<anonymous> (MainButtonWithTopNarrowOvalGradient.kt:57)");
                                }
                                Modifier modifierM7770backgroundbw27NRU = BackgroundKt.m7770backgroundbw27NRU(ClipKt.clip(modifier5, roundedCornerShapeM8392RoundedCornerShape0680j_4), j, roundedCornerShapeM8392RoundedCornerShape0680j_4);
                                Alignment.Companion companion2 = Alignment.INSTANCE;
                                Alignment center = companion2.getCenter();
                                float f6 = fPxToDp;
                                float f7 = f5;
                                Integer num6 = num5;
                                String str = text;
                                TextStyle textStyle6 = textStyle5;
                                C2046Dp c2046Dp7 = c2046Dp6;
                                composer2.startReplaceableGroup(733328855);
                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
                                composer2.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM7770backgroundbw27NRU);
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
                                Modifier.Companion companion4 = Modifier.INSTANCE;
                                NarrowOvalWithGradientKt.NarrowOvalWithGradient(boxScopeInstance.align(SizeKt.m8172size3ABfNKs(SizeKt.fillMaxWidth(PaddingKt.m8127paddingqDBjuR0$default(companion4, 0.0f, f6, 0.0f, 0.0f, 13, null), f7), PrimitiveResources_androidKt.dimensionResource(R.dimen._1sdp, composer2, 6)), companion2.getTopCenter()), null, composer2, 0, 2);
                                Arrangement.HorizontalOrVertical center2 = Arrangement.INSTANCE.getCenter();
                                Alignment.Vertical centerVertically = companion2.getCenterVertically();
                                composer2.startReplaceableGroup(693286680);
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
                                composer2.startReplaceableGroup(-265161539);
                                if (num6 == null) {
                                    i23 = 6;
                                    companion = companion4;
                                } else {
                                    Painter painterPainterResource = PainterResources_androidKt.painterResource(num6.intValue(), composer2, 0);
                                    if (c2046Dp7 == null || (modifierM8172size3ABfNKs = SizeKt.m8172size3ABfNKs(companion4, c2046Dp7.m13680unboximpl())) == null) {
                                        modifierM8172size3ABfNKs = companion4;
                                    }
                                    i23 = 6;
                                    companion = companion4;
                                    ImageKt.Image(painterPainterResource, (String) null, modifierM8172size3ABfNKs, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 120);
                                }
                                composer2.endReplaceableGroup();
                                String upperCase = str.toUpperCase(Locale.ROOT);
                                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                                TextKt.m10024Text4IGK_g(upperCase, PaddingKt.m8123padding3ABfNKs(companion, PrimitiveResources_androidKt.dimensionResource(R.dimen._6sdp, composer2, i23)), Color.INSTANCE.m11377getWhite0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle6, composer2, 384, 0, 65528);
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
                    }), composerStartRestartGroup, ((i21 >> 15) & 896) | 6 | ((i21 >> 12) & 57344) | ((i21 >> 6) & 29360128), ((i16 << 6) & 896) | 3072, 3690);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    textStyle4 = textStyle3;
                    f4 = f3;
                    num2 = num3;
                    c2046Dp4 = c2046Dp3;
                    z10 = z7;
                    z11 = z8;
                    z12 = z9;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier;
                    z12 = z3;
                    textStyle4 = textStyle2;
                    f4 = f2;
                    function03 = function02;
                    c2046Dp4 = c2046Dp2;
                    z11 = z4;
                    z10 = z;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Function0<Unit> function04 = function03;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.button.MainButtonWithTopNarrowOvalGradientKt$MainButtonWithTopNarrowOvalGradient$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num6) {
                            invoke(composer2, num6.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer2, int i22) {
                            MainButtonWithTopNarrowOvalGradientKt.m15078MainButtonWithTopNarrowOvalGradientGE33TkQ(modifier3, text, textStyle4, j, f4, num2, c2046Dp4, z10, z11, z12, function04, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                        }
                    });
                    return;
                }
                return;
            }
            i4 |= 805306368;
            i8 = i7;
            i9 = i3 & 1024;
            if (i9 != 0) {
            }
            if ((i4 & 1533916891) != 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i18 == 0) {
                    }
                    if ((i3 & 4) == 0) {
                    }
                    if ((i3 & 16) == 0) {
                    }
                    if (i20 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 == 0) {
                    }
                    if ((i3 & 256) == 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (i10 == 0) {
                    }
                    modifier2 = modifier4;
                    r11 = z5;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    final RoundedCornerShape roundedCornerShapeM8392RoundedCornerShape0680j_42 = RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(f3);
                    final float fPxToDp2 = ComposeExtensionKt.pxToDp(r11, composerStartRestartGroup, i13);
                    final float f52 = 0.6f;
                    final Modifier modifier52 = modifier2;
                    final Integer num52 = num3;
                    int i212 = i15;
                    final TextStyle textStyle52 = textStyle3;
                    final C2046Dp c2046Dp62 = c2046Dp3;
                    ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(Modifier.INSTANCE, null, z7, null, z8, false, false, z9, roundedCornerShapeM8392RoundedCornerShape0680j_42, 0, 0L, null, function03, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1440159385, r11, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.button.MainButtonWithTopNarrowOvalGradientKt$MainButtonWithTopNarrowOvalGradient$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num6) {
                            invoke(composer2, num6.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i22) {
                            Modifier modifierM8172size3ABfNKs;
                            int i23;
                            Modifier.Companion companion;
                            if ((i22 & 11) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1440159385, i22, -1, "com.blackhub.bronline.game.ui.widget.button.MainButtonWithTopNarrowOvalGradient.<anonymous> (MainButtonWithTopNarrowOvalGradient.kt:57)");
                                }
                                Modifier modifierM7770backgroundbw27NRU = BackgroundKt.m7770backgroundbw27NRU(ClipKt.clip(modifier52, roundedCornerShapeM8392RoundedCornerShape0680j_42), j, roundedCornerShapeM8392RoundedCornerShape0680j_42);
                                Alignment.Companion companion2 = Alignment.INSTANCE;
                                Alignment center = companion2.getCenter();
                                float f6 = fPxToDp2;
                                float f7 = f52;
                                Integer num6 = num52;
                                String str = text;
                                TextStyle textStyle6 = textStyle52;
                                C2046Dp c2046Dp7 = c2046Dp62;
                                composer2.startReplaceableGroup(733328855);
                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
                                composer2.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM7770backgroundbw27NRU);
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
                                Modifier.Companion companion4 = Modifier.INSTANCE;
                                NarrowOvalWithGradientKt.NarrowOvalWithGradient(boxScopeInstance.align(SizeKt.m8172size3ABfNKs(SizeKt.fillMaxWidth(PaddingKt.m8127paddingqDBjuR0$default(companion4, 0.0f, f6, 0.0f, 0.0f, 13, null), f7), PrimitiveResources_androidKt.dimensionResource(R.dimen._1sdp, composer2, 6)), companion2.getTopCenter()), null, composer2, 0, 2);
                                Arrangement.HorizontalOrVertical center2 = Arrangement.INSTANCE.getCenter();
                                Alignment.Vertical centerVertically = companion2.getCenterVertically();
                                composer2.startReplaceableGroup(693286680);
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
                                composer2.startReplaceableGroup(-265161539);
                                if (num6 == null) {
                                    i23 = 6;
                                    companion = companion4;
                                } else {
                                    Painter painterPainterResource = PainterResources_androidKt.painterResource(num6.intValue(), composer2, 0);
                                    if (c2046Dp7 == null || (modifierM8172size3ABfNKs = SizeKt.m8172size3ABfNKs(companion4, c2046Dp7.m13680unboximpl())) == null) {
                                        modifierM8172size3ABfNKs = companion4;
                                    }
                                    i23 = 6;
                                    companion = companion4;
                                    ImageKt.Image(painterPainterResource, (String) null, modifierM8172size3ABfNKs, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 120);
                                }
                                composer2.endReplaceableGroup();
                                String upperCase = str.toUpperCase(Locale.ROOT);
                                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                                TextKt.m10024Text4IGK_g(upperCase, PaddingKt.m8123padding3ABfNKs(companion, PrimitiveResources_androidKt.dimensionResource(R.dimen._6sdp, composer2, i23)), Color.INSTANCE.m11377getWhite0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle6, composer2, 384, 0, 65528);
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
                    }), composerStartRestartGroup, ((i212 >> 15) & 896) | 6 | ((i212 >> 12) & 57344) | ((i212 >> 6) & 29360128), ((i16 << 6) & 896) | 3072, 3690);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier2;
                    textStyle4 = textStyle3;
                    f4 = f3;
                    num2 = num3;
                    c2046Dp4 = c2046Dp3;
                    z10 = z7;
                    z11 = z8;
                    z12 = z9;
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        num2 = num;
        i5 = i3 & 64;
        if (i5 == 0) {
        }
        i6 = i3 & 128;
        if (i6 == 0) {
        }
        if ((234881024 & i) != 0) {
        }
        i7 = i3 & 512;
        if (i7 != 0) {
        }
        i8 = i7;
        i9 = i3 & 1024;
        if (i9 != 0) {
        }
        if ((i4 & 1533916891) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(name = "MainButton")
    public static final void PreviewMainButtonWithTopNarrowOvalGradient(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1426595506);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1426595506, i, -1, "com.blackhub.bronline.game.ui.widget.button.PreviewMainButtonWithTopNarrowOvalGradient (MainButtonWithTopNarrowOvalGradient.kt:98)");
            }
            m15078MainButtonWithTopNarrowOvalGradientGE33TkQ(null, "Играть", null, ColorKt.Color(4293013772L), 0.0f, null, null, false, false, false, null, composerStartRestartGroup, 3120, 0, 2037);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.button.MainButtonWithTopNarrowOvalGradientKt.PreviewMainButtonWithTopNarrowOvalGradient.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i2) {
                    MainButtonWithTopNarrowOvalGradientKt.PreviewMainButtonWithTopNarrowOvalGradient(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}
