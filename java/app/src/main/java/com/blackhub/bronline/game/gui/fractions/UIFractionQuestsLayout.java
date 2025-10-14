package com.blackhub.bronline.game.gui.fractions;

import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.ScrollingMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.blackhub.bronline.databinding.FractionsQuestsLayoutBinding;
import com.blackhub.bronline.game.common.BaseFragment;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.blackhub.bronline.game.gui.fractions.adapters.FractionsQuestsAdapter;
import com.blackhub.bronline.game.gui.fractions.data.FractionQuestsItem;
import com.blackhub.bronline.game.gui.fractions.viewmodel.FractionsQuestsViewModel;
import com.bless.client.R;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.options.IFramePlayerOptions;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

/* compiled from: UIFractionQuestsLayout.kt */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nUIFractionQuestsLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UIFractionQuestsLayout.kt\ncom/blackhub/bronline/game/gui/fractions/UIFractionQuestsLayout\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,135:1\n106#2,15:136\n*S KotlinDebug\n*F\n+ 1 UIFractionQuestsLayout.kt\ncom/blackhub/bronline/game/gui/fractions/UIFractionQuestsLayout\n*L\n28#1:136,15\n*E\n"})

public final class UIFractionQuestsLayout extends BaseFragment<FractionsQuestsLayoutBinding> {
    public static final int $stable = 8;

    @Nullable
    public FractionsQuestsAdapter questsAdapter;

    /* renamed from: questsViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy questsViewModel;

    public UIFractionQuestsLayout() {
        final Function0<ViewModelStoreOwner> function0 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.fractions.UIFractionQuestsLayout$questsViewModel$2
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
        final Lazy lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.fractions.UIFractionQuestsLayout$special$$inlined$viewModels$default$1
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
        this.questsViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(FractionsQuestsViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.fractions.UIFractionQuestsLayout$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.fractions.UIFractionQuestsLayout$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.fractions.UIFractionQuestsLayout$special$$inlined$viewModels$default$4
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
    }

    public final FractionsQuestsViewModel getQuestsViewModel() {
        return (FractionsQuestsViewModel) this.questsViewModel.getValue();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    @NotNull
    public FractionsQuestsLayoutBinding getViewBinding() {
        FractionsQuestsLayoutBinding fractionsQuestsLayoutBindingInflate = FractionsQuestsLayoutBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(fractionsQuestsLayoutBindingInflate, "inflate(...)");
        return fractionsQuestsLayoutBindingInflate;
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    public void initViews() {
        setObservers();
        setupRecyclerView();
    }

    /* compiled from: UIFractionQuestsLayout.kt */
    @Metadata(m7104d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m7105d2 = {"<anonymous>", "", IFramePlayerOptions.Builder.LIST, "", "Lcom/blackhub/bronline/game/gui/fractions/data/FractionQuestsItem;", "kotlin.jvm.PlatformType", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nUIFractionQuestsLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UIFractionQuestsLayout.kt\ncom/blackhub/bronline/game/gui/fractions/UIFractionQuestsLayout$setObservers$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,135:1\n1#2:136\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.fractions.UIFractionQuestsLayout$setObservers$1 */
    /* loaded from: classes3.dex */
    public static final class C40551 extends Lambda implements Function1<List<? extends FractionQuestsItem>, Unit> {
        public C40551() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends FractionQuestsItem> list) {
            invoke2((List<FractionQuestsItem>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2(List<FractionQuestsItem> list) {
            Object next;
            UIFractionQuestsLayout uIFractionQuestsLayout = UIFractionQuestsLayout.this;
            Intrinsics.checkNotNull(list, "null cannot be cast to non-null type kotlin.collections.MutableList<com.blackhub.bronline.game.gui.fractions.data.FractionQuestsItem>");
            uIFractionQuestsLayout.setupQuestsAdapter(TypeIntrinsics.asMutableList(list));
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (((FractionQuestsItem) next).getIsClicked()) {
                        break;
                    }
                }
            }
            FractionQuestsItem fractionQuestsItem = (FractionQuestsItem) next;
            if (fractionQuestsItem != null) {
                UIFractionQuestsLayout.this.setInfoAboutQuest(fractionQuestsItem);
            }
        }
    }

    private final void setObservers() {
        getQuestsViewModel().getQuestsLiveData().observe(getViewLifecycleOwner(), new UIFractionQuestsLayout$sam$androidx_lifecycle_Observer$0(new Function1<List<? extends FractionQuestsItem>, Unit>() { // from class: com.blackhub.bronline.game.gui.fractions.UIFractionQuestsLayout.setObservers.1
            public C40551() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends FractionQuestsItem> list) {
                invoke2((List<FractionQuestsItem>) list);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2(List<FractionQuestsItem> list) {
                Object next;
                UIFractionQuestsLayout uIFractionQuestsLayout = UIFractionQuestsLayout.this;
                Intrinsics.checkNotNull(list, "null cannot be cast to non-null type kotlin.collections.MutableList<com.blackhub.bronline.game.gui.fractions.data.FractionQuestsItem>");
                uIFractionQuestsLayout.setupQuestsAdapter(TypeIntrinsics.asMutableList(list));
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        if (((FractionQuestsItem) next).getIsClicked()) {
                            break;
                        }
                    }
                }
                FractionQuestsItem fractionQuestsItem = (FractionQuestsItem) next;
                if (fractionQuestsItem != null) {
                    UIFractionQuestsLayout.this.setInfoAboutQuest(fractionQuestsItem);
                }
            }
        }));
    }

    private final void setupRecyclerView() {
        getBinding().recyclerViewTasksList.setLayoutManager(new LinearLayoutManager(getBinding().getRoot().getContext(), 1, false));
    }

    public final void setupQuestsAdapter(List<FractionQuestsItem> list) {
        this.questsAdapter = new FractionsQuestsAdapter(list);
        setLogicForOnQuestItemClick();
        getBinding().recyclerViewTasksList.setAdapter(this.questsAdapter);
    }

    /* compiled from: UIFractionQuestsLayout.kt */
    @Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m7105d2 = {"<anonymous>", "", "clickedItem", "Lcom/blackhub/bronline/game/gui/fractions/data/FractionQuestsItem;", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.gui.fractions.UIFractionQuestsLayout$setLogicForOnQuestItemClick$1 */
    /* loaded from: classes3.dex */
    public static final class C40541 extends Lambda implements Function1<FractionQuestsItem, Unit> {
        public C40541() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FractionQuestsItem fractionQuestsItem) {
            invoke2(fractionQuestsItem);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2(@NotNull FractionQuestsItem clickedItem) {
            Intrinsics.checkNotNullParameter(clickedItem, "clickedItem");
            UIFractionQuestsLayout.this.setInfoAboutQuest(clickedItem);
        }
    }

    public final void setLogicForOnQuestItemClick() {
        FractionsQuestsAdapter fractionsQuestsAdapter = this.questsAdapter;
        if (fractionsQuestsAdapter == null) {
            return;
        }
        fractionsQuestsAdapter.setOnQuestItemClickListener(new Function1<FractionQuestsItem, Unit>() { // from class: com.blackhub.bronline.game.gui.fractions.UIFractionQuestsLayout.setLogicForOnQuestItemClick.1
            public C40541() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(FractionQuestsItem fractionQuestsItem) {
                invoke2(fractionQuestsItem);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2(@NotNull FractionQuestsItem clickedItem) {
                Intrinsics.checkNotNullParameter(clickedItem, "clickedItem");
                UIFractionQuestsLayout.this.setInfoAboutQuest(clickedItem);
            }
        });
    }

    public final void setInfoAboutQuest(final FractionQuestsItem clickedItem) {
        String string = getString(R.string.fractions_quest_title);
        SpannableString spannableString = new SpannableString(getString(R.string.common_string_in_quotes, clickedItem.getTitle()));
        spannableString.setSpan(new ForegroundColorSpan(ContextCompat.getColor(getBinding().getRoot().getContext(), R.color.yellow)), 0, spannableString.length(), 33);
        Unit unit = Unit.INSTANCE;
        CharSequence charSequenceConcat = TextUtils.concat(string, spannableString);
        FractionsQuestsLayoutBinding binding = getBinding();
        TextView textView = binding.questsTitle;
        Intrinsics.checkNotNull(charSequenceConcat);
        textView.setText(UtilsKt.transformSpannableToUpperCase(charSequenceConcat));
        TextView textView2 = binding.valueGoalsDescription;
        textView2.setText(clickedItem.getGoal());
        textView2.setScrollY(10);
        textView2.setMovementMethod(new ScrollingMovementMethod());
        TextView textView3 = binding.valueQuestsDescription;
        textView3.setText(clickedItem.getDescription());
        textView3.setScrollY(10);
        textView3.setMovementMethod(new ScrollingMovementMethod());
        if (clickedItem.getMoneyReward() == 0) {
            binding.award2Value.setVisibility(4);
            binding.award2Item.setVisibility(4);
        } else {
            binding.award2Value.setVisibility(0);
            binding.award2Item.setVisibility(0);
            binding.award2Value.setText(getString(R.string.common_string_with_ruble, String.valueOf(clickedItem.getMoneyReward())));
        }
        binding.award1Value.setText(getString(R.string.fractions_quests_award_2, Integer.valueOf(clickedItem.getScoreReward())));
        if (clickedItem.getScoreReward() < 0) {
            binding.award1Item.setImageResource(R.drawable.ic_gold_down);
        } else {
            binding.award1Item.setImageResource(R.drawable.ic_gold_up);
        }
        if (clickedItem.getTokenReward() == 0) {
            binding.award3Item.setVisibility(4);
            binding.award3Value.setVisibility(4);
        } else {
            binding.award3Item.setVisibility(0);
            binding.award3Value.setVisibility(0);
            binding.award3Value.setText(getString(R.string.fractions_quests_award_3, Integer.valueOf(clickedItem.getTokenReward())));
        }
        AppCompatButton buttonStartQuest = binding.buttonStartQuest;
        Intrinsics.checkNotNullExpressionValue(buttonStartQuest, "buttonStartQuest");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, buttonStartQuest, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.fractions.UIFractionQuestsLayout$setInfoAboutQuest$1$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                this.this$0.getQuestsViewModel().sendStartQuest(clickedItem.getId());
            }
        }, 1, null);
    }
}

