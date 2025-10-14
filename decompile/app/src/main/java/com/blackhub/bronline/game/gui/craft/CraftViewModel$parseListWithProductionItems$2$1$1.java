package com.blackhub.bronline.game.gui.craft;

import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.gui.craft.enums.CraftElementStatusEnum;
import com.blackhub.bronline.game.gui.craft.model.CraftElement;
import com.blackhub.bronline.game.gui.craft.model.server.CraftProductionServerItem;
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

/* compiled from: CraftViewModel.kt */
@Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "Lcom/blackhub/bronline/game/gui/craft/model/CraftElement;", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
@DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.craft.CraftViewModel$parseListWithProductionItems$2$1$1", m7120f = "CraftViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
@SourceDebugExtension({"SMAP\nCraftViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CraftViewModel.kt\ncom/blackhub/bronline/game/gui/craft/CraftViewModel$parseListWithProductionItems$2$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1753:1\n1#2:1754\n*E\n"})
/* loaded from: classes.dex */
public final class CraftViewModel$parseListWithProductionItems$2$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super CraftElement>, Object> {
    public final /* synthetic */ CraftElement $craftElement;
    public final /* synthetic */ CraftProductionServerItem $productionServerItem;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CraftViewModel$parseListWithProductionItems$2$1$1(CraftProductionServerItem craftProductionServerItem, CraftElement craftElement, Continuation<? super CraftViewModel$parseListWithProductionItems$2$1$1> continuation) {
        super(2, continuation);
        this.$productionServerItem = craftProductionServerItem;
        this.$craftElement = craftElement;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new CraftViewModel$parseListWithProductionItems$2$1$1(this.$productionServerItem, this.$craftElement, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super CraftElement> continuation) {
        return ((CraftViewModel$parseListWithProductionItems$2$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        CraftElementStatusEnum craftElementStatusEnum;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (AnyExtensionKt.isNotNull(this.$productionServerItem.getTimeUntilItemPreparation())) {
            craftElementStatusEnum = CraftElementStatusEnum.IN_THE_PIPELINE;
        } else {
            craftElementStatusEnum = CraftElementStatusEnum.IN_THE_QUEUE;
        }
        CraftElementStatusEnum craftElementStatusEnum2 = craftElementStatusEnum;
        Integer timeUntilItemPreparation = this.$productionServerItem.getTimeUntilItemPreparation();
        Integer numBoxInt = timeUntilItemPreparation != null ? Boxing.boxInt(timeUntilItemPreparation.intValue() - this.$craftElement.getPreparationTime()) : null;
        Integer timeUntilItemPreparation2 = this.$productionServerItem.getTimeUntilItemPreparation();
        int iIntValue = timeUntilItemPreparation2 != null ? timeUntilItemPreparation2.intValue() : 0;
        int serverId = this.$productionServerItem.getServerId();
        CraftElement craftElement = this.$craftElement;
        return craftElement.copy((57085 & 1) != 0 ? craftElement.elementId : 0, (57085 & 2) != 0 ? craftElement.serverId : serverId, (57085 & 4) != 0 ? craftElement.imageName : null, (57085 & 8) != 0 ? craftElement.imageType : 0, (57085 & 16) != 0 ? craftElement.timeUntilItemPreparation : iIntValue, (57085 & 32) != 0 ? craftElement.preparationTime : 0, (57085 & 64) != 0 ? craftElement.timeWhenElementCreated : numBoxInt, (57085 & 128) != 0 ? craftElement.elementRarity : null, (57085 & 256) != 0 ? craftElement.elementState : craftElementStatusEnum2, (57085 & 512) != 0 ? craftElement.valueOfPipeline : 0, (57085 & 1024) != 0 ? craftElement.textBlock : null, (57085 & 2048) != 0 ? craftElement.componentsList : null, (57085 & 4096) != 0 ? craftElement.valueOfPercent : 0, (57085 & 8192) != 0 ? craftElement.valueOfTimer : null, (57085 & 16384) != 0 ? craftElement.craftingCost : 0, (57085 & 32768) != 0 ? craftElement.itemCategory : 0);
    }
}
