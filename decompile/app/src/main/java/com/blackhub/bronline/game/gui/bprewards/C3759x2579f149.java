package com.blackhub.bronline.game.gui.bprewards;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.blackhub.bronline.game.core.extension.BooleanExtensionKt;
import com.blackhub.bronline.game.core.extension.IntExtensionKt;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.blackhub.bronline.game.gui.bprewards.model.BpRewardsImageModel;
import com.blackhub.bronline.game.gui.bprewards.model.BpRewardsRenderAttachment;
import com.blackhub.bronline.game.gui.bprewards.model.BpRewardsServerItemModel;
import com.blackhub.bronline.game.gui.inventory.data.InvItems;
import com.blackhub.bronline.game.model.remote.response.bprewards.BpRewardsAwardsDto;
import com.blackhub.bronline.game.model.remote.response.skins.SkinsDTO;
import com.blackhub.bronline.game.model.remote.response.vehicles.VehiclesDTO;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BpRewardsViewModel.kt */
@Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "Lcom/blackhub/bronline/game/gui/bprewards/model/BpRewardsImageModel;", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
@DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.bprewards.BpRewardsViewModel$parseJsonAndGetListOfItems$2$deferredImageModel$1", m7120f = "BpRewardsViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
@SourceDebugExtension({"SMAP\nBpRewardsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BpRewardsViewModel.kt\ncom/blackhub/bronline/game/gui/bprewards/BpRewardsViewModel$parseJsonAndGetListOfItems$2$deferredImageModel$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,736:1\n1#2:737\n*E\n"})
/* renamed from: com.blackhub.bronline.game.gui.bprewards.BpRewardsViewModel$parseJsonAndGetListOfItems$2$deferredImageModel$1 */
/* loaded from: classes.dex */
public final class C3759x2579f149 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super BpRewardsImageModel>, Object> {
    public final /* synthetic */ List<InvItems> $invItemsFromJson;
    public final /* synthetic */ BpRewardsServerItemModel $item;
    public final /* synthetic */ List<BpRewardsAwardsDto> $listOfAwardsTypes;
    public final /* synthetic */ List<SkinsDTO> $skinsList;
    public final /* synthetic */ List<VehiclesDTO> $vehiclesList;
    public int label;
    public final /* synthetic */ BpRewardsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3759x2579f149(BpRewardsServerItemModel bpRewardsServerItemModel, List<VehiclesDTO> list, BpRewardsViewModel bpRewardsViewModel, List<SkinsDTO> list2, List<InvItems> list3, List<BpRewardsAwardsDto> list4, Continuation<? super C3759x2579f149> continuation) {
        super(2, continuation);
        this.$item = bpRewardsServerItemModel;
        this.$vehiclesList = list;
        this.this$0 = bpRewardsViewModel;
        this.$skinsList = list2;
        this.$invItemsFromJson = list3;
        this.$listOfAwardsTypes = list4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new C3759x2579f149(this.$item, this.$vehiclesList, this.this$0, this.$skinsList, this.$invItemsFromJson, this.$listOfAwardsTypes, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super BpRewardsImageModel> continuation) {
        return ((C3759x2579f149) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object next;
        BpRewardsImageModel bpRewardsImageModel;
        Boolean boolBoxBoolean;
        Object next2;
        Object next3;
        Boolean boolBoxBoolean2;
        Object next4;
        List<String> imageList;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        int prizeType = this.$item.getPrizeType();
        Object obj2 = null;
        if (prizeType == 5) {
            List<VehiclesDTO> list = this.$vehiclesList;
            BpRewardsServerItemModel bpRewardsServerItemModel = this.$item;
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                VehiclesDTO vehiclesDTO = (VehiclesDTO) next;
                if (Intrinsics.areEqual(vehiclesDTO.getModelId(), bpRewardsServerItemModel.getIdForImages())) {
                    String imageName = vehiclesDTO.getImageName();
                    if (imageName != null) {
                        boolBoxBoolean = Boxing.boxBoolean(imageName.length() > 0);
                    } else {
                        boolBoxBoolean = null;
                    }
                    if (BooleanExtensionKt.getOrFalse(boolBoxBoolean)) {
                        break;
                    }
                }
            }
            VehiclesDTO vehiclesDTO2 = (VehiclesDTO) next;
            if (vehiclesDTO2 != null) {
                BpRewardsServerItemModel bpRewardsServerItemModel2 = this.$item;
                String str = (String) UtilsKt.buildTypeMerge(vehiclesDTO2.getName(), vehiclesDTO2.getNameStore());
                if (str == null) {
                    str = "";
                }
                bpRewardsServerItemModel2.setItemName(str);
                int orZero = IntExtensionKt.getOrZero(this.$item.getIdForImages());
                String imageName2 = vehiclesDTO2.getImageName();
                return new BpRewardsImageModel(orZero, null, imageName2 == null ? "" : imageName2, BpRewardsConstants.CAR_IMAGE, 2, null);
            }
            List<BpRewardsImageModel> listWithImageModels = this.this$0.get_uiState().getValue().getBpRewardsLists().getListWithImageModels();
            BpRewardsServerItemModel bpRewardsServerItemModel3 = this.$item;
            Iterator<T> it2 = listWithImageModels.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next5 = it2.next();
                BpRewardsImageModel bpRewardsImageModel2 = (BpRewardsImageModel) next5;
                if (bpRewardsImageModel2.getImageType() == 9212) {
                    int id = bpRewardsImageModel2.getId();
                    Integer idForImages = bpRewardsServerItemModel3.getIdForImages();
                    if (idForImages != null && id == idForImages.intValue()) {
                        obj2 = next5;
                        break;
                    }
                }
            }
            BpRewardsImageModel bpRewardsImageModel3 = (BpRewardsImageModel) obj2;
            if (bpRewardsImageModel3 != null) {
                return bpRewardsImageModel3;
            }
            bpRewardsImageModel = new BpRewardsImageModel(IntExtensionKt.getOrZero(this.$item.getIdForImages()), new BpRewardsRenderAttachment(7, IntExtensionKt.getOrZero(this.$item.getIdForImages()), 1, 0.85f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 2032, null), null, BpRewardsConstants.CAR_IMAGE, 4, null);
        } else if (prizeType == 11) {
            Integer idForImages2 = this.$item.getIdForImages();
            if (idForImages2 != null && idForImages2.intValue() == 134) {
                List<SkinsDTO> list2 = this.$skinsList;
                BpRewardsServerItemModel bpRewardsServerItemModel4 = this.$item;
                Iterator<T> it3 = list2.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it3.next();
                    SkinsDTO skinsDTO = (SkinsDTO) next3;
                    if (Intrinsics.areEqual(skinsDTO.getModelId(), bpRewardsServerItemModel4.getSkinModelId())) {
                        String imageName3 = skinsDTO.getImageName();
                        if (imageName3 != null) {
                            boolBoxBoolean2 = Boxing.boxBoolean(imageName3.length() > 0);
                        } else {
                            boolBoxBoolean2 = null;
                        }
                        if (BooleanExtensionKt.getOrFalse(boolBoxBoolean2)) {
                            break;
                        }
                    }
                }
                SkinsDTO skinsDTO2 = (SkinsDTO) next3;
                if (skinsDTO2 != null) {
                    BpRewardsServerItemModel bpRewardsServerItemModel5 = this.$item;
                    bpRewardsServerItemModel5.setItemNameForPreview(bpRewardsServerItemModel5.getItemName());
                    BpRewardsServerItemModel bpRewardsServerItemModel6 = this.$item;
                    String name = skinsDTO2.getName();
                    if (name == null) {
                        name = "";
                    }
                    bpRewardsServerItemModel6.setItemName(name);
                    int orZero2 = IntExtensionKt.getOrZero(this.$item.getSkinModelId());
                    String imageName4 = skinsDTO2.getImageName();
                    return new BpRewardsImageModel(orZero2, null, imageName4 == null ? "" : imageName4, BpRewardsConstants.SKIN_IMAGE, 2, null);
                }
                List<BpRewardsImageModel> listWithImageModels2 = this.this$0.get_uiState().getValue().getBpRewardsLists().getListWithImageModels();
                BpRewardsServerItemModel bpRewardsServerItemModel7 = this.$item;
                Iterator<T> it4 = listWithImageModels2.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    Object next6 = it4.next();
                    BpRewardsImageModel bpRewardsImageModel4 = (BpRewardsImageModel) next6;
                    if (bpRewardsImageModel4.getImageType() == 9112) {
                        int id2 = bpRewardsImageModel4.getId();
                        Integer skinModelId = bpRewardsServerItemModel7.getSkinModelId();
                        if (skinModelId != null && id2 == skinModelId.intValue()) {
                            obj2 = next6;
                            break;
                        }
                    }
                }
                BpRewardsImageModel bpRewardsImageModel5 = (BpRewardsImageModel) obj2;
                if (bpRewardsImageModel5 != null) {
                    return bpRewardsImageModel5;
                }
                bpRewardsImageModel = new BpRewardsImageModel(IntExtensionKt.getOrZero(this.$item.getIdForImages()), new BpRewardsRenderAttachment(2, IntExtensionKt.getOrZero(this.$item.getSkinModelId()), 0, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 2032, null), null, BpRewardsConstants.SKIN_IMAGE, 4, null);
            } else {
                if ((idForImages2 != null && idForImages2.intValue() == 59) || ((idForImages2 != null && idForImages2.intValue() == 81) || ((idForImages2 != null && idForImages2.intValue() == 82) || (idForImages2 != null && idForImages2.intValue() == 83)))) {
                    int iHashCode = this.$item.getPlateText().hashCode();
                    Iterator<T> it5 = this.this$0.get_uiState().getValue().getBpRewardsLists().getListWithImageModels().iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            break;
                        }
                        Object next7 = it5.next();
                        BpRewardsImageModel bpRewardsImageModel6 = (BpRewardsImageModel) next7;
                        if (bpRewardsImageModel6.getImageType() == 9412 && bpRewardsImageModel6.getId() == iHashCode) {
                            obj2 = next7;
                            break;
                        }
                    }
                    BpRewardsImageModel bpRewardsImageModel7 = (BpRewardsImageModel) obj2;
                    if (bpRewardsImageModel7 == null) {
                        return new BpRewardsImageModel(iHashCode, new BpRewardsRenderAttachment(this.$item.getIdForImages().intValue(), iHashCode, 0, 0.78f, 0.0f, 180.0f, 0.0f, 0.0f, 0.0f, 0.0f, this.$item.getPlateText(), TypedValues.Custom.TYPE_INT, null), null, 0, 12, null);
                    }
                    return bpRewardsImageModel7;
                }
                List<InvItems> list3 = this.$invItemsFromJson;
                BpRewardsServerItemModel bpRewardsServerItemModel8 = this.$item;
                Iterator<T> it6 = list3.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it6.next();
                    if (((InvItems) next2).getId() == IntExtensionKt.getOrZero(bpRewardsServerItemModel8.getIdForImages())) {
                        break;
                    }
                }
                InvItems invItems = (InvItems) next2;
                if (invItems != null) {
                    String imageName5 = invItems.getImageName();
                    if (imageName5 != null) {
                        Iterator<T> it7 = this.this$0.get_uiState().getValue().getBpRewardsLists().getListWithImageModels().iterator();
                        while (true) {
                            if (!it7.hasNext()) {
                                break;
                            }
                            Object next8 = it7.next();
                            BpRewardsImageModel bpRewardsImageModel8 = (BpRewardsImageModel) next8;
                            if (Intrinsics.areEqual(bpRewardsImageModel8.getPngSvgName(), imageName5) && bpRewardsImageModel8.getId() == invItems.getId()) {
                                obj2 = next8;
                                break;
                            }
                        }
                        BpRewardsImageModel bpRewardsImageModel9 = (BpRewardsImageModel) obj2;
                        if (bpRewardsImageModel9 != null) {
                            return bpRewardsImageModel9;
                        }
                        bpRewardsImageModel = new BpRewardsImageModel(invItems.getId(), null, imageName5, BpRewardsConstants.OBJECT_IMAGE, 2, null);
                    } else {
                        Iterator<T> it8 = this.this$0.get_uiState().getValue().getBpRewardsLists().getListWithImageModels().iterator();
                        while (true) {
                            if (!it8.hasNext()) {
                                break;
                            }
                            Object next9 = it8.next();
                            BpRewardsImageModel bpRewardsImageModel10 = (BpRewardsImageModel) next9;
                            if (bpRewardsImageModel10.getImageType() == 9312 && bpRewardsImageModel10.getId() == invItems.getId()) {
                                obj2 = next9;
                                break;
                            }
                        }
                        BpRewardsImageModel bpRewardsImageModel11 = (BpRewardsImageModel) obj2;
                        if (bpRewardsImageModel11 != null) {
                            return bpRewardsImageModel11;
                        }
                        bpRewardsImageModel = new BpRewardsImageModel(invItems.getId(), new BpRewardsRenderAttachment(0, invItems.getModelid(), 1, invItems.getZoom(), invItems.getX(), invItems.getY(), invItems.getZ(), invItems.getShiftX(), invItems.getShiftY(), invItems.getShiftZ(), null, 1024, null), null, BpRewardsConstants.OBJECT_IMAGE, 4, null);
                    }
                } else {
                    return new BpRewardsImageModel(0, null, null, 0, 15, null);
                }
            }
        } else {
            Integer idForImages3 = this.$item.getIdForImages();
            int orZero3 = IntExtensionKt.getOrZero(idForImages3 != null ? Boxing.boxInt(idForImages3.intValue() - 1) : null);
            List<BpRewardsAwardsDto> list4 = this.$listOfAwardsTypes;
            BpRewardsServerItemModel bpRewardsServerItemModel9 = this.$item;
            Iterator<T> it9 = list4.iterator();
            while (true) {
                if (!it9.hasNext()) {
                    next4 = null;
                    break;
                }
                next4 = it9.next();
                if (((BpRewardsAwardsDto) next4).getId() == bpRewardsServerItemModel9.getPrizeType()) {
                    break;
                }
            }
            BpRewardsAwardsDto bpRewardsAwardsDto = (BpRewardsAwardsDto) next4;
            String str2 = (bpRewardsAwardsDto == null || (imageList = bpRewardsAwardsDto.getImageList()) == null) ? null : (String) CollectionsKt___CollectionsKt.getOrNull(imageList, orZero3);
            String str3 = str2 == null ? "" : str2;
            List<BpRewardsImageModel> listWithImageModels3 = this.this$0.get_uiState().getValue().getBpRewardsLists().getListWithImageModels();
            BpRewardsServerItemModel bpRewardsServerItemModel10 = this.$item;
            Iterator<T> it10 = listWithImageModels3.iterator();
            while (true) {
                if (!it10.hasNext()) {
                    break;
                }
                Object next10 = it10.next();
                BpRewardsImageModel bpRewardsImageModel12 = (BpRewardsImageModel) next10;
                if (bpRewardsImageModel12.getImageType() == bpRewardsServerItemModel10.getPrizeType()) {
                    int id3 = bpRewardsImageModel12.getId();
                    Integer idForImages4 = bpRewardsServerItemModel10.getIdForImages();
                    if (idForImages4 != null && id3 == idForImages4.intValue()) {
                        obj2 = next10;
                        break;
                    }
                }
            }
            BpRewardsImageModel bpRewardsImageModel13 = (BpRewardsImageModel) obj2;
            return bpRewardsImageModel13 == null ? new BpRewardsImageModel(IntExtensionKt.getOrZero(this.$item.getIdForImages()), null, str3, 4, 2, null) : bpRewardsImageModel13;
        }
        return bpRewardsImageModel;
    }
}
