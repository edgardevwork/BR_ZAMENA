package com.blackhub.bronline.game.core.utils.draganddrop;

import android.view.DragEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.extension.BooleanExtensionKt;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.blackhub.bronline.game.core.utils.draganddrop.model.DataDragView;
import com.blackhub.bronline.game.core.utils.draganddrop.model.DataTargetArea;
import com.blackhub.bronline.game.core.utils.draganddrop.model.DragAndDropCallback;
import com.blackhub.bronline.game.core.utils.draganddrop.model.PointFloat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DragAndDropListener.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aBm\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012%\b\u0002\u0010\u0007\u001a\u001f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\b\u0012!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\r0\b¢\u0006\u0002\u0010\u0010J\u0006\u0010\u0018\u001a\u00020\u0019R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R)\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\r0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R+\u0010\u0007\u001a\u001f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m7105d2 = {"Lcom/blackhub/bronline/game/core/utils/draganddrop/DragAndDropListener;", "", "dataTargetAreaList", "", "Lcom/blackhub/bronline/game/core/utils/draganddrop/model/DataTargetArea;", "targetAreaBusyList", "", "startCallback", "Lkotlin/Function1;", "Lcom/blackhub/bronline/game/core/utils/draganddrop/model/DragAndDropCallback;", "Lkotlin/ParameterName;", "name", "callbackStart", "", "endCallback", "callbackEnd", "(Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "originalParent", "Landroid/view/ViewGroup;", "startTime", "", "startX", "", "startY", "invoke", "Landroid/view/View$OnDragListener;", "Companion", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nDragAndDropListener.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragAndDropListener.kt\ncom/blackhub/bronline/game/core/utils/draganddrop/DragAndDropListener\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,211:1\n1360#2:212\n1446#2,5:213\n288#2,2:218\n*S KotlinDebug\n*F\n+ 1 DragAndDropListener.kt\ncom/blackhub/bronline/game/core/utils/draganddrop/DragAndDropListener\n*L\n58#1:212\n58#1:213,5\n59#1:218,2\n*E\n"})
/* loaded from: classes3.dex */
public final class DragAndDropListener {
    public static final int CLICK_MILLIS = 100;
    public static final float START_CENTER_ERROR = 70.0f;

    @NotNull
    public final List<DataTargetArea> dataTargetAreaList;

    @NotNull
    public final Function1<DragAndDropCallback, Unit> endCallback;

    @Nullable
    public ViewGroup originalParent;

    @NotNull
    public final Function1<DragAndDropCallback, Unit> startCallback;
    public final long startTime;
    public float startX;
    public float startY;

    @NotNull
    public final List<String> targetAreaBusyList;
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public DragAndDropListener(@NotNull List<DataTargetArea> dataTargetAreaList, @NotNull List<String> targetAreaBusyList, @NotNull Function1<? super DragAndDropCallback, Unit> startCallback, @NotNull Function1<? super DragAndDropCallback, Unit> endCallback) {
        Intrinsics.checkNotNullParameter(dataTargetAreaList, "dataTargetAreaList");
        Intrinsics.checkNotNullParameter(targetAreaBusyList, "targetAreaBusyList");
        Intrinsics.checkNotNullParameter(startCallback, "startCallback");
        Intrinsics.checkNotNullParameter(endCallback, "endCallback");
        this.dataTargetAreaList = dataTargetAreaList;
        this.targetAreaBusyList = targetAreaBusyList;
        this.startCallback = startCallback;
        this.endCallback = endCallback;
        this.startTime = System.currentTimeMillis();
    }

    /* compiled from: DragAndDropListener.kt */
    @Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m7105d2 = {"<anonymous>", "", "it", "Lcom/blackhub/bronline/game/core/utils/draganddrop/model/DragAndDropCallback;", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.core.utils.draganddrop.DragAndDropListener$1 */
    /* loaded from: classes2.dex */
    public static final class C35501 extends Lambda implements Function1<DragAndDropCallback, Unit> {
        public static final C35501 INSTANCE = ;

        /* renamed from: invoke */
        public final void invoke2(@NotNull DragAndDropCallback it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DragAndDropCallback dragAndDropCallback) {
            invoke2(dragAndDropCallback);
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ DragAndDropListener(List list, List list2, Function1 function1, Function1 function12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2, (i & 4) != 0 ? C35501.INSTANCE : function1, function12);
    }

    @NotNull
    public final View.OnDragListener invoke() {
        return new View.OnDragListener() { // from class: com.blackhub.bronline.game.core.utils.draganddrop.DragAndDropListener$$ExternalSyntheticLambda0
            @Override // android.view.View.OnDragListener
            public final boolean onDrag(View view, DragEvent dragEvent) {
                return DragAndDropListener.invoke$lambda$9(this.f$0, view, dragEvent);
            }
        };
    }

    public static final boolean invoke$lambda$9(final DragAndDropListener this$0, View view, DragEvent dragEvent) {
        Object next;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!AnyExtensionKt.isNotNull(view) || !AnyExtensionKt.isNotNull(dragEvent) || !AnyExtensionKt.isNotNull(dragEvent.getLocalState())) {
            return false;
        }
        Object localState = dragEvent.getLocalState();
        Intrinsics.checkNotNull(localState, "null cannot be cast to non-null type android.view.View");
        final View view2 = (View) localState;
        ViewParent parent = view2.getParent();
        Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) parent;
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup2 = (ViewGroup) view;
        if (this$0.originalParent == null) {
            this$0.originalParent = viewGroup;
        }
        List<DataTargetArea> list = this$0.dataTargetAreaList;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, ((DataTargetArea) it.next()).getDataDragViewList());
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (((DataDragView) next).getDraggableView().getId() == view2.getId()) {
                break;
            }
        }
        final DataDragView dataDragView = (DataDragView) next;
        if (dataDragView == null) {
            throw new NullPointerException("DataDragView is not found");
        }
        switch (dragEvent.getAction()) {
            case 1:
                view2.setVisibility(8);
                this$0.startX = view2.getX();
                this$0.startY = view2.getY();
                view2.setScaleX(dataDragView.getDataDragAndDrop().getNewScale());
                view2.setScaleY(dataDragView.getDataDragAndDrop().getNewScale());
                view2.setRotation(dataDragView.getDataDragAndDrop().getNewRotate());
                Intrinsics.checkNotNull(dragEvent);
                this$0.startCallback.invoke(DragAndDropCallback.copy$default(UtilsKt.checkIfDraggableItemIsOnTargetArea(dragEvent, dataDragView, this$0.dataTargetAreaList, Float.valueOf(70.0f)), null, null, null, false, 7, null));
                return dragEvent.getClipDescription().hasMimeType("text/plain");
            case 3:
                if (dragEvent.getClipDescription().hasMimeType("text/plain")) {
                    dragEvent.getClipData().getItemAt(0).getText();
                }
                if (System.currentTimeMillis() - this$0.startTime < 100) {
                    viewGroup.removeView(view2);
                    view2.setX(dataDragView.getDataNative().getStartX());
                    view2.setY(dataDragView.getDataNative().getStartY());
                    view2.setRotation(dataDragView.getDataNative().getRotate());
                    view2.setScaleX(dataDragView.getDataNative().getScaleX());
                    view2.setScaleY(dataDragView.getDataNative().getScaleY());
                    view2.setVisibility(0);
                    dataDragView.getParent().addView(view2);
                    view.invalidate();
                    return true;
                }
                Intrinsics.checkNotNull(dragEvent);
                final DragAndDropCallback dragAndDropCallbackCheckIfDraggableItemIsOnTargetArea$default = UtilsKt.checkIfDraggableItemIsOnTargetArea$default(dragEvent, dataDragView, this$0.dataTargetAreaList, null, 8, null);
                if (dragAndDropCallbackCheckIfDraggableItemIsOnTargetArea$default.getDataTargetArea() != null) {
                    String busyData = dragAndDropCallbackCheckIfDraggableItemIsOnTargetArea$default.getDataTargetArea().getBusyData();
                    if (!BooleanExtensionKt.getOrFalse(busyData != null ? Boolean.valueOf(this$0.targetAreaBusyList.contains(busyData)) : null)) {
                        viewGroup.removeView(view2);
                        view.invalidate();
                        view2.invalidate();
                        view2.setX(dragEvent.getX() - (view2.getWidth() / 2));
                        view2.setY(dragEvent.getY() - (view2.getHeight() / 2));
                        viewGroup2.addView(view2);
                        view.invalidate();
                        view2.setVisibility(0);
                        PointFloat pointWithOptions = UtilsKt.getPointWithOptions(dataDragView.getDraggableView().getRotation(), (dataDragView.getDraggableView().getHeight() * dataDragView.getDataDragAndDrop().getNewScale()) / 2, dataDragView.getPointListener(), 0.0f, 0.0f);
                        ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
                        viewPropertyAnimatorAnimate.setDuration(200L);
                        viewPropertyAnimatorAnimate.translationX((dragAndDropCallbackCheckIfDraggableItemIsOnTargetArea$default.getDataTargetArea().getPointCenter().getX() - (view2.getWidth() / 2)) - pointWithOptions.getX());
                        viewPropertyAnimatorAnimate.translationY((dragAndDropCallbackCheckIfDraggableItemIsOnTargetArea$default.getDataTargetArea().getPointCenter().getY() - (view2.getHeight() / 2)) - pointWithOptions.getY());
                        Float rotate = dragAndDropCallbackCheckIfDraggableItemIsOnTargetArea$default.getDataTargetArea().getRotate();
                        if (rotate != null) {
                            viewPropertyAnimatorAnimate.rotation(rotate.floatValue());
                        }
                        viewPropertyAnimatorAnimate.withStartAction(new Runnable() { // from class: com.blackhub.bronline.game.core.utils.draganddrop.DragAndDropListener$$ExternalSyntheticLambda1
                            @Override // java.lang.Runnable
                            public final void run() {
                                DragAndDropListener.invoke$lambda$9$lambda$8$lambda$7$lambda$6(dataDragView, view2);
                            }
                        });
                        this$0.endCallback.invoke(DragAndDropCallback.copy$default(dragAndDropCallbackCheckIfDraggableItemIsOnTargetArea$default, null, null, null, true, 7, null));
                        return true;
                    }
                    this$0.endCallback.invoke(DragAndDropCallback.copy$default(dragAndDropCallbackCheckIfDraggableItemIsOnTargetArea$default, null, null, null, false, 7, null));
                    Unit unit = Unit.INSTANCE;
                } else {
                    new Function0<Unit>() { // from class: com.blackhub.bronline.game.core.utils.draganddrop.DragAndDropListener$invoke$1$2$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            this.this$0.endCallback.invoke(DragAndDropCallback.copy$default(dragAndDropCallbackCheckIfDraggableItemIsOnTargetArea$default, null, null, null, false, 7, null));
                        }
                    };
                }
                viewGroup.removeView(view2);
                view2.setX(dataDragView.getDataNative().getStartX());
                view2.setY(dataDragView.getDataNative().getStartY());
                view2.setRotation(dataDragView.getDataNative().getRotate());
                view2.setScaleX(dataDragView.getDataNative().getScaleX());
                view2.setScaleY(dataDragView.getDataNative().getScaleY());
                view2.setVisibility(0);
                dataDragView.getParent().addView(view2);
                view.invalidate();
            case 2:
                return true;
            case 6:
                view2.setVisibility(0);
                view.invalidate();
            case 4:
            case 5:
                return true;
            default:
                return false;
        }
    }

    public static final void invoke$lambda$9$lambda$8$lambda$7$lambda$6(DataDragView dataDragView, View dragView) {
        Intrinsics.checkNotNullParameter(dataDragView, "$dataDragView");
        Intrinsics.checkNotNullParameter(dragView, "$dragView");
        if (dataDragView.isRemoveDragListenerAfterDrop()) {
            dragView.setOnTouchListener(null);
        }
    }
}
