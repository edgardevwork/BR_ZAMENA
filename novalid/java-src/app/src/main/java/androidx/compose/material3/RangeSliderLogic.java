package androidx.compose.material3;

import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.apache.ivy.plugins.parser.p064m2.PomReader;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Slider.kt */
@Metadata(m7104d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fJ&\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0013R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001b"}, m7105d2 = {"Landroidx/compose/material3/RangeSliderLogic;", "", "state", "Landroidx/compose/material3/RangeSliderState;", "startInteractionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "endInteractionSource", "(Landroidx/compose/material3/RangeSliderState;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/interaction/MutableInteractionSource;)V", "getEndInteractionSource", "()Landroidx/compose/foundation/interaction/MutableInteractionSource;", "getStartInteractionSource", "getState", "()Landroidx/compose/material3/RangeSliderState;", "activeInteraction", "draggingStart", "", "captureThumb", "", "posX", "", "interaction", "Landroidx/compose/foundation/interaction/Interaction;", PomReader.SCOPE, "Lkotlinx/coroutines/CoroutineScope;", "compareOffsets", "", "eventX", "material3_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public final class RangeSliderLogic {

    @NotNull
    public final MutableInteractionSource endInteractionSource;

    @NotNull
    public final MutableInteractionSource startInteractionSource;

    @NotNull
    public final RangeSliderState state;

    public RangeSliderLogic(@NotNull RangeSliderState rangeSliderState, @NotNull MutableInteractionSource mutableInteractionSource, @NotNull MutableInteractionSource mutableInteractionSource2) {
        this.state = rangeSliderState;
        this.startInteractionSource = mutableInteractionSource;
        this.endInteractionSource = mutableInteractionSource2;
    }

    @NotNull
    public final RangeSliderState getState() {
        return this.state;
    }

    @NotNull
    public final MutableInteractionSource getStartInteractionSource() {
        return this.startInteractionSource;
    }

    @NotNull
    public final MutableInteractionSource getEndInteractionSource() {
        return this.endInteractionSource;
    }

    @NotNull
    public final MutableInteractionSource activeInteraction(boolean draggingStart) {
        return draggingStart ? this.startInteractionSource : this.endInteractionSource;
    }

    public final int compareOffsets(float eventX) {
        return Float.compare(Math.abs(this.state.getRawOffsetStart$material3_release() - eventX), Math.abs(this.state.getRawOffsetEnd$material3_release() - eventX));
    }

    public final void captureThumb(boolean draggingStart, float posX, @NotNull Interaction interaction, @NotNull CoroutineScope scope) {
        RangeSliderState rangeSliderState = this.state;
        rangeSliderState.onDrag$material3_release(draggingStart, posX - (draggingStart ? rangeSliderState.getRawOffsetStart$material3_release() : rangeSliderState.getRawOffsetEnd$material3_release()));
        BuildersKt__Builders_commonKt.launch$default(scope, null, null, new C15531(draggingStart, interaction, null), 3, null);
    }

    /* compiled from: Slider.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.material3.RangeSliderLogic$captureThumb$1", m7120f = "Slider.kt", m7121i = {}, m7122l = {1580}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: androidx.compose.material3.RangeSliderLogic$captureThumb$1 */
    public static final class C15531 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ boolean $draggingStart;
        public final /* synthetic */ Interaction $interaction;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15531(boolean z, Interaction interaction, Continuation<? super C15531> continuation) {
            super(2, continuation);
            this.$draggingStart = z;
            this.$interaction = interaction;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return RangeSliderLogic.this.new C15531(this.$draggingStart, this.$interaction, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C15531) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableInteractionSource mutableInteractionSourceActiveInteraction = RangeSliderLogic.this.activeInteraction(this.$draggingStart);
                Interaction interaction = this.$interaction;
                this.label = 1;
                if (mutableInteractionSourceActiveInteraction.emit(interaction, this) == coroutine_suspended) {
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
}
