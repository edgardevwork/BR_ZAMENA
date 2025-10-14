package com.blackhub.bronline.game.gui.entertainmentsystem.p014ui;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentStateManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blackhub.bronline.databinding.EntertainmentSystemDialogInfoBinding;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.gui.UsefulKt;
import com.blackhub.bronline.game.gui.entertainmentsystem.data.EntertainmentGameData;
import com.blackhub.bronline.game.gui.entertainmentsystem.viewmodel.EntertainmentGamesViewModel;
import com.bless.client.R;
import com.caverock.androidsvg.SVG;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
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
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DialogGameInfo.kt */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nDialogGameInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialogGameInfo.kt\ncom/blackhub/bronline/game/gui/entertainmentsystem/ui/DialogGameInfo\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,96:1\n106#2,15:97\n*S KotlinDebug\n*F\n+ 1 DialogGameInfo.kt\ncom/blackhub/bronline/game/gui/entertainmentsystem/ui/DialogGameInfo\n*L\n24#1:97,15\n*E\n"})
/* loaded from: classes3.dex */
public final class DialogGameInfo extends DialogFragment {
    public static final int $stable = 8;

    @Nullable
    public EntertainmentSystemDialogInfoBinding _binding;

    /* renamed from: anim$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy anim;

    @NotNull
    public final Context context;

    /* renamed from: gamesViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy gamesViewModel;

    public DialogGameInfo(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        final Function0<ViewModelStoreOwner> function0 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.entertainmentsystem.ui.DialogGameInfo$gamesViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                Fragment fragmentRequireParentFragment = this.this$0.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        };
        final Lazy lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.entertainmentsystem.ui.DialogGameInfo$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }
        });
        final Function0 function02 = null;
        this.gamesViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(EntertainmentGamesViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.entertainmentsystem.ui.DialogGameInfo$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.entertainmentsystem.ui.DialogGameInfo$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function03 = function02;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM14065viewModels$lambda1 = FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM14065viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM14065viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.entertainmentsystem.ui.DialogGameInfo$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM14065viewModels$lambda1 = FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM14065viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM14065viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory != null && (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory;
                }
                ViewModelProvider.Factory defaultViewModelProviderFactory2 = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory2;
            }
        });
        this.anim = LazyKt__LazyJVMKt.lazy(new Function0<Animation>() { // from class: com.blackhub.bronline.game.gui.entertainmentsystem.ui.DialogGameInfo$anim$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Animation invoke() {
                return AnimationUtils.loadAnimation(this.this$0.context, R.anim.button_click);
            }
        });
    }

    public final EntertainmentGamesViewModel getGamesViewModel() {
        return (EntertainmentGamesViewModel) this.gamesViewModel.getValue();
    }

    public final EntertainmentSystemDialogInfoBinding getBinding() {
        EntertainmentSystemDialogInfoBinding entertainmentSystemDialogInfoBinding = this._binding;
        Intrinsics.checkNotNull(entertainmentSystemDialogInfoBinding);
        return entertainmentSystemDialogInfoBinding;
    }

    private final Animation getAnim() {
        return (Animation) this.anim.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        EntertainmentSystemDialogInfoBinding entertainmentSystemDialogInfoBindingInflate = EntertainmentSystemDialogInfoBinding.inflate(inflater);
        this._binding = entertainmentSystemDialogInfoBindingInflate;
        if (entertainmentSystemDialogInfoBindingInflate != null) {
            return entertainmentSystemDialogInfoBindingInflate.getRoot();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        setObservers();
        initClickListeners();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        Window window2;
        Dialog dialog = getDialog();
        if (dialog != null && (window2 = dialog.getWindow()) != null) {
            window2.setFlags(8, 8);
        }
        super.onStart();
        Dialog dialog2 = getDialog();
        if (dialog2 == null || (window = dialog2.getWindow()) == null) {
            return;
        }
        window.setLayout(-1, -1);
        window.setBackgroundDrawable(new ColorDrawable(0));
        UsefulKt.hideSystemUIWindow(window);
        window.clearFlags(8);
    }

    /* compiled from: DialogGameInfo.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.entertainmentsystem.ui.DialogGameInfo$setObservers$1", m7120f = "DialogGameInfo.kt", m7121i = {}, m7122l = {65}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.entertainmentsystem.ui.DialogGameInfo$setObservers$1 */
    public static final class C39951 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C39951(Continuation<? super C39951> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DialogGameInfo.this.new C39951(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C39951) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: DialogGameInfo.kt */
        @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m7105d2 = {"<anonymous>", "", "it", "Lcom/blackhub/bronline/game/gui/entertainmentsystem/data/EntertainmentGameData;", "emit", "(Lcom/blackhub/bronline/game/gui/entertainmentsystem/data/EntertainmentGameData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        /* renamed from: com.blackhub.bronline.game.gui.entertainmentsystem.ui.DialogGameInfo$setObservers$1$1 */
        /* loaded from: classes.dex */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public AnonymousClass1() {
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((EntertainmentGameData) obj, (Continuation<? super Unit>) continuation);
            }

            @Nullable
            public final Object emit(@Nullable EntertainmentGameData entertainmentGameData, @NotNull Continuation<? super Unit> continuation) {
                if (entertainmentGameData != null) {
                    dialogGameInfo.initDialogInfo(entertainmentGameData.getGamesName(), entertainmentGameData.getDescription());
                }
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<EntertainmentGameData> clickedGame = DialogGameInfo.this.getGamesViewModel().getClickedGame();
                AnonymousClass1 anonymousClass1 = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.entertainmentsystem.ui.DialogGameInfo.setObservers.1.1
                    public AnonymousClass1() {
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((EntertainmentGameData) obj2, (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(@Nullable EntertainmentGameData entertainmentGameData, @NotNull Continuation<? super Unit> continuation) {
                        if (entertainmentGameData != null) {
                            dialogGameInfo.initDialogInfo(entertainmentGameData.getGamesName(), entertainmentGameData.getDescription());
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (clickedGame.collect(anonymousClass1, this) == coroutine_suspended) {
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

    private final void setObservers() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner).launchWhenStarted(new C39951(null));
    }

    public final void initDialogInfo(String gamesTitle, String gamesDescription) {
        EntertainmentSystemDialogInfoBinding binding = getBinding();
        TextView textView = binding.dialogInfoTitleItem;
        if (gamesTitle == null) {
            gamesTitle = "";
        }
        textView.setText(gamesTitle);
        TextView textView2 = binding.dialogInfoBodyItem;
        if (gamesDescription == null) {
            gamesDescription = "";
        }
        textView2.setText(gamesDescription);
    }

    public final void initClickListeners() {
        getBinding().dialogInfoButtonClose.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.entertainmentsystem.ui.DialogGameInfo$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialogGameInfo.initClickListeners$lambda$2(this.f$0, view);
            }
        });
    }

    public static final void initClickListeners$lambda$2(final DialogGameInfo this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Animation anim = this$0.getAnim();
        Intrinsics.checkNotNullExpressionValue(anim, "<get-anim>(...)");
        AnyExtensionKt.setActionOnAnimationEnd(anim, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.entertainmentsystem.ui.DialogGameInfo$initClickListeners$1$1
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

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this._binding = null;
        super.onDestroyView();
    }
}

