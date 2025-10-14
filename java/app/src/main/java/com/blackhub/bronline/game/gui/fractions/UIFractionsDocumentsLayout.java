package com.blackhub.bronline.game.gui.fractions;

import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.databinding.FractionsDocumentsLayoutBinding;
import com.blackhub.bronline.game.common.BaseFragment;
import com.blackhub.bronline.game.gui.fractions.adapters.FractionsDocumentsAdapter;
import com.blackhub.bronline.game.gui.fractions.data.FractionsDocumentsItem;
import com.blackhub.bronline.game.gui.fractions.viewmodel.FractionsDocumentsViewModel;
import com.bless.client.R;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.options.IFramePlayerOptions;
import java.util.ArrayList;
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

/* compiled from: UIFractionsDocumentsLayout.kt */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nUIFractionsDocumentsLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UIFractionsDocumentsLayout.kt\ncom/blackhub/bronline/game/gui/fractions/UIFractionsDocumentsLayout\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,120:1\n106#2,15:121\n*S KotlinDebug\n*F\n+ 1 UIFractionsDocumentsLayout.kt\ncom/blackhub/bronline/game/gui/fractions/UIFractionsDocumentsLayout\n*L\n22#1:121,15\n*E\n"})

public final class UIFractionsDocumentsLayout extends BaseFragment<FractionsDocumentsLayoutBinding> {
    public static final int $stable = 8;
    public int documentId = -1;
    public int documentNumber = -1;

    /* renamed from: documentsViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy documentsViewModel;

    public UIFractionsDocumentsLayout() {
        final Function0<ViewModelStoreOwner> function0 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.fractions.UIFractionsDocumentsLayout$documentsViewModel$2
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
        final Lazy lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.fractions.UIFractionsDocumentsLayout$special$$inlined$viewModels$default$1
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
        this.documentsViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(FractionsDocumentsViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.fractions.UIFractionsDocumentsLayout$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.fractions.UIFractionsDocumentsLayout$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.fractions.UIFractionsDocumentsLayout$special$$inlined$viewModels$default$4
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

    public final FractionsDocumentsViewModel getDocumentsViewModel() {
        return (FractionsDocumentsViewModel) this.documentsViewModel.getValue();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    @NotNull
    public FractionsDocumentsLayoutBinding getViewBinding() {
        FractionsDocumentsLayoutBinding fractionsDocumentsLayoutBindingInflate = FractionsDocumentsLayoutBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(fractionsDocumentsLayoutBindingInflate, "inflate(...)");
        return fractionsDocumentsLayoutBindingInflate;
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    public void initViews() {
        setupObservers();
        setupRecyclerView();
        setupButtonClickListeners();
    }

    /* compiled from: UIFractionsDocumentsLayout.kt */
    @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.gui.fractions.UIFractionsDocumentsLayout$setupButtonClickListeners$1 */
    /* loaded from: classes3.dex */
    public static final class C40741 extends Lambda implements Function0<Unit> {
        public C40741() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() throws JSONException {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2() throws JSONException {
            UIFractionsDocumentsLayout.this.getDocumentsViewModel().sendButtonAcquaintedPressed(UIFractionsDocumentsLayout.this.documentId, UIFractionsDocumentsLayout.this.documentNumber);
            UIFractionsDocumentsLayout.this.getDocumentsViewModel().setTestingList(UIFractionsDocumentsLayout.this.documentId);
        }
    }

    private final void setupButtonClickListeners() {
        AppCompatButton buttonAcquaintedWithDocument = getBinding().buttonAcquaintedWithDocument;
        Intrinsics.checkNotNullExpressionValue(buttonAcquaintedWithDocument, "buttonAcquaintedWithDocument");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, buttonAcquaintedWithDocument, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.fractions.UIFractionsDocumentsLayout.setupButtonClickListeners.1
            public C40741() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() throws JSONException {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2() throws JSONException {
                UIFractionsDocumentsLayout.this.getDocumentsViewModel().sendButtonAcquaintedPressed(UIFractionsDocumentsLayout.this.documentId, UIFractionsDocumentsLayout.this.documentNumber);
                UIFractionsDocumentsLayout.this.getDocumentsViewModel().setTestingList(UIFractionsDocumentsLayout.this.documentId);
            }
        }, 1, null);
    }

    /* compiled from: UIFractionsDocumentsLayout.kt */
    @Metadata(m7104d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0005"}, m7105d2 = {"<anonymous>", "", IFramePlayerOptions.Builder.LIST, "", "Lcom/blackhub/bronline/game/gui/fractions/data/FractionsDocumentsItem;", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nUIFractionsDocumentsLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UIFractionsDocumentsLayout.kt\ncom/blackhub/bronline/game/gui/fractions/UIFractionsDocumentsLayout$setupObservers$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,120:1\n1#2:121\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.fractions.UIFractionsDocumentsLayout$setupObservers$1 */
    /* loaded from: classes3.dex */
    public static final class C40751 extends Lambda implements Function1<List<? extends FractionsDocumentsItem>, Unit> {
        public C40751() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends FractionsDocumentsItem> list) {
            invoke2((List<FractionsDocumentsItem>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2(@Nullable List<FractionsDocumentsItem> list) {
            Object next;
            UIFractionsDocumentsLayout uIFractionsDocumentsLayout = UIFractionsDocumentsLayout.this;
            Intrinsics.checkNotNull(list, "null cannot be cast to non-null type kotlin.collections.MutableList<com.blackhub.bronline.game.gui.fractions.data.FractionsDocumentsItem>");
            uIFractionsDocumentsLayout.setDocumentsAdapter(TypeIntrinsics.asMutableList(list));
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (((FractionsDocumentsItem) next).isClicked()) {
                        break;
                    }
                }
            }
            FractionsDocumentsItem fractionsDocumentsItem = (FractionsDocumentsItem) next;
            if (fractionsDocumentsItem != null) {
                UIFractionsDocumentsLayout uIFractionsDocumentsLayout2 = UIFractionsDocumentsLayout.this;
                uIFractionsDocumentsLayout2.documentNumber = list.indexOf(fractionsDocumentsItem);
                if (fractionsDocumentsItem.getDocumentStatus()) {
                    uIFractionsDocumentsLayout2.hideButtonAcquainted();
                } else {
                    uIFractionsDocumentsLayout2.showButtonAcquainted();
                }
                uIFractionsDocumentsLayout2.setupDescription(fractionsDocumentsItem);
                uIFractionsDocumentsLayout2.setupDocumentTitle(fractionsDocumentsItem);
                uIFractionsDocumentsLayout2.documentId = fractionsDocumentsItem.getDocumentId();
            }
        }
    }

    private final void setupObservers() {
        getDocumentsViewModel().getDocumentsListLivedata().observe(getViewLifecycleOwner(), new UIFractionsDocumentsLayout$sam$androidx_lifecycle_Observer$0(new Function1<List<? extends FractionsDocumentsItem>, Unit>() { // from class: com.blackhub.bronline.game.gui.fractions.UIFractionsDocumentsLayout.setupObservers.1
            public C40751() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends FractionsDocumentsItem> list) {
                invoke2((List<FractionsDocumentsItem>) list);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2(@Nullable List<FractionsDocumentsItem> list) {
                Object next;
                UIFractionsDocumentsLayout uIFractionsDocumentsLayout = UIFractionsDocumentsLayout.this;
                Intrinsics.checkNotNull(list, "null cannot be cast to non-null type kotlin.collections.MutableList<com.blackhub.bronline.game.gui.fractions.data.FractionsDocumentsItem>");
                uIFractionsDocumentsLayout.setDocumentsAdapter(TypeIntrinsics.asMutableList(list));
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        if (((FractionsDocumentsItem) next).isClicked()) {
                            break;
                        }
                    }
                }
                FractionsDocumentsItem fractionsDocumentsItem = (FractionsDocumentsItem) next;
                if (fractionsDocumentsItem != null) {
                    UIFractionsDocumentsLayout uIFractionsDocumentsLayout2 = UIFractionsDocumentsLayout.this;
                    uIFractionsDocumentsLayout2.documentNumber = list.indexOf(fractionsDocumentsItem);
                    if (fractionsDocumentsItem.getDocumentStatus()) {
                        uIFractionsDocumentsLayout2.hideButtonAcquainted();
                    } else {
                        uIFractionsDocumentsLayout2.showButtonAcquainted();
                    }
                    uIFractionsDocumentsLayout2.setupDescription(fractionsDocumentsItem);
                    uIFractionsDocumentsLayout2.setupDocumentTitle(fractionsDocumentsItem);
                    uIFractionsDocumentsLayout2.documentId = fractionsDocumentsItem.getDocumentId();
                }
            }
        }));
    }

    private final void setupRecyclerView() {
        RecyclerView recyclerView = getBinding().recyclerViewTasksList;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        recyclerView.setAdapter(new FractionsDocumentsAdapter(new ArrayList()));
    }

    public final void setDocumentsAdapter(final List<FractionsDocumentsItem> list) {
        RecyclerView recyclerView = getBinding().recyclerViewTasksList;
        FractionsDocumentsAdapter fractionsDocumentsAdapter = new FractionsDocumentsAdapter(list);
        fractionsDocumentsAdapter.setOnItemClickListener(new Function1<FractionsDocumentsItem, Unit>() { // from class: com.blackhub.bronline.game.gui.fractions.UIFractionsDocumentsLayout$setDocumentsAdapter$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(FractionsDocumentsItem fractionsDocumentsItem) {
                invoke2(fractionsDocumentsItem);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull FractionsDocumentsItem item) {
                Intrinsics.checkNotNullParameter(item, "item");
                if (item.getDocumentStatus()) {
                    this.this$0.hideButtonAcquainted();
                } else {
                    this.this$0.showButtonAcquainted();
                }
                this.this$0.documentNumber = list.indexOf(item);
                this.this$0.documentId = item.getDocumentId();
                this.this$0.setupDescription(item);
                this.this$0.setupDocumentTitle(item);
            }
        });
        recyclerView.setAdapter(fractionsDocumentsAdapter);
    }

    public final void hideButtonAcquainted() {
        getBinding().buttonAcquaintedWithDocument.setVisibility(4);
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(getBinding().getRoot());
        constraintSet.connect(R.id.text_view_document_description, 4, R.id.body_right_block, 4);
        constraintSet.applyTo(getBinding().getRoot());
    }

    public final void showButtonAcquainted() {
        getBinding().buttonAcquaintedWithDocument.setVisibility(0);
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(getBinding().getRoot());
        constraintSet.connect(R.id.text_view_document_description, 4, R.id.button_acquainted_with_document, 3);
        constraintSet.applyTo(getBinding().getRoot());
    }

    public final void setupDescription(FractionsDocumentsItem item) {
        TextView textView = getBinding().textViewDocumentDescription;
        textView.setText(item.getDescription());
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setScrollY(10);
    }

    public final void setupDocumentTitle(FractionsDocumentsItem item) {
        TextView textView = getBinding().textViewDocumentTitle;
        textView.setText(item.getTitle());
        textView.setSelected(true);
    }
}

