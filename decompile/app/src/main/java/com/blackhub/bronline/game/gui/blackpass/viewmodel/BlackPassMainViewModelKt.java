package com.blackhub.bronline.game.gui.blackpass.viewmodel;

import com.blackhub.bronline.game.core.utils.attachment.task.CommonTaskModel;
import com.blackhub.bronline.game.core.utils.attachment.task.CommonTaskState;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: BlackPassMainViewModel.kt */
@Metadata(m7104d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\u001a\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\b\u0012\u0004\u0012\u00020\u00050\u0006H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m7105d2 = {"LEVEL_FIVE", "", "LEVEL_TEN", "toSortedTaskList", "", "Lcom/blackhub/bronline/game/core/utils/attachment/task/CommonTaskModel;", "", "app_siteRelease"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nBlackPassMainViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlackPassMainViewModel.kt\ncom/blackhub/bronline/game/gui/blackpass/viewmodel/BlackPassMainViewModelKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1001:1\n766#2:1002\n857#2,2:1003\n766#2:1005\n857#2,2:1006\n1#3:1008\n*S KotlinDebug\n*F\n+ 1 BlackPassMainViewModel.kt\ncom/blackhub/bronline/game/gui/blackpass/viewmodel/BlackPassMainViewModelKt\n*L\n987#1:1002\n987#1:1003,2\n988#1:1005\n988#1:1006,2\n*E\n"})
/* loaded from: classes.dex */
public final class BlackPassMainViewModelKt {
    public static final int LEVEL_FIVE = 5;
    public static final int LEVEL_TEN = 10;

    public static final List<CommonTaskModel> toSortedTaskList(List<CommonTaskModel> list) {
        List<CommonTaskModel> list2 = list;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            if (((CommonTaskModel) obj).getStateOfTask() == CommonTaskState.UNAVAILABLE_STATE) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list2) {
            if (((CommonTaskModel) obj2).getStateOfTask() == CommonTaskState.COMPLETED_STATE) {
                arrayList2.add(obj2);
            }
        }
        CollectionsKt__MutableCollectionsKt.removeAll((List) list, (Function1) new Function1<CommonTaskModel, Boolean>() { // from class: com.blackhub.bronline.game.gui.blackpass.viewmodel.BlackPassMainViewModelKt.toSortedTaskList.1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull CommonTaskModel it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it.getStateOfTask() == CommonTaskState.UNAVAILABLE_STATE || it.getStateOfTask() == CommonTaskState.COMPLETED_STATE);
            }
        });
        CommonTaskModel commonTaskModel = (CommonTaskModel) CollectionsKt___CollectionsKt.firstOrNull((List) arrayList);
        list.addAll(CollectionsKt___CollectionsKt.drop(arrayList, 1));
        if (commonTaskModel != null) {
            list.add(1, commonTaskModel);
        }
        list.addAll(arrayList2);
        return list;
    }
}
