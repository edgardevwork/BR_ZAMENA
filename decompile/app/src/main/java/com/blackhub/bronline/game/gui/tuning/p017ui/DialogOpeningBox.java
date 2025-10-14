package com.blackhub.bronline.game.gui.tuning.p017ui;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.media3.extractor.text.cea.Cea708Decoder;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.databinding.TuningSubmenuBoxBinding;
import com.blackhub.bronline.game.common.DialogNoNavBarFullScreen;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.gui.UsefulKt;
import com.blackhub.bronline.game.gui.tuning.adapters.TuningBoxAdapter;
import com.blackhub.bronline.game.gui.tuning.data.TuneObj;
import com.blackhub.bronline.game.gui.tuning.data.TuningBoxItemObj;
import com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel;
import com.blackhub.bronline.game.gui.tuning.viewmodel.TuningMainViewModel;
import com.bless.client.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

/* compiled from: DialogOpeningBox.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0006\u0010\u001e\u001a\u00020\u001fJ\b\u0010 \u001a\u00020!H\u0016J\u0016\u0010\"\u001a\u00020\u001f2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$H\u0002J\b\u0010&\u001a\u00020\u001fH\u0016J\b\u0010'\u001a\u00020\u001fH\u0002J\u0016\u0010(\u001a\u00020\u001f2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020*0$H\u0002J\b\u0010+\u001a\u00020\u001fH\u0002J\u0018\u0010,\u001a\u00020\u001f2\u0006\u0010-\u001a\u00020\u00052\u0006\u0010.\u001a\u00020\u0005H\u0002J\b\u0010/\u001a\u00020\u001fH\u0002J\u0006\u00100\u001a\u00020\u001fJ\b\u00101\u001a\u00020\u001fH\u0002R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u001a@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00062"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/tuning/ui/DialogOpeningBox;", "Lcom/blackhub/bronline/game/common/DialogNoNavBarFullScreen;", "currentScope", "Landroidx/lifecycle/LifecycleCoroutineScope;", "carId", "", "detailListViewModel", "Lcom/blackhub/bronline/game/gui/tuning/viewmodel/TuningDetailsListViewModel;", "tuningViewModel", "Lcom/blackhub/bronline/game/gui/tuning/viewmodel/TuningMainViewModel;", "context", "Landroid/content/Context;", "(Landroidx/lifecycle/LifecycleCoroutineScope;ILcom/blackhub/bronline/game/gui/tuning/viewmodel/TuningDetailsListViewModel;Lcom/blackhub/bronline/game/gui/tuning/viewmodel/TuningMainViewModel;Landroid/content/Context;)V", "binding", "Lcom/blackhub/bronline/databinding/TuningSubmenuBoxBinding;", "boxAdapter", "Lcom/blackhub/bronline/game/gui/tuning/adapters/TuningBoxAdapter;", "currentBoxObj", "Lcom/blackhub/bronline/game/gui/tuning/data/TuneObj;", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "handler$delegate", "Lkotlin/Lazy;", "<set-?>", "", "ifSavedStatus", "getIfSavedStatus", "()Z", "closeDialogOpeningBox", "", "getContentView", "Landroid/view/View;", "initItems", "boxItems", "", "Lcom/blackhub/bronline/game/gui/tuning/data/TuningBoxItemObj;", "initListeners", "removeObservers", "setDataOpeningBox", "params", "", "setObservers", "setPriceInView", "boxCost", FirebaseAnalytics.Param.CURRENCY, "setVisibleOpeningBox", "showDialogOpeningBox", "startRotationAnim", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class DialogOpeningBox extends DialogNoNavBarFullScreen {
    public static final int $stable = 8;

    @NotNull
    public final TuningSubmenuBoxBinding binding;

    @Nullable
    public TuningBoxAdapter boxAdapter;

    @NotNull
    public final Context context;

    @Nullable
    public TuneObj currentBoxObj;

    @NotNull
    public final LifecycleCoroutineScope currentScope;

    @NotNull
    public final TuningDetailsListViewModel detailListViewModel;

    /* renamed from: handler$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy handler;
    public boolean ifSavedStatus;

    @NotNull
    public final TuningMainViewModel tuningViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogOpeningBox(@NotNull LifecycleCoroutineScope currentScope, int i, @NotNull TuningDetailsListViewModel detailListViewModel, @NotNull TuningMainViewModel tuningViewModel, @NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(currentScope, "currentScope");
        Intrinsics.checkNotNullParameter(detailListViewModel, "detailListViewModel");
        Intrinsics.checkNotNullParameter(tuningViewModel, "tuningViewModel");
        Intrinsics.checkNotNullParameter(context, "context");
        this.currentScope = currentScope;
        this.detailListViewModel = detailListViewModel;
        this.tuningViewModel = tuningViewModel;
        this.context = context;
        this.handler = LazyKt__LazyJVMKt.lazy(new Function0<Handler>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.DialogOpeningBox$handler$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Handler invoke() {
                return new Handler(Looper.getMainLooper());
            }
        });
        Object systemService = context.getSystemService("layout_inflater");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        TuningSubmenuBoxBinding tuningSubmenuBoxBindingInflate = TuningSubmenuBoxBinding.inflate((LayoutInflater) systemService);
        Intrinsics.checkNotNullExpressionValue(tuningSubmenuBoxBindingInflate, "inflate(...)");
        this.binding = tuningSubmenuBoxBindingInflate;
        detailListViewModel.initItemsForBoxList(i);
    }

    public final Handler getHandler() {
        return (Handler) this.handler.getValue();
    }

    public final boolean getIfSavedStatus() {
        return this.ifSavedStatus;
    }

    @Override // com.blackhub.bronline.game.common.DialogNoNavBarFullScreen
    @NotNull
    public View getContentView() {
        RelativeLayout root = this.binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // com.blackhub.bronline.game.common.DialogNoNavBarFullScreen
    public void initListeners() {
        final TuningSubmenuBoxBinding tuningSubmenuBoxBinding = this.binding;
        tuningSubmenuBoxBinding.buttonExitCardView.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.tuning.ui.DialogOpeningBox$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialogOpeningBox.initListeners$lambda$8$lambda$0(this.f$0, view);
            }
        });
        tuningSubmenuBoxBinding.tuningPriceBox.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.tuning.ui.DialogOpeningBox$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialogOpeningBox.initListeners$lambda$8$lambda$1(this.f$0, view);
            }
        });
        tuningSubmenuBoxBinding.boxCardInvisible.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.tuning.ui.DialogOpeningBox$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Resources.NotFoundException {
                DialogOpeningBox.initListeners$lambda$8$lambda$4(this.f$0, tuningSubmenuBoxBinding, view);
            }
        });
        tuningSubmenuBoxBinding.boxCardVisible.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.tuning.ui.DialogOpeningBox$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialogOpeningBox.initListeners$lambda$8$lambda$5(this.f$0, view);
            }
        });
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.blackhub.bronline.game.gui.tuning.ui.DialogOpeningBox$$ExternalSyntheticLambda4
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                DialogOpeningBox.initListeners$lambda$8$lambda$7(this.f$0, dialogInterface);
            }
        });
    }

    public static final void initListeners$lambda$8$lambda$0(final DialogOpeningBox this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(view, "view");
        AnyExtensionKt.setActionOnAnimationEnd(this$0.getAnim(), new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.DialogOpeningBox$initListeners$1$1$1
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
                this.this$0.dismiss();
            }
        });
        view.startAnimation(this$0.getAnim());
    }

    public static final void initListeners$lambda$8$lambda$1(final DialogOpeningBox this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(view, "view");
        AnyExtensionKt.setActionOnAnimationEnd(this$0.getAnim(), new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.DialogOpeningBox$initListeners$1$2$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() throws JSONException {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() throws JSONException {
                if (this.this$0.currentBoxObj != null) {
                    TuneObj tuneObj = this.this$0.currentBoxObj;
                    Intrinsics.checkNotNull(tuneObj);
                    this.this$0.detailListViewModel.openBox(tuneObj.getId());
                }
            }
        });
        view.startAnimation(this$0.getAnim());
    }

    public static final void initListeners$lambda$8$lambda$4(final DialogOpeningBox this$0, final TuningSubmenuBoxBinding this_with, View view) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_with, "$this_with");
        if (this$0.getTimeChecker().ifAccess(1600L)) {
            this$0.ifSavedStatus = false;
            this_with.bgBoxOpenCard.setVisibility(4);
            this$0.startRotationAnim();
            this_with.boxCardVisible.setVisibility(0);
            this$0.getHandler().postDelayed(new Runnable() { // from class: com.blackhub.bronline.game.gui.tuning.ui.DialogOpeningBox$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    DialogOpeningBox.initListeners$lambda$8$lambda$4$lambda$2(this_with);
                }
            }, 800L);
            this$0.getHandler().postDelayed(new Runnable() { // from class: com.blackhub.bronline.game.gui.tuning.ui.DialogOpeningBox$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    DialogOpeningBox.initListeners$lambda$8$lambda$4$lambda$3(this_with, this$0);
                }
            }, 1500L);
        }
    }

    public static final void initListeners$lambda$8$lambda$4$lambda$2(TuningSubmenuBoxBinding this_with) {
        Intrinsics.checkNotNullParameter(this_with, "$this_with");
        this_with.boxCardInvisible.setVisibility(8);
    }

    public static final void initListeners$lambda$8$lambda$4$lambda$3(TuningSubmenuBoxBinding this_with, DialogOpeningBox this$0) {
        Intrinsics.checkNotNullParameter(this_with, "$this_with");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this_with.bgBoxOpenCard.setVisibility(0);
        this_with.bgBoxOpenCard.setBackground(AppCompatResources.getDrawable(this$0.context, R.drawable.tuning_bg_box_card_visible));
    }

    public static final void initListeners$lambda$8$lambda$5(DialogOpeningBox this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismiss();
    }

    public static final void initListeners$lambda$8$lambda$7(DialogOpeningBox this$0, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        TuningDetailsListViewModel tuningDetailsListViewModel = this$0.detailListViewModel;
        tuningDetailsListViewModel.setNewStatusForDialogBox(false);
        this$0.tuningViewModel.setVisibleMainRoot(true);
        if (!this$0.ifSavedStatus) {
            tuningDetailsListViewModel.setNewPresent(null);
            this$0.removeObservers();
        }
        this$0.getHandler().removeCallbacksAndMessages(null);
    }

    public final void startRotationAnim() throws Resources.NotFoundException {
        TuningSubmenuBoxBinding tuningSubmenuBoxBinding = this.binding;
        Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(this.context, R.animator.flip_out);
        Intrinsics.checkNotNull(animatorLoadAnimator, "null cannot be cast to non-null type android.animation.AnimatorSet");
        AnimatorSet animatorSet = (AnimatorSet) animatorLoadAnimator;
        animatorSet.setTarget(tuningSubmenuBoxBinding.boxCardInvisible);
        Animator animatorLoadAnimator2 = AnimatorInflater.loadAnimator(this.context, R.animator.flip_in);
        Intrinsics.checkNotNull(animatorLoadAnimator2, "null cannot be cast to non-null type android.animation.AnimatorSet");
        AnimatorSet animatorSet2 = (AnimatorSet) animatorLoadAnimator2;
        animatorSet2.setTarget(tuningSubmenuBoxBinding.boxCardVisible);
        animatorSet.start();
        animatorSet2.start();
    }

    /* compiled from: DialogOpeningBox.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.tuning.ui.DialogOpeningBox$removeObservers$1", m7120f = "DialogOpeningBox.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.tuning.ui.DialogOpeningBox$removeObservers$1 */
    public static final class C45701 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object L$0;
        public int label;

        public C45701(Continuation<? super C45701> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C45701 c45701 = new C45701(continuation);
            c45701.L$0 = obj;
            return c45701;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C45701) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScopeKt.cancel$default((CoroutineScope) this.L$0, null, 1, null);
            return Unit.INSTANCE;
        }
    }

    public final void removeObservers() {
        this.currentScope.launchWhenStarted(new C45701(null));
    }

    public final void showDialogOpeningBox() {
        if (!this.ifSavedStatus) {
            setObservers();
        }
        this.detailListViewModel.setNewStatusForDialogBox(true);
        this.tuningViewModel.setVisibleMainRoot(false);
        show();
    }

    /* compiled from: DialogOpeningBox.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.tuning.ui.DialogOpeningBox$setObservers$1", m7120f = "DialogOpeningBox.kt", m7121i = {}, m7122l = {Cea708Decoder.COMMAND_DLY}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.tuning.ui.DialogOpeningBox$setObservers$1 */
    public static final class C45711 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C45711(Continuation<? super C45711> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DialogOpeningBox.this.new C45711(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C45711) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<List<TuningBoxItemObj>> newItemsForBox = DialogOpeningBox.this.detailListViewModel.getNewItemsForBox();
                final DialogOpeningBox dialogOpeningBox = DialogOpeningBox.this;
                FlowCollector<? super List<TuningBoxItemObj>> flowCollector = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.tuning.ui.DialogOpeningBox.setObservers.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((List<TuningBoxItemObj>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(@NotNull List<TuningBoxItemObj> list, @NotNull Continuation<? super Unit> continuation) {
                        dialogOpeningBox.initItems(list);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (newItemsForBox.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    public final void setObservers() {
        this.currentScope.launchWhenStarted(new C45711(null));
        this.currentScope.launchWhenStarted(new C45722(null));
        this.currentScope.launchWhenStarted(new C45733(null));
    }

    /* compiled from: DialogOpeningBox.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.tuning.ui.DialogOpeningBox$setObservers$2", m7120f = "DialogOpeningBox.kt", m7121i = {}, m7122l = {Cea708Decoder.COMMAND_SPL}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.tuning.ui.DialogOpeningBox$setObservers$2 */
    public static final class C45722 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C45722(Continuation<? super C45722> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DialogOpeningBox.this.new C45722(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C45722) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<TuneObj> newCurrentBox = DialogOpeningBox.this.detailListViewModel.getNewCurrentBox();
                final DialogOpeningBox dialogOpeningBox = DialogOpeningBox.this;
                FlowCollector<? super TuneObj> flowCollector = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.tuning.ui.DialogOpeningBox.setObservers.2.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((TuneObj) obj2, (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(@Nullable TuneObj tuneObj, @NotNull Continuation<? super Unit> continuation) {
                        if (tuneObj != null) {
                            DialogOpeningBox dialogOpeningBox2 = dialogOpeningBox;
                            dialogOpeningBox2.currentBoxObj = tuneObj;
                            dialogOpeningBox2.setPriceInView(tuneObj.getCost(), tuneObj.getCurrency());
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (newCurrentBox.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: DialogOpeningBox.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.tuning.ui.DialogOpeningBox$setObservers$3", m7120f = "DialogOpeningBox.kt", m7121i = {}, m7122l = {Cea708Decoder.COMMAND_DF2}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.tuning.ui.DialogOpeningBox$setObservers$3 */
    public static final class C45733 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C45733(Continuation<? super C45733> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DialogOpeningBox.this.new C45733(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C45733) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<List<String>> newNamePresent = DialogOpeningBox.this.detailListViewModel.getNewNamePresent();
                final DialogOpeningBox dialogOpeningBox = DialogOpeningBox.this;
                FlowCollector<? super List<String>> flowCollector = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.tuning.ui.DialogOpeningBox.setObservers.3.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((List<String>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(@NotNull List<String> list, @NotNull Continuation<? super Unit> continuation) {
                        dialogOpeningBox.setDataOpeningBox(list);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (newNamePresent.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    public final void initItems(List<TuningBoxItemObj> boxItems) {
        this.boxAdapter = new TuningBoxAdapter(boxItems);
        TuningSubmenuBoxBinding tuningSubmenuBoxBinding = this.binding;
        RecyclerView recyclerView = tuningSubmenuBoxBinding.recvBoxItems;
        recyclerView.setLayoutManager(new LinearLayoutManager(tuningSubmenuBoxBinding.getRoot().getContext(), 1, false));
        recyclerView.setAdapter(this.boxAdapter);
    }

    public final void setPriceInView(int boxCost, int currency) {
        TuningSubmenuBoxBinding tuningSubmenuBoxBinding = this.binding;
        if (currency == 0) {
            tuningSubmenuBoxBinding.tuningPriceBox.setVisibility(0);
            tuningSubmenuBoxBinding.tuningValuePriceBox.setText(tuningSubmenuBoxBinding.getRoot().getContext().getString(R.string.common_string_with_ruble, UsefulKt.getPriceWithSpaces(Integer.valueOf(boxCost))));
        } else if (currency == 1) {
            tuningSubmenuBoxBinding.tuningPriceBox.setVisibility(0);
            tuningSubmenuBoxBinding.tuningValuePriceBox.setText(tuningSubmenuBoxBinding.getRoot().getContext().getString(R.string.common_string_with_bc, UsefulKt.getPriceWithSpaces(Integer.valueOf(boxCost))));
        } else {
            tuningSubmenuBoxBinding.tuningPriceBox.setVisibility(4);
        }
    }

    public final void setDataOpeningBox(List<String> params) {
        if (params.size() >= 2) {
            this.ifSavedStatus = true;
            TuningSubmenuBoxBinding tuningSubmenuBoxBinding = this.binding;
            tuningSubmenuBoxBinding.nameDetailInBox.setText(params.get(0));
            tuningSubmenuBoxBinding.typeDetailInBox.setText(params.get(1));
            setVisibleOpeningBox();
        }
    }

    public final void setVisibleOpeningBox() {
        TuningSubmenuBoxBinding tuningSubmenuBoxBinding = this.binding;
        tuningSubmenuBoxBinding.viewBoxBuying.setVisibility(8);
        tuningSubmenuBoxBinding.blockOpenCards.setVisibility(0);
    }

    public final void closeDialogOpeningBox() {
        dismiss();
    }
}
