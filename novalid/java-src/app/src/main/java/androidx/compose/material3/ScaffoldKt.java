package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.material3.FabPosition;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.layout.Measurable;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.MeasureScope;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.layout.SubcomposeLayoutKt;
import androidx.compose.p003ui.layout.SubcomposeMeasureScope;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.ConstraintsKt;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.profileinstaller.ProfileVerifier;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
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

/* compiled from: Scaffold.kt */
@Metadata(m7104d1 = {"\u0000X\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0087\u0001\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0011\u0010\u0017\u001a\r\u0012\u0004\u0012\u00020\u00140\u0018¢\u0006\u0002\b\u00192\u0017\u0010\u001a\u001a\u0013\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00140\u001b¢\u0006\u0002\b\u00192\u0011\u0010\u001d\u001a\r\u0012\u0004\u0012\u00020\u00140\u0018¢\u0006\u0002\b\u00192\u0011\u0010\u001e\u001a\r\u0012\u0004\u0012\u00020\u00140\u0018¢\u0006\u0002\b\u00192\u0006\u0010\u001f\u001a\u00020 2\u0011\u0010!\u001a\r\u0012\u0004\u0012\u00020\u00140\u0018¢\u0006\u0002\b\u0019H\u0003ø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001a±\u0001\u0010$\u001a\u00020\u00142\b\b\u0002\u0010%\u001a\u00020&2\u0013\b\u0002\u0010\u0017\u001a\r\u0012\u0004\u0012\u00020\u00140\u0018¢\u0006\u0002\b\u00192\u0013\b\u0002\u0010!\u001a\r\u0012\u0004\u0012\u00020\u00140\u0018¢\u0006\u0002\b\u00192\u0013\b\u0002\u0010'\u001a\r\u0012\u0004\u0012\u00020\u00140\u0018¢\u0006\u0002\b\u00192\u0013\b\u0002\u0010(\u001a\r\u0012\u0004\u0012\u00020\u00140\u0018¢\u0006\u0002\b\u00192\b\b\u0002\u0010)\u001a\u00020\u00162\b\b\u0002\u0010*\u001a\u00020+2\b\b\u0002\u0010,\u001a\u00020+2\b\b\u0002\u0010\u001f\u001a\u00020 2\u0017\u0010\u001a\u001a\u0013\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00140\u001b¢\u0006\u0002\b\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b-\u0010.\u001a\u0087\u0001\u0010/\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0011\u0010\u0017\u001a\r\u0012\u0004\u0012\u00020\u00140\u0018¢\u0006\u0002\b\u00192\u0017\u0010\u001a\u001a\u0013\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00140\u001b¢\u0006\u0002\b\u00192\u0011\u0010\u001d\u001a\r\u0012\u0004\u0012\u00020\u00140\u0018¢\u0006\u0002\b\u00192\u0011\u0010\u001e\u001a\r\u0012\u0004\u0012\u00020\u00140\u0018¢\u0006\u0002\b\u00192\u0006\u0010\u001f\u001a\u00020 2\u0011\u0010!\u001a\r\u0012\u0004\u0012\u00020\u00140\u0018¢\u0006\u0002\b\u0019H\u0003ø\u0001\u0000¢\u0006\u0004\b0\u0010#\u001a\u0087\u0001\u00101\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0011\u0010\u0017\u001a\r\u0012\u0004\u0012\u00020\u00140\u0018¢\u0006\u0002\b\u00192\u0017\u0010\u001a\u001a\u0013\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00140\u001b¢\u0006\u0002\b\u00192\u0011\u0010\u001d\u001a\r\u0012\u0004\u0012\u00020\u00140\u0018¢\u0006\u0002\b\u00192\u0011\u0010\u001e\u001a\r\u0012\u0004\u0012\u00020\u00140\u0018¢\u0006\u0002\b\u00192\u0006\u0010\u001f\u001a\u00020 2\u0011\u0010!\u001a\r\u0012\u0004\u0012\u00020\u00140\u0018¢\u0006\u0002\b\u0019H\u0003ø\u0001\u0000¢\u0006\u0004\b2\u0010#\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u001c\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"1\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0087\u008e\u0002¢\u0006\u0018\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00063"}, m7105d2 = {"FabSpacing", "Landroidx/compose/ui/unit/Dp;", "F", "LocalFabPlacement", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/material3/FabPlacement;", "getLocalFabPlacement", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "<set-?>", "", "ScaffoldSubcomposeInMeasureFix", "getScaffoldSubcomposeInMeasureFix$annotations", "()V", "getScaffoldSubcomposeInMeasureFix", "()Z", "setScaffoldSubcomposeInMeasureFix", "(Z)V", "ScaffoldSubcomposeInMeasureFix$delegate", "Landroidx/compose/runtime/MutableState;", "LegacyScaffoldLayout", "", "fabPosition", "Landroidx/compose/material3/FabPosition;", "topBar", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/PaddingValues;", "snackbar", "fab", "contentWindowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "bottomBar", "LegacyScaffoldLayout-FMILGgc", "(ILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Scaffold", "modifier", "Landroidx/compose/ui/Modifier;", "snackbarHost", "floatingActionButton", "floatingActionButtonPosition", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "Scaffold-TvnljyQ", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;IJJLandroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "ScaffoldLayout", "ScaffoldLayout-FMILGgc", "ScaffoldLayoutWithMeasureFix", "ScaffoldLayoutWithMeasureFix-FMILGgc", "material3_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scaffold.kt\nandroidx/compose/material3/ScaffoldKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,598:1\n1116#2,6:599\n1116#2,6:605\n1116#2,6:611\n1116#2,6:617\n81#3:623\n107#3,2:624\n154#4:626\n*S KotlinDebug\n*F\n+ 1 Scaffold.kt\nandroidx/compose/material3/ScaffoldKt\n*L\n98#1:599,6\n102#1:605,6\n179#1:611,6\n349#1:617,6\n572#1:623\n572#1:624,2\n595#1:626\n*E\n"})
/* loaded from: classes2.dex */
public final class ScaffoldKt {

    @NotNull
    private static final MutableState ScaffoldSubcomposeInMeasureFix$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);

    @NotNull
    private static final ProvidableCompositionLocal<FabPlacement> LocalFabPlacement = CompositionLocalKt.staticCompositionLocalOf(new Function0<FabPlacement>() { // from class: androidx.compose.material3.ScaffoldKt$LocalFabPlacement$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final FabPlacement invoke() {
            return null;
        }
    });
    private static final float FabSpacing = C2046Dp.m13666constructorimpl(16);

    @ExperimentalMaterial3Api
    public static /* synthetic */ void getScaffoldSubcomposeInMeasureFix$annotations() {
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:198:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x010c  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][_][_][_][_]]")
    /* renamed from: Scaffold-TvnljyQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m9679ScaffoldTvnljyQ(@Nullable Modifier modifier, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Function2<? super Composer, ? super Integer, Unit> function22, @Nullable Function2<? super Composer, ? super Integer, Unit> function23, @Nullable Function2<? super Composer, ? super Integer, Unit> function24, int i, long j, long j2, @Nullable WindowInsets windowInsets, @NotNull final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function3, @Nullable Composer composer, final int i2, final int i3) {
        int i4;
        Function2<? super Composer, ? super Integer, Unit> function25;
        int i5;
        Function2<? super Composer, ? super Integer, Unit> function26;
        int i6;
        int i7;
        Function2<? super Composer, ? super Integer, Unit> function27;
        int i8;
        int i9;
        long jM9292contentColorForek8zF_U;
        Modifier modifier2;
        Function2<? super Composer, ? super Integer, Unit> function2M9327getLambda1$material3_release;
        Function2<? super Composer, ? super Integer, Unit> function2M9328getLambda2$material3_release;
        Function2<? super Composer, ? super Integer, Unit> function2M9329getLambda3$material3_release;
        Function2<? super Composer, ? super Integer, Unit> function2M9330getLambda4$material3_release;
        int iM9456getEndERTFSPs;
        int i10;
        long background;
        final WindowInsets contentWindowInsets;
        int i11;
        long j3;
        boolean z;
        Object objRememberedValue;
        final MutableWindowInsets mutableWindowInsets;
        boolean zChanged;
        Object objRememberedValue2;
        long j4;
        final Function2<? super Composer, ? super Integer, Unit> function28;
        final Function2<? super Composer, ? super Integer, Unit> function29;
        final Function2<? super Composer, ? super Integer, Unit> function210;
        WindowInsets windowInsets2;
        long j5;
        Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1219521777);
        int i12 = i3 & 1;
        if (i12 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i13 = i3 & 2;
        if (i13 != 0) {
            i4 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                function25 = function2;
                i4 |= composerStartRestartGroup.changedInstance(function25) ? 32 : 16;
            }
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else {
                if ((i2 & 384) == 0) {
                    function26 = function22;
                    i4 |= composerStartRestartGroup.changedInstance(function26) ? 256 : 128;
                }
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= 3072;
                } else {
                    if ((i2 & 3072) == 0) {
                        i4 |= composerStartRestartGroup.changedInstance(function23) ? 2048 : 1024;
                    }
                    i7 = i3 & 16;
                    if (i7 == 0) {
                        i4 |= CpioConstants.C_ISBLK;
                    } else {
                        if ((i2 & CpioConstants.C_ISBLK) == 0) {
                            function27 = function24;
                            i4 |= composerStartRestartGroup.changedInstance(function27) ? 16384 : 8192;
                        }
                        i8 = i3 & 32;
                        if (i8 != 0) {
                            i4 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                        } else if ((i2 & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
                            i4 |= composerStartRestartGroup.changed(i) ? 131072 : 65536;
                        }
                        if ((i2 & 1572864) == 0) {
                            i9 = i7;
                            i4 |= ((i3 & 64) == 0 && composerStartRestartGroup.changed(j)) ? 1048576 : 524288;
                        } else {
                            i9 = i7;
                        }
                        if ((i2 & 12582912) == 0) {
                            jM9292contentColorForek8zF_U = j2;
                            i4 |= ((i3 & 128) == 0 && composerStartRestartGroup.changed(jM9292contentColorForek8zF_U)) ? 8388608 : 4194304;
                        } else {
                            jM9292contentColorForek8zF_U = j2;
                        }
                        if ((i2 & 100663296) == 0) {
                            i4 |= ((i3 & 256) == 0 && composerStartRestartGroup.changed(windowInsets)) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                        }
                        if ((i3 & 512) == 0) {
                            if ((i2 & 805306368) == 0) {
                                i4 |= composerStartRestartGroup.changedInstance(function3) ? 536870912 : 268435456;
                            }
                            if ((i4 & 306783379) == 306783378 || !composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.startDefaults();
                                if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                    modifier2 = i12 == 0 ? Modifier.INSTANCE : modifier;
                                    function2M9327getLambda1$material3_release = i13 == 0 ? ComposableSingletons$ScaffoldKt.INSTANCE.m9327getLambda1$material3_release() : function25;
                                    function2M9328getLambda2$material3_release = i5 == 0 ? ComposableSingletons$ScaffoldKt.INSTANCE.m9328getLambda2$material3_release() : function26;
                                    function2M9329getLambda3$material3_release = i6 == 0 ? ComposableSingletons$ScaffoldKt.INSTANCE.m9329getLambda3$material3_release() : function23;
                                    function2M9330getLambda4$material3_release = i9 == 0 ? ComposableSingletons$ScaffoldKt.INSTANCE.m9330getLambda4$material3_release() : function27;
                                    iM9456getEndERTFSPs = i8 == 0 ? FabPosition.INSTANCE.m9456getEndERTFSPs() : i;
                                    if ((i3 & 64) == 0) {
                                        i10 = i4 & (-3670017);
                                        background = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).getBackground();
                                    } else {
                                        i10 = i4;
                                        background = j;
                                    }
                                    if ((i3 & 128) != 0) {
                                        jM9292contentColorForek8zF_U = ColorSchemeKt.m9292contentColorForek8zF_U(background, composerStartRestartGroup, (i10 >> 18) & 14);
                                        i10 &= -29360129;
                                    }
                                    if ((i3 & 256) == 0) {
                                        contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                                        i10 &= -234881025;
                                    }
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1219521777, i10, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:96)");
                                    }
                                    composerStartRestartGroup.startReplaceableGroup(-889185358);
                                    i11 = (234881024 & i10) ^ 100663296;
                                    if (i11 <= 67108864 || !composerStartRestartGroup.changed(contentWindowInsets)) {
                                        j3 = jM9292contentColorForek8zF_U;
                                        if ((i10 & 100663296) != 67108864) {
                                            z = false;
                                        }
                                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                                        if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = new MutableWindowInsets(contentWindowInsets);
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                        }
                                        mutableWindowInsets = (MutableWindowInsets) objRememberedValue;
                                        composerStartRestartGroup.endReplaceableGroup();
                                        composerStartRestartGroup.startReplaceableGroup(-889185200);
                                        zChanged = composerStartRestartGroup.changed(mutableWindowInsets) | ((i11 <= 67108864 && composerStartRestartGroup.changed(contentWindowInsets)) || (100663296 & i10) == 67108864);
                                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                        if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue2 = new Function1<WindowInsets, Unit>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(WindowInsets windowInsets3) {
                                                    invoke2(windowInsets3);
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(@NotNull WindowInsets windowInsets3) {
                                                    mutableWindowInsets.setInsets(WindowInsetsKt.exclude(contentWindowInsets, windowInsets3));
                                                }
                                            };
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                        }
                                        composerStartRestartGroup.endReplaceableGroup();
                                        final int i14 = iM9456getEndERTFSPs;
                                        final Function2<? super Composer, ? super Integer, Unit> function211 = function2M9327getLambda1$material3_release;
                                        final Function2<? super Composer, ? super Integer, Unit> function212 = function2M9329getLambda3$material3_release;
                                        final Function2<? super Composer, ? super Integer, Unit> function213 = function2M9330getLambda4$material3_release;
                                        final Function2<? super Composer, ? super Integer, Unit> function214 = function2M9328getLambda2$material3_release;
                                        int i15 = i10 >> 12;
                                        SurfaceKt.m9876SurfaceT9BRK9s(WindowInsetsPaddingKt.onConsumedWindowInsetsChanged(modifier2, (Function1) objRememberedValue2), null, background, j3, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1979205334, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
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
                                            public final void invoke(@Nullable Composer composer2, int i16) {
                                                if ((i16 & 3) != 2 || !composer2.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-1979205334, i16, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:107)");
                                                    }
                                                    ScaffoldKt.m9680ScaffoldLayoutFMILGgc(i14, function211, function3, function212, function213, mutableWindowInsets, function214, composer2, 0);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer2.skipToGroupEnd();
                                            }
                                        }), composerStartRestartGroup, (i15 & 896) | 12582912 | (i15 & 7168), 114);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        j4 = background;
                                        function28 = function2M9328getLambda2$material3_release;
                                        function29 = function2M9329getLambda3$material3_release;
                                        function210 = function2M9330getLambda4$material3_release;
                                        windowInsets2 = contentWindowInsets;
                                        j5 = j3;
                                        function25 = function2M9327getLambda1$material3_release;
                                        modifier3 = modifier2;
                                    } else {
                                        j3 = jM9292contentColorForek8zF_U;
                                    }
                                    z = true;
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (z) {
                                        objRememberedValue = new MutableWindowInsets(contentWindowInsets);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                        mutableWindowInsets = (MutableWindowInsets) objRememberedValue;
                                        composerStartRestartGroup.endReplaceableGroup();
                                        composerStartRestartGroup.startReplaceableGroup(-889185200);
                                        if (i11 <= 67108864) {
                                            zChanged = composerStartRestartGroup.changed(mutableWindowInsets) | ((i11 <= 67108864 && composerStartRestartGroup.changed(contentWindowInsets)) || (100663296 & i10) == 67108864);
                                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                            if (zChanged) {
                                                objRememberedValue2 = new Function1<WindowInsets, Unit>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public /* bridge */ /* synthetic */ Unit invoke(WindowInsets windowInsets3) {
                                                        invoke2(windowInsets3);
                                                        return Unit.INSTANCE;
                                                    }

                                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                    public final void invoke2(@NotNull WindowInsets windowInsets3) {
                                                        mutableWindowInsets.setInsets(WindowInsetsKt.exclude(contentWindowInsets, windowInsets3));
                                                    }
                                                };
                                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                                composerStartRestartGroup.endReplaceableGroup();
                                                final int i142 = iM9456getEndERTFSPs;
                                                final Function2<? super Composer, ? super Integer, Unit> function2112 = function2M9327getLambda1$material3_release;
                                                final Function2<? super Composer, ? super Integer, Unit> function2122 = function2M9329getLambda3$material3_release;
                                                final Function2<? super Composer, ? super Integer, Unit> function2132 = function2M9330getLambda4$material3_release;
                                                final Function2<? super Composer, ? super Integer, Unit> function2142 = function2M9328getLambda2$material3_release;
                                                int i152 = i10 >> 12;
                                                SurfaceKt.m9876SurfaceT9BRK9s(WindowInsetsPaddingKt.onConsumedWindowInsetsChanged(modifier2, (Function1) objRememberedValue2), null, background, j3, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1979205334, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
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
                                                    public final void invoke(@Nullable Composer composer2, int i16) {
                                                        if ((i16 & 3) != 2 || !composer2.getSkipping()) {
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(-1979205334, i16, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:107)");
                                                            }
                                                            ScaffoldKt.m9680ScaffoldLayoutFMILGgc(i142, function2112, function3, function2122, function2132, mutableWindowInsets, function2142, composer2, 0);
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        composer2.skipToGroupEnd();
                                                    }
                                                }), composerStartRestartGroup, (i152 & 896) | 12582912 | (i152 & 7168), 114);
                                                if (ComposerKt.isTraceInProgress()) {
                                                }
                                                j4 = background;
                                                function28 = function2M9328getLambda2$material3_release;
                                                function29 = function2M9329getLambda3$material3_release;
                                                function210 = function2M9330getLambda4$material3_release;
                                                windowInsets2 = contentWindowInsets;
                                                j5 = j3;
                                                function25 = function2M9327getLambda1$material3_release;
                                                modifier3 = modifier2;
                                            }
                                        } else {
                                            zChanged = composerStartRestartGroup.changed(mutableWindowInsets) | ((i11 <= 67108864 && composerStartRestartGroup.changed(contentWindowInsets)) || (100663296 & i10) == 67108864);
                                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                            if (zChanged) {
                                            }
                                        }
                                    }
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    if ((i3 & 64) != 0) {
                                        i4 &= -3670017;
                                    }
                                    if ((i3 & 128) != 0) {
                                        i4 &= -29360129;
                                    }
                                    if ((i3 & 256) != 0) {
                                        i4 &= -234881025;
                                    }
                                    modifier2 = modifier;
                                    i10 = i4;
                                    function2M9327getLambda1$material3_release = function25;
                                    function2M9328getLambda2$material3_release = function26;
                                    function2M9330getLambda4$material3_release = function27;
                                    function2M9329getLambda3$material3_release = function23;
                                    iM9456getEndERTFSPs = i;
                                    background = j;
                                }
                                contentWindowInsets = windowInsets;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                composerStartRestartGroup.startReplaceableGroup(-889185358);
                                i11 = (234881024 & i10) ^ 100663296;
                                if (i11 <= 67108864) {
                                    j3 = jM9292contentColorForek8zF_U;
                                    if ((i10 & 100663296) != 67108864) {
                                        z = true;
                                    }
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (z) {
                                    }
                                }
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                modifier3 = modifier;
                                function29 = function23;
                                windowInsets2 = windowInsets;
                                function28 = function26;
                                function210 = function27;
                                iM9456getEndERTFSPs = i;
                                j5 = jM9292contentColorForek8zF_U;
                                j4 = j;
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                final Modifier modifier4 = modifier3;
                                final Function2<? super Composer, ? super Integer, Unit> function215 = function25;
                                final int i16 = iM9456getEndERTFSPs;
                                final long j6 = j4;
                                final long j7 = j5;
                                final WindowInsets windowInsets3 = windowInsets2;
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$3
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

                                    public final void invoke(@Nullable Composer composer2, int i17) {
                                        ScaffoldKt.m9679ScaffoldTvnljyQ(modifier4, function215, function28, function29, function210, i16, j6, j7, windowInsets3, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i4 |= 805306368;
                        if ((i4 & 306783379) == 306783378) {
                            composerStartRestartGroup.startDefaults();
                            if ((i2 & 1) != 0) {
                                if (i12 == 0) {
                                }
                                if (i13 == 0) {
                                }
                                if (i5 == 0) {
                                }
                                if (i6 == 0) {
                                }
                                if (i9 == 0) {
                                }
                                if (i8 == 0) {
                                }
                                if ((i3 & 64) == 0) {
                                }
                                if ((i3 & 128) != 0) {
                                }
                                if ((i3 & 256) == 0) {
                                    contentWindowInsets = windowInsets;
                                }
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                composerStartRestartGroup.startReplaceableGroup(-889185358);
                                i11 = (234881024 & i10) ^ 100663296;
                                if (i11 <= 67108864) {
                                }
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    function27 = function24;
                    i8 = i3 & 32;
                    if (i8 != 0) {
                    }
                    if ((i2 & 1572864) == 0) {
                    }
                    if ((i2 & 12582912) == 0) {
                    }
                    if ((i2 & 100663296) == 0) {
                    }
                    if ((i3 & 512) == 0) {
                    }
                    if ((i4 & 306783379) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                i7 = i3 & 16;
                if (i7 == 0) {
                }
                function27 = function24;
                i8 = i3 & 32;
                if (i8 != 0) {
                }
                if ((i2 & 1572864) == 0) {
                }
                if ((i2 & 12582912) == 0) {
                }
                if ((i2 & 100663296) == 0) {
                }
                if ((i3 & 512) == 0) {
                }
                if ((i4 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            function26 = function22;
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            i7 = i3 & 16;
            if (i7 == 0) {
            }
            function27 = function24;
            i8 = i3 & 32;
            if (i8 != 0) {
            }
            if ((i2 & 1572864) == 0) {
            }
            if ((i2 & 12582912) == 0) {
            }
            if ((i2 & 100663296) == 0) {
            }
            if ((i3 & 512) == 0) {
            }
            if ((i4 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        function25 = function2;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        function26 = function22;
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        i7 = i3 & 16;
        if (i7 == 0) {
        }
        function27 = function24;
        i8 = i3 & 32;
        if (i8 != 0) {
        }
        if ((i2 & 1572864) == 0) {
        }
        if ((i2 & 12582912) == 0) {
        }
        if ((i2 & 100663296) == 0) {
        }
        if ((i3 & 512) == 0) {
        }
        if ((i4 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][_][_][_][_]]")
    /* renamed from: ScaffoldLayout-FMILGgc, reason: not valid java name */
    public static final void m9680ScaffoldLayoutFMILGgc(final int i, final Function2<? super Composer, ? super Integer, Unit> function2, final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function3, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final WindowInsets windowInsets, final Function2<? super Composer, ? super Integer, Unit> function24, Composer composer, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-975511942);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function3) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function22) ? 2048 : 1024;
        }
        if ((i2 & CpioConstants.C_ISBLK) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function23) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(windowInsets) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function24) ? 1048576 : 524288;
        }
        if ((599187 & i3) != 599186 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-975511942, i3, -1, "androidx.compose.material3.ScaffoldLayout (Scaffold.kt:141)");
            }
            if (getScaffoldSubcomposeInMeasureFix()) {
                composerStartRestartGroup.startReplaceableGroup(-915303637);
                m9681ScaffoldLayoutWithMeasureFixFMILGgc(i, function2, function3, function22, function23, windowInsets, function24, composerStartRestartGroup, i3 & 4194302);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(-915303332);
                m9678LegacyScaffoldLayoutFMILGgc(i, function2, function3, function22, function23, windowInsets, function24, composerStartRestartGroup, i3 & 4194302);
                composerStartRestartGroup.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ScaffoldKt$ScaffoldLayout$1
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

                public final void invoke(@Nullable Composer composer2, int i4) {
                    ScaffoldKt.m9680ScaffoldLayoutFMILGgc(i, function2, function3, function22, function23, windowInsets, function24, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][_][_][_][_]]")
    /* renamed from: ScaffoldLayoutWithMeasureFix-FMILGgc, reason: not valid java name */
    public static final void m9681ScaffoldLayoutWithMeasureFixFMILGgc(final int i, final Function2<? super Composer, ? super Integer, Unit> function2, final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function3, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final WindowInsets windowInsets, final Function2<? super Composer, ? super Integer, Unit> function24, Composer composer, final int i2) {
        int i3;
        int i4;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2037614249);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function3) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function22) ? 2048 : 1024;
        }
        if ((i2 & CpioConstants.C_ISBLK) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function23) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(windowInsets) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function24) ? 1048576 : 524288;
        }
        if ((i3 & 599187) != 599186 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2037614249, i3, -1, "androidx.compose.material3.ScaffoldLayoutWithMeasureFix (Scaffold.kt:177)");
            }
            composerStartRestartGroup.startReplaceableGroup(-273325894);
            boolean z = ((i3 & 112) == 32) | ((i3 & 7168) == 2048) | ((458752 & i3) == 131072) | ((57344 & i3) == 16384) | ((i3 & 14) == 4) | ((3670016 & i3) == 1048576) | ((i3 & 896) == 256);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                i4 = 1;
                objRememberedValue = new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material3.ScaffoldKt$ScaffoldLayoutWithMeasureFix$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                        return m9686invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                    }

                    @NotNull
                    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                    public final MeasureResult m9686invoke0kLqBqw(@NotNull final SubcomposeMeasureScope subcomposeMeasureScope, long j) {
                        Object obj;
                        Object obj2;
                        Object obj3;
                        final FabPlacement fabPlacement;
                        Object obj4;
                        Integer numValueOf;
                        int i5;
                        int iIntValue;
                        int height;
                        int bottom;
                        Object obj5;
                        Object obj6;
                        int iMo7868roundToPx0680j_4;
                        int iMo7868roundToPx0680j_42;
                        final int iM13622getMaxWidthimpl = Constraints.m13622getMaxWidthimpl(j);
                        final int iM13621getMaxHeightimpl = Constraints.m13621getMaxHeightimpl(j);
                        long jM13613copyZbe2FdA$default = Constraints.m13613copyZbe2FdA$default(j, 0, 0, 0, 0, 10, null);
                        List<Measurable> listSubcompose = subcomposeMeasureScope.subcompose(ScaffoldLayoutContent.TopBar, function2);
                        final ArrayList arrayList = new ArrayList(listSubcompose.size());
                        int size = listSubcompose.size();
                        for (int i6 = 0; i6 < size; i6++) {
                            arrayList.add(listSubcompose.get(i6).mo12610measureBRTryo0(jM13613copyZbe2FdA$default));
                        }
                        if (arrayList.isEmpty()) {
                            obj = null;
                        } else {
                            obj = arrayList.get(0);
                            int height2 = ((Placeable) obj).getHeight();
                            int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(arrayList);
                            if (1 <= lastIndex) {
                                int i7 = 1;
                                while (true) {
                                    Object obj7 = arrayList.get(i7);
                                    int height3 = ((Placeable) obj7).getHeight();
                                    if (height2 < height3) {
                                        obj = obj7;
                                        height2 = height3;
                                    }
                                    if (i7 == lastIndex) {
                                        break;
                                    }
                                    i7++;
                                }
                            }
                        }
                        Placeable placeable = (Placeable) obj;
                        final int height4 = placeable != null ? placeable.getHeight() : 0;
                        List<Measurable> listSubcompose2 = subcomposeMeasureScope.subcompose(ScaffoldLayoutContent.Snackbar, function22);
                        WindowInsets windowInsets2 = windowInsets;
                        final ArrayList arrayList2 = new ArrayList(listSubcompose2.size());
                        int size2 = listSubcompose2.size();
                        for (int i8 = 0; i8 < size2; i8++) {
                            arrayList2.add(listSubcompose2.get(i8).mo12610measureBRTryo0(ConstraintsKt.m13638offsetNN6EwU(jM13613copyZbe2FdA$default, (-windowInsets2.getLeft(subcomposeMeasureScope, subcomposeMeasureScope.getLayoutDirection())) - windowInsets2.getRight(subcomposeMeasureScope, subcomposeMeasureScope.getLayoutDirection()), -windowInsets2.getBottom(subcomposeMeasureScope))));
                        }
                        if (arrayList2.isEmpty()) {
                            obj2 = null;
                        } else {
                            obj2 = arrayList2.get(0);
                            int height5 = ((Placeable) obj2).getHeight();
                            int lastIndex2 = CollectionsKt__CollectionsKt.getLastIndex(arrayList2);
                            if (1 <= lastIndex2) {
                                Object obj8 = obj2;
                                int i9 = height5;
                                int i10 = 1;
                                while (true) {
                                    Object obj9 = arrayList2.get(i10);
                                    int height6 = ((Placeable) obj9).getHeight();
                                    if (i9 < height6) {
                                        obj8 = obj9;
                                        i9 = height6;
                                    }
                                    if (i10 == lastIndex2) {
                                        break;
                                    }
                                    i10++;
                                }
                                obj2 = obj8;
                            }
                        }
                        Placeable placeable2 = (Placeable) obj2;
                        int height7 = placeable2 != null ? placeable2.getHeight() : 0;
                        if (arrayList2.isEmpty()) {
                            obj3 = null;
                        } else {
                            obj3 = arrayList2.get(0);
                            int width = ((Placeable) obj3).getWidth();
                            int lastIndex3 = CollectionsKt__CollectionsKt.getLastIndex(arrayList2);
                            if (1 <= lastIndex3) {
                                Object obj10 = obj3;
                                int i11 = width;
                                int i12 = 1;
                                while (true) {
                                    Object obj11 = arrayList2.get(i12);
                                    int width2 = ((Placeable) obj11).getWidth();
                                    if (i11 < width2) {
                                        obj10 = obj11;
                                        i11 = width2;
                                    }
                                    if (i12 == lastIndex3) {
                                        break;
                                    }
                                    i12++;
                                }
                                obj3 = obj10;
                            }
                        }
                        Placeable placeable3 = (Placeable) obj3;
                        int width3 = placeable3 != null ? placeable3.getWidth() : 0;
                        List<Measurable> listSubcompose3 = subcomposeMeasureScope.subcompose(ScaffoldLayoutContent.Fab, function23);
                        WindowInsets windowInsets3 = windowInsets;
                        final ArrayList arrayList3 = new ArrayList(listSubcompose3.size());
                        int size3 = listSubcompose3.size();
                        int i13 = 0;
                        while (i13 < size3) {
                            List<Measurable> list = listSubcompose3;
                            int i14 = size3;
                            WindowInsets windowInsets4 = windowInsets3;
                            Placeable placeableMo12610measureBRTryo0 = listSubcompose3.get(i13).mo12610measureBRTryo0(ConstraintsKt.m13638offsetNN6EwU(jM13613copyZbe2FdA$default, (-windowInsets3.getLeft(subcomposeMeasureScope, subcomposeMeasureScope.getLayoutDirection())) - windowInsets3.getRight(subcomposeMeasureScope, subcomposeMeasureScope.getLayoutDirection()), -windowInsets3.getBottom(subcomposeMeasureScope)));
                            if (placeableMo12610measureBRTryo0.getHeight() == 0 || placeableMo12610measureBRTryo0.getWidth() == 0) {
                                placeableMo12610measureBRTryo0 = null;
                            }
                            if (placeableMo12610measureBRTryo0 != null) {
                                arrayList3.add(placeableMo12610measureBRTryo0);
                            }
                            i13++;
                            windowInsets3 = windowInsets4;
                            listSubcompose3 = list;
                            size3 = i14;
                        }
                        if (!arrayList3.isEmpty()) {
                            if (arrayList3.isEmpty()) {
                                obj5 = null;
                            } else {
                                obj5 = arrayList3.get(0);
                                int width4 = ((Placeable) obj5).getWidth();
                                int lastIndex4 = CollectionsKt__CollectionsKt.getLastIndex(arrayList3);
                                if (1 <= lastIndex4) {
                                    int i15 = width4;
                                    int i16 = 1;
                                    while (true) {
                                        Object obj12 = arrayList3.get(i16);
                                        int width5 = ((Placeable) obj12).getWidth();
                                        if (i15 < width5) {
                                            obj5 = obj12;
                                            i15 = width5;
                                        }
                                        if (i16 == lastIndex4) {
                                            break;
                                        }
                                        i16++;
                                    }
                                }
                            }
                            Intrinsics.checkNotNull(obj5);
                            int width6 = ((Placeable) obj5).getWidth();
                            if (arrayList3.isEmpty()) {
                                obj6 = null;
                            } else {
                                obj6 = arrayList3.get(0);
                                int height8 = ((Placeable) obj6).getHeight();
                                int lastIndex5 = CollectionsKt__CollectionsKt.getLastIndex(arrayList3);
                                if (1 <= lastIndex5) {
                                    Object obj13 = obj6;
                                    int i17 = height8;
                                    int i18 = 1;
                                    while (true) {
                                        Object obj14 = arrayList3.get(i18);
                                        Object obj15 = obj13;
                                        int height9 = ((Placeable) obj14).getHeight();
                                        if (i17 < height9) {
                                            i17 = height9;
                                            obj13 = obj14;
                                        } else {
                                            obj13 = obj15;
                                        }
                                        if (i18 == lastIndex5) {
                                            break;
                                        }
                                        i18++;
                                    }
                                    obj6 = obj13;
                                }
                            }
                            Intrinsics.checkNotNull(obj6);
                            int height10 = ((Placeable) obj6).getHeight();
                            int i19 = i;
                            FabPosition.Companion companion = FabPosition.INSTANCE;
                            if (FabPosition.m9451equalsimpl0(i19, companion.m9458getStartERTFSPs())) {
                                if (subcomposeMeasureScope.getLayoutDirection() == LayoutDirection.Ltr) {
                                    iMo7868roundToPx0680j_4 = subcomposeMeasureScope.mo7868roundToPx0680j_4(ScaffoldKt.FabSpacing);
                                    fabPlacement = new FabPlacement(iMo7868roundToPx0680j_4, width6, height10);
                                } else {
                                    iMo7868roundToPx0680j_42 = subcomposeMeasureScope.mo7868roundToPx0680j_4(ScaffoldKt.FabSpacing);
                                    iMo7868roundToPx0680j_4 = (iM13622getMaxWidthimpl - iMo7868roundToPx0680j_42) - width6;
                                    fabPlacement = new FabPlacement(iMo7868roundToPx0680j_4, width6, height10);
                                }
                            } else {
                                if (FabPosition.m9451equalsimpl0(i19, companion.m9456getEndERTFSPs()) ? true : FabPosition.m9451equalsimpl0(i19, companion.m9457getEndOverlayERTFSPs())) {
                                    if (subcomposeMeasureScope.getLayoutDirection() == LayoutDirection.Ltr) {
                                        iMo7868roundToPx0680j_42 = subcomposeMeasureScope.mo7868roundToPx0680j_4(ScaffoldKt.FabSpacing);
                                        iMo7868roundToPx0680j_4 = (iM13622getMaxWidthimpl - iMo7868roundToPx0680j_42) - width6;
                                    } else {
                                        iMo7868roundToPx0680j_4 = subcomposeMeasureScope.mo7868roundToPx0680j_4(ScaffoldKt.FabSpacing);
                                    }
                                } else {
                                    iMo7868roundToPx0680j_4 = (iM13622getMaxWidthimpl - width6) / 2;
                                }
                                fabPlacement = new FabPlacement(iMo7868roundToPx0680j_4, width6, height10);
                            }
                        } else {
                            fabPlacement = null;
                        }
                        ScaffoldLayoutContent scaffoldLayoutContent = ScaffoldLayoutContent.BottomBar;
                        final Function2<Composer, Integer, Unit> function25 = function24;
                        List<Measurable> listSubcompose4 = subcomposeMeasureScope.subcompose(scaffoldLayoutContent, ComposableLambdaKt.composableLambdaInstance(1843374446, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ScaffoldKt$ScaffoldLayoutWithMeasureFix$1$1$bottomBarPlaceables$1
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

                            @Composable
                            public final void invoke(@Nullable Composer composer2, int i20) {
                                if ((i20 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1843374446, i20, -1, "androidx.compose.material3.ScaffoldLayoutWithMeasureFix.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:258)");
                                    }
                                    CompositionLocalKt.CompositionLocalProvider(ScaffoldKt.getLocalFabPlacement().provides(fabPlacement), function25, composer2, ProvidedValue.$stable);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }
                        }));
                        final ArrayList arrayList4 = new ArrayList(listSubcompose4.size());
                        int size4 = listSubcompose4.size();
                        for (int i20 = 0; i20 < size4; i20++) {
                            arrayList4.add(listSubcompose4.get(i20).mo12610measureBRTryo0(jM13613copyZbe2FdA$default));
                        }
                        if (arrayList4.isEmpty()) {
                            obj4 = null;
                        } else {
                            obj4 = arrayList4.get(0);
                            int height11 = ((Placeable) obj4).getHeight();
                            int lastIndex6 = CollectionsKt__CollectionsKt.getLastIndex(arrayList4);
                            if (1 <= lastIndex6) {
                                int i21 = 1;
                                while (true) {
                                    Object obj16 = arrayList4.get(i21);
                                    Object obj17 = obj4;
                                    int height12 = ((Placeable) obj16).getHeight();
                                    if (height11 < height12) {
                                        height11 = height12;
                                        obj4 = obj16;
                                    } else {
                                        obj4 = obj17;
                                    }
                                    if (i21 == lastIndex6) {
                                        break;
                                    }
                                    i21++;
                                }
                            }
                        }
                        Placeable placeable4 = (Placeable) obj4;
                        Integer numValueOf2 = placeable4 != null ? Integer.valueOf(placeable4.getHeight()) : null;
                        if (fabPlacement != null) {
                            int i22 = i;
                            WindowInsets windowInsets5 = windowInsets;
                            if (numValueOf2 == null || FabPosition.m9451equalsimpl0(i22, FabPosition.INSTANCE.m9457getEndOverlayERTFSPs())) {
                                height = fabPlacement.getHeight() + subcomposeMeasureScope.mo7868roundToPx0680j_4(ScaffoldKt.FabSpacing);
                                bottom = windowInsets5.getBottom(subcomposeMeasureScope);
                            } else {
                                height = numValueOf2.intValue() + fabPlacement.getHeight();
                                bottom = subcomposeMeasureScope.mo7868roundToPx0680j_4(ScaffoldKt.FabSpacing);
                            }
                            numValueOf = Integer.valueOf(height + bottom);
                        } else {
                            numValueOf = null;
                        }
                        if (height7 != 0) {
                            if (numValueOf != null) {
                                iIntValue = numValueOf.intValue();
                            } else {
                                iIntValue = numValueOf2 != null ? numValueOf2.intValue() : windowInsets.getBottom(subcomposeMeasureScope);
                            }
                            i5 = height7 + iIntValue;
                        } else {
                            i5 = 0;
                        }
                        ScaffoldLayoutContent scaffoldLayoutContent2 = ScaffoldLayoutContent.MainContent;
                        final WindowInsets windowInsets6 = windowInsets;
                        final Function3<PaddingValues, Composer, Integer, Unit> function32 = function3;
                        final int i23 = width3;
                        final Integer num = numValueOf2;
                        final FabPlacement fabPlacement2 = fabPlacement;
                        List<Measurable> listSubcompose5 = subcomposeMeasureScope.subcompose(scaffoldLayoutContent2, ComposableLambdaKt.composableLambdaInstance(1655277373, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ScaffoldKt$ScaffoldLayoutWithMeasureFix$1$1$bodyContentPlaceables$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num2) {
                                invoke(composer2, num2.intValue());
                                return Unit.INSTANCE;
                            }

                            @Composable
                            public final void invoke(@Nullable Composer composer2, int i24) {
                                float fMo7871toDpu2uoSUM;
                                float bottom2;
                                Integer num2;
                                if ((i24 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1655277373, i24, -1, "androidx.compose.material3.ScaffoldLayoutWithMeasureFix.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:285)");
                                    }
                                    PaddingValues paddingValuesAsPaddingValues = WindowInsetsKt.asPaddingValues(windowInsets6, subcomposeMeasureScope);
                                    if (arrayList.isEmpty()) {
                                        fMo7871toDpu2uoSUM = paddingValuesAsPaddingValues.getTop();
                                    } else {
                                        fMo7871toDpu2uoSUM = subcomposeMeasureScope.mo7871toDpu2uoSUM(height4);
                                    }
                                    if (arrayList4.isEmpty() || (num2 = num) == null) {
                                        bottom2 = paddingValuesAsPaddingValues.getBottom();
                                    } else {
                                        bottom2 = subcomposeMeasureScope.mo7871toDpu2uoSUM(num2.intValue());
                                    }
                                    function32.invoke(PaddingKt.m8119PaddingValuesa9UjIt4(PaddingKt.calculateStartPadding(paddingValuesAsPaddingValues, subcomposeMeasureScope.getLayoutDirection()), fMo7871toDpu2uoSUM, PaddingKt.calculateEndPadding(paddingValuesAsPaddingValues, subcomposeMeasureScope.getLayoutDirection()), bottom2), composer2, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }
                        }));
                        final ArrayList arrayList5 = new ArrayList(listSubcompose5.size());
                        int size5 = listSubcompose5.size();
                        for (int i24 = 0; i24 < size5; i24++) {
                            arrayList5.add(listSubcompose5.get(i24).mo12610measureBRTryo0(jM13613copyZbe2FdA$default));
                        }
                        final WindowInsets windowInsets7 = windowInsets;
                        final int i25 = i5;
                        final Integer num2 = numValueOf2;
                        final Integer num3 = numValueOf;
                        return MeasureScope.layout$default(subcomposeMeasureScope, iM13622getMaxWidthimpl, iM13621getMaxHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.ScaffoldKt$ScaffoldLayoutWithMeasureFix$1$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                invoke2(placementScope);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull Placeable.PlacementScope placementScope) {
                                List<Placeable> list2 = arrayList5;
                                int size6 = list2.size();
                                for (int i26 = 0; i26 < size6; i26++) {
                                    Placeable.PlacementScope.place$default(placementScope, list2.get(i26), 0, 0, 0.0f, 4, null);
                                }
                                List<Placeable> list3 = arrayList;
                                int size7 = list3.size();
                                for (int i27 = 0; i27 < size7; i27++) {
                                    Placeable.PlacementScope.place$default(placementScope, list3.get(i27), 0, 0, 0.0f, 4, null);
                                }
                                List<Placeable> list4 = arrayList2;
                                int i28 = iM13622getMaxWidthimpl;
                                int i29 = i23;
                                WindowInsets windowInsets8 = windowInsets7;
                                SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                                int i30 = iM13621getMaxHeightimpl;
                                int i31 = i25;
                                int size8 = list4.size();
                                for (int i32 = 0; i32 < size8; i32++) {
                                    Placeable.PlacementScope.place$default(placementScope, list4.get(i32), ((i28 - i29) / 2) + windowInsets8.getLeft(subcomposeMeasureScope2, subcomposeMeasureScope2.getLayoutDirection()), i30 - i31, 0.0f, 4, null);
                                }
                                List<Placeable> list5 = arrayList4;
                                int i33 = iM13621getMaxHeightimpl;
                                Integer num4 = num2;
                                int size9 = list5.size();
                                for (int i34 = 0; i34 < size9; i34++) {
                                    Placeable.PlacementScope.place$default(placementScope, list5.get(i34), 0, i33 - (num4 != null ? num4.intValue() : 0), 0.0f, 4, null);
                                }
                                FabPlacement fabPlacement3 = fabPlacement2;
                                if (fabPlacement3 != null) {
                                    List<Placeable> list6 = arrayList3;
                                    int i35 = iM13621getMaxHeightimpl;
                                    Integer num5 = num3;
                                    int size10 = list6.size();
                                    for (int i36 = 0; i36 < size10; i36++) {
                                        Placeable placeable5 = list6.get(i36);
                                        int left = fabPlacement3.getLeft();
                                        Intrinsics.checkNotNull(num5);
                                        Placeable.PlacementScope.place$default(placementScope, placeable5, left, i35 - num5.intValue(), 0.0f, 4, null);
                                    }
                                }
                            }
                        }, 4, null);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                i4 = 1;
            }
            composerStartRestartGroup.endReplaceableGroup();
            SubcomposeLayoutKt.SubcomposeLayout(null, (Function2) objRememberedValue, composerStartRestartGroup, 0, i4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ScaffoldKt$ScaffoldLayoutWithMeasureFix$2
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

                public final void invoke(@Nullable Composer composer2, int i5) {
                    ScaffoldKt.m9681ScaffoldLayoutWithMeasureFixFMILGgc(i, function2, function3, function22, function23, windowInsets, function24, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][_][_][_][_]]")
    /* renamed from: LegacyScaffoldLayout-FMILGgc, reason: not valid java name */
    public static final void m9678LegacyScaffoldLayoutFMILGgc(final int i, final Function2<? super Composer, ? super Integer, Unit> function2, final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function3, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final WindowInsets windowInsets, final Function2<? super Composer, ? super Integer, Unit> function24, Composer composer, final int i2) {
        int i3;
        int i4;
        Composer composerStartRestartGroup = composer.startRestartGroup(1307205667);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function3) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function22) ? 2048 : 1024;
        }
        if ((i2 & CpioConstants.C_ISBLK) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function23) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(windowInsets) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function24) ? 1048576 : 524288;
        }
        if ((i3 & 599187) != 599186 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1307205667, i3, -1, "androidx.compose.material3.LegacyScaffoldLayout (Scaffold.kt:347)");
            }
            composerStartRestartGroup.startReplaceableGroup(1646578117);
            boolean z = ((i3 & 112) == 32) | ((i3 & 7168) == 2048) | ((458752 & i3) == 131072) | ((57344 & i3) == 16384) | ((i3 & 14) == 4) | ((3670016 & i3) == 1048576) | ((i3 & 896) == 256);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                i4 = 1;
                objRememberedValue = new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material3.ScaffoldKt$LegacyScaffoldLayout$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                        return m9685invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                    }

                    @NotNull
                    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                    public final MeasureResult m9685invoke0kLqBqw(@NotNull final SubcomposeMeasureScope subcomposeMeasureScope, long j) {
                        final int iM13622getMaxWidthimpl = Constraints.m13622getMaxWidthimpl(j);
                        final int iM13621getMaxHeightimpl = Constraints.m13621getMaxHeightimpl(j);
                        final long jM13613copyZbe2FdA$default = Constraints.m13613copyZbe2FdA$default(j, 0, 0, 0, 0, 10, null);
                        final Function2<Composer, Integer, Unit> function25 = function2;
                        final Function2<Composer, Integer, Unit> function26 = function22;
                        final Function2<Composer, Integer, Unit> function27 = function23;
                        final int i5 = i;
                        final WindowInsets windowInsets2 = windowInsets;
                        final Function2<Composer, Integer, Unit> function28 = function24;
                        final Function3<PaddingValues, Composer, Integer, Unit> function32 = function3;
                        return MeasureScope.layout$default(subcomposeMeasureScope, iM13622getMaxWidthimpl, iM13621getMaxHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.ScaffoldKt$LegacyScaffoldLayout$1$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                invoke2(placementScope);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull Placeable.PlacementScope placementScope) {
                                Object obj;
                                Object obj2;
                                Object obj3;
                                final FabPlacement fabPlacement;
                                int i6;
                                Object obj4;
                                Integer numValueOf;
                                int i7;
                                int iIntValue;
                                int iIntValue2;
                                Object obj5;
                                Object obj6;
                                int iMo7868roundToPx0680j_4;
                                int i8;
                                int iMo7868roundToPx0680j_42;
                                List<Measurable> listSubcompose = subcomposeMeasureScope.subcompose(ScaffoldLayoutContent.TopBar, function25);
                                long j2 = jM13613copyZbe2FdA$default;
                                final ArrayList arrayList = new ArrayList(listSubcompose.size());
                                int size = listSubcompose.size();
                                for (int i9 = 0; i9 < size; i9++) {
                                    arrayList.add(listSubcompose.get(i9).mo12610measureBRTryo0(j2));
                                }
                                if (arrayList.isEmpty()) {
                                    obj = null;
                                } else {
                                    obj = arrayList.get(0);
                                    int height = ((Placeable) obj).getHeight();
                                    int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(arrayList);
                                    if (1 <= lastIndex) {
                                        int i10 = 1;
                                        while (true) {
                                            Object obj7 = arrayList.get(i10);
                                            int height2 = ((Placeable) obj7).getHeight();
                                            if (height < height2) {
                                                obj = obj7;
                                                height = height2;
                                            }
                                            if (i10 == lastIndex) {
                                                break;
                                            } else {
                                                i10++;
                                            }
                                        }
                                    }
                                }
                                Placeable placeable = (Placeable) obj;
                                final int height3 = placeable != null ? placeable.getHeight() : 0;
                                List<Measurable> listSubcompose2 = subcomposeMeasureScope.subcompose(ScaffoldLayoutContent.Snackbar, function26);
                                WindowInsets windowInsets3 = windowInsets2;
                                SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                                long j3 = jM13613copyZbe2FdA$default;
                                ArrayList arrayList2 = new ArrayList(listSubcompose2.size());
                                int size2 = listSubcompose2.size();
                                for (int i11 = 0; i11 < size2; i11++) {
                                    arrayList2.add(listSubcompose2.get(i11).mo12610measureBRTryo0(ConstraintsKt.m13638offsetNN6EwU(j3, (-windowInsets3.getLeft(subcomposeMeasureScope2, subcomposeMeasureScope2.getLayoutDirection())) - windowInsets3.getRight(subcomposeMeasureScope2, subcomposeMeasureScope2.getLayoutDirection()), -windowInsets3.getBottom(subcomposeMeasureScope2))));
                                }
                                if (arrayList2.isEmpty()) {
                                    obj2 = null;
                                } else {
                                    obj2 = arrayList2.get(0);
                                    int height4 = ((Placeable) obj2).getHeight();
                                    int lastIndex2 = CollectionsKt__CollectionsKt.getLastIndex(arrayList2);
                                    if (1 <= lastIndex2) {
                                        int i12 = 1;
                                        while (true) {
                                            Object obj8 = arrayList2.get(i12);
                                            int height5 = ((Placeable) obj8).getHeight();
                                            if (height4 < height5) {
                                                obj2 = obj8;
                                                height4 = height5;
                                            }
                                            if (i12 == lastIndex2) {
                                                break;
                                            } else {
                                                i12++;
                                            }
                                        }
                                    }
                                }
                                Placeable placeable2 = (Placeable) obj2;
                                int height6 = placeable2 != null ? placeable2.getHeight() : 0;
                                if (arrayList2.isEmpty()) {
                                    obj3 = null;
                                } else {
                                    obj3 = arrayList2.get(0);
                                    int width = ((Placeable) obj3).getWidth();
                                    int lastIndex3 = CollectionsKt__CollectionsKt.getLastIndex(arrayList2);
                                    if (1 <= lastIndex3) {
                                        int i13 = 1;
                                        while (true) {
                                            Object obj9 = arrayList2.get(i13);
                                            int width2 = ((Placeable) obj9).getWidth();
                                            if (width < width2) {
                                                obj3 = obj9;
                                                width = width2;
                                            }
                                            if (i13 == lastIndex3) {
                                                break;
                                            } else {
                                                i13++;
                                            }
                                        }
                                    }
                                }
                                Placeable placeable3 = (Placeable) obj3;
                                int width3 = placeable3 != null ? placeable3.getWidth() : 0;
                                List<Measurable> listSubcompose3 = subcomposeMeasureScope.subcompose(ScaffoldLayoutContent.Fab, function27);
                                WindowInsets windowInsets4 = windowInsets2;
                                SubcomposeMeasureScope subcomposeMeasureScope3 = subcomposeMeasureScope;
                                long j4 = jM13613copyZbe2FdA$default;
                                ArrayList arrayList3 = new ArrayList(listSubcompose3.size());
                                int size3 = listSubcompose3.size();
                                int i14 = 0;
                                while (i14 < size3) {
                                    List<Measurable> list = listSubcompose3;
                                    int i15 = size3;
                                    WindowInsets windowInsets5 = windowInsets4;
                                    Placeable placeableMo12610measureBRTryo0 = listSubcompose3.get(i14).mo12610measureBRTryo0(ConstraintsKt.m13638offsetNN6EwU(j4, (-windowInsets4.getLeft(subcomposeMeasureScope3, subcomposeMeasureScope3.getLayoutDirection())) - windowInsets4.getRight(subcomposeMeasureScope3, subcomposeMeasureScope3.getLayoutDirection()), -windowInsets4.getBottom(subcomposeMeasureScope3)));
                                    if (placeableMo12610measureBRTryo0.getHeight() == 0 || placeableMo12610measureBRTryo0.getWidth() == 0) {
                                        placeableMo12610measureBRTryo0 = null;
                                    }
                                    if (placeableMo12610measureBRTryo0 != null) {
                                        arrayList3.add(placeableMo12610measureBRTryo0);
                                    }
                                    i14++;
                                    windowInsets4 = windowInsets5;
                                    listSubcompose3 = list;
                                    size3 = i15;
                                }
                                if (!arrayList3.isEmpty()) {
                                    if (arrayList3.isEmpty()) {
                                        obj5 = null;
                                    } else {
                                        obj5 = arrayList3.get(0);
                                        int width4 = ((Placeable) obj5).getWidth();
                                        int lastIndex4 = CollectionsKt__CollectionsKt.getLastIndex(arrayList3);
                                        if (1 <= lastIndex4) {
                                            int i16 = 1;
                                            while (true) {
                                                Object obj10 = arrayList3.get(i16);
                                                int width5 = ((Placeable) obj10).getWidth();
                                                if (width4 < width5) {
                                                    obj5 = obj10;
                                                    width4 = width5;
                                                }
                                                if (i16 == lastIndex4) {
                                                    break;
                                                } else {
                                                    i16++;
                                                }
                                            }
                                        }
                                    }
                                    Intrinsics.checkNotNull(obj5);
                                    int width6 = ((Placeable) obj5).getWidth();
                                    if (arrayList3.isEmpty()) {
                                        obj6 = null;
                                    } else {
                                        obj6 = arrayList3.get(0);
                                        int height7 = ((Placeable) obj6).getHeight();
                                        int lastIndex5 = CollectionsKt__CollectionsKt.getLastIndex(arrayList3);
                                        if (1 <= lastIndex5) {
                                            int i17 = 1;
                                            while (true) {
                                                Object obj11 = arrayList3.get(i17);
                                                int height8 = ((Placeable) obj11).getHeight();
                                                if (height7 < height8) {
                                                    obj6 = obj11;
                                                    height7 = height8;
                                                }
                                                if (i17 == lastIndex5) {
                                                    break;
                                                } else {
                                                    i17++;
                                                }
                                            }
                                        }
                                    }
                                    Intrinsics.checkNotNull(obj6);
                                    int height9 = ((Placeable) obj6).getHeight();
                                    int i18 = i5;
                                    FabPosition.Companion companion = FabPosition.INSTANCE;
                                    if (FabPosition.m9451equalsimpl0(i18, companion.m9458getStartERTFSPs())) {
                                        if (subcomposeMeasureScope.getLayoutDirection() == LayoutDirection.Ltr) {
                                            iMo7868roundToPx0680j_4 = subcomposeMeasureScope.mo7868roundToPx0680j_4(ScaffoldKt.FabSpacing);
                                            fabPlacement = new FabPlacement(iMo7868roundToPx0680j_4, width6, height9);
                                        } else {
                                            i8 = iM13622getMaxWidthimpl;
                                            iMo7868roundToPx0680j_42 = subcomposeMeasureScope.mo7868roundToPx0680j_4(ScaffoldKt.FabSpacing);
                                            iMo7868roundToPx0680j_4 = (i8 - iMo7868roundToPx0680j_42) - width6;
                                            fabPlacement = new FabPlacement(iMo7868roundToPx0680j_4, width6, height9);
                                        }
                                    } else {
                                        if (FabPosition.m9451equalsimpl0(i18, companion.m9456getEndERTFSPs())) {
                                            if (subcomposeMeasureScope.getLayoutDirection() != LayoutDirection.Ltr) {
                                                iMo7868roundToPx0680j_4 = subcomposeMeasureScope.mo7868roundToPx0680j_4(ScaffoldKt.FabSpacing);
                                            } else {
                                                i8 = iM13622getMaxWidthimpl;
                                                iMo7868roundToPx0680j_42 = subcomposeMeasureScope.mo7868roundToPx0680j_4(ScaffoldKt.FabSpacing);
                                                iMo7868roundToPx0680j_4 = (i8 - iMo7868roundToPx0680j_42) - width6;
                                            }
                                        } else {
                                            iMo7868roundToPx0680j_4 = (iM13622getMaxWidthimpl - width6) / 2;
                                        }
                                        fabPlacement = new FabPlacement(iMo7868roundToPx0680j_4, width6, height9);
                                    }
                                } else {
                                    fabPlacement = null;
                                }
                                SubcomposeMeasureScope subcomposeMeasureScope4 = subcomposeMeasureScope;
                                ScaffoldLayoutContent scaffoldLayoutContent = ScaffoldLayoutContent.BottomBar;
                                final Function2<Composer, Integer, Unit> function29 = function28;
                                List<Measurable> listSubcompose4 = subcomposeMeasureScope4.subcompose(scaffoldLayoutContent, ComposableLambdaKt.composableLambdaInstance(-791102355, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ScaffoldKt$LegacyScaffoldLayout$1$1$1$bottomBarPlaceables$1
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

                                    @Composable
                                    public final void invoke(@Nullable Composer composer2, int i19) {
                                        if ((i19 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-791102355, i19, -1, "androidx.compose.material3.LegacyScaffoldLayout.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:429)");
                                            }
                                            CompositionLocalKt.CompositionLocalProvider(ScaffoldKt.getLocalFabPlacement().provides(fabPlacement), function29, composer2, ProvidedValue.$stable);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }
                                }));
                                long j5 = jM13613copyZbe2FdA$default;
                                final ArrayList arrayList4 = new ArrayList(listSubcompose4.size());
                                int size4 = listSubcompose4.size();
                                for (int i19 = 0; i19 < size4; i19++) {
                                    arrayList4.add(listSubcompose4.get(i19).mo12610measureBRTryo0(j5));
                                }
                                if (arrayList4.isEmpty()) {
                                    obj4 = null;
                                    i6 = 0;
                                } else {
                                    i6 = 0;
                                    obj4 = arrayList4.get(0);
                                    int height10 = ((Placeable) obj4).getHeight();
                                    int lastIndex6 = CollectionsKt__CollectionsKt.getLastIndex(arrayList4);
                                    if (1 <= lastIndex6) {
                                        int i20 = height10;
                                        Object obj12 = obj4;
                                        int i21 = 1;
                                        while (true) {
                                            Object obj13 = arrayList4.get(i21);
                                            int height11 = ((Placeable) obj13).getHeight();
                                            if (i20 < height11) {
                                                obj12 = obj13;
                                                i20 = height11;
                                            }
                                            if (i21 == lastIndex6) {
                                                break;
                                            } else {
                                                i21++;
                                            }
                                        }
                                        obj4 = obj12;
                                    }
                                }
                                Placeable placeable4 = (Placeable) obj4;
                                Integer numValueOf2 = placeable4 != null ? Integer.valueOf(placeable4.getHeight()) : null;
                                if (fabPlacement != null) {
                                    SubcomposeMeasureScope subcomposeMeasureScope5 = subcomposeMeasureScope;
                                    WindowInsets windowInsets6 = windowInsets2;
                                    if (numValueOf2 != null) {
                                        iIntValue2 = numValueOf2.intValue() + fabPlacement.getHeight() + subcomposeMeasureScope5.mo7868roundToPx0680j_4(ScaffoldKt.FabSpacing);
                                    } else {
                                        iIntValue2 = fabPlacement.getHeight() + subcomposeMeasureScope5.mo7868roundToPx0680j_4(ScaffoldKt.FabSpacing) + windowInsets6.getBottom(subcomposeMeasureScope5);
                                    }
                                    numValueOf = Integer.valueOf(iIntValue2);
                                } else {
                                    numValueOf = null;
                                }
                                if (height6 != 0) {
                                    if (numValueOf != null) {
                                        iIntValue = numValueOf.intValue();
                                    } else {
                                        iIntValue = numValueOf2 != null ? numValueOf2.intValue() : windowInsets2.getBottom(subcomposeMeasureScope);
                                    }
                                    i7 = height6 + iIntValue;
                                } else {
                                    i7 = i6;
                                }
                                final SubcomposeMeasureScope subcomposeMeasureScope6 = subcomposeMeasureScope;
                                ScaffoldLayoutContent scaffoldLayoutContent2 = ScaffoldLayoutContent.MainContent;
                                final WindowInsets windowInsets7 = windowInsets2;
                                final Function3<PaddingValues, Composer, Integer, Unit> function33 = function32;
                                FabPlacement fabPlacement2 = fabPlacement;
                                ArrayList arrayList5 = arrayList4;
                                final Integer num = numValueOf2;
                                int i22 = i6;
                                List<Measurable> listSubcompose5 = subcomposeMeasureScope6.subcompose(scaffoldLayoutContent2, ComposableLambdaKt.composableLambdaInstance(495329982, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ScaffoldKt$LegacyScaffoldLayout$1$1$1$bodyContentPlaceables$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num2) {
                                        invoke(composer2, num2.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @Composable
                                    public final void invoke(@Nullable Composer composer2, int i23) {
                                        float fMo7871toDpu2uoSUM;
                                        float bottom;
                                        Integer num2;
                                        if ((i23 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(495329982, i23, -1, "androidx.compose.material3.LegacyScaffoldLayout.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:456)");
                                            }
                                            PaddingValues paddingValuesAsPaddingValues = WindowInsetsKt.asPaddingValues(windowInsets7, subcomposeMeasureScope6);
                                            if (arrayList.isEmpty()) {
                                                fMo7871toDpu2uoSUM = paddingValuesAsPaddingValues.getTop();
                                            } else {
                                                fMo7871toDpu2uoSUM = subcomposeMeasureScope6.mo7871toDpu2uoSUM(height3);
                                            }
                                            if (arrayList4.isEmpty() || (num2 = num) == null) {
                                                bottom = paddingValuesAsPaddingValues.getBottom();
                                            } else {
                                                bottom = subcomposeMeasureScope6.mo7871toDpu2uoSUM(num2.intValue());
                                            }
                                            function33.invoke(PaddingKt.m8119PaddingValuesa9UjIt4(PaddingKt.calculateStartPadding(paddingValuesAsPaddingValues, subcomposeMeasureScope6.getLayoutDirection()), fMo7871toDpu2uoSUM, PaddingKt.calculateEndPadding(paddingValuesAsPaddingValues, subcomposeMeasureScope6.getLayoutDirection()), bottom), composer2, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }
                                }));
                                long j6 = jM13613copyZbe2FdA$default;
                                ArrayList arrayList6 = new ArrayList(listSubcompose5.size());
                                int size5 = listSubcompose5.size();
                                for (int i23 = i22; i23 < size5; i23++) {
                                    arrayList6.add(listSubcompose5.get(i23).mo12610measureBRTryo0(j6));
                                }
                                int size6 = arrayList6.size();
                                for (int i24 = i22; i24 < size6; i24++) {
                                    Placeable.PlacementScope.place$default(placementScope, (Placeable) arrayList6.get(i24), 0, 0, 0.0f, 4, null);
                                }
                                int size7 = arrayList.size();
                                for (int i25 = i22; i25 < size7; i25++) {
                                    Placeable.PlacementScope.place$default(placementScope, (Placeable) arrayList.get(i25), 0, 0, 0.0f, 4, null);
                                }
                                int i26 = iM13622getMaxWidthimpl;
                                WindowInsets windowInsets8 = windowInsets2;
                                SubcomposeMeasureScope subcomposeMeasureScope7 = subcomposeMeasureScope;
                                int i27 = iM13621getMaxHeightimpl;
                                int size8 = arrayList2.size();
                                for (int i28 = i22; i28 < size8; i28++) {
                                    Placeable.PlacementScope.place$default(placementScope, (Placeable) arrayList2.get(i28), ((i26 - width3) / 2) + windowInsets8.getLeft(subcomposeMeasureScope7, subcomposeMeasureScope7.getLayoutDirection()), i27 - i7, 0.0f, 4, null);
                                }
                                int i29 = iM13621getMaxHeightimpl;
                                int size9 = arrayList5.size();
                                int i30 = i22;
                                while (i30 < size9) {
                                    ArrayList arrayList7 = arrayList5;
                                    Placeable.PlacementScope.place$default(placementScope, (Placeable) arrayList7.get(i30), 0, i29 - (numValueOf2 != null ? numValueOf2.intValue() : i22), 0.0f, 4, null);
                                    i30++;
                                    arrayList5 = arrayList7;
                                }
                                if (fabPlacement2 != null) {
                                    int i31 = iM13621getMaxHeightimpl;
                                    int size10 = arrayList3.size();
                                    for (int i32 = i22; i32 < size10; i32++) {
                                        Placeable placeable5 = (Placeable) arrayList3.get(i32);
                                        int left = fabPlacement2.getLeft();
                                        Intrinsics.checkNotNull(numValueOf);
                                        Placeable.PlacementScope.place$default(placementScope, placeable5, left, i31 - numValueOf.intValue(), 0.0f, 4, null);
                                    }
                                    Unit unit = Unit.INSTANCE;
                                }
                            }
                        }, 4, null);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                i4 = 1;
            }
            composerStartRestartGroup.endReplaceableGroup();
            SubcomposeLayoutKt.SubcomposeLayout(null, (Function2) objRememberedValue, composerStartRestartGroup, 0, i4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ScaffoldKt$LegacyScaffoldLayout$2
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

                public final void invoke(@Nullable Composer composer2, int i5) {
                    ScaffoldKt.m9678LegacyScaffoldLayoutFMILGgc(i, function2, function3, function22, function23, windowInsets, function24, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ExperimentalMaterial3Api
    public static final boolean getScaffoldSubcomposeInMeasureFix() {
        return ((Boolean) ScaffoldSubcomposeInMeasureFix$delegate.getValue()).booleanValue();
    }

    @ExperimentalMaterial3Api
    public static final void setScaffoldSubcomposeInMeasureFix(boolean z) {
        ScaffoldSubcomposeInMeasureFix$delegate.setValue(Boolean.valueOf(z));
    }

    @NotNull
    public static final ProvidableCompositionLocal<FabPlacement> getLocalFabPlacement() {
        return LocalFabPlacement;
    }
}
