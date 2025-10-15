package com.blackhub.bronline.game.p019ui.minigameshelper;

import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MovingVerticalLine.kt */
@Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
@DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.minigameshelper.MovingVerticalLineKt$MovingVerticalLine$1$1", m7120f = "MovingVerticalLine.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
@SourceDebugExtension({"SMAP\nMovingVerticalLine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MovingVerticalLine.kt\ncom/blackhub/bronline/game/ui/minigameshelper/MovingVerticalLineKt$MovingVerticalLine$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,68:1\n92#2:69\n92#2:70\n75#2:71\n51#2:72\n*S KotlinDebug\n*F\n+ 1 MovingVerticalLine.kt\ncom/blackhub/bronline/game/ui/minigameshelper/MovingVerticalLineKt$MovingVerticalLine$1$1\n*L\n42#1:69\n43#1:70\n43#1:71\n43#1:72\n*E\n"})
/* loaded from: classes7.dex */
public final class MovingVerticalLineKt$MovingVerticalLine$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ float $chunk;
    public final /* synthetic */ MutableState<Boolean> $isLineHit;
    public final /* synthetic */ float $lineWidth;
    public final /* synthetic */ int $randomNum;
    public final /* synthetic */ MutableState<C2046Dp> $xPosition$delegate;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovingVerticalLineKt$MovingVerticalLine$1$1(MutableState<Boolean> mutableState, float f, int i, float f2, MutableState<C2046Dp> mutableState2, Continuation<? super MovingVerticalLineKt$MovingVerticalLine$1$1> continuation) {
        super(2, continuation);
        this.$isLineHit = mutableState;
        this.$chunk = f;
        this.$randomNum = i;
        this.$lineWidth = f2;
        this.$xPosition$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new MovingVerticalLineKt$MovingVerticalLine$1$1(this.$isLineHit, this.$chunk, this.$randomNum, this.$lineWidth, this.$xPosition$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((MovingVerticalLineKt$MovingVerticalLine$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        float f = 100;
        this.$isLineHit.setValue(Boxing.boxBoolean(C2046Dp.m13665compareTo0680j_4(MovingVerticalLineKt.MovingVerticalLine_36lltbM$lambda$1(this.$xPosition$delegate), C2046Dp.m13666constructorimpl(this.$chunk * f)) >= 0 && C2046Dp.m13665compareTo0680j_4(MovingVerticalLineKt.MovingVerticalLine_36lltbM$lambda$1(this.$xPosition$delegate), C2046Dp.m13666constructorimpl(C2046Dp.m13666constructorimpl(C2046Dp.m13666constructorimpl(this.$chunk * f) * ((float) this.$randomNum)) + C2046Dp.m13666constructorimpl(this.$lineWidth / ((float) 4)))) <= 0));
        return Unit.INSTANCE;
    }
}
