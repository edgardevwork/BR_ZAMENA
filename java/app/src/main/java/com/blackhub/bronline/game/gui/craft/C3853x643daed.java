package com.blackhub.bronline.game.gui.craft;

import com.blackhub.bronline.game.gui.craft.enums.CraftElementStatusEnum;
import com.blackhub.bronline.game.gui.craft.model.CraftElement;
import com.blackhub.bronline.game.gui.craft.model.server.CraftStorageServerItem;
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
@DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.craft.CraftViewModel$parseListWithStorageItems$listWithStorageElements$1$1$1", m7120f = "CraftViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
/* renamed from: com.blackhub.bronline.game.gui.craft.CraftViewModel$parseListWithStorageItems$listWithStorageElements$1$1$1 */
/* loaded from: classes.dex */
public final class C3853x643daed extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super CraftElement>, Object> {
    public final /* synthetic */ CraftElementStatusEnum $elementState;
    public final /* synthetic */ CraftElement $it;
    public final /* synthetic */ CraftStorageServerItem $storageServerItem;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3853x643daed(CraftStorageServerItem craftStorageServerItem, CraftElement craftElement, CraftElementStatusEnum craftElementStatusEnum, Continuation<? super C3853x643daed> continuation) {
        super(2, continuation);
        this.$storageServerItem = craftStorageServerItem;
        this.$it = craftElement;
        this.$elementState = craftElementStatusEnum;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new C3853x643daed(this.$storageServerItem, this.$it, this.$elementState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super CraftElement> continuation) {
        return ((C3853x643daed) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Long timeUntilItemDestruction = this.$storageServerItem.getTimeUntilItemDestruction();
        int serverId = this.$storageServerItem.getServerId();
        CraftElement craftElement = this.$it;
        return craftElement.copy((57085 & 1) != 0 ? craftElement.elementId : 0, (57085 & 2) != 0 ? craftElement.serverId : serverId, (57085 & 4) != 0 ? craftElement.imageName : null, (57085 & 8) != 0 ? craftElement.imageType : 0, (57085 & 16) != 0 ? craftElement.timeUntilItemPreparation : 0, (57085 & 32) != 0 ? craftElement.preparationTime : 0, (57085 & 64) != 0 ? craftElement.timeWhenElementCreated : null, (57085 & 128) != 0 ? craftElement.elementRarity : null, (57085 & 256) != 0 ? craftElement.elementState : this.$elementState, (57085 & 512) != 0 ? craftElement.valueOfPipeline : 0, (57085 & 1024) != 0 ? craftElement.textBlock : null, (57085 & 2048) != 0 ? craftElement.componentsList : null, (57085 & 4096) != 0 ? craftElement.valueOfPercent : 0, (57085 & 8192) != 0 ? craftElement.valueOfTimer : timeUntilItemDestruction, (57085 & 16384) != 0 ? craftElement.craftingCost : 0, (57085 & 32768) != 0 ? craftElement.itemCategory : 0);
    }
}

