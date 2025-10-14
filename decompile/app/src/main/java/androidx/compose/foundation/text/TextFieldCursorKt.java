package androidx.compose.foundation.text;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.KeyframesSpec;
import androidx.compose.p003ui.ComposedModifierKt;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.DrawModifierKt;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.geometry.Rect;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.SolidColor;
import androidx.compose.p003ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p003ui.graphics.drawscope.DrawScope;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.TextRange;
import androidx.compose.p003ui.text.input.OffsetMapping;
import androidx.compose.p003ui.text.input.TextFieldValue;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import com.blackhub.bronline.game.gui.donate.adapters.DonateHeaderOrFooterAdapterKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TextFieldCursor.kt */
@Metadata(m7104d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a4\u0010\b\u001a\u00020\t*\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0000\"\u0016\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m7105d2 = {"DefaultCursorThickness", "Landroidx/compose/ui/unit/Dp;", "getDefaultCursorThickness", "()F", "F", "cursorAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "cursor", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/text/TextFieldState;", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "offsetMapping", "Landroidx/compose/ui/text/input/OffsetMapping;", "cursorBrush", "Landroidx/compose/ui/graphics/Brush;", "enabled", "", "foundation_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nTextFieldCursor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldCursor.kt\nandroidx/compose/foundation/text/TextFieldCursorKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,103:1\n154#2:104\n*S KotlinDebug\n*F\n+ 1 TextFieldCursor.kt\nandroidx/compose/foundation/text/TextFieldCursorKt\n*L\n97#1:104\n*E\n"})
/* loaded from: classes4.dex */
public final class TextFieldCursorKt {

    @NotNull
    private static final AnimationSpec<Float> cursorAnimationSpec = AnimationSpecKt.m7688infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.foundation.text.TextFieldCursorKt$cursorAnimationSpec$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
            invoke2(keyframesSpecConfig);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
            keyframesSpecConfig.setDurationMillis(1000);
            Float fValueOf = Float.valueOf(1.0f);
            keyframesSpecConfig.mo33at((KeyframesSpec.KeyframesSpecConfig<Float>) fValueOf, 0);
            keyframesSpecConfig.mo33at((KeyframesSpec.KeyframesSpecConfig<Float>) fValueOf, DonateHeaderOrFooterAdapterKt.SCREEN_SIZE_MAX_1);
            Float fValueOf2 = Float.valueOf(0.0f);
            keyframesSpecConfig.mo33at((KeyframesSpec.KeyframesSpecConfig<Float>) fValueOf2, 500);
            keyframesSpecConfig.mo33at((KeyframesSpec.KeyframesSpecConfig<Float>) fValueOf2, 999);
        }
    }), null, 0, 6, null);
    private static final float DefaultCursorThickness = C2046Dp.m13666constructorimpl(2);

    /* compiled from: TextFieldCursor.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m7105d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nTextFieldCursor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldCursor.kt\nandroidx/compose/foundation/text/TextFieldCursorKt$cursor$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,103:1\n25#2:104\n1116#3,6:105\n652#4:111\n*S KotlinDebug\n*F\n+ 1 TextFieldCursor.kt\nandroidx/compose/foundation/text/TextFieldCursorKt$cursor$1\n*L\n46#1:104\n46#1:105,6\n47#1:111\n*E\n"})
    /* renamed from: androidx.compose.foundation.text.TextFieldCursorKt$cursor$1 */
    /* loaded from: classes.dex */
    public static final class C08351 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
        public final /* synthetic */ OffsetMapping $offsetMapping;
        public final /* synthetic */ TextFieldState $state;
        public final /* synthetic */ TextFieldValue $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08351(TextFieldState textFieldState, TextFieldValue textFieldValue, OffsetMapping offsetMapping) {
            super(3);
            textFieldState = textFieldState;
            textFieldValue = textFieldValue;
            offsetMapping = offsetMapping;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            return invoke(modifier, composer, num.intValue());
        }

        @Composable
        @NotNull
        public final Modifier invoke(@NotNull Modifier modifier, @Nullable Composer composer, int i) {
            Modifier modifierDrawWithContent;
            composer.startReplaceableGroup(1634330012);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1634330012, i, -1, "androidx.compose.foundation.text.cursor.<anonymous> (TextFieldCursor.kt:45)");
            }
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = AnimatableKt.Animatable$default(1.0f, 0.0f, 2, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            Animatable animatable = (Animatable) objRememberedValue;
            Brush brush = brush;
            boolean z = ((brush instanceof SolidColor) && ((SolidColor) brush).getValue() == Color.INSTANCE.m11376getUnspecified0d7_KjU()) ? false : true;
            if (textFieldState.getHasFocus() && TextRange.m13159getCollapsedimpl(textFieldValue.getSelection()) && z) {
                EffectsKt.LaunchedEffect(textFieldValue.getText(), TextRange.m13153boximpl(textFieldValue.getSelection()), new AnonymousClass1(animatable, null), composer, 512);
                modifierDrawWithContent = DrawModifierKt.drawWithContent(modifier, new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.foundation.text.TextFieldCursorKt.cursor.1.2
                    public final /* synthetic */ Animatable<Float, AnimationVector1D> $cursorAlpha;
                    public final /* synthetic */ Brush $cursorBrush;
                    public final /* synthetic */ OffsetMapping $offsetMapping;
                    public final /* synthetic */ TextFieldState $state;
                    public final /* synthetic */ TextFieldValue $value;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass2(Animatable<Float, AnimationVector1D> animatable2, OffsetMapping offsetMapping, TextFieldValue textFieldValue, TextFieldState textFieldState, Brush brush2) {
                        super(1);
                        animatable = animatable2;
                        offsetMapping = offsetMapping;
                        textFieldValue = textFieldValue;
                        textFieldState = textFieldState;
                        brush = brush2;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                        invoke2(contentDrawScope);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke */
                    public final void invoke2(@NotNull ContentDrawScope contentDrawScope) {
                        Rect rect;
                        TextLayoutResult value;
                        contentDrawScope.drawContent();
                        float fCoerceIn = RangesKt___RangesKt.coerceIn(animatable.getValue().floatValue(), 0.0f, 1.0f);
                        if (fCoerceIn == 0.0f) {
                            return;
                        }
                        int iOriginalToTransformed = offsetMapping.originalToTransformed(TextRange.m13165getStartimpl(textFieldValue.getSelection()));
                        TextLayoutResultProxy layoutResult = textFieldState.getLayoutResult();
                        if (layoutResult == null || (value = layoutResult.getValue()) == null || (rect = value.getCursorRect(iOriginalToTransformed)) == null) {
                            rect = new Rect(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                        float fMo7874toPx0680j_4 = contentDrawScope.mo7874toPx0680j_4(TextFieldCursorKt.getDefaultCursorThickness());
                        float f = fMo7874toPx0680j_4 / 2;
                        float fCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(RangesKt___RangesKt.coerceAtMost(rect.getLeft() + f, Size.m11168getWidthimpl(contentDrawScope.mo11889getSizeNHjbRc()) - f), f);
                        DrawScope.m11875drawLine1RTmtNc$default(contentDrawScope, brush, OffsetKt.Offset(fCoerceAtLeast, rect.getTop()), OffsetKt.Offset(fCoerceAtLeast, rect.getBottom()), fMo7874toPx0680j_4, 0, null, fCoerceIn, null, 0, 432, null);
                    }
                });
            } else {
                modifierDrawWithContent = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return modifierDrawWithContent;
        }

        /* compiled from: TextFieldCursor.kt */
        @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
        @DebugMetadata(m7119c = "androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$1", m7120f = "TextFieldCursor.kt", m7121i = {}, m7122l = {51}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
        /* renamed from: androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$1 */
        /* loaded from: classes2.dex */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ Animatable<Float, AnimationVector1D> $cursorAlpha;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(Animatable<Float, AnimationVector1D> animatable, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$cursorAlpha = animatable;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new AnonymousClass1(this.$cursorAlpha, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    FixedMotionDurationScale fixedMotionDurationScale = FixedMotionDurationScale.INSTANCE;
                    C118421 c118421 = new C118421(this.$cursorAlpha, null);
                    this.label = 1;
                    if (BuildersKt.withContext(fixedMotionDurationScale, c118421, this) == coroutine_suspended) {
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

            /* compiled from: TextFieldCursor.kt */
            @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
            @DebugMetadata(m7119c = "androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$1$1", m7120f = "TextFieldCursor.kt", m7121i = {}, m7122l = {53, 55}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
            /* renamed from: androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$1$1 */
            public static final class C118421 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                public final /* synthetic */ Animatable<Float, AnimationVector1D> $cursorAlpha;
                public int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C118421(Animatable<Float, AnimationVector1D> animatable, Continuation<? super C118421> continuation) {
                    super(2, continuation);
                    this.$cursorAlpha = animatable;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new C118421(this.$cursorAlpha, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                    return ((C118421) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                    Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        Animatable<Float, AnimationVector1D> animatable = this.$cursorAlpha;
                        Float fBoxFloat = Boxing.boxFloat(1.0f);
                        this.label = 1;
                        if (animatable.snapTo(fBoxFloat, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    Animatable<Float, AnimationVector1D> animatable2 = this.$cursorAlpha;
                    Float fBoxFloat2 = Boxing.boxFloat(0.0f);
                    AnimationSpec animationSpec = TextFieldCursorKt.cursorAnimationSpec;
                    this.label = 2;
                    if (Animatable.animateTo$default(animatable2, fBoxFloat2, animationSpec, null, null, this, 12, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                }
            }
        }

        /* compiled from: TextFieldCursor.kt */
        @Metadata(m7104d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m7105d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
        /* renamed from: androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$2 */
        public static final class AnonymousClass2 extends Lambda implements Function1<ContentDrawScope, Unit> {
            public final /* synthetic */ Animatable<Float, AnimationVector1D> $cursorAlpha;
            public final /* synthetic */ Brush $cursorBrush;
            public final /* synthetic */ OffsetMapping $offsetMapping;
            public final /* synthetic */ TextFieldState $state;
            public final /* synthetic */ TextFieldValue $value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(Animatable<Float, AnimationVector1D> animatable2, OffsetMapping offsetMapping, TextFieldValue textFieldValue, TextFieldState textFieldState, Brush brush2) {
                super(1);
                animatable = animatable2;
                offsetMapping = offsetMapping;
                textFieldValue = textFieldValue;
                textFieldState = textFieldState;
                brush = brush2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                invoke2(contentDrawScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2(@NotNull ContentDrawScope contentDrawScope) {
                Rect rect;
                TextLayoutResult value;
                contentDrawScope.drawContent();
                float fCoerceIn = RangesKt___RangesKt.coerceIn(animatable.getValue().floatValue(), 0.0f, 1.0f);
                if (fCoerceIn == 0.0f) {
                    return;
                }
                int iOriginalToTransformed = offsetMapping.originalToTransformed(TextRange.m13165getStartimpl(textFieldValue.getSelection()));
                TextLayoutResultProxy layoutResult = textFieldState.getLayoutResult();
                if (layoutResult == null || (value = layoutResult.getValue()) == null || (rect = value.getCursorRect(iOriginalToTransformed)) == null) {
                    rect = new Rect(0.0f, 0.0f, 0.0f, 0.0f);
                }
                float fMo7874toPx0680j_4 = contentDrawScope.mo7874toPx0680j_4(TextFieldCursorKt.getDefaultCursorThickness());
                float f = fMo7874toPx0680j_4 / 2;
                float fCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(RangesKt___RangesKt.coerceAtMost(rect.getLeft() + f, Size.m11168getWidthimpl(contentDrawScope.mo11889getSizeNHjbRc()) - f), f);
                DrawScope.m11875drawLine1RTmtNc$default(contentDrawScope, brush, OffsetKt.Offset(fCoerceAtLeast, rect.getTop()), OffsetKt.Offset(fCoerceAtLeast, rect.getBottom()), fMo7874toPx0680j_4, 0, null, fCoerceIn, null, 0, 432, null);
            }
        }
    }

    @NotNull
    public static final Modifier cursor(@NotNull Modifier modifier, @NotNull TextFieldState textFieldState, @NotNull TextFieldValue textFieldValue, @NotNull OffsetMapping offsetMapping, @NotNull Brush brush, boolean z) {
        return z ? ComposedModifierKt.composed$default(modifier, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.text.TextFieldCursorKt.cursor.1
            public final /* synthetic */ OffsetMapping $offsetMapping;
            public final /* synthetic */ TextFieldState $state;
            public final /* synthetic */ TextFieldValue $value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C08351(TextFieldState textFieldState2, TextFieldValue textFieldValue2, OffsetMapping offsetMapping2) {
                super(3);
                textFieldState = textFieldState2;
                textFieldValue = textFieldValue2;
                offsetMapping = offsetMapping2;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier modifier2, @Nullable Composer composer, int i) {
                Modifier modifierDrawWithContent;
                composer.startReplaceableGroup(1634330012);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1634330012, i, -1, "androidx.compose.foundation.text.cursor.<anonymous> (TextFieldCursor.kt:45)");
                }
                composer.startReplaceableGroup(-492369756);
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = AnimatableKt.Animatable$default(1.0f, 0.0f, 2, null);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                Animatable<Float, AnimationVector1D> animatable2 = (Animatable) objRememberedValue;
                Brush brush2 = brush;
                boolean z2 = ((brush2 instanceof SolidColor) && ((SolidColor) brush2).getValue() == Color.INSTANCE.m11376getUnspecified0d7_KjU()) ? false : true;
                if (textFieldState.getHasFocus() && TextRange.m13159getCollapsedimpl(textFieldValue.getSelection()) && z2) {
                    EffectsKt.LaunchedEffect(textFieldValue.getText(), TextRange.m13153boximpl(textFieldValue.getSelection()), new AnonymousClass1(animatable2, null), composer, 512);
                    modifierDrawWithContent = DrawModifierKt.drawWithContent(modifier2, new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.foundation.text.TextFieldCursorKt.cursor.1.2
                        public final /* synthetic */ Animatable<Float, AnimationVector1D> $cursorAlpha;
                        public final /* synthetic */ Brush $cursorBrush;
                        public final /* synthetic */ OffsetMapping $offsetMapping;
                        public final /* synthetic */ TextFieldState $state;
                        public final /* synthetic */ TextFieldValue $value;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass2(Animatable<Float, AnimationVector1D> animatable22, OffsetMapping offsetMapping2, TextFieldValue textFieldValue2, TextFieldState textFieldState2, Brush brush22) {
                            super(1);
                            animatable = animatable22;
                            offsetMapping = offsetMapping2;
                            textFieldValue = textFieldValue2;
                            textFieldState = textFieldState2;
                            brush = brush22;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                            invoke2(contentDrawScope);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke */
                        public final void invoke2(@NotNull ContentDrawScope contentDrawScope) {
                            Rect rect;
                            TextLayoutResult value;
                            contentDrawScope.drawContent();
                            float fCoerceIn = RangesKt___RangesKt.coerceIn(animatable.getValue().floatValue(), 0.0f, 1.0f);
                            if (fCoerceIn == 0.0f) {
                                return;
                            }
                            int iOriginalToTransformed = offsetMapping.originalToTransformed(TextRange.m13165getStartimpl(textFieldValue.getSelection()));
                            TextLayoutResultProxy layoutResult = textFieldState.getLayoutResult();
                            if (layoutResult == null || (value = layoutResult.getValue()) == null || (rect = value.getCursorRect(iOriginalToTransformed)) == null) {
                                rect = new Rect(0.0f, 0.0f, 0.0f, 0.0f);
                            }
                            float fMo7874toPx0680j_4 = contentDrawScope.mo7874toPx0680j_4(TextFieldCursorKt.getDefaultCursorThickness());
                            float f = fMo7874toPx0680j_4 / 2;
                            float fCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(RangesKt___RangesKt.coerceAtMost(rect.getLeft() + f, Size.m11168getWidthimpl(contentDrawScope.mo11889getSizeNHjbRc()) - f), f);
                            DrawScope.m11875drawLine1RTmtNc$default(contentDrawScope, brush, OffsetKt.Offset(fCoerceAtLeast, rect.getTop()), OffsetKt.Offset(fCoerceAtLeast, rect.getBottom()), fMo7874toPx0680j_4, 0, null, fCoerceIn, null, 0, 432, null);
                        }
                    });
                } else {
                    modifierDrawWithContent = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return modifierDrawWithContent;
            }

            /* compiled from: TextFieldCursor.kt */
            @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
            @DebugMetadata(m7119c = "androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$1", m7120f = "TextFieldCursor.kt", m7121i = {}, m7122l = {51}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
            /* renamed from: androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$1 */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                public final /* synthetic */ Animatable<Float, AnimationVector1D> $cursorAlpha;
                public int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(Animatable<Float, AnimationVector1D> animatable, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$cursorAlpha = animatable;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new AnonymousClass1(this.$cursorAlpha, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                    Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        FixedMotionDurationScale fixedMotionDurationScale = FixedMotionDurationScale.INSTANCE;
                        C118421 c118421 = new C118421(this.$cursorAlpha, null);
                        this.label = 1;
                        if (BuildersKt.withContext(fixedMotionDurationScale, c118421, this) == coroutine_suspended) {
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

                /* compiled from: TextFieldCursor.kt */
                @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
                @DebugMetadata(m7119c = "androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$1$1", m7120f = "TextFieldCursor.kt", m7121i = {}, m7122l = {53, 55}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
                /* renamed from: androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$1$1 */
                public static final class C118421 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    public final /* synthetic */ Animatable<Float, AnimationVector1D> $cursorAlpha;
                    public int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C118421(Animatable<Float, AnimationVector1D> animatable, Continuation<? super C118421> continuation) {
                        super(2, continuation);
                        this.$cursorAlpha = animatable;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                        return new C118421(this.$cursorAlpha, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    @Nullable
                    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                        return ((C118421) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            Animatable<Float, AnimationVector1D> animatable = this.$cursorAlpha;
                            Float fBoxFloat = Boxing.boxFloat(1.0f);
                            this.label = 1;
                            if (animatable.snapTo(fBoxFloat, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i != 1) {
                                if (i != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                                return Unit.INSTANCE;
                            }
                            ResultKt.throwOnFailure(obj);
                        }
                        Animatable<Float, AnimationVector1D> animatable2 = this.$cursorAlpha;
                        Float fBoxFloat2 = Boxing.boxFloat(0.0f);
                        AnimationSpec animationSpec = TextFieldCursorKt.cursorAnimationSpec;
                        this.label = 2;
                        if (Animatable.animateTo$default(animatable2, fBoxFloat2, animationSpec, null, null, this, 12, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                }
            }

            /* compiled from: TextFieldCursor.kt */
            @Metadata(m7104d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m7105d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
            /* renamed from: androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$2 */
            public static final class AnonymousClass2 extends Lambda implements Function1<ContentDrawScope, Unit> {
                public final /* synthetic */ Animatable<Float, AnimationVector1D> $cursorAlpha;
                public final /* synthetic */ Brush $cursorBrush;
                public final /* synthetic */ OffsetMapping $offsetMapping;
                public final /* synthetic */ TextFieldState $state;
                public final /* synthetic */ TextFieldValue $value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(Animatable<Float, AnimationVector1D> animatable22, OffsetMapping offsetMapping2, TextFieldValue textFieldValue2, TextFieldState textFieldState2, Brush brush22) {
                    super(1);
                    animatable = animatable22;
                    offsetMapping = offsetMapping2;
                    textFieldValue = textFieldValue2;
                    textFieldState = textFieldState2;
                    brush = brush22;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                    invoke2(contentDrawScope);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke */
                public final void invoke2(@NotNull ContentDrawScope contentDrawScope) {
                    Rect rect;
                    TextLayoutResult value;
                    contentDrawScope.drawContent();
                    float fCoerceIn = RangesKt___RangesKt.coerceIn(animatable.getValue().floatValue(), 0.0f, 1.0f);
                    if (fCoerceIn == 0.0f) {
                        return;
                    }
                    int iOriginalToTransformed = offsetMapping.originalToTransformed(TextRange.m13165getStartimpl(textFieldValue.getSelection()));
                    TextLayoutResultProxy layoutResult = textFieldState.getLayoutResult();
                    if (layoutResult == null || (value = layoutResult.getValue()) == null || (rect = value.getCursorRect(iOriginalToTransformed)) == null) {
                        rect = new Rect(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    float fMo7874toPx0680j_4 = contentDrawScope.mo7874toPx0680j_4(TextFieldCursorKt.getDefaultCursorThickness());
                    float f = fMo7874toPx0680j_4 / 2;
                    float fCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(RangesKt___RangesKt.coerceAtMost(rect.getLeft() + f, Size.m11168getWidthimpl(contentDrawScope.mo11889getSizeNHjbRc()) - f), f);
                    DrawScope.m11875drawLine1RTmtNc$default(contentDrawScope, brush, OffsetKt.Offset(fCoerceAtLeast, rect.getTop()), OffsetKt.Offset(fCoerceAtLeast, rect.getBottom()), fMo7874toPx0680j_4, 0, null, fCoerceIn, null, 0, 432, null);
                }
            }
        }, 1, null) : modifier;
    }

    public static final float getDefaultCursorThickness() {
        return DefaultCursorThickness;
    }
}
