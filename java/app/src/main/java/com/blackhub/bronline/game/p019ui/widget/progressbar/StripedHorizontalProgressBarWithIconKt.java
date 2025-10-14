package com.blackhub.bronline.game.p019ui.widget.progressbar;

import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.CanvasKt;
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
import androidx.compose.material3.ProgressIndicatorDefaults;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.ScaleKt;
import androidx.compose.p003ui.geometry.CornerRadiusKt;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ColorFilter;
import androidx.compose.p003ui.graphics.drawscope.DrawScope;
import androidx.compose.p003ui.layout.ContentScale;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PainterResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.res.StringResources_androidKt;
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
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.profileinstaller.ProfileVerifier;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.extension.ComposeExtensionKt;
import com.blackhub.bronline.game.p019ui.widget.other.RectShadowKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: StripedHorizontalProgressBarWithIcon.kt */
@SourceDebugExtension({"SMAP\nStripedHorizontalProgressBarWithIcon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StripedHorizontalProgressBarWithIcon.kt\ncom/blackhub/bronline/game/ui/widget/progressbar/StripedHorizontalProgressBarWithIconKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,205:1\n1116#2,6:206\n68#3,6:212\n74#3:246\n78#3:251\n79#4,11:218\n92#4:250\n456#5,8:229\n464#5,3:243\n467#5,3:247\n3737#6,6:237\n81#7:252\n81#7:253\n*S KotlinDebug\n*F\n+ 1 StripedHorizontalProgressBarWithIcon.kt\ncom/blackhub/bronline/game/ui/widget/progressbar/StripedHorizontalProgressBarWithIconKt\n*L\n85#1:206,6\n99#1:212,6\n99#1:246\n99#1:251\n99#1:218,11\n99#1:250\n99#1:229,8\n99#1:243,3\n99#1:247,3\n99#1:237,6\n85#1:252\n91#1:253\n*E\n"})
/* loaded from: classes3.dex */
public final class StripedHorizontalProgressBarWithIconKt {
    public static final float RADIUS_BLUR = 10.0f;
    public static final int ROTATE_DURATION_MILLIS = 400;
    public static final float SCALE_X = 1.02f;
    public static final float SCALE_Y = 1.1f;

    /* JADX WARN: Removed duplicated region for block: B:108:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:258:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0132  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: StripedHorizontalProgressBarWithIcon-YTPNW1E, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m15103StripedHorizontalProgressBarWithIconYTPNW1E(@Nullable Modifier modifier, @DimenRes int i, @Nullable Brush brush, @DimenRes int i2, final int i3, final int i4, long j, long j2, @DrawableRes @Nullable Integer num, @DimenRes int i5, @DimenRes int i6, @NotNull final String titleFormat, @Nullable TextStyle textStyle, boolean z, @ColorRes int i7, @Nullable Composer composer, final int i8, final int i9, final int i10) {
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
        Brush brushM11289horizontalGradient8A3gB4$default;
        long jColorResource;
        long jColorResource2;
        int i23;
        int i24;
        int i25;
        Composer composer2;
        int i26;
        int i27;
        TextStyle textStyleM14811montserratBoldCustomSpIzzofJo;
        int i28;
        int i29;
        Brush brush2;
        final int i30;
        int i31;
        TextStyle textStyle2;
        boolean z2;
        Integer num2;
        int i32;
        Composer composer3;
        boolean z3;
        Object objRememberedValue;
        int currentCompositeKeyHash;
        Composer composerM10870constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer4;
        final Modifier modifier3;
        final Integer num3;
        final TextStyle textStyle3;
        final boolean z4;
        final long j3;
        final long j4;
        final int i33;
        final int i34;
        final int i35;
        final Brush brush3;
        final int i36;
        final int i37;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(titleFormat, "titleFormat");
        Composer composerStartRestartGroup = composer.startRestartGroup(756572306);
        int i38 = i10 & 1;
        if (i38 != 0) {
            i11 = i8 | 6;
        } else if ((i8 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i8;
        } else {
            i11 = i8;
        }
        int i39 = i10 & 2;
        if (i39 != 0) {
            i11 |= 48;
        } else if ((i8 & 112) == 0) {
            i11 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i8 & 896) == 0) {
            i11 |= ((i10 & 4) == 0 && composerStartRestartGroup.changed(brush)) ? 256 : 128;
        }
        int i40 = i10 & 8;
        if (i40 != 0) {
            i11 |= 3072;
        } else {
            if ((i8 & 7168) == 0) {
                i12 = i2;
                i11 |= composerStartRestartGroup.changed(i12) ? 2048 : 1024;
            }
            if ((i10 & 16) == 0) {
                i11 |= CpioConstants.C_ISBLK;
            } else if ((i8 & 57344) == 0) {
                i11 |= composerStartRestartGroup.changed(i3) ? 16384 : 8192;
            }
            if ((i10 & 32) == 0) {
                i13 = ProfileVerifier.CompilationStatus.f342xf2722a21;
            } else {
                if ((i8 & 458752) == 0) {
                    i13 = composerStartRestartGroup.changed(i4) ? 131072 : 65536;
                }
                if ((i8 & 3670016) == 0) {
                    i11 |= ((i10 & 64) == 0 && composerStartRestartGroup.changed(j)) ? 1048576 : 524288;
                }
                if ((i8 & 29360128) == 0) {
                    i14 = i10;
                    i11 |= ((i14 & 128) == 0 && composerStartRestartGroup.changed(j2)) ? 8388608 : 4194304;
                } else {
                    i14 = i10;
                }
                i15 = i14 & 256;
                if (i15 != 0) {
                    i11 |= 100663296;
                } else if ((i8 & 234881024) == 0) {
                    i11 |= composerStartRestartGroup.changed(num) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                }
                i16 = i14 & 512;
                if (i16 != 0) {
                    i11 |= 805306368;
                } else {
                    if ((1879048192 & i8) == 0) {
                        i11 |= composerStartRestartGroup.changed(i5) ? 536870912 : 268435456;
                    }
                    i17 = i14 & 1024;
                    if (i17 == 0) {
                        i18 = i9 | 6;
                    } else if ((i9 & 14) == 0) {
                        i18 = i9 | (composerStartRestartGroup.changed(i6) ? 4 : 2);
                    } else {
                        i18 = i9;
                    }
                    if ((i14 & 2048) == 0) {
                        i18 |= 48;
                    } else if ((i9 & 112) == 0) {
                        i18 |= composerStartRestartGroup.changed(titleFormat) ? 32 : 16;
                    }
                    if ((i9 & 896) == 0) {
                        i18 |= ((i14 & 4096) == 0 && composerStartRestartGroup.changed(textStyle)) ? 256 : 128;
                    }
                    int i41 = i18;
                    i19 = i14 & 8192;
                    if (i19 == 0) {
                        i41 |= 3072;
                    } else {
                        if ((i9 & 7168) == 0) {
                            i41 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
                        }
                        i20 = i14 & 16384;
                        if (i20 == 0) {
                            if ((i9 & 57344) == 0) {
                                i21 = i20;
                                i22 = i7;
                                i41 |= composerStartRestartGroup.changed(i22) ? 16384 : 8192;
                            }
                            if ((i11 & 1533916891) == 306783378 || (46811 & i41) != 9362 || !composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.startDefaults();
                                if ((i8 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                    modifier2 = i38 == 0 ? Modifier.INSTANCE : modifier;
                                    int i42 = i39 == 0 ? R.dimen._1wdp : i;
                                    if ((i14 & 4) == 0) {
                                        i11 &= -897;
                                        brushM11289horizontalGradient8A3gB4$default = Brush.Companion.m11289horizontalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.white, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.black_70, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null);
                                    } else {
                                        brushM11289horizontalGradient8A3gB4$default = brush;
                                    }
                                    int i43 = i40 == 0 ? R.dimen._2wdp : i12;
                                    if ((i14 & 64) == 0) {
                                        i11 &= -3670017;
                                        jColorResource = ColorResources_androidKt.colorResource(R.color.total_black_70, composerStartRestartGroup, 6);
                                    } else {
                                        jColorResource = j;
                                    }
                                    if ((i14 & 128) == 0) {
                                        i23 = (-29360129) & i11;
                                        jColorResource2 = ColorResources_androidKt.colorResource(R.color.red, composerStartRestartGroup, 6);
                                    } else {
                                        jColorResource2 = j2;
                                        i23 = i11;
                                    }
                                    Integer num4 = i15 == 0 ? null : num;
                                    i24 = i16 == 0 ? R.dimen._8wdp : i5;
                                    i25 = i17 == 0 ? R.dimen._5wdp : i6;
                                    if ((i14 & 4096) == 0) {
                                        i26 = i19;
                                        i27 = i21;
                                        composer2 = composerStartRestartGroup;
                                        textStyleM14811montserratBoldCustomSpIzzofJo = TypographyStyle.INSTANCE.m14811montserratBoldCustomSpIzzofJo(R.dimen._10wsp, 0L, 0, 0L, 0.0f, null, null, composer2, 12582918, 126);
                                        i41 &= -897;
                                    } else {
                                        composer2 = composerStartRestartGroup;
                                        i26 = i19;
                                        i27 = i21;
                                        textStyleM14811montserratBoldCustomSpIzzofJo = textStyle;
                                    }
                                    boolean z5 = i26 == 0 ? false : z;
                                    if (i27 == 0) {
                                        i29 = i41;
                                        i28 = R.color.yellow;
                                    } else {
                                        i28 = i7;
                                        i29 = i41;
                                    }
                                    brush2 = brushM11289horizontalGradient8A3gB4$default;
                                    i30 = i43;
                                    i31 = i23;
                                    textStyle2 = textStyleM14811montserratBoldCustomSpIzzofJo;
                                    z2 = z5;
                                    int i44 = i42;
                                    num2 = num4;
                                    i32 = i44;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    if ((i14 & 4) != 0) {
                                        i11 &= -897;
                                    }
                                    if ((i14 & 64) != 0) {
                                        i11 &= -3670017;
                                    }
                                    if ((i14 & 128) != 0) {
                                        i11 &= -29360129;
                                    }
                                    if ((i14 & 4096) != 0) {
                                        i41 &= -897;
                                    }
                                    modifier2 = modifier;
                                    i32 = i;
                                    jColorResource = j;
                                    jColorResource2 = j2;
                                    num2 = num;
                                    i24 = i5;
                                    i25 = i6;
                                    textStyle2 = textStyle;
                                    z2 = z;
                                    i28 = i7;
                                    i31 = i11;
                                    composer2 = composerStartRestartGroup;
                                    i30 = i12;
                                    i29 = i41;
                                    brush2 = brush;
                                }
                                composer2.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(756572306, i31, i29, "com.blackhub.bronline.game.ui.widget.progressbar.StripedHorizontalProgressBarWithIcon (StripedHorizontalProgressBarWithIcon.kt:83)");
                                }
                                composer3 = composer2;
                                composer3.startReplaceableGroup(-1400418923);
                                z3 = (i31 & 57344) != 16384;
                                objRememberedValue = composer3.rememberedValue();
                                if (!z3 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0<Float>() { // from class: com.blackhub.bronline.game.ui.widget.progressbar.StripedHorizontalProgressBarWithIconKt$StripedHorizontalProgressBarWithIcon$currentProgressState$2$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function0
                                        @NotNull
                                        public final Float invoke() {
                                            return Float.valueOf(i3 / i4);
                                        }
                                    });
                                    composer3.updateRememberedValue(objRememberedValue);
                                }
                                composer3.endReplaceableGroup();
                                int i45 = i31;
                                int i46 = i29;
                                final int i47 = i28;
                                final State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(StripedHorizontalProgressBarWithIcon_YTPNW1E$lambda$1((State) objRememberedValue), ProgressIndicatorDefaults.INSTANCE.getProgressAnimationSpec(), 0.0f, AnyExtensionKt.empty(StringCompanionObject.INSTANCE), null, composer3, 0, 20);
                                final float fDimensionResource = PrimitiveResources_androidKt.dimensionResource(R.dimen._7wdp, composer3, 6);
                                int i48 = i45 & 14;
                                composer3.startReplaceableGroup(733328855);
                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer3, 0);
                                composer3.startReplaceableGroup(-1323940314);
                                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier2);
                                if (!(composer3.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (!composer3.getInserting()) {
                                    composer3.createNode(constructor);
                                } else {
                                    composer3.useNode();
                                }
                                composerM10870constructorimpl = Updater.m10870constructorimpl(composer3);
                                Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                if (!composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                composer3.startReplaceableGroup(2058660585);
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                ComposeExtensionKt.IfTrue(Boolean.valueOf(z2), ComposableLambdaKt.composableLambda(composer3, -1232979216, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.progressbar.StripedHorizontalProgressBarWithIconKt$StripedHorizontalProgressBarWithIcon$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num5) {
                                        invoke(composer5, num5.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@Nullable Composer composer5, int i49) {
                                        if ((i49 & 11) != 2 || !composer5.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1232979216, i49, -1, "com.blackhub.bronline.game.ui.widget.progressbar.StripedHorizontalProgressBarWithIcon.<anonymous>.<anonymous> (StripedHorizontalProgressBarWithIcon.kt:102)");
                                            }
                                            RectShadowKt.m15098RectShadowOfrYxbw(ScaleKt.scale(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), 1.02f, 1.1f), ColorResources_androidKt.colorResource(i47, composer5, 0), 0.0f, PrimitiveResources_androidKt.dimensionResource(i30, composer5, 0), 10.0f, invoke$lambda$0(InfiniteTransitionKt.animateFloat(InfiniteTransitionKt.rememberInfiniteTransition(null, composer5, 0, 1), 1.0f, 0.0f, AnimationSpecKt.m7688infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(400, 0, null, 6, null), RepeatMode.Reverse, 0L, 4, null), AnyExtensionKt.empty(StringCompanionObject.INSTANCE), composer5, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 0)), C2046Dp.m13666constructorimpl(0), composer5, 1597446, 4);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer5.skipToGroupEnd();
                                    }

                                    public static final float invoke$lambda$0(State<Float> state) {
                                        return state.getValue().floatValue();
                                    }
                                }), composer3, ((i46 >> 9) & 14) | 48);
                                BorderStroke borderStroke = new BorderStroke(PrimitiveResources_androidKt.dimensionResource(i32, composer3, (i45 >> 3) & 14), brush2, null);
                                RoundedCornerShape roundedCornerShapeM8392RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(i30, composer3, (i45 >> 9) & 14));
                                long jColorResource3 = ColorResources_androidKt.colorResource(R.color.transparent, composer3, 6);
                                final long j5 = jColorResource;
                                Brush brush4 = brush2;
                                final long j6 = jColorResource2;
                                composer4 = composer3;
                                final int i49 = i32;
                                int i50 = i30;
                                final Integer num5 = num2;
                                final TextStyle textStyle4 = textStyle2;
                                final int i51 = i25;
                                final int i52 = i24;
                                SurfaceKt.m9876SurfaceT9BRK9s(modifier2, roundedCornerShapeM8392RoundedCornerShape0680j_4, jColorResource3, 0L, 0.0f, 0.0f, borderStroke, ComposableLambdaKt.composableLambda(composer4, 1441102387, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.progressbar.StripedHorizontalProgressBarWithIconKt$StripedHorizontalProgressBarWithIcon$1$2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num6) {
                                        invoke(composer5, num6.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@Nullable Composer composer5, int i53) {
                                        TextStyle textStyle5;
                                        String str;
                                        boolean z6;
                                        int i54;
                                        boolean z7;
                                        if ((i53 & 11) != 2 || !composer5.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1441102387, i53, -1, "com.blackhub.bronline.game.ui.widget.progressbar.StripedHorizontalProgressBarWithIcon.<anonymous>.<anonymous> (StripedHorizontalProgressBarWithIcon.kt:135)");
                                            }
                                            Modifier.Companion companion2 = Modifier.INSTANCE;
                                            Modifier modifierM7771backgroundbw27NRU$default = BackgroundKt.m7771backgroundbw27NRU$default(SizeKt.wrapContentSize$default(companion2, null, false, 3, null), j5, null, 2, null);
                                            Alignment.Companion companion3 = Alignment.INSTANCE;
                                            Alignment center = companion3.getCenter();
                                            final State<Float> state = stateAnimateFloatAsState;
                                            final long j7 = j6;
                                            final float f = fDimensionResource;
                                            int i55 = i49;
                                            Integer num6 = num5;
                                            String str2 = titleFormat;
                                            TextStyle textStyle6 = textStyle4;
                                            int i56 = i51;
                                            int i57 = i52;
                                            composer5.startReplaceableGroup(733328855);
                                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center, false, composer5, 6);
                                            composer5.startReplaceableGroup(-1323940314);
                                            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                            CompositionLocalMap currentCompositionLocalMap2 = composer5.getCurrentCompositionLocalMap();
                                            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM7771backgroundbw27NRU$default);
                                            if (!(composer5.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer5.startReusableNode();
                                            if (composer5.getInserting()) {
                                                composer5.createNode(constructor2);
                                            } else {
                                                composer5.useNode();
                                            }
                                            Composer composerM10870constructorimpl2 = Updater.m10870constructorimpl(composer5);
                                            Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy2, companion4.getSetMeasurePolicy());
                                            Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                                            if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                            }
                                            function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer5)), composer5, 0);
                                            composer5.startReplaceableGroup(2058660585);
                                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
                                            composer5.startReplaceableGroup(159888999);
                                            boolean zChanged = composer5.changed(state) | composer5.changed(j7) | composer5.changed(f);
                                            Object objRememberedValue2 = composer5.rememberedValue();
                                            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue2 = new Function1<DrawScope, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.progressbar.StripedHorizontalProgressBarWithIconKt$StripedHorizontalProgressBarWithIcon$1$2$1$1$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                                        invoke2(drawScope);
                                                        return Unit.INSTANCE;
                                                    }

                                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                    public final void invoke2(@NotNull DrawScope Canvas) {
                                                        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                                                        DrawScope.m11886drawRoundRectuAw5IA$default(Canvas, j7, 0L, androidx.compose.p003ui.geometry.SizeKt.Size(StripedHorizontalProgressBarWithIconKt.StripedHorizontalProgressBarWithIcon_YTPNW1E$lambda$2(state) * Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc()), Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc())), CornerRadiusKt.CornerRadius$default(f, 0.0f, 2, null), null, 0.0f, null, 0, 242, null);
                                                    }
                                                };
                                                composer5.updateRememberedValue(objRememberedValue2);
                                            }
                                            composer5.endReplaceableGroup();
                                            CanvasKt.Canvas(modifierFillMaxSize$default, (Function1) objRememberedValue2, composer5, 6);
                                            Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(companion2, 0.0f, 1, null);
                                            Alignment.Vertical centerVertically = companion3.getCenterVertically();
                                            composer5.startReplaceableGroup(693286680);
                                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer5, 48);
                                            composer5.startReplaceableGroup(-1323940314);
                                            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                            CompositionLocalMap currentCompositionLocalMap3 = composer5.getCurrentCompositionLocalMap();
                                            Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierFillMaxHeight$default);
                                            if (!(composer5.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer5.startReusableNode();
                                            if (composer5.getInserting()) {
                                                composer5.createNode(constructor3);
                                            } else {
                                                composer5.useNode();
                                            }
                                            Composer composerM10870constructorimpl3 = Updater.m10870constructorimpl(composer5);
                                            Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
                                            Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
                                            if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                                composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                                composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                            }
                                            function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer5)), composer5, 0);
                                            composer5.startReplaceableGroup(2058660585);
                                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                            composer5.startReplaceableGroup(1016978293);
                                            if (num6 == null) {
                                                z7 = 6;
                                                z6 = false;
                                                i54 = i55;
                                                textStyle5 = textStyle6;
                                                str = str2;
                                            } else {
                                                textStyle5 = textStyle6;
                                                str = str2;
                                                z6 = false;
                                                i54 = i55;
                                                z7 = 6;
                                                ImageKt.Image(PainterResources_androidKt.painterResource(num6.intValue(), composer5, 0), (String) null, SizeKt.m8172size3ABfNKs(PaddingKt.m8127paddingqDBjuR0$default(companion2, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(i56, composer5, 0), 0.0f, 11, null), PrimitiveResources_androidKt.dimensionResource(i57, composer5, 0)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer5, 56, 120);
                                            }
                                            composer5.endReplaceableGroup();
                                            TextKt.m10024Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle5, composer5, 0, 0, 65534);
                                            composer5.endReplaceableGroup();
                                            composer5.endNode();
                                            composer5.endReplaceableGroup();
                                            composer5.endReplaceableGroup();
                                            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.bg_progress_inactive, composer5, 6), (String) null, PaddingKt.m8123padding3ABfNKs(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(i54, composer5, 0)), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composer5, 24632, 104);
                                            composer5.endReplaceableGroup();
                                            composer5.endNode();
                                            composer5.endReplaceableGroup();
                                            composer5.endReplaceableGroup();
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer5.skipToGroupEnd();
                                    }
                                }), composer4, i48 | 12582912, 56);
                                composer4.endReplaceableGroup();
                                composer4.endNode();
                                composer4.endReplaceableGroup();
                                composer4.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier3 = modifier2;
                                num3 = num2;
                                textStyle3 = textStyle2;
                                z4 = z2;
                                j3 = jColorResource;
                                j4 = jColorResource2;
                                i33 = i24;
                                i34 = i25;
                                i35 = i47;
                                brush3 = brush4;
                                i36 = i50;
                                i37 = i32;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                modifier3 = modifier;
                                i37 = i;
                                brush3 = brush;
                                j3 = j;
                                j4 = j2;
                                num3 = num;
                                i33 = i5;
                                z4 = z;
                                i36 = i12;
                                i35 = i22;
                                composer4 = composerStartRestartGroup;
                                i34 = i6;
                                textStyle3 = textStyle;
                            }
                            scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.progressbar.StripedHorizontalProgressBarWithIconKt$StripedHorizontalProgressBarWithIcon$2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num6) {
                                        invoke(composer5, num6.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(@Nullable Composer composer5, int i53) {
                                        StripedHorizontalProgressBarWithIconKt.m15103StripedHorizontalProgressBarWithIconYTPNW1E(modifier3, i37, brush3, i36, i3, i4, j3, j4, num3, i33, i34, titleFormat, textStyle3, z4, i35, composer5, RecomposeScopeImplKt.updateChangedFlags(i8 | 1), RecomposeScopeImplKt.updateChangedFlags(i9), i10);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i41 |= CpioConstants.C_ISBLK;
                        i21 = i20;
                        i22 = i7;
                        if ((i11 & 1533916891) == 306783378) {
                            composerStartRestartGroup.startDefaults();
                            if ((i8 & 1) != 0) {
                                if (i38 == 0) {
                                }
                                if (i39 == 0) {
                                }
                                if ((i14 & 4) == 0) {
                                }
                                if (i40 == 0) {
                                }
                                if ((i14 & 64) == 0) {
                                }
                                if ((i14 & 128) == 0) {
                                }
                                if (i15 == 0) {
                                }
                                if (i16 == 0) {
                                }
                                if (i17 == 0) {
                                }
                                if ((i14 & 4096) == 0) {
                                }
                                if (i26 == 0) {
                                }
                                if (i27 == 0) {
                                }
                                brush2 = brushM11289horizontalGradient8A3gB4$default;
                                i30 = i43;
                                i31 = i23;
                                textStyle2 = textStyleM14811montserratBoldCustomSpIzzofJo;
                                z2 = z5;
                                int i442 = i42;
                                num2 = num4;
                                i32 = i442;
                                composer2.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                composer3 = composer2;
                                composer3.startReplaceableGroup(-1400418923);
                                if ((i31 & 57344) != 16384) {
                                }
                                objRememberedValue = composer3.rememberedValue();
                                if (!z3) {
                                    objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0<Float>() { // from class: com.blackhub.bronline.game.ui.widget.progressbar.StripedHorizontalProgressBarWithIconKt$StripedHorizontalProgressBarWithIcon$currentProgressState$2$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function0
                                        @NotNull
                                        public final Float invoke() {
                                            return Float.valueOf(i3 / i4);
                                        }
                                    });
                                    composer3.updateRememberedValue(objRememberedValue);
                                    composer3.endReplaceableGroup();
                                    int i452 = i31;
                                    int i462 = i29;
                                    final int i472 = i28;
                                    final State<Float> stateAnimateFloatAsState2 = AnimateAsStateKt.animateFloatAsState(StripedHorizontalProgressBarWithIcon_YTPNW1E$lambda$1((State) objRememberedValue), ProgressIndicatorDefaults.INSTANCE.getProgressAnimationSpec(), 0.0f, AnyExtensionKt.empty(StringCompanionObject.INSTANCE), null, composer3, 0, 20);
                                    final float fDimensionResource2 = PrimitiveResources_androidKt.dimensionResource(R.dimen._7wdp, composer3, 6);
                                    int i482 = i452 & 14;
                                    composer3.startReplaceableGroup(733328855);
                                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer3, 0);
                                    composer3.startReplaceableGroup(-1323940314);
                                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifier2);
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                    }
                                    composer3.startReusableNode();
                                    if (!composer3.getInserting()) {
                                    }
                                    composerM10870constructorimpl = Updater.m10870constructorimpl(composer3);
                                    Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                                    Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                                    setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                    if (!composerM10870constructorimpl.getInserting()) {
                                        composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                        composer3.startReplaceableGroup(2058660585);
                                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                        ComposeExtensionKt.IfTrue(Boolean.valueOf(z2), ComposableLambdaKt.composableLambda(composer3, -1232979216, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.progressbar.StripedHorizontalProgressBarWithIconKt$StripedHorizontalProgressBarWithIcon$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num52) {
                                                invoke(composer5, num52.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                            @Composable
                                            public final void invoke(@Nullable Composer composer5, int i492) {
                                                if ((i492 & 11) != 2 || !composer5.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-1232979216, i492, -1, "com.blackhub.bronline.game.ui.widget.progressbar.StripedHorizontalProgressBarWithIcon.<anonymous>.<anonymous> (StripedHorizontalProgressBarWithIcon.kt:102)");
                                                    }
                                                    RectShadowKt.m15098RectShadowOfrYxbw(ScaleKt.scale(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), 1.02f, 1.1f), ColorResources_androidKt.colorResource(i472, composer5, 0), 0.0f, PrimitiveResources_androidKt.dimensionResource(i30, composer5, 0), 10.0f, invoke$lambda$0(InfiniteTransitionKt.animateFloat(InfiniteTransitionKt.rememberInfiniteTransition(null, composer5, 0, 1), 1.0f, 0.0f, AnimationSpecKt.m7688infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(400, 0, null, 6, null), RepeatMode.Reverse, 0L, 4, null), AnyExtensionKt.empty(StringCompanionObject.INSTANCE), composer5, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 0)), C2046Dp.m13666constructorimpl(0), composer5, 1597446, 4);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer5.skipToGroupEnd();
                                            }

                                            public static final float invoke$lambda$0(State<Float> state) {
                                                return state.getValue().floatValue();
                                            }
                                        }), composer3, ((i462 >> 9) & 14) | 48);
                                        BorderStroke borderStroke2 = new BorderStroke(PrimitiveResources_androidKt.dimensionResource(i32, composer3, (i452 >> 3) & 14), brush2, null);
                                        RoundedCornerShape roundedCornerShapeM8392RoundedCornerShape0680j_42 = RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(i30, composer3, (i452 >> 9) & 14));
                                        long jColorResource32 = ColorResources_androidKt.colorResource(R.color.transparent, composer3, 6);
                                        final long j52 = jColorResource;
                                        Brush brush42 = brush2;
                                        final long j62 = jColorResource2;
                                        composer4 = composer3;
                                        final int i492 = i32;
                                        int i502 = i30;
                                        final Integer num52 = num2;
                                        final TextStyle textStyle42 = textStyle2;
                                        final int i512 = i25;
                                        final int i522 = i24;
                                        SurfaceKt.m9876SurfaceT9BRK9s(modifier2, roundedCornerShapeM8392RoundedCornerShape0680j_42, jColorResource32, 0L, 0.0f, 0.0f, borderStroke2, ComposableLambdaKt.composableLambda(composer4, 1441102387, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.progressbar.StripedHorizontalProgressBarWithIconKt$StripedHorizontalProgressBarWithIcon$1$2
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num6) {
                                                invoke(composer5, num6.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                            @Composable
                                            public final void invoke(@Nullable Composer composer5, int i53) {
                                                TextStyle textStyle5;
                                                String str;
                                                boolean z6;
                                                int i54;
                                                boolean z7;
                                                if ((i53 & 11) != 2 || !composer5.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(1441102387, i53, -1, "com.blackhub.bronline.game.ui.widget.progressbar.StripedHorizontalProgressBarWithIcon.<anonymous>.<anonymous> (StripedHorizontalProgressBarWithIcon.kt:135)");
                                                    }
                                                    Modifier.Companion companion22 = Modifier.INSTANCE;
                                                    Modifier modifierM7771backgroundbw27NRU$default = BackgroundKt.m7771backgroundbw27NRU$default(SizeKt.wrapContentSize$default(companion22, null, false, 3, null), j52, null, 2, null);
                                                    Alignment.Companion companion3 = Alignment.INSTANCE;
                                                    Alignment center = companion3.getCenter();
                                                    final State<Float> state = stateAnimateFloatAsState2;
                                                    final long j7 = j62;
                                                    final float f = fDimensionResource2;
                                                    int i55 = i492;
                                                    Integer num6 = num52;
                                                    String str2 = titleFormat;
                                                    TextStyle textStyle6 = textStyle42;
                                                    int i56 = i512;
                                                    int i57 = i522;
                                                    composer5.startReplaceableGroup(733328855);
                                                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy22 = BoxKt.rememberBoxMeasurePolicy(center, false, composer5, 6);
                                                    composer5.startReplaceableGroup(-1323940314);
                                                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                                    CompositionLocalMap currentCompositionLocalMap22 = composer5.getCurrentCompositionLocalMap();
                                                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                                    Function0<ComposeUiNode> constructor22 = companion4.getConstructor();
                                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf22 = LayoutKt.modifierMaterializerOf(modifierM7771backgroundbw27NRU$default);
                                                    if (!(composer5.getApplier() instanceof Applier)) {
                                                        ComposablesKt.invalidApplier();
                                                    }
                                                    composer5.startReusableNode();
                                                    if (composer5.getInserting()) {
                                                        composer5.createNode(constructor22);
                                                    } else {
                                                        composer5.useNode();
                                                    }
                                                    Composer composerM10870constructorimpl2 = Updater.m10870constructorimpl(composer5);
                                                    Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy22, companion4.getSetMeasurePolicy());
                                                    Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap22, companion4.getSetResolvedCompositionLocals());
                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                                                    if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                        composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                        composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                                    }
                                                    function3ModifierMaterializerOf22.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer5)), composer5, 0);
                                                    composer5.startReplaceableGroup(2058660585);
                                                    BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                                                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion22, 0.0f, 1, null);
                                                    composer5.startReplaceableGroup(159888999);
                                                    boolean zChanged = composer5.changed(state) | composer5.changed(j7) | composer5.changed(f);
                                                    Object objRememberedValue2 = composer5.rememberedValue();
                                                    if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                        objRememberedValue2 = new Function1<DrawScope, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.progressbar.StripedHorizontalProgressBarWithIconKt$StripedHorizontalProgressBarWithIcon$1$2$1$1$1
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            {
                                                                super(1);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function1
                                                            public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                                                invoke2(drawScope);
                                                                return Unit.INSTANCE;
                                                            }

                                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                            public final void invoke2(@NotNull DrawScope Canvas) {
                                                                Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                                                                DrawScope.m11886drawRoundRectuAw5IA$default(Canvas, j7, 0L, androidx.compose.p003ui.geometry.SizeKt.Size(StripedHorizontalProgressBarWithIconKt.StripedHorizontalProgressBarWithIcon_YTPNW1E$lambda$2(state) * Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc()), Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc())), CornerRadiusKt.CornerRadius$default(f, 0.0f, 2, null), null, 0.0f, null, 0, 242, null);
                                                            }
                                                        };
                                                        composer5.updateRememberedValue(objRememberedValue2);
                                                    }
                                                    composer5.endReplaceableGroup();
                                                    CanvasKt.Canvas(modifierFillMaxSize$default, (Function1) objRememberedValue2, composer5, 6);
                                                    Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(companion22, 0.0f, 1, null);
                                                    Alignment.Vertical centerVertically = companion3.getCenterVertically();
                                                    composer5.startReplaceableGroup(693286680);
                                                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer5, 48);
                                                    composer5.startReplaceableGroup(-1323940314);
                                                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                                    CompositionLocalMap currentCompositionLocalMap3 = composer5.getCurrentCompositionLocalMap();
                                                    Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierFillMaxHeight$default);
                                                    if (!(composer5.getApplier() instanceof Applier)) {
                                                        ComposablesKt.invalidApplier();
                                                    }
                                                    composer5.startReusableNode();
                                                    if (composer5.getInserting()) {
                                                        composer5.createNode(constructor3);
                                                    } else {
                                                        composer5.useNode();
                                                    }
                                                    Composer composerM10870constructorimpl3 = Updater.m10870constructorimpl(composer5);
                                                    Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
                                                    Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
                                                    if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                                        composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                                        composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                                    }
                                                    function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer5)), composer5, 0);
                                                    composer5.startReplaceableGroup(2058660585);
                                                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                                    composer5.startReplaceableGroup(1016978293);
                                                    if (num6 == null) {
                                                        z7 = 6;
                                                        z6 = false;
                                                        i54 = i55;
                                                        textStyle5 = textStyle6;
                                                        str = str2;
                                                    } else {
                                                        textStyle5 = textStyle6;
                                                        str = str2;
                                                        z6 = false;
                                                        i54 = i55;
                                                        z7 = 6;
                                                        ImageKt.Image(PainterResources_androidKt.painterResource(num6.intValue(), composer5, 0), (String) null, SizeKt.m8172size3ABfNKs(PaddingKt.m8127paddingqDBjuR0$default(companion22, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(i56, composer5, 0), 0.0f, 11, null), PrimitiveResources_androidKt.dimensionResource(i57, composer5, 0)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer5, 56, 120);
                                                    }
                                                    composer5.endReplaceableGroup();
                                                    TextKt.m10024Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle5, composer5, 0, 0, 65534);
                                                    composer5.endReplaceableGroup();
                                                    composer5.endNode();
                                                    composer5.endReplaceableGroup();
                                                    composer5.endReplaceableGroup();
                                                    ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.bg_progress_inactive, composer5, 6), (String) null, PaddingKt.m8123padding3ABfNKs(SizeKt.fillMaxSize$default(companion22, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(i54, composer5, 0)), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composer5, 24632, 104);
                                                    composer5.endReplaceableGroup();
                                                    composer5.endNode();
                                                    composer5.endReplaceableGroup();
                                                    composer5.endReplaceableGroup();
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer5.skipToGroupEnd();
                                            }
                                        }), composer4, i482 | 12582912, 56);
                                        composer4.endReplaceableGroup();
                                        composer4.endNode();
                                        composer4.endReplaceableGroup();
                                        composer4.endReplaceableGroup();
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        modifier3 = modifier2;
                                        num3 = num2;
                                        textStyle3 = textStyle2;
                                        z4 = z2;
                                        j3 = jColorResource;
                                        j4 = jColorResource2;
                                        i33 = i24;
                                        i34 = i25;
                                        i35 = i472;
                                        brush3 = brush42;
                                        i36 = i502;
                                        i37 = i32;
                                    }
                                }
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    i20 = i14 & 16384;
                    if (i20 == 0) {
                    }
                    i21 = i20;
                    i22 = i7;
                    if ((i11 & 1533916891) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                i17 = i14 & 1024;
                if (i17 == 0) {
                }
                if ((i14 & 2048) == 0) {
                }
                if ((i9 & 896) == 0) {
                }
                int i412 = i18;
                i19 = i14 & 8192;
                if (i19 == 0) {
                }
                i20 = i14 & 16384;
                if (i20 == 0) {
                }
                i21 = i20;
                i22 = i7;
                if ((i11 & 1533916891) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            i11 |= i13;
            if ((i8 & 3670016) == 0) {
            }
            if ((i8 & 29360128) == 0) {
            }
            i15 = i14 & 256;
            if (i15 != 0) {
            }
            i16 = i14 & 512;
            if (i16 != 0) {
            }
            i17 = i14 & 1024;
            if (i17 == 0) {
            }
            if ((i14 & 2048) == 0) {
            }
            if ((i9 & 896) == 0) {
            }
            int i4122 = i18;
            i19 = i14 & 8192;
            if (i19 == 0) {
            }
            i20 = i14 & 16384;
            if (i20 == 0) {
            }
            i21 = i20;
            i22 = i7;
            if ((i11 & 1533916891) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        i12 = i2;
        if ((i10 & 16) == 0) {
        }
        if ((i10 & 32) == 0) {
        }
        i11 |= i13;
        if ((i8 & 3670016) == 0) {
        }
        if ((i8 & 29360128) == 0) {
        }
        i15 = i14 & 256;
        if (i15 != 0) {
        }
        i16 = i14 & 512;
        if (i16 != 0) {
        }
        i17 = i14 & 1024;
        if (i17 == 0) {
        }
        if ((i14 & 2048) == 0) {
        }
        if ((i9 & 896) == 0) {
        }
        int i41222 = i18;
        i19 = i14 & 8192;
        if (i19 == 0) {
        }
        i20 = i14 & 16384;
        if (i20 == 0) {
        }
        i21 = i20;
        i22 = i7;
        if ((i11 & 1533916891) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview
    public static final void StripedHorizontalProgressBarWithIconPreview(@Nullable Composer composer, final int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(728852214);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(728852214, i, -1, "com.blackhub.bronline.game.ui.widget.progressbar.StripedHorizontalProgressBarWithIconPreview (StripedHorizontalProgressBarWithIcon.kt:188)");
            }
            composer2 = composerStartRestartGroup;
            m15103StripedHorizontalProgressBarWithIconYTPNW1E(SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(Modifier.INSTANCE, PrimitiveResources_androidKt.dimensionResource(R.dimen._148wdp, composerStartRestartGroup, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._16wdp, composerStartRestartGroup, 6)), 0, null, 0, 60, 100, ColorResources_androidKt.colorResource(R.color.total_black_70, composerStartRestartGroup, 6), ColorResources_androidKt.colorResource(R.color.dark_red, composerStartRestartGroup, 6), Integer.valueOf(R.drawable.ic_craft), 0, 0, StringResources_androidKt.stringResource(R.string.common_value_with_level, new Object[]{40}, composerStartRestartGroup, 70), null, true, 0, composer2, 100884480, 3072, 22030);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.progressbar.StripedHorizontalProgressBarWithIconKt.StripedHorizontalProgressBarWithIconPreview.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer3, int i2) {
                    StripedHorizontalProgressBarWithIconKt.StripedHorizontalProgressBarWithIconPreview(composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final float StripedHorizontalProgressBarWithIcon_YTPNW1E$lambda$1(State<Float> state) {
        return state.getValue().floatValue();
    }

    public static final float StripedHorizontalProgressBarWithIcon_YTPNW1E$lambda$2(State<Float> state) {
        return state.getValue().floatValue();
    }
}

