package com.blackhub.bronline.game.gui.tuning.p017ui;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.databinding.TuningSubmenuViewBinding;
import com.blackhub.bronline.game.common.DialogNoNavBarFullScreen;
import com.blackhub.bronline.game.gui.tuning.adapters.TuningSubmenuItemsAdapter;
import com.blackhub.bronline.game.gui.tuning.data.TuneGuiNodeObj;
import com.blackhub.bronline.game.gui.tuning.viewmodel.TuningMainViewModel;
import com.caverock.androidsvg.SVG;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DialogSubmenu.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class DialogSubmenu extends DialogNoNavBarFullScreen {
    public static final int $stable = 8;

    @NotNull
    public final TuningSubmenuViewBinding binding;
    public Function3<? super TuneGuiNodeObj, ? super Integer, ? super View, Unit> submenuClickListener;

    @NotNull
    public final TuningSubmenuItemsAdapter submenuItemsAdapter;

    @NotNull
    public final TuningMainViewModel tuningViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogSubmenu(@NotNull Context context, @NotNull TuningMainViewModel tuningViewModel) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(tuningViewModel, "tuningViewModel");
        this.tuningViewModel = tuningViewModel;
        Object systemService = context.getSystemService("layout_inflater");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        TuningSubmenuViewBinding tuningSubmenuViewBindingInflate = TuningSubmenuViewBinding.inflate((LayoutInflater) systemService);
        Intrinsics.checkNotNullExpressionValue(tuningSubmenuViewBindingInflate, "inflate(...)");
        this.binding = tuningSubmenuViewBindingInflate;
        TuningSubmenuItemsAdapter tuningSubmenuItemsAdapter = new TuningSubmenuItemsAdapter();
        this.submenuItemsAdapter = tuningSubmenuItemsAdapter;
        setCancelable(false);
        RecyclerView recyclerView = tuningSubmenuViewBindingInflate.recvSubmenuItems;
        recyclerView.setLayoutManager(new GridLayoutManager(context, 3));
        recyclerView.setAdapter(tuningSubmenuItemsAdapter);
    }

    @NotNull
    public final Function3<TuneGuiNodeObj, Integer, View, Unit> getSubmenuClickListener() {
        Function3 function3 = this.submenuClickListener;
        if (function3 != null) {
            return function3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("submenuClickListener");
        return null;
    }

    public final void setSubmenuClickListener(@NotNull Function3<? super TuneGuiNodeObj, ? super Integer, ? super View, Unit> function3) {
        Intrinsics.checkNotNullParameter(function3, "<set-?>");
        this.submenuClickListener = function3;
    }

    @Override // com.blackhub.bronline.game.common.DialogNoNavBarFullScreen
    @NotNull
    public View getContentView() {
        LinearLayout root = this.binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // com.blackhub.bronline.game.common.DialogNoNavBarFullScreen
    public void initListeners() {
        this.binding.tuningSubmenuClose.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.tuning.ui.DialogSubmenu$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialogSubmenu.initListeners$lambda$2(this.f$0, view);
            }
        });
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.blackhub.bronline.game.gui.tuning.ui.DialogSubmenu$$ExternalSyntheticLambda1
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                DialogSubmenu.initListeners$lambda$3(this.f$0, dialogInterface);
            }
        });
        initItemClickListener();
    }

    public static final void initListeners$lambda$2(final DialogSubmenu this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.getTimeChecker().ifAccess(250L)) {
            view.startAnimation(this$0.getAnim());
            this$0.tuningViewModel.setCurrentLayout(0);
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.blackhub.bronline.game.gui.tuning.ui.DialogSubmenu$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    DialogSubmenu.initListeners$lambda$2$lambda$1(this.f$0);
                }
            }, 100L);
        }
    }

    public static final void initListeners$lambda$2$lambda$1(DialogSubmenu this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismiss();
    }

    public static final void initListeners$lambda$3(DialogSubmenu this$0, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.tuningViewModel.setVisibleMainRoot(true);
    }

    public final void showSubmenu(@NotNull List<TuneGuiNodeObj> submenuItems) {
        Intrinsics.checkNotNullParameter(submenuItems, "submenuItems");
        if (isShowing()) {
            return;
        }
        this.submenuItemsAdapter.initItems(submenuItems);
        show();
    }

    public final void backPress() {
        if (this.submenuItemsAdapter.getItemCount() == 0 || isShowing()) {
            return;
        }
        this.tuningViewModel.setVisibleMainRoot(false);
        show();
    }

    public final void initItemClickListener() {
        this.submenuItemsAdapter.setClickSubmenuItem(new Function3<TuneGuiNodeObj, Integer, View, Unit>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.DialogSubmenu.initItemClickListener.1
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(TuneGuiNodeObj tuneGuiNodeObj, Integer num, View view) {
                invoke(tuneGuiNodeObj, num.intValue(), view);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull TuneGuiNodeObj submenuTuning, int i, @Nullable View view) {
                Intrinsics.checkNotNullParameter(submenuTuning, "submenuTuning");
                DialogSubmenu.this.getSubmenuClickListener().invoke(submenuTuning, Integer.valueOf(i), view);
            }
        });
    }
}

