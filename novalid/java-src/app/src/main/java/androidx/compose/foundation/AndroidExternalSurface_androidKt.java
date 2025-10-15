package androidx.compose.foundation;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.compose.foundation.AndroidExternalSurfaceZOrder;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.AndroidMatrixConversions_androidKt;
import androidx.compose.p003ui.unit.IntSize;
import androidx.compose.p003ui.viewinterop.AndroidView_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidExternalSurface.android.kt */
@Metadata(m7104d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aU\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0002\b\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a]\u0010\u0010\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00052\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0002\b\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\r\u0010\u0016\u001a\u00020\u0017H\u0003¢\u0006\u0002\u0010\u0018\u001a\r\u0010\u0019\u001a\u00020\u001aH\u0003¢\u0006\u0002\u0010\u001b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, m7105d2 = {"AndroidEmbeddedExternalSurface", "", "modifier", "Landroidx/compose/ui/Modifier;", "isOpaque", "", "surfaceSize", "Landroidx/compose/ui/unit/IntSize;", "transform", "Landroidx/compose/ui/graphics/Matrix;", "onInit", "Lkotlin/Function1;", "Landroidx/compose/foundation/AndroidExternalSurfaceScope;", "Lkotlin/ExtensionFunctionType;", "AndroidEmbeddedExternalSurface-sv6N_fY", "(Landroidx/compose/ui/Modifier;ZJ[FLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "AndroidExternalSurface", "zOrder", "Landroidx/compose/foundation/AndroidExternalSurfaceZOrder;", "isSecure", "AndroidExternalSurface-58FFMhA", "(Landroidx/compose/ui/Modifier;ZJIZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "rememberAndroidEmbeddedExternalSurfaceState", "Landroidx/compose/foundation/AndroidEmbeddedExternalSurfaceState;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/AndroidEmbeddedExternalSurfaceState;", "rememberAndroidExternalSurfaceState", "Landroidx/compose/foundation/AndroidExternalSurfaceState;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/AndroidExternalSurfaceState;", "foundation_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nAndroidExternalSurface.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidExternalSurface.android.kt\nandroidx/compose/foundation/AndroidExternalSurface_androidKt\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,480:1\n487#2,4:481\n491#2,2:489\n495#2:495\n487#2,4:509\n491#2,2:517\n495#2:523\n25#3:485\n25#3:496\n25#3:513\n25#3:524\n1116#4,3:486\n1119#4,3:492\n1116#4,6:497\n1116#4,6:503\n1116#4,3:514\n1119#4,3:520\n1116#4,6:525\n487#5:491\n487#5:519\n*S KotlinDebug\n*F\n+ 1 AndroidExternalSurface.android.kt\nandroidx/compose/foundation/AndroidExternalSurface_androidKt\n*L\n191#1:481,4\n191#1:489,2\n191#1:495\n385#1:509,4\n385#1:517,2\n385#1:523\n191#1:485\n192#1:496\n385#1:513\n386#1:524\n191#1:486,3\n191#1:492,3\n192#1:497,6\n300#1:503,6\n385#1:514,3\n385#1:520,3\n386#1:525,6\n191#1:491\n385#1:519\n*E\n"})
/* loaded from: classes.dex */
public final class AndroidExternalSurface_androidKt {
    @Composable
    private static final AndroidExternalSurfaceState rememberAndroidExternalSurfaceState(Composer composer, int i) {
        composer.startReplaceableGroup(-873615933);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-873615933, i, -1, "androidx.compose.foundation.rememberAndroidExternalSurfaceState (AndroidExternalSurface.android.kt:189)");
        }
        composer.startReplaceableGroup(773894976);
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer));
            composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
            objRememberedValue = compositionScopedCoroutineScopeCanceller;
        }
        composer.endReplaceableGroup();
        CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new AndroidExternalSurfaceState(coroutineScope);
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        AndroidExternalSurfaceState androidExternalSurfaceState = (AndroidExternalSurfaceState) objRememberedValue2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return androidExternalSurfaceState;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0116  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: AndroidExternalSurface-58FFMhA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m7767AndroidExternalSurface58FFMhA(@Nullable Modifier modifier, boolean z, long j, int i, boolean z2, @NotNull final Function1<? super AndroidExternalSurfaceScope, Unit> function1, @Nullable Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        boolean z3;
        long jM13841getZeroYbymL2g;
        int i5;
        int iM7763getBehindB_4ceCc;
        int i6;
        boolean z4;
        int i7;
        Modifier modifier3;
        long j2;
        boolean z5;
        final int i8;
        boolean zChanged;
        Object objRememberedValue;
        final boolean z6;
        final boolean z7;
        final int i9;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(640888974);
        int i10 = i3 & 1;
        if (i10 != 0) {
            i4 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 14) == 0) {
            modifier2 = modifier;
            i4 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i4 = i2;
        }
        int i11 = i3 & 2;
        if (i11 != 0) {
            i4 |= 48;
        } else {
            if ((i2 & 112) == 0) {
                z3 = z;
                i4 |= composerStartRestartGroup.changed(z3) ? 32 : 16;
            }
            if ((i2 & 896) != 0) {
                if ((i3 & 4) == 0) {
                    jM13841getZeroYbymL2g = j;
                    int i12 = composerStartRestartGroup.changed(jM13841getZeroYbymL2g) ? 256 : 128;
                    i4 |= i12;
                } else {
                    jM13841getZeroYbymL2g = j;
                }
                i4 |= i12;
            } else {
                jM13841getZeroYbymL2g = j;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else {
                if ((i2 & 7168) == 0) {
                    iM7763getBehindB_4ceCc = i;
                    i4 |= composerStartRestartGroup.changed(iM7763getBehindB_4ceCc) ? 2048 : 1024;
                }
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= CpioConstants.C_ISBLK;
                } else {
                    if ((57344 & i2) == 0) {
                        z4 = z2;
                        i4 |= composerStartRestartGroup.changed(z4) ? 16384 : 8192;
                    }
                    if ((i3 & 32) != 0) {
                        if ((458752 & i2) == 0) {
                            i7 = composerStartRestartGroup.changedInstance(function1) ? 131072 : 65536;
                        }
                        if ((374491 & i4) != 74898 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                modifier3 = i10 == 0 ? Modifier.INSTANCE : modifier2;
                                if (i11 != 0) {
                                    z3 = true;
                                }
                                if ((i3 & 4) != 0) {
                                    i4 &= -897;
                                    jM13841getZeroYbymL2g = IntSize.INSTANCE.m13841getZeroYbymL2g();
                                }
                                if (i5 != 0) {
                                    iM7763getBehindB_4ceCc = AndroidExternalSurfaceZOrder.INSTANCE.m7763getBehindB_4ceCc();
                                }
                                j2 = jM13841getZeroYbymL2g;
                                if (i6 == 0) {
                                    z5 = false;
                                }
                                int i13 = i4;
                                i8 = iM7763getBehindB_4ceCc;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(640888974, i13, -1, "androidx.compose.foundation.AndroidExternalSurface (AndroidExternalSurface.android.kt:287)");
                                }
                                final AndroidExternalSurfaceState androidExternalSurfaceStateRememberAndroidExternalSurfaceState = rememberAndroidExternalSurfaceState(composerStartRestartGroup, 0);
                                Function1<Context, SurfaceView> function12 = new Function1<Context, SurfaceView>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    @NotNull
                                    public final SurfaceView invoke(@NotNull Context context) {
                                        SurfaceView surfaceView = new SurfaceView(context);
                                        Function1<AndroidExternalSurfaceScope, Unit> function13 = function1;
                                        AndroidExternalSurfaceState androidExternalSurfaceState = androidExternalSurfaceStateRememberAndroidExternalSurfaceState;
                                        function13.invoke(androidExternalSurfaceState);
                                        surfaceView.getHolder().addCallback(androidExternalSurfaceState);
                                        return surfaceView;
                                    }
                                };
                                AndroidExternalSurface_androidKt$AndroidExternalSurface$2 androidExternalSurface_androidKt$AndroidExternalSurface$2 = new Function1<SurfaceView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$2
                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull SurfaceView surfaceView) {
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(SurfaceView surfaceView) {
                                        invoke2(surfaceView);
                                        return Unit.INSTANCE;
                                    }
                                };
                                composerStartRestartGroup.startReplaceableGroup(1187629681);
                                zChanged = composerStartRestartGroup.changed(j2) | composerStartRestartGroup.changed(z3) | composerStartRestartGroup.changed(i8) | composerStartRestartGroup.changed(z5);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    final long j3 = j2;
                                    final boolean z8 = z3;
                                    final boolean z9 = z5;
                                    objRememberedValue = new Function1<SurfaceView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$3$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(SurfaceView surfaceView) {
                                            invoke2(surfaceView);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@NotNull SurfaceView surfaceView) {
                                            if (!IntSize.m13834equalsimpl0(j3, IntSize.INSTANCE.m13841getZeroYbymL2g())) {
                                                surfaceView.getHolder().setFixedSize(IntSize.m13836getWidthimpl(j3), IntSize.m13835getHeightimpl(j3));
                                            } else {
                                                surfaceView.getHolder().setSizeFromLayout();
                                            }
                                            surfaceView.getHolder().setFormat(z8 ? -1 : -3);
                                            int i14 = i8;
                                            AndroidExternalSurfaceZOrder.Companion companion = AndroidExternalSurfaceZOrder.INSTANCE;
                                            if (AndroidExternalSurfaceZOrder.m7759equalsimpl0(i14, companion.m7763getBehindB_4ceCc())) {
                                                surfaceView.setZOrderOnTop(false);
                                            } else if (AndroidExternalSurfaceZOrder.m7759equalsimpl0(i14, companion.m7764getMediaOverlayB_4ceCc())) {
                                                surfaceView.setZOrderMediaOverlay(true);
                                            } else if (AndroidExternalSurfaceZOrder.m7759equalsimpl0(i14, companion.m7765getOnTopB_4ceCc())) {
                                                surfaceView.setZOrderOnTop(true);
                                            }
                                            surfaceView.setSecure(z9);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                AndroidView_androidKt.AndroidView(function12, modifier3, androidExternalSurface_androidKt$AndroidExternalSurface$2, null, (Function1) objRememberedValue, composerStartRestartGroup, ((i13 << 3) & 112) | 384, 8);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                jM13841getZeroYbymL2g = j2;
                                z6 = z3;
                                modifier2 = modifier3;
                                z7 = z5;
                                i9 = i8;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i3 & 4) != 0) {
                                    i4 &= -897;
                                }
                                modifier3 = modifier2;
                                j2 = jM13841getZeroYbymL2g;
                            }
                            z5 = z4;
                            int i132 = i4;
                            i8 = iM7763getBehindB_4ceCc;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            final AndroidExternalSurfaceState androidExternalSurfaceStateRememberAndroidExternalSurfaceState2 = rememberAndroidExternalSurfaceState(composerStartRestartGroup, 0);
                            Function1<Context, SurfaceView> function122 = new Function1<Context, SurfaceView>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                @NotNull
                                public final SurfaceView invoke(@NotNull Context context) {
                                    SurfaceView surfaceView = new SurfaceView(context);
                                    Function1<AndroidExternalSurfaceScope, Unit> function13 = function1;
                                    AndroidExternalSurfaceState androidExternalSurfaceState = androidExternalSurfaceStateRememberAndroidExternalSurfaceState2;
                                    function13.invoke(androidExternalSurfaceState);
                                    surfaceView.getHolder().addCallback(androidExternalSurfaceState);
                                    return surfaceView;
                                }
                            };
                            AndroidExternalSurface_androidKt$AndroidExternalSurface$2 androidExternalSurface_androidKt$AndroidExternalSurface$22 = new Function1<SurfaceView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$2
                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull SurfaceView surfaceView) {
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SurfaceView surfaceView) {
                                    invoke2(surfaceView);
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.startReplaceableGroup(1187629681);
                            zChanged = composerStartRestartGroup.changed(j2) | composerStartRestartGroup.changed(z3) | composerStartRestartGroup.changed(i8) | composerStartRestartGroup.changed(z5);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                final long j32 = j2;
                                final boolean z82 = z3;
                                final boolean z92 = z5;
                                objRememberedValue = new Function1<SurfaceView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$3$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(SurfaceView surfaceView) {
                                        invoke2(surfaceView);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull SurfaceView surfaceView) {
                                        if (!IntSize.m13834equalsimpl0(j32, IntSize.INSTANCE.m13841getZeroYbymL2g())) {
                                            surfaceView.getHolder().setFixedSize(IntSize.m13836getWidthimpl(j32), IntSize.m13835getHeightimpl(j32));
                                        } else {
                                            surfaceView.getHolder().setSizeFromLayout();
                                        }
                                        surfaceView.getHolder().setFormat(z82 ? -1 : -3);
                                        int i14 = i8;
                                        AndroidExternalSurfaceZOrder.Companion companion = AndroidExternalSurfaceZOrder.INSTANCE;
                                        if (AndroidExternalSurfaceZOrder.m7759equalsimpl0(i14, companion.m7763getBehindB_4ceCc())) {
                                            surfaceView.setZOrderOnTop(false);
                                        } else if (AndroidExternalSurfaceZOrder.m7759equalsimpl0(i14, companion.m7764getMediaOverlayB_4ceCc())) {
                                            surfaceView.setZOrderMediaOverlay(true);
                                        } else if (AndroidExternalSurfaceZOrder.m7759equalsimpl0(i14, companion.m7765getOnTopB_4ceCc())) {
                                            surfaceView.setZOrderOnTop(true);
                                        }
                                        surfaceView.setSecure(z92);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                composerStartRestartGroup.endReplaceableGroup();
                                AndroidView_androidKt.AndroidView(function122, modifier3, androidExternalSurface_androidKt$AndroidExternalSurface$22, null, (Function1) objRememberedValue, composerStartRestartGroup, ((i132 << 3) & 112) | 384, 8);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                jM13841getZeroYbymL2g = j2;
                                z6 = z3;
                                modifier2 = modifier3;
                                z7 = z5;
                                i9 = i8;
                            }
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            z6 = z3;
                            i9 = iM7763getBehindB_4ceCc;
                            z7 = z4;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            final Modifier modifier4 = modifier2;
                            final long j4 = jM13841getZeroYbymL2g;
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$4
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

                                public final void invoke(@Nullable Composer composer2, int i14) {
                                    AndroidExternalSurface_androidKt.m7767AndroidExternalSurface58FFMhA(modifier4, z6, j4, i9, z7, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i7 = ProfileVerifier.CompilationStatus.f342xf2722a21;
                    i4 |= i7;
                    if ((374491 & i4) != 74898) {
                        composerStartRestartGroup.startDefaults();
                        if ((i2 & 1) != 0) {
                            if (i10 == 0) {
                            }
                            if (i11 != 0) {
                            }
                            if ((i3 & 4) != 0) {
                            }
                            if (i5 != 0) {
                            }
                            j2 = jM13841getZeroYbymL2g;
                            if (i6 == 0) {
                                z5 = z4;
                            }
                            int i1322 = i4;
                            i8 = iM7763getBehindB_4ceCc;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            final AndroidExternalSurfaceState androidExternalSurfaceStateRememberAndroidExternalSurfaceState22 = rememberAndroidExternalSurfaceState(composerStartRestartGroup, 0);
                            Function1<Context, SurfaceView> function1222 = new Function1<Context, SurfaceView>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                @NotNull
                                public final SurfaceView invoke(@NotNull Context context) {
                                    SurfaceView surfaceView = new SurfaceView(context);
                                    Function1<AndroidExternalSurfaceScope, Unit> function13 = function1;
                                    AndroidExternalSurfaceState androidExternalSurfaceState = androidExternalSurfaceStateRememberAndroidExternalSurfaceState22;
                                    function13.invoke(androidExternalSurfaceState);
                                    surfaceView.getHolder().addCallback(androidExternalSurfaceState);
                                    return surfaceView;
                                }
                            };
                            AndroidExternalSurface_androidKt$AndroidExternalSurface$2 androidExternalSurface_androidKt$AndroidExternalSurface$222 = new Function1<SurfaceView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$2
                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull SurfaceView surfaceView) {
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SurfaceView surfaceView) {
                                    invoke2(surfaceView);
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.startReplaceableGroup(1187629681);
                            zChanged = composerStartRestartGroup.changed(j2) | composerStartRestartGroup.changed(z3) | composerStartRestartGroup.changed(i8) | composerStartRestartGroup.changed(z5);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                            }
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                z4 = z2;
                if ((i3 & 32) != 0) {
                }
                i4 |= i7;
                if ((374491 & i4) != 74898) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            iM7763getBehindB_4ceCc = i;
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            z4 = z2;
            if ((i3 & 32) != 0) {
            }
            i4 |= i7;
            if ((374491 & i4) != 74898) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        z3 = z;
        if ((i2 & 896) != 0) {
        }
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        iM7763getBehindB_4ceCc = i;
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        z4 = z2;
        if ((i3 & 32) != 0) {
        }
        i4 |= i7;
        if ((374491 & i4) != 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    @Composable
    private static final AndroidEmbeddedExternalSurfaceState rememberAndroidEmbeddedExternalSurfaceState(Composer composer, int i) {
        composer.startReplaceableGroup(-1057437053);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1057437053, i, -1, "androidx.compose.foundation.rememberAndroidEmbeddedExternalSurfaceState (AndroidExternalSurface.android.kt:383)");
        }
        composer.startReplaceableGroup(773894976);
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer));
            composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
            objRememberedValue = compositionScopedCoroutineScopeCanceller;
        }
        composer.endReplaceableGroup();
        CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new AndroidEmbeddedExternalSurfaceState(coroutineScope);
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        AndroidEmbeddedExternalSurfaceState androidEmbeddedExternalSurfaceState = (AndroidEmbeddedExternalSurfaceState) objRememberedValue2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return androidEmbeddedExternalSurfaceState;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: AndroidEmbeddedExternalSurface-sv6N_fY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m7766AndroidEmbeddedExternalSurfacesv6N_fY(@Nullable Modifier modifier, boolean z, long j, @Nullable float[] fArr, @NotNull final Function1<? super AndroidExternalSurfaceScope, Unit> function1, @Nullable Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        boolean z2;
        long jM13841getZeroYbymL2g;
        int i4;
        Modifier modifier3;
        float[] fArr2;
        final long j2;
        final float[] fArr3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(217541314);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 == 0) {
            if ((i & 112) == 0) {
                z2 = z;
                i3 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
            }
            if ((i & 896) != 0) {
                if ((i2 & 4) == 0) {
                    jM13841getZeroYbymL2g = j;
                    int i7 = composerStartRestartGroup.changed(jM13841getZeroYbymL2g) ? 256 : 128;
                    i3 |= i7;
                } else {
                    jM13841getZeroYbymL2g = j;
                }
                i3 |= i7;
            } else {
                jM13841getZeroYbymL2g = j;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                i3 |= 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= CpioConstants.C_ISBLK;
            } else if ((57344 & i) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function1) ? 16384 : 8192;
            }
            if (i4 == 8 || (46811 & i3) != 9362 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if (i6 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 4) != 0) {
                        jM13841getZeroYbymL2g = IntSize.INSTANCE.m13841getZeroYbymL2g();
                        i3 &= -897;
                    }
                    fArr2 = i4 == 0 ? null : fArr;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    fArr2 = fArr;
                    modifier3 = modifier2;
                }
                int i8 = i3;
                final boolean z3 = z2;
                final long j3 = jM13841getZeroYbymL2g;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(217541314, i8, -1, "androidx.compose.foundation.AndroidEmbeddedExternalSurface (AndroidExternalSurface.android.kt:454)");
                }
                final AndroidEmbeddedExternalSurfaceState androidEmbeddedExternalSurfaceStateRememberAndroidEmbeddedExternalSurfaceState = rememberAndroidEmbeddedExternalSurfaceState(composerStartRestartGroup, 0);
                final float[] fArr4 = fArr2;
                AndroidView_androidKt.AndroidView(new Function1<Context, TextureView>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    @NotNull
                    public final TextureView invoke(@NotNull Context context) {
                        TextureView textureView = new TextureView(context);
                        AndroidEmbeddedExternalSurfaceState androidEmbeddedExternalSurfaceState = androidEmbeddedExternalSurfaceStateRememberAndroidEmbeddedExternalSurfaceState;
                        long j4 = j3;
                        Function1<AndroidExternalSurfaceScope, Unit> function12 = function1;
                        androidEmbeddedExternalSurfaceState.m7755setSurfaceSizeozmzZPI(j4);
                        function12.invoke(androidEmbeddedExternalSurfaceState);
                        textureView.setSurfaceTextureListener(androidEmbeddedExternalSurfaceState);
                        return textureView;
                    }
                }, modifier3, new Function1<TextureView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$2
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull TextureView textureView) {
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(TextureView textureView) {
                        invoke2(textureView);
                        return Unit.INSTANCE;
                    }
                }, null, new Function1<TextureView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(TextureView textureView) {
                        invoke2(textureView);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull TextureView textureView) {
                        Matrix matrix;
                        SurfaceTexture surfaceTexture;
                        if (!IntSize.m13834equalsimpl0(j3, IntSize.INSTANCE.m13841getZeroYbymL2g()) && (surfaceTexture = textureView.getSurfaceTexture()) != null) {
                            surfaceTexture.setDefaultBufferSize(IntSize.m13836getWidthimpl(j3), IntSize.m13835getHeightimpl(j3));
                        }
                        androidEmbeddedExternalSurfaceStateRememberAndroidEmbeddedExternalSurfaceState.m7755setSurfaceSizeozmzZPI(j3);
                        textureView.setOpaque(z3);
                        float[] fArr5 = fArr4;
                        if (fArr5 != null) {
                            matrix = androidEmbeddedExternalSurfaceStateRememberAndroidEmbeddedExternalSurfaceState.getMatrix();
                            AndroidMatrixConversions_androidKt.m11210setFromEL8BTi8(matrix, fArr5);
                        } else {
                            matrix = null;
                        }
                        textureView.setTransform(matrix);
                    }
                }, composerStartRestartGroup, ((i8 << 3) & 112) | 384, 8);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z2 = z3;
                j2 = j3;
                fArr3 = fArr2;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                fArr3 = fArr;
                modifier3 = modifier2;
                j2 = jM13841getZeroYbymL2g;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Modifier modifier4 = modifier3;
                final boolean z4 = z2;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$4
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

                    public final void invoke(@Nullable Composer composer2, int i9) {
                        AndroidExternalSurface_androidKt.m7766AndroidEmbeddedExternalSurfacesv6N_fY(modifier4, z4, j2, fArr3, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        z2 = z;
        if ((i & 896) != 0) {
        }
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if (i4 == 8) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i5 == 0) {
                }
                if (i6 != 0) {
                }
                if ((i2 & 4) != 0) {
                }
                if (i4 == 0) {
                }
                int i82 = i3;
                final boolean z32 = z2;
                final long j32 = jM13841getZeroYbymL2g;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                final AndroidEmbeddedExternalSurfaceState androidEmbeddedExternalSurfaceStateRememberAndroidEmbeddedExternalSurfaceState2 = rememberAndroidEmbeddedExternalSurfaceState(composerStartRestartGroup, 0);
                final float[] fArr42 = fArr2;
                AndroidView_androidKt.AndroidView(new Function1<Context, TextureView>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    @NotNull
                    public final TextureView invoke(@NotNull Context context) {
                        TextureView textureView = new TextureView(context);
                        AndroidEmbeddedExternalSurfaceState androidEmbeddedExternalSurfaceState = androidEmbeddedExternalSurfaceStateRememberAndroidEmbeddedExternalSurfaceState2;
                        long j4 = j32;
                        Function1<AndroidExternalSurfaceScope, Unit> function12 = function1;
                        androidEmbeddedExternalSurfaceState.m7755setSurfaceSizeozmzZPI(j4);
                        function12.invoke(androidEmbeddedExternalSurfaceState);
                        textureView.setSurfaceTextureListener(androidEmbeddedExternalSurfaceState);
                        return textureView;
                    }
                }, modifier3, new Function1<TextureView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$2
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull TextureView textureView) {
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(TextureView textureView) {
                        invoke2(textureView);
                        return Unit.INSTANCE;
                    }
                }, null, new Function1<TextureView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(TextureView textureView) {
                        invoke2(textureView);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull TextureView textureView) {
                        Matrix matrix;
                        SurfaceTexture surfaceTexture;
                        if (!IntSize.m13834equalsimpl0(j32, IntSize.INSTANCE.m13841getZeroYbymL2g()) && (surfaceTexture = textureView.getSurfaceTexture()) != null) {
                            surfaceTexture.setDefaultBufferSize(IntSize.m13836getWidthimpl(j32), IntSize.m13835getHeightimpl(j32));
                        }
                        androidEmbeddedExternalSurfaceStateRememberAndroidEmbeddedExternalSurfaceState2.m7755setSurfaceSizeozmzZPI(j32);
                        textureView.setOpaque(z32);
                        float[] fArr5 = fArr42;
                        if (fArr5 != null) {
                            matrix = androidEmbeddedExternalSurfaceStateRememberAndroidEmbeddedExternalSurfaceState2.getMatrix();
                            AndroidMatrixConversions_androidKt.m11210setFromEL8BTi8(matrix, fArr5);
                        } else {
                            matrix = null;
                        }
                        textureView.setTransform(matrix);
                    }
                }, composerStartRestartGroup, ((i82 << 3) & 112) | 384, 8);
                if (ComposerKt.isTraceInProgress()) {
                }
                z2 = z32;
                j2 = j32;
                fArr3 = fArr2;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
