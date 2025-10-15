package com.blackhub.bronline.game.gui.craft;

import com.blackhub.bronline.game.gui.craft.model.CraftIngredient;
import com.blackhub.bronline.game.gui.craft.model.response.CraftJsonComponentItem;
import com.blackhub.bronline.game.gui.craft.model.response.CraftJsonItem;
import com.blackhub.bronline.game.gui.craft.model.server.CraftComponentServerItem;
import java.util.List;
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

/* compiled from: CraftViewModel.kt */
@Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "Lcom/blackhub/bronline/game/gui/craft/model/CraftIngredient;", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
@DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.craft.CraftViewModel$createCraftElement$listOfCraftIngredient$1$1", m7120f = "CraftViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
/* loaded from: classes.dex */
public final class CraftViewModel$createCraftElement$listOfCraftIngredient$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super CraftIngredient>, Object> {
    public final /* synthetic */ List<CraftComponentServerItem> $componentsArray;
    public final /* synthetic */ CraftJsonComponentItem $craftComponent;
    public final /* synthetic */ List<CraftJsonItem> $listOfCraftItems;
    public int label;
    public final /* synthetic */ CraftViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CraftViewModel$createCraftElement$listOfCraftIngredient$1$1(CraftViewModel craftViewModel, CraftJsonComponentItem craftJsonComponentItem, List<CraftJsonItem> list, List<CraftComponentServerItem> list2, Continuation<? super CraftViewModel$createCraftElement$listOfCraftIngredient$1$1> continuation) {
        super(2, continuation);
        this.this$0 = craftViewModel;
        this.$craftComponent = craftJsonComponentItem;
        this.$listOfCraftItems = list;
        this.$componentsArray = list2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new CraftViewModel$createCraftElement$listOfCraftIngredient$1$1(this.this$0, this.$craftComponent, this.$listOfCraftItems, this.$componentsArray, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super CraftIngredient> continuation) {
        return ((CraftViewModel$createCraftElement$listOfCraftIngredient$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            return this.this$0.findCraftIngredient(this.$craftComponent, this.$listOfCraftItems, this.$componentsArray);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
