package com.blackhub.bronline.game.p019ui.interactionwithnpc;

import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.p003ui.text.SpanStyle;
import androidx.compose.runtime.MutableLongState;
import androidx.compose.runtime.MutableState;
import com.blackhub.bronline.game.gui.interactionwithnpc.InteractionWithNpcContants;
import java.util.Iterator;
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
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: InteractionWithNpcGui.kt */
@DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.interactionwithnpc.InteractionWithNpcGuiKt$InteractionWithNpcGUIContent$1$1", m7120f = "InteractionWithNpcGui.kt", m7121i = {0, 0}, m7122l = {162}, m7123m = "invokeSuspend", m7124n = {"builder", "i"}, m7125s = {"L$0", "I$0"})
@SourceDebugExtension({"SMAP\nInteractionWithNpcGui.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InteractionWithNpcGui.kt\ncom/blackhub/bronline/game/ui/interactionwithnpc/InteractionWithNpcGuiKt$InteractionWithNpcGUIContent$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,421:1\n1855#2,2:422\n*S KotlinDebug\n*F\n+ 1 InteractionWithNpcGui.kt\ncom/blackhub/bronline/game/ui/interactionwithnpc/InteractionWithNpcGuiKt$InteractionWithNpcGUIContent$1$1\n*L\n151#1:422,2\n*E\n"})
/* loaded from: classes7.dex */
public final class InteractionWithNpcGuiKt$InteractionWithNpcGUIContent$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ AnnotatedString $descText;
    public final /* synthetic */ MutableState<AnnotatedString> $descTextAnimated$delegate;
    public final /* synthetic */ MutableState<Boolean> $isWroteText$delegate;
    public final /* synthetic */ long $visibleDelay;
    public final /* synthetic */ MutableLongState $visibleDelayFinalValue$delegate;
    public int I$0;
    public int I$1;
    public Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InteractionWithNpcGuiKt$InteractionWithNpcGUIContent$1$1(long j, AnnotatedString annotatedString, MutableState<AnnotatedString> mutableState, MutableLongState mutableLongState, MutableState<Boolean> mutableState2, Continuation<? super InteractionWithNpcGuiKt$InteractionWithNpcGUIContent$1$1> continuation) {
        super(2, continuation);
        this.$visibleDelay = j;
        this.$descText = annotatedString;
        this.$descTextAnimated$delegate = mutableState;
        this.$visibleDelayFinalValue$delegate = mutableLongState;
        this.$isWroteText$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new InteractionWithNpcGuiKt$InteractionWithNpcGUIContent$1$1(this.$visibleDelay, this.$descText, this.$descTextAnimated$delegate, this.$visibleDelayFinalValue$delegate, this.$isWroteText$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((InteractionWithNpcGuiKt$InteractionWithNpcGUIContent$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00cf  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00c9 -> B:24:0x00cc). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        int length;
        AnnotatedString.Builder builder;
        int i;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        byte b = 0;
        int i3 = 1;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            AnnotatedString.Builder builder2 = new AnnotatedString.Builder(b == true ? 1 : 0, i3, null);
            this.$descTextAnimated$delegate.setValue(builder2.toAnnotatedString());
            this.$visibleDelayFinalValue$delegate.setLongValue(this.$visibleDelay);
            InteractionWithNpcGuiKt.InteractionWithNpcGUIContent$lambda$9(this.$isWroteText$delegate, false);
            length = this.$descText.length();
            builder = builder2;
            i = 0;
            if (i < length) {
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            length = this.I$1;
            i = this.I$0;
            builder = (AnnotatedString.Builder) this.L$0;
            ResultKt.throwOnFailure(obj);
            i++;
            if (i < length) {
                builder.append(this.$descText.getText().charAt(i));
                Iterator<T> it = this.$descText.getSpanStyles().iterator();
                while (it.hasNext()) {
                    AnnotatedString.Range range = (AnnotatedString.Range) it.next();
                    int start = range.getStart();
                    if (i < range.getEnd() && start <= i) {
                        builder.addStyle((SpanStyle) range.getItem(), range.getStart(), i + 1);
                    }
                }
                this.$descTextAnimated$delegate.setValue(builder.toAnnotatedString());
                long longValue = InteractionWithNpcContants.INSTANCE.getSymbolsWithDoubleDelay().contains(Boxing.boxChar(this.$descText.getText().charAt(i))) ? this.$visibleDelayFinalValue$delegate.getLongValue() * 2 : this.$visibleDelayFinalValue$delegate.getLongValue();
                this.L$0 = builder;
                this.I$0 = i;
                this.I$1 = length;
                this.label = 1;
                if (DelayKt.delay(longValue, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i++;
                if (i < length) {
                    InteractionWithNpcGuiKt.InteractionWithNpcGUIContent$lambda$9(this.$isWroteText$delegate, this.$descText.length() == InteractionWithNpcGuiKt.InteractionWithNpcGUIContent$lambda$2(this.$descTextAnimated$delegate).length());
                    return Unit.INSTANCE;
                }
            }
        }
    }
}

