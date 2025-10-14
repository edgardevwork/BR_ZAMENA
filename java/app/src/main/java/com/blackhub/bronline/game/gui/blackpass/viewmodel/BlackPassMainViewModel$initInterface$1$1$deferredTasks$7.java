package com.blackhub.bronline.game.gui.blackpass.viewmodel;

import android.app.Application;
import android.graphics.Bitmap;
import com.blackhub.bronline.game.core.enums.ImageTypePathInCDNEnum;
import com.blackhub.bronline.game.core.utils.BitmapUtilsKt;
import com.blackhub.bronline.game.model.remote.response.bprewards.BpRewardsAwardsDto;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BlackPassMainViewModel.kt */
@DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.blackpass.viewmodel.BlackPassMainViewModel$initInterface$1$1$deferredTasks$7", m7120f = "BlackPassMainViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
@SourceDebugExtension({"SMAP\nBlackPassMainViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlackPassMainViewModel.kt\ncom/blackhub/bronline/game/gui/blackpass/viewmodel/BlackPassMainViewModel$initInterface$1$1$deferredTasks$7\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1001:1\n1#2:1002\n*E\n"})

public final class BlackPassMainViewModel$initInterface$1$1$deferredTasks$7 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ Ref.ObjectRef<Bitmap> $bpExpBitmap;
    public final /* synthetic */ List<BpRewardsAwardsDto> $listOfAwardsTypes;
    public int label;
    public final /* synthetic */ BlackPassMainViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlackPassMainViewModel$initInterface$1$1$deferredTasks$7(Ref.ObjectRef<Bitmap> objectRef, BlackPassMainViewModel blackPassMainViewModel, List<BpRewardsAwardsDto> list, Continuation<? super BlackPassMainViewModel$initInterface$1$1$deferredTasks$7> continuation) {
        super(2, continuation);
        this.$bpExpBitmap = objectRef;
        this.this$0 = blackPassMainViewModel;
        this.$listOfAwardsTypes = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new BlackPassMainViewModel$initInterface$1$1$deferredTasks$7(this.$bpExpBitmap, this.this$0, this.$listOfAwardsTypes, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((BlackPassMainViewModel$initInterface$1$1$deferredTasks$7) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        String str;
        Object next;
        List<String> imageList;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Ref.ObjectRef<Bitmap> objectRef = this.$bpExpBitmap;
        Bitmap bpExpBitmap = this.this$0.getUiState().getValue().getBpExpBitmap();
        T bitmapFromZip$default = bpExpBitmap;
        if (bpExpBitmap == null) {
            Application application = this.this$0.application;
            Iterator<T> it = this.$listOfAwardsTypes.iterator();
            while (true) {
                str = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((BpRewardsAwardsDto) next).getId() == 10) {
                    break;
                }
            }
            BpRewardsAwardsDto bpRewardsAwardsDto = (BpRewardsAwardsDto) next;
            if (bpRewardsAwardsDto != null && (imageList = bpRewardsAwardsDto.getImageList()) != null) {
                str = (String) CollectionsKt___CollectionsKt.firstOrNull((List) imageList);
            }
            bitmapFromZip$default = BitmapUtilsKt.getBitmapFromZip$default(application, str == null ? "" : str, ImageTypePathInCDNEnum.ICON, 0.0f, 0.0f, 24, null);
        }
        objectRef.element = bitmapFromZip$default;
        return Unit.INSTANCE;
    }
}

