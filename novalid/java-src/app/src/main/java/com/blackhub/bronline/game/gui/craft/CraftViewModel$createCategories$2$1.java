package com.blackhub.bronline.game.gui.craft;

import android.graphics.Bitmap;
import com.blackhub.bronline.game.core.enums.ImageTypePathInCDNEnum;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.utils.BitmapUtilsKt;
import com.blackhub.bronline.game.core.utils.attachment.main.CommonButtonCategory;
import com.blackhub.bronline.game.gui.craft.enums.CraftElementStatusEnum;
import com.blackhub.bronline.game.gui.craft.model.CraftElement;
import com.blackhub.bronline.game.gui.craft.model.response.CraftJsonItemCategory;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
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
@Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "Lcom/blackhub/bronline/game/core/utils/attachment/main/CommonButtonCategory;", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
@DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.craft.CraftViewModel$createCategories$2$1", m7120f = "CraftViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
@SourceDebugExtension({"SMAP\nCraftViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CraftViewModel.kt\ncom/blackhub/bronline/game/gui/craft/CraftViewModel$createCategories$2$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1753:1\n288#2,2:1754\n*S KotlinDebug\n*F\n+ 1 CraftViewModel.kt\ncom/blackhub/bronline/game/gui/craft/CraftViewModel$createCategories$2$1\n*L\n1553#1:1754,2\n*E\n"})
/* loaded from: classes.dex */
public final class CraftViewModel$createCategories$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super CommonButtonCategory>, Object> {
    public final /* synthetic */ CraftJsonItemCategory $craftJsonItem;
    public final /* synthetic */ Map<Integer, List<CraftElement>> $mapOfCraftElements;
    public int label;
    public final /* synthetic */ CraftViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CraftViewModel$createCategories$2$1(CraftJsonItemCategory craftJsonItemCategory, CraftViewModel craftViewModel, Map<Integer, List<CraftElement>> map, Continuation<? super CraftViewModel$createCategories$2$1> continuation) {
        super(2, continuation);
        this.$craftJsonItem = craftJsonItemCategory;
        this.this$0 = craftViewModel;
        this.$mapOfCraftElements = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new CraftViewModel$createCategories$2$1(this.$craftJsonItem, this.this$0, this.$mapOfCraftElements, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super CommonButtonCategory> continuation) {
        return ((CraftViewModel$createCategories$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        int categoryId = this.$craftJsonItem.getCategoryId();
        String categoryName = this.$craftJsonItem.getCategoryName();
        Bitmap bitmapFromZip$default = BitmapUtilsKt.getBitmapFromZip$default(this.this$0.application, this.$craftJsonItem.getIconCDN(), ImageTypePathInCDNEnum.ICON, 0.0f, 0.0f, 24, null);
        List<CraftElement> list = this.$mapOfCraftElements.get(Boxing.boxInt(this.$craftJsonItem.getCategoryId()));
        Object obj2 = null;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((CraftElement) next).getElementState() == CraftElementStatusEnum.NEW_ELEMENT) {
                    obj2 = next;
                    break;
                }
            }
            obj2 = (CraftElement) obj2;
        }
        return new CommonButtonCategory(categoryId, categoryName, bitmapFromZip$default, false, AnyExtensionKt.isNotNull(obj2), null, null, 104, null);
    }
}
