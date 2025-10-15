package com.blackhub.bronline.game.gui.chooseserver;

import androidx.media3.extractor.p007ts.H262Reader;
import com.blackhub.bronline.game.gui.chooseserver.ChooseServerGuiFragment;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ChooseServerGuiFragment.kt */
@Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
@DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.chooseserver.ChooseServerGuiFragment$setObservers$4$1", m7120f = "ChooseServerGuiFragment.kt", m7121i = {0}, m7122l = {H262Reader.START_GROUP}, m7123m = "emit", m7124n = {"this"}, m7125s = {"L$0"})
/* loaded from: classes3.dex */
public final class ChooseServerGuiFragment$setObservers$4$1$emit$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ChooseServerGuiFragment.C38304.AnonymousClass1<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChooseServerGuiFragment$setObservers$4$1$emit$1(ChooseServerGuiFragment.C38304.AnonymousClass1<? super T> anonymousClass1, Continuation<? super ChooseServerGuiFragment$setObservers$4$1$emit$1> continuation) {
        super(continuation);
        this.this$0 = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(0, this);
    }
}
