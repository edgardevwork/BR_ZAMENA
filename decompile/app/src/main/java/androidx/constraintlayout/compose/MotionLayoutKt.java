package androidx.constraintlayout.compose;

import android.annotation.SuppressLint;
import androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.ScaleKt;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.platform.CompositionLocalsKt;
import androidx.compose.p003ui.semantics.SemanticsModifierKt;
import androidx.compose.p003ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLParser;
import androidx.constraintlayout.core.parser.CLParsingException;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.profileinstaller.ProfileVerifier;
import com.blackhub.bronline.game.core.constants.BuildTypeConstants;
import java.util.EnumSet;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ChannelResult;
import org.intellij.lang.annotations.Language;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MotionLayout.kt */
@Metadata(m7104d1 = {"\u0000\u008c\u0001\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001ay\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u001e\b\u0004\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00030\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u0016H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0017\u001a\u0085\u0001\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u001e\b\u0004\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00030\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u0016H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u001a\u001ae\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u001e\b\u0004\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00030\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u0016H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u001d\u001a\u008b\u0001\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001c2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0!2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u0010\b\n\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010#2\u001e\b\u0004\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00030\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u0016H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010$\u001a\u0085\u0001\u0010%\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u001e\b\u0004\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00030\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u0016H\u0081\bø\u0001\u0000¢\u0006\u0002\u0010\u001a\u001ae\u0010%\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u001e\b\u0004\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00030\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u0016H\u0081\bø\u0001\u0000¢\u0006\u0002\u0010\u001d\u001a\u008b\u0001\u0010%\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001c2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0!2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u0010\b\n\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010#2\u001e\b\u0004\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00030\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u0016H\u0081\bø\u0001\u0000¢\u0006\u0002\u0010$\u001a\u0017\u0010&\u001a\u00020\u001c2\b\b\u0001\u0010\u0012\u001a\u00020\u001fH\u0007¢\u0006\u0002\u0010'\u001a\u0019\u0010(\u001a\u0004\u0018\u00010\b2\b\b\u0001\u0010\u0012\u001a\u00020\u001fH\u0007¢\u0006\u0002\u0010)\u001a[\u0010*\u001a\u00020+2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u00052\u0006\u0010/\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n002\u0006\u00101\u001a\u000202H\u0001¢\u0006\u0002\u00103\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082D¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00064"}, m7105d2 = {"DEBUG", "", MotionLayout.TAG, "", TtmlNode.START, "Landroidx/constraintlayout/compose/ConstraintSet;", "end", AnimatedStateListDrawableCompat.ELEMENT_TRANSITION, "Landroidx/constraintlayout/compose/Transition;", "progress", "", BuildTypeConstants.DEBUG_TYPE, "Ljava/util/EnumSet;", "Landroidx/constraintlayout/compose/MotionLayoutDebugFlags;", "modifier", "Landroidx/compose/ui/Modifier;", "optimizationLevel", "", "content", "Lkotlin/Function1;", "Landroidx/constraintlayout/compose/MotionLayoutScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/Transition;FLjava/util/EnumSet;Landroidx/compose/ui/Modifier;ILkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "informationReceiver", "Landroidx/constraintlayout/compose/LayoutInformationReceiver;", "(Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/Transition;FLjava/util/EnumSet;Landroidx/constraintlayout/compose/LayoutInformationReceiver;Landroidx/compose/ui/Modifier;ILkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "motionScene", "Landroidx/constraintlayout/compose/MotionScene;", "(Landroidx/constraintlayout/compose/MotionScene;FLjava/util/EnumSet;Landroidx/compose/ui/Modifier;ILkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "constraintSetName", "", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "finishedAnimationListener", "Lkotlin/Function0;", "(Landroidx/constraintlayout/compose/MotionScene;Ljava/lang/String;Landroidx/compose/animation/core/AnimationSpec;Ljava/util/EnumSet;Landroidx/compose/ui/Modifier;ILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "MotionLayoutCore", "MotionScene", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/constraintlayout/compose/MotionScene;", androidx.constraintlayout.motion.widget.MotionScene.TRANSITION_TAG, "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/constraintlayout/compose/Transition;", "rememberMotionLayoutMeasurePolicy", "Landroidx/compose/ui/layout/MeasurePolicy;", "needsUpdate", "", "constraintSetStart", "constraintSetEnd", "Landroidx/compose/runtime/MutableState;", "measurer", "Landroidx/constraintlayout/compose/MotionMeasurer;", "(ILjava/util/EnumSet;JLandroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/Transition;Landroidx/compose/runtime/MutableState;Landroidx/constraintlayout/compose/MotionMeasurer;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;", "compose_release"}, m7106k = 2, m7107mv = {1, 5, 1}, m7109xi = 48)
/* loaded from: classes.dex */
public final class MotionLayoutKt {
    public static final boolean DEBUG = false;

    @Composable
    @ExperimentalMotionApi
    public static final void MotionLayout(@NotNull ConstraintSet start, @NotNull ConstraintSet end, @Nullable Transition transition, float f, @Nullable EnumSet<MotionLayoutDebugFlags> enumSet, @Nullable Modifier modifier, int i, @NotNull Function3<? super MotionLayoutScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i2, int i3) {
        EnumSet<MotionLayoutDebugFlags> enumSet2;
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end, "end");
        Intrinsics.checkNotNullParameter(content, "content");
        composer.startReplaceableGroup(-1330873847);
        Transition transition2 = (i3 & 4) != 0 ? null : transition;
        if ((i3 & 16) != 0) {
            EnumSet<MotionLayoutDebugFlags> enumSetOf = EnumSet.of(MotionLayoutDebugFlags.NONE);
            Intrinsics.checkNotNullExpressionValue(enumSetOf, "of(MotionLayoutDebugFlags.NONE)");
            enumSet2 = enumSetOf;
        } else {
            enumSet2 = enumSet;
        }
        Modifier modifierScale = (i3 & 32) != 0 ? Modifier.INSTANCE : modifier;
        int i4 = (i3 & 64) != 0 ? 257 : i;
        int i5 = i2 << 3;
        int i6 = (i5 & 234881024) | (i2 & 14) | 229376 | (i2 & 112) | (i2 & 896) | (i2 & 7168) | (i5 & 3670016) | (i5 & 29360128);
        composer.startReplaceableGroup(-1330870962);
        int i7 = (i6 & 14) | 32768 | (i6 & 112) | (i6 & 896) | (i6 & 7168) | ProfileVerifier.CompilationStatus.f342xf2722a21 | (3670016 & i6) | (i6 & 29360128) | (i6 & 234881024);
        composer.startReplaceableGroup(-1401224268);
        composer.startReplaceableGroup(-3687241);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new MotionMeasurer();
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        MotionMeasurer motionMeasurer = (MotionMeasurer) objRememberedValue;
        composer.startReplaceableGroup(-3687241);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new MotionLayoutScope(motionMeasurer);
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        MotionLayoutScope motionLayoutScope = (MotionLayoutScope) objRememberedValue2;
        composer.startReplaceableGroup(-3687241);
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) objRememberedValue3;
        mutableState.setValue(Float.valueOf(f));
        int i8 = i7 << 9;
        MeasurePolicy measurePolicyRememberMotionLayoutMeasurePolicy = rememberMotionLayoutMeasurePolicy(i4, enumSet2, 0L, start, end, transition2, mutableState, motionMeasurer, composer, ((i7 >> 21) & 14) | 18350528 | (i8 & 7168) | (57344 & i8) | (i8 & 458752));
        motionMeasurer.addLayoutInformationReceiver(null);
        float forcedScaleFactor = motionMeasurer.getForcedScaleFactor();
        MotionLayoutDebugFlags motionLayoutDebugFlags = MotionLayoutDebugFlags.NONE;
        if (!enumSet2.contains(motionLayoutDebugFlags) || !Float.isNaN(forcedScaleFactor)) {
            composer.startReplaceableGroup(-1401223142);
            if (!Float.isNaN(forcedScaleFactor)) {
                modifierScale = ScaleKt.scale(modifierScale, motionMeasurer.getForcedScaleFactor());
            }
            composer.startReplaceableGroup(-1990474327);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer, 0);
            composer.startReplaceableGroup(1376089335);
            Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(companion2);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            composer.disableReusing();
            Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer);
            Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl, density, companion3.getSetDensity());
            Updater.m10877setimpl(composerM10870constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
            composer.enableReusing();
            function3MaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            composer.startReplaceableGroup(-1253629305);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifierScale, false, new MotionLayoutKt$MotionLayoutCore$3$1(motionMeasurer), 1, null), ComposableLambdaKt.composableLambda(composer, -819900388, true, new MotionLayoutKt$MotionLayoutCore$3$2(content, motionLayoutScope, i7)), measurePolicyRememberMotionLayoutMeasurePolicy, composer, 48, 0);
            if (!Float.isNaN(forcedScaleFactor)) {
                composer.startReplaceableGroup(-922833881);
                motionMeasurer.drawDebugBounds(boxScopeInstance, forcedScaleFactor, composer, 518);
                composer.endReplaceableGroup();
            } else {
                composer.startReplaceableGroup(-922833807);
                composer.endReplaceableGroup();
            }
            if (!enumSet2.contains(motionLayoutDebugFlags)) {
                composer.startReplaceableGroup(-922833740);
                motionMeasurer.drawDebug(boxScopeInstance, composer, 70);
                composer.endReplaceableGroup();
            } else {
                composer.startReplaceableGroup(-922833689);
                composer.endReplaceableGroup();
            }
            Unit unit = Unit.INSTANCE;
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-1401222327);
            LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifierScale, false, new C21214(motionMeasurer), 1, null), ComposableLambdaKt.composableLambda(composer, -819896774, true, new C21225(content, motionLayoutScope, i7)), measurePolicyRememberMotionLayoutMeasurePolicy, composer, 48, 0);
            composer.endReplaceableGroup();
        }
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }

    @Composable
    @ExperimentalMotionApi
    public static final void MotionLayout(@NotNull MotionScene motionScene, float f, @Nullable EnumSet<MotionLayoutDebugFlags> enumSet, @Nullable Modifier modifier, int i, @NotNull Function3<? super MotionLayoutScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i2, int i3) {
        EnumSet<MotionLayoutDebugFlags> enumSetOf;
        Transition Transition;
        Object obj;
        Intrinsics.checkNotNullParameter(motionScene, "motionScene");
        Intrinsics.checkNotNullParameter(content, "content");
        composer.startReplaceableGroup(-1330872956);
        if ((i3 & 4) != 0) {
            enumSetOf = EnumSet.of(MotionLayoutDebugFlags.NONE);
            Intrinsics.checkNotNullExpressionValue(enumSetOf, "of(MotionLayoutDebugFlags.NONE)");
        } else {
            enumSetOf = enumSet;
        }
        Modifier modifierScale = (i3 & 8) != 0 ? Modifier.INSTANCE : modifier;
        int i4 = (i3 & 16) != 0 ? 257 : i;
        int i5 = (i2 & 458752) | (i2 & 14) | 512 | (i2 & 112) | (i2 & 7168) | (57344 & i2);
        composer.startReplaceableGroup(-1401226512);
        composer.startReplaceableGroup(-3687241);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0L, null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState<Long> mutableState = (MutableState) objRememberedValue;
        motionScene.setUpdateFlag(mutableState);
        if (motionScene.getForcedDrawDebug() != MotionLayoutDebugFlags.UNKNOWN) {
            enumSetOf = EnumSet.of(motionScene.getForcedDrawDebug());
            Intrinsics.checkNotNullExpressionValue(enumSetOf, "of(motionScene.getForcedDrawDebug())");
        }
        EnumSet<MotionLayoutDebugFlags> enumSet2 = enumSetOf;
        Long value = mutableState.getValue();
        composer.startReplaceableGroup(-3686552);
        boolean zChanged = composer.changed(value) | composer.changed(motionScene);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged || objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = motionScene.getTransition("default");
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        String str = (String) objRememberedValue2;
        if (str == null) {
            composer.startReplaceableGroup(-488322840);
            composer.endReplaceableGroup();
            Transition = null;
        } else {
            composer.startReplaceableGroup(-1401225671);
            Transition = Transition(str, composer, 0);
            composer.endReplaceableGroup();
        }
        String startConstraintSetId = Transition == null ? TtmlNode.START : Transition.getStartConstraintSetId();
        String endConstraintSetId = Transition == null ? "end" : Transition.getEndConstraintSetId();
        Long value2 = mutableState.getValue();
        composer.startReplaceableGroup(-3686552);
        boolean zChanged2 = composer.changed(motionScene) | composer.changed(value2);
        Object objRememberedValue3 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
            String constraintSet = motionScene.getConstraintSet(startConstraintSetId);
            if (constraintSet == null) {
                constraintSet = motionScene.getConstraintSet(0);
            }
            objRememberedValue3 = constraintSet;
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceableGroup();
        String str2 = (String) objRememberedValue3;
        Long value3 = mutableState.getValue();
        composer.startReplaceableGroup(-3686552);
        boolean zChanged3 = composer.changed(value3) | composer.changed(motionScene);
        Object objRememberedValue4 = composer.rememberedValue();
        if (zChanged3 || objRememberedValue4 == companion.getEmpty()) {
            String constraintSet2 = motionScene.getConstraintSet(endConstraintSetId);
            if (constraintSet2 == null) {
                constraintSet2 = motionScene.getConstraintSet(1);
            }
            objRememberedValue4 = constraintSet2;
            composer.updateRememberedValue(objRememberedValue4);
        }
        composer.endReplaceableGroup();
        String str3 = (String) objRememberedValue4;
        if (str2 == null || str3 == null) {
            composer.endReplaceableGroup();
        } else {
            ConstraintSet ConstraintSet = ConstraintLayoutKt.ConstraintSet(str2);
            ConstraintSet ConstraintSet2 = ConstraintLayoutKt.ConstraintSet(str3);
            composer.startReplaceableGroup(-3687241);
            Object objRememberedValue5 = composer.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
                composer.updateRememberedValue(objRememberedValue5);
            }
            composer.endReplaceableGroup();
            MutableState mutableState2 = (MutableState) objRememberedValue5;
            float forcedProgress = motionScene.getForcedProgress();
            if (Float.isNaN(forcedProgress) || m13986MotionLayoutCore$lambda26(mutableState2) != f) {
                motionScene.resetForcedProgress();
                forcedProgress = f;
            }
            m13987MotionLayoutCore$lambda27(mutableState2, f);
            LayoutInformationReceiver layoutInformationReceiver = motionScene instanceof LayoutInformationReceiver ? (LayoutInformationReceiver) motionScene : null;
            int i6 = i5 << 9;
            int i7 = (i6 & 234881024) | (3670016 & i6) | 32768 | (29360128 & i6);
            composer.startReplaceableGroup(-1401224268);
            composer.startReplaceableGroup(-3687241);
            Object objRememberedValue6 = composer.rememberedValue();
            if (objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = new MotionMeasurer();
                composer.updateRememberedValue(objRememberedValue6);
            }
            composer.endReplaceableGroup();
            MotionMeasurer motionMeasurer = (MotionMeasurer) objRememberedValue6;
            composer.startReplaceableGroup(-3687241);
            Object objRememberedValue7 = composer.rememberedValue();
            if (objRememberedValue7 == companion.getEmpty()) {
                objRememberedValue7 = new MotionLayoutScope(motionMeasurer);
                composer.updateRememberedValue(objRememberedValue7);
            }
            composer.endReplaceableGroup();
            MotionLayoutScope motionLayoutScope = (MotionLayoutScope) objRememberedValue7;
            composer.startReplaceableGroup(-3687241);
            Object objRememberedValue8 = composer.rememberedValue();
            if (objRememberedValue8 == companion.getEmpty()) {
                obj = null;
                objRememberedValue8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
                composer.updateRememberedValue(objRememberedValue8);
            } else {
                obj = null;
            }
            composer.endReplaceableGroup();
            MutableState mutableState3 = (MutableState) objRememberedValue8;
            mutableState3.setValue(Float.valueOf(forcedProgress));
            Object obj2 = obj;
            MeasurePolicy measurePolicyRememberMotionLayoutMeasurePolicy = rememberMotionLayoutMeasurePolicy(i4, enumSet2, 0L, ConstraintSet, ConstraintSet2, Transition, mutableState3, motionMeasurer, composer, ((i7 >> 21) & 14) | 18350528);
            motionMeasurer.addLayoutInformationReceiver(layoutInformationReceiver);
            float forcedScaleFactor = motionMeasurer.getForcedScaleFactor();
            MotionLayoutDebugFlags motionLayoutDebugFlags = MotionLayoutDebugFlags.NONE;
            if (enumSet2.contains(motionLayoutDebugFlags) && Float.isNaN(forcedScaleFactor)) {
                composer.startReplaceableGroup(-1401222327);
                LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifierScale, false, new C21214(motionMeasurer), 1, obj2), ComposableLambdaKt.composableLambda(composer, -819896774, true, new C21225(content, motionLayoutScope, i7)), measurePolicyRememberMotionLayoutMeasurePolicy, composer, 48, 0);
                composer.endReplaceableGroup();
            } else {
                composer.startReplaceableGroup(-1401223142);
                if (!Float.isNaN(forcedScaleFactor)) {
                    modifierScale = ScaleKt.scale(modifierScale, motionMeasurer.getForcedScaleFactor());
                }
                composer.startReplaceableGroup(-1990474327);
                Modifier.Companion companion2 = Modifier.INSTANCE;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer, 0);
                composer.startReplaceableGroup(1376089335);
                Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(companion2);
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor);
                } else {
                    composer.useNode();
                }
                composer.disableReusing();
                Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer);
                Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m10877setimpl(composerM10870constructorimpl, density, companion3.getSetDensity());
                Updater.m10877setimpl(composerM10870constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
                composer.enableReusing();
                function3MaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                composer.startReplaceableGroup(-1253629305);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifierScale, false, new MotionLayoutKt$MotionLayoutCore$3$1(motionMeasurer), 1, null), ComposableLambdaKt.composableLambda(composer, -819900388, true, new MotionLayoutKt$MotionLayoutCore$3$2(content, motionLayoutScope, i7)), measurePolicyRememberMotionLayoutMeasurePolicy, composer, 48, 0);
                if (Float.isNaN(forcedScaleFactor)) {
                    composer.startReplaceableGroup(-922833807);
                    composer.endReplaceableGroup();
                } else {
                    composer.startReplaceableGroup(-922833881);
                    motionMeasurer.drawDebugBounds(boxScopeInstance, forcedScaleFactor, composer, 518);
                    composer.endReplaceableGroup();
                }
                if (enumSet2.contains(motionLayoutDebugFlags)) {
                    composer.startReplaceableGroup(-922833689);
                    composer.endReplaceableGroup();
                } else {
                    composer.startReplaceableGroup(-922833740);
                    motionMeasurer.drawDebug(boxScopeInstance, composer, 70);
                    composer.endReplaceableGroup();
                }
                Unit unit = Unit.INSTANCE;
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
            }
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
        }
        composer.endReplaceableGroup();
    }

    @Composable
    @ExperimentalMotionApi
    public static final void MotionLayout(@NotNull MotionScene motionScene, @Nullable String str, @Nullable AnimationSpec<Float> animationSpec, @Nullable EnumSet<MotionLayoutDebugFlags> enumSet, @Nullable Modifier modifier, int i, @Nullable Function0<Unit> function0, @NotNull Function3<? super MotionLayoutScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i2, int i3) {
        EnumSet<MotionLayoutDebugFlags> enumSetOf;
        Transition transition;
        EnumSet<MotionLayoutDebugFlags> enumSet2;
        float f;
        Modifier modifier2;
        int i4;
        Intrinsics.checkNotNullParameter(motionScene, "motionScene");
        Intrinsics.checkNotNullParameter(content, "content");
        composer.startReplaceableGroup(-1330871806);
        String str2 = (i3 & 2) != 0 ? null : str;
        AnimationSpec<Float> animationSpecTween$default = (i3 & 4) != 0 ? AnimationSpecKt.tween$default(0, 0, null, 7, null) : animationSpec;
        if ((i3 & 8) != 0) {
            enumSetOf = EnumSet.of(MotionLayoutDebugFlags.NONE);
            Intrinsics.checkNotNullExpressionValue(enumSetOf, "of(MotionLayoutDebugFlags.NONE)");
        } else {
            enumSetOf = enumSet;
        }
        Modifier modifier3 = (i3 & 16) != 0 ? Modifier.INSTANCE : modifier;
        int i5 = (i3 & 32) != 0 ? 257 : i;
        Function0<Unit> function02 = (i3 & 64) != 0 ? null : function0;
        int i6 = (i2 & 14) | 4608 | (i2 & 112) | (i2 & 57344) | (i2 & 458752) | (i2 & 3670016) | (i2 & 29360128);
        composer.startReplaceableGroup(-1401230387);
        composer.startReplaceableGroup(-3687241);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0L, null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState<Long> mutableState = (MutableState) objRememberedValue;
        motionScene.setUpdateFlag(mutableState);
        if (motionScene.getForcedDrawDebug() != MotionLayoutDebugFlags.UNKNOWN) {
            enumSetOf = EnumSet.of(motionScene.getForcedDrawDebug());
            Intrinsics.checkNotNullExpressionValue(enumSetOf, "of(motionScene.getForcedDrawDebug())");
        }
        EnumSet<MotionLayoutDebugFlags> enumSet3 = enumSetOf;
        Long value = mutableState.getValue();
        int i7 = i6 & 14;
        composer.startReplaceableGroup(-3686552);
        boolean zChanged = composer.changed(value) | composer.changed(motionScene);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged || objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = motionScene.getTransition("default");
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        String str3 = (String) objRememberedValue2;
        if (str3 == null) {
            composer.startReplaceableGroup(-488438718);
            composer.endReplaceableGroup();
            transition = null;
        } else {
            composer.startReplaceableGroup(-1401229409);
            Transition Transition = Transition(str3, composer, 0);
            composer.endReplaceableGroup();
            transition = Transition;
        }
        String startConstraintSetId = transition == null ? TtmlNode.START : transition.getStartConstraintSetId();
        String endConstraintSetId = transition == null ? "end" : transition.getEndConstraintSetId();
        Long value2 = mutableState.getValue();
        composer.startReplaceableGroup(-3686552);
        boolean zChanged2 = composer.changed(motionScene) | composer.changed(value2);
        Object objRememberedValue3 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
            String constraintSet = motionScene.getConstraintSet(startConstraintSetId);
            if (constraintSet == null) {
                constraintSet = motionScene.getConstraintSet(0);
            }
            objRememberedValue3 = constraintSet;
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceableGroup();
        String str4 = (String) objRememberedValue3;
        Long value3 = mutableState.getValue();
        composer.startReplaceableGroup(-3686552);
        boolean zChanged3 = composer.changed(value3) | composer.changed(motionScene);
        Object objRememberedValue4 = composer.rememberedValue();
        if (zChanged3 || objRememberedValue4 == companion.getEmpty()) {
            String constraintSet2 = motionScene.getConstraintSet(endConstraintSetId);
            if (constraintSet2 == null) {
                constraintSet2 = motionScene.getConstraintSet(1);
            }
            objRememberedValue4 = constraintSet2;
            composer.updateRememberedValue(objRememberedValue4);
        }
        composer.endReplaceableGroup();
        String str5 = (String) objRememberedValue4;
        composer.startReplaceableGroup(-3686552);
        boolean zChanged4 = composer.changed(motionScene) | composer.changed(str2);
        Object objRememberedValue5 = composer.rememberedValue();
        if (zChanged4 || objRememberedValue5 == companion.getEmpty()) {
            objRememberedValue5 = str2 == null ? null : motionScene.getConstraintSet(str2);
            composer.updateRememberedValue(objRememberedValue5);
        }
        composer.endReplaceableGroup();
        String str6 = (String) objRememberedValue5;
        if (str4 == null || str5 == null) {
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-3686930);
            boolean zChanged5 = composer.changed(motionScene);
            Object objRememberedValue6 = composer.rememberedValue();
            if (zChanged5 || objRememberedValue6 == companion.getEmpty()) {
                MutableState mutableStateMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(ConstraintLayoutKt.ConstraintSet(str4), null, 2, null);
                composer.updateRememberedValue(mutableStateMutableStateOf$default);
                objRememberedValue6 = mutableStateMutableStateOf$default;
            }
            composer.endReplaceableGroup();
            MutableState mutableState2 = (MutableState) objRememberedValue6;
            composer.startReplaceableGroup(-3686930);
            boolean zChanged6 = composer.changed(motionScene);
            Object objRememberedValue7 = composer.rememberedValue();
            if (zChanged6 || objRememberedValue7 == companion.getEmpty()) {
                objRememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(ConstraintLayoutKt.ConstraintSet(str5), null, 2, null);
                composer.updateRememberedValue(objRememberedValue7);
            }
            composer.endReplaceableGroup();
            MutableState mutableState3 = (MutableState) objRememberedValue7;
            ConstraintSet ConstraintSet = str6 == null ? null : ConstraintLayoutKt.ConstraintSet(str6);
            composer.startReplaceableGroup(-3687241);
            Object objRememberedValue8 = composer.rememberedValue();
            if (objRememberedValue8 == companion.getEmpty()) {
                objRememberedValue8 = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
                composer.updateRememberedValue(objRememberedValue8);
            }
            composer.endReplaceableGroup();
            Animatable animatable = (Animatable) objRememberedValue8;
            composer.startReplaceableGroup(-3686930);
            boolean zChanged7 = composer.changed(motionScene);
            Object objRememberedValue9 = composer.rememberedValue();
            if (zChanged7 || objRememberedValue9 == companion.getEmpty()) {
                objRememberedValue9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                composer.updateRememberedValue(objRememberedValue9);
            }
            composer.endReplaceableGroup();
            MutableState mutableState4 = (MutableState) objRememberedValue9;
            composer.startReplaceableGroup(-3687241);
            Object objRememberedValue10 = composer.rememberedValue();
            if (objRememberedValue10 == companion.getEmpty()) {
                objRememberedValue10 = ChannelKt.Channel$default(-1, null, null, 6, null);
                composer.updateRememberedValue(objRememberedValue10);
            }
            composer.endReplaceableGroup();
            Channel channel = (Channel) objRememberedValue10;
            if (ConstraintSet != null) {
                composer.startReplaceableGroup(-1401228155);
                EffectsKt.SideEffect(new C21191(channel, ConstraintSet), composer, 0);
                enumSet2 = enumSet3;
                f = 0.0f;
                i4 = -3687241;
                modifier2 = modifier3;
                EffectsKt.LaunchedEffect(motionScene, channel, new C21202(channel, animatable, animationSpecTween$default, function02, mutableState4, mutableState2, mutableState3, null), composer, i7 | 64);
                composer.endReplaceableGroup();
            } else {
                enumSet2 = enumSet3;
                f = 0.0f;
                modifier2 = modifier3;
                i4 = -3687241;
                composer.startReplaceableGroup(-1401227298);
                composer.endReplaceableGroup();
            }
            composer.startReplaceableGroup(i4);
            Object objRememberedValue11 = composer.rememberedValue();
            if (objRememberedValue11 == companion.getEmpty()) {
                objRememberedValue11 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(f), null, 2, null);
                composer.updateRememberedValue(objRememberedValue11);
            }
            composer.endReplaceableGroup();
            MutableState mutableState5 = (MutableState) objRememberedValue11;
            float forcedProgress = motionScene.getForcedProgress();
            if (Float.isNaN(forcedProgress) || ((Number) mutableState5.getValue()).floatValue() != ((Number) animatable.getValue()).floatValue()) {
                motionScene.resetForcedProgress();
                forcedProgress = ((Number) animatable.getValue()).floatValue();
            }
            mutableState5.setValue(animatable.getValue());
            ConstraintSet constraintSetM13988MotionLayoutCore$lambda8 = m13988MotionLayoutCore$lambda8(mutableState2);
            ConstraintSet constraintSetM13982MotionLayoutCore$lambda11 = m13982MotionLayoutCore$lambda11(mutableState3);
            JSONMotionScene jSONMotionScene = motionScene instanceof JSONMotionScene ? (JSONMotionScene) motionScene : null;
            int i8 = i6 << 6;
            int i9 = (i8 & 29360128) | (i8 & 3670016) | 32768 | ((i6 << 3) & 234881024);
            composer.startReplaceableGroup(-1330870962);
            int i10 = (i9 & 3670016) | 32768 | (i9 & 29360128) | (i9 & 234881024);
            composer.startReplaceableGroup(-1401224268);
            composer.startReplaceableGroup(i4);
            Object objRememberedValue12 = composer.rememberedValue();
            if (objRememberedValue12 == companion.getEmpty()) {
                objRememberedValue12 = new MotionMeasurer();
                composer.updateRememberedValue(objRememberedValue12);
            }
            composer.endReplaceableGroup();
            MotionMeasurer motionMeasurer = (MotionMeasurer) objRememberedValue12;
            composer.startReplaceableGroup(i4);
            Object objRememberedValue13 = composer.rememberedValue();
            if (objRememberedValue13 == companion.getEmpty()) {
                objRememberedValue13 = new MotionLayoutScope(motionMeasurer);
                composer.updateRememberedValue(objRememberedValue13);
            }
            composer.endReplaceableGroup();
            MotionLayoutScope motionLayoutScope = (MotionLayoutScope) objRememberedValue13;
            composer.startReplaceableGroup(i4);
            Object objRememberedValue14 = composer.rememberedValue();
            if (objRememberedValue14 == companion.getEmpty()) {
                objRememberedValue14 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(f), null, 2, null);
                composer.updateRememberedValue(objRememberedValue14);
            }
            composer.endReplaceableGroup();
            MutableState mutableState6 = (MutableState) objRememberedValue14;
            mutableState6.setValue(Float.valueOf(forcedProgress));
            MeasurePolicy measurePolicyRememberMotionLayoutMeasurePolicy = rememberMotionLayoutMeasurePolicy(i5, enumSet2, 0L, constraintSetM13988MotionLayoutCore$lambda8, constraintSetM13982MotionLayoutCore$lambda11, transition, mutableState6, motionMeasurer, composer, ((i10 >> 21) & 14) | 18350528);
            motionMeasurer.addLayoutInformationReceiver(jSONMotionScene);
            float forcedScaleFactor = motionMeasurer.getForcedScaleFactor();
            MotionLayoutDebugFlags motionLayoutDebugFlags = MotionLayoutDebugFlags.NONE;
            EnumSet<MotionLayoutDebugFlags> enumSet4 = enumSet2;
            if (enumSet4.contains(motionLayoutDebugFlags) && Float.isNaN(forcedScaleFactor)) {
                composer.startReplaceableGroup(-1401222327);
                LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifier2, false, new C21214(motionMeasurer), 1, null), ComposableLambdaKt.composableLambda(composer, -819896774, true, new C21225(content, motionLayoutScope, i10)), measurePolicyRememberMotionLayoutMeasurePolicy, composer, 48, 0);
                composer.endReplaceableGroup();
            } else {
                Modifier modifier4 = modifier2;
                composer.startReplaceableGroup(-1401223142);
                Modifier modifierScale = !Float.isNaN(forcedScaleFactor) ? ScaleKt.scale(modifier4, motionMeasurer.getForcedScaleFactor()) : modifier4;
                composer.startReplaceableGroup(-1990474327);
                Modifier.Companion companion2 = Modifier.INSTANCE;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer, 0);
                composer.startReplaceableGroup(1376089335);
                Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(companion2);
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor);
                } else {
                    composer.useNode();
                }
                composer.disableReusing();
                Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer);
                Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m10877setimpl(composerM10870constructorimpl, density, companion3.getSetDensity());
                Updater.m10877setimpl(composerM10870constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
                composer.enableReusing();
                function3MaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                composer.startReplaceableGroup(-1253629305);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifierScale, false, new MotionLayoutKt$MotionLayoutCore$3$1(motionMeasurer), 1, null), ComposableLambdaKt.composableLambda(composer, -819900388, true, new MotionLayoutKt$MotionLayoutCore$3$2(content, motionLayoutScope, i10)), measurePolicyRememberMotionLayoutMeasurePolicy, composer, 48, 0);
                if (Float.isNaN(forcedScaleFactor)) {
                    composer.startReplaceableGroup(-922833807);
                    composer.endReplaceableGroup();
                } else {
                    composer.startReplaceableGroup(-922833881);
                    motionMeasurer.drawDebugBounds(boxScopeInstance, forcedScaleFactor, composer, 518);
                    composer.endReplaceableGroup();
                }
                if (enumSet4.contains(motionLayoutDebugFlags)) {
                    composer.startReplaceableGroup(-922833689);
                    composer.endReplaceableGroup();
                } else {
                    composer.startReplaceableGroup(-922833740);
                    motionMeasurer.drawDebug(boxScopeInstance, composer, 70);
                    composer.endReplaceableGroup();
                }
                Unit unit = Unit.INSTANCE;
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
            }
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
        }
        composer.endReplaceableGroup();
    }

    @Composable
    @ExperimentalMotionApi
    public static final void MotionLayout(@NotNull ConstraintSet start, @NotNull ConstraintSet end, @Nullable Transition transition, float f, @Nullable EnumSet<MotionLayoutDebugFlags> enumSet, @Nullable LayoutInformationReceiver layoutInformationReceiver, @Nullable Modifier modifier, int i, @NotNull Function3<? super MotionLayoutScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i2, int i3) {
        EnumSet<MotionLayoutDebugFlags> enumSet2;
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end, "end");
        Intrinsics.checkNotNullParameter(content, "content");
        composer.startReplaceableGroup(-1330870962);
        Transition transition2 = (i3 & 4) != 0 ? null : transition;
        if ((i3 & 16) != 0) {
            EnumSet<MotionLayoutDebugFlags> enumSetOf = EnumSet.of(MotionLayoutDebugFlags.NONE);
            Intrinsics.checkNotNullExpressionValue(enumSetOf, "of(MotionLayoutDebugFlags.NONE)");
            enumSet2 = enumSetOf;
        } else {
            enumSet2 = enumSet;
        }
        LayoutInformationReceiver layoutInformationReceiver2 = (i3 & 32) != 0 ? null : layoutInformationReceiver;
        Modifier modifier2 = (i3 & 64) != 0 ? Modifier.INSTANCE : modifier;
        int i4 = (i3 & 128) != 0 ? 257 : i;
        int i5 = (i2 & 14) | 32768 | (i2 & 112) | (i2 & 896) | (i2 & 7168) | (i2 & 458752) | (3670016 & i2) | (29360128 & i2) | (i2 & 234881024);
        composer.startReplaceableGroup(-1401224268);
        composer.startReplaceableGroup(-3687241);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new MotionMeasurer();
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        MotionMeasurer motionMeasurer = (MotionMeasurer) objRememberedValue;
        composer.startReplaceableGroup(-3687241);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new MotionLayoutScope(motionMeasurer);
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        MotionLayoutScope motionLayoutScope = (MotionLayoutScope) objRememberedValue2;
        composer.startReplaceableGroup(-3687241);
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) objRememberedValue3;
        mutableState.setValue(Float.valueOf(f));
        int i6 = i5 << 9;
        Modifier modifier3 = modifier2;
        MeasurePolicy measurePolicyRememberMotionLayoutMeasurePolicy = rememberMotionLayoutMeasurePolicy(i4, enumSet2, 0L, start, end, transition2, mutableState, motionMeasurer, composer, ((i5 >> 21) & 14) | 18350528 | (i6 & 7168) | (57344 & i6) | (i6 & 458752));
        motionMeasurer.addLayoutInformationReceiver(layoutInformationReceiver2);
        float forcedScaleFactor = motionMeasurer.getForcedScaleFactor();
        MotionLayoutDebugFlags motionLayoutDebugFlags = MotionLayoutDebugFlags.NONE;
        if (!enumSet2.contains(motionLayoutDebugFlags) || !Float.isNaN(forcedScaleFactor)) {
            composer.startReplaceableGroup(-1401223142);
            Modifier modifierScale = !Float.isNaN(forcedScaleFactor) ? ScaleKt.scale(modifier3, motionMeasurer.getForcedScaleFactor()) : modifier3;
            composer.startReplaceableGroup(-1990474327);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer, 0);
            composer.startReplaceableGroup(1376089335);
            Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(companion2);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            composer.disableReusing();
            Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer);
            Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl, density, companion3.getSetDensity());
            Updater.m10877setimpl(composerM10870constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
            composer.enableReusing();
            function3MaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            composer.startReplaceableGroup(-1253629305);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifierScale, false, new MotionLayoutKt$MotionLayoutCore$3$1(motionMeasurer), 1, null), ComposableLambdaKt.composableLambda(composer, -819900388, true, new MotionLayoutKt$MotionLayoutCore$3$2(content, motionLayoutScope, i5)), measurePolicyRememberMotionLayoutMeasurePolicy, composer, 48, 0);
            if (!Float.isNaN(forcedScaleFactor)) {
                composer.startReplaceableGroup(-922833881);
                motionMeasurer.drawDebugBounds(boxScopeInstance, forcedScaleFactor, composer, 518);
                composer.endReplaceableGroup();
            } else {
                composer.startReplaceableGroup(-922833807);
                composer.endReplaceableGroup();
            }
            if (!enumSet2.contains(motionLayoutDebugFlags)) {
                composer.startReplaceableGroup(-922833740);
                motionMeasurer.drawDebug(boxScopeInstance, composer, 70);
                composer.endReplaceableGroup();
            } else {
                composer.startReplaceableGroup(-922833689);
                composer.endReplaceableGroup();
            }
            Unit unit = Unit.INSTANCE;
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-1401222327);
            LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifier3, false, new C21214(motionMeasurer), 1, null), ComposableLambdaKt.composableLambda(composer, -819896774, true, new C21225(content, motionLayoutScope, i5)), measurePolicyRememberMotionLayoutMeasurePolicy, composer, 48, 0);
            composer.endReplaceableGroup();
        }
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }

    @Composable
    @PublishedApi
    public static final void MotionLayoutCore(@NotNull MotionScene motionScene, @Nullable String str, @Nullable AnimationSpec<Float> animationSpec, @Nullable EnumSet<MotionLayoutDebugFlags> enumSet, @Nullable Modifier modifier, int i, @Nullable Function0<Unit> function0, @NotNull Function3<? super MotionLayoutScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i2, int i3) {
        EnumSet<MotionLayoutDebugFlags> enumSetOf;
        Transition transition;
        EnumSet<MotionLayoutDebugFlags> enumSet2;
        float f;
        Modifier modifier2;
        int i4;
        Intrinsics.checkNotNullParameter(motionScene, "motionScene");
        Intrinsics.checkNotNullParameter(content, "content");
        composer.startReplaceableGroup(-1401230387);
        String str2 = (i3 & 2) != 0 ? null : str;
        AnimationSpec<Float> animationSpecTween$default = (i3 & 4) != 0 ? AnimationSpecKt.tween$default(0, 0, null, 7, null) : animationSpec;
        if ((i3 & 8) != 0) {
            enumSetOf = EnumSet.of(MotionLayoutDebugFlags.NONE);
            Intrinsics.checkNotNullExpressionValue(enumSetOf, "of(MotionLayoutDebugFlags.NONE)");
        } else {
            enumSetOf = enumSet;
        }
        Modifier modifier3 = (i3 & 16) != 0 ? Modifier.INSTANCE : modifier;
        int i5 = (i3 & 32) != 0 ? 257 : i;
        Function0<Unit> function02 = (i3 & 64) != 0 ? null : function0;
        composer.startReplaceableGroup(-3687241);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0L, null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState<Long> mutableState = (MutableState) objRememberedValue;
        motionScene.setUpdateFlag(mutableState);
        if (motionScene.getForcedDrawDebug() != MotionLayoutDebugFlags.UNKNOWN) {
            enumSetOf = EnumSet.of(motionScene.getForcedDrawDebug());
            Intrinsics.checkNotNullExpressionValue(enumSetOf, "of(motionScene.getForcedDrawDebug())");
        }
        EnumSet<MotionLayoutDebugFlags> enumSet3 = enumSetOf;
        Long value = mutableState.getValue();
        int i6 = i2 & 14;
        composer.startReplaceableGroup(-3686552);
        boolean zChanged = composer.changed(value) | composer.changed(motionScene);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged || objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = motionScene.getTransition("default");
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        String str3 = (String) objRememberedValue2;
        if (str3 == null) {
            composer.startReplaceableGroup(-488438718);
            composer.endReplaceableGroup();
            transition = null;
        } else {
            composer.startReplaceableGroup(-1401229409);
            Transition Transition = Transition(str3, composer, 0);
            composer.endReplaceableGroup();
            transition = Transition;
        }
        String startConstraintSetId = transition == null ? TtmlNode.START : transition.getStartConstraintSetId();
        String endConstraintSetId = transition == null ? "end" : transition.getEndConstraintSetId();
        Long value2 = mutableState.getValue();
        composer.startReplaceableGroup(-3686552);
        boolean zChanged2 = composer.changed(motionScene) | composer.changed(value2);
        Object objRememberedValue3 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
            String constraintSet = motionScene.getConstraintSet(startConstraintSetId);
            if (constraintSet == null) {
                constraintSet = motionScene.getConstraintSet(0);
            }
            objRememberedValue3 = constraintSet;
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceableGroup();
        String str4 = (String) objRememberedValue3;
        Long value3 = mutableState.getValue();
        composer.startReplaceableGroup(-3686552);
        boolean zChanged3 = composer.changed(value3) | composer.changed(motionScene);
        Object objRememberedValue4 = composer.rememberedValue();
        if (zChanged3 || objRememberedValue4 == companion.getEmpty()) {
            String constraintSet2 = motionScene.getConstraintSet(endConstraintSetId);
            if (constraintSet2 == null) {
                constraintSet2 = motionScene.getConstraintSet(1);
            }
            objRememberedValue4 = constraintSet2;
            composer.updateRememberedValue(objRememberedValue4);
        }
        composer.endReplaceableGroup();
        String str5 = (String) objRememberedValue4;
        composer.startReplaceableGroup(-3686552);
        boolean zChanged4 = composer.changed(motionScene) | composer.changed(str2);
        Object objRememberedValue5 = composer.rememberedValue();
        if (zChanged4 || objRememberedValue5 == companion.getEmpty()) {
            objRememberedValue5 = str2 == null ? null : motionScene.getConstraintSet(str2);
            composer.updateRememberedValue(objRememberedValue5);
        }
        composer.endReplaceableGroup();
        String str6 = (String) objRememberedValue5;
        if (str4 == null || str5 == null) {
            composer.endReplaceableGroup();
            return;
        }
        composer.startReplaceableGroup(-3686930);
        boolean zChanged5 = composer.changed(motionScene);
        Object objRememberedValue6 = composer.rememberedValue();
        if (zChanged5 || objRememberedValue6 == companion.getEmpty()) {
            MutableState mutableStateMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(ConstraintLayoutKt.ConstraintSet(str4), null, 2, null);
            composer.updateRememberedValue(mutableStateMutableStateOf$default);
            objRememberedValue6 = mutableStateMutableStateOf$default;
        }
        composer.endReplaceableGroup();
        MutableState mutableState2 = (MutableState) objRememberedValue6;
        composer.startReplaceableGroup(-3686930);
        boolean zChanged6 = composer.changed(motionScene);
        Object objRememberedValue7 = composer.rememberedValue();
        if (zChanged6 || objRememberedValue7 == companion.getEmpty()) {
            objRememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(ConstraintLayoutKt.ConstraintSet(str5), null, 2, null);
            composer.updateRememberedValue(objRememberedValue7);
        }
        composer.endReplaceableGroup();
        MutableState mutableState3 = (MutableState) objRememberedValue7;
        ConstraintSet ConstraintSet = str6 == null ? null : ConstraintLayoutKt.ConstraintSet(str6);
        composer.startReplaceableGroup(-3687241);
        Object objRememberedValue8 = composer.rememberedValue();
        if (objRememberedValue8 == companion.getEmpty()) {
            objRememberedValue8 = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
            composer.updateRememberedValue(objRememberedValue8);
        }
        composer.endReplaceableGroup();
        Animatable animatable = (Animatable) objRememberedValue8;
        composer.startReplaceableGroup(-3686930);
        boolean zChanged7 = composer.changed(motionScene);
        Object objRememberedValue9 = composer.rememberedValue();
        if (zChanged7 || objRememberedValue9 == companion.getEmpty()) {
            objRememberedValue9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
            composer.updateRememberedValue(objRememberedValue9);
        }
        composer.endReplaceableGroup();
        MutableState mutableState4 = (MutableState) objRememberedValue9;
        composer.startReplaceableGroup(-3687241);
        Object objRememberedValue10 = composer.rememberedValue();
        if (objRememberedValue10 == companion.getEmpty()) {
            objRememberedValue10 = ChannelKt.Channel$default(-1, null, null, 6, null);
            composer.updateRememberedValue(objRememberedValue10);
        }
        composer.endReplaceableGroup();
        Channel channel = (Channel) objRememberedValue10;
        if (ConstraintSet != null) {
            composer.startReplaceableGroup(-1401228155);
            EffectsKt.SideEffect(new C21191(channel, ConstraintSet), composer, 0);
            enumSet2 = enumSet3;
            f = 0.0f;
            i4 = -3687241;
            modifier2 = modifier3;
            EffectsKt.LaunchedEffect(motionScene, channel, new C21202(channel, animatable, animationSpecTween$default, function02, mutableState4, mutableState2, mutableState3, null), composer, i6 | 64);
            composer.endReplaceableGroup();
        } else {
            enumSet2 = enumSet3;
            f = 0.0f;
            modifier2 = modifier3;
            i4 = -3687241;
            composer.startReplaceableGroup(-1401227298);
            composer.endReplaceableGroup();
        }
        composer.startReplaceableGroup(i4);
        Object objRememberedValue11 = composer.rememberedValue();
        if (objRememberedValue11 == companion.getEmpty()) {
            objRememberedValue11 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(f), null, 2, null);
            composer.updateRememberedValue(objRememberedValue11);
        }
        composer.endReplaceableGroup();
        MutableState mutableState5 = (MutableState) objRememberedValue11;
        float forcedProgress = motionScene.getForcedProgress();
        if (Float.isNaN(forcedProgress) || ((Number) mutableState5.getValue()).floatValue() != ((Number) animatable.getValue()).floatValue()) {
            motionScene.resetForcedProgress();
            forcedProgress = ((Number) animatable.getValue()).floatValue();
        }
        mutableState5.setValue(animatable.getValue());
        ConstraintSet constraintSetM13988MotionLayoutCore$lambda8 = m13988MotionLayoutCore$lambda8(mutableState2);
        ConstraintSet constraintSetM13982MotionLayoutCore$lambda11 = m13982MotionLayoutCore$lambda11(mutableState3);
        JSONMotionScene jSONMotionScene = motionScene instanceof JSONMotionScene ? (JSONMotionScene) motionScene : null;
        int i7 = i2 << 6;
        int i8 = (i7 & 29360128) | (i7 & 3670016) | 32768 | ((i2 << 3) & 234881024);
        composer.startReplaceableGroup(-1330870962);
        int i9 = (3670016 & i8) | 32768 | (i8 & 29360128) | (i8 & 234881024);
        composer.startReplaceableGroup(-1401224268);
        composer.startReplaceableGroup(i4);
        Object objRememberedValue12 = composer.rememberedValue();
        if (objRememberedValue12 == companion.getEmpty()) {
            objRememberedValue12 = new MotionMeasurer();
            composer.updateRememberedValue(objRememberedValue12);
        }
        composer.endReplaceableGroup();
        MotionMeasurer motionMeasurer = (MotionMeasurer) objRememberedValue12;
        composer.startReplaceableGroup(i4);
        Object objRememberedValue13 = composer.rememberedValue();
        if (objRememberedValue13 == companion.getEmpty()) {
            objRememberedValue13 = new MotionLayoutScope(motionMeasurer);
            composer.updateRememberedValue(objRememberedValue13);
        }
        composer.endReplaceableGroup();
        MotionLayoutScope motionLayoutScope = (MotionLayoutScope) objRememberedValue13;
        composer.startReplaceableGroup(i4);
        Object objRememberedValue14 = composer.rememberedValue();
        if (objRememberedValue14 == companion.getEmpty()) {
            objRememberedValue14 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(f), null, 2, null);
            composer.updateRememberedValue(objRememberedValue14);
        }
        composer.endReplaceableGroup();
        MutableState mutableState6 = (MutableState) objRememberedValue14;
        mutableState6.setValue(Float.valueOf(forcedProgress));
        MeasurePolicy measurePolicyRememberMotionLayoutMeasurePolicy = rememberMotionLayoutMeasurePolicy(i5, enumSet2, 0L, constraintSetM13988MotionLayoutCore$lambda8, constraintSetM13982MotionLayoutCore$lambda11, transition, mutableState6, motionMeasurer, composer, ((i9 >> 21) & 14) | 18350528);
        motionMeasurer.addLayoutInformationReceiver(jSONMotionScene);
        float forcedScaleFactor = motionMeasurer.getForcedScaleFactor();
        MotionLayoutDebugFlags motionLayoutDebugFlags = MotionLayoutDebugFlags.NONE;
        EnumSet<MotionLayoutDebugFlags> enumSet4 = enumSet2;
        if (!enumSet4.contains(motionLayoutDebugFlags) || !Float.isNaN(forcedScaleFactor)) {
            Modifier modifier4 = modifier2;
            composer.startReplaceableGroup(-1401223142);
            Modifier modifierScale = !Float.isNaN(forcedScaleFactor) ? ScaleKt.scale(modifier4, motionMeasurer.getForcedScaleFactor()) : modifier4;
            composer.startReplaceableGroup(-1990474327);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer, 0);
            composer.startReplaceableGroup(1376089335);
            Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(companion2);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            composer.disableReusing();
            Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer);
            Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl, density, companion3.getSetDensity());
            Updater.m10877setimpl(composerM10870constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
            composer.enableReusing();
            function3MaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            composer.startReplaceableGroup(-1253629305);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifierScale, false, new MotionLayoutKt$MotionLayoutCore$3$1(motionMeasurer), 1, null), ComposableLambdaKt.composableLambda(composer, -819900388, true, new MotionLayoutKt$MotionLayoutCore$3$2(content, motionLayoutScope, i9)), measurePolicyRememberMotionLayoutMeasurePolicy, composer, 48, 0);
            if (!Float.isNaN(forcedScaleFactor)) {
                composer.startReplaceableGroup(-922833881);
                motionMeasurer.drawDebugBounds(boxScopeInstance, forcedScaleFactor, composer, 518);
                composer.endReplaceableGroup();
            } else {
                composer.startReplaceableGroup(-922833807);
                composer.endReplaceableGroup();
            }
            if (!enumSet4.contains(motionLayoutDebugFlags)) {
                composer.startReplaceableGroup(-922833740);
                motionMeasurer.drawDebug(boxScopeInstance, composer, 70);
                composer.endReplaceableGroup();
            } else {
                composer.startReplaceableGroup(-922833689);
                composer.endReplaceableGroup();
            }
            Unit unit = Unit.INSTANCE;
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-1401222327);
            LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifier2, false, new C21214(motionMeasurer), 1, null), ComposableLambdaKt.composableLambda(composer, -819896774, true, new C21225(content, motionLayoutScope, i9)), measurePolicyRememberMotionLayoutMeasurePolicy, composer, 48, 0);
            composer.endReplaceableGroup();
        }
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }

    /* renamed from: MotionLayoutCore$lambda-17 */
    public static final void m13985MotionLayoutCore$lambda17(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* compiled from: MotionLayout.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 5, 1}, m7109xi = 48)
    /* renamed from: androidx.constraintlayout.compose.MotionLayoutKt$MotionLayoutCore$1 */
    /* loaded from: classes3.dex */
    public static final class C21191 extends Lambda implements Function0<Unit> {
        public final /* synthetic */ Channel<ConstraintSet> $channel;
        public final /* synthetic */ ConstraintSet $targetConstraintSet;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21191(Channel<ConstraintSet> channel, ConstraintSet constraintSet) {
            super(0);
            this.$channel = channel;
            this.$targetConstraintSet = constraintSet;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2() {
            this.$channel.mo17201trySendJP2dKIU(this.$targetConstraintSet);
        }
    }

    @Composable
    @PublishedApi
    public static final void MotionLayoutCore(@NotNull MotionScene motionScene, float f, @Nullable EnumSet<MotionLayoutDebugFlags> enumSet, @Nullable Modifier modifier, int i, @NotNull Function3<? super MotionLayoutScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i2, int i3) {
        EnumSet<MotionLayoutDebugFlags> enumSetOf;
        Transition transition;
        Object obj;
        Intrinsics.checkNotNullParameter(motionScene, "motionScene");
        Intrinsics.checkNotNullParameter(content, "content");
        composer.startReplaceableGroup(-1401226512);
        if ((i3 & 4) != 0) {
            enumSetOf = EnumSet.of(MotionLayoutDebugFlags.NONE);
            Intrinsics.checkNotNullExpressionValue(enumSetOf, "of(MotionLayoutDebugFlags.NONE)");
        } else {
            enumSetOf = enumSet;
        }
        Modifier modifierScale = (i3 & 8) != 0 ? Modifier.INSTANCE : modifier;
        int i4 = (i3 & 16) != 0 ? 257 : i;
        composer.startReplaceableGroup(-3687241);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0L, null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState<Long> mutableState = (MutableState) objRememberedValue;
        motionScene.setUpdateFlag(mutableState);
        if (motionScene.getForcedDrawDebug() != MotionLayoutDebugFlags.UNKNOWN) {
            enumSetOf = EnumSet.of(motionScene.getForcedDrawDebug());
            Intrinsics.checkNotNullExpressionValue(enumSetOf, "of(motionScene.getForcedDrawDebug())");
        }
        EnumSet<MotionLayoutDebugFlags> enumSet2 = enumSetOf;
        Long value = mutableState.getValue();
        composer.startReplaceableGroup(-3686552);
        boolean zChanged = composer.changed(value) | composer.changed(motionScene);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged || objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = motionScene.getTransition("default");
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        String str = (String) objRememberedValue2;
        if (str == null) {
            composer.startReplaceableGroup(-488322840);
            composer.endReplaceableGroup();
            transition = null;
        } else {
            composer.startReplaceableGroup(-1401225671);
            Transition Transition = Transition(str, composer, 0);
            composer.endReplaceableGroup();
            transition = Transition;
        }
        String startConstraintSetId = transition == null ? TtmlNode.START : transition.getStartConstraintSetId();
        String endConstraintSetId = transition == null ? "end" : transition.getEndConstraintSetId();
        Long value2 = mutableState.getValue();
        composer.startReplaceableGroup(-3686552);
        boolean zChanged2 = composer.changed(motionScene) | composer.changed(value2);
        Object objRememberedValue3 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
            String constraintSet = motionScene.getConstraintSet(startConstraintSetId);
            if (constraintSet == null) {
                constraintSet = motionScene.getConstraintSet(0);
            }
            objRememberedValue3 = constraintSet;
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceableGroup();
        String str2 = (String) objRememberedValue3;
        Long value3 = mutableState.getValue();
        composer.startReplaceableGroup(-3686552);
        boolean zChanged3 = composer.changed(value3) | composer.changed(motionScene);
        Object objRememberedValue4 = composer.rememberedValue();
        if (zChanged3 || objRememberedValue4 == companion.getEmpty()) {
            String constraintSet2 = motionScene.getConstraintSet(endConstraintSetId);
            if (constraintSet2 == null) {
                constraintSet2 = motionScene.getConstraintSet(1);
            }
            objRememberedValue4 = constraintSet2;
            composer.updateRememberedValue(objRememberedValue4);
        }
        composer.endReplaceableGroup();
        String str3 = (String) objRememberedValue4;
        if (str2 == null || str3 == null) {
            composer.endReplaceableGroup();
            return;
        }
        ConstraintSet ConstraintSet = ConstraintLayoutKt.ConstraintSet(str2);
        ConstraintSet ConstraintSet2 = ConstraintLayoutKt.ConstraintSet(str3);
        composer.startReplaceableGroup(-3687241);
        Object objRememberedValue5 = composer.rememberedValue();
        if (objRememberedValue5 == companion.getEmpty()) {
            objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
            composer.updateRememberedValue(objRememberedValue5);
        }
        composer.endReplaceableGroup();
        MutableState mutableState2 = (MutableState) objRememberedValue5;
        float forcedProgress = motionScene.getForcedProgress();
        if (Float.isNaN(forcedProgress) || m13986MotionLayoutCore$lambda26(mutableState2) != f) {
            motionScene.resetForcedProgress();
            forcedProgress = f;
        }
        m13987MotionLayoutCore$lambda27(mutableState2, f);
        LayoutInformationReceiver layoutInformationReceiver = motionScene instanceof LayoutInformationReceiver ? (LayoutInformationReceiver) motionScene : null;
        int i5 = i2 << 9;
        int i6 = (i5 & 234881024) | (3670016 & i5) | 32768 | (29360128 & i5);
        composer.startReplaceableGroup(-1401224268);
        composer.startReplaceableGroup(-3687241);
        Object objRememberedValue6 = composer.rememberedValue();
        if (objRememberedValue6 == companion.getEmpty()) {
            objRememberedValue6 = new MotionMeasurer();
            composer.updateRememberedValue(objRememberedValue6);
        }
        composer.endReplaceableGroup();
        MotionMeasurer motionMeasurer = (MotionMeasurer) objRememberedValue6;
        composer.startReplaceableGroup(-3687241);
        Object objRememberedValue7 = composer.rememberedValue();
        if (objRememberedValue7 == companion.getEmpty()) {
            objRememberedValue7 = new MotionLayoutScope(motionMeasurer);
            composer.updateRememberedValue(objRememberedValue7);
        }
        composer.endReplaceableGroup();
        MotionLayoutScope motionLayoutScope = (MotionLayoutScope) objRememberedValue7;
        composer.startReplaceableGroup(-3687241);
        Object objRememberedValue8 = composer.rememberedValue();
        if (objRememberedValue8 == companion.getEmpty()) {
            obj = null;
            objRememberedValue8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
            composer.updateRememberedValue(objRememberedValue8);
        } else {
            obj = null;
        }
        composer.endReplaceableGroup();
        MutableState mutableState3 = (MutableState) objRememberedValue8;
        mutableState3.setValue(Float.valueOf(forcedProgress));
        MeasurePolicy measurePolicyRememberMotionLayoutMeasurePolicy = rememberMotionLayoutMeasurePolicy(i4, enumSet2, 0L, ConstraintSet, ConstraintSet2, transition, mutableState3, motionMeasurer, composer, ((i6 >> 21) & 14) | 18350528);
        motionMeasurer.addLayoutInformationReceiver(layoutInformationReceiver);
        float forcedScaleFactor = motionMeasurer.getForcedScaleFactor();
        MotionLayoutDebugFlags motionLayoutDebugFlags = MotionLayoutDebugFlags.NONE;
        if (!enumSet2.contains(motionLayoutDebugFlags) || !Float.isNaN(forcedScaleFactor)) {
            composer.startReplaceableGroup(-1401223142);
            if (!Float.isNaN(forcedScaleFactor)) {
                modifierScale = ScaleKt.scale(modifierScale, motionMeasurer.getForcedScaleFactor());
            }
            composer.startReplaceableGroup(-1990474327);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer, 0);
            composer.startReplaceableGroup(1376089335);
            Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(companion2);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            composer.disableReusing();
            Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer);
            Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl, density, companion3.getSetDensity());
            Updater.m10877setimpl(composerM10870constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
            composer.enableReusing();
            function3MaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            composer.startReplaceableGroup(-1253629305);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifierScale, false, new MotionLayoutKt$MotionLayoutCore$3$1(motionMeasurer), 1, null), ComposableLambdaKt.composableLambda(composer, -819900388, true, new MotionLayoutKt$MotionLayoutCore$3$2(content, motionLayoutScope, i6)), measurePolicyRememberMotionLayoutMeasurePolicy, composer, 48, 0);
            if (!Float.isNaN(forcedScaleFactor)) {
                composer.startReplaceableGroup(-922833881);
                motionMeasurer.drawDebugBounds(boxScopeInstance, forcedScaleFactor, composer, 518);
                composer.endReplaceableGroup();
            } else {
                composer.startReplaceableGroup(-922833807);
                composer.endReplaceableGroup();
            }
            if (!enumSet2.contains(motionLayoutDebugFlags)) {
                composer.startReplaceableGroup(-922833740);
                motionMeasurer.drawDebug(boxScopeInstance, composer, 70);
                composer.endReplaceableGroup();
            } else {
                composer.startReplaceableGroup(-922833689);
                composer.endReplaceableGroup();
            }
            Unit unit = Unit.INSTANCE;
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-1401222327);
            LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifierScale, false, new C21214(motionMeasurer), 1, null), ComposableLambdaKt.composableLambda(composer, -819896774, true, new C21225(content, motionLayoutScope, i6)), measurePolicyRememberMotionLayoutMeasurePolicy, composer, 48, 0);
            composer.endReplaceableGroup();
        }
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }

    /* renamed from: MotionLayoutCore$lambda-27 */
    public static final void m13987MotionLayoutCore$lambda27(MutableState<Float> mutableState, float f) {
        mutableState.setValue(Float.valueOf(f));
    }

    @Composable
    @PublishedApi
    public static final void MotionLayoutCore(@NotNull ConstraintSet start, @NotNull ConstraintSet end, @Nullable Transition transition, float f, @Nullable EnumSet<MotionLayoutDebugFlags> enumSet, @Nullable LayoutInformationReceiver layoutInformationReceiver, @Nullable Modifier modifier, int i, @NotNull Function3<? super MotionLayoutScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i2, int i3) {
        EnumSet<MotionLayoutDebugFlags> enumSet2;
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end, "end");
        Intrinsics.checkNotNullParameter(content, "content");
        composer.startReplaceableGroup(-1401224268);
        Transition transition2 = (i3 & 4) != 0 ? null : transition;
        if ((i3 & 16) != 0) {
            EnumSet<MotionLayoutDebugFlags> enumSetOf = EnumSet.of(MotionLayoutDebugFlags.NONE);
            Intrinsics.checkNotNullExpressionValue(enumSetOf, "of(MotionLayoutDebugFlags.NONE)");
            enumSet2 = enumSetOf;
        } else {
            enumSet2 = enumSet;
        }
        LayoutInformationReceiver layoutInformationReceiver2 = (i3 & 32) != 0 ? null : layoutInformationReceiver;
        Modifier modifier2 = (i3 & 64) != 0 ? Modifier.INSTANCE : modifier;
        int i4 = (i3 & 128) != 0 ? 257 : i;
        composer.startReplaceableGroup(-3687241);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new MotionMeasurer();
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        MotionMeasurer motionMeasurer = (MotionMeasurer) objRememberedValue;
        composer.startReplaceableGroup(-3687241);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new MotionLayoutScope(motionMeasurer);
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        MotionLayoutScope motionLayoutScope = (MotionLayoutScope) objRememberedValue2;
        composer.startReplaceableGroup(-3687241);
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) objRememberedValue3;
        mutableState.setValue(Float.valueOf(f));
        int i5 = i2 << 9;
        Modifier modifier3 = modifier2;
        MeasurePolicy measurePolicyRememberMotionLayoutMeasurePolicy = rememberMotionLayoutMeasurePolicy(i4, enumSet2, 0L, start, end, transition2, mutableState, motionMeasurer, composer, ((i2 >> 21) & 14) | 18350528 | (i5 & 7168) | (57344 & i5) | (i5 & 458752));
        motionMeasurer.addLayoutInformationReceiver(layoutInformationReceiver2);
        float forcedScaleFactor = motionMeasurer.getForcedScaleFactor();
        MotionLayoutDebugFlags motionLayoutDebugFlags = MotionLayoutDebugFlags.NONE;
        if (!enumSet2.contains(motionLayoutDebugFlags) || !Float.isNaN(forcedScaleFactor)) {
            composer.startReplaceableGroup(-1401223142);
            Modifier modifierScale = !Float.isNaN(forcedScaleFactor) ? ScaleKt.scale(modifier3, motionMeasurer.getForcedScaleFactor()) : modifier3;
            composer.startReplaceableGroup(-1990474327);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer, 0);
            composer.startReplaceableGroup(1376089335);
            Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(companion2);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            composer.disableReusing();
            Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer);
            Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl, density, companion3.getSetDensity());
            Updater.m10877setimpl(composerM10870constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
            composer.enableReusing();
            function3MaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            composer.startReplaceableGroup(-1253629305);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifierScale, false, new MotionLayoutKt$MotionLayoutCore$3$1(motionMeasurer), 1, null), ComposableLambdaKt.composableLambda(composer, -819900388, true, new MotionLayoutKt$MotionLayoutCore$3$2(content, motionLayoutScope, i2)), measurePolicyRememberMotionLayoutMeasurePolicy, composer, 48, 0);
            if (!Float.isNaN(forcedScaleFactor)) {
                composer.startReplaceableGroup(-922833881);
                motionMeasurer.drawDebugBounds(boxScopeInstance, forcedScaleFactor, composer, 518);
                composer.endReplaceableGroup();
            } else {
                composer.startReplaceableGroup(-922833807);
                composer.endReplaceableGroup();
            }
            if (!enumSet2.contains(motionLayoutDebugFlags)) {
                composer.startReplaceableGroup(-922833740);
                motionMeasurer.drawDebug(boxScopeInstance, composer, 70);
                composer.endReplaceableGroup();
            } else {
                composer.startReplaceableGroup(-922833689);
                composer.endReplaceableGroup();
            }
            Unit unit = Unit.INSTANCE;
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-1401222327);
            LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifier3, false, new C21214(motionMeasurer), 1, null), ComposableLambdaKt.composableLambda(composer, -819896774, true, new C21225(content, motionLayoutScope, i2)), measurePolicyRememberMotionLayoutMeasurePolicy, composer, 48, 0);
            composer.endReplaceableGroup();
        }
        composer.endReplaceableGroup();
    }

    /* compiled from: MotionLayout.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 5, 1}, m7109xi = 48)
    /* renamed from: androidx.constraintlayout.compose.MotionLayoutKt$MotionLayoutCore$4 */
    /* loaded from: classes3.dex */
    public static final class C21214 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {
        public final /* synthetic */ MotionMeasurer $measurer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21214(MotionMeasurer motionMeasurer) {
            super(1);
            this.$measurer = motionMeasurer;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            invoke2(semanticsPropertyReceiver);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            ToolingUtilsKt.setDesignInfoProvider(semantics, this.$measurer);
        }
    }

    /* compiled from: MotionLayout.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 5, 1}, m7109xi = 48)
    /* renamed from: androidx.constraintlayout.compose.MotionLayoutKt$MotionLayoutCore$5 */
    /* loaded from: classes3.dex */
    public static final class C21225 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ Function3<MotionLayoutScope, Composer, Integer, Unit> $content;
        public final /* synthetic */ MotionLayoutScope $scope;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C21225(Function3<? super MotionLayoutScope, ? super Composer, ? super Integer, Unit> function3, MotionLayoutScope motionLayoutScope, int i) {
            super(2);
            this.$content = function3;
            this.$scope = motionLayoutScope;
            this.$$changed = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        @Composable
        public final void invoke(@Nullable Composer composer, int i) {
            if (((i & 11) ^ 2) == 0 && composer.getSkipping()) {
                composer.skipToGroupEnd();
            } else {
                this.$content.invoke(this.$scope, composer, Integer.valueOf(((this.$$changed >> 21) & 112) | 8));
            }
        }
    }

    @Composable
    @SuppressLint({"ComposableNaming"})
    @NotNull
    public static final MotionScene MotionScene(@Language("json5") @NotNull String content, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(content, "content");
        composer.startReplaceableGroup(1405665503);
        composer.startReplaceableGroup(-3686930);
        boolean zChanged = composer.changed(content);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new JSONMotionScene(content);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        JSONMotionScene jSONMotionScene = (JSONMotionScene) objRememberedValue;
        composer.endReplaceableGroup();
        return jSONMotionScene;
    }

    @Composable
    @SuppressLint({"ComposableNaming"})
    @Nullable
    public static final Transition Transition(@Language("json5") @NotNull String content, @Nullable Composer composer, int i) {
        final CLObject cLObject;
        Intrinsics.checkNotNullParameter(content, "content");
        composer.startReplaceableGroup(811760201);
        composer.startReplaceableGroup(-3686930);
        boolean zChanged = composer.changed(content);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            try {
                cLObject = CLParser.parse(content);
            } catch (CLParsingException e) {
                System.err.println(Intrinsics.stringPlus("Error parsing JSON ", e));
                cLObject = null;
            }
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(cLObject != null ? new Transition() { // from class: androidx.constraintlayout.compose.MotionLayoutKt$Transition$transition$1$1
                @Override // androidx.constraintlayout.compose.Transition
                public void applyTo(@NotNull androidx.constraintlayout.core.state.Transition transition, int i2) {
                    Intrinsics.checkNotNullParameter(transition, "transition");
                    try {
                        ConstraintSetParserKt.parseTransition(cLObject, transition);
                    } catch (CLParsingException e2) {
                        System.err.println(Intrinsics.stringPlus("Error parsing JSON ", e2));
                    }
                }

                @Override // androidx.constraintlayout.compose.Transition
                @NotNull
                public String getStartConstraintSetId() {
                    String stringOrNull = cLObject.getStringOrNull("from");
                    return stringOrNull == null ? TtmlNode.START : stringOrNull;
                }

                @Override // androidx.constraintlayout.compose.Transition
                @NotNull
                public String getEndConstraintSetId() {
                    String stringOrNull = cLObject.getStringOrNull("to");
                    return stringOrNull == null ? "end" : stringOrNull;
                }
            } : null, null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        MotionLayoutKt$Transition$transition$1$1 motionLayoutKt$Transition$transition$1$1 = (MotionLayoutKt$Transition$transition$1$1) ((MutableState) objRememberedValue).getValue();
        composer.endReplaceableGroup();
        return motionLayoutKt$Transition$transition$1$1;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v0 ??, still in use, count: 1, list:
          (r11v0 ?? I:java.lang.Object) from 0x007f: INVOKE (r21v0 ?? I:androidx.compose.runtime.Composer), (r11v0 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:2065)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    @androidx.compose.runtime.Composable
    @kotlin.PublishedApi
    @org.jetbrains.annotations.NotNull
    public static final androidx.compose.p003ui.layout.MeasurePolicy rememberMotionLayoutMeasurePolicy(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v0 ??, still in use, count: 1, list:
          (r11v0 ?? I:java.lang.Object) from 0x007f: INVOKE (r21v0 ?? I:androidx.compose.runtime.Composer), (r11v0 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:2065)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r12v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:405)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
        	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:79)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:401)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:389)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:339)
        */

    /* renamed from: MotionLayoutCore$lambda-8 */
    public static final ConstraintSet m13988MotionLayoutCore$lambda8(MutableState<ConstraintSet> mutableState) {
        return mutableState.getValue();
    }

    /* renamed from: MotionLayoutCore$lambda-9 */
    public static final void m13989MotionLayoutCore$lambda9(MutableState<ConstraintSet> mutableState, ConstraintSet constraintSet) {
        mutableState.setValue(constraintSet);
    }

    /* renamed from: MotionLayoutCore$lambda-11 */
    public static final ConstraintSet m13982MotionLayoutCore$lambda11(MutableState<ConstraintSet> mutableState) {
        return mutableState.getValue();
    }

    /* renamed from: MotionLayoutCore$lambda-12 */
    public static final void m13983MotionLayoutCore$lambda12(MutableState<ConstraintSet> mutableState, ConstraintSet constraintSet) {
        mutableState.setValue(constraintSet);
    }

    /* renamed from: MotionLayoutCore$lambda-16 */
    public static final boolean m13984MotionLayoutCore$lambda16(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* renamed from: MotionLayoutCore$lambda-26 */
    public static final float m13986MotionLayoutCore$lambda26(MutableState<Float> mutableState) {
        return mutableState.getValue().floatValue();
    }

    /* compiled from: MotionLayout.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 5, 1}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.constraintlayout.compose.MotionLayoutKt$MotionLayoutCore$2", m7120f = "MotionLayout.kt", m7121i = {}, m7122l = {237, 247}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: androidx.constraintlayout.compose.MotionLayoutKt$MotionLayoutCore$2 */
    /* loaded from: classes2.dex */
    public static final class C21202 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ MutableState<Boolean> $animateToEnd$delegate;
        public final /* synthetic */ AnimationSpec<Float> $animationSpec;
        public final /* synthetic */ Channel<ConstraintSet> $channel;
        public final /* synthetic */ MutableState<ConstraintSet> $end$delegate;
        public final /* synthetic */ Function0<Unit> $finishedAnimationListener;
        public final /* synthetic */ Animatable<Float, AnimationVector1D> $progress;
        public final /* synthetic */ MutableState<ConstraintSet> $start$delegate;
        public Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21202(Channel<ConstraintSet> channel, Animatable<Float, AnimationVector1D> animatable, AnimationSpec<Float> animationSpec, Function0<Unit> function0, MutableState<Boolean> mutableState, MutableState<ConstraintSet> mutableState2, MutableState<ConstraintSet> mutableState3, Continuation<? super C21202> continuation) {
            super(2, continuation);
            this.$channel = channel;
            this.$progress = animatable;
            this.$animationSpec = animationSpec;
            this.$finishedAnimationListener = function0;
            this.$animateToEnd$delegate = mutableState;
            this.$start$delegate = mutableState2;
            this.$end$delegate = mutableState3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C21202(this.$channel, this.$progress, this.$animationSpec, this.$finishedAnimationListener, this.$animateToEnd$delegate, this.$start$delegate, this.$end$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C21202) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:60:0x003c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0045  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x00bf  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x00c7  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x00ae -> B:85:0x00af). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:89:0x00c4 -> B:58:0x0032). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            ChannelIterator<ConstraintSet> it;
            Object objHasNext;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                it = this.$channel.iterator();
                this.L$0 = it;
                this.label = 1;
                objHasNext = it.hasNext(this);
                if (objHasNext == coroutine_suspended) {
                }
                ChannelIterator<ConstraintSet> channelIterator = it;
                if (((Boolean) objHasNext).booleanValue()) {
                }
            } else if (i == 1) {
                it = (ChannelIterator) this.L$0;
                ResultKt.throwOnFailure(obj);
                objHasNext = obj;
                ChannelIterator<ConstraintSet> channelIterator2 = it;
                if (((Boolean) objHasNext).booleanValue()) {
                }
            } else if (i == 2) {
                it = (ChannelIterator) this.L$0;
                ResultKt.throwOnFailure(obj);
                MotionLayoutKt.m13985MotionLayoutCore$lambda17(this.$animateToEnd$delegate, !MotionLayoutKt.m13984MotionLayoutCore$lambda16(r1));
                Function0<Unit> function0 = this.$finishedAnimationListener;
                if (function0 != null) {
                    function0.invoke();
                }
                this.L$0 = it;
                this.label = 1;
                objHasNext = it.hasNext(this);
                if (objHasNext == coroutine_suspended) {
                    return coroutine_suspended;
                }
                ChannelIterator<ConstraintSet> channelIterator22 = it;
                if (((Boolean) objHasNext).booleanValue()) {
                    ConstraintSet next = channelIterator22.next();
                    ConstraintSet constraintSet = (ConstraintSet) ChannelResult.m17216getOrNullimpl(this.$channel.mo17206tryReceivePtdJZtk());
                    if (constraintSet != null) {
                        next = constraintSet;
                    }
                    float f = MotionLayoutKt.m13984MotionLayoutCore$lambda16(this.$animateToEnd$delegate) ? 1.0f : 0.0f;
                    if (Intrinsics.areEqual(next, MotionLayoutKt.m13984MotionLayoutCore$lambda16(this.$animateToEnd$delegate) ? MotionLayoutKt.m13988MotionLayoutCore$lambda8(this.$start$delegate) : MotionLayoutKt.m13982MotionLayoutCore$lambda11(this.$end$delegate))) {
                        it = channelIterator22;
                        this.L$0 = it;
                        this.label = 1;
                        objHasNext = it.hasNext(this);
                        if (objHasNext == coroutine_suspended) {
                        }
                        ChannelIterator<ConstraintSet> channelIterator222 = it;
                        if (((Boolean) objHasNext).booleanValue()) {
                            return Unit.INSTANCE;
                        }
                    } else {
                        if (MotionLayoutKt.m13984MotionLayoutCore$lambda16(this.$animateToEnd$delegate)) {
                            MotionLayoutKt.m13983MotionLayoutCore$lambda12(this.$end$delegate, next);
                        } else {
                            MotionLayoutKt.m13989MotionLayoutCore$lambda9(this.$start$delegate, next);
                        }
                        Animatable<Float, AnimationVector1D> animatable = this.$progress;
                        Float fBoxFloat = Boxing.boxFloat(f);
                        AnimationSpec<Float> animationSpec = this.$animationSpec;
                        this.L$0 = channelIterator222;
                        this.label = 2;
                        if (Animatable.animateTo$default(animatable, fBoxFloat, animationSpec, null, null, this, 12, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        it = channelIterator222;
                        MotionLayoutKt.m13985MotionLayoutCore$lambda17(this.$animateToEnd$delegate, !MotionLayoutKt.m13984MotionLayoutCore$lambda16(r1));
                        Function0<Unit> function02 = this.$finishedAnimationListener;
                        if (function02 != null) {
                        }
                        this.L$0 = it;
                        this.label = 1;
                        objHasNext = it.hasNext(this);
                        if (objHasNext == coroutine_suspended) {
                        }
                        ChannelIterator<ConstraintSet> channelIterator2222 = it;
                        if (((Boolean) objHasNext).booleanValue()) {
                        }
                    }
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }
}
