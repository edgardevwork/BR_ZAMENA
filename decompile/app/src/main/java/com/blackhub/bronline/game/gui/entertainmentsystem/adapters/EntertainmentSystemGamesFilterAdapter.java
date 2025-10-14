package com.blackhub.bronline.game.gui.entertainmentsystem.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.databinding.EntertainmentSystemGamesFilterItemBinding;
import com.blackhub.bronline.game.core.utils.payment.model.BillingPurchaseRequestKt;
import com.blackhub.bronline.game.gui.entertainmentsystem.adapters.EntertainmentSystemGamesFilterAdapter;
import com.blackhub.bronline.game.gui.entertainmentsystem.data.EntertainmentGamesFilter;
import com.bless.client.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: EntertainmentSystemGamesFilterAdapter.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001eB\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0015\u001a\u00020\u000eH\u0016J\u001c\u0010\u0016\u001a\u00020\u00102\n\u0010\u0017\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u001c\u0010\u0018\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000eH\u0016J\u000e\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u000eR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000RJ\u0010\t\u001a2\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\nX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/entertainmentsystem/adapters/EntertainmentSystemGamesFilterAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/blackhub/bronline/game/gui/entertainmentsystem/adapters/EntertainmentSystemGamesFilterAdapter$ViewHolder;", "gamesList", "", "Lcom/blackhub/bronline/game/gui/entertainmentsystem/data/EntertainmentGamesFilter;", "context", "Landroid/content/Context;", "(Ljava/util/List;Landroid/content/Context;)V", "filterClickListener", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", BillingPurchaseRequestKt.SOURCE, "", "position", "", "getFilterClickListener", "()Lkotlin/jvm/functions/Function2;", "setFilterClickListener", "(Lkotlin/jvm/functions/Function2;)V", "getItemCount", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setCheckOnlyElement", "checkedPosition", "ViewHolder", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final class EntertainmentSystemGamesFilterAdapter extends RecyclerView.Adapter<ViewHolder> {
    public static final int $stable = 8;

    @NotNull
    public final Context context;
    public Function2<? super EntertainmentGamesFilter, ? super Integer, Unit> filterClickListener;

    @NotNull
    public final List<EntertainmentGamesFilter> gamesList;

    public EntertainmentSystemGamesFilterAdapter(@NotNull List<EntertainmentGamesFilter> gamesList, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(gamesList, "gamesList");
        Intrinsics.checkNotNullParameter(context, "context");
        this.gamesList = gamesList;
        this.context = context;
    }

    @NotNull
    public final Function2<EntertainmentGamesFilter, Integer, Unit> getFilterClickListener() {
        Function2 function2 = this.filterClickListener;
        if (function2 != null) {
            return function2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("filterClickListener");
        return null;
    }

    public final void setFilterClickListener(@NotNull Function2<? super EntertainmentGamesFilter, ? super Integer, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "<set-?>");
        this.filterClickListener = function2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        EntertainmentSystemGamesFilterItemBinding entertainmentSystemGamesFilterItemBindingInflate = EntertainmentSystemGamesFilterItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(entertainmentSystemGamesFilterItemBindingInflate, "inflate(...)");
        return new ViewHolder(this, entertainmentSystemGamesFilterItemBindingInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.gamesList.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.gamesList.size();
    }

    /* compiled from: EntertainmentSystemGamesFilterAdapter.kt */
    @Metadata(m7104d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/entertainmentsystem/adapters/EntertainmentSystemGamesFilterAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/blackhub/bronline/databinding/EntertainmentSystemGamesFilterItemBinding;", "(Lcom/blackhub/bronline/game/gui/entertainmentsystem/adapters/EntertainmentSystemGamesFilterAdapter;Lcom/blackhub/bronline/databinding/EntertainmentSystemGamesFilterItemBinding;)V", "bind", "", BillingPurchaseRequestKt.SOURCE, "Lcom/blackhub/bronline/game/gui/entertainmentsystem/data/EntertainmentGamesFilter;", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    public final class ViewHolder extends RecyclerView.ViewHolder {

        @NotNull
        public final EntertainmentSystemGamesFilterItemBinding binding;
        public final /* synthetic */ EntertainmentSystemGamesFilterAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull EntertainmentSystemGamesFilterAdapter entertainmentSystemGamesFilterAdapter, EntertainmentSystemGamesFilterItemBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = entertainmentSystemGamesFilterAdapter;
            this.binding = binding;
        }

        public final void bind(@NotNull final EntertainmentGamesFilter game) {
            Intrinsics.checkNotNullParameter(game, "game");
            this.binding.gameItemFilter.setText(game.getName());
            if (game.isClicked()) {
                this.binding.getRoot().setBackgroundColor(this.this$0.context.getResources().getColor(R.color.dark_gray_blue, null));
            } else {
                this.binding.getRoot().setBackgroundColor(this.this$0.context.getResources().getColor(R.color.transparent, null));
            }
            ConstraintLayout root = this.binding.getRoot();
            final EntertainmentSystemGamesFilterAdapter entertainmentSystemGamesFilterAdapter = this.this$0;
            root.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.entertainmentsystem.adapters.EntertainmentSystemGamesFilterAdapter$ViewHolder$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    EntertainmentSystemGamesFilterAdapter.ViewHolder.bind$lambda$0(entertainmentSystemGamesFilterAdapter, game, this, view);
                }
            });
        }

        public static final void bind$lambda$0(EntertainmentSystemGamesFilterAdapter this$0, EntertainmentGamesFilter game, ViewHolder this$1, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(game, "$game");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            this$0.getFilterClickListener().invoke(game, Integer.valueOf(this$1.getLayoutPosition()));
        }
    }

    public final void setCheckOnlyElement(int checkedPosition) {
        int size = this.gamesList.size();
        for (int i = 0; i < size; i++) {
            if (this.gamesList.get(i).isClicked() && i != checkedPosition) {
                this.gamesList.get(i).setClicked(false);
                notifyItemChanged(i);
            }
        }
    }
}
