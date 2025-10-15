package androidx.compose.material3;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material3.Strings;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.Shape;
import androidx.compose.p003ui.graphics.drawscope.DrawScope;
import androidx.compose.p003ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.p003ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.p003ui.input.pointer.PointerInputScope;
import androidx.compose.p003ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.layout.OnRemeasuredModifierKt;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p003ui.platform.CompositionLocalsKt;
import androidx.compose.p003ui.semantics.SemanticsModifierKt;
import androidx.compose.p003ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p003ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.IntOffset;
import androidx.compose.p003ui.unit.IntOffsetKt;
import androidx.compose.p003ui.unit.IntSize;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.p003ui.window.SecureFlagPolicy;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.media3.extractor.p007ts.TsExtractor;
import androidx.profileinstaller.ProfileVerifier;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ModalBottomSheet.android.kt */
@Metadata(m7104d1 = {"\u0000v\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a¹\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\r2\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\u001c\u0010\u0017\u001a\u0018\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00010\u0018¢\u0006\u0002\b\u0012¢\u0006\u0002\b\u001aH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a>\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00162\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0013\u001a\u00020\u00142\u0011\u0010\u0017\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0012H\u0001¢\u0006\u0002\u0010\u001e\u001a0\u0010\u001f\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\r2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010!\u001a\u00020\"H\u0003ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a-\u0010%\u001a\u00020\u00072\b\b\u0002\u0010&\u001a\u00020\"2\u0014\b\u0002\u0010'\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\"0\u0018H\u0007¢\u0006\u0002\u0010)\u001a\f\u0010*\u001a\u00020\"*\u00020+H\u0002\u001a\u001c\u0010,\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010-\u001a\u00020.H\u0003\u001a\u0014\u0010/\u001a\u00020\"*\u0002002\u0006\u00101\u001a\u00020\"H\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00062²\u0006\n\u00103\u001a\u00020.X\u008a\u0084\u0002²\u0006\u0015\u00104\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0012X\u008a\u0084\u0002"}, m7105d2 = {"ModalBottomSheet", "", "onDismissRequest", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "sheetState", "Landroidx/compose/material3/SheetState;", "sheetMaxWidth", "Landroidx/compose/ui/unit/Dp;", "shape", "Landroidx/compose/ui/graphics/Shape;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "tonalElevation", "scrimColor", "dragHandle", "Landroidx/compose/runtime/Composable;", "windowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "properties", "Landroidx/compose/material3/ModalBottomSheetProperties;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", "ModalBottomSheet-dYc4hso", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SheetState;FLandroidx/compose/ui/graphics/Shape;JJFJLkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/material3/ModalBottomSheetProperties;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "ModalBottomSheetPopup", "(Landroidx/compose/material3/ModalBottomSheetProperties;Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Scrim", "color", "visible", "", "Scrim-3J-VO9M", "(JLkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;I)V", "rememberModalBottomSheetState", "skipPartiallyExpanded", "confirmValueChange", "Landroidx/compose/material3/SheetValue;", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SheetState;", "isFlagSecureEnabled", "Landroid/view/View;", "modalBottomSheetAnchors", "fullHeight", "", "shouldApplySecureFlag", "Landroidx/compose/ui/window/SecureFlagPolicy;", "isSecureFlagSetOnParent", "material3_release", "alpha", "currentContent"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nModalBottomSheet.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModalBottomSheet.android.kt\nandroidx/compose/material3/ModalBottomSheet_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 7 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,702:1\n74#2:703\n74#2:762\n74#2:763\n1116#3,6:704\n1116#3,3:715\n1119#3,3:721\n1116#3,6:725\n1116#3,6:731\n1116#3,6:737\n1116#3,6:743\n1116#3,6:750\n1116#3,6:756\n1116#3,6:764\n1116#3,6:770\n487#4,4:710\n491#4,2:718\n495#4:724\n25#5:714\n487#6:720\n646#7:749\n81#8:776\n81#8:777\n*S KotlinDebug\n*F\n+ 1 ModalBottomSheet.android.kt\nandroidx/compose/material3/ModalBottomSheet_androidKt\n*L\n153#1:703\n438#1:762\n442#1:763\n154#1:704,6\n157#1:715,3\n157#1:721,3\n158#1:725,6\n167#1:731,6\n175#1:737,6\n281#1:743,6\n379#1:750,6\n392#1:756,6\n443#1:764,6\n471#1:770,6\n157#1:710,4\n157#1:718,2\n157#1:724\n157#1:714\n157#1:720\n372#1:749\n373#1:776\n441#1:777\n*E\n"})
/* loaded from: classes4.dex */
public final class ModalBottomSheet_androidKt {

    /* compiled from: ModalBottomSheet.android.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SecureFlagPolicy.values().length];
            try {
                iArr[SecureFlagPolicy.SecureOff.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SecureFlagPolicy.SecureOn.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SecureFlagPolicy.Inherit.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:314:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x010e  */
    @Composable
    @ExperimentalMaterial3Api
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: ModalBottomSheet-dYc4hso, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m9571ModalBottomSheetdYc4hso(@NotNull final Function0<Unit> function0, @Nullable Modifier modifier, @Nullable SheetState sheetState, float f, @Nullable Shape shape, long j, long j2, float f2, long j3, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, @Nullable WindowInsets windowInsets, @Nullable ModalBottomSheetProperties modalBottomSheetProperties, @NotNull final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, @Nullable Composer composer, final int i, final int i2, final int i3) {
        int i4;
        final SheetState sheetState2;
        int i5;
        long jM9292contentColorForek8zF_U;
        int i6;
        int i7;
        Function2<? super Composer, ? super Integer, Unit> function22;
        int i8;
        SheetState sheetStateRememberModalBottomSheetState;
        Modifier modifier2;
        int i9;
        Shape expandedShape;
        long containerColor;
        long j4;
        long scrimColor;
        WindowInsets windowInsets2;
        float f3;
        ModalBottomSheetProperties modalBottomSheetPropertiesProperties$default;
        int i10;
        int i11;
        WindowInsets windowInsets3;
        float f4;
        long j5;
        long j6;
        Modifier modifier3;
        WindowInsets windowInsets4;
        int i12;
        Function2<? super Composer, ? super Integer, Unit> function23;
        boolean z;
        boolean zChanged;
        Object objRememberedValue;
        Object objRememberedValue2;
        Composer.Companion companion;
        float f5;
        boolean z2;
        boolean zChangedInstance;
        Object objRememberedValue3;
        boolean zChangedInstance2;
        Object objRememberedValue4;
        boolean zChangedInstance3;
        Object objRememberedValue5;
        final WindowInsets windowInsets5;
        final Function2<? super Composer, ? super Integer, Unit> function24;
        float f6;
        final long j7;
        final Shape shape2;
        final ModalBottomSheetProperties modalBottomSheetProperties2;
        final long j8;
        final float f7;
        Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(944867294);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i13 = i3 & 2;
        if (i13 != 0) {
            i4 |= 48;
        } else {
            if ((i & 48) == 0) {
                i4 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                if ((i3 & 4) == 0) {
                    sheetState2 = sheetState;
                    int i14 = composerStartRestartGroup.changed(sheetState2) ? 256 : 128;
                    i4 |= i14;
                } else {
                    sheetState2 = sheetState;
                }
                i4 |= i14;
            } else {
                sheetState2 = sheetState;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    i4 |= composerStartRestartGroup.changed(f) ? 2048 : 1024;
                }
                if ((i & CpioConstants.C_ISBLK) == 0) {
                    i4 |= ((i3 & 16) == 0 && composerStartRestartGroup.changed(shape)) ? 16384 : 8192;
                }
                if ((i & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
                    i4 |= ((i3 & 32) == 0 && composerStartRestartGroup.changed(j)) ? 131072 : 65536;
                }
                if ((i & 1572864) == 0) {
                    jM9292contentColorForek8zF_U = j2;
                    i4 |= ((i3 & 64) == 0 && composerStartRestartGroup.changed(jM9292contentColorForek8zF_U)) ? 1048576 : 524288;
                } else {
                    jM9292contentColorForek8zF_U = j2;
                }
                i6 = i3 & 128;
                if (i6 != 0) {
                    i4 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i4 |= composerStartRestartGroup.changed(f2) ? 8388608 : 4194304;
                }
                if ((i & 100663296) == 0) {
                    i4 |= ((i3 & 256) == 0 && composerStartRestartGroup.changed(j3)) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                }
                i7 = i3 & 512;
                if (i7 == 0) {
                    if ((805306368 & i) == 0) {
                        function22 = function2;
                        i4 |= composerStartRestartGroup.changedInstance(function22) ? 536870912 : 268435456;
                    }
                    if ((i2 & 6) != 0) {
                        i8 = i2 | (((i3 & 1024) == 0 && composerStartRestartGroup.changed(windowInsets)) ? 4 : 2);
                    } else {
                        i8 = i2;
                    }
                    if ((i2 & 48) == 0) {
                        i8 |= ((i3 & 2048) == 0 && composerStartRestartGroup.changed(modalBottomSheetProperties)) ? 32 : 16;
                    }
                    int i15 = i8;
                    if ((i3 & 4096) == 0) {
                        i15 |= 384;
                    } else if ((i2 & 384) == 0) {
                        i15 |= composerStartRestartGroup.changedInstance(function3) ? 256 : 128;
                    }
                    if ((306783379 & i4) == 306783378 || (i15 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            Modifier modifier5 = i13 == 0 ? Modifier.INSTANCE : modifier;
                            if ((i3 & 4) == 0) {
                                sheetStateRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, composerStartRestartGroup, 0, 3);
                                i4 &= -897;
                            } else {
                                sheetStateRememberModalBottomSheetState = sheetState2;
                            }
                            float fM9148getSheetMaxWidthD9Ej5fM = i5 == 0 ? BottomSheetDefaults.INSTANCE.m9148getSheetMaxWidthD9Ej5fM() : f;
                            if ((i3 & 16) == 0) {
                                modifier2 = modifier5;
                                i9 = 6;
                                expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                                i4 &= -57345;
                            } else {
                                modifier2 = modifier5;
                                i9 = 6;
                                expandedShape = shape;
                            }
                            SheetState sheetState3 = sheetStateRememberModalBottomSheetState;
                            if ((i3 & 32) == 0) {
                                i4 &= -458753;
                                containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, i9);
                            } else {
                                containerColor = j;
                            }
                            if ((i3 & 64) != 0) {
                                jM9292contentColorForek8zF_U = ColorSchemeKt.m9292contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i4 >> 15) & 14);
                                i4 &= -3670017;
                            }
                            float fM9147getElevationD9Ej5fM = i6 == 0 ? BottomSheetDefaults.INSTANCE.m9147getElevationD9Ej5fM() : f2;
                            if ((i3 & 256) == 0) {
                                j4 = containerColor;
                                scrimColor = BottomSheetDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                                i4 &= -234881025;
                            } else {
                                j4 = containerColor;
                                scrimColor = j3;
                            }
                            Function2<? super Composer, ? super Integer, Unit> function2M9325getLambda1$material3_release = i7 == 0 ? ComposableSingletons$ModalBottomSheet_androidKt.INSTANCE.m9325getLambda1$material3_release() : function22;
                            if ((i3 & 1024) == 0) {
                                windowInsets2 = BottomSheetDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                                i15 &= -15;
                            } else {
                                windowInsets2 = windowInsets;
                            }
                            if ((i3 & 2048) == 0) {
                                function22 = function2M9325getLambda1$material3_release;
                                i10 = i4;
                                i11 = i15 & (-113);
                                windowInsets3 = windowInsets2;
                                modalBottomSheetPropertiesProperties$default = ModalBottomSheetDefaults.properties$default(ModalBottomSheetDefaults.INSTANCE, null, false, false, 7, null);
                                f4 = fM9148getSheetMaxWidthD9Ej5fM;
                                j5 = j4;
                                j6 = scrimColor;
                                modifier3 = modifier2;
                                sheetState2 = sheetState3;
                                f3 = fM9147getElevationD9Ej5fM;
                            } else {
                                f3 = fM9147getElevationD9Ej5fM;
                                modalBottomSheetPropertiesProperties$default = modalBottomSheetProperties;
                                function22 = function2M9325getLambda1$material3_release;
                                i10 = i4;
                                i11 = i15;
                                windowInsets3 = windowInsets2;
                                f4 = fM9148getSheetMaxWidthD9Ej5fM;
                                j5 = j4;
                                j6 = scrimColor;
                                modifier3 = modifier2;
                                sheetState2 = sheetState3;
                            }
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                            }
                            if ((i3 & 16) != 0) {
                                i4 &= -57345;
                            }
                            if ((i3 & 32) != 0) {
                                i4 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                i4 &= -3670017;
                            }
                            if ((i3 & 256) != 0) {
                                i4 &= -234881025;
                            }
                            if ((i3 & 1024) != 0) {
                                i15 &= -15;
                            }
                            if ((i3 & 2048) != 0) {
                                i15 &= -113;
                            }
                            modifier3 = modifier;
                            expandedShape = shape;
                            f3 = f2;
                            j6 = j3;
                            windowInsets3 = windowInsets;
                            modalBottomSheetPropertiesProperties$default = modalBottomSheetProperties;
                            i10 = i4;
                            i11 = i15;
                            f4 = f;
                            j5 = j;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            windowInsets4 = windowInsets3;
                        } else {
                            windowInsets4 = windowInsets3;
                            ComposerKt.traceEventStart(944867294, i10, i11, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.android.kt:150)");
                        }
                        final Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        composerStartRestartGroup.startReplaceableGroup(-203430466);
                        i12 = (i10 & 896) ^ 384;
                        int i16 = i11;
                        if (i12 > 256 || !composerStartRestartGroup.changed(sheetState2)) {
                            function23 = function22;
                            if ((i10 & 384) != 256) {
                                z = false;
                            }
                            zChanged = z | composerStartRestartGroup.changed(density);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0<Unit>() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$1$1
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
                                        sheetState2.setDensity$material3_release(density);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            EffectsKt.SideEffect((Function0) objRememberedValue, composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(773894976);
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue2 == companion.getEmpty()) {
                                objRememberedValue2 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue2).getCoroutineScope();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.startReplaceableGroup(-203430341);
                            if (i12 > 256 || !composerStartRestartGroup.changed(sheetState2)) {
                                f5 = f3;
                                if ((i10 & 384) != 256) {
                                    z2 = false;
                                }
                                int i17 = i10 & 14;
                                final long j9 = jM9292contentColorForek8zF_U;
                                zChangedInstance = z2 | composerStartRestartGroup.changedInstance(coroutineScope) | (i17 == 4);
                                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                if (zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                                    objRememberedValue3 = new Function0<Unit>() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$animateToDismiss$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* compiled from: ModalBottomSheet.android.kt */
                                        @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
                                        @DebugMetadata(m7119c = "androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$animateToDismiss$1$1$1", m7120f = "ModalBottomSheet.android.kt", m7121i = {}, m7122l = {160}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
                                        /* renamed from: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$animateToDismiss$1$1$1 */
                                        /* loaded from: classes2.dex */
                                        public static final class C15051 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                            public final /* synthetic */ SheetState $sheetState;
                                            public int label;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            public C15051(SheetState sheetState, Continuation<? super C15051> continuation) {
                                                super(2, continuation);
                                                this.$sheetState = sheetState;
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            @NotNull
                                            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                return new C15051(this.$sheetState, continuation);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            @Nullable
                                            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                                return ((C15051) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            @Nullable
                                            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                                                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                int i = this.label;
                                                if (i == 0) {
                                                    ResultKt.throwOnFailure(obj);
                                                    SheetState sheetState = this.$sheetState;
                                                    this.label = 1;
                                                    if (sheetState.hide(this) == coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                } else {
                                                    if (i != 1) {
                                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                    }
                                                    ResultKt.throwOnFailure(obj);
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            if (sheetState2.getAnchoredDraggableState$material3_release().getConfirmValueChange$material3_release().invoke(SheetValue.Hidden).booleanValue()) {
                                                Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C15051(sheetState2, null), 3, null);
                                                final SheetState sheetState4 = sheetState2;
                                                final Function0<Unit> function02 = function0;
                                                jobLaunch$default.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$animateToDismiss$1$1.2
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                                                        invoke2(th);
                                                        return Unit.INSTANCE;
                                                    }

                                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                    public final void invoke2(@Nullable Throwable th) {
                                                        if (sheetState4.isVisible()) {
                                                            return;
                                                        }
                                                        function02.invoke();
                                                    }
                                                });
                                            }
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                }
                                final Function0 function02 = (Function0) objRememberedValue3;
                                composerStartRestartGroup.endReplaceableGroup();
                                composerStartRestartGroup.startReplaceableGroup(-203430010);
                                zChangedInstance2 = composerStartRestartGroup.changedInstance(coroutineScope) | ((i12 <= 256 && composerStartRestartGroup.changed(sheetState2)) || (i10 & 384) == 256) | (i17 == 4);
                                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                if (zChangedInstance2 || objRememberedValue4 == companion.getEmpty()) {
                                    objRememberedValue4 = new Function1<Float, Unit>() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$settleToDismiss$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        /* compiled from: ModalBottomSheet.android.kt */
                                        @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
                                        @DebugMetadata(m7119c = "androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$settleToDismiss$1$1$1", m7120f = "ModalBottomSheet.android.kt", m7121i = {}, m7122l = {168}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
                                        /* renamed from: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$settleToDismiss$1$1$1 */
                                        /* loaded from: classes2.dex */
                                        public static final class C15071 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                            public final /* synthetic */ float $it;
                                            public final /* synthetic */ SheetState $sheetState;
                                            public int label;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            public C15071(SheetState sheetState, float f, Continuation<? super C15071> continuation) {
                                                super(2, continuation);
                                                this.$sheetState = sheetState;
                                                this.$it = f;
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            @NotNull
                                            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                return new C15071(this.$sheetState, this.$it, continuation);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            @Nullable
                                            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                                return ((C15071) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            @Nullable
                                            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                                                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                int i = this.label;
                                                if (i == 0) {
                                                    ResultKt.throwOnFailure(obj);
                                                    SheetState sheetState = this.$sheetState;
                                                    float f = this.$it;
                                                    this.label = 1;
                                                    if (sheetState.settle$material3_release(f, this) == coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                } else {
                                                    if (i != 1) {
                                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                    }
                                                    ResultKt.throwOnFailure(obj);
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(Float f8) {
                                            invoke(f8.floatValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(float f8) {
                                            Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C15071(sheetState2, f8, null), 3, null);
                                            final SheetState sheetState4 = sheetState2;
                                            final Function0<Unit> function03 = function0;
                                            jobLaunch$default.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$settleToDismiss$1$1.2
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                                                    invoke2(th);
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(@Nullable Throwable th) {
                                                    if (sheetState4.isVisible()) {
                                                        return;
                                                    }
                                                    function03.invoke();
                                                }
                                            });
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                }
                                final Function1 function1 = (Function1) objRememberedValue4;
                                composerStartRestartGroup.endReplaceableGroup();
                                composerStartRestartGroup.startReplaceableGroup(-203429778);
                                zChangedInstance3 = ((i12 <= 256 && composerStartRestartGroup.changed(sheetState2)) || (i10 & 384) == 256) | composerStartRestartGroup.changedInstance(coroutineScope) | (i17 == 4);
                                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                if (zChangedInstance3 || objRememberedValue5 == companion.getEmpty()) {
                                    objRememberedValue5 = new Function0<Unit>() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$2$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* compiled from: ModalBottomSheet.android.kt */
                                        @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
                                        @DebugMetadata(m7119c = "androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$2$1$1", m7120f = "ModalBottomSheet.android.kt", m7121i = {}, m7122l = {177}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
                                        /* renamed from: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$2$1$1 */
                                        /* loaded from: classes2.dex */
                                        public static final class C14991 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                            public final /* synthetic */ SheetState $sheetState;
                                            public int label;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            public C14991(SheetState sheetState, Continuation<? super C14991> continuation) {
                                                super(2, continuation);
                                                this.$sheetState = sheetState;
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            @NotNull
                                            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                return new C14991(this.$sheetState, continuation);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            @Nullable
                                            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                                return ((C14991) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            @Nullable
                                            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                                                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                int i = this.label;
                                                if (i == 0) {
                                                    ResultKt.throwOnFailure(obj);
                                                    SheetState sheetState = this.$sheetState;
                                                    this.label = 1;
                                                    if (sheetState.partialExpand(this) == coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                } else {
                                                    if (i != 1) {
                                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                    }
                                                    ResultKt.throwOnFailure(obj);
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            if (sheetState2.getCurrentValue() != SheetValue.Expanded || !sheetState2.getHasPartiallyExpandedState()) {
                                                Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C15002(sheetState2, null), 3, null);
                                                final Function0<Unit> function03 = function0;
                                                jobLaunch$default.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$2$1.3
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                                                        invoke2(th);
                                                        return Unit.INSTANCE;
                                                    }

                                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                    public final void invoke2(@Nullable Throwable th) {
                                                        function03.invoke();
                                                    }
                                                });
                                                return;
                                            }
                                            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C14991(sheetState2, null), 3, null);
                                        }

                                        /* compiled from: ModalBottomSheet.android.kt */
                                        @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
                                        @DebugMetadata(m7119c = "androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$2$1$2", m7120f = "ModalBottomSheet.android.kt", m7121i = {}, m7122l = {179}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
                                        /* renamed from: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$2$1$2 */
                                        /* loaded from: classes2.dex */
                                        public static final class C15002 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                            public final /* synthetic */ SheetState $sheetState;
                                            public int label;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            public C15002(SheetState sheetState, Continuation<? super C15002> continuation) {
                                                super(2, continuation);
                                                this.$sheetState = sheetState;
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            @NotNull
                                            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                return new C15002(this.$sheetState, continuation);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            @Nullable
                                            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                                return ((C15002) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            @Nullable
                                            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                                                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                int i = this.label;
                                                if (i == 0) {
                                                    ResultKt.throwOnFailure(obj);
                                                    SheetState sheetState = this.$sheetState;
                                                    this.label = 1;
                                                    if (sheetState.hide(this) == coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                } else {
                                                    if (i != 1) {
                                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                    }
                                                    ResultKt.throwOnFailure(obj);
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                final long j10 = j6;
                                final SheetState sheetState4 = sheetState2;
                                final Modifier modifier6 = modifier3;
                                final float f8 = f4;
                                final Shape shape3 = expandedShape;
                                final long j11 = j5;
                                final float f9 = f5;
                                final Function2<? super Composer, ? super Integer, Unit> function25 = function23;
                                ModalBottomSheetPopup(modalBottomSheetPropertiesProperties$default, (Function0) objRememberedValue5, windowInsets4, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1311525899, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$3
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
                                    public final void invoke(@Nullable Composer composer2, int i18) {
                                        if ((i18 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1311525899, i18, -1, "androidx.compose.material3.ModalBottomSheet.<anonymous> (ModalBottomSheet.android.kt:183)");
                                            }
                                            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                                            final long j12 = j10;
                                            final Function0<Unit> function03 = function02;
                                            final SheetState sheetState5 = sheetState4;
                                            final Modifier modifier7 = modifier6;
                                            final float f10 = f8;
                                            final Function1<Float, Unit> function12 = function1;
                                            final Shape shape4 = shape3;
                                            final long j13 = j11;
                                            final long j14 = j9;
                                            final float f11 = f9;
                                            final Function2<Composer, Integer, Unit> function26 = function25;
                                            final CoroutineScope coroutineScope2 = coroutineScope;
                                            final Function3<ColumnScope, Composer, Integer, Unit> function32 = function3;
                                            BoxWithConstraintsKt.BoxWithConstraints(modifierFillMaxSize$default, null, false, ComposableLambdaKt.composableLambda(composer2, 2008499679, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$3.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(3);
                                                }

                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer3, Integer num) {
                                                    invoke(boxWithConstraintsScope, composer3, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                                @Composable
                                                public final void invoke(@NotNull BoxWithConstraintsScope boxWithConstraintsScope, @Nullable Composer composer3, int i19) {
                                                    int i20;
                                                    if ((i19 & 6) == 0) {
                                                        i20 = i19 | (composer3.changed(boxWithConstraintsScope) ? 4 : 2);
                                                    } else {
                                                        i20 = i19;
                                                    }
                                                    if ((i20 & 19) != 18 || !composer3.getSkipping()) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(2008499679, i20, -1, "androidx.compose.material3.ModalBottomSheet.<anonymous>.<anonymous> (ModalBottomSheet.android.kt:184)");
                                                        }
                                                        int iM13621getMaxHeightimpl = Constraints.m13621getMaxHeightimpl(boxWithConstraintsScope.mo8059getConstraintsmsEJaDk());
                                                        ModalBottomSheet_androidKt.m9572Scrim3JVO9M(j12, function03, sheetState5.getTargetValue() != SheetValue.Hidden, composer3, 0);
                                                        Strings.Companion companion2 = Strings.INSTANCE;
                                                        final String strM9866getStringNWtq28 = Strings_androidKt.m9866getStringNWtq28(Strings.m9797constructorimpl(C1551R.string.m3c_bottom_sheet_pane_title), composer3, 0);
                                                        Modifier modifierAlign = boxWithConstraintsScope.align(SizeKt.fillMaxWidth$default(SizeKt.m8179widthInVpY3zN4$default(modifier7, 0.0f, f10, 1, null), 0.0f, 1, null), Alignment.INSTANCE.getTopCenter());
                                                        composer3.startReplaceableGroup(-1482644208);
                                                        boolean zChanged2 = composer3.changed(strM9866getStringNWtq28);
                                                        Object objRememberedValue6 = composer3.rememberedValue();
                                                        if (zChanged2 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                                            objRememberedValue6 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$3$1$1$1
                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                {
                                                                    super(1);
                                                                }

                                                                @Override // kotlin.jvm.functions.Function1
                                                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                                    invoke2(semanticsPropertyReceiver);
                                                                    return Unit.INSTANCE;
                                                                }

                                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                                public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                                    SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, strM9866getStringNWtq28);
                                                                }
                                                            };
                                                            composer3.updateRememberedValue(objRememberedValue6);
                                                        }
                                                        composer3.endReplaceableGroup();
                                                        Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(modifierAlign, false, (Function1) objRememberedValue6, 1, null);
                                                        composer3.startReplaceableGroup(-1482644143);
                                                        boolean zChanged3 = composer3.changed(sheetState5);
                                                        final SheetState sheetState6 = sheetState5;
                                                        Object objRememberedValue7 = composer3.rememberedValue();
                                                        if (zChanged3 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                                            objRememberedValue7 = new Function1<Density, IntOffset>() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$3$1$2$1
                                                                {
                                                                    super(1);
                                                                }

                                                                @Override // kotlin.jvm.functions.Function1
                                                                public /* bridge */ /* synthetic */ IntOffset invoke(Density density2) {
                                                                    return IntOffset.m13785boximpl(m9574invokeBjo55l4(density2));
                                                                }

                                                                /* renamed from: invoke-Bjo55l4, reason: not valid java name */
                                                                public final long m9574invokeBjo55l4(@NotNull Density density2) {
                                                                    return IntOffsetKt.IntOffset(0, (int) sheetState6.requireOffset());
                                                                }
                                                            };
                                                            composer3.updateRememberedValue(objRememberedValue7);
                                                        }
                                                        composer3.endReplaceableGroup();
                                                        Modifier modifierOffset = OffsetKt.offset(modifierSemantics$default, (Function1) objRememberedValue7);
                                                        composer3.startReplaceableGroup(-1482643839);
                                                        boolean zChanged4 = composer3.changed(sheetState5);
                                                        SheetState sheetState7 = sheetState5;
                                                        Function1<Float, Unit> function13 = function12;
                                                        Object objRememberedValue8 = composer3.rememberedValue();
                                                        if (zChanged4 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                                            objRememberedValue8 = SheetDefaultsKt.ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(sheetState7, Orientation.Vertical, function13);
                                                            composer3.updateRememberedValue(objRememberedValue8);
                                                        }
                                                        composer3.endReplaceableGroup();
                                                        Modifier modifierNestedScroll$default = NestedScrollModifierKt.nestedScroll$default(modifierOffset, (NestedScrollConnection) objRememberedValue8, null, 2, null);
                                                        DraggableState draggableState = sheetState5.getAnchoredDraggableState$material3_release().getDraggableState();
                                                        Orientation orientation = Orientation.Vertical;
                                                        boolean zIsVisible = sheetState5.isVisible();
                                                        boolean zIsAnimationRunning = sheetState5.getAnchoredDraggableState$material3_release().isAnimationRunning();
                                                        composer3.startReplaceableGroup(-1482643097);
                                                        boolean zChanged5 = composer3.changed(function12);
                                                        Function1<Float, Unit> function14 = function12;
                                                        Object objRememberedValue9 = composer3.rememberedValue();
                                                        if (zChanged5 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                                                            objRememberedValue9 = new ModalBottomSheet_androidKt$ModalBottomSheet$3$1$4$1(function14, null);
                                                            composer3.updateRememberedValue(objRememberedValue9);
                                                        }
                                                        composer3.endReplaceableGroup();
                                                        Modifier modifierModalBottomSheetAnchors = ModalBottomSheet_androidKt.modalBottomSheetAnchors(DraggableKt.draggable(modifierNestedScroll$default, draggableState, orientation, (TsExtractor.TS_PACKET_SIZE & 4) != 0 ? true : zIsVisible, (TsExtractor.TS_PACKET_SIZE & 8) != 0 ? null : null, (TsExtractor.TS_PACKET_SIZE & 16) != 0 ? false : zIsAnimationRunning, (TsExtractor.TS_PACKET_SIZE & 32) != 0 ? new DraggableKt.C04701(null) : null, (TsExtractor.TS_PACKET_SIZE & 64) != 0 ? new DraggableKt.C04712(null) : (Function3) objRememberedValue9, (TsExtractor.TS_PACKET_SIZE & 128) != 0 ? false : false), sheetState5, iM13621getMaxHeightimpl);
                                                        Shape shape5 = shape4;
                                                        long j15 = j13;
                                                        long j16 = j14;
                                                        float f12 = f11;
                                                        final Function2<Composer, Integer, Unit> function27 = function26;
                                                        final SheetState sheetState8 = sheetState5;
                                                        final Function0<Unit> function04 = function03;
                                                        final CoroutineScope coroutineScope3 = coroutineScope2;
                                                        final Function3<ColumnScope, Composer, Integer, Unit> function33 = function32;
                                                        SurfaceKt.m9876SurfaceT9BRK9s(modifierModalBottomSheetAnchors, shape5, j15, j16, f12, 0.0f, null, ComposableLambdaKt.composableLambda(composer3, 1096570852, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt.ModalBottomSheet.3.1.5
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
                                                            public final void invoke(@Nullable Composer composer4, int i21) {
                                                                if ((i21 & 3) != 2 || !composer4.getSkipping()) {
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                        ComposerKt.traceEventStart(1096570852, i21, -1, "androidx.compose.material3.ModalBottomSheet.<anonymous>.<anonymous>.<anonymous> (ModalBottomSheet.android.kt:230)");
                                                                    }
                                                                    Modifier.Companion companion3 = Modifier.INSTANCE;
                                                                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
                                                                    Function2<Composer, Integer, Unit> function28 = function27;
                                                                    final SheetState sheetState9 = sheetState8;
                                                                    final Function0<Unit> function05 = function04;
                                                                    final CoroutineScope coroutineScope4 = coroutineScope3;
                                                                    Function3<ColumnScope, Composer, Integer, Unit> function34 = function33;
                                                                    composer4.startReplaceableGroup(-483455358);
                                                                    Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
                                                                    Alignment.Companion companion4 = Alignment.INSTANCE;
                                                                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion4.getStart(), composer4, 0);
                                                                    composer4.startReplaceableGroup(-1323940314);
                                                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                                                    CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                                                    ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                                                    Function0<ComposeUiNode> constructor = companion5.getConstructor();
                                                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
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
                                                                    Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyColumnMeasurePolicy, companion5.getSetMeasurePolicy());
                                                                    Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion5.getSetResolvedCompositionLocals());
                                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion5.getSetCompositeKeyHash();
                                                                    if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                                        composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                                        composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                                    }
                                                                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer4)), composer4, 0);
                                                                    composer4.startReplaceableGroup(2058660585);
                                                                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                                                    composer4.startReplaceableGroup(-11289086);
                                                                    if (function28 != null) {
                                                                        Strings.Companion companion6 = Strings.INSTANCE;
                                                                        final String strM9866getStringNWtq282 = Strings_androidKt.m9866getStringNWtq28(Strings.m9797constructorimpl(C1551R.string.m3c_bottom_sheet_collapse_description), composer4, 0);
                                                                        final String strM9866getStringNWtq283 = Strings_androidKt.m9866getStringNWtq28(Strings.m9797constructorimpl(C1551R.string.m3c_bottom_sheet_dismiss_description), composer4, 0);
                                                                        final String strM9866getStringNWtq284 = Strings_androidKt.m9866getStringNWtq28(Strings.m9797constructorimpl(C1551R.string.m3c_bottom_sheet_expand_description), composer4, 0);
                                                                        Modifier modifierAlign2 = columnScopeInstance.align(companion3, companion4.getCenterHorizontally());
                                                                        composer4.startReplaceableGroup(-11288530);
                                                                        boolean zChanged6 = composer4.changed(sheetState9) | composer4.changed(strM9866getStringNWtq283) | composer4.changed(function05) | composer4.changed(strM9866getStringNWtq284) | composer4.changedInstance(coroutineScope4) | composer4.changed(strM9866getStringNWtq282);
                                                                        Object objRememberedValue10 = composer4.rememberedValue();
                                                                        if (zChanged6 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                                                                            objRememberedValue10 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$3$1$5$1$1$1
                                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                                {
                                                                                    super(1);
                                                                                }

                                                                                @Override // kotlin.jvm.functions.Function1
                                                                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                                                    invoke2(semanticsPropertyReceiver);
                                                                                    return Unit.INSTANCE;
                                                                                }

                                                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                                                public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                                                    final SheetState sheetState10 = sheetState9;
                                                                                    String str = strM9866getStringNWtq283;
                                                                                    String str2 = strM9866getStringNWtq284;
                                                                                    String str3 = strM9866getStringNWtq282;
                                                                                    final Function0<Unit> function06 = function05;
                                                                                    final CoroutineScope coroutineScope5 = coroutineScope4;
                                                                                    SemanticsPropertiesKt.dismiss(semanticsPropertyReceiver, str, new Function0<Boolean>() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$3$1$5$1$1$1$1$1
                                                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                                        {
                                                                                            super(0);
                                                                                        }

                                                                                        /* JADX WARN: Can't rename method to resolve collision */
                                                                                        @Override // kotlin.jvm.functions.Function0
                                                                                        @NotNull
                                                                                        public final Boolean invoke() {
                                                                                            function06.invoke();
                                                                                            return Boolean.TRUE;
                                                                                        }
                                                                                    });
                                                                                    if (sheetState10.getCurrentValue() == SheetValue.PartiallyExpanded) {
                                                                                        SemanticsPropertiesKt.expand(semanticsPropertyReceiver, str2, new Function0<Boolean>() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$3$1$5$1$1$1$1$2
                                                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                                            {
                                                                                                super(0);
                                                                                            }

                                                                                            /* JADX WARN: Can't rename method to resolve collision */
                                                                                            @Override // kotlin.jvm.functions.Function0
                                                                                            @NotNull
                                                                                            public final Boolean invoke() {
                                                                                                if (sheetState10.getAnchoredDraggableState$material3_release().getConfirmValueChange$material3_release().invoke(SheetValue.Expanded).booleanValue()) {
                                                                                                    BuildersKt__Builders_commonKt.launch$default(coroutineScope5, null, null, new C15031(sheetState10, null), 3, null);
                                                                                                }
                                                                                                return Boolean.TRUE;
                                                                                            }

                                                                                            /* compiled from: ModalBottomSheet.android.kt */
                                                                                            @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
                                                                                            @DebugMetadata(m7119c = "androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$3$1$5$1$1$1$1$2$1", m7120f = "ModalBottomSheet.android.kt", m7121i = {}, m7122l = {254}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
                                                                                            /* renamed from: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$3$1$5$1$1$1$1$2$1 */
                                                                                            /* loaded from: classes2.dex */
                                                                                            public static final class C15031 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                                                                public final /* synthetic */ SheetState $sheetState;
                                                                                                public int label;

                                                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                                                public C15031(SheetState sheetState, Continuation<? super C15031> continuation) {
                                                                                                    super(2, continuation);
                                                                                                    this.$sheetState = sheetState;
                                                                                                }

                                                                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                                                @NotNull
                                                                                                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                                                                    return new C15031(this.$sheetState, continuation);
                                                                                                }

                                                                                                @Override // kotlin.jvm.functions.Function2
                                                                                                @Nullable
                                                                                                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                                                                                    return ((C15031) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                                                                }

                                                                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                                                @Nullable
                                                                                                public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                                                                                                    Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                                                                    int i = this.label;
                                                                                                    if (i == 0) {
                                                                                                        ResultKt.throwOnFailure(obj);
                                                                                                        SheetState sheetState = this.$sheetState;
                                                                                                        this.label = 1;
                                                                                                        if (sheetState.expand(this) == coroutine_suspended) {
                                                                                                            return coroutine_suspended;
                                                                                                        }
                                                                                                    } else {
                                                                                                        if (i != 1) {
                                                                                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                                                        }
                                                                                                        ResultKt.throwOnFailure(obj);
                                                                                                    }
                                                                                                    return Unit.INSTANCE;
                                                                                                }
                                                                                            }
                                                                                        });
                                                                                    } else if (sheetState10.getHasPartiallyExpandedState()) {
                                                                                        SemanticsPropertiesKt.collapse(semanticsPropertyReceiver, str3, new Function0<Boolean>() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$3$1$5$1$1$1$1$3
                                                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                                            {
                                                                                                super(0);
                                                                                            }

                                                                                            /* JADX WARN: Can't rename method to resolve collision */
                                                                                            @Override // kotlin.jvm.functions.Function0
                                                                                            @NotNull
                                                                                            public final Boolean invoke() {
                                                                                                if (sheetState10.getAnchoredDraggableState$material3_release().getConfirmValueChange$material3_release().invoke(SheetValue.PartiallyExpanded).booleanValue()) {
                                                                                                    BuildersKt__Builders_commonKt.launch$default(coroutineScope5, null, null, new C15041(sheetState10, null), 3, null);
                                                                                                }
                                                                                                return Boolean.TRUE;
                                                                                            }

                                                                                            /* compiled from: ModalBottomSheet.android.kt */
                                                                                            @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
                                                                                            @DebugMetadata(m7119c = "androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$3$1$5$1$1$1$1$3$1", m7120f = "ModalBottomSheet.android.kt", m7121i = {}, m7122l = {264}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
                                                                                            /* renamed from: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$3$1$5$1$1$1$1$3$1 */
                                                                                            /* loaded from: classes2.dex */
                                                                                            public static final class C15041 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                                                                public final /* synthetic */ SheetState $this_with;
                                                                                                public int label;

                                                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                                                public C15041(SheetState sheetState, Continuation<? super C15041> continuation) {
                                                                                                    super(2, continuation);
                                                                                                    this.$this_with = sheetState;
                                                                                                }

                                                                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                                                @NotNull
                                                                                                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                                                                    return new C15041(this.$this_with, continuation);
                                                                                                }

                                                                                                @Override // kotlin.jvm.functions.Function2
                                                                                                @Nullable
                                                                                                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                                                                                    return ((C15041) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                                                                }

                                                                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                                                @Nullable
                                                                                                public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                                                                                                    Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                                                                    int i = this.label;
                                                                                                    if (i == 0) {
                                                                                                        ResultKt.throwOnFailure(obj);
                                                                                                        SheetState sheetState = this.$this_with;
                                                                                                        this.label = 1;
                                                                                                        if (sheetState.partialExpand(this) == coroutine_suspended) {
                                                                                                            return coroutine_suspended;
                                                                                                        }
                                                                                                    } else {
                                                                                                        if (i != 1) {
                                                                                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                                                        }
                                                                                                        ResultKt.throwOnFailure(obj);
                                                                                                    }
                                                                                                    return Unit.INSTANCE;
                                                                                                }
                                                                                            }
                                                                                        });
                                                                                    }
                                                                                }
                                                                            };
                                                                            composer4.updateRememberedValue(objRememberedValue10);
                                                                        }
                                                                        composer4.endReplaceableGroup();
                                                                        Modifier modifierSemantics = SemanticsModifierKt.semantics(modifierAlign2, true, (Function1) objRememberedValue10);
                                                                        composer4.startReplaceableGroup(733328855);
                                                                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion4.getTopStart(), false, composer4, 0);
                                                                        composer4.startReplaceableGroup(-1323940314);
                                                                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                                                        CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                                                        Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
                                                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierSemantics);
                                                                        if (!(composer4.getApplier() instanceof Applier)) {
                                                                            ComposablesKt.invalidApplier();
                                                                        }
                                                                        composer4.startReusableNode();
                                                                        if (composer4.getInserting()) {
                                                                            composer4.createNode(constructor2);
                                                                        } else {
                                                                            composer4.useNode();
                                                                        }
                                                                        Composer composerM10870constructorimpl2 = Updater.m10870constructorimpl(composer4);
                                                                        Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy, companion5.getSetMeasurePolicy());
                                                                        Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
                                                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
                                                                        if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                                            composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                                            composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                                                        }
                                                                        function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer4)), composer4, 0);
                                                                        composer4.startReplaceableGroup(2058660585);
                                                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                                        function28.invoke(composer4, 0);
                                                                        composer4.endReplaceableGroup();
                                                                        composer4.endNode();
                                                                        composer4.endReplaceableGroup();
                                                                        composer4.endReplaceableGroup();
                                                                    }
                                                                    composer4.endReplaceableGroup();
                                                                    function34.invoke(columnScopeInstance, composer4, 6);
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
                                                        }), composer3, 12582912, 96);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    composer3.skipToGroupEnd();
                                                }
                                            }), composer2, 3078, 6);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }
                                }), composerStartRestartGroup, ((i16 >> 3) & 14) | 3072 | ((i16 << 6) & 896));
                                if (sheetState2.getHasExpandedState()) {
                                    composerStartRestartGroup.startReplaceableGroup(-203424502);
                                    boolean z3 = (i12 > 256 && composerStartRestartGroup.changed(sheetState2)) || (i10 & 384) == 256;
                                    Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                                    if (z3 || objRememberedValue6 == companion.getEmpty()) {
                                        objRememberedValue6 = new ModalBottomSheet_androidKt$ModalBottomSheet$4$1(sheetState2, null);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    EffectsKt.LaunchedEffect(sheetState2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue6, composerStartRestartGroup, (i10 >> 6) & 14);
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                windowInsets5 = windowInsets4;
                                function24 = function23;
                                f6 = f5;
                                j7 = j5;
                                shape2 = expandedShape;
                                modalBottomSheetProperties2 = modalBottomSheetPropertiesProperties$default;
                                j8 = j9;
                                f7 = f4;
                                modifier4 = modifier3;
                            } else {
                                f5 = f3;
                            }
                            z2 = true;
                            int i172 = i10 & 14;
                            final long j92 = jM9292contentColorForek8zF_U;
                            zChangedInstance = z2 | composerStartRestartGroup.changedInstance(coroutineScope) | (i172 == 4);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (zChangedInstance) {
                                objRememberedValue3 = new Function0<Unit>() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$animateToDismiss$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* compiled from: ModalBottomSheet.android.kt */
                                    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
                                    @DebugMetadata(m7119c = "androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$animateToDismiss$1$1$1", m7120f = "ModalBottomSheet.android.kt", m7121i = {}, m7122l = {160}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
                                    /* renamed from: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$animateToDismiss$1$1$1 */
                                    /* loaded from: classes2.dex */
                                    public static final class C15051 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                        public final /* synthetic */ SheetState $sheetState;
                                        public int label;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        public C15051(SheetState sheetState, Continuation<? super C15051> continuation) {
                                            super(2, continuation);
                                            this.$sheetState = sheetState;
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        @NotNull
                                        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                            return new C15051(this.$sheetState, continuation);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        @Nullable
                                        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                            return ((C15051) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        @Nullable
                                        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                                            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                            int i = this.label;
                                            if (i == 0) {
                                                ResultKt.throwOnFailure(obj);
                                                SheetState sheetState = this.$sheetState;
                                                this.label = 1;
                                                if (sheetState.hide(this) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                            } else {
                                                if (i != 1) {
                                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                }
                                                ResultKt.throwOnFailure(obj);
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        if (sheetState2.getAnchoredDraggableState$material3_release().getConfirmValueChange$material3_release().invoke(SheetValue.Hidden).booleanValue()) {
                                            Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C15051(sheetState2, null), 3, null);
                                            final SheetState sheetState42 = sheetState2;
                                            final Function0<Unit> function022 = function0;
                                            jobLaunch$default.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$animateToDismiss$1$1.2
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                                                    invoke2(th);
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(@Nullable Throwable th) {
                                                    if (sheetState42.isVisible()) {
                                                        return;
                                                    }
                                                    function022.invoke();
                                                }
                                            });
                                        }
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                final Function0<Unit> function022 = (Function0) objRememberedValue3;
                                composerStartRestartGroup.endReplaceableGroup();
                                composerStartRestartGroup.startReplaceableGroup(-203430010);
                                if (i12 <= 256) {
                                    zChangedInstance2 = composerStartRestartGroup.changedInstance(coroutineScope) | ((i12 <= 256 && composerStartRestartGroup.changed(sheetState2)) || (i10 & 384) == 256) | (i172 == 4);
                                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                    if (zChangedInstance2) {
                                        objRememberedValue4 = new Function1<Float, Unit>() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$settleToDismiss$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            /* compiled from: ModalBottomSheet.android.kt */
                                            @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
                                            @DebugMetadata(m7119c = "androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$settleToDismiss$1$1$1", m7120f = "ModalBottomSheet.android.kt", m7121i = {}, m7122l = {168}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
                                            /* renamed from: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$settleToDismiss$1$1$1 */
                                            /* loaded from: classes2.dex */
                                            public static final class C15071 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                public final /* synthetic */ float $it;
                                                public final /* synthetic */ SheetState $sheetState;
                                                public int label;

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                public C15071(SheetState sheetState, float f, Continuation<? super C15071> continuation) {
                                                    super(2, continuation);
                                                    this.$sheetState = sheetState;
                                                    this.$it = f;
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                @NotNull
                                                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                    return new C15071(this.$sheetState, this.$it, continuation);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                @Nullable
                                                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                                    return ((C15071) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                @Nullable
                                                public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                                                    Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                    int i = this.label;
                                                    if (i == 0) {
                                                        ResultKt.throwOnFailure(obj);
                                                        SheetState sheetState = this.$sheetState;
                                                        float f = this.$it;
                                                        this.label = 1;
                                                        if (sheetState.settle$material3_release(f, this) == coroutine_suspended) {
                                                            return coroutine_suspended;
                                                        }
                                                    } else {
                                                        if (i != 1) {
                                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                        }
                                                        ResultKt.throwOnFailure(obj);
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(Float f82) {
                                                invoke(f82.floatValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(float f82) {
                                                Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C15071(sheetState2, f82, null), 3, null);
                                                final SheetState sheetState42 = sheetState2;
                                                final Function0<Unit> function03 = function0;
                                                jobLaunch$default.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$settleToDismiss$1$1.2
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                                                        invoke2(th);
                                                        return Unit.INSTANCE;
                                                    }

                                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                    public final void invoke2(@Nullable Throwable th) {
                                                        if (sheetState42.isVisible()) {
                                                            return;
                                                        }
                                                        function03.invoke();
                                                    }
                                                });
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                        final Function1<? super Float, Unit> function12 = (Function1) objRememberedValue4;
                                        composerStartRestartGroup.endReplaceableGroup();
                                        composerStartRestartGroup.startReplaceableGroup(-203429778);
                                        if (i12 <= 256) {
                                            zChangedInstance3 = ((i12 <= 256 && composerStartRestartGroup.changed(sheetState2)) || (i10 & 384) == 256) | composerStartRestartGroup.changedInstance(coroutineScope) | (i172 == 4);
                                            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                            if (zChangedInstance3) {
                                                objRememberedValue5 = new Function0<Unit>() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$2$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(0);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function0
                                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                                        invoke2();
                                                        return Unit.INSTANCE;
                                                    }

                                                    /* compiled from: ModalBottomSheet.android.kt */
                                                    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
                                                    @DebugMetadata(m7119c = "androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$2$1$1", m7120f = "ModalBottomSheet.android.kt", m7121i = {}, m7122l = {177}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
                                                    /* renamed from: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$2$1$1 */
                                                    /* loaded from: classes2.dex */
                                                    public static final class C14991 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                        public final /* synthetic */ SheetState $sheetState;
                                                        public int label;

                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        public C14991(SheetState sheetState, Continuation<? super C14991> continuation) {
                                                            super(2, continuation);
                                                            this.$sheetState = sheetState;
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                        @NotNull
                                                        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                            return new C14991(this.$sheetState, continuation);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        @Nullable
                                                        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                                            return ((C14991) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                        @Nullable
                                                        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                                                            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                            int i = this.label;
                                                            if (i == 0) {
                                                                ResultKt.throwOnFailure(obj);
                                                                SheetState sheetState = this.$sheetState;
                                                                this.label = 1;
                                                                if (sheetState.partialExpand(this) == coroutine_suspended) {
                                                                    return coroutine_suspended;
                                                                }
                                                            } else {
                                                                if (i != 1) {
                                                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                }
                                                                ResultKt.throwOnFailure(obj);
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    }

                                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                    public final void invoke2() {
                                                        if (sheetState2.getCurrentValue() != SheetValue.Expanded || !sheetState2.getHasPartiallyExpandedState()) {
                                                            Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C15002(sheetState2, null), 3, null);
                                                            final Function0<Unit> function03 = function0;
                                                            jobLaunch$default.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$2$1.3
                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                {
                                                                    super(1);
                                                                }

                                                                @Override // kotlin.jvm.functions.Function1
                                                                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                                                                    invoke2(th);
                                                                    return Unit.INSTANCE;
                                                                }

                                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                                public final void invoke2(@Nullable Throwable th) {
                                                                    function03.invoke();
                                                                }
                                                            });
                                                            return;
                                                        }
                                                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C14991(sheetState2, null), 3, null);
                                                    }

                                                    /* compiled from: ModalBottomSheet.android.kt */
                                                    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
                                                    @DebugMetadata(m7119c = "androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$2$1$2", m7120f = "ModalBottomSheet.android.kt", m7121i = {}, m7122l = {179}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
                                                    /* renamed from: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$2$1$2 */
                                                    /* loaded from: classes2.dex */
                                                    public static final class C15002 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                        public final /* synthetic */ SheetState $sheetState;
                                                        public int label;

                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        public C15002(SheetState sheetState, Continuation<? super C15002> continuation) {
                                                            super(2, continuation);
                                                            this.$sheetState = sheetState;
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                        @NotNull
                                                        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                            return new C15002(this.$sheetState, continuation);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        @Nullable
                                                        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                                            return ((C15002) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                        @Nullable
                                                        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                                                            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                            int i = this.label;
                                                            if (i == 0) {
                                                                ResultKt.throwOnFailure(obj);
                                                                SheetState sheetState = this.$sheetState;
                                                                this.label = 1;
                                                                if (sheetState.hide(this) == coroutine_suspended) {
                                                                    return coroutine_suspended;
                                                                }
                                                            } else {
                                                                if (i != 1) {
                                                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                }
                                                                ResultKt.throwOnFailure(obj);
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    }
                                                };
                                                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                                composerStartRestartGroup.endReplaceableGroup();
                                                final long j102 = j6;
                                                final SheetState sheetState42 = sheetState2;
                                                final Modifier modifier62 = modifier3;
                                                final float f82 = f4;
                                                final Shape shape32 = expandedShape;
                                                final long j112 = j5;
                                                final float f92 = f5;
                                                final Function2<? super Composer, ? super Integer, Unit> function252 = function23;
                                                ModalBottomSheetPopup(modalBottomSheetPropertiesProperties$default, (Function0) objRememberedValue5, windowInsets4, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1311525899, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$3
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
                                                    public final void invoke(@Nullable Composer composer2, int i18) {
                                                        if ((i18 & 3) != 2 || !composer2.getSkipping()) {
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(-1311525899, i18, -1, "androidx.compose.material3.ModalBottomSheet.<anonymous> (ModalBottomSheet.android.kt:183)");
                                                            }
                                                            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                                                            final long j12 = j102;
                                                            final Function0<Unit> function03 = function022;
                                                            final SheetState sheetState5 = sheetState42;
                                                            final Modifier modifier7 = modifier62;
                                                            final float f10 = f82;
                                                            final Function1<? super Float, Unit> function122 = function12;
                                                            final Shape shape4 = shape32;
                                                            final long j13 = j112;
                                                            final long j14 = j92;
                                                            final float f11 = f92;
                                                            final Function2<? super Composer, ? super Integer, Unit> function26 = function252;
                                                            final CoroutineScope coroutineScope2 = coroutineScope;
                                                            final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function32 = function3;
                                                            BoxWithConstraintsKt.BoxWithConstraints(modifierFillMaxSize$default, null, false, ComposableLambdaKt.composableLambda(composer2, 2008499679, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$3.1
                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                /* JADX WARN: Multi-variable type inference failed */
                                                                {
                                                                    super(3);
                                                                }

                                                                @Override // kotlin.jvm.functions.Function3
                                                                public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer3, Integer num) {
                                                                    invoke(boxWithConstraintsScope, composer3, num.intValue());
                                                                    return Unit.INSTANCE;
                                                                }

                                                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                                                @Composable
                                                                public final void invoke(@NotNull BoxWithConstraintsScope boxWithConstraintsScope, @Nullable Composer composer3, int i19) {
                                                                    int i20;
                                                                    if ((i19 & 6) == 0) {
                                                                        i20 = i19 | (composer3.changed(boxWithConstraintsScope) ? 4 : 2);
                                                                    } else {
                                                                        i20 = i19;
                                                                    }
                                                                    if ((i20 & 19) != 18 || !composer3.getSkipping()) {
                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                            ComposerKt.traceEventStart(2008499679, i20, -1, "androidx.compose.material3.ModalBottomSheet.<anonymous>.<anonymous> (ModalBottomSheet.android.kt:184)");
                                                                        }
                                                                        int iM13621getMaxHeightimpl = Constraints.m13621getMaxHeightimpl(boxWithConstraintsScope.mo8059getConstraintsmsEJaDk());
                                                                        ModalBottomSheet_androidKt.m9572Scrim3JVO9M(j12, function03, sheetState5.getTargetValue() != SheetValue.Hidden, composer3, 0);
                                                                        Strings.Companion companion2 = Strings.INSTANCE;
                                                                        final String strM9866getStringNWtq28 = Strings_androidKt.m9866getStringNWtq28(Strings.m9797constructorimpl(C1551R.string.m3c_bottom_sheet_pane_title), composer3, 0);
                                                                        Modifier modifierAlign = boxWithConstraintsScope.align(SizeKt.fillMaxWidth$default(SizeKt.m8179widthInVpY3zN4$default(modifier7, 0.0f, f10, 1, null), 0.0f, 1, null), Alignment.INSTANCE.getTopCenter());
                                                                        composer3.startReplaceableGroup(-1482644208);
                                                                        boolean zChanged2 = composer3.changed(strM9866getStringNWtq28);
                                                                        Object objRememberedValue62 = composer3.rememberedValue();
                                                                        if (zChanged2 || objRememberedValue62 == Composer.INSTANCE.getEmpty()) {
                                                                            objRememberedValue62 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$3$1$1$1
                                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                                {
                                                                                    super(1);
                                                                                }

                                                                                @Override // kotlin.jvm.functions.Function1
                                                                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                                                    invoke2(semanticsPropertyReceiver);
                                                                                    return Unit.INSTANCE;
                                                                                }

                                                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                                                public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                                                    SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, strM9866getStringNWtq28);
                                                                                }
                                                                            };
                                                                            composer3.updateRememberedValue(objRememberedValue62);
                                                                        }
                                                                        composer3.endReplaceableGroup();
                                                                        Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(modifierAlign, false, (Function1) objRememberedValue62, 1, null);
                                                                        composer3.startReplaceableGroup(-1482644143);
                                                                        boolean zChanged3 = composer3.changed(sheetState5);
                                                                        final SheetState sheetState6 = sheetState5;
                                                                        Object objRememberedValue7 = composer3.rememberedValue();
                                                                        if (zChanged3 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                                                            objRememberedValue7 = new Function1<Density, IntOffset>() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$3$1$2$1
                                                                                {
                                                                                    super(1);
                                                                                }

                                                                                @Override // kotlin.jvm.functions.Function1
                                                                                public /* bridge */ /* synthetic */ IntOffset invoke(Density density2) {
                                                                                    return IntOffset.m13785boximpl(m9574invokeBjo55l4(density2));
                                                                                }

                                                                                /* renamed from: invoke-Bjo55l4, reason: not valid java name */
                                                                                public final long m9574invokeBjo55l4(@NotNull Density density2) {
                                                                                    return IntOffsetKt.IntOffset(0, (int) sheetState6.requireOffset());
                                                                                }
                                                                            };
                                                                            composer3.updateRememberedValue(objRememberedValue7);
                                                                        }
                                                                        composer3.endReplaceableGroup();
                                                                        Modifier modifierOffset = OffsetKt.offset(modifierSemantics$default, (Function1) objRememberedValue7);
                                                                        composer3.startReplaceableGroup(-1482643839);
                                                                        boolean zChanged4 = composer3.changed(sheetState5);
                                                                        SheetState sheetState7 = sheetState5;
                                                                        Function1<Float, Unit> function13 = function122;
                                                                        Object objRememberedValue8 = composer3.rememberedValue();
                                                                        if (zChanged4 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                                                            objRememberedValue8 = SheetDefaultsKt.ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(sheetState7, Orientation.Vertical, function13);
                                                                            composer3.updateRememberedValue(objRememberedValue8);
                                                                        }
                                                                        composer3.endReplaceableGroup();
                                                                        Modifier modifierNestedScroll$default = NestedScrollModifierKt.nestedScroll$default(modifierOffset, (NestedScrollConnection) objRememberedValue8, null, 2, null);
                                                                        DraggableState draggableState = sheetState5.getAnchoredDraggableState$material3_release().getDraggableState();
                                                                        Orientation orientation = Orientation.Vertical;
                                                                        boolean zIsVisible = sheetState5.isVisible();
                                                                        boolean zIsAnimationRunning = sheetState5.getAnchoredDraggableState$material3_release().isAnimationRunning();
                                                                        composer3.startReplaceableGroup(-1482643097);
                                                                        boolean zChanged5 = composer3.changed(function122);
                                                                        Function1<Float, Unit> function14 = function122;
                                                                        Object objRememberedValue9 = composer3.rememberedValue();
                                                                        if (zChanged5 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                                                                            objRememberedValue9 = new ModalBottomSheet_androidKt$ModalBottomSheet$3$1$4$1(function14, null);
                                                                            composer3.updateRememberedValue(objRememberedValue9);
                                                                        }
                                                                        composer3.endReplaceableGroup();
                                                                        Modifier modifierModalBottomSheetAnchors = ModalBottomSheet_androidKt.modalBottomSheetAnchors(DraggableKt.draggable(modifierNestedScroll$default, draggableState, orientation, (TsExtractor.TS_PACKET_SIZE & 4) != 0 ? true : zIsVisible, (TsExtractor.TS_PACKET_SIZE & 8) != 0 ? null : null, (TsExtractor.TS_PACKET_SIZE & 16) != 0 ? false : zIsAnimationRunning, (TsExtractor.TS_PACKET_SIZE & 32) != 0 ? new DraggableKt.C04701(null) : null, (TsExtractor.TS_PACKET_SIZE & 64) != 0 ? new DraggableKt.C04712(null) : (Function3) objRememberedValue9, (TsExtractor.TS_PACKET_SIZE & 128) != 0 ? false : false), sheetState5, iM13621getMaxHeightimpl);
                                                                        Shape shape5 = shape4;
                                                                        long j15 = j13;
                                                                        long j16 = j14;
                                                                        float f12 = f11;
                                                                        final Function2<? super Composer, ? super Integer, Unit> function27 = function26;
                                                                        final SheetState sheetState8 = sheetState5;
                                                                        final Function0<Unit> function04 = function03;
                                                                        final CoroutineScope coroutineScope3 = coroutineScope2;
                                                                        final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function33 = function32;
                                                                        SurfaceKt.m9876SurfaceT9BRK9s(modifierModalBottomSheetAnchors, shape5, j15, j16, f12, 0.0f, null, ComposableLambdaKt.composableLambda(composer3, 1096570852, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt.ModalBottomSheet.3.1.5
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
                                                                            public final void invoke(@Nullable Composer composer4, int i21) {
                                                                                if ((i21 & 3) != 2 || !composer4.getSkipping()) {
                                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                                        ComposerKt.traceEventStart(1096570852, i21, -1, "androidx.compose.material3.ModalBottomSheet.<anonymous>.<anonymous>.<anonymous> (ModalBottomSheet.android.kt:230)");
                                                                                    }
                                                                                    Modifier.Companion companion3 = Modifier.INSTANCE;
                                                                                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
                                                                                    Function2<Composer, Integer, Unit> function28 = function27;
                                                                                    final SheetState sheetState9 = sheetState8;
                                                                                    final Function0<Unit> function05 = function04;
                                                                                    final CoroutineScope coroutineScope4 = coroutineScope3;
                                                                                    Function3<ColumnScope, Composer, Integer, Unit> function34 = function33;
                                                                                    composer4.startReplaceableGroup(-483455358);
                                                                                    Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
                                                                                    Alignment.Companion companion4 = Alignment.INSTANCE;
                                                                                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion4.getStart(), composer4, 0);
                                                                                    composer4.startReplaceableGroup(-1323940314);
                                                                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                                                                    CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                                                                    ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                                                                    Function0<ComposeUiNode> constructor = companion5.getConstructor();
                                                                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
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
                                                                                    Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyColumnMeasurePolicy, companion5.getSetMeasurePolicy());
                                                                                    Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion5.getSetResolvedCompositionLocals());
                                                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion5.getSetCompositeKeyHash();
                                                                                    if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                                                        composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                                                        composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                                                    }
                                                                                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer4)), composer4, 0);
                                                                                    composer4.startReplaceableGroup(2058660585);
                                                                                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                                                                    composer4.startReplaceableGroup(-11289086);
                                                                                    if (function28 != null) {
                                                                                        Strings.Companion companion6 = Strings.INSTANCE;
                                                                                        final String strM9866getStringNWtq282 = Strings_androidKt.m9866getStringNWtq28(Strings.m9797constructorimpl(C1551R.string.m3c_bottom_sheet_collapse_description), composer4, 0);
                                                                                        final String strM9866getStringNWtq283 = Strings_androidKt.m9866getStringNWtq28(Strings.m9797constructorimpl(C1551R.string.m3c_bottom_sheet_dismiss_description), composer4, 0);
                                                                                        final String strM9866getStringNWtq284 = Strings_androidKt.m9866getStringNWtq28(Strings.m9797constructorimpl(C1551R.string.m3c_bottom_sheet_expand_description), composer4, 0);
                                                                                        Modifier modifierAlign2 = columnScopeInstance.align(companion3, companion4.getCenterHorizontally());
                                                                                        composer4.startReplaceableGroup(-11288530);
                                                                                        boolean zChanged6 = composer4.changed(sheetState9) | composer4.changed(strM9866getStringNWtq283) | composer4.changed(function05) | composer4.changed(strM9866getStringNWtq284) | composer4.changedInstance(coroutineScope4) | composer4.changed(strM9866getStringNWtq282);
                                                                                        Object objRememberedValue10 = composer4.rememberedValue();
                                                                                        if (zChanged6 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                                                                                            objRememberedValue10 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$3$1$5$1$1$1
                                                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                                                {
                                                                                                    super(1);
                                                                                                }

                                                                                                @Override // kotlin.jvm.functions.Function1
                                                                                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                                                                    invoke2(semanticsPropertyReceiver);
                                                                                                    return Unit.INSTANCE;
                                                                                                }

                                                                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                                                                public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                                                                    final SheetState sheetState10 = sheetState9;
                                                                                                    String str = strM9866getStringNWtq283;
                                                                                                    String str2 = strM9866getStringNWtq284;
                                                                                                    String str3 = strM9866getStringNWtq282;
                                                                                                    final Function0<Unit> function06 = function05;
                                                                                                    final CoroutineScope coroutineScope5 = coroutineScope4;
                                                                                                    SemanticsPropertiesKt.dismiss(semanticsPropertyReceiver, str, new Function0<Boolean>() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$3$1$5$1$1$1$1$1
                                                                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                                                        {
                                                                                                            super(0);
                                                                                                        }

                                                                                                        /* JADX WARN: Can't rename method to resolve collision */
                                                                                                        @Override // kotlin.jvm.functions.Function0
                                                                                                        @NotNull
                                                                                                        public final Boolean invoke() {
                                                                                                            function06.invoke();
                                                                                                            return Boolean.TRUE;
                                                                                                        }
                                                                                                    });
                                                                                                    if (sheetState10.getCurrentValue() == SheetValue.PartiallyExpanded) {
                                                                                                        SemanticsPropertiesKt.expand(semanticsPropertyReceiver, str2, new Function0<Boolean>() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$3$1$5$1$1$1$1$2
                                                                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                                                            {
                                                                                                                super(0);
                                                                                                            }

                                                                                                            /* JADX WARN: Can't rename method to resolve collision */
                                                                                                            @Override // kotlin.jvm.functions.Function0
                                                                                                            @NotNull
                                                                                                            public final Boolean invoke() {
                                                                                                                if (sheetState10.getAnchoredDraggableState$material3_release().getConfirmValueChange$material3_release().invoke(SheetValue.Expanded).booleanValue()) {
                                                                                                                    BuildersKt__Builders_commonKt.launch$default(coroutineScope5, null, null, new C15031(sheetState10, null), 3, null);
                                                                                                                }
                                                                                                                return Boolean.TRUE;
                                                                                                            }

                                                                                                            /* compiled from: ModalBottomSheet.android.kt */
                                                                                                            @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
                                                                                                            @DebugMetadata(m7119c = "androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$3$1$5$1$1$1$1$2$1", m7120f = "ModalBottomSheet.android.kt", m7121i = {}, m7122l = {254}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
                                                                                                            /* renamed from: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$3$1$5$1$1$1$1$2$1 */
                                                                                                            /* loaded from: classes2.dex */
                                                                                                            public static final class C15031 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                                                                                public final /* synthetic */ SheetState $sheetState;
                                                                                                                public int label;

                                                                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                                                                public C15031(SheetState sheetState, Continuation<? super C15031> continuation) {
                                                                                                                    super(2, continuation);
                                                                                                                    this.$sheetState = sheetState;
                                                                                                                }

                                                                                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                                                                @NotNull
                                                                                                                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                                                                                    return new C15031(this.$sheetState, continuation);
                                                                                                                }

                                                                                                                @Override // kotlin.jvm.functions.Function2
                                                                                                                @Nullable
                                                                                                                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                                                                                                    return ((C15031) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                                                                                }

                                                                                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                                                                @Nullable
                                                                                                                public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                                                                                                                    Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                                                                                    int i = this.label;
                                                                                                                    if (i == 0) {
                                                                                                                        ResultKt.throwOnFailure(obj);
                                                                                                                        SheetState sheetState = this.$sheetState;
                                                                                                                        this.label = 1;
                                                                                                                        if (sheetState.expand(this) == coroutine_suspended) {
                                                                                                                            return coroutine_suspended;
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        if (i != 1) {
                                                                                                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                                                                        }
                                                                                                                        ResultKt.throwOnFailure(obj);
                                                                                                                    }
                                                                                                                    return Unit.INSTANCE;
                                                                                                                }
                                                                                                            }
                                                                                                        });
                                                                                                    } else if (sheetState10.getHasPartiallyExpandedState()) {
                                                                                                        SemanticsPropertiesKt.collapse(semanticsPropertyReceiver, str3, new Function0<Boolean>() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$3$1$5$1$1$1$1$3
                                                                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                                                            {
                                                                                                                super(0);
                                                                                                            }

                                                                                                            /* JADX WARN: Can't rename method to resolve collision */
                                                                                                            @Override // kotlin.jvm.functions.Function0
                                                                                                            @NotNull
                                                                                                            public final Boolean invoke() {
                                                                                                                if (sheetState10.getAnchoredDraggableState$material3_release().getConfirmValueChange$material3_release().invoke(SheetValue.PartiallyExpanded).booleanValue()) {
                                                                                                                    BuildersKt__Builders_commonKt.launch$default(coroutineScope5, null, null, new C15041(sheetState10, null), 3, null);
                                                                                                                }
                                                                                                                return Boolean.TRUE;
                                                                                                            }

                                                                                                            /* compiled from: ModalBottomSheet.android.kt */
                                                                                                            @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
                                                                                                            @DebugMetadata(m7119c = "androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$3$1$5$1$1$1$1$3$1", m7120f = "ModalBottomSheet.android.kt", m7121i = {}, m7122l = {264}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
                                                                                                            /* renamed from: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$3$1$5$1$1$1$1$3$1 */
                                                                                                            /* loaded from: classes2.dex */
                                                                                                            public static final class C15041 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                                                                                public final /* synthetic */ SheetState $this_with;
                                                                                                                public int label;

                                                                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                                                                public C15041(SheetState sheetState, Continuation<? super C15041> continuation) {
                                                                                                                    super(2, continuation);
                                                                                                                    this.$this_with = sheetState;
                                                                                                                }

                                                                                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                                                                @NotNull
                                                                                                                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                                                                                    return new C15041(this.$this_with, continuation);
                                                                                                                }

                                                                                                                @Override // kotlin.jvm.functions.Function2
                                                                                                                @Nullable
                                                                                                                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                                                                                                    return ((C15041) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                                                                                }

                                                                                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                                                                @Nullable
                                                                                                                public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                                                                                                                    Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                                                                                    int i = this.label;
                                                                                                                    if (i == 0) {
                                                                                                                        ResultKt.throwOnFailure(obj);
                                                                                                                        SheetState sheetState = this.$this_with;
                                                                                                                        this.label = 1;
                                                                                                                        if (sheetState.partialExpand(this) == coroutine_suspended) {
                                                                                                                            return coroutine_suspended;
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        if (i != 1) {
                                                                                                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                                                                        }
                                                                                                                        ResultKt.throwOnFailure(obj);
                                                                                                                    }
                                                                                                                    return Unit.INSTANCE;
                                                                                                                }
                                                                                                            }
                                                                                                        });
                                                                                                    }
                                                                                                }
                                                                                            };
                                                                                            composer4.updateRememberedValue(objRememberedValue10);
                                                                                        }
                                                                                        composer4.endReplaceableGroup();
                                                                                        Modifier modifierSemantics = SemanticsModifierKt.semantics(modifierAlign2, true, (Function1) objRememberedValue10);
                                                                                        composer4.startReplaceableGroup(733328855);
                                                                                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion4.getTopStart(), false, composer4, 0);
                                                                                        composer4.startReplaceableGroup(-1323940314);
                                                                                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                                                                        CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                                                                        Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
                                                                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierSemantics);
                                                                                        if (!(composer4.getApplier() instanceof Applier)) {
                                                                                            ComposablesKt.invalidApplier();
                                                                                        }
                                                                                        composer4.startReusableNode();
                                                                                        if (composer4.getInserting()) {
                                                                                            composer4.createNode(constructor2);
                                                                                        } else {
                                                                                            composer4.useNode();
                                                                                        }
                                                                                        Composer composerM10870constructorimpl2 = Updater.m10870constructorimpl(composer4);
                                                                                        Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy, companion5.getSetMeasurePolicy());
                                                                                        Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
                                                                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
                                                                                        if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                                                            composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                                                            composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                                                                        }
                                                                                        function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer4)), composer4, 0);
                                                                                        composer4.startReplaceableGroup(2058660585);
                                                                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                                                        function28.invoke(composer4, 0);
                                                                                        composer4.endReplaceableGroup();
                                                                                        composer4.endNode();
                                                                                        composer4.endReplaceableGroup();
                                                                                        composer4.endReplaceableGroup();
                                                                                    }
                                                                                    composer4.endReplaceableGroup();
                                                                                    function34.invoke(columnScopeInstance, composer4, 6);
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
                                                                        }), composer3, 12582912, 96);
                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                            ComposerKt.traceEventEnd();
                                                                            return;
                                                                        }
                                                                        return;
                                                                    }
                                                                    composer3.skipToGroupEnd();
                                                                }
                                                            }), composer2, 3078, 6);
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        composer2.skipToGroupEnd();
                                                    }
                                                }), composerStartRestartGroup, ((i16 >> 3) & 14) | 3072 | ((i16 << 6) & 896));
                                                if (sheetState2.getHasExpandedState()) {
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                }
                                                windowInsets5 = windowInsets4;
                                                function24 = function23;
                                                f6 = f5;
                                                j7 = j5;
                                                shape2 = expandedShape;
                                                modalBottomSheetProperties2 = modalBottomSheetPropertiesProperties$default;
                                                j8 = j92;
                                                f7 = f4;
                                                modifier4 = modifier3;
                                            }
                                        } else {
                                            zChangedInstance3 = ((i12 <= 256 && composerStartRestartGroup.changed(sheetState2)) || (i10 & 384) == 256) | composerStartRestartGroup.changedInstance(coroutineScope) | (i172 == 4);
                                            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                            if (zChangedInstance3) {
                                            }
                                        }
                                    }
                                } else {
                                    zChangedInstance2 = composerStartRestartGroup.changedInstance(coroutineScope) | ((i12 <= 256 && composerStartRestartGroup.changed(sheetState2)) || (i10 & 384) == 256) | (i172 == 4);
                                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                    if (zChangedInstance2) {
                                    }
                                }
                            }
                        } else {
                            function23 = function22;
                        }
                        z = true;
                        zChanged = z | composerStartRestartGroup.changed(density);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new Function0<Unit>() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$1$1
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
                                    sheetState2.setDensity$material3_release(density);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            composerStartRestartGroup.endReplaceableGroup();
                            EffectsKt.SideEffect((Function0) objRememberedValue, composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(773894976);
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue2 == companion.getEmpty()) {
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            final CoroutineScope coroutineScope2 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue2).getCoroutineScope();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.startReplaceableGroup(-203430341);
                            if (i12 > 256) {
                                f5 = f3;
                                if ((i10 & 384) != 256) {
                                    z2 = true;
                                }
                                int i1722 = i10 & 14;
                                final long j922 = jM9292contentColorForek8zF_U;
                                zChangedInstance = z2 | composerStartRestartGroup.changedInstance(coroutineScope2) | (i1722 == 4);
                                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                if (zChangedInstance) {
                                }
                            }
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier4 = modifier;
                        f7 = f;
                        shape2 = shape;
                        j7 = j;
                        j6 = j3;
                        windowInsets5 = windowInsets;
                        modalBottomSheetProperties2 = modalBottomSheetProperties;
                        function24 = function22;
                        j8 = jM9292contentColorForek8zF_U;
                        f6 = f2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        final Modifier modifier7 = modifier4;
                        final SheetState sheetState5 = sheetState2;
                        final float f10 = f6;
                        final long j12 = j6;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$5
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

                            public final void invoke(@Nullable Composer composer2, int i18) {
                                ModalBottomSheet_androidKt.m9571ModalBottomSheetdYc4hso(function0, modifier7, sheetState5, f7, shape2, j7, j8, f10, j12, function24, windowInsets5, modalBottomSheetProperties2, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                            }
                        });
                        return;
                    }
                    return;
                }
                i4 |= 805306368;
                function22 = function2;
                if ((i2 & 6) != 0) {
                }
                if ((i2 & 48) == 0) {
                }
                int i152 = i8;
                if ((i3 & 4096) == 0) {
                }
                if ((306783379 & i4) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i13 == 0) {
                        }
                        if ((i3 & 4) == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if ((i3 & 16) == 0) {
                        }
                        SheetState sheetState32 = sheetStateRememberModalBottomSheetState;
                        if ((i3 & 32) == 0) {
                        }
                        if ((i3 & 64) != 0) {
                        }
                        float fM9147getElevationD9Ej5fM2 = i6 == 0 ? BottomSheetDefaults.INSTANCE.m9147getElevationD9Ej5fM() : f2;
                        if ((i3 & 256) == 0) {
                        }
                        if (i7 == 0) {
                        }
                        if ((i3 & 1024) == 0) {
                        }
                        if ((i3 & 2048) == 0) {
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        final Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        composerStartRestartGroup.startReplaceableGroup(-203430466);
                        i12 = (i10 & 896) ^ 384;
                        int i162 = i11;
                        if (i12 > 256) {
                            function23 = function22;
                            if ((i10 & 384) != 256) {
                                z = true;
                            }
                            zChanged = z | composerStartRestartGroup.changed(density2);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                            }
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            if ((i & CpioConstants.C_ISBLK) == 0) {
            }
            if ((i & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
            }
            if ((i & 1572864) == 0) {
            }
            i6 = i3 & 128;
            if (i6 != 0) {
            }
            if ((i & 100663296) == 0) {
            }
            i7 = i3 & 512;
            if (i7 == 0) {
            }
            function22 = function2;
            if ((i2 & 6) != 0) {
            }
            if ((i2 & 48) == 0) {
            }
            int i1522 = i8;
            if ((i3 & 4096) == 0) {
            }
            if ((306783379 & i4) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        if ((i & 384) != 0) {
        }
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        if ((i & CpioConstants.C_ISBLK) == 0) {
        }
        if ((i & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
        }
        if ((i & 1572864) == 0) {
        }
        i6 = i3 & 128;
        if (i6 != 0) {
        }
        if ((i & 100663296) == 0) {
        }
        i7 = i3 & 512;
        if (i7 == 0) {
        }
        function22 = function2;
        if ((i2 & 6) != 0) {
        }
        if ((i2 & 48) == 0) {
        }
        int i15222 = i8;
        if ((i3 & 4096) == 0) {
        }
        if ((306783379 & i4) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    @Composable
    @ExperimentalMaterial3Api
    @NotNull
    public static final SheetState rememberModalBottomSheetState(boolean z, @Nullable Function1<? super SheetValue, Boolean> function1, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-1261794383);
        if ((i2 & 1) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i2 & 2) != 0) {
            function1 = new Function1<SheetValue, Boolean>() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt.rememberModalBottomSheetState.1
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(@NotNull SheetValue sheetValue) {
                    return Boolean.TRUE;
                }
            };
        }
        Function1<? super SheetValue, Boolean> function12 = function1;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1261794383, i, -1, "androidx.compose.material3.rememberModalBottomSheetState (ModalBottomSheet.android.kt:363)");
        }
        SheetState sheetStateRememberSheetState = SheetDefaultsKt.rememberSheetState(z2, function12, SheetValue.Hidden, false, composer, (i & 14) | 384 | (i & 112), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return sheetStateRememberSheetState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: Scrim-3J-VO9M, reason: not valid java name */
    public static final void m9572Scrim3JVO9M(final long j, final Function0<Unit> function0, final boolean z, Composer composer, final int i) {
        int i2;
        Modifier modifierClearAndSetSemantics;
        Composer composerStartRestartGroup = composer.startRestartGroup(1053897700);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        int i3 = i2;
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1053897700, i3, -1, "androidx.compose.material3.Scrim (ModalBottomSheet.android.kt:370)");
            }
            if (j != Color.INSTANCE.m11376getUnspecified0d7_KjU()) {
                final State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(z ? 1.0f : 0.0f, new TweenSpec(0, 0, null, 7, null), 0.0f, null, null, composerStartRestartGroup, 48, 28);
                composerStartRestartGroup.startReplaceableGroup(-1858718943);
                if (z) {
                    Modifier.Companion companion = Modifier.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(-1858718859);
                    boolean z2 = (i3 & 112) == 32;
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new ModalBottomSheet_androidKt$Scrim$dismissSheet$1$1(function0, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    modifierClearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(SuspendingPointerInputFilterKt.pointerInput(companion, function0, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue), new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$Scrim$dismissSheet$2
                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }
                    });
                } else {
                    modifierClearAndSetSemantics = Modifier.INSTANCE;
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierThen = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null).then(modifierClearAndSetSemantics);
                composerStartRestartGroup.startReplaceableGroup(-1858718531);
                boolean zChanged = composerStartRestartGroup.changed(stateAnimateFloatAsState) | ((i3 & 14) == 4);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$Scrim$1$1
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
                        public final void invoke2(@NotNull DrawScope drawScope) {
                            DrawScope.m11884drawRectnJ9OG0$default(drawScope, j, 0L, 0L, ModalBottomSheet_androidKt.Scrim_3J_VO9M$lambda$5(stateAnimateFloatAsState), null, null, 0, 118, null);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CanvasKt.Canvas(modifierThen, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$Scrim$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i4) {
                    ModalBottomSheet_androidKt.m9572Scrim3JVO9M(j, function0, z, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ExperimentalMaterial3Api
    public static final Modifier modalBottomSheetAnchors(Modifier modifier, final SheetState sheetState, final float f) {
        return OnRemeasuredModifierKt.onSizeChanged(modifier, new Function1<IntSize, Unit>() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt.modalBottomSheetAnchors.1

            /* compiled from: ModalBottomSheet.android.kt */
            @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
            /* renamed from: androidx.compose.material3.ModalBottomSheet_androidKt$modalBottomSheetAnchors$1$WhenMappings */
            /* loaded from: classes4.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[SheetValue.values().length];
                    try {
                        iArr[SheetValue.Hidden.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[SheetValue.PartiallyExpanded.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[SheetValue.Expanded.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                m9576invokeozmzZPI(intSize.getPackedValue());
                return Unit.INSTANCE;
            }

            /* renamed from: invoke-ozmzZPI, reason: not valid java name */
            public final void m9576invokeozmzZPI(final long j) {
                SheetValue sheetValue;
                final float f2 = f;
                final SheetState sheetState2 = sheetState;
                DraggableAnchors<SheetValue> DraggableAnchors = AnchoredDraggableKt.DraggableAnchors(new Function1<DraggableAnchorsConfig<SheetValue>, Unit>() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$modalBottomSheetAnchors$1$newAnchors$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(DraggableAnchorsConfig<SheetValue> draggableAnchorsConfig) {
                        invoke2(draggableAnchorsConfig);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull DraggableAnchorsConfig<SheetValue> draggableAnchorsConfig) {
                        draggableAnchorsConfig.m96at(SheetValue.Hidden, f2);
                        if (IntSize.m13835getHeightimpl(j) > f2 / 2 && !sheetState2.getSkipPartiallyExpanded()) {
                            draggableAnchorsConfig.m96at(SheetValue.PartiallyExpanded, f2 / 2.0f);
                        }
                        if (IntSize.m13835getHeightimpl(j) != 0) {
                            draggableAnchorsConfig.m96at(SheetValue.Expanded, Math.max(0.0f, f2 - IntSize.m13835getHeightimpl(j)));
                        }
                    }
                });
                int i = WhenMappings.$EnumSwitchMapping$0[sheetState.getAnchoredDraggableState$material3_release().getTargetValue().ordinal()];
                if (i == 1) {
                    sheetValue = SheetValue.Hidden;
                } else if (i == 2 || i == 3) {
                    sheetValue = SheetValue.PartiallyExpanded;
                    if (!DraggableAnchors.hasAnchorFor(sheetValue)) {
                        sheetValue = SheetValue.Expanded;
                        if (!DraggableAnchors.hasAnchorFor(sheetValue)) {
                            sheetValue = SheetValue.Hidden;
                        }
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                sheetState.getAnchoredDraggableState$material3_release().updateAnchors(DraggableAnchors, sheetValue);
            }
        });
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void ModalBottomSheetPopup(@NotNull final ModalBottomSheetProperties modalBottomSheetProperties, @NotNull final Function0<Unit> function0, @NotNull final WindowInsets windowInsets, @NotNull final Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(738805080);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modalBottomSheetProperties) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(windowInsets) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 2048 : 1024;
        }
        int i3 = i2;
        if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(738805080, i3, -1, "androidx.compose.material3.ModalBottomSheetPopup (ModalBottomSheet.android.kt:436)");
            }
            View view = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
            UUID uuid = (UUID) RememberSaveableKt.m10957rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) new Function0<UUID>() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheetPopup$id$1
                @Override // kotlin.jvm.functions.Function0
                public final UUID invoke() {
                    return UUID.randomUUID();
                }
            }, composerStartRestartGroup, 3072, 6);
            CompositionContext compositionContextRememberCompositionContext = ComposablesKt.rememberCompositionContext(composerStartRestartGroup, 0);
            final State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function2, composerStartRestartGroup, (i3 >> 9) & 14);
            final LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            composerStartRestartGroup.startReplaceableGroup(173201889);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            Object obj = objRememberedValue;
            if (objRememberedValue == companion.getEmpty()) {
                ModalBottomSheetWindow modalBottomSheetWindow = new ModalBottomSheetWindow(modalBottomSheetProperties, function0, view, uuid);
                modalBottomSheetWindow.setCustomContent(compositionContextRememberCompositionContext, ComposableLambdaKt.composableLambdaInstance(-114385661, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheetPopup$modalBottomSheetWindow$1$1$1
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
                    public final void invoke(@Nullable Composer composer2, int i4) {
                        if ((i4 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-114385661, i4, -1, "androidx.compose.material3.ModalBottomSheetPopup.<anonymous>.<anonymous>.<anonymous> (ModalBottomSheet.android.kt:452)");
                            }
                            Modifier modifierImePadding = Modifier.INSTANCE;
                            Modifier modifierWindowInsetsPadding = WindowInsetsPaddingKt.windowInsetsPadding(SemanticsModifierKt.semantics$default(modifierImePadding, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheetPopup$modalBottomSheetWindow$1$1$1.1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    invoke2(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    SemanticsPropertiesKt.popup(semanticsPropertyReceiver);
                                }
                            }, 1, null), windowInsets);
                            if (Build.VERSION.SDK_INT >= 33) {
                                modifierImePadding = WindowInsetsPadding_androidKt.imePadding(modifierImePadding);
                            }
                            Modifier modifierThen = modifierWindowInsetsPadding.then(modifierImePadding);
                            State<Function2<Composer, Integer, Unit>> state = stateRememberUpdatedState;
                            composer2.startReplaceableGroup(733328855);
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                            composer2.startReplaceableGroup(-1323940314);
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierThen);
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
                            Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                            if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            ModalBottomSheet_androidKt.ModalBottomSheetPopup$lambda$8(state).invoke(composer2, 0);
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
                }));
                composerStartRestartGroup.updateRememberedValue(modalBottomSheetWindow);
                obj = modalBottomSheetWindow;
            }
            final ModalBottomSheetWindow modalBottomSheetWindow2 = (ModalBottomSheetWindow) obj;
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(173202877);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(modalBottomSheetWindow2) | composerStartRestartGroup.changed(layoutDirection);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheetPopup$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    @NotNull
                    public final DisposableEffectResult invoke(@NotNull DisposableEffectScope disposableEffectScope) {
                        modalBottomSheetWindow2.show();
                        modalBottomSheetWindow2.superSetLayoutDirection(layoutDirection);
                        final ModalBottomSheetWindow modalBottomSheetWindow3 = modalBottomSheetWindow2;
                        return new DisposableEffectResult() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheetPopup$1$1$invoke$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                                modalBottomSheetWindow3.disposeComposition();
                                modalBottomSheetWindow3.dismiss();
                            }
                        };
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.DisposableEffect(modalBottomSheetWindow2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt.ModalBottomSheetPopup.2
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
                    ModalBottomSheet_androidKt.ModalBottomSheetPopup(modalBottomSheetProperties, function0, windowInsets, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isFlagSecureEnabled(View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean shouldApplySecureFlag(SecureFlagPolicy secureFlagPolicy, boolean z) {
        int i = WhenMappings.$EnumSwitchMapping$0[secureFlagPolicy.ordinal()];
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        if (i == 3) {
            return z;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float Scrim_3J_VO9M$lambda$5(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function2<Composer, Integer, Unit> ModalBottomSheetPopup$lambda$8(State<? extends Function2<? super Composer, ? super Integer, Unit>> state) {
        return (Function2) state.getValue();
    }
}
