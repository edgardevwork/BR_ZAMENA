package com.blackhub.bronline.game.gui.craft;

import androidx.media3.extractor.text.cea.Cea708Decoder;
import com.blackhub.bronline.game.gui.craft.model.CraftElement;
import com.blackhub.bronline.game.gui.craft.model.response.CraftJsonItem;
import com.blackhub.bronline.game.gui.craft.model.server.CraftComponentServerItem;
import com.blackhub.bronline.game.gui.craft.model.server.CraftItemsWithNotificationServerItem;
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
@Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "Lcom/blackhub/bronline/game/gui/craft/model/CraftElement;", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
@DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.craft.CraftViewModel$initJson$1$1$1$craftElement$1", m7120f = "CraftViewModel.kt", m7121i = {}, m7122l = {Cea708Decoder.COMMAND_DF1}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
/* loaded from: classes.dex */
public final class CraftViewModel$initJson$1$1$1$craftElement$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super CraftElement>, Object> {
    public final /* synthetic */ List<CraftComponentServerItem> $componentsArray;
    public final /* synthetic */ CraftJsonItem $craftJsonItem;
    public final /* synthetic */ int $levelOfSkill;
    public final /* synthetic */ List<CraftJsonItem> $listOfCraftItems;
    public final /* synthetic */ List<CraftItemsWithNotificationServerItem> $newItemsIdsList;
    public final /* synthetic */ float $vipProbAdd;
    public final /* synthetic */ int $workbenchLevel;
    public int label;
    public final /* synthetic */ CraftViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CraftViewModel$initJson$1$1$1$craftElement$1(CraftViewModel craftViewModel, CraftJsonItem craftJsonItem, List<CraftJsonItem> list, List<CraftComponentServerItem> list2, List<CraftItemsWithNotificationServerItem> list3, int i, int i2, float f, Continuation<? super CraftViewModel$initJson$1$1$1$craftElement$1> continuation) {
        super(2, continuation);
        this.this$0 = craftViewModel;
        this.$craftJsonItem = craftJsonItem;
        this.$listOfCraftItems = list;
        this.$componentsArray = list2;
        this.$newItemsIdsList = list3;
        this.$levelOfSkill = i;
        this.$workbenchLevel = i2;
        this.$vipProbAdd = f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new CraftViewModel$initJson$1$1$1$craftElement$1(this.this$0, this.$craftJsonItem, this.$listOfCraftItems, this.$componentsArray, this.$newItemsIdsList, this.$levelOfSkill, this.$workbenchLevel, this.$vipProbAdd, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super CraftElement> continuation) {
        return ((CraftViewModel$initJson$1$1$1$craftElement$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CraftViewModel craftViewModel = this.this$0;
            CraftJsonItem craftJsonItem = this.$craftJsonItem;
            List<CraftJsonItem> list = this.$listOfCraftItems;
            List<CraftComponentServerItem> list2 = this.$componentsArray;
            List<CraftItemsWithNotificationServerItem> list3 = this.$newItemsIdsList;
            int i2 = this.$levelOfSkill;
            int i3 = this.$workbenchLevel;
            float f = this.$vipProbAdd;
            this.label = 1;
            obj = craftViewModel.createCraftElement(craftJsonItem, list, list2, list3, i2, i3, f, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
