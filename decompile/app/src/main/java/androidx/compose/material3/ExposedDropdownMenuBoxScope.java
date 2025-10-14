package androidx.compose.material3;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.material3.internal.ExposedDropdownMenuPopup_androidKt;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.TransformOrigin;
import androidx.compose.p003ui.platform.CompositionLocalsKt;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.DpOffset;
import androidx.compose.p003ui.unit.IntRect;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ExposedDropdownMenu.android.kt */
@StabilityInferred(parameters = 1)
@ExperimentalMaterial3Api
@Metadata(m7104d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002JU\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u001c\u0010\r\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00040\u000e¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u0011H\u0007¢\u0006\u0002\u0010\u0012J\u0016\u0010\u0013\u001a\u00020\n*\u00020\n2\b\b\u0002\u0010\u0014\u001a\u00020\u0006H&J\f\u0010\u0015\u001a\u00020\n*\u00020\nH&¨\u0006\u0016"}, m7105d2 = {"Landroidx/compose/material3/ExposedDropdownMenuBoxScope;", "", "()V", "ExposedDropdownMenu", "", "expanded", "", "onDismissRequest", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "scrollState", "Landroidx/compose/foundation/ScrollState;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "exposedDropdownSize", "matchTextFieldWidth", "menuAnchor", "material3_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nExposedDropdownMenu.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenu.android.kt\nandroidx/compose/material3/ExposedDropdownMenuBoxScope\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,1091:1\n1116#2,6:1092\n1116#2,6:1098\n1116#2,6:1105\n74#3:1104\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenu.android.kt\nandroidx/compose/material3/ExposedDropdownMenuBoxScope\n*L\n279#1:1092,6\n283#1:1098,6\n285#1:1105,6\n284#1:1104\n*E\n"})
/* loaded from: classes4.dex */
public abstract class ExposedDropdownMenuBoxScope {
    public static final int $stable = 0;

    /* compiled from: ExposedDropdownMenu.android.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2 */
    public static final class C14422 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> $content;
        public final /* synthetic */ boolean $expanded;
        public final /* synthetic */ Modifier $modifier;
        public final /* synthetic */ Function0<Unit> $onDismissRequest;
        public final /* synthetic */ ScrollState $scrollState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C14422(boolean z, Function0<Unit> function0, Modifier modifier, ScrollState scrollState, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, int i, int i2) {
            super(2);
            z = z;
            function0 = function0;
            modifier = modifier;
            scrollState = scrollState;
            function3 = function3;
            i = i;
            i = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            ExposedDropdownMenuBoxScope.this.ExposedDropdownMenu(z, function0, modifier, scrollState, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
        }
    }

    @NotNull
    public abstract Modifier exposedDropdownSize(@NotNull Modifier modifier, boolean z);

    @NotNull
    public abstract Modifier menuAnchor(@NotNull Modifier modifier);

    public static /* synthetic */ Modifier exposedDropdownSize$default(ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, Modifier modifier, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: exposedDropdownSize");
        }
        if ((i & 1) != 0) {
            z = true;
        }
        return exposedDropdownMenuBoxScope.exposedDropdownSize(modifier, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:153:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:233:? A[RETURN, SYNTHETIC] */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void ExposedDropdownMenu(boolean z, @NotNull Function0<Unit> function0, @Nullable Modifier modifier, @Nullable ScrollState scrollState, @NotNull Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, @Nullable Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        ScrollState scrollState2;
        Modifier modifier3;
        ScrollState scrollStateRememberScrollState;
        Object objRememberedValue;
        Composer.Companion companion;
        MutableTransitionState mutableTransitionState;
        Object objRememberedValue2;
        final MutableState mutableState;
        Density density;
        boolean zChanged;
        Object objRememberedValue3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1729549851);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    scrollState2 = scrollState;
                    int i5 = composerStartRestartGroup.changed(scrollState2) ? 2048 : 1024;
                    i3 |= i5;
                } else {
                    scrollState2 = scrollState;
                }
                i3 |= i5;
            } else {
                scrollState2 = scrollState;
            }
            if ((i2 & 16) != 0) {
                if ((i & CpioConstants.C_ISBLK) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(function3) ? 16384 : 8192;
                }
                if ((i2 & 32) != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                } else if ((i & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
                    i3 |= composerStartRestartGroup.changed(this) ? 131072 : 65536;
                }
                if ((74899 & i3) != 74898 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                        if ((i2 & 8) == 0) {
                            i3 &= -7169;
                            modifier3 = modifier4;
                            scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1729549851, i3, -1, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.android.kt:268)");
                            }
                            composerStartRestartGroup.startReplaceableGroup(1950029224);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                                objRememberedValue = new MutableTransitionState(Boolean.FALSE);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            mutableTransitionState = (MutableTransitionState) objRememberedValue;
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableTransitionState.setTargetState(Boolean.valueOf(z));
                            if (!((Boolean) mutableTransitionState.getCurrentState()).booleanValue() || ((Boolean) mutableTransitionState.getTargetState()).booleanValue()) {
                                composerStartRestartGroup.startReplaceableGroup(1950029423);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue2 == companion.getEmpty()) {
                                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TransformOrigin.m11717boximpl(TransformOrigin.INSTANCE.m11730getCenterSzJe1aQ()), null, 2, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                mutableState = (MutableState) objRememberedValue2;
                                composerStartRestartGroup.endReplaceableGroup();
                                density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                                composerStartRestartGroup.startReplaceableGroup(1950029562);
                                zChanged = composerStartRestartGroup.changed(density);
                                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                if (!zChanged || objRememberedValue3 == companion.getEmpty()) {
                                    objRememberedValue3 = new DropdownMenuPositionProvider(DpOffset.INSTANCE.m13737getZeroRKDOV3M(), density, 0, new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                            invoke2(intRect, intRect2);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@NotNull IntRect intRect, @NotNull IntRect intRect2) {
                                            mutableState.setValue(TransformOrigin.m11717boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
                                        }
                                    }, 4, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                ExposedDropdownMenuPopup_androidKt.ExposedDropdownMenuPopup(function0, (DropdownMenuPositionProvider) objRememberedValue3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 723773237, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu.1
                                    public final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> $content;
                                    public final /* synthetic */ MutableTransitionState<Boolean> $expandedState;
                                    public final /* synthetic */ Modifier $modifier;
                                    public final /* synthetic */ ScrollState $scrollState;
                                    public final /* synthetic */ MutableState<TransformOrigin> $transformOriginState;
                                    public final /* synthetic */ ExposedDropdownMenuBoxScope this$0;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    public C14411(MutableTransitionState<Boolean> mutableTransitionState2, final MutableState<TransformOrigin> mutableState2, ScrollState scrollStateRememberScrollState2, ExposedDropdownMenuBoxScope this, Modifier modifier32, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function32) {
                                        super(2);
                                        mutableTransitionState = mutableTransitionState2;
                                        mutableState = mutableState2;
                                        scrollState = scrollStateRememberScrollState2;
                                        exposedDropdownMenuBoxScope = this;
                                        modifier = modifier32;
                                        function3 = function32;
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@Nullable Composer composer2, int i6) {
                                        if ((i6 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(723773237, i6, -1, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu.<anonymous> (ExposedDropdownMenu.android.kt:297)");
                                            }
                                            MenuKt.DropdownMenuContent(mutableTransitionState, mutableState, scrollState, ExposedDropdownMenuBoxScope.exposedDropdownSize$default(exposedDropdownMenuBoxScope, modifier, false, 1, null), function3, composer2, MutableTransitionState.$stable | 48, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }
                                }), composerStartRestartGroup, ((i3 >> 3) & 14) | 384, 0);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier2 = modifier32;
                            scrollState2 = scrollStateRememberScrollState2;
                        } else {
                            modifier32 = modifier4;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        modifier32 = modifier2;
                    }
                    scrollStateRememberScrollState2 = scrollState2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composerStartRestartGroup.startReplaceableGroup(1950029224);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                    }
                    mutableTransitionState2 = (MutableTransitionState) objRememberedValue;
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableTransitionState2.setTargetState(Boolean.valueOf(z));
                    if (!((Boolean) mutableTransitionState2.getCurrentState()).booleanValue()) {
                        composerStartRestartGroup.startReplaceableGroup(1950029423);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                        }
                        mutableState2 = (MutableState) objRememberedValue2;
                        composerStartRestartGroup.endReplaceableGroup();
                        density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        composerStartRestartGroup.startReplaceableGroup(1950029562);
                        zChanged = composerStartRestartGroup.changed(density);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged) {
                            objRememberedValue3 = new DropdownMenuPositionProvider(DpOffset.INSTANCE.m13737getZeroRKDOV3M(), density, 0, new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                    invoke2(intRect, intRect2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull IntRect intRect, @NotNull IntRect intRect2) {
                                    mutableState2.setValue(TransformOrigin.m11717boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
                                }
                            }, 4, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            composerStartRestartGroup.endReplaceableGroup();
                            ExposedDropdownMenuPopup_androidKt.ExposedDropdownMenuPopup(function0, (DropdownMenuPositionProvider) objRememberedValue3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 723773237, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu.1
                                public final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> $content;
                                public final /* synthetic */ MutableTransitionState<Boolean> $expandedState;
                                public final /* synthetic */ Modifier $modifier;
                                public final /* synthetic */ ScrollState $scrollState;
                                public final /* synthetic */ MutableState<TransformOrigin> $transformOriginState;
                                public final /* synthetic */ ExposedDropdownMenuBoxScope this$0;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                public C14411(MutableTransitionState<Boolean> mutableTransitionState2, final MutableState<TransformOrigin> mutableState2, ScrollState scrollStateRememberScrollState2, ExposedDropdownMenuBoxScope this, Modifier modifier32, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function32) {
                                    super(2);
                                    mutableTransitionState = mutableTransitionState2;
                                    mutableState = mutableState2;
                                    scrollState = scrollStateRememberScrollState2;
                                    exposedDropdownMenuBoxScope = this;
                                    modifier = modifier32;
                                    function3 = function32;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@Nullable Composer composer2, int i6) {
                                    if ((i6 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(723773237, i6, -1, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu.<anonymous> (ExposedDropdownMenu.android.kt:297)");
                                        }
                                        MenuKt.DropdownMenuContent(mutableTransitionState, mutableState, scrollState, ExposedDropdownMenuBoxScope.exposedDropdownSize$default(exposedDropdownMenuBoxScope, modifier, false, 1, null), function3, composer2, MutableTransitionState.$stable | 48, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }
                            }), composerStartRestartGroup, ((i3 >> 3) & 14) | 384, 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier2 = modifier32;
                            scrollState2 = scrollStateRememberScrollState2;
                        }
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu.2
                        public final /* synthetic */ int $$changed;
                        public final /* synthetic */ int $$default;
                        public final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> $content;
                        public final /* synthetic */ boolean $expanded;
                        public final /* synthetic */ Modifier $modifier;
                        public final /* synthetic */ Function0<Unit> $onDismissRequest;
                        public final /* synthetic */ ScrollState $scrollState;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        public C14422(boolean z2, Function0<Unit> function02, Modifier modifier22, ScrollState scrollState22, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function32, int i6, int i22) {
                            super(2);
                            z = z2;
                            function0 = function02;
                            modifier = modifier22;
                            scrollState = scrollState22;
                            function3 = function32;
                            i = i6;
                            i = i22;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer2, int i6) {
                            ExposedDropdownMenuBoxScope.this.ExposedDropdownMenu(z, function0, modifier, scrollState, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= CpioConstants.C_ISBLK;
            if ((i22 & 32) != 0) {
            }
            if ((74899 & i3) != 74898) {
                composerStartRestartGroup.startDefaults();
                if ((i6 & 1) != 0) {
                    if (i4 == 0) {
                    }
                    if ((i22 & 8) == 0) {
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier22 = modifier;
        if ((i6 & 3072) != 0) {
        }
        if ((i22 & 16) != 0) {
        }
        if ((i22 & 32) != 0) {
        }
        if ((74899 & i3) != 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* compiled from: ExposedDropdownMenu.android.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m7105d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$1 */
    public static final class C14411 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> $content;
        public final /* synthetic */ MutableTransitionState<Boolean> $expandedState;
        public final /* synthetic */ Modifier $modifier;
        public final /* synthetic */ ScrollState $scrollState;
        public final /* synthetic */ MutableState<TransformOrigin> $transformOriginState;
        public final /* synthetic */ ExposedDropdownMenuBoxScope this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C14411(MutableTransitionState<Boolean> mutableTransitionState2, final MutableState<TransformOrigin> mutableState2, ScrollState scrollStateRememberScrollState2, ExposedDropdownMenuBoxScope this, Modifier modifier32, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function32) {
            super(2);
            mutableTransitionState = mutableTransitionState2;
            mutableState = mutableState2;
            scrollState = scrollStateRememberScrollState2;
            exposedDropdownMenuBoxScope = this;
            modifier = modifier32;
            function3 = function32;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
            invoke(composer2, num.intValue());
            return Unit.INSTANCE;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@Nullable Composer composer2, int i6) {
            if ((i6 & 3) != 2 || !composer2.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(723773237, i6, -1, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu.<anonymous> (ExposedDropdownMenu.android.kt:297)");
                }
                MenuKt.DropdownMenuContent(mutableTransitionState, mutableState, scrollState, ExposedDropdownMenuBoxScope.exposedDropdownSize$default(exposedDropdownMenuBoxScope, modifier, false, 1, null), function3, composer2, MutableTransitionState.$stable | 48, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer2.skipToGroupEnd();
        }
    }
}
