package androidx.compose.material;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.CornerSizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.ClipKt;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.Shape;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.semantics.Role;
import androidx.compose.p003ui.semantics.SemanticsModifierKt;
import androidx.compose.p003ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p003ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.material.chip.Chip;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Chip.kt */
@Metadata(m7104d1 = {"\u0000f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u001a\u008e\u0001\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r¢\u0006\u0002\b\u001b2\u001c\u0010\u001c\u001a\u0018\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u000b0\u001d¢\u0006\u0002\b\u001b¢\u0006\u0002\b\u001fH\u0007¢\u0006\u0002\u0010 \u001aÄ\u0001\u0010!\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u00112\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0018\u001a\u00020#2\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r¢\u0006\u0002\b\u001b2\u0015\b\u0002\u0010$\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r¢\u0006\u0002\b\u001b2\u0015\b\u0002\u0010%\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r¢\u0006\u0002\b\u001b2\u001c\u0010\u001c\u001a\u0018\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u000b0\u001d¢\u0006\u0002\b\u001b¢\u0006\u0002\b\u001fH\u0007¢\u0006\u0002\u0010&\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0005\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u0010\u0010\t\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002¨\u0006'²\u0006\n\u0010(\u001a\u00020)X\u008a\u0084\u0002²\u0006\n\u0010*\u001a\u00020)X\u008a\u0084\u0002"}, m7105d2 = {"HorizontalPadding", "Landroidx/compose/ui/unit/Dp;", "F", "LeadingIconEndSpacing", "LeadingIconStartSpacing", "SelectedIconContainerSize", "SelectedOverlayOpacity", "", "SurfaceOverlayOpacity", "TrailingIconSpacing", Chip.TAG, "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "shape", "Landroidx/compose/ui/graphics/Shape;", OutlinedTextFieldKt.BorderId, "Landroidx/compose/foundation/BorderStroke;", "colors", "Landroidx/compose/material/ChipColors;", "leadingIcon", "Landroidx/compose/runtime/Composable;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/material/ChipColors;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "FilterChip", "selected", "Landroidx/compose/material/SelectableChipColors;", "selectedIcon", "trailingIcon", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/material/SelectableChipColors;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "material_release", "contentColor", "Landroidx/compose/ui/graphics/Color;", "leadingIconContentColor"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nChip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Chip.kt\nandroidx/compose/material/ChipKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,761:1\n25#2:762\n25#2:769\n1116#3,6:763\n1116#3,6:770\n81#4:776\n154#5:777\n154#5:778\n154#5:779\n154#5:780\n154#5:781\n*S KotlinDebug\n*F\n+ 1 Chip.kt\nandroidx/compose/material/ChipKt\n*L\n93#1:762\n190#1:769\n93#1:763,6\n190#1:770,6\n100#1:776\n730#1:777\n735#1:778\n740#1:779\n745#1:780\n760#1:781\n*E\n"})
/* loaded from: classes.dex */
public final class ChipKt {
    private static final float LeadingIconEndSpacing;
    private static final float SelectedOverlayOpacity = 0.16f;
    private static final float SurfaceOverlayOpacity = 0.12f;
    private static final float TrailingIconSpacing;
    private static final float HorizontalPadding = C2046Dp.m13666constructorimpl(12);
    private static final float LeadingIconStartSpacing = C2046Dp.m13666constructorimpl(4);
    private static final float SelectedIconContainerSize = C2046Dp.m13666constructorimpl(24);

    /* JADX WARN: Removed duplicated region for block: B:102:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:156:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0100  */
    @Composable
    @ExperimentalMaterialApi
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Chip(@NotNull final Function0<Unit> function0, @Nullable Modifier modifier, boolean z, @Nullable MutableInteractionSource mutableInteractionSource, @Nullable Shape shape, @Nullable BorderStroke borderStroke, @Nullable ChipColors chipColors, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, @NotNull final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        boolean z2;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        Shape shape2;
        int i6;
        BorderStroke borderStroke2;
        int i7;
        Function2<? super Composer, ? super Integer, Unit> function22;
        final Modifier modifier2;
        final MutableInteractionSource mutableInteractionSource3;
        Shape shapeCopy;
        BorderStroke borderStroke3;
        Function2<? super Composer, ? super Integer, Unit> function23;
        ChipColors chipColorsM8829chipColors5tl4gsc;
        int i8;
        ChipColors chipColors2;
        Function2<? super Composer, ? super Integer, Unit> function24;
        final Shape shape3;
        final BorderStroke borderStroke4;
        final Function2<? super Composer, ? super Integer, Unit> function25;
        final boolean z3;
        final ChipColors chipColors3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-368396408);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else {
            if ((i & 112) == 0) {
                i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 896) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 7168) == 0) {
                        mutableInteractionSource2 = mutableInteractionSource;
                        i3 |= composerStartRestartGroup.changed(mutableInteractionSource2) ? 2048 : 1024;
                    }
                    if ((57344 & i) != 0) {
                        if ((i2 & 16) == 0) {
                            shape2 = shape;
                            int i10 = composerStartRestartGroup.changed(shape2) ? 16384 : 8192;
                            i3 |= i10;
                        } else {
                            shape2 = shape;
                        }
                        i3 |= i10;
                    } else {
                        shape2 = shape;
                    }
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                    } else {
                        if ((458752 & i) == 0) {
                            borderStroke2 = borderStroke;
                            i3 |= composerStartRestartGroup.changed(borderStroke2) ? 131072 : 65536;
                        }
                        if ((i & 3670016) == 0) {
                            i3 |= ((i2 & 64) == 0 && composerStartRestartGroup.changed(chipColors)) ? 1048576 : 524288;
                        }
                        i7 = i2 & 128;
                        if (i7 != 0) {
                            i3 |= 12582912;
                            function22 = function2;
                        } else {
                            function22 = function2;
                            if ((i & 29360128) == 0) {
                                i3 |= composerStartRestartGroup.changedInstance(function22) ? 8388608 : 4194304;
                            }
                        }
                        if ((i2 & 256) == 0) {
                            if ((i & 234881024) == 0) {
                                i3 |= composerStartRestartGroup.changedInstance(function3) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                            }
                            if ((i3 & 191739611) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.startDefaults();
                                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                    modifier2 = i9 == 0 ? Modifier.INSTANCE : modifier;
                                    if (i4 != 0) {
                                        z2 = true;
                                    }
                                    if (i5 == 0) {
                                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                        }
                                        composerStartRestartGroup.endReplaceableGroup();
                                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                                    } else {
                                        mutableInteractionSource3 = mutableInteractionSource2;
                                    }
                                    if ((i2 & 16) == 0) {
                                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                                        i3 &= -57345;
                                    } else {
                                        shapeCopy = shape2;
                                    }
                                    borderStroke3 = i6 == 0 ? null : borderStroke2;
                                    if ((i2 & 64) == 0) {
                                        function23 = null;
                                        chipColorsM8829chipColors5tl4gsc = ChipDefaults.INSTANCE.m8829chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                                        i3 &= -3670017;
                                    } else {
                                        function23 = null;
                                        chipColorsM8829chipColors5tl4gsc = chipColors;
                                    }
                                    i8 = i3;
                                    if (i7 == 0) {
                                        function24 = function23;
                                        chipColors2 = chipColorsM8829chipColors5tl4gsc;
                                        composerStartRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-368396408, i8, -1, "androidx.compose.material.Chip (Chip.kt:98)");
                                        }
                                        int i11 = ((i8 >> 6) & 14) | ((i8 >> 15) & 112);
                                        final State<Color> stateContentColor = chipColors2.contentColor(z2, composerStartRestartGroup, i11);
                                        final Function2<? super Composer, ? super Integer, Unit> function26 = function24;
                                        final ChipColors chipColors4 = chipColors2;
                                        final boolean z4 = z2;
                                        SurfaceKt.m9026SurfaceLPr_se0(function0, SemanticsModifierKt.semantics$default(modifier2, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ChipKt.Chip.2
                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                invoke2(semanticsPropertyReceiver);
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                SemanticsPropertiesKt.m13009setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m12993getButtono7Vup1c());
                                            }
                                        }, 1, function23), z2, shapeCopy, chipColors2.backgroundColor(z2, composerStartRestartGroup, i11).getValue().m11350unboximpl(), Color.m11339copywmQWz5c$default(Chip$lambda$1(stateContentColor), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke3, 0.0f, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 139076687, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt.Chip.3
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
                                            public final void invoke(@Nullable Composer composer2, int i12) {
                                                if ((i12 & 11) != 2 || !composer2.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(139076687, i12, -1, "androidx.compose.material.Chip.<anonymous> (Chip.kt:110)");
                                                    }
                                                    ProvidedValue<Float> providedValueProvides = ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m11342getAlphaimpl(ChipKt.Chip$lambda$1(stateContentColor))));
                                                    final Function2<Composer, Integer, Unit> function27 = function26;
                                                    final ChipColors chipColors5 = chipColors4;
                                                    final boolean z5 = z4;
                                                    final Function3<RowScope, Composer, Integer, Unit> function32 = function3;
                                                    CompositionLocalKt.CompositionLocalProvider(providedValueProvides, ComposableLambdaKt.composableLambda(composer2, 667535631, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt.Chip.3.1
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

                                                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                                        @Composable
                                                        public final void invoke(@Nullable Composer composer3, int i13) {
                                                            if ((i13 & 11) != 2 || !composer3.getSkipping()) {
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventStart(667535631, i13, -1, "androidx.compose.material.Chip.<anonymous>.<anonymous> (Chip.kt:111)");
                                                                }
                                                                TextStyle body2 = MaterialTheme.INSTANCE.getTypography(composer3, 6).getBody2();
                                                                final Function2<Composer, Integer, Unit> function28 = function27;
                                                                final ChipColors chipColors6 = chipColors5;
                                                                final boolean z6 = z5;
                                                                final Function3<RowScope, Composer, Integer, Unit> function33 = function32;
                                                                TextKt.ProvideTextStyle(body2, ComposableLambdaKt.composableLambda(composer3, -1131213696, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt.Chip.3.1.1
                                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                    /* JADX WARN: Multi-variable type inference failed */
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
                                                                    public final void invoke(@Nullable Composer composer4, int i14) {
                                                                        float fM13666constructorimpl;
                                                                        if ((i14 & 11) != 2 || !composer4.getSkipping()) {
                                                                            if (ComposerKt.isTraceInProgress()) {
                                                                                ComposerKt.traceEventStart(-1131213696, i14, -1, "androidx.compose.material.Chip.<anonymous>.<anonymous>.<anonymous> (Chip.kt:114)");
                                                                            }
                                                                            Modifier.Companion companion = Modifier.INSTANCE;
                                                                            Modifier modifierM8157defaultMinSizeVpY3zN4$default = SizeKt.m8157defaultMinSizeVpY3zN4$default(companion, 0.0f, ChipDefaults.INSTANCE.m8832getMinHeightD9Ej5fM(), 1, null);
                                                                            if (function28 == null) {
                                                                                fM13666constructorimpl = ChipKt.HorizontalPadding;
                                                                            } else {
                                                                                fM13666constructorimpl = C2046Dp.m13666constructorimpl(0);
                                                                            }
                                                                            Modifier modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(modifierM8157defaultMinSizeVpY3zN4$default, fM13666constructorimpl, 0.0f, ChipKt.HorizontalPadding, 0.0f, 10, null);
                                                                            Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                                                                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                                                            Function2<Composer, Integer, Unit> function29 = function28;
                                                                            ChipColors chipColors7 = chipColors6;
                                                                            boolean z7 = z6;
                                                                            Function3<RowScope, Composer, Integer, Unit> function34 = function33;
                                                                            composer4.startReplaceableGroup(693286680);
                                                                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer4, 54);
                                                                            composer4.startReplaceableGroup(-1323940314);
                                                                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                                                            CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                                                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                                                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default);
                                                                            if (!(composer4.getApplier() instanceof Applier)) {
                                                                                ComposablesKt.invalidApplier();
                                                                            }
                                                                            composer4.startReusableNode();
                                                                            if (composer4.getInserting()) {
                                                                                composer4.createNode(constructor);
                                                                            } else {
                                                                                composer4.useNode();
                                                                            }
                                                                            Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer4);
                                                                            Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                                                                            Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                                                            if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                                                composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                                                composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                                            }
                                                                            function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer4)), composer4, 0);
                                                                            composer4.startReplaceableGroup(2058660585);
                                                                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                                                            composer4.startReplaceableGroup(2084788993);
                                                                            if (function29 != null) {
                                                                                SpacerKt.Spacer(SizeKt.m8177width3ABfNKs(companion, ChipKt.LeadingIconStartSpacing), composer4, 6);
                                                                                State<Color> stateLeadingIconContentColor = chipColors7.leadingIconContentColor(z7, composer4, 0);
                                                                                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m11330boximpl(invoke$lambda$1$lambda$0(stateLeadingIconContentColor))), ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m11342getAlphaimpl(invoke$lambda$1$lambda$0(stateLeadingIconContentColor))))}, function29, composer4, 8);
                                                                                SpacerKt.Spacer(SizeKt.m8177width3ABfNKs(companion, ChipKt.LeadingIconEndSpacing), composer4, 6);
                                                                            }
                                                                            composer4.endReplaceableGroup();
                                                                            function34.invoke(rowScopeInstance, composer4, 6);
                                                                            composer4.endReplaceableGroup();
                                                                            composer4.endNode();
                                                                            composer4.endReplaceableGroup();
                                                                            composer4.endReplaceableGroup();
                                                                            if (ComposerKt.isTraceInProgress()) {
                                                                                ComposerKt.traceEventEnd();
                                                                                return;
                                                                            }
                                                                            return;
                                                                        }
                                                                        composer4.skipToGroupEnd();
                                                                    }

                                                                    public static final long invoke$lambda$1$lambda$0(State<Color> state) {
                                                                        return state.getValue().m11350unboximpl();
                                                                    }
                                                                }), composer3, 48);
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventEnd();
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            composer3.skipToGroupEnd();
                                                        }
                                                    }), composer2, ProvidedValue.$stable | 48);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer2.skipToGroupEnd();
                                            }
                                        }), composerStartRestartGroup, (i8 & 14) | 805306368 | (i8 & 896) | ((i8 >> 3) & 7168) | ((i8 << 3) & 3670016) | ((i8 << 15) & 234881024), 128);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        shape3 = shapeCopy;
                                        borderStroke4 = borderStroke3;
                                        function25 = function24;
                                        z3 = z2;
                                        chipColors3 = chipColors2;
                                    } else {
                                        chipColors2 = chipColorsM8829chipColors5tl4gsc;
                                    }
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    if ((i2 & 16) != 0) {
                                        i3 &= -57345;
                                    }
                                    if ((i2 & 64) != 0) {
                                        i3 &= -3670017;
                                    }
                                    modifier2 = modifier;
                                    chipColors2 = chipColors;
                                    i8 = i3;
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                    shapeCopy = shape2;
                                    borderStroke3 = borderStroke2;
                                    function23 = null;
                                }
                                function24 = function2;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                int i112 = ((i8 >> 6) & 14) | ((i8 >> 15) & 112);
                                final State<Color> stateContentColor2 = chipColors2.contentColor(z2, composerStartRestartGroup, i112);
                                final Function2<? super Composer, ? super Integer, Unit> function262 = function24;
                                final ChipColors chipColors42 = chipColors2;
                                final boolean z42 = z2;
                                SurfaceKt.m9026SurfaceLPr_se0(function0, SemanticsModifierKt.semantics$default(modifier2, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ChipKt.Chip.2
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        invoke2(semanticsPropertyReceiver);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        SemanticsPropertiesKt.m13009setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m12993getButtono7Vup1c());
                                    }
                                }, 1, function23), z2, shapeCopy, chipColors2.backgroundColor(z2, composerStartRestartGroup, i112).getValue().m11350unboximpl(), Color.m11339copywmQWz5c$default(Chip$lambda$1(stateContentColor2), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke3, 0.0f, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 139076687, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt.Chip.3
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
                                    public final void invoke(@Nullable Composer composer2, int i12) {
                                        if ((i12 & 11) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(139076687, i12, -1, "androidx.compose.material.Chip.<anonymous> (Chip.kt:110)");
                                            }
                                            ProvidedValue<Float> providedValueProvides = ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m11342getAlphaimpl(ChipKt.Chip$lambda$1(stateContentColor2))));
                                            final Function2<? super Composer, ? super Integer, Unit> function27 = function262;
                                            final ChipColors chipColors5 = chipColors42;
                                            final boolean z5 = z42;
                                            final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32 = function3;
                                            CompositionLocalKt.CompositionLocalProvider(providedValueProvides, ComposableLambdaKt.composableLambda(composer2, 667535631, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt.Chip.3.1
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

                                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                                @Composable
                                                public final void invoke(@Nullable Composer composer3, int i13) {
                                                    if ((i13 & 11) != 2 || !composer3.getSkipping()) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(667535631, i13, -1, "androidx.compose.material.Chip.<anonymous>.<anonymous> (Chip.kt:111)");
                                                        }
                                                        TextStyle body2 = MaterialTheme.INSTANCE.getTypography(composer3, 6).getBody2();
                                                        final Function2<? super Composer, ? super Integer, Unit> function28 = function27;
                                                        final ChipColors chipColors6 = chipColors5;
                                                        final boolean z6 = z5;
                                                        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function33 = function32;
                                                        TextKt.ProvideTextStyle(body2, ComposableLambdaKt.composableLambda(composer3, -1131213696, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt.Chip.3.1.1
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            /* JADX WARN: Multi-variable type inference failed */
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
                                                            public final void invoke(@Nullable Composer composer4, int i14) {
                                                                float fM13666constructorimpl;
                                                                if ((i14 & 11) != 2 || !composer4.getSkipping()) {
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                        ComposerKt.traceEventStart(-1131213696, i14, -1, "androidx.compose.material.Chip.<anonymous>.<anonymous>.<anonymous> (Chip.kt:114)");
                                                                    }
                                                                    Modifier.Companion companion = Modifier.INSTANCE;
                                                                    Modifier modifierM8157defaultMinSizeVpY3zN4$default = SizeKt.m8157defaultMinSizeVpY3zN4$default(companion, 0.0f, ChipDefaults.INSTANCE.m8832getMinHeightD9Ej5fM(), 1, null);
                                                                    if (function28 == null) {
                                                                        fM13666constructorimpl = ChipKt.HorizontalPadding;
                                                                    } else {
                                                                        fM13666constructorimpl = C2046Dp.m13666constructorimpl(0);
                                                                    }
                                                                    Modifier modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(modifierM8157defaultMinSizeVpY3zN4$default, fM13666constructorimpl, 0.0f, ChipKt.HorizontalPadding, 0.0f, 10, null);
                                                                    Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                                                                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                                                    Function2<Composer, Integer, Unit> function29 = function28;
                                                                    ChipColors chipColors7 = chipColors6;
                                                                    boolean z7 = z6;
                                                                    Function3<RowScope, Composer, Integer, Unit> function34 = function33;
                                                                    composer4.startReplaceableGroup(693286680);
                                                                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer4, 54);
                                                                    composer4.startReplaceableGroup(-1323940314);
                                                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                                                    CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                                                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                                                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default);
                                                                    if (!(composer4.getApplier() instanceof Applier)) {
                                                                        ComposablesKt.invalidApplier();
                                                                    }
                                                                    composer4.startReusableNode();
                                                                    if (composer4.getInserting()) {
                                                                        composer4.createNode(constructor);
                                                                    } else {
                                                                        composer4.useNode();
                                                                    }
                                                                    Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer4);
                                                                    Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                                                                    Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                                                    if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                                        composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                                        composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                                    }
                                                                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer4)), composer4, 0);
                                                                    composer4.startReplaceableGroup(2058660585);
                                                                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                                                    composer4.startReplaceableGroup(2084788993);
                                                                    if (function29 != null) {
                                                                        SpacerKt.Spacer(SizeKt.m8177width3ABfNKs(companion, ChipKt.LeadingIconStartSpacing), composer4, 6);
                                                                        State<Color> stateLeadingIconContentColor = chipColors7.leadingIconContentColor(z7, composer4, 0);
                                                                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m11330boximpl(invoke$lambda$1$lambda$0(stateLeadingIconContentColor))), ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m11342getAlphaimpl(invoke$lambda$1$lambda$0(stateLeadingIconContentColor))))}, function29, composer4, 8);
                                                                        SpacerKt.Spacer(SizeKt.m8177width3ABfNKs(companion, ChipKt.LeadingIconEndSpacing), composer4, 6);
                                                                    }
                                                                    composer4.endReplaceableGroup();
                                                                    function34.invoke(rowScopeInstance, composer4, 6);
                                                                    composer4.endReplaceableGroup();
                                                                    composer4.endNode();
                                                                    composer4.endReplaceableGroup();
                                                                    composer4.endReplaceableGroup();
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                        ComposerKt.traceEventEnd();
                                                                        return;
                                                                    }
                                                                    return;
                                                                }
                                                                composer4.skipToGroupEnd();
                                                            }

                                                            public static final long invoke$lambda$1$lambda$0(State<Color> state) {
                                                                return state.getValue().m11350unboximpl();
                                                            }
                                                        }), composer3, 48);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    composer3.skipToGroupEnd();
                                                }
                                            }), composer2, ProvidedValue.$stable | 48);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }
                                }), composerStartRestartGroup, (i8 & 14) | 805306368 | (i8 & 896) | ((i8 >> 3) & 7168) | ((i8 << 3) & 3670016) | ((i8 << 15) & 234881024), 128);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                shape3 = shapeCopy;
                                borderStroke4 = borderStroke3;
                                function25 = function24;
                                z3 = z2;
                                chipColors3 = chipColors2;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                modifier2 = modifier;
                                z3 = z2;
                                mutableInteractionSource3 = mutableInteractionSource2;
                                shape3 = shape2;
                                borderStroke4 = borderStroke2;
                                function25 = function22;
                                chipColors3 = chipColors;
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt.Chip.4
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

                                    public final void invoke(@Nullable Composer composer2, int i12) {
                                        ChipKt.Chip(function0, modifier2, z3, mutableInteractionSource3, shape3, borderStroke4, chipColors3, function25, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i3 |= 100663296;
                        if ((i3 & 191739611) == 38347922) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                                if (i9 == 0) {
                                }
                                if (i4 != 0) {
                                }
                                if (i5 == 0) {
                                }
                                if ((i2 & 16) == 0) {
                                }
                                if (i6 == 0) {
                                }
                                if ((i2 & 64) == 0) {
                                }
                                i8 = i3;
                                if (i7 == 0) {
                                }
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    borderStroke2 = borderStroke;
                    if ((i & 3670016) == 0) {
                    }
                    i7 = i2 & 128;
                    if (i7 != 0) {
                    }
                    if ((i2 & 256) == 0) {
                    }
                    if ((i3 & 191739611) == 38347922) {
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if ((57344 & i) != 0) {
                }
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                borderStroke2 = borderStroke;
                if ((i & 3670016) == 0) {
                }
                i7 = i2 & 128;
                if (i7 != 0) {
                }
                if ((i2 & 256) == 0) {
                }
                if ((i3 & 191739611) == 38347922) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z2 = z;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((57344 & i) != 0) {
            }
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            borderStroke2 = borderStroke;
            if ((i & 3670016) == 0) {
            }
            i7 = i2 & 128;
            if (i7 != 0) {
            }
            if ((i2 & 256) == 0) {
            }
            if ((i3 & 191739611) == 38347922) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((57344 & i) != 0) {
        }
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        borderStroke2 = borderStroke;
        if ((i & 3670016) == 0) {
        }
        i7 = i2 & 128;
        if (i7 != 0) {
        }
        if ((i2 & 256) == 0) {
        }
        if ((i3 & 191739611) == 38347922) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:192:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011d  */
    @Composable
    @ExperimentalMaterialApi
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FilterChip(final boolean z, @NotNull final Function0<Unit> function0, @Nullable Modifier modifier, boolean z2, @Nullable MutableInteractionSource mutableInteractionSource, @Nullable Shape shape, @Nullable BorderStroke borderStroke, @Nullable SelectableChipColors selectableChipColors, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Function2<? super Composer, ? super Integer, Unit> function22, @Nullable Function2<? super Composer, ? super Integer, Unit> function23, @NotNull final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, @Nullable Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        boolean z3;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        MutableInteractionSource mutableInteractionSource2;
        int i12;
        Shape shapeCopy;
        BorderStroke borderStroke2;
        SelectableChipColors selectableChipColorsM8830filterChipColorsJ08w3E;
        Function2<? super Composer, ? super Integer, Unit> function24;
        Function2<? super Composer, ? super Integer, Unit> function25;
        Shape shape2;
        Function2<? super Composer, ? super Integer, Unit> function26;
        Modifier modifier2;
        boolean z4;
        MutableInteractionSource mutableInteractionSource3;
        SelectableChipColors selectableChipColors2;
        int i13;
        Composer composer2;
        final MutableInteractionSource mutableInteractionSource4;
        final Shape shape3;
        final Function2<? super Composer, ? super Integer, Unit> function27;
        final Function2<? super Composer, ? super Integer, Unit> function28;
        final Function2<? super Composer, ? super Integer, Unit> function29;
        final SelectableChipColors selectableChipColors3;
        final boolean z5;
        final Modifier modifier3;
        final BorderStroke borderStroke3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1259208246);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 14) == 0) {
            i4 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 112) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i14 = i3 & 4;
        if (i14 != 0) {
            i4 |= 384;
        } else {
            if ((i & 896) == 0) {
                i4 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
            }
            i5 = i3 & 8;
            if (i5 != 0) {
                if ((i & 7168) == 0) {
                    z3 = z2;
                    i4 |= composerStartRestartGroup.changed(z3) ? 2048 : 1024;
                }
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= CpioConstants.C_ISBLK;
                } else if ((i & 57344) == 0) {
                    i4 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 16384 : 8192;
                }
                if ((i & 458752) == 0) {
                    i4 |= ((i3 & 32) == 0 && composerStartRestartGroup.changed(shape)) ? 131072 : 65536;
                }
                i7 = i3 & 64;
                if (i7 != 0) {
                    i4 |= 1572864;
                } else if ((i & 3670016) == 0) {
                    i4 |= composerStartRestartGroup.changed(borderStroke) ? 1048576 : 524288;
                }
                if ((i & 29360128) == 0) {
                    i4 |= ((i3 & 128) == 0 && composerStartRestartGroup.changed(selectableChipColors)) ? 8388608 : 4194304;
                }
                i8 = i3 & 256;
                if (i8 != 0) {
                    i4 |= 100663296;
                } else if ((i & 234881024) == 0) {
                    i4 |= composerStartRestartGroup.changedInstance(function2) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                }
                i9 = i3 & 512;
                if (i9 != 0) {
                    i4 |= 805306368;
                } else if ((i & 1879048192) == 0) {
                    i4 |= composerStartRestartGroup.changedInstance(function22) ? 536870912 : 268435456;
                }
                i10 = i3 & 1024;
                if (i10 != 0) {
                    i11 = i2 | 6;
                } else if ((i2 & 14) == 0) {
                    i11 = i2 | (composerStartRestartGroup.changedInstance(function23) ? 4 : 2);
                } else {
                    i11 = i2;
                }
                if ((i3 & 2048) != 0) {
                    i11 |= 48;
                } else if ((i2 & 112) == 0) {
                    i11 |= composerStartRestartGroup.changedInstance(function3) ? 32 : 16;
                }
                int i15 = i11;
                if ((i4 & 1533916891) != 306783378 || (i15 & 91) != 18 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        Modifier modifier4 = i14 == 0 ? Modifier.INSTANCE : modifier;
                        boolean z6 = i5 == 0 ? true : z3;
                        if (i6 == 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i3 & 32) == 0) {
                            i12 = i4 & (-458753);
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                        } else {
                            i12 = i4;
                            shapeCopy = shape;
                        }
                        borderStroke2 = i7 == 0 ? null : borderStroke;
                        if ((i3 & 128) == 0) {
                            selectableChipColorsM8830filterChipColorsJ08w3E = ChipDefaults.INSTANCE.m8830filterChipColorsJ08w3E(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 805306368, 511);
                            i12 &= -29360129;
                        } else {
                            selectableChipColorsM8830filterChipColorsJ08w3E = selectableChipColors;
                        }
                        Function2<? super Composer, ? super Integer, Unit> function210 = i8 == 0 ? null : function2;
                        Function2<? super Composer, ? super Integer, Unit> function211 = i9 == 0 ? null : function22;
                        if (i10 == 0) {
                            function25 = function210;
                            shape2 = shapeCopy;
                            function26 = function211;
                            modifier2 = modifier4;
                            z4 = z6;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            selectableChipColors2 = selectableChipColorsM8830filterChipColorsJ08w3E;
                            i13 = i12;
                            function24 = null;
                        } else {
                            function24 = function23;
                            function25 = function210;
                            shape2 = shapeCopy;
                            function26 = function211;
                            modifier2 = modifier4;
                            z4 = z6;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            selectableChipColors2 = selectableChipColorsM8830filterChipColorsJ08w3E;
                            i13 = i12;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i3 & 32) != 0) {
                            i4 &= -458753;
                        }
                        if ((i3 & 128) != 0) {
                            i4 &= -29360129;
                        }
                        modifier2 = modifier;
                        mutableInteractionSource3 = mutableInteractionSource;
                        shape2 = shape;
                        borderStroke2 = borderStroke;
                        selectableChipColors2 = selectableChipColors;
                        function25 = function2;
                        function26 = function22;
                        function24 = function23;
                        boolean z7 = z3;
                        i13 = i4;
                        z4 = z7;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1259208246, i13, i15, "androidx.compose.material.FilterChip (Chip.kt:197)");
                    }
                    int i16 = i13 << 3;
                    int i17 = ((i13 >> 15) & 896) | ((i13 >> 9) & 14) | (i16 & 112);
                    final State<Color> stateContentColor = selectableChipColors2.contentColor(z4, z, composerStartRestartGroup, i17);
                    Modifier modifier5 = modifier2;
                    final Function2<? super Composer, ? super Integer, Unit> function212 = function25;
                    final Function2<? super Composer, ? super Integer, Unit> function213 = function26;
                    final Function2<? super Composer, ? super Integer, Unit> function214 = function24;
                    final SelectableChipColors selectableChipColors4 = selectableChipColors2;
                    final boolean z8 = z4;
                    SelectableChipColors selectableChipColors5 = selectableChipColors2;
                    boolean z9 = z4;
                    composer2 = composerStartRestartGroup;
                    SurfaceKt.m9027SurfaceNy5ogXk(z, function0, SemanticsModifierKt.semantics$default(modifier2, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ChipKt.FilterChip.2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            SemanticsPropertiesKt.m13009setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m12994getCheckboxo7Vup1c());
                        }
                    }, 1, null), z9, shape2, selectableChipColors2.backgroundColor(z4, z, composerStartRestartGroup, i17).getValue().m11350unboximpl(), Color.m11339copywmQWz5c$default(stateContentColor.getValue().m11350unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke2, 0.0f, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 722126431, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt.FilterChip.3
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

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer3, int i18) {
                            if ((i18 & 11) != 2 || !composer3.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(722126431, i18, -1, "androidx.compose.material.FilterChip.<anonymous> (Chip.kt:211)");
                                }
                                ProvidedValue<Float> providedValueProvides = ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m11342getAlphaimpl(stateContentColor.getValue().m11350unboximpl())));
                                final Function2<Composer, Integer, Unit> function215 = function212;
                                final boolean z10 = z;
                                final Function2<Composer, Integer, Unit> function216 = function213;
                                final Function2<Composer, Integer, Unit> function217 = function214;
                                final Function3<RowScope, Composer, Integer, Unit> function32 = function3;
                                final SelectableChipColors selectableChipColors6 = selectableChipColors4;
                                final boolean z11 = z8;
                                final State<Color> state = stateContentColor;
                                CompositionLocalKt.CompositionLocalProvider(providedValueProvides, ComposableLambdaKt.composableLambda(composer3, 1582291359, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt.FilterChip.3.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
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
                                    public final void invoke(@Nullable Composer composer4, int i19) {
                                        if ((i19 & 11) != 2 || !composer4.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1582291359, i19, -1, "androidx.compose.material.FilterChip.<anonymous>.<anonymous> (Chip.kt:212)");
                                            }
                                            TextStyle body2 = MaterialTheme.INSTANCE.getTypography(composer4, 6).getBody2();
                                            final Function2<Composer, Integer, Unit> function218 = function215;
                                            final boolean z12 = z10;
                                            final Function2<Composer, Integer, Unit> function219 = function216;
                                            final Function2<Composer, Integer, Unit> function220 = function217;
                                            final Function3<RowScope, Composer, Integer, Unit> function33 = function32;
                                            final SelectableChipColors selectableChipColors7 = selectableChipColors6;
                                            final boolean z13 = z11;
                                            final State<Color> state2 = state;
                                            TextKt.ProvideTextStyle(body2, ComposableLambdaKt.composableLambda(composer4, -1543702066, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt.FilterChip.3.1.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                    invoke(composer5, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                /* JADX WARN: Type inference failed for: r4v18 */
                                                /* JADX WARN: Type inference failed for: r4v6 */
                                                /* JADX WARN: Type inference failed for: r4v7, types: [boolean, int] */
                                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                                @Composable
                                                public final void invoke(@Nullable Composer composer5, int i20) {
                                                    float fM13666constructorimpl;
                                                    float fM13666constructorimpl2;
                                                    Function3<RowScope, Composer, Integer, Unit> function34;
                                                    Arrangement arrangement;
                                                    int i21;
                                                    ?? r4;
                                                    Modifier modifierClip;
                                                    if ((i20 & 11) != 2 || !composer5.getSkipping()) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-1543702066, i20, -1, "androidx.compose.material.FilterChip.<anonymous>.<anonymous>.<anonymous> (Chip.kt:215)");
                                                        }
                                                        Modifier.Companion companion = Modifier.INSTANCE;
                                                        Modifier modifierM8157defaultMinSizeVpY3zN4$default = SizeKt.m8157defaultMinSizeVpY3zN4$default(IntrinsicKt.width(companion, IntrinsicSize.Max), 0.0f, ChipDefaults.INSTANCE.m8832getMinHeightD9Ej5fM(), 1, null);
                                                        if (function218 == null && (!z12 || function219 == null)) {
                                                            fM13666constructorimpl = ChipKt.HorizontalPadding;
                                                        } else {
                                                            fM13666constructorimpl = C2046Dp.m13666constructorimpl(0);
                                                        }
                                                        float f = fM13666constructorimpl;
                                                        if (function220 == null) {
                                                            fM13666constructorimpl2 = ChipKt.HorizontalPadding;
                                                        } else {
                                                            fM13666constructorimpl2 = C2046Dp.m13666constructorimpl(0);
                                                        }
                                                        Modifier modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(modifierM8157defaultMinSizeVpY3zN4$default, f, 0.0f, fM13666constructorimpl2, 0.0f, 10, null);
                                                        Arrangement arrangement2 = Arrangement.INSTANCE;
                                                        Arrangement.Horizontal start = arrangement2.getStart();
                                                        Alignment.Companion companion2 = Alignment.INSTANCE;
                                                        Alignment.Vertical centerVertically = companion2.getCenterVertically();
                                                        Function2<Composer, Integer, Unit> function221 = function218;
                                                        boolean z14 = z12;
                                                        Function2<Composer, Integer, Unit> function222 = function219;
                                                        Function3<RowScope, Composer, Integer, Unit> function35 = function33;
                                                        Function2<Composer, Integer, Unit> function223 = function220;
                                                        SelectableChipColors selectableChipColors8 = selectableChipColors7;
                                                        boolean z15 = z13;
                                                        State<Color> state3 = state2;
                                                        composer5.startReplaceableGroup(693286680);
                                                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer5, 54);
                                                        composer5.startReplaceableGroup(-1323940314);
                                                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                                        CompositionLocalMap currentCompositionLocalMap = composer5.getCurrentCompositionLocalMap();
                                                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default);
                                                        if (!(composer5.getApplier() instanceof Applier)) {
                                                            ComposablesKt.invalidApplier();
                                                        }
                                                        composer5.startReusableNode();
                                                        if (composer5.getInserting()) {
                                                            composer5.createNode(constructor);
                                                        } else {
                                                            composer5.useNode();
                                                        }
                                                        Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer5);
                                                        Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                                                        Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                                        if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                            composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                            composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                        }
                                                        function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer5)), composer5, 0);
                                                        composer5.startReplaceableGroup(2058660585);
                                                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                                        composer5.startReplaceableGroup(-1943411941);
                                                        if (function221 != null || (z14 && function222 != null)) {
                                                            SpacerKt.Spacer(SizeKt.m8177width3ABfNKs(companion, ChipKt.LeadingIconStartSpacing), composer5, 6);
                                                            composer5.startReplaceableGroup(733328855);
                                                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer5, 0);
                                                            composer5.startReplaceableGroup(-1323940314);
                                                            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                                            CompositionLocalMap currentCompositionLocalMap2 = composer5.getCurrentCompositionLocalMap();
                                                            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                                                            function34 = function35;
                                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion);
                                                            arrangement = arrangement2;
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
                                                            Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                                                            Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                                                            if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                                composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                                composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                                            }
                                                            function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer5)), composer5, 0);
                                                            composer5.startReplaceableGroup(2058660585);
                                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                            composer5.startReplaceableGroup(649985791);
                                                            if (function221 != null) {
                                                                State<Color> stateLeadingIconColor = selectableChipColors8.leadingIconColor(z15, z14, composer5, 0);
                                                                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(stateLeadingIconColor.getValue()), ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m11342getAlphaimpl(stateLeadingIconColor.getValue().m11350unboximpl())))}, function221, composer5, 8);
                                                            }
                                                            composer5.endReplaceableGroup();
                                                            composer5.startReplaceableGroup(-1943411127);
                                                            if (!z14 || function222 == null) {
                                                                i21 = -1323940314;
                                                            } else {
                                                                long jM11350unboximpl = state3.getValue().m11350unboximpl();
                                                                composer5.startReplaceableGroup(649986622);
                                                                if (function221 != null) {
                                                                    modifierClip = ClipKt.clip(BackgroundKt.m7770backgroundbw27NRU(SizeKt.m8164requiredSize3ABfNKs(companion, ChipKt.SelectedIconContainerSize), state3.getValue().m11350unboximpl(), RoundedCornerShapeKt.getCircleShape()), RoundedCornerShapeKt.getCircleShape());
                                                                    r4 = 0;
                                                                    jM11350unboximpl = selectableChipColors8.backgroundColor(z15, z14, composer5, 0).getValue().m11350unboximpl();
                                                                } else {
                                                                    r4 = 0;
                                                                    modifierClip = companion;
                                                                }
                                                                composer5.endReplaceableGroup();
                                                                Alignment center = companion2.getCenter();
                                                                composer5.startReplaceableGroup(733328855);
                                                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center, r4, composer5, 6);
                                                                i21 = -1323940314;
                                                                composer5.startReplaceableGroup(-1323940314);
                                                                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer5, r4);
                                                                CompositionLocalMap currentCompositionLocalMap3 = composer5.getCurrentCompositionLocalMap();
                                                                Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                                                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierClip);
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
                                                                Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyRememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
                                                                Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                                                                if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                                                    composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                                                    composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                                                }
                                                                function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer5)), composer5, 0);
                                                                composer5.startReplaceableGroup(2058660585);
                                                                CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m11330boximpl(jM11350unboximpl)), function222, composer5, ProvidedValue.$stable);
                                                                composer5.endReplaceableGroup();
                                                                composer5.endNode();
                                                                composer5.endReplaceableGroup();
                                                                composer5.endReplaceableGroup();
                                                            }
                                                            composer5.endReplaceableGroup();
                                                            composer5.endReplaceableGroup();
                                                            composer5.endNode();
                                                            composer5.endReplaceableGroup();
                                                            composer5.endReplaceableGroup();
                                                            SpacerKt.Spacer(SizeKt.m8177width3ABfNKs(companion, ChipKt.LeadingIconEndSpacing), composer5, 6);
                                                        } else {
                                                            arrangement = arrangement2;
                                                            function34 = function35;
                                                            i21 = -1323940314;
                                                        }
                                                        composer5.endReplaceableGroup();
                                                        Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null);
                                                        Arrangement.Horizontal start2 = arrangement.getStart();
                                                        Alignment.Vertical centerVertically2 = companion2.getCenterVertically();
                                                        composer5.startReplaceableGroup(693286680);
                                                        MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(start2, centerVertically2, composer5, 54);
                                                        composer5.startReplaceableGroup(i21);
                                                        int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                                        CompositionLocalMap currentCompositionLocalMap4 = composer5.getCurrentCompositionLocalMap();
                                                        Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
                                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierWeight$default);
                                                        if (!(composer5.getApplier() instanceof Applier)) {
                                                            ComposablesKt.invalidApplier();
                                                        }
                                                        composer5.startReusableNode();
                                                        if (composer5.getInserting()) {
                                                            composer5.createNode(constructor4);
                                                        } else {
                                                            composer5.useNode();
                                                        }
                                                        Composer composerM10870constructorimpl4 = Updater.m10870constructorimpl(composer5);
                                                        Updater.m10877setimpl(composerM10870constructorimpl4, measurePolicyRowMeasurePolicy2, companion3.getSetMeasurePolicy());
                                                        Updater.m10877setimpl(composerM10870constructorimpl4, currentCompositionLocalMap4, companion3.getSetResolvedCompositionLocals());
                                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion3.getSetCompositeKeyHash();
                                                        if (composerM10870constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                                            composerM10870constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                                            composerM10870constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                                        }
                                                        function3ModifierMaterializerOf4.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer5)), composer5, 0);
                                                        composer5.startReplaceableGroup(2058660585);
                                                        function34.invoke(rowScopeInstance, composer5, 6);
                                                        composer5.endReplaceableGroup();
                                                        composer5.endNode();
                                                        composer5.endReplaceableGroup();
                                                        composer5.endReplaceableGroup();
                                                        composer5.startReplaceableGroup(-1181292468);
                                                        if (function223 != null) {
                                                            SpacerKt.Spacer(SizeKt.m8177width3ABfNKs(companion, ChipKt.TrailingIconSpacing), composer5, 6);
                                                            function223.invoke(composer5, 0);
                                                            SpacerKt.Spacer(SizeKt.m8177width3ABfNKs(companion, ChipKt.TrailingIconSpacing), composer5, 6);
                                                        }
                                                        composer5.endReplaceableGroup();
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
                                            }), composer4, 48);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer4.skipToGroupEnd();
                                    }
                                }), composer3, ProvidedValue.$stable | 48);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }), composer2, (i13 & 7294) | ((i13 >> 3) & 57344) | (i16 & 29360128) | ((i13 << 15) & 1879048192), 6, 256);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    mutableInteractionSource4 = mutableInteractionSource3;
                    shape3 = shape2;
                    function27 = function25;
                    function28 = function26;
                    function29 = function24;
                    selectableChipColors3 = selectableChipColors5;
                    z5 = z9;
                    modifier3 = modifier5;
                    borderStroke3 = borderStroke2;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier;
                    mutableInteractionSource4 = mutableInteractionSource;
                    shape3 = shape;
                    borderStroke3 = borderStroke;
                    selectableChipColors3 = selectableChipColors;
                    function27 = function2;
                    function28 = function22;
                    function29 = function23;
                    composer2 = composerStartRestartGroup;
                    z5 = z3;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt.FilterChip.4
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

                        public final void invoke(@Nullable Composer composer3, int i18) {
                            ChipKt.FilterChip(z, function0, modifier3, z5, mutableInteractionSource4, shape3, borderStroke3, selectableChipColors3, function27, function28, function29, function3, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                        }
                    });
                    return;
                }
                return;
            }
            i4 |= 3072;
            z3 = z2;
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            if ((i & 458752) == 0) {
            }
            i7 = i3 & 64;
            if (i7 != 0) {
            }
            if ((i & 29360128) == 0) {
            }
            i8 = i3 & 256;
            if (i8 != 0) {
            }
            i9 = i3 & 512;
            if (i9 != 0) {
            }
            i10 = i3 & 1024;
            if (i10 != 0) {
            }
            if ((i3 & 2048) != 0) {
            }
            int i152 = i11;
            if ((i4 & 1533916891) != 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i14 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 == 0) {
                    }
                    if ((i3 & 32) == 0) {
                    }
                    if (i7 == 0) {
                    }
                    if ((i3 & 128) == 0) {
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
                    int i162 = i13 << 3;
                    int i172 = ((i13 >> 15) & 896) | ((i13 >> 9) & 14) | (i162 & 112);
                    final State<Color> stateContentColor2 = selectableChipColors2.contentColor(z4, z, composerStartRestartGroup, i172);
                    Modifier modifier52 = modifier2;
                    final Function2<? super Composer, ? super Integer, Unit> function2122 = function25;
                    final Function2<? super Composer, ? super Integer, Unit> function2132 = function26;
                    final Function2<? super Composer, ? super Integer, Unit> function2142 = function24;
                    final SelectableChipColors selectableChipColors42 = selectableChipColors2;
                    final boolean z82 = z4;
                    SelectableChipColors selectableChipColors52 = selectableChipColors2;
                    boolean z92 = z4;
                    composer2 = composerStartRestartGroup;
                    SurfaceKt.m9027SurfaceNy5ogXk(z, function0, SemanticsModifierKt.semantics$default(modifier2, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ChipKt.FilterChip.2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            SemanticsPropertiesKt.m13009setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m12994getCheckboxo7Vup1c());
                        }
                    }, 1, null), z92, shape2, selectableChipColors2.backgroundColor(z4, z, composerStartRestartGroup, i172).getValue().m11350unboximpl(), Color.m11339copywmQWz5c$default(stateContentColor2.getValue().m11350unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke2, 0.0f, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 722126431, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt.FilterChip.3
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

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer3, int i18) {
                            if ((i18 & 11) != 2 || !composer3.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(722126431, i18, -1, "androidx.compose.material.FilterChip.<anonymous> (Chip.kt:211)");
                                }
                                ProvidedValue<Float> providedValueProvides = ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m11342getAlphaimpl(stateContentColor2.getValue().m11350unboximpl())));
                                final Function2<? super Composer, ? super Integer, Unit> function215 = function2122;
                                final boolean z10 = z;
                                final Function2<? super Composer, ? super Integer, Unit> function216 = function2132;
                                final Function2<? super Composer, ? super Integer, Unit> function217 = function2142;
                                final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32 = function3;
                                final SelectableChipColors selectableChipColors6 = selectableChipColors42;
                                final boolean z11 = z82;
                                final State<Color> state = stateContentColor2;
                                CompositionLocalKt.CompositionLocalProvider(providedValueProvides, ComposableLambdaKt.composableLambda(composer3, 1582291359, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt.FilterChip.3.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
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
                                    public final void invoke(@Nullable Composer composer4, int i19) {
                                        if ((i19 & 11) != 2 || !composer4.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1582291359, i19, -1, "androidx.compose.material.FilterChip.<anonymous>.<anonymous> (Chip.kt:212)");
                                            }
                                            TextStyle body2 = MaterialTheme.INSTANCE.getTypography(composer4, 6).getBody2();
                                            final Function2<? super Composer, ? super Integer, Unit> function218 = function215;
                                            final boolean z12 = z10;
                                            final Function2<? super Composer, ? super Integer, Unit> function219 = function216;
                                            final Function2<? super Composer, ? super Integer, Unit> function220 = function217;
                                            final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function33 = function32;
                                            final SelectableChipColors selectableChipColors7 = selectableChipColors6;
                                            final boolean z13 = z11;
                                            final State<Color> state2 = state;
                                            TextKt.ProvideTextStyle(body2, ComposableLambdaKt.composableLambda(composer4, -1543702066, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt.FilterChip.3.1.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                    invoke(composer5, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                /* JADX WARN: Type inference failed for: r4v18 */
                                                /* JADX WARN: Type inference failed for: r4v6 */
                                                /* JADX WARN: Type inference failed for: r4v7, types: [boolean, int] */
                                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                                @Composable
                                                public final void invoke(@Nullable Composer composer5, int i20) {
                                                    float fM13666constructorimpl;
                                                    float fM13666constructorimpl2;
                                                    Function3<RowScope, Composer, Integer, Unit> function34;
                                                    Arrangement arrangement;
                                                    int i21;
                                                    ?? r4;
                                                    Modifier modifierClip;
                                                    if ((i20 & 11) != 2 || !composer5.getSkipping()) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-1543702066, i20, -1, "androidx.compose.material.FilterChip.<anonymous>.<anonymous>.<anonymous> (Chip.kt:215)");
                                                        }
                                                        Modifier.Companion companion = Modifier.INSTANCE;
                                                        Modifier modifierM8157defaultMinSizeVpY3zN4$default = SizeKt.m8157defaultMinSizeVpY3zN4$default(IntrinsicKt.width(companion, IntrinsicSize.Max), 0.0f, ChipDefaults.INSTANCE.m8832getMinHeightD9Ej5fM(), 1, null);
                                                        if (function218 == null && (!z12 || function219 == null)) {
                                                            fM13666constructorimpl = ChipKt.HorizontalPadding;
                                                        } else {
                                                            fM13666constructorimpl = C2046Dp.m13666constructorimpl(0);
                                                        }
                                                        float f = fM13666constructorimpl;
                                                        if (function220 == null) {
                                                            fM13666constructorimpl2 = ChipKt.HorizontalPadding;
                                                        } else {
                                                            fM13666constructorimpl2 = C2046Dp.m13666constructorimpl(0);
                                                        }
                                                        Modifier modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(modifierM8157defaultMinSizeVpY3zN4$default, f, 0.0f, fM13666constructorimpl2, 0.0f, 10, null);
                                                        Arrangement arrangement2 = Arrangement.INSTANCE;
                                                        Arrangement.Horizontal start = arrangement2.getStart();
                                                        Alignment.Companion companion2 = Alignment.INSTANCE;
                                                        Alignment.Vertical centerVertically = companion2.getCenterVertically();
                                                        Function2<Composer, Integer, Unit> function221 = function218;
                                                        boolean z14 = z12;
                                                        Function2<Composer, Integer, Unit> function222 = function219;
                                                        Function3<RowScope, Composer, Integer, Unit> function35 = function33;
                                                        Function2<Composer, Integer, Unit> function223 = function220;
                                                        SelectableChipColors selectableChipColors8 = selectableChipColors7;
                                                        boolean z15 = z13;
                                                        State<Color> state3 = state2;
                                                        composer5.startReplaceableGroup(693286680);
                                                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer5, 54);
                                                        composer5.startReplaceableGroup(-1323940314);
                                                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                                        CompositionLocalMap currentCompositionLocalMap = composer5.getCurrentCompositionLocalMap();
                                                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default);
                                                        if (!(composer5.getApplier() instanceof Applier)) {
                                                            ComposablesKt.invalidApplier();
                                                        }
                                                        composer5.startReusableNode();
                                                        if (composer5.getInserting()) {
                                                            composer5.createNode(constructor);
                                                        } else {
                                                            composer5.useNode();
                                                        }
                                                        Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer5);
                                                        Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                                                        Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                                        if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                            composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                            composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                        }
                                                        function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer5)), composer5, 0);
                                                        composer5.startReplaceableGroup(2058660585);
                                                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                                        composer5.startReplaceableGroup(-1943411941);
                                                        if (function221 != null || (z14 && function222 != null)) {
                                                            SpacerKt.Spacer(SizeKt.m8177width3ABfNKs(companion, ChipKt.LeadingIconStartSpacing), composer5, 6);
                                                            composer5.startReplaceableGroup(733328855);
                                                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer5, 0);
                                                            composer5.startReplaceableGroup(-1323940314);
                                                            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                                            CompositionLocalMap currentCompositionLocalMap2 = composer5.getCurrentCompositionLocalMap();
                                                            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                                                            function34 = function35;
                                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion);
                                                            arrangement = arrangement2;
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
                                                            Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                                                            Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                                                            if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                                composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                                composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                                            }
                                                            function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer5)), composer5, 0);
                                                            composer5.startReplaceableGroup(2058660585);
                                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                            composer5.startReplaceableGroup(649985791);
                                                            if (function221 != null) {
                                                                State<Color> stateLeadingIconColor = selectableChipColors8.leadingIconColor(z15, z14, composer5, 0);
                                                                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(stateLeadingIconColor.getValue()), ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m11342getAlphaimpl(stateLeadingIconColor.getValue().m11350unboximpl())))}, function221, composer5, 8);
                                                            }
                                                            composer5.endReplaceableGroup();
                                                            composer5.startReplaceableGroup(-1943411127);
                                                            if (!z14 || function222 == null) {
                                                                i21 = -1323940314;
                                                            } else {
                                                                long jM11350unboximpl = state3.getValue().m11350unboximpl();
                                                                composer5.startReplaceableGroup(649986622);
                                                                if (function221 != null) {
                                                                    modifierClip = ClipKt.clip(BackgroundKt.m7770backgroundbw27NRU(SizeKt.m8164requiredSize3ABfNKs(companion, ChipKt.SelectedIconContainerSize), state3.getValue().m11350unboximpl(), RoundedCornerShapeKt.getCircleShape()), RoundedCornerShapeKt.getCircleShape());
                                                                    r4 = 0;
                                                                    jM11350unboximpl = selectableChipColors8.backgroundColor(z15, z14, composer5, 0).getValue().m11350unboximpl();
                                                                } else {
                                                                    r4 = 0;
                                                                    modifierClip = companion;
                                                                }
                                                                composer5.endReplaceableGroup();
                                                                Alignment center = companion2.getCenter();
                                                                composer5.startReplaceableGroup(733328855);
                                                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center, r4, composer5, 6);
                                                                i21 = -1323940314;
                                                                composer5.startReplaceableGroup(-1323940314);
                                                                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer5, r4);
                                                                CompositionLocalMap currentCompositionLocalMap3 = composer5.getCurrentCompositionLocalMap();
                                                                Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                                                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierClip);
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
                                                                Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyRememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
                                                                Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                                                                if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                                                    composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                                                    composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                                                }
                                                                function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer5)), composer5, 0);
                                                                composer5.startReplaceableGroup(2058660585);
                                                                CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m11330boximpl(jM11350unboximpl)), function222, composer5, ProvidedValue.$stable);
                                                                composer5.endReplaceableGroup();
                                                                composer5.endNode();
                                                                composer5.endReplaceableGroup();
                                                                composer5.endReplaceableGroup();
                                                            }
                                                            composer5.endReplaceableGroup();
                                                            composer5.endReplaceableGroup();
                                                            composer5.endNode();
                                                            composer5.endReplaceableGroup();
                                                            composer5.endReplaceableGroup();
                                                            SpacerKt.Spacer(SizeKt.m8177width3ABfNKs(companion, ChipKt.LeadingIconEndSpacing), composer5, 6);
                                                        } else {
                                                            arrangement = arrangement2;
                                                            function34 = function35;
                                                            i21 = -1323940314;
                                                        }
                                                        composer5.endReplaceableGroup();
                                                        Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null);
                                                        Arrangement.Horizontal start2 = arrangement.getStart();
                                                        Alignment.Vertical centerVertically2 = companion2.getCenterVertically();
                                                        composer5.startReplaceableGroup(693286680);
                                                        MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(start2, centerVertically2, composer5, 54);
                                                        composer5.startReplaceableGroup(i21);
                                                        int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                                        CompositionLocalMap currentCompositionLocalMap4 = composer5.getCurrentCompositionLocalMap();
                                                        Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
                                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierWeight$default);
                                                        if (!(composer5.getApplier() instanceof Applier)) {
                                                            ComposablesKt.invalidApplier();
                                                        }
                                                        composer5.startReusableNode();
                                                        if (composer5.getInserting()) {
                                                            composer5.createNode(constructor4);
                                                        } else {
                                                            composer5.useNode();
                                                        }
                                                        Composer composerM10870constructorimpl4 = Updater.m10870constructorimpl(composer5);
                                                        Updater.m10877setimpl(composerM10870constructorimpl4, measurePolicyRowMeasurePolicy2, companion3.getSetMeasurePolicy());
                                                        Updater.m10877setimpl(composerM10870constructorimpl4, currentCompositionLocalMap4, companion3.getSetResolvedCompositionLocals());
                                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion3.getSetCompositeKeyHash();
                                                        if (composerM10870constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                                            composerM10870constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                                            composerM10870constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                                        }
                                                        function3ModifierMaterializerOf4.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer5)), composer5, 0);
                                                        composer5.startReplaceableGroup(2058660585);
                                                        function34.invoke(rowScopeInstance, composer5, 6);
                                                        composer5.endReplaceableGroup();
                                                        composer5.endNode();
                                                        composer5.endReplaceableGroup();
                                                        composer5.endReplaceableGroup();
                                                        composer5.startReplaceableGroup(-1181292468);
                                                        if (function223 != null) {
                                                            SpacerKt.Spacer(SizeKt.m8177width3ABfNKs(companion, ChipKt.TrailingIconSpacing), composer5, 6);
                                                            function223.invoke(composer5, 0);
                                                            SpacerKt.Spacer(SizeKt.m8177width3ABfNKs(companion, ChipKt.TrailingIconSpacing), composer5, 6);
                                                        }
                                                        composer5.endReplaceableGroup();
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
                                            }), composer4, 48);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer4.skipToGroupEnd();
                                    }
                                }), composer3, ProvidedValue.$stable | 48);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }), composer2, (i13 & 7294) | ((i13 >> 3) & 57344) | (i162 & 29360128) | ((i13 << 15) & 1879048192), 6, 256);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    mutableInteractionSource4 = mutableInteractionSource3;
                    shape3 = shape2;
                    function27 = function25;
                    function28 = function26;
                    function29 = function24;
                    selectableChipColors3 = selectableChipColors52;
                    z5 = z92;
                    modifier3 = modifier52;
                    borderStroke3 = borderStroke2;
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i5 = i3 & 8;
        if (i5 != 0) {
        }
        z3 = z2;
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        if ((i & 458752) == 0) {
        }
        i7 = i3 & 64;
        if (i7 != 0) {
        }
        if ((i & 29360128) == 0) {
        }
        i8 = i3 & 256;
        if (i8 != 0) {
        }
        i9 = i3 & 512;
        if (i9 != 0) {
        }
        i10 = i3 & 1024;
        if (i10 != 0) {
        }
        if ((i3 & 2048) != 0) {
        }
        int i1522 = i11;
        if ((i4 & 1533916891) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long Chip$lambda$1(State<Color> state) {
        return state.getValue().m11350unboximpl();
    }

    static {
        float f = 8;
        LeadingIconEndSpacing = C2046Dp.m13666constructorimpl(f);
        TrailingIconSpacing = C2046Dp.m13666constructorimpl(f);
    }
}
