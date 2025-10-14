package com.blackhub.bronline.game.gui.clicker;

import android.graphics.Bitmap;
import com.blackhub.bronline.game.core.constants.resources.PngConstantsId79;
import com.blackhub.bronline.game.core.enums.ImageTypePathInCDNEnum;
import com.blackhub.bronline.game.core.utils.BitmapUtilsKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ClickerViewModel.kt */
@DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.clicker.ClickerViewModel$initInterface$1$deferredTasksForImages$1", m7120f = "ClickerViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
/* loaded from: classes.dex */
public final class ClickerViewModel$initInterface$1$deferredTasksForImages$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ Ref.ObjectRef<Bitmap> $bgImageBitmap;
    public int label;
    public final /* synthetic */ ClickerViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClickerViewModel$initInterface$1$deferredTasksForImages$1(Ref.ObjectRef<Bitmap> objectRef, ClickerViewModel clickerViewModel, Continuation<? super ClickerViewModel$initInterface$1$deferredTasksForImages$1> continuation) {
        super(2, continuation);
        this.$bgImageBitmap = objectRef;
        this.this$0 = clickerViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new ClickerViewModel$initInterface$1$deferredTasksForImages$1(this.$bgImageBitmap, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((ClickerViewModel$initInterface$1$deferredTasksForImages$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, android.graphics.Bitmap] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.$bgImageBitmap.element = BitmapUtilsKt.getBitmapFromZip$default(this.this$0.application, PngConstantsId79.BG_CLICKER, ImageTypePathInCDNEnum.BACKGROUND, 0.0f, 0.0f, 24, null);
        return Unit.INSTANCE;
    }
}

