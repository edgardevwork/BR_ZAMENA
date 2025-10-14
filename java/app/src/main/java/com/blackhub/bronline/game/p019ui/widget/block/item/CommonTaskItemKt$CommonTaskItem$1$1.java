package com.blackhub.bronline.game.p019ui.widget.block.item;

import androidx.compose.runtime.MutableIntState;
import com.blackhub.bronline.game.core.utils.attachment.task.CommonTaskModel;
import com.blackhub.bronline.game.core.utils.attachment.task.CommonTaskState;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CommonTaskItem.kt */
@DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.widget.block.item.CommonTaskItemKt$CommonTaskItem$1$1", m7120f = "CommonTaskItem.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
/* loaded from: classes8.dex */
public final class CommonTaskItemKt$CommonTaskItem$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ MutableIntState $colorButton$delegate;
    public final /* synthetic */ MutableIntState $colorLine$delegate;
    public final /* synthetic */ MutableIntState $iconButton$delegate;
    public final /* synthetic */ CommonTaskModel $task;
    public int label;

    /* compiled from: CommonTaskItem.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CommonTaskState.values().length];
            try {
                iArr[CommonTaskState.GET_STATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CommonTaskState.TRACK_STATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CommonTaskState.UNAVAILABLE_STATE_2.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CommonTaskState.COMPLETED_STATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CommonTaskState.UNAVAILABLE_STATE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CommonTaskState.STOP_STATE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonTaskItemKt$CommonTaskItem$1$1(CommonTaskModel commonTaskModel, MutableIntState mutableIntState, MutableIntState mutableIntState2, MutableIntState mutableIntState3, Continuation<? super CommonTaskItemKt$CommonTaskItem$1$1> continuation) {
        super(2, continuation);
        this.$task = commonTaskModel;
        this.$colorLine$delegate = mutableIntState;
        this.$colorButton$delegate = mutableIntState2;
        this.$iconButton$delegate = mutableIntState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new CommonTaskItemKt$CommonTaskItem$1$1(this.$task, this.$colorLine$delegate, this.$colorButton$delegate, this.$iconButton$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((CommonTaskItemKt$CommonTaskItem$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        switch (WhenMappings.$EnumSwitchMapping$0[this.$task.getStateOfTask().ordinal()]) {
            case 1:
                this.$colorLine$delegate.setIntValue(R.color.yellow);
                this.$colorButton$delegate.setIntValue(R.color.yellow);
                this.$iconButton$delegate.setIntValue(R.drawable.ic_check_correct_white);
                break;
            case 2:
                int buttonType = this.$task.getButtonType();
                if (buttonType == 1 || buttonType == 6) {
                    this.$colorLine$delegate.setIntValue(R.color.black);
                    this.$colorButton$delegate.setIntValue(R.color.white);
                    this.$iconButton$delegate.setIntValue(R.drawable.ic_point);
                    break;
                } else {
                    this.$colorLine$delegate.setIntValue(R.color.black);
                    this.$colorButton$delegate.setIntValue(R.color.white);
                    this.$iconButton$delegate.setIntValue(0);
                    break;
                }
                break;
            case 3:
                this.$colorLine$delegate.setIntValue(R.color.white);
                this.$colorButton$delegate.setIntValue(R.color.white);
                this.$iconButton$delegate.setIntValue(R.drawable.ic_lock_close_fill);
                break;
            case 4:
                this.$colorLine$delegate.setIntValue(R.color.light_gray);
                this.$colorButton$delegate.setIntValue(R.color.light_gray);
                this.$iconButton$delegate.setIntValue(R.drawable.ic_check_correct_white);
                break;
            case 5:
                this.$colorLine$delegate.setIntValue(R.color.white);
                this.$colorButton$delegate.setIntValue(R.color.white);
                this.$iconButton$delegate.setIntValue(R.drawable.ic_lock_close_fill);
                break;
            case 6:
                this.$colorLine$delegate.setIntValue(R.color.dark_medium_green);
                this.$colorButton$delegate.setIntValue(R.color.white);
                this.$iconButton$delegate.setIntValue(R.drawable.ic_stop);
                break;
        }
        return Unit.INSTANCE;
    }
}

