package com.blackhub.bronline.game.p019ui.widget.block;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.AlphaKt;
import androidx.compose.p003ui.draw.ClipKt;
import androidx.compose.p003ui.graphics.ColorFilter;
import androidx.compose.p003ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.p003ui.graphics.Shape;
import androidx.compose.p003ui.graphics.TransformOrigin;
import androidx.compose.p003ui.layout.ContentScale;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PainterResources_androidKt;
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
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.profileinstaller.ProfileVerifier;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.extension.ComposeExtensionKt;
import com.bless.client.R;
import com.fasterxml.jackson.core.p022io.schubfach.DoubleToDecimal;
import com.google.firebase.perf.util.Constants;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ClickAnimateBlock.kt */
@Metadata(m7104d1 = {"\u0000T\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001a»\u0001\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00112\b\b\u0002\u0010\u0016\u001a\u00020\u00112\b\b\u0002\u0010\u0017\u001a\u00020\u00112\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u001e2\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\f0\u001e2\u0011\u0010 \u001a\r\u0012\u0004\u0012\u00020\f0\u001e¢\u0006\u0002\b!H\u0007ø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001a\r\u0010$\u001a\u00020\fH\u0003¢\u0006\u0002\u0010%\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006&²\u0006\n\u0010'\u001a\u00020\u0011X\u008a\u008e\u0002²\u0006\n\u0010(\u001a\u00020\u0011X\u008a\u008e\u0002²\u0006\n\u0010)\u001a\u00020\u0001X\u008a\u0084\u0002²\u0006\n\u0010*\u001a\u00020\u0011X\u008a\u008e\u0002²\u0006\n\u0010+\u001a\u00020\u0001X\u008a\u0084\u0002"}, m7105d2 = {"ALPHA_DARK_VALUE", "", "ALPHA_DEFAULT_VALUE", "CLICK_INITIAL_VALUE", "CLICK_TARGET_VALUE", "PREVIEW_DURATION_MILLIS", "", "PREVIEW_INITIAL_VALUE", "PREVIEW_START_DURATION_MILLIS", "", "PREVIEW_TARGET_VALUE", "ClickAnimateBlock", "", "modifier", "Landroidx/compose/ui/Modifier;", "modifierInner", Constants.ENABLE_DISABLE, "", "isEnabledState", "Landroidx/compose/runtime/MutableState;", "isNotDarkened", "isAlphaActive", "isGlareVisible", "isAnimateScalePreviewShow", "shape", "Landroidx/compose/ui/graphics/Shape;", "animateDurationMillis", "transformOrigin", "Landroidx/compose/ui/graphics/TransformOrigin;", "onStartClick", "Lkotlin/Function0;", "onFinishClick", "content", "Landroidx/compose/runtime/Composable;", "ClickAnimateBlock-wxW-who", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/MutableState;ZZZZLandroidx/compose/ui/graphics/Shape;IJLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "PreviewClickAnimateBlock", "(Landroidx/compose/runtime/Composer;I)V", "app_siteRelease", "isBoxClicked", "isEnabledClick", "scalePreviewAnimate", "anim", "scaleClick"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nClickAnimateBlock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClickAnimateBlock.kt\ncom/blackhub/bronline/game/ui/widget/block/ClickAnimateBlockKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,173:1\n154#2:174\n1116#3,6:175\n1116#3,6:181\n1116#3,6:187\n1116#3,3:198\n1119#3,3:204\n1116#3,6:208\n1116#3,6:214\n1116#3,6:220\n487#4,4:193\n491#4,2:201\n495#4:207\n25#5:197\n456#5,8:242\n464#5,3:256\n467#5,3:260\n487#6:203\n69#7,5:226\n74#7:259\n78#7:264\n79#8,11:231\n92#8:263\n3737#9,6:250\n81#10:265\n107#10,2:266\n81#10:268\n107#10,2:269\n81#10:271\n81#10:272\n107#10,2:273\n81#10:275\n*S KotlinDebug\n*F\n+ 1 ClickAnimateBlock.kt\ncom/blackhub/bronline/game/ui/widget/block/ClickAnimateBlockKt\n*L\n64#1:174\n72#1:175,6\n73#1:181,6\n74#1:187,6\n76#1:198,3\n76#1:204,3\n88#1:208,6\n91#1:214,6\n103#1:220,6\n76#1:193,4\n76#1:201,2\n76#1:207\n76#1:197\n115#1:242,8\n115#1:256,3\n115#1:260,3\n76#1:203\n115#1:226,5\n115#1:259\n115#1:264\n115#1:231,11\n115#1:263\n115#1:250,6\n73#1:265\n73#1:266,2\n74#1:268\n74#1:269,2\n78#1:271\n88#1:272\n88#1:273,2\n100#1:275\n*E\n"})
/* loaded from: classes3.dex */
public final class ClickAnimateBlockKt {
    public static final float ALPHA_DARK_VALUE = 0.5f;
    public static final float ALPHA_DEFAULT_VALUE = 1.0f;
    public static final float CLICK_INITIAL_VALUE = 1.0f;
    public static final float CLICK_TARGET_VALUE = 0.8f;
    public static final int PREVIEW_DURATION_MILLIS = 500;
    public static final float PREVIEW_INITIAL_VALUE = 1.0f;
    public static final long PREVIEW_START_DURATION_MILLIS = 300;
    public static final float PREVIEW_TARGET_VALUE = 1.1f;

    /* JADX WARN: Removed duplicated region for block: B:100:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0620  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0635  */
    /* JADX WARN: Removed duplicated region for block: B:306:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0128  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: ClickAnimateBlock-wxW-who, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m15038ClickAnimateBlockwxWwho(@Nullable Modifier modifier, @Nullable Modifier modifier2, boolean z, @Nullable MutableState<Boolean> mutableState, boolean z2, boolean z3, boolean z4, boolean z5, @Nullable Shape shape, int i, long j, @Nullable Function0<Unit> function0, @Nullable Function0<Unit> function02, @NotNull final Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        boolean z6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        Modifier modifier3;
        boolean z7;
        Modifier modifier4;
        Modifier modifier5;
        final MutableState<Boolean> mutableStateMutableStateOf$default;
        boolean z8;
        boolean z9;
        Shape shapeM8392RoundedCornerShape0680j_4;
        int i14;
        long jM11730getCenterSzJe1aQ;
        Function0<Unit> function03;
        int i15;
        int i16;
        int i17;
        Function0<Unit> function04;
        Modifier modifier6;
        boolean z10;
        boolean z11;
        Shape shape2;
        Modifier modifier7;
        Modifier modifier8;
        Shape shape3;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        final MutableState mutableState2;
        Object objRememberedValue3;
        MutableInteractionSource mutableInteractionSource;
        MutableState mutableState3;
        Object objRememberedValue4;
        Function0<Unit> function05;
        Object objRememberedValue5;
        boolean z12;
        Object objRememberedValue6;
        final MutableState mutableState4;
        final Function0<Unit> function06;
        Modifier modifier9;
        int currentCompositeKeyHash;
        Composer composerM10870constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final Shape shape4;
        final Function0<Unit> function07;
        final Function0<Unit> function08;
        final Modifier modifier10;
        final boolean z13;
        final boolean z14;
        final boolean z15;
        final int i18;
        final boolean z16;
        final boolean z17;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(398307500);
        int i19 = i4 & 1;
        if (i19 != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i5 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 112) == 0) {
            i5 |= ((i4 & 2) == 0 && composerStartRestartGroup.changed(modifier2)) ? 32 : 16;
        }
        int i20 = i4 & 4;
        if (i20 != 0) {
            i5 |= 384;
        } else {
            if ((i2 & 896) == 0) {
                i5 |= composerStartRestartGroup.changed(z) ? 256 : 128;
            }
            if ((i2 & 7168) == 0) {
                i5 |= ((i4 & 8) == 0 && composerStartRestartGroup.changed(mutableState)) ? 2048 : 1024;
            }
            if ((i2 & 57344) == 0) {
                i5 |= ((i4 & 16) == 0 && composerStartRestartGroup.changed(z2)) ? 16384 : 8192;
            }
            i6 = i4 & 32;
            if (i6 == 0) {
                i5 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                z6 = z3;
            } else {
                z6 = z3;
                if ((i2 & 458752) == 0) {
                    i5 |= composerStartRestartGroup.changed(z6) ? 131072 : 65536;
                }
            }
            i7 = i4 & 64;
            if (i7 == 0) {
                i5 |= 1572864;
            } else if ((i2 & 3670016) == 0) {
                i5 |= composerStartRestartGroup.changed(z4) ? 1048576 : 524288;
            }
            i8 = i4 & 128;
            if (i8 == 0) {
                i5 |= 12582912;
            } else if ((i2 & 29360128) == 0) {
                i5 |= composerStartRestartGroup.changed(z5) ? 8388608 : 4194304;
            }
            if ((i2 & 234881024) == 0) {
                i5 |= ((i4 & 256) == 0 && composerStartRestartGroup.changed(shape)) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
            }
            i9 = i4 & 512;
            if (i9 == 0) {
                i5 |= 805306368;
            } else if ((i2 & 1879048192) == 0) {
                i5 |= composerStartRestartGroup.changed(i) ? 536870912 : 268435456;
            }
            if ((i3 & 14) != 0) {
                i10 = (((i4 & 1024) == 0 && composerStartRestartGroup.changed(j)) ? 4 : 2) | i3;
            } else {
                i10 = i3;
            }
            i11 = i4 & 2048;
            if (i11 == 0) {
                i10 |= 48;
            } else if ((i3 & 112) == 0) {
                i10 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
            }
            i12 = i4 & 4096;
            if (i12 != 0) {
                if ((i3 & 896) == 0) {
                    i10 |= composerStartRestartGroup.changedInstance(function02) ? 256 : 128;
                }
                if ((i4 & 8192) != 0) {
                    i10 |= 3072;
                } else if ((i3 & 7168) == 0) {
                    i10 |= composerStartRestartGroup.changedInstance(content) ? 2048 : 1024;
                }
                if ((1533916891 & i5) != 306783378 || (i10 & 5851) != 1170 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        Modifier modifier11 = i19 == 0 ? Modifier.INSTANCE : modifier;
                        if ((i4 & 2) == 0) {
                            i13 = i5 & (-113);
                            modifier3 = modifier11;
                        } else {
                            i13 = i5;
                            modifier3 = modifier2;
                        }
                        z7 = i20 == 0 ? true : z;
                        if ((i4 & 8) == 0) {
                            modifier4 = modifier11;
                            modifier5 = modifier3;
                            mutableStateMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                            i13 &= -7169;
                        } else {
                            modifier4 = modifier11;
                            modifier5 = modifier3;
                            mutableStateMutableStateOf$default = mutableState;
                        }
                        if ((i4 & 16) == 0) {
                            i13 &= -57345;
                            z8 = z7;
                        } else {
                            z8 = z2;
                        }
                        if (i6 != 0) {
                            z6 = false;
                        }
                        z9 = i7 == 0 ? false : z4;
                        boolean z18 = z8;
                        boolean z19 = i8 == 0 ? false : z5;
                        if ((i4 & 256) == 0) {
                            shapeM8392RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(C2046Dp.m13666constructorimpl(0));
                            i14 = (-234881025) & i13;
                        } else {
                            shapeM8392RoundedCornerShape0680j_4 = shape;
                            i14 = i13;
                        }
                        int i21 = i9 == 0 ? 125 : i;
                        if ((i4 & 1024) == 0) {
                            jM11730getCenterSzJe1aQ = TransformOrigin.INSTANCE.m11730getCenterSzJe1aQ();
                            i10 &= -15;
                        } else {
                            jM11730getCenterSzJe1aQ = j;
                        }
                        Function0<Unit> function09 = i11 == 0 ? null : function0;
                        if (i12 == 0) {
                            i16 = i10;
                            i17 = i14;
                            function04 = function09;
                            function03 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.ClickAnimateBlockKt$ClickAnimateBlock$1
                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }
                            };
                            z10 = z18;
                            z11 = z19;
                            i15 = i21;
                            shape2 = shapeM8392RoundedCornerShape0680j_4;
                            modifier6 = modifier4;
                        } else {
                            function03 = function02;
                            i15 = i21;
                            i16 = i10;
                            i17 = i14;
                            function04 = function09;
                            modifier6 = modifier4;
                            z10 = z18;
                            z11 = z19;
                            shape2 = shapeM8392RoundedCornerShape0680j_4;
                        }
                        modifier7 = modifier5;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i4 & 2) != 0) {
                            i5 &= -113;
                        }
                        if ((i4 & 8) != 0) {
                            i5 &= -7169;
                        }
                        if ((i4 & 16) != 0) {
                            i5 &= -57345;
                        }
                        if ((i4 & 256) != 0) {
                            i5 &= -234881025;
                        }
                        if ((i4 & 1024) != 0) {
                            i10 &= -15;
                        }
                        modifier6 = modifier;
                        modifier7 = modifier2;
                        z7 = z;
                        mutableStateMutableStateOf$default = mutableState;
                        z11 = z5;
                        shape2 = shape;
                        i15 = i;
                        jM11730getCenterSzJe1aQ = j;
                        function04 = function0;
                        function03 = function02;
                        i16 = i10;
                        i17 = i5;
                        z10 = z2;
                        z9 = z4;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        modifier8 = modifier7;
                        shape3 = shape2;
                    } else {
                        modifier8 = modifier7;
                        shape3 = shape2;
                        ComposerKt.traceEventStart(398307500, i17, i16, "com.blackhub.bronline.game.ui.widget.block.ClickAnimateBlock (ClickAnimateBlock.kt:69)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-1003756948);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    final boolean z20 = z9;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    MutableInteractionSource mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-1003756884);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    boolean z21 = z10;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        MutableState mutableStateMutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default2);
                        objRememberedValue2 = mutableStateMutableStateOf$default2;
                    }
                    mutableState2 = (MutableState) objRememberedValue2;
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-1003756823);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 != companion.getEmpty()) {
                        mutableInteractionSource = mutableInteractionSource2;
                        objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        mutableInteractionSource = mutableInteractionSource2;
                    }
                    mutableState3 = (MutableState) objRememberedValue3;
                    composerStartRestartGroup.endReplaceableGroup();
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    final Function0<Unit> function010 = function04;
                    InfiniteTransition infiniteTransitionRememberInfiniteTransition = InfiniteTransitionKt.rememberInfiniteTransition(AnyExtensionKt.empty(stringCompanionObject), composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup.startReplaceableGroup(773894976);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    Modifier modifier12 = modifier6;
                    if (objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue4).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    function05 = function03;
                    State<Float> stateAnimateFloat = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 1.0f, 1.1f, AnimationSpecKt.m7688infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(500, 0, null, 6, null), RepeatMode.Reverse, 0L, 4, null), AnyExtensionKt.empty(stringCompanionObject), composerStartRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 0);
                    composerStartRestartGroup.startReplaceableGroup(-1003756286);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == companion.getEmpty()) {
                        objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    MutableState mutableState5 = (MutableState) objRememberedValue5;
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-1003756246);
                    if (z11) {
                        Unit unit = Unit.INSTANCE;
                        composerStartRestartGroup.startReplaceableGroup(-1003756184);
                        Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue7 == companion.getEmpty()) {
                            objRememberedValue7 = new ClickAnimateBlockKt$ClickAnimateBlock$2$1(mutableState5, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue7, composerStartRestartGroup, 70);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    float fClickAnimateBlock_wxW_who$lambda$7 = !ClickAnimateBlock_wxW_who$lambda$9(mutableState5) ? ClickAnimateBlock_wxW_who$lambda$7(stateAnimateFloat) : 1.0f;
                    float f = (z7 && z6) ? 0.5f : 1.0f;
                    float f2 = !ClickAnimateBlock_wxW_who$lambda$2(mutableState2) ? 0.8f : 1.0f;
                    boolean z22 = z11;
                    TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(i15, 0, EasingKt.getFastOutSlowInEasing(), 2, null);
                    String strEmpty = AnyExtensionKt.empty(stringCompanionObject);
                    composerStartRestartGroup.startReplaceableGroup(-1003755681);
                    z12 = ((((i17 & 7168) ^ 3072) <= 2048 && composerStartRestartGroup.changed(mutableStateMutableStateOf$default)) || (i17 & 3072) == 2048) | ((i16 & 896) == 256);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (z12 || objRememberedValue6 == companion.getEmpty()) {
                        mutableState4 = mutableState3;
                        function06 = function05;
                        objRememberedValue6 = new Function1<Float, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.ClickAnimateBlockKt$ClickAnimateBlock$scaleClick$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Float f3) {
                                invoke(f3.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(float f3) {
                                if (ClickAnimateBlockKt.ClickAnimateBlock_wxW_who$lambda$2(mutableState2)) {
                                    MutableState<Boolean> mutableState6 = mutableState2;
                                    ClickAnimateBlockKt.ClickAnimateBlock_wxW_who$lambda$3(mutableState6, true ^ ClickAnimateBlockKt.ClickAnimateBlock_wxW_who$lambda$2(mutableState6));
                                } else {
                                    mutableStateMutableStateOf$default.setValue(Boolean.TRUE);
                                    function06.invoke();
                                    ClickAnimateBlockKt.ClickAnimateBlock_wxW_who$lambda$6(mutableState4, true);
                                }
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    } else {
                        mutableState4 = mutableState3;
                        function06 = function05;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(f2, tweenSpecTween$default, 0.0f, strEmpty, (Function1) objRememberedValue6, composerStartRestartGroup, 0, 4);
                    modifier9 = modifier12;
                    final MutableState<Boolean> mutableState6 = mutableStateMutableStateOf$default;
                    final MutableState mutableState7 = mutableState4;
                    long j2 = jM11730getCenterSzJe1aQ;
                    Modifier modifierM11501graphicsLayerAp8cVGQ$default = GraphicsLayerModifierKt.m11501graphicsLayerAp8cVGQ$default(GraphicsLayerModifierKt.m11501graphicsLayerAp8cVGQ$default(ClickableKt.m7803clickableO2vRcR0$default(AlphaKt.alpha(modifier9, f), mutableInteractionSource, null, ClickAnimateBlock_wxW_who$lambda$2(mutableState2) && z7 && ClickAnimateBlock_wxW_who$lambda$5(mutableState4) && mutableStateMutableStateOf$default.getValue().booleanValue(), null, null, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.ClickAnimateBlockKt$ClickAnimateBlock$3
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
                            if (!ClickAnimateBlockKt.ClickAnimateBlock_wxW_who$lambda$5(mutableState7) || !mutableState6.getValue().booleanValue()) {
                                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C62281(mutableState6, null), 3, null);
                                return;
                            }
                            mutableState6.setValue(Boolean.FALSE);
                            ClickAnimateBlockKt.ClickAnimateBlock_wxW_who$lambda$3(mutableState2, true);
                            ClickAnimateBlockKt.ClickAnimateBlock_wxW_who$lambda$6(mutableState7, false);
                            Function0<Unit> function011 = function010;
                            if (function011 != null) {
                                function011.invoke();
                            }
                        }

                        /* compiled from: ClickAnimateBlock.kt */
                        @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
                        @DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.widget.block.ClickAnimateBlockKt$ClickAnimateBlock$3$1", m7120f = "ClickAnimateBlock.kt", m7121i = {}, m7122l = {130}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
                        /* renamed from: com.blackhub.bronline.game.ui.widget.block.ClickAnimateBlockKt$ClickAnimateBlock$3$1 */
                        /* loaded from: classes8.dex */
                        public static final class C62281 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                            public final /* synthetic */ MutableState<Boolean> $isEnabledState;
                            public int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public C62281(MutableState<Boolean> mutableState, Continuation<? super C62281> continuation) {
                                super(2, continuation);
                                this.$isEnabledState = mutableState;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @NotNull
                            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                return new C62281(this.$isEnabledState, continuation);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            @Nullable
                            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                return ((C62281) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @Nullable
                            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i = this.label;
                                if (i == 0) {
                                    ResultKt.throwOnFailure(obj);
                                    this.label = 1;
                                    if (DelayKt.delay(400L, this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    if (i != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj);
                                }
                                this.$isEnabledState.setValue(Boxing.boxBoolean(true));
                                return Unit.INSTANCE;
                            }
                        }
                    }, 24, null), fClickAnimateBlock_wxW_who$lambda$7, fClickAnimateBlock_wxW_who$lambda$7, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, j2, null, false, null, 0L, 0L, 0, 130044, null), ClickAnimateBlock_wxW_who$lambda$13(stateAnimateFloatAsState), ClickAnimateBlock_wxW_who$lambda$13(stateAnimateFloatAsState), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, j2, null, false, null, 0L, 0L, 0, 130044, null);
                    Alignment center = Alignment.INSTANCE.getCenter();
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM11501graphicsLayerAp8cVGQ$default);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM10870constructorimpl = Updater.m10870constructorimpl(composerStartRestartGroup);
                    Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (!composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    final BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    content.invoke(composerStartRestartGroup, Integer.valueOf((i16 >> 9) & 14));
                    final Modifier modifier13 = modifier8;
                    shape4 = shape3;
                    ComposeExtensionKt.IfFalse(Boolean.valueOf(z21), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1142081771, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.ClickAnimateBlockKt$ClickAnimateBlock$4$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                        public final void invoke(@Nullable Composer composer2, int i22) {
                            if ((i22 & 11) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1142081771, i22, -1, "com.blackhub.bronline.game.ui.widget.block.ClickAnimateBlock.<anonymous>.<anonymous> (ClickAnimateBlock.kt:148)");
                                }
                                if (z20) {
                                    composer2.startReplaceableGroup(-22418167);
                                    ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.bg_button_inactive_2, composer2, 6), (String) null, ClipKt.clip(boxScopeInstance.matchParentSize(modifier13), shape4), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composer2, 24632, 104);
                                    composer2.endReplaceableGroup();
                                } else {
                                    composer2.startReplaceableGroup(-22417794);
                                    BoxKt.Box(BackgroundKt.m7770backgroundbw27NRU(boxScopeInstance.matchParentSize(modifier13), ColorResources_androidKt.colorResource(R.color.black_50, composer2, 6), shape4), composer2, 0);
                                    composer2.endReplaceableGroup();
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }), composerStartRestartGroup, ((i17 >> 12) & 14) | 48);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function07 = function010;
                    function08 = function06;
                    modifier10 = modifier13;
                    z13 = z7;
                    z14 = z6;
                    z15 = z21;
                    i18 = i15;
                    z16 = z20;
                    z17 = z22;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier9 = modifier;
                    modifier10 = modifier2;
                    z13 = z;
                    mutableStateMutableStateOf$default = mutableState;
                    z15 = z2;
                    z16 = z4;
                    z17 = z5;
                    shape4 = shape;
                    i18 = i;
                    jM11730getCenterSzJe1aQ = j;
                    function07 = function0;
                    function08 = function02;
                    z14 = z6;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier14 = modifier9;
                    final MutableState<Boolean> mutableState8 = mutableStateMutableStateOf$default;
                    final Shape shape5 = shape4;
                    final long j3 = jM11730getCenterSzJe1aQ;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.ClickAnimateBlockKt$ClickAnimateBlock$5
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

                        public final void invoke(@Nullable Composer composer2, int i22) {
                            ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(modifier14, modifier10, z13, mutableState8, z15, z14, z16, z17, shape5, i18, j3, function07, function08, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
                        }
                    });
                    return;
                }
                return;
            }
            i10 |= 384;
            if ((i4 & 8192) != 0) {
            }
            if ((1533916891 & i5) != 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i19 == 0) {
                    }
                    if ((i4 & 2) == 0) {
                    }
                    if (i20 == 0) {
                    }
                    if ((i4 & 8) == 0) {
                    }
                    if ((i4 & 16) == 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 == 0) {
                    }
                    boolean z182 = z8;
                    boolean z192 = i8 == 0 ? false : z5;
                    if ((i4 & 256) == 0) {
                    }
                    if (i9 == 0) {
                    }
                    if ((i4 & 1024) == 0) {
                    }
                    if (i11 == 0) {
                    }
                    if (i12 == 0) {
                    }
                    modifier7 = modifier5;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composerStartRestartGroup.startReplaceableGroup(-1003756948);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    final boolean z202 = z9;
                    if (objRememberedValue == companion.getEmpty()) {
                    }
                    MutableInteractionSource mutableInteractionSource22 = (MutableInteractionSource) objRememberedValue;
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-1003756884);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    boolean z212 = z10;
                    if (objRememberedValue2 == companion.getEmpty()) {
                    }
                    mutableState2 = (MutableState) objRememberedValue2;
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-1003756823);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 != companion.getEmpty()) {
                    }
                    mutableState3 = (MutableState) objRememberedValue3;
                    composerStartRestartGroup.endReplaceableGroup();
                    StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                    final Function0<Unit> function0102 = function04;
                    InfiniteTransition infiniteTransitionRememberInfiniteTransition2 = InfiniteTransitionKt.rememberInfiniteTransition(AnyExtensionKt.empty(stringCompanionObject2), composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup.startReplaceableGroup(773894976);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    Modifier modifier122 = modifier6;
                    if (objRememberedValue4 == companion.getEmpty()) {
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    final CoroutineScope coroutineScope2 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue4).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    function05 = function03;
                    State<Float> stateAnimateFloat2 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition2, 1.0f, 1.1f, AnimationSpecKt.m7688infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(500, 0, null, 6, null), RepeatMode.Reverse, 0L, 4, null), AnyExtensionKt.empty(stringCompanionObject2), composerStartRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 0);
                    composerStartRestartGroup.startReplaceableGroup(-1003756286);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == companion.getEmpty()) {
                    }
                    MutableState mutableState52 = (MutableState) objRememberedValue5;
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-1003756246);
                    if (z11) {
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (!ClickAnimateBlock_wxW_who$lambda$9(mutableState52)) {
                    }
                    if (z7) {
                        if (!ClickAnimateBlock_wxW_who$lambda$2(mutableState2)) {
                        }
                        boolean z222 = z11;
                        TweenSpec tweenSpecTween$default2 = AnimationSpecKt.tween$default(i15, 0, EasingKt.getFastOutSlowInEasing(), 2, null);
                        String strEmpty2 = AnyExtensionKt.empty(stringCompanionObject2);
                        composerStartRestartGroup.startReplaceableGroup(-1003755681);
                        if (((i17 & 7168) ^ 3072) <= 2048) {
                            z12 = ((((i17 & 7168) ^ 3072) <= 2048 && composerStartRestartGroup.changed(mutableStateMutableStateOf$default)) || (i17 & 3072) == 2048) | ((i16 & 896) == 256);
                            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                            if (z12) {
                                mutableState4 = mutableState3;
                                function06 = function05;
                                objRememberedValue6 = new Function1<Float, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.ClickAnimateBlockKt$ClickAnimateBlock$scaleClick$2$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(Float f3) {
                                        invoke(f3.floatValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(float f3) {
                                        if (ClickAnimateBlockKt.ClickAnimateBlock_wxW_who$lambda$2(mutableState2)) {
                                            MutableState<Boolean> mutableState62 = mutableState2;
                                            ClickAnimateBlockKt.ClickAnimateBlock_wxW_who$lambda$3(mutableState62, true ^ ClickAnimateBlockKt.ClickAnimateBlock_wxW_who$lambda$2(mutableState62));
                                        } else {
                                            mutableStateMutableStateOf$default.setValue(Boolean.TRUE);
                                            function06.invoke();
                                            ClickAnimateBlockKt.ClickAnimateBlock_wxW_who$lambda$6(mutableState4, true);
                                        }
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                                composerStartRestartGroup.endReplaceableGroup();
                                State<Float> stateAnimateFloatAsState2 = AnimateAsStateKt.animateFloatAsState(f2, tweenSpecTween$default2, 0.0f, strEmpty2, (Function1) objRememberedValue6, composerStartRestartGroup, 0, 4);
                                modifier9 = modifier122;
                                if (ClickAnimateBlock_wxW_who$lambda$2(mutableState2)) {
                                    final MutableState<Boolean> mutableState62 = mutableStateMutableStateOf$default;
                                    final MutableState<Boolean> mutableState72 = mutableState4;
                                    long j22 = jM11730getCenterSzJe1aQ;
                                    Modifier modifierM11501graphicsLayerAp8cVGQ$default2 = GraphicsLayerModifierKt.m11501graphicsLayerAp8cVGQ$default(GraphicsLayerModifierKt.m11501graphicsLayerAp8cVGQ$default(ClickableKt.m7803clickableO2vRcR0$default(AlphaKt.alpha(modifier9, f), mutableInteractionSource, null, ClickAnimateBlock_wxW_who$lambda$2(mutableState2) && z7 && ClickAnimateBlock_wxW_who$lambda$5(mutableState4) && mutableStateMutableStateOf$default.getValue().booleanValue(), null, null, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.ClickAnimateBlockKt$ClickAnimateBlock$3
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
                                            if (!ClickAnimateBlockKt.ClickAnimateBlock_wxW_who$lambda$5(mutableState72) || !mutableState62.getValue().booleanValue()) {
                                                BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new C62281(mutableState62, null), 3, null);
                                                return;
                                            }
                                            mutableState62.setValue(Boolean.FALSE);
                                            ClickAnimateBlockKt.ClickAnimateBlock_wxW_who$lambda$3(mutableState2, true);
                                            ClickAnimateBlockKt.ClickAnimateBlock_wxW_who$lambda$6(mutableState72, false);
                                            Function0<Unit> function011 = function0102;
                                            if (function011 != null) {
                                                function011.invoke();
                                            }
                                        }

                                        /* compiled from: ClickAnimateBlock.kt */
                                        @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
                                        @DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.widget.block.ClickAnimateBlockKt$ClickAnimateBlock$3$1", m7120f = "ClickAnimateBlock.kt", m7121i = {}, m7122l = {130}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
                                        /* renamed from: com.blackhub.bronline.game.ui.widget.block.ClickAnimateBlockKt$ClickAnimateBlock$3$1 */
                                        /* loaded from: classes8.dex */
                                        public static final class C62281 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                            public final /* synthetic */ MutableState<Boolean> $isEnabledState;
                                            public int label;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            public C62281(MutableState<Boolean> mutableState, Continuation<? super C62281> continuation) {
                                                super(2, continuation);
                                                this.$isEnabledState = mutableState;
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            @NotNull
                                            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                return new C62281(this.$isEnabledState, continuation);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            @Nullable
                                            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                                return ((C62281) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            @Nullable
                                            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                                                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                int i = this.label;
                                                if (i == 0) {
                                                    ResultKt.throwOnFailure(obj);
                                                    this.label = 1;
                                                    if (DelayKt.delay(400L, this) == coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                } else {
                                                    if (i != 1) {
                                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                    }
                                                    ResultKt.throwOnFailure(obj);
                                                }
                                                this.$isEnabledState.setValue(Boxing.boxBoolean(true));
                                                return Unit.INSTANCE;
                                            }
                                        }
                                    }, 24, null), fClickAnimateBlock_wxW_who$lambda$7, fClickAnimateBlock_wxW_who$lambda$7, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, j22, null, false, null, 0L, 0L, 0, 130044, null), ClickAnimateBlock_wxW_who$lambda$13(stateAnimateFloatAsState2), ClickAnimateBlock_wxW_who$lambda$13(stateAnimateFloatAsState2), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, j22, null, false, null, 0L, 0L, 0, 130044, null);
                                    Alignment center2 = Alignment.INSTANCE.getCenter();
                                    composerStartRestartGroup.startReplaceableGroup(733328855);
                                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, composerStartRestartGroup, 6);
                                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                    ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM11501graphicsLayerAp8cVGQ$default2);
                                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                                    }
                                    composerStartRestartGroup.startReusableNode();
                                    if (!composerStartRestartGroup.getInserting()) {
                                    }
                                    composerM10870constructorimpl = Updater.m10870constructorimpl(composerStartRestartGroup);
                                    Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy2, companion22.getSetMeasurePolicy());
                                    Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
                                    setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                                    if (!composerM10870constructorimpl.getInserting()) {
                                        composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                                        final BoxScope boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                        content.invoke(composerStartRestartGroup, Integer.valueOf((i16 >> 9) & 14));
                                        final Modifier modifier132 = modifier8;
                                        shape4 = shape3;
                                        ComposeExtensionKt.IfFalse(Boolean.valueOf(z212), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1142081771, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.ClickAnimateBlockKt$ClickAnimateBlock$4$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                            public final void invoke(@Nullable Composer composer2, int i22) {
                                                if ((i22 & 11) != 2 || !composer2.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(1142081771, i22, -1, "com.blackhub.bronline.game.ui.widget.block.ClickAnimateBlock.<anonymous>.<anonymous> (ClickAnimateBlock.kt:148)");
                                                    }
                                                    if (z202) {
                                                        composer2.startReplaceableGroup(-22418167);
                                                        ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.bg_button_inactive_2, composer2, 6), (String) null, ClipKt.clip(boxScopeInstance2.matchParentSize(modifier132), shape4), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composer2, 24632, 104);
                                                        composer2.endReplaceableGroup();
                                                    } else {
                                                        composer2.startReplaceableGroup(-22417794);
                                                        BoxKt.Box(BackgroundKt.m7770backgroundbw27NRU(boxScopeInstance2.matchParentSize(modifier132), ColorResources_androidKt.colorResource(R.color.black_50, composer2, 6), shape4), composer2, 0);
                                                        composer2.endReplaceableGroup();
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer2.skipToGroupEnd();
                                            }
                                        }), composerStartRestartGroup, ((i17 >> 12) & 14) | 48);
                                        composerStartRestartGroup.endReplaceableGroup();
                                        composerStartRestartGroup.endNode();
                                        composerStartRestartGroup.endReplaceableGroup();
                                        composerStartRestartGroup.endReplaceableGroup();
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        function07 = function0102;
                                        function08 = function06;
                                        modifier10 = modifier132;
                                        z13 = z7;
                                        z14 = z6;
                                        z15 = z212;
                                        i18 = i15;
                                        z16 = z202;
                                        z17 = z222;
                                    }
                                }
                            }
                        } else {
                            z12 = ((((i17 & 7168) ^ 3072) <= 2048 && composerStartRestartGroup.changed(mutableStateMutableStateOf$default)) || (i17 & 3072) == 2048) | ((i16 & 896) == 256);
                            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                            if (z12) {
                            }
                        }
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i2 & 7168) == 0) {
        }
        if ((i2 & 57344) == 0) {
        }
        i6 = i4 & 32;
        if (i6 == 0) {
        }
        i7 = i4 & 64;
        if (i7 == 0) {
        }
        i8 = i4 & 128;
        if (i8 == 0) {
        }
        if ((i2 & 234881024) == 0) {
        }
        i9 = i4 & 512;
        if (i9 == 0) {
        }
        if ((i3 & 14) != 0) {
        }
        i11 = i4 & 2048;
        if (i11 == 0) {
        }
        i12 = i4 & 4096;
        if (i12 != 0) {
        }
        if ((i4 & 8192) != 0) {
        }
        if ((1533916891 & i5) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    public static final void ClickAnimateBlock_wxW_who$lambda$3(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    public static final void ClickAnimateBlock_wxW_who$lambda$6(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    public static final void ClickAnimateBlock_wxW_who$lambda$10(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(name = "ClickAnimateBlock")
    public static final void PreviewClickAnimateBlock(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1621309481);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1621309481, i, -1, "com.blackhub.bronline.game.ui.widget.block.PreviewClickAnimateBlock (ClickAnimateBlock.kt:170)");
            }
            m15038ClickAnimateBlockwxWwho(null, null, false, null, false, false, false, false, null, 0, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.ClickAnimateBlockKt.PreviewClickAnimateBlock.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.ClickAnimateBlockKt.PreviewClickAnimateBlock.2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, ComposableSingletons$ClickAnimateBlockKt.INSTANCE.m15039getLambda1$app_siteRelease(), composerStartRestartGroup, 0, 3504, DoubleToDecimal.BQ_MASK);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.ClickAnimateBlockKt.PreviewClickAnimateBlock.3
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
                    ClickAnimateBlockKt.PreviewClickAnimateBlock(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final boolean ClickAnimateBlock_wxW_who$lambda$2(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    public static final boolean ClickAnimateBlock_wxW_who$lambda$5(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    public static final float ClickAnimateBlock_wxW_who$lambda$7(State<Float> state) {
        return state.getValue().floatValue();
    }

    public static final boolean ClickAnimateBlock_wxW_who$lambda$9(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    public static final float ClickAnimateBlock_wxW_who$lambda$13(State<Float> state) {
        return state.getValue().floatValue();
    }
}
